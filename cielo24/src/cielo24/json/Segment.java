package cielo24.json;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Segment extends JsonBase {

    @SerializedName("speaker_change")
    public Boolean speakerChange;
    @SerializedName("speaker_id")
    public Integer speakerId;
    @SerializedName("interpolated")
    public Boolean interpolated;
    @SerializedName("start_time")
    public Integer startTime;   // Milliseconds
    @SerializedName("end_time")
    public Integer endTime;     // Milliseconds
    @SerializedName("sequences")
    public List<Sequence> sequences;
}