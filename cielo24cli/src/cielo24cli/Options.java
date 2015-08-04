package cielo24cli;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cielo24.Enums.*;
import cielo24.utils.Guid;
import cielo24cli.converters.*;

import com.beust.jcommander.Parameter;
import com.google.common.base.Joiner;

import javax.time.calendar.LocalDateTime;

public class Options {

	protected String indent = "   ";
    protected String gap = "     ";
    public static final String[] verbs = { "login", "logout", "create", "delete", "authorize", "add_media_to_job", "add_embedded_media_to_job", "list", "list_elementlists", "get_caption", "get_transcript", "get_elementlist", "get_media", "generate_api_key", "remove_api_key", "update_password", "job_info" };
    @Parameter(names={"-h", "help"}, required=false)
    public boolean help = false;

    @Parameter(names="-u", description="cielo24 username", required=false)
    public String username = null;

    @Parameter(names="-p", description="cielo24 password", required=false)
    public String password = null;

    @Parameter(names="-s", description="cielo24 server URL [https://api.cielo24.com]", required=false)
    public String serverUrl = "https://api.cielo24.com";

    @Parameter(names="-k", description="API Secure Key", required=false, converter=GuidConverter.class)
    public Guid apiSecureKey = null;

    @Parameter(names="-N", description="The API token of the current session", required=false, converter=GuidConverter.class)
    public Guid apiToken = null;

    @Parameter(names="-f", description="Fidelity [MECHANICAL, PREMIUM, PROFESSIONAL] (PREMIUM by default)", required=false)
    public Fidelity fidelity = Fidelity.PREMIUM;

    @Parameter(names="-P", description="Priority [ECONOMY, STANDARD, HIGH] (STANDARD by default)", required=false)
    public Priority priority = Priority.STANDARD;

    @Parameter(names="-m", description="Media URL", required=false, converter=URLConverter.class)
    public URL mediaUrl = null;

    @Parameter(names="-M", description="Local Media file", required=false, converter=FileConverter.class)
    public File mediaFile = null;

    @Parameter(names="-l", description="The source language [en, es, de, fr] (en by default)", required=false)
    public Language sourceLanguage = Language.ENGLISH;

    @Parameter(names="-t", description="The target language [en, es, de, fr] (en by default)", required=false)
    public Language targetLanguage = Language.ENGLISH;

    @Parameter(names="-j", description="Job Id", required=false, converter=GuidConverter.class)
    public Guid jobId = null;

    @Parameter(names="-T", description="Turnaround hours", required=false)
    public Integer turnaroundHours = null;

    @Parameter(names="-n", description="Job Name", required=false)
    public String jobName = null;

    @Parameter(names="-c", description="The caption format [SRT, DFXP, QT] (SRT by default)", required=false)
    public CaptionFormat captionFormat = CaptionFormat.SRT;

    @Parameter(names="-e", description="The element list version [ISO Date format: 2014-05-06T10:49:38.341715]", required=false, converter=LocalDateTimeConverter.class)
    public LocalDateTime elementlistVersion = null;

    @Parameter(names="-C", description="Callback URL for the job", required=false)
    public URL callbackUrl = null;

    @Parameter(names="-S", description="Silent mode", required=false)
    public Boolean silent = null;

    @Parameter(names="-J", description="Job options dictionary. Usage: -O key1=value1 -O key2=value2. See API documentation for details", required=false)
    public List<String> jobConfig = new ArrayList<String>();

    @Parameter(names="-O", description="Caption/transcript options query String arguments. Usage: -O key1=value1 -O key2=value2. See API documentation for details", required=false)
    public List<String> captionOptions = new ArrayList<String>();

    @Parameter(names="-v", description="Verbose Mode", required=false)
    public boolean verboseMode = false;

    @Parameter(names="-d", description="New password", required=false)
    public String newPassword = null;

    @Parameter(names="-F", description="Always force new API key (disabled by default)", required=false)
    public boolean forceNew = false;

    @Parameter(names="-H", description="Login using headers (disabled by default)", required=false)
    public boolean headerLogin = false;

