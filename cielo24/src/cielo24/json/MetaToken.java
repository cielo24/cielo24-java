package cielo24.json;

import com.google.gson.annotations.SerializedName;

import java.net.URL;
import java.util.List;

public class MetaToken {

    @SerializedName("display_name")
    public String displayName;
    @SerializedName("url")
    public URL uri;
    @SerializedName("time_ranges")
    public List<TimeRange> timeRanges;
}
