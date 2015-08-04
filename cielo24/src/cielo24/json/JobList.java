package cielo24.json;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class JobList extends JsonBase {

    @SerializedName("Username")
    public String username;
    @SerializedName("ActiveJobs")
    public List<Job> activeJobs;
}