    public void printActionHelp(String action)
    {
        PrintDefaultUsage();
        if (!Arrays.asList(verbs).contains(action)) { return; }

        System.out.println("\nREQUIRED FOR \"" + action + "\" ACTION:");
        String[] job_id_param = { "delete", "authorize", "list_elementlists", "get_elementlist", "get_media", "job_info", "add_media_to_job", "add_embedded_media_to_job", "get_transcript", "get_caption" };
        if (Arrays.asList(job_id_param).contains(action)) {
            System.out.println(indent + "-j" + gap + "Job Id");
        }

        if(action.equals("add_media_to_job")){
            System.out.println(indent + "-m" + gap + "Media URL");
            System.out.println("or");
            System.out.println(indent + "-M" + gap + "Local Media File");
        }
        else if(action.equals("get_elementlist")){
        	System.out.println(indent + "-e" + gap + "ElementList Version");
        }
        else if(action.equals("add_embedded_media_to_job")){
            System.out.println(indent + "-m" + gap + "Media URL");
        }
        else if(action.equals("list")){
            System.out.println(indent + "none");
        }
        else if(action.equals("get_caption") || action.equals("get_transcript")){
            System.out.println(indent + "-c" + gap + "The caption format [SRT, DFXP, QT] (SRT by default)");
            System.out.println("\nOPTIONAL:");
            System.out.println(indent + "-e" + gap + "The element list version [ISO Date format: 2014-05-06T10:49:38.341715]");
            System.out.println(indent + "-O" + gap + "Caption/transcript options query String arguments. Usage: -O key1=value1 -O key2=value2. See API documentation for details");
        }
        else if(action.equals("generate_api_key")){
            System.out.println("\nOPTIONAL:");
            System.out.println(indent + "-F" + gap + "Always force new API key (disabled by default)");
        }
        else if(action.equals("remove_api_key")){
            System.out.println(indent + "-k" + gap + "API Secure Key");
        }
        else if(action.equals("update_password")){
            System.out.println(indent + "-d" + gap + "New password");
        }
        else if(action.equals("logout")){
            System.out.println(indent + "-N" + gap + "API token for the current session");
        }
        else if(action.equals("login")){
            System.out.println(indent + "-u" + gap + "cielo24 username");
            System.out.println(indent + "-p" + gap + "cielo24 password");
            System.out.println("or");
            System.out.println(indent + "-k" + gap + "API secure key");
            System.out.println("or");
            System.out.println(indent + "-N" + gap + "API token of the current session");
            System.out.println("\nOPTIONAL:");
            System.out.println(indent + "-H" + gap + "Use headers");
        }
        else if(action.equals("create")){
            System.out.println(indent + "-f" + gap + "Fidelity [MECHANICAL, PREMIUM, PROFESSIONAL]");
            System.out.println(indent + "-P" + gap + "Priority [ECONOMY, STANDARD, HIGH]");
            System.out.println(indent + "-M" + gap + "Local Media File");
            System.out.println("or");
            System.out.println(indent + "-m" + gap + "Media URL");
            System.out.println("\nOPTIONAL:");
            System.out.println(indent + "-n" + gap + "Job Name");
            System.out.println(indent + "-J" + gap + "Job options dictionary. Usage: -O key1=value1 -O key2=value2. See API documentation for details");
            System.out.println(indent + "-C" + gap + "Callback URL for the job");
            System.out.println(indent + "-T" + gap + "Turnaround hours");
            System.out.println(indent + "-l" + gap + "The source language [en, es, de, fr] (en by default)");
            System.out.println(indent + "-t" + gap + "The target language [en, es, de, fr] (en by default)");
        }
    }

    public void PrintDefaultUsage() {
        System.out.println("\nUsage: ./program.exe [action] [options]");
        System.out.println("Help: ./program.exe help [action]");
        System.out.println("Available actions: " + Joiner.on(", ").join(verbs));
        System.out.println("\nExecutes a cielo24 API call");
        System.out.println("\nALWAYS REQUIRED:");
        System.out.println("--------------------------");
        System.out.println(indent + "-u" + gap + "cielo24 username");
        System.out.println(indent + "-p" + gap + "cielo24 password");
        System.out.println("or");
        System.out.println(indent + "-k" + gap + "API secure key");
        System.out.println("or");
        System.out.println(indent + "-N" + gap + "API token of the current session");
        System.out.println("--------------------------");
        System.out.println("\nOPTIONAL:");
        System.out.println(indent + "-s" + gap + "cielo24 server URL [https://api.cielo24.com]");
    }
}