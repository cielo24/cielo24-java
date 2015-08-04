package cielo24.json;

import com.google.gson.annotations.SerializedName;

import javax.time.calendar.LocalDateTime;

public class ElementListVersion extends JsonBase {
    
    @SerializedName("version")
    public LocalDateTime version;
    @SerializedName("iwp_name")
    public String iwp_name;
}