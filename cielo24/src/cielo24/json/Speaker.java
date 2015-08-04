package cielo24.json;

import static cielo24.Enums.*;

import com.google.gson.annotations.SerializedName;

public class Speaker extends JsonBase {
    
    @SerializedName("name")
    public String name;
    @SerializedName("id")
    public Integer id;
    @SerializedName("gender")
    public SpeakerGender gender;
}