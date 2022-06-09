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
 * NewJobBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-09T12:06:07.546-03:00[America/Sao_Paulo]")
public class NewJobBody {
  public static final String SERIALIZED_NAME_JOB_NAME = "job_name";
  @SerializedName(SERIALIZED_NAME_JOB_NAME)
  private String jobName;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_REQUESTOR = "requestor";
  @SerializedName(SERIALIZED_NAME_REQUESTOR)
  private String requestor;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_EXPECTED_SPEAKERS = "expected_speakers";
  @SerializedName(SERIALIZED_NAME_EXPECTED_SPEAKERS)
  private Integer expectedSpeakers;

  /**
   * Allows creating multiple jobs with the same external_id
   */
  @JsonAdapter(IsDuplicateEnum.Adapter.class)
  public enum IsDuplicateEnum {
    TRUE("true"),
    
    FALSE("false");

    private String value;

    IsDuplicateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IsDuplicateEnum fromValue(String value) {
      for (IsDuplicateEnum b : IsDuplicateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IsDuplicateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IsDuplicateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IsDuplicateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IsDuplicateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IS_DUPLICATE = "is_duplicate";
  @SerializedName(SERIALIZED_NAME_IS_DUPLICATE)
  private IsDuplicateEnum isDuplicate = IsDuplicateEnum.FALSE;

  public NewJobBody() { 
  }

  public NewJobBody jobName(String jobName) {
    
    this.jobName = jobName;
    return this;
  }

   /**
   * A human readable identifier for the job
   * @return jobName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human readable identifier for the job")

  public String getJobName() {
    return jobName;
  }


  public void setJobName(String jobName) {
    this.jobName = jobName;
  }


  public NewJobBody language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Native job language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en (Any RFC 5646 language code)", value = "Native job language")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public NewJobBody externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * An identifier you want to associate with this job
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "An identifier you want to associate with this job")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public NewJobBody username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Create the job in specified sub-account
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my_sub_account", value = "Create the job in specified sub-account")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public NewJobBody requestor(String requestor) {
    
    this.requestor = requestor;
    return this;
  }

   /**
   * An requestor you want to associate with this job
   * @return requestor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test_requestor", value = "An requestor you want to associate with this job")

  public String getRequestor() {
    return requestor;
  }


  public void setRequestor(String requestor) {
    this.requestor = requestor;
  }


  public NewJobBody reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * An reference you want to associate with this job
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test_reference", value = "An reference you want to associate with this job")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public NewJobBody expectedSpeakers(Integer expectedSpeakers) {
    
    this.expectedSpeakers = expectedSpeakers;
    return this;
  }

   /**
   * Amount of speakers that the video will have
   * @return expectedSpeakers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "40", value = "Amount of speakers that the video will have")

  public Integer getExpectedSpeakers() {
    return expectedSpeakers;
  }


  public void setExpectedSpeakers(Integer expectedSpeakers) {
    this.expectedSpeakers = expectedSpeakers;
  }


  public NewJobBody isDuplicate(IsDuplicateEnum isDuplicate) {
    
    this.isDuplicate = isDuplicate;
    return this;
  }

   /**
   * Allows creating multiple jobs with the same external_id
   * @return isDuplicate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allows creating multiple jobs with the same external_id")

  public IsDuplicateEnum getIsDuplicate() {
    return isDuplicate;
  }


  public void setIsDuplicate(IsDuplicateEnum isDuplicate) {
    this.isDuplicate = isDuplicate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewJobBody newJobBody = (NewJobBody) o;
    return Objects.equals(this.jobName, newJobBody.jobName) &&
        Objects.equals(this.language, newJobBody.language) &&
        Objects.equals(this.externalId, newJobBody.externalId) &&
        Objects.equals(this.username, newJobBody.username) &&
        Objects.equals(this.requestor, newJobBody.requestor) &&
        Objects.equals(this.reference, newJobBody.reference) &&
        Objects.equals(this.expectedSpeakers, newJobBody.expectedSpeakers) &&
        Objects.equals(this.isDuplicate, newJobBody.isDuplicate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobName, language, externalId, username, requestor, reference, expectedSpeakers, isDuplicate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewJobBody {\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    requestor: ").append(toIndentedString(requestor)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    expectedSpeakers: ").append(toIndentedString(expectedSpeakers)).append("\n");
    sb.append("    isDuplicate: ").append(toIndentedString(isDuplicate)).append("\n");
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
    openapiFields.add("job_name");
    openapiFields.add("language");
    openapiFields.add("external_id");
    openapiFields.add("username");
    openapiFields.add("requestor");
    openapiFields.add("reference");
    openapiFields.add("expected_speakers");
    openapiFields.add("is_duplicate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NewJobBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (NewJobBody.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in NewJobBody is not found in the empty JSON string", NewJobBody.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NewJobBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NewJobBody` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("job_name") != null && !jsonObj.get("job_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_name").toString()));
      }
      if (jsonObj.get("language") != null && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if (jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if (jsonObj.get("username") != null && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if (jsonObj.get("requestor") != null && !jsonObj.get("requestor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestor").toString()));
      }
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      if (jsonObj.get("is_duplicate") != null && !jsonObj.get("is_duplicate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_duplicate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_duplicate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NewJobBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NewJobBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NewJobBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NewJobBody.class));

       return (TypeAdapter<T>) new TypeAdapter<NewJobBody>() {
           @Override
           public void write(JsonWriter out, NewJobBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NewJobBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NewJobBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NewJobBody
  * @throws IOException if the JSON string is invalid with respect to NewJobBody
  */
  public static NewJobBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NewJobBody.class);
  }

 /**
  * Convert an instance of NewJobBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
