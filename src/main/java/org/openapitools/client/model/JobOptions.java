/*
 * Cielo24
 * The cielo24 Web Services Platform API allows developers to easily integrate transcription, captioning and keyword extraction into their applications without having to use a manual web portal.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: devs@cielo24.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.IWPEnum;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.JSON;

/**
 * JobOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-23T14:23:37.762-03:00[America/Sao_Paulo]")
public class JobOptions {
  /**
   * Gets or Sets customerApprovalSteps
   */
  @JsonAdapter(CustomerApprovalStepsEnum.Adapter.class)
  public enum CustomerApprovalStepsEnum {
    TRANSLATION("TRANSLATION"),
    
    RETURN("RETURN");

    private String value;

    CustomerApprovalStepsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CustomerApprovalStepsEnum fromValue(String value) {
      for (CustomerApprovalStepsEnum b : CustomerApprovalStepsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CustomerApprovalStepsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CustomerApprovalStepsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CustomerApprovalStepsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CustomerApprovalStepsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CUSTOMER_APPROVAL_STEPS = "customer_approval_steps";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_APPROVAL_STEPS)
  private List<CustomerApprovalStepsEnum> customerApprovalSteps = null;

  /**
   * Determines which web based tool to use for viewing, editing and approving jobs.
   */
  @JsonAdapter(CustomerApprovalToolEnum.Adapter.class)
  public enum CustomerApprovalToolEnum {
    AMARA("AMARA"),
    
    CIELO24("CIELO24");

    private String value;

    CustomerApprovalToolEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CustomerApprovalToolEnum fromValue(String value) {
      for (CustomerApprovalToolEnum b : CustomerApprovalToolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CustomerApprovalToolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CustomerApprovalToolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CustomerApprovalToolEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CustomerApprovalToolEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CUSTOMER_APPROVAL_TOOL = "customer_approval_tool";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_APPROVAL_TOOL)
  private CustomerApprovalToolEnum customerApprovalTool = CustomerApprovalToolEnum.CIELO24;

  public static final String SERIALIZED_NAME_CUSTOM_METADATA = "custom_metadata";
  @SerializedName(SERIALIZED_NAME_CUSTOM_METADATA)
  private Object customMetadata;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private Object notes = null;

  public static final String SERIALIZED_NAME_RETURN_IWP = "return_iwp";
  @SerializedName(SERIALIZED_NAME_RETURN_IWP)
  private List<IWPEnum> returnIwp = null;

  public static final String SERIALIZED_NAME_GENERATE_MEDIA_INTELLIGENCE_IWP = "generate_media_intelligence_iwp";
  @SerializedName(SERIALIZED_NAME_GENERATE_MEDIA_INTELLIGENCE_IWP)
  private List<IWPEnum> generateMediaIntelligenceIwp = null;

  /**
   * Requests that speaker names be identified.
   */
  @JsonAdapter(SpeakerIdEnum.Adapter.class)
  public enum SpeakerIdEnum {
    TRUE("true"),
    
    FALSE("false");

    private String value;

    SpeakerIdEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SpeakerIdEnum fromValue(String value) {
      for (SpeakerIdEnum b : SpeakerIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SpeakerIdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SpeakerIdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SpeakerIdEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SpeakerIdEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SPEAKER_ID = "speaker_id";
  @SerializedName(SERIALIZED_NAME_SPEAKER_ID)
  private SpeakerIdEnum speakerId = SpeakerIdEnum.FALSE;

  /**
   * Requests that all noises and sounds be identified.
   */
  @JsonAdapter(AudioDescriptionEnum.Adapter.class)
  public enum AudioDescriptionEnum {
    TRUE("true"),
    
    FALSE("false");

    private String value;

    AudioDescriptionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AudioDescriptionEnum fromValue(String value) {
      for (AudioDescriptionEnum b : AudioDescriptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AudioDescriptionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AudioDescriptionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AudioDescriptionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AudioDescriptionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUDIO_DESCRIPTION = "audio_description";
  @SerializedName(SERIALIZED_NAME_AUDIO_DESCRIPTION)
  private AudioDescriptionEnum audioDescription = AudioDescriptionEnum.FALSE;

  /**
   * Requests that any text that appears in the media be added to the transcription.
   */
  @JsonAdapter(OnScreenTextEnum.Adapter.class)
  public enum OnScreenTextEnum {
    TRUE("true"),
    
    FALSE("false");

    private String value;

    OnScreenTextEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OnScreenTextEnum fromValue(String value) {
      for (OnScreenTextEnum b : OnScreenTextEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OnScreenTextEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OnScreenTextEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OnScreenTextEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OnScreenTextEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ON_SCREEN_TEXT = "on_screen_text";
  @SerializedName(SERIALIZED_NAME_ON_SCREEN_TEXT)
  private OnScreenTextEnum onScreenText = OnScreenTextEnum.FALSE;

  /**
   * Requests that lyrics to songs be transcribed instead of labeled [MUSIC].
   */
  @JsonAdapter(MusicLyricsEnum.Adapter.class)
  public enum MusicLyricsEnum {
    TRUE("true"),
    
    FALSE("false");

    private String value;

    MusicLyricsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MusicLyricsEnum fromValue(String value) {
      for (MusicLyricsEnum b : MusicLyricsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MusicLyricsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MusicLyricsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MusicLyricsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MusicLyricsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MUSIC_LYRICS = "music_lyrics";
  @SerializedName(SERIALIZED_NAME_MUSIC_LYRICS)
  private MusicLyricsEnum musicLyrics = MusicLyricsEnum.FALSE;

  /**
   * Requests that transcribers follow submitted instruction set.
   */
  @JsonAdapter(CustomSpecialHandlingEnum.Adapter.class)
  public enum CustomSpecialHandlingEnum {
    TRUE("true"),
    
    FALSE("false");

    private String value;

    CustomSpecialHandlingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CustomSpecialHandlingEnum fromValue(String value) {
      for (CustomSpecialHandlingEnum b : CustomSpecialHandlingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CustomSpecialHandlingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CustomSpecialHandlingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CustomSpecialHandlingEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CustomSpecialHandlingEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CUSTOM_SPECIAL_HANDLING = "custom_special_handling";
  @SerializedName(SERIALIZED_NAME_CUSTOM_SPECIAL_HANDLING)
  private CustomSpecialHandlingEnum customSpecialHandling = CustomSpecialHandlingEnum.FALSE;

  public JobOptions() { 
  }

  public JobOptions customerApprovalSteps(List<CustomerApprovalStepsEnum> customerApprovalSteps) {
    
    this.customerApprovalSteps = customerApprovalSteps;
    return this;
  }

  public JobOptions addCustomerApprovalStepsItem(CustomerApprovalStepsEnum customerApprovalStepsItem) {
    if (this.customerApprovalSteps == null) {
      this.customerApprovalSteps = new ArrayList<>();
    }
    this.customerApprovalSteps.add(customerApprovalStepsItem);
    return this;
  }

   /**
   * Requires your approval of a job at specified points in the workflow. When the job is ready for approval you will be emailed a link that will take you to a web based tool you can use to view, edit and approve the job. You may request approval at two points in the workflow: before translation and before the job is returned.
   * @return customerApprovalSteps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requires your approval of a job at specified points in the workflow. When the job is ready for approval you will be emailed a link that will take you to a web based tool you can use to view, edit and approve the job. You may request approval at two points in the workflow: before translation and before the job is returned.")

  public List<CustomerApprovalStepsEnum> getCustomerApprovalSteps() {
    return customerApprovalSteps;
  }


  public void setCustomerApprovalSteps(List<CustomerApprovalStepsEnum> customerApprovalSteps) {
    this.customerApprovalSteps = customerApprovalSteps;
  }


  public JobOptions customerApprovalTool(CustomerApprovalToolEnum customerApprovalTool) {
    
    this.customerApprovalTool = customerApprovalTool;
    return this;
  }

   /**
   * Determines which web based tool to use for viewing, editing and approving jobs.
   * @return customerApprovalTool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines which web based tool to use for viewing, editing and approving jobs.")

  public CustomerApprovalToolEnum getCustomerApprovalTool() {
    return customerApprovalTool;
  }


  public void setCustomerApprovalTool(CustomerApprovalToolEnum customerApprovalTool) {
    this.customerApprovalTool = customerApprovalTool;
  }


  public JobOptions customMetadata(Object customMetadata) {
    
    this.customMetadata = customMetadata;
    return this;
  }

   /**
   * A JSON dictionary of key value pairs. These will be used as substitution strings when building the callback URL and custom DFXP caption header.
   * @return customMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"key\":\"value\"}", value = "A JSON dictionary of key value pairs. These will be used as substitution strings when building the callback URL and custom DFXP caption header.")

  public Object getCustomMetadata() {
    return customMetadata;
  }


  public void setCustomMetadata(Object customMetadata) {
    this.customMetadata = customMetadata;
  }


  public JobOptions notes(Object notes) {
    
    this.notes = notes;
    return this;
  }

   /**
   * Allows you to provide text that will be displayed to the transcriber when the job is processed. An HTML included will be escaped.
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allows you to provide text that will be displayed to the transcriber when the job is processed. An HTML included will be escaped.")

  public Object getNotes() {
    return notes;
  }


  public void setNotes(Object notes) {
    this.notes = notes;
  }


  public JobOptions returnIwp(List<IWPEnum> returnIwp) {
    
    this.returnIwp = returnIwp;
    return this;
  }

  public JobOptions addReturnIwpItem(IWPEnum returnIwpItem) {
    if (this.returnIwp == null) {
      this.returnIwp = new ArrayList<>();
    }
    this.returnIwp.add(returnIwpItem);
    return this;
  }

   /**
   * Allows you to receive additional callbacks when interim versions of the job are completed. If you specified a callback_url, then a callback will sent for FINAL regardless of the value of this option.
   * @return returnIwp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allows you to receive additional callbacks when interim versions of the job are completed. If you specified a callback_url, then a callback will sent for FINAL regardless of the value of this option.")

  public List<IWPEnum> getReturnIwp() {
    return returnIwp;
  }


  public void setReturnIwp(List<IWPEnum> returnIwp) {
    this.returnIwp = returnIwp;
  }


  public JobOptions generateMediaIntelligenceIwp(List<IWPEnum> generateMediaIntelligenceIwp) {
    
    this.generateMediaIntelligenceIwp = generateMediaIntelligenceIwp;
    return this;
  }

  public JobOptions addGenerateMediaIntelligenceIwpItem(IWPEnum generateMediaIntelligenceIwpItem) {
    if (this.generateMediaIntelligenceIwp == null) {
      this.generateMediaIntelligenceIwp = new ArrayList<>();
    }
    this.generateMediaIntelligenceIwp.add(generateMediaIntelligenceIwpItem);
    return this;
  }

   /**
   * Requests that media intelligence be generated for the specified interim/final versions of the transcript. Media intelligence data is added to the ElementList and can be retrieve using the get_elementlist API call. See [ElementList](https://cielo24.readthedocs.io/en/latest/output_formats/elementlist.html#media-intelligence-label) for details.
   * @return generateMediaIntelligenceIwp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requests that media intelligence be generated for the specified interim/final versions of the transcript. Media intelligence data is added to the ElementList and can be retrieve using the get_elementlist API call. See [ElementList](https://cielo24.readthedocs.io/en/latest/output_formats/elementlist.html#media-intelligence-label) for details.")

  public List<IWPEnum> getGenerateMediaIntelligenceIwp() {
    return generateMediaIntelligenceIwp;
  }


  public void setGenerateMediaIntelligenceIwp(List<IWPEnum> generateMediaIntelligenceIwp) {
    this.generateMediaIntelligenceIwp = generateMediaIntelligenceIwp;
  }


  public JobOptions speakerId(SpeakerIdEnum speakerId) {
    
    this.speakerId = speakerId;
    return this;
  }

   /**
   * Requests that speaker names be identified.
   * @return speakerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requests that speaker names be identified.")

  public SpeakerIdEnum getSpeakerId() {
    return speakerId;
  }


  public void setSpeakerId(SpeakerIdEnum speakerId) {
    this.speakerId = speakerId;
  }


  public JobOptions audioDescription(AudioDescriptionEnum audioDescription) {
    
    this.audioDescription = audioDescription;
    return this;
  }

   /**
   * Requests that all noises and sounds be identified.
   * @return audioDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requests that all noises and sounds be identified.")

  public AudioDescriptionEnum getAudioDescription() {
    return audioDescription;
  }


  public void setAudioDescription(AudioDescriptionEnum audioDescription) {
    this.audioDescription = audioDescription;
  }


  public JobOptions onScreenText(OnScreenTextEnum onScreenText) {
    
    this.onScreenText = onScreenText;
    return this;
  }

   /**
   * Requests that any text that appears in the media be added to the transcription.
   * @return onScreenText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requests that any text that appears in the media be added to the transcription.")

  public OnScreenTextEnum getOnScreenText() {
    return onScreenText;
  }


  public void setOnScreenText(OnScreenTextEnum onScreenText) {
    this.onScreenText = onScreenText;
  }


  public JobOptions musicLyrics(MusicLyricsEnum musicLyrics) {
    
    this.musicLyrics = musicLyrics;
    return this;
  }

   /**
   * Requests that lyrics to songs be transcribed instead of labeled [MUSIC].
   * @return musicLyrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requests that lyrics to songs be transcribed instead of labeled [MUSIC].")

  public MusicLyricsEnum getMusicLyrics() {
    return musicLyrics;
  }


  public void setMusicLyrics(MusicLyricsEnum musicLyrics) {
    this.musicLyrics = musicLyrics;
  }


  public JobOptions customSpecialHandling(CustomSpecialHandlingEnum customSpecialHandling) {
    
    this.customSpecialHandling = customSpecialHandling;
    return this;
  }

   /**
   * Requests that transcribers follow submitted instruction set.
   * @return customSpecialHandling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requests that transcribers follow submitted instruction set.")

  public CustomSpecialHandlingEnum getCustomSpecialHandling() {
    return customSpecialHandling;
  }


  public void setCustomSpecialHandling(CustomSpecialHandlingEnum customSpecialHandling) {
    this.customSpecialHandling = customSpecialHandling;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobOptions jobOptions = (JobOptions) o;
    return Objects.equals(this.customerApprovalSteps, jobOptions.customerApprovalSteps) &&
        Objects.equals(this.customerApprovalTool, jobOptions.customerApprovalTool) &&
        Objects.equals(this.customMetadata, jobOptions.customMetadata) &&
        Objects.equals(this.notes, jobOptions.notes) &&
        Objects.equals(this.returnIwp, jobOptions.returnIwp) &&
        Objects.equals(this.generateMediaIntelligenceIwp, jobOptions.generateMediaIntelligenceIwp) &&
        Objects.equals(this.speakerId, jobOptions.speakerId) &&
        Objects.equals(this.audioDescription, jobOptions.audioDescription) &&
        Objects.equals(this.onScreenText, jobOptions.onScreenText) &&
        Objects.equals(this.musicLyrics, jobOptions.musicLyrics) &&
        Objects.equals(this.customSpecialHandling, jobOptions.customSpecialHandling);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerApprovalSteps, customerApprovalTool, customMetadata, notes, returnIwp, generateMediaIntelligenceIwp, speakerId, audioDescription, onScreenText, musicLyrics, customSpecialHandling);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobOptions {\n");
    sb.append("    customerApprovalSteps: ").append(toIndentedString(customerApprovalSteps)).append("\n");
    sb.append("    customerApprovalTool: ").append(toIndentedString(customerApprovalTool)).append("\n");
    sb.append("    customMetadata: ").append(toIndentedString(customMetadata)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    returnIwp: ").append(toIndentedString(returnIwp)).append("\n");
    sb.append("    generateMediaIntelligenceIwp: ").append(toIndentedString(generateMediaIntelligenceIwp)).append("\n");
    sb.append("    speakerId: ").append(toIndentedString(speakerId)).append("\n");
    sb.append("    audioDescription: ").append(toIndentedString(audioDescription)).append("\n");
    sb.append("    onScreenText: ").append(toIndentedString(onScreenText)).append("\n");
    sb.append("    musicLyrics: ").append(toIndentedString(musicLyrics)).append("\n");
    sb.append("    customSpecialHandling: ").append(toIndentedString(customSpecialHandling)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("customer_approval_steps");
    openapiFields.add("customer_approval_tool");
    openapiFields.add("custom_metadata");
    openapiFields.add("notes");
    openapiFields.add("return_iwp");
    openapiFields.add("generate_media_intelligence_iwp");
    openapiFields.add("speaker_id");
    openapiFields.add("audio_description");
    openapiFields.add("on_screen_text");
    openapiFields.add("music_lyrics");
    openapiFields.add("custom_special_handling");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobOptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JobOptions.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobOptions is not found in the empty JSON string", JobOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JobOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JobOptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("customer_approval_steps") != null && !jsonObj.get("customer_approval_steps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_approval_steps` to be an array in the JSON string but got `%s`", jsonObj.get("customer_approval_steps").toString()));
      }
      if (jsonObj.get("customer_approval_tool") != null && !jsonObj.get("customer_approval_tool").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_approval_tool` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_approval_tool").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("return_iwp") != null && !jsonObj.get("return_iwp").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `return_iwp` to be an array in the JSON string but got `%s`", jsonObj.get("return_iwp").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("generate_media_intelligence_iwp") != null && !jsonObj.get("generate_media_intelligence_iwp").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `generate_media_intelligence_iwp` to be an array in the JSON string but got `%s`", jsonObj.get("generate_media_intelligence_iwp").toString()));
      }
      if (jsonObj.get("speaker_id") != null && !jsonObj.get("speaker_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `speaker_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("speaker_id").toString()));
      }
      if (jsonObj.get("audio_description") != null && !jsonObj.get("audio_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audio_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audio_description").toString()));
      }
      if (jsonObj.get("on_screen_text") != null && !jsonObj.get("on_screen_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `on_screen_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("on_screen_text").toString()));
      }
      if (jsonObj.get("music_lyrics") != null && !jsonObj.get("music_lyrics").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `music_lyrics` to be a primitive type in the JSON string but got `%s`", jsonObj.get("music_lyrics").toString()));
      }
      if (jsonObj.get("custom_special_handling") != null && !jsonObj.get("custom_special_handling").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_special_handling` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_special_handling").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<JobOptions>() {
           @Override
           public void write(JsonWriter out, JobOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JobOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JobOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobOptions
  * @throws IOException if the JSON string is invalid with respect to JobOptions
  */
  public static JobOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobOptions.class);
  }

 /**
  * Convert an instance of JobOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

