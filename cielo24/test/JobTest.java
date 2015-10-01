import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Hashtable;

import cielo24.options.JobListOptions;
import cielo24.options.PerformTranscriptionOptions;
import cielo24.options.TranscriptOptions;
import org.junit.Before;
import org.junit.Test;

import cielo24.Enums.*;
import cielo24.json.*;
import cielo24.options.CaptionOptions;
import cielo24.utils.Guid;
import cielo24.utils.WebException;

import javax.time.calendar.LocalDateTime;

public class JobTest extends ActionsTest {

    protected Guid jobId = null;
    protected Guid taskId = null;
    protected static String JOB_NAME = "Java_test";
    protected static String EXTERNAL_ID = "external_id";
    protected static String CALLBACK_URI = "http://fake-callback.com/action?api_token=1234&job_id={job_id}";

    @Before
    public void setUp() throws Exception {
        super.setUp();
        // Always start with a fresh job
        this.jobId = this.actions.createJob(apiToken, JOB_NAME, Language.ENGLISH, EXTERNAL_ID, null).jobId;
    }

    @Test
    public void testOptions() {
        CaptionOptions options = new CaptionOptions();
        options.captionBySentence = true;
        options.forceCase = Case.UPPER;
        String[] array = new String[] { "build_url=true", "dfxp_header=header" };
        options.populateFromArray(array);

        Hashtable<String, Object> expected = new Hashtable<String, Object>();
        expected.put("build_url", Boolean.TRUE);
        expected.put("caption_by_sentence", Boolean.TRUE);
        expected.put("dfxp_header", "header");
        expected.put("force_case", Case.UPPER);
        assertEquals(expected, options.getHashtable());
    }

    @Test
    public void testOptionsInheritance() {
        TranscriptOptions options = new TranscriptOptions();
        options.createParagraphs = true;  // Option from the TranscriptOptions class
        options.maskProfanity = true;     // Option from the CommonOptions class (super class)

        Hashtable<String, Object> expected = new Hashtable<String, Object>();
        expected.put("create_paragraphs", Boolean.TRUE);
        expected.put("mask_profanity", Boolean.TRUE);
        assertEquals(expected, options.getHashtable());
    }

    @Test
    public void testCreateJob() throws IOException, WebException {
        CreateJobResult result = this.actions.createJob(this.apiToken, JOB_NAME, Language.ENGLISH, EXTERNAL_ID, null);
        assertEquals(32, result.jobId.toString().length());
        assertEquals(32, result.taskId.toString().length());
    }

    @Test
    public void testAuthorizeJob() throws IOException, WebException {
        this.actions.authorizeJob(this.apiToken, this.jobId);
    }

    @Test
    public void testDeleteJob() throws IOException, WebException {
        this.taskId = this.actions.deleteJob(this.apiToken, this.jobId);
        assertEquals(32, this.taskId.toString().length());
    }

    @Test
    public void testGetJobInfo() throws IOException, WebException {
        this.actions.getJobInfo(this.apiToken, this.jobId);
    }

    @Test
    public void testGetJobList() throws IOException, WebException, InterruptedException {
        LocalDateTime past = LocalDateTime.of(2000, 5, 16, 7, 34, 56, 123456789);
        LocalDateTime future = LocalDateTime.of(2020, 5, 16, 7, 34, 56, 123456789);
        JobListOptions options = new JobListOptions();
        options.completeDateFrom = past;
        options.completeDateTo = future;
        options.creationDateFrom = past;
        options.creationDateTo = future;
        options.dueDateFrom = past;
        options.dueDateTo = future;
        options.startDateFrom = past;
        options.startDateTo = future;
        options.jobName = JOB_NAME;
        options.externalId = EXTERNAL_ID;
        options.fidelity = Fidelity.PROFESSIONAL;
        options.priority = Priority.STANDARD;
        this.actions.getJobList(this.apiToken, options);
    }

    @Test
    public void testGetElementList() throws IOException, WebException {
        this.actions.getElementList(this.apiToken, this.jobId);
    }

    @Test
    public void testGetListOfElementLists() throws IOException, WebException {
        this.actions.getListOfElementLists(this.apiToken, this.jobId);
    }

