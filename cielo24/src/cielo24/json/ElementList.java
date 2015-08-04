package cielo24.json;

import java.util.Hashtable;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ElementList extends JsonBase {
    
    @SerializedName("version")
    public Integer version;
    @SerializedName("start_time")
    public Integer startTime;         // Milliseconds
    @SerializedName("end_time")
    public Integer endTime;           // Milliseconds
    @SerializedName("language")
    public String language;
    @SerializedName("segments")
    public List<Segment> segments;
    @SerializedName("speakers")
    public List<Speaker> speakers;
    @SerializedName("keywords")
    public Hashtable<String, MetaToken> keywords;
    @SerializedName("topics")
    public Hashtable<String, MetaToken> topics;
    @SerializedName("entities")
    public Hashtable<String, MetaToken> entities;
}