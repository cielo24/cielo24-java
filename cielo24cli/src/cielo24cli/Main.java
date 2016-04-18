package cielo24cli;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import cielo24.*;
import cielo24.options.*;
import cielo24.utils.Guid;
import cielo24.utils.WebException;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;
import com.google.common.base.Joiner;

public class Main {

	static Options options = new Options();
	static Actions actions = new Actions();
	static JCommander optionParser = new JCommander();
	static String invokedVerb = null;

	/* Usage: java -jar cielo24cli.jar action [options] */
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, IOException, WebException {
		if (args.length == 1 && Arrays.asList(Options.verbs).contains(args[0])) {
			options.printActionHelp(args[0]);
		} else if (args.length != 0 && Arrays.asList(Options.verbs).contains(args[0])) { // If verb is valid
			invokedVerb = args[0];
			try { // If parsing successful
				optionParser = new JCommander(options, Arrays.copyOfRange(args, 1, args.length));

				if (!options.verboseMode) { // Enable verbose mode
					WebUtils.logger.setUseParentHandlers(false);
				}

				if (invokedVerb.equals("login") || invokedVerb.equals("logout")) { // Login and logout are special cases
					System.out.println(callAction(invokedVerb).toString());
				} else if (tryLogin()) { // All other actions
					System.out.println(callAction(invokedVerb).toString());
				}
			} catch (ParameterException e) { // Parsing failed: show usage for verb
				e.printStackTrace();
				options.printActionHelp(invokedVerb);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Exception: " + e.getMessage());
                options.printActionHelp(invokedVerb);
			}
		} else if (args.length == 2 && args[0].equals("help") && Arrays.asList(Options.verbs).contains(args[1])) {
			options.printActionHelp(args[1]);
		} else {
			options.PrintDefaultUsage();
		}
	}

	public static Object callAction(String actionName) throws IOException, WebException, IllegalArgumentException, IllegalAccessException {
		actions.serverUrl = options.serverUrl;
		// ACCESS CONTROL //
		if(actionName.equals("login")) {
			System.out.println("Logging in...");
			if (options.apiSecureKey == null) { // Use password and username
				return actions.login(options.username, options.password, options.headerLogin);
			} else { // Use secure key
				return actions.login(options.username, options.apiSecureKey, options.headerLogin);
			}
		} else if(actionName.equals("logout")) {
			System.out.println("Logging out...");
			actions.logout(options.apiToken);
			return "Logged out successfully";
		} else if(actionName.equals("generate_api_key")) {
			System.out.println("Generating API key...");
			return actions.generateAPIKey(options.apiToken, options.username, options.forceNew);
		} else if(actionName.equals("remove_api_key")) {
			System.out.println("Removing API key...");
			actions.removeAPIKey(options.apiToken, options.apiSecureKey);
			return "API Key removed successfully";
		} else if(actionName.equals("update_password")) {
			System.out.println("Updating password...");
			actions.updatePassword(options.apiToken, options.newPassword);
			return "Password updated successfully";
		}
		// JOB CONTROL //
		else if(actionName.equals("create")) {
			System.out.println("Creating job...");
			Guid jobId = actions.createJob(options.apiToken, options.jobName, options.sourceLanguage, null, null).jobId;
			System.out.println("jobId: " + jobId.toString());
			System.out.println("Adding media...");
			if (options.mediaFile == null) {
				System.out.println("TaskId: " + actions.addMediaToJob(options.apiToken, jobId, options.mediaUrl).toString());
			} else {
				System.out.println("TaskId: " + actions.addMediaToJob(options.apiToken, jobId, options.mediaFile).toString());
			}
			System.out.println("Performing transcription...");
			PerformTranscriptionOptions pto = new PerformTranscriptionOptions();
			List<String> list1 = options.jobConfig;
			pto.populateFromArray(list1.toArray(new String[list1.size()]));
			return actions.performTranscription(options.apiToken, jobId, options.fidelity, options.priority, options.callbackUrl, options.turnaroundHours, options.targetLanguage, pto);
		} else if(actionName.equals("authorize")) {
			System.out.println("Authorizing job...");
			actions.authorizeJob(options.apiToken, options.jobId);
			return "Job Authorized Successfully";
		} else if (actionName.equals("modify_job")) {
			System.out.println("Modifying job parameters...");
			actions.modifyJob(options.apiToken, options.jobId, options.fidelity,
					options.turnaroundHours, options.priority);
			System.out.println("Job modified successfully");
		} else if(actionName.equals("delete")) {
			System.out.println("Deleting job...");
			return actions.deleteJob(options.apiToken, options.jobId);
		} else if(actionName.equals("job_info")) {
			System.out.println("Getting job info...");
			return actions.getJobInfo(options.apiToken, options.jobId);
		} else if(actionName.equals("list")) {
			System.out.println("Listing jobs...");
			return actions.getJobList(options.apiToken, null);
		} else if(actionName.equals("add_media_to_job")) {
			System.out.println("Adding media to job...");
			if (options.mediaUrl != null) { // Media Url
				return actions.addMediaToJob(options.apiToken, options.jobId, options.mediaUrl);
			} else { // Media File
				return actions.addMediaToJob(options.apiToken, options.jobId, options.mediaFile);
			}
		} else if(actionName.equals("add_embedded_media_to_job")) {
			System.out.println("Adding embedded media to job...");
			return actions.addEmbeddedMediaToJob(options.apiToken, options.jobId, options.mediaUrl);
		} else if(actionName.equals("get_media")) {
			System.out.println("Getting media...");
			return actions.getMedia(options.apiToken, options.jobId);
		} else if(actionName.equals("get_transcript")) {
			System.out.println("Getting transcript...");
			TranscriptOptions to = new TranscriptOptions();
			List<String> list2 = options.captionOptions;
			to.populateFromArray(list2.toArray(new String[list2.size()]));
			return actions.getTranscript(options.apiToken, options.jobId, to);
		} else if(actionName.equals("get_caption")) {
			System.out.println("Getting caption...");
			CaptionOptions co = new CaptionOptions();
			List<String> list3 = options.captionOptions;
			co.populateFromArray(list3.toArray(new String[list3.size()]));
			return actions.getCaption(options.apiToken, options.jobId, options.captionFormat, co);
		} else if(actionName.equals("get_elementlist")) {
			System.out.println("Getting element list...");
			return actions.getElementList(options.apiToken, options.jobId, options.elementlistVersion);
		} else if(actionName.equals("list_elementlists")) {
			System.out.println("Listing element lists...");
			return Joiner.on("\n").join(actions.getListOfElementLists(options.apiToken, options.jobId));
		} else{
			options.PrintDefaultUsage();
			return "";
		}
	}

	private static boolean tryLogin() {
		actions.serverUrl = options.serverUrl;
		if (options.apiToken == null) { // Need to obtain api token
			try {
				if (options.apiSecureKey != null) {
					options.apiToken = actions.login(options.username, options.apiSecureKey, true);
				} else {
					options.apiToken = actions.login(options.username, options.password, true);
				}
			} catch (Exception e) {
				System.out.println("\nError: " + e.getMessage());
				options.printActionHelp(invokedVerb);
				return false;
			}
		}
		return true;
	}
}