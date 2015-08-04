package cielo24.json;

import com.google.gson.annotations.SerializedName;

public class TimeRange {

    @SerializedName("start_time")
    public Integer startTime;      // Milliseconds
    @SerializedName("end_time")
    public Integer endTime;        // Milliseconds
}
