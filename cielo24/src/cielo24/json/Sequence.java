package cielo24.json;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Sequence extends JsonBase {

    @SerializedName("interpolated")
    public Boolean interpolated;
    @SerializedName("start_time")
    public Integer startTime;         // Milliseconds
    @SerializedName("end_time")
    public Integer endTime;           // Milliseconds
    @SerializedName("confidence_score")
    public Float confidenceScore;
    @SerializedName("tokens")
    public List<Token> tokens;
    @SerializedName("style")
    public String style;
}