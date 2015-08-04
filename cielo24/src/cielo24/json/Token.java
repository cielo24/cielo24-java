package cielo24.json;

import java.util.List;

import static cielo24.Enums.*;

import com.google.gson.annotations.*;

public class Token extends JsonBase {
    
    @SerializedName("interpolated")
    public Boolean interpolated;
    @SerializedName("start_time")
    public Integer startTime;         // Milliseconds
    @SerializedName("end_time")
    public Integer endTime;           // Milliseconds
    @SerializedName("value")
    public String value;
    @SerializedName("type")
    public TokenType type;
    @SerializedName("display_as")
    public String displayValue;
    @SerializedName("tags")
    public List<Tag> tags;
    @SerializedName("style")
    public String style;
}