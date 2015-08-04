package cielo24.json;

import cielo24.utils.Guid;
import com.google.gson.annotations.SerializedName;

public class CreateJobResult extends JsonBase {
    
    @SerializedName("JobId")
    public Guid jobId;
    @SerializedName("TaskId")
    public Guid taskId;
}