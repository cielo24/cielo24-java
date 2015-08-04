package cielo24.json;

import cielo24.utils.Guid;

import static cielo24.Enums.*;

import com.google.gson.annotations.SerializedName;

import javax.time.calendar.LocalDateTime;
import java.util.ArrayList;
import java.util.Hashtable;

public class Job extends JsonBase {
    
    @SerializedName("JobId")
    public Guid jobId;
    @SerializedName("JobName")
    public String jobName;
    @SerializedName("Username")
    public String username;  // Only used in getJobList() call
    @SerializedName("MediaLengthSeconds")
    public Float mediaLengthSeconds;
    @SerializedName("ExternalID")
    public String externalID;
    @SerializedName("Priority")
    public Priority priority;
    @SerializedName("Fidelity")
    public Fidelity fidelity;
    @SerializedName("JobStatus")
    public JobStatus jobStatus;
    @SerializedName("SourceLanguage")
    public String sourceLanguage;
    @SerializedName("TargetLanguage")
    public String targetLanguage;
    @SerializedName("CreationDate")
    public LocalDateTime creationDate;
    @SerializedName("StartDate")
    public LocalDateTime startDate;
    @SerializedName("DueDate")
    public LocalDateTime dueDate;
    @SerializedName("CompletedDate")
    public LocalDateTime completedDate;
    @SerializedName("ReturnDate")
    public LocalDateTime returnDate;
    @SerializedName("AuthorizationDate")
    public LocalDateTime authorizationDate;
    @SerializedName("JobDifficulty")
    public JobDifficulty jobDifficulty;
    @SerializedName("ReturnTargets")
    public Hashtable<String, ArrayList<Hashtable<String, String>>> returnTargets;
    @SerializedName("Options")
    public Hashtable<String, Hashtable<String, Object>> options;
}