    @Test
    public void testGetMedia() throws IOException, WebException {
        // Add media to job first
        this.actions.addMediaToJob(this.apiToken, this.jobId, new URL(this.config.sampleVideoUri));
        // Test get media
        this.actions.getMedia(this.apiToken, this.jobId);
    }

    @Test
    public void testGetTranscript() throws IOException, WebException {
        TranscriptOptions options = new TranscriptOptions();
        options.createParagraphs = true;
        options.newLinesAfterParagraph = 2;
        options.newLinesAfterSentence = 2;
        options.timeCodeEveryParagraph = true;
        options.timeCodeFormat = "%H, %M, %S";
        options.timeCodeOffset = 20;
        options.maskProfanity = false;
        options.removeDisfluencies = true;
        options.removeSoundsList = new ArrayList<Tag>();
        options.removeSoundsList.add(Tag.APPLAUSE);
        options.removeSoundsList.add(Tag.BLEEP);
        options.replaceSlang = true;
        options.speakerChangeToken = "^^";
        String transcriptTest = this.actions.getTranscript(this.apiToken, this.jobId, options);
        // Ensure that line breaks are preserved
        assertTrue(transcriptTest.contains("\n"));
    }

    @Test
    public void testGetCaption() throws IOException, WebException {
        CaptionOptions options = new CaptionOptions();
        options.maskProfanity = false;
        options.removeDisfluencies = true;
        options.removeSoundsList = new ArrayList<Tag>();
        options.removeSoundsList.add(Tag.APPLAUSE);
        options.removeSoundsList.add(Tag.BLEEP);
        options.replaceSlang = true;
        options.speakerChangeToken = "^^";
        options.captionBySentence = true;
        options.captionWordsMin = 3;
        String captionText = this.actions.getCaption(this.apiToken, this.jobId, CaptionFormat.SRT, options);
        // Ensure that line breaks are preserved
        assertTrue(captionText.contains("\n"));
    }

    @Test
    public void testGetCaptionBuildUrl() throws IOException, WebException {
        CaptionOptions options = new CaptionOptions();
        options.buildUrl = true;
        String response = this.actions.getCaption(this.apiToken, this.jobId, CaptionFormat.SRT, options);
        new URL(response); // Will throw an exception if response is not a valid URL
    }

    @Test
    public void testPerformTranscription() throws IOException, WebException {
        this.actions.addEmbeddedMediaToJob(this.apiToken, this.jobId, new URL(this.config.sampleVideoUri));
        URL callback_uri = new URL(CALLBACK_URI);

        PerformTranscriptionOptions options = new PerformTranscriptionOptions();
        options.returnIwp = new ArrayList<IWP>();
        options.returnIwp.add(IWP.MECHANICAL);
        options.returnIwp.add(IWP.INTERIM_PROFESSIONAL);
        options.returnIwp.add(IWP.PROFESSIONAL);
        options.returnIwp.add(IWP.FINAL);
        options.notes = "test";
        options.speakerId = true;
        options.customerApprovalTool = CustomerApprovalTool.CIELO24;
        options.customerApprovalSteps = new ArrayList<CustomerApprovalStep>();
        options.customerApprovalSteps.add(CustomerApprovalStep.RETURN);
        options.customerApprovalSteps.add(CustomerApprovalStep.TRANSLATION);

        this.taskId = this.actions.performTranscription(this.apiToken, this.jobId, Fidelity.PROFESSIONAL, Priority.STANDARD,
                                                        callback_uri, null, Language.ENGLISH, options);
        assertEquals(32, this.taskId.toString().length());
    }

    @Test
    public void testAddMediaToJobUrl() throws IOException, WebException {
        this.taskId = this.actions.addMediaToJob(this.apiToken, this.jobId, new URL(this.config.sampleVideoUri));
        assertEquals(32, this.taskId.toString().length());
    }

    @Test
    public void testAddMediaToJobEmbedded() throws IOException, WebException {
        this.taskId = this.actions.addEmbeddedMediaToJob(this.apiToken, this.jobId, new URL(this.config.sampleVideoUri));
        assertEquals(32, this.taskId.toString().length());
    }

    @Test
    public void testAddMediaToJobFile() throws IOException, WebException {
        File sampleVideoFile = new File(this.config.sampleVideoFilePath);
        this.taskId = this.actions.addMediaToJob(this.apiToken, this.jobId, sampleVideoFile);
        assertEquals(32, this.taskId.toString().length());
    }
}