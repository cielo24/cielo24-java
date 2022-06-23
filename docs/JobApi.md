# JobApi

All URIs are relative to *https://api.cielo24.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addMediaFile**](JobApi.md#addMediaFile) | **POST** /job/add_media |  |
| [**addMediaUrl**](JobApi.md#addMediaUrl) | **GET** /job/add_media |  |
| [**authorizeJob**](JobApi.md#authorizeJob) | **POST** /job/authorize |  |
| [**getCaption**](JobApi.md#getCaption) | **GET** /job/get_caption |  |
| [**jobInfo**](JobApi.md#jobInfo) | **GET** /job/info |  |
| [**newJob**](JobApi.md#newJob) | **POST** /job/new |  |
| [**performTranscription**](JobApi.md#performTranscription) | **POST** /job/perform_transcription |  |
| [**performTranslation**](JobApi.md#performTranslation) | **POST** /job/translate |  |


<a name="addMediaFile"></a>
# **addMediaFile**
> AddMediaResponse addMediaFile(v, jobId, contentLength, body, isDuplicate)



Add a piece of media to an existing job using a local file. No content-type should be included in the HTTP header. The media should be uploaded as raw binary, no encoding (base64, hex, etc) is required. Chunk-transfer encoding is NOT supported. File size is limited to 10 gb

### Example
```java
// Import classes:
import com.ApiClient;
import com.ApiException;
import com.Configuration;
import com.auth.*;
import com.models.*;
import com.cielo24.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cielo24.com/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JobApi apiInstance = new JobApi(defaultClient);
    Integer v = 1; // Integer | 
    String jobId = "0fbd6015910e42dca25a863c4925d77c"; // String | 
    Integer contentLength = 56; // Integer | 
    File body = new File("/path/to/file"); // File | 
    String isDuplicate = "true"; // String | 
    try {
      AddMediaResponse result = apiInstance.addMediaFile(v, jobId, contentLength, body, isDuplicate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#addMediaFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **v** | **Integer**|  | [default to 1] |
| **jobId** | **String**|  | |
| **contentLength** | **Integer**|  | |
| **body** | **File**|  | |
| **isDuplicate** | **String**|  | [optional] [default to false] [enum: true, false] |

### Return type

[**AddMediaResponse**](AddMediaResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: video/mp4
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | An error occurred |  -  |

<a name="addMediaUrl"></a>
# **addMediaUrl**
> AddMediaResponse addMediaUrl(v, jobId, mediaUrl, isDuplicate)



Add a piece of media to an existing job using a public media url. A job may only have a single piece of media associated with it, attempting to add additional media will return an error code.

### Example
```java
// Import classes:
import com.ApiClient;
import com.ApiException;
import com.Configuration;
import com.auth.*;
import com.models.*;
import com.cielo24.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cielo24.com/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JobApi apiInstance = new JobApi(defaultClient);
    Integer v = 1; // Integer | 
    String jobId = "0fbd6015910e42dca25a863c4925d77c"; // String | 
    String mediaUrl = "http://www.domain.com/video.mp4"; // String | 
    String isDuplicate = "true"; // String | 
    try {
      AddMediaResponse result = apiInstance.addMediaUrl(v, jobId, mediaUrl, isDuplicate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#addMediaUrl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **v** | **Integer**|  | [default to 1] |
| **jobId** | **String**|  | |
| **mediaUrl** | **String**|  | |
| **isDuplicate** | **String**|  | [optional] [default to false] [enum: true, false] |

### Return type

[**AddMediaResponse**](AddMediaResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | An error occurred |  -  |

<a name="authorizeJob"></a>
# **authorizeJob**
> authorizeJob(v, jobId)



Authorize an existing job. If your account has the \&quot;customer authorization\&quot; feature enabled (it is not enabled by default) jobs you create will be held in the \&quot;Authorizing\&quot; state until you call this method. Calling this method on a job that is not the \&quot;Authorizing\&quot; state has no effect and will return success. Please contact support@cielo24.com to enable the \&quot;customer authorization\&quot; feature.

### Example
```java
// Import classes:
import com.ApiClient;
import com.ApiException;
import com.Configuration;
import com.auth.*;
import com.models.*;
import com.cielo24.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cielo24.com/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JobApi apiInstance = new JobApi(defaultClient);
    Integer v = 1; // Integer | 
    String jobId = "0fbd6015910e42dca25a863c4925d77c"; // String | 
    try {
      apiInstance.authorizeJob(v, jobId);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#authorizeJob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **v** | **Integer**|  | [default to 1] |
| **jobId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | An error occurred |  -  |

<a name="getCaption"></a>
# **getCaption**
> String getCaption(v, jobId, captionFormat, buildUrl, captionWordsMin, captionBySentence, charactersPerCaptionLine, dfxpHeader, disallowDangling, displayEffectsSpeakerAs, displaySpeakerId, iwpName, elementlistVersion, emitSpeakerChangeTokensAs, forceCase, includeDfxpMetadata, layoutTargetCaptionLengthMs, lineBreakOnSentence, lineEndingFormat, linesPerCaption, maskProfanity, maximumCaptionDuration, mergeGapInterval, minimumCaptionLengthMs, minimumGapBetweenCaptionsMs, qtSeamless, removeDisfluencies, removeSoundsList, removeSoundReferences, replaceSlang, silenceMaxMs, singleSpeakerPerCaption, soundBoundaries, soundThreshold, soundTokensByCaption, soundTokensByLine, soundTokensByCaptionList, soundTokensByLineList, speakerOnNewLine, srtFormat, stripSquareBrackets, utf8Mark, replaceEnglishSpelling)



Get the caption file for a job. The job must have completed transcription before a caption can be downloaded.

### Example
```java
// Import classes:
import com.ApiClient;
import com.ApiException;
import com.Configuration;
import com.auth.*;
import com.models.*;
import com.cielo24.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cielo24.com/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JobApi apiInstance = new JobApi(defaultClient);
    Integer v = 1; // Integer | 
    String jobId = "0fbd6015910e42dca25a863c4925d77c"; // String | 
    String captionFormat = "DFXP"; // String | 
    String buildUrl = "true"; // String | Rather than returning the file, return a permanent URL to the file.
    Integer captionWordsMin = 1; // Integer | Minimum number of words allowed in a caption.
    String captionBySentence = "true"; // String | When true, puts each sentence into its own caption. When false, more than one sentence may appear in a single caption.
    Integer charactersPerCaptionLine = 42; // Integer | Maximum number of characters to be displayed on each caption line.
    String dfxpHeader = ""; // String | Allows you to specify a custom header for your DFXP caption file. The header should be the entire contents of the header including the opening and closing tags. Ignored if caption_format does not equal DFXP.
    String disallowDangling = "true"; // String | Will prevent captions from having the last word in a sentence start a new line. Last words will ALWAYS be kept on the same line, even if it breaks the characters_per_caption_line option.
    String displayEffectsSpeakerAs = "Effects"; // String | Determines what speaker name should used for sound effects.
    String displaySpeakerId = "no"; // String | Determines the way speakers are identified in the captions. Choose \"no\" to not display speaker identities at all: \">> example\" Choose \"number\" to display only the speaker number: \">> Speaker 1: example\" Choose \"name\" to display the speaker name: \">> John Doe: example\". If you choose \"name\", the speaker number will be displayed if the name is not available.
    String iwpName = "PREMIUM"; // String | The named version of element list to generate the transcript from. If not specified, the transcript will be generated from the latest version.
    String elementlistVersion = ""; // String | The version of element list to generate the captions from. If not specified, the caption will be generated from the latest version. (ISO 8601 Date String)
    String emitSpeakerChangeTokensAs = ">>"; // String | Determine what characters to use to denote speaker changes.
    String forceCase = ""; // String | Force the contents of the captions to be all UPPER or lower case. If blank, the case of the captions is not changed.
    String includeDfxpMetadata = "true"; // String | When true, and the caption format requested is DFXP, the jobs name, ID and language will be added to the DFXP metadata header. When false, these data are omitted from the header. Ignored if caption_format does not equal DFXP.
    Integer layoutTargetCaptionLengthMs = 5000; // Integer | Captions generated will, on average, be this duration. However, they may vary significantly based on other parameters you set.
    String lineBreakOnSentence = "true"; // String | Inserts a line break in between sentences that are in the same caption.
    String lineEndingFormat = "UNIX"; // String | Determine the end of line (EOL) character to use for the captions.
    Integer linesPerCaption = 2; // Integer | Number of lines to be displayed for each caption.
    String maskProfanity = "true"; // String | Replace profanity with asterisks.
    Integer maximumCaptionDuration = 10000; // Integer | No captions longer than this (in milliseconds) will be produced. If not specified, there is no maximum.
    Integer mergeGapInterval = 1000; // Integer | Captions with a gap between them that is smaller than this (in milliseconds) will have their start and/or end times changed so there is no time gap between the captions.
    Integer minimumCaptionLengthMs = 1500; // Integer | Extends the duration of short captions to the this minimum length. Additional time is taken from later caption blocks to meet this minimum time.
    Integer minimumGapBetweenCaptionsMs = 100; // Integer | Adds a minimum time between captions such as there will always be some time between captions where no text is displayed. When captions are very close together, time will be removed from the caption duration to make the gap.
    String qtSeamless = "true"; // String | Does not put time gaps of any kind between caption blocks. Ignored if caption_format does not equal QT.
    String removeDisfluencies = "true"; // String | Remove verbal disfluencies from the generated transcript. Common disfluencies such as \"um\" and \"ah\" are removed while maintaining appropriate punctuation.
    List<String> removeSoundsList = Arrays.asList(); // List<String> | A list of sounds to not show in the caption. This is a JSON style list, and should look like [\"MUSIC\", \"LAUGH\"]. Ignored if remove_sound_references is true.
    String removeSoundReferences = "true"; // String | Remove ALL non-verbal sound and noise references from the generated transcript. Sounds and unidentified noises are depicted in the caption as [SOUND], [COUGH] and [NOISE]. If this parameter is set, these identifiers are omitted from the caption.
    String replaceSlang = "true"; // String | Replace common slang terms from the generated transcript. Common replacements are \"want to\" for \"wanna\", \"going to\" for \"gonna\", etc.
    Integer silenceMaxMs = 2000; // Integer | If there is a interval of silence in the middle of a sentence longer than this, then the caption will be split.
    String singleSpeakerPerCaption = "true"; // String | When true, puts each speaker into its own caption. When false, more than one speaker may appear in a single caption.
    List<String> soundBoundaries = Arrays.asList(); // List<String> | Specifies the characters to surround sound references with. The default will generate sound references that look like this: [MUSIC].
    Integer soundThreshold = 5000; // Integer | Sound references that are longer than this threshold will be made their own caption entirely, and will not have any text included with them. If not set, Sound references will be included back to back with text no matter the duration of the sound.
    String soundTokensByCaption = "true"; // String | If true, all sound references will always be in their own caption. If false, more than one sound reference may appear in a single caption.
    String soundTokensByLine = "true"; // String | If true, all sound references will always be in their own line. If false, more than one sound reference may appear in a single line.
    List<String> soundTokensByCaptionList = Arrays.asList(); // List<String> | If non-empty, the specified sound references will always be in their own caption. If empty, more than one sound reference may appear in a single caption. Ignored if sound_tokens_by_caption is true.
    List<String> soundTokensByLineList = Arrays.asList(); // List<String> | If non-empty, the specified sound references will always be in their own line. If empty, more than one sound reference may appear in a single line. Ignored if sound_tokens_by_line is true.
    String speakerOnNewLine = "true"; // String | If true, a speaker change will cause a new caption to be made. If false, multiple speakers may appear in a single caption.
    String srtFormat = "{caption_number:d}\\n{start_hour:02d}:{start_minute:02d}:{start_second:02d},{start_millisecond:03d} -->{end_hour:02d}:{end_minute:02d}:{end_second:02d},{end_millisecond:03d}\\n{caption_text}\\n\\n"; // String | If the caption format is SRT, determines what the caption blocks will look like. The default, prints caption blocks that look like this:    1:   00:00:06,060 --> 00:00:16,060   This is the caption text.  You can alter the caption block by re-arranging or removing the substitution string values, shown enclosed in braces \"{}\" in the default value below. Substitution strings may used more than once if desired. Any text that is not a substitution string will be displayed as written. To add new lines, include a \\n. Note, you may need to escape the \\n with an extra backslash when encoding the request. 
    String stripSquareBrackets = "true"; // String | Removes all square brackets like '[' or ']' from captions. By default square brackets surround sound references like '[MUSIC]', but they may exist as part of the caption text as well.
    String utf8Mark = "true"; // String | Adds a utf8 bytemark to the beginning of the caption. This should only be used if the system you are loading the caption files into needs a byte marker. The vast majority of systems do not.
    String replaceEnglishSpelling = "A"; // String | Replaces English spelling with location accurate spelling. i.e. Color --> Colour  A: American  B: British  Z: British ize  U: Australian  C: Canadian 
    try {
      String result = apiInstance.getCaption(v, jobId, captionFormat, buildUrl, captionWordsMin, captionBySentence, charactersPerCaptionLine, dfxpHeader, disallowDangling, displayEffectsSpeakerAs, displaySpeakerId, iwpName, elementlistVersion, emitSpeakerChangeTokensAs, forceCase, includeDfxpMetadata, layoutTargetCaptionLengthMs, lineBreakOnSentence, lineEndingFormat, linesPerCaption, maskProfanity, maximumCaptionDuration, mergeGapInterval, minimumCaptionLengthMs, minimumGapBetweenCaptionsMs, qtSeamless, removeDisfluencies, removeSoundsList, removeSoundReferences, replaceSlang, silenceMaxMs, singleSpeakerPerCaption, soundBoundaries, soundThreshold, soundTokensByCaption, soundTokensByLine, soundTokensByCaptionList, soundTokensByLineList, speakerOnNewLine, srtFormat, stripSquareBrackets, utf8Mark, replaceEnglishSpelling);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#getCaption");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **v** | **Integer**|  | [default to 1] |
| **jobId** | **String**|  | |
| **captionFormat** | **String**|  | [enum: DFXP, ECHO, QT, SAMI, SBV, SCC, SRT, TPM, TRANSCRIPT, TWX, WEB_VTT] |
| **buildUrl** | **String**| Rather than returning the file, return a permanent URL to the file. | [optional] [default to false] [enum: true, false] |
| **captionWordsMin** | **Integer**| Minimum number of words allowed in a caption. | [optional] [default to 1] |
| **captionBySentence** | **String**| When true, puts each sentence into its own caption. When false, more than one sentence may appear in a single caption. | [optional] [default to true] [enum: true, false] |
| **charactersPerCaptionLine** | **Integer**| Maximum number of characters to be displayed on each caption line. | [optional] [default to 42] |
| **dfxpHeader** | **String**| Allows you to specify a custom header for your DFXP caption file. The header should be the entire contents of the header including the opening and closing tags. Ignored if caption_format does not equal DFXP. | [optional] [default to ] |
| **disallowDangling** | **String**| Will prevent captions from having the last word in a sentence start a new line. Last words will ALWAYS be kept on the same line, even if it breaks the characters_per_caption_line option. | [optional] [default to false] [enum: true, false] |
| **displayEffectsSpeakerAs** | **String**| Determines what speaker name should used for sound effects. | [optional] [default to Effects] |
| **displaySpeakerId** | **String**| Determines the way speakers are identified in the captions. Choose \&quot;no\&quot; to not display speaker identities at all: \&quot;&gt;&gt; example\&quot; Choose \&quot;number\&quot; to display only the speaker number: \&quot;&gt;&gt; Speaker 1: example\&quot; Choose \&quot;name\&quot; to display the speaker name: \&quot;&gt;&gt; John Doe: example\&quot;. If you choose \&quot;name\&quot;, the speaker number will be displayed if the name is not available. | [optional] [default to name] [enum: no, number, name] |
| **iwpName** | **String**| The named version of element list to generate the transcript from. If not specified, the transcript will be generated from the latest version. | [optional] [default to ] [enum: PREMIUM, INTERIM_PROFESSIONAL, PROFESSIONAL, SPEAKER_ID, FINAL, MECHANICAL, CUSTOMER_APPROVED_RETURN, CUSTOMER_APPROVED_TRANSLATION] |
| **elementlistVersion** | **String**| The version of element list to generate the captions from. If not specified, the caption will be generated from the latest version. (ISO 8601 Date String) | [optional] [default to ] |
| **emitSpeakerChangeTokensAs** | **String**| Determine what characters to use to denote speaker changes. | [optional] [default to &gt;&gt;] |
| **forceCase** | **String**| Force the contents of the captions to be all UPPER or lower case. If blank, the case of the captions is not changed. | [optional] [default to ] [enum: , lower, upper] |
| **includeDfxpMetadata** | **String**| When true, and the caption format requested is DFXP, the jobs name, ID and language will be added to the DFXP metadata header. When false, these data are omitted from the header. Ignored if caption_format does not equal DFXP. | [optional] [default to true] [enum: true, false] |
| **layoutTargetCaptionLengthMs** | **Integer**| Captions generated will, on average, be this duration. However, they may vary significantly based on other parameters you set. | [optional] [default to 5000] |
| **lineBreakOnSentence** | **String**| Inserts a line break in between sentences that are in the same caption. | [optional] [default to false] [enum: true, false] |
| **lineEndingFormat** | **String**| Determine the end of line (EOL) character to use for the captions. | [optional] [default to UNIX] [enum: UNIX, OSX, WINDOWS] |
| **linesPerCaption** | **Integer**| Number of lines to be displayed for each caption. | [optional] [default to 2] |
| **maskProfanity** | **String**| Replace profanity with asterisks. | [optional] [default to false] [enum: true, false] |
| **maximumCaptionDuration** | **Integer**| No captions longer than this (in milliseconds) will be produced. If not specified, there is no maximum. | [optional] |
| **mergeGapInterval** | **Integer**| Captions with a gap between them that is smaller than this (in milliseconds) will have their start and/or end times changed so there is no time gap between the captions. | [optional] [default to 1000] |
| **minimumCaptionLengthMs** | **Integer**| Extends the duration of short captions to the this minimum length. Additional time is taken from later caption blocks to meet this minimum time. | [optional] |
| **minimumGapBetweenCaptionsMs** | **Integer**| Adds a minimum time between captions such as there will always be some time between captions where no text is displayed. When captions are very close together, time will be removed from the caption duration to make the gap. | [optional] |
| **qtSeamless** | **String**| Does not put time gaps of any kind between caption blocks. Ignored if caption_format does not equal QT. | [optional] [default to false] [enum: true, false] |
| **removeDisfluencies** | **String**| Remove verbal disfluencies from the generated transcript. Common disfluencies such as \&quot;um\&quot; and \&quot;ah\&quot; are removed while maintaining appropriate punctuation. | [optional] [default to true] [enum: true, false] |
| **removeSoundsList** | [**List&lt;String&gt;**](String.md)| A list of sounds to not show in the caption. This is a JSON style list, and should look like [\&quot;MUSIC\&quot;, \&quot;LAUGH\&quot;]. Ignored if remove_sound_references is true. | [optional] [enum: UNKNOWN, INAUDIBLE, CROSSTALK, MUSIC, NOISE, LAUGH, COUGH, FOREIGN, BLANK_AUDIO, APPLAUSE, BLEEP, ENDS_SENTENCE] |
| **removeSoundReferences** | **String**| Remove ALL non-verbal sound and noise references from the generated transcript. Sounds and unidentified noises are depicted in the caption as [SOUND], [COUGH] and [NOISE]. If this parameter is set, these identifiers are omitted from the caption. | [optional] [default to true] [enum: true, false] |
| **replaceSlang** | **String**| Replace common slang terms from the generated transcript. Common replacements are \&quot;want to\&quot; for \&quot;wanna\&quot;, \&quot;going to\&quot; for \&quot;gonna\&quot;, etc. | [optional] [default to false] [enum: true, false] |
| **silenceMaxMs** | **Integer**| If there is a interval of silence in the middle of a sentence longer than this, then the caption will be split. | [optional] [default to 2000] |
| **singleSpeakerPerCaption** | **String**| When true, puts each speaker into its own caption. When false, more than one speaker may appear in a single caption. | [optional] [default to true] [enum: true, false] |
| **soundBoundaries** | [**List&lt;String&gt;**](String.md)| Specifies the characters to surround sound references with. The default will generate sound references that look like this: [MUSIC]. | [optional] |
| **soundThreshold** | **Integer**| Sound references that are longer than this threshold will be made their own caption entirely, and will not have any text included with them. If not set, Sound references will be included back to back with text no matter the duration of the sound. | [optional] |
| **soundTokensByCaption** | **String**| If true, all sound references will always be in their own caption. If false, more than one sound reference may appear in a single caption. | [optional] [default to false] [enum: true, false] |
| **soundTokensByLine** | **String**| If true, all sound references will always be in their own line. If false, more than one sound reference may appear in a single line. | [optional] [default to false] [enum: true, false] |
| **soundTokensByCaptionList** | [**List&lt;String&gt;**](String.md)| If non-empty, the specified sound references will always be in their own caption. If empty, more than one sound reference may appear in a single caption. Ignored if sound_tokens_by_caption is true. | [optional] [enum: UNKNOWN, INAUDIBLE, CROSSTALK, MUSIC, NOISE, LAUGH, COUGH, FOREIGN, BLANK_AUDIO, APPLAUSE, BLEEP, ENDS_SENTENCE] |
| **soundTokensByLineList** | [**List&lt;String&gt;**](String.md)| If non-empty, the specified sound references will always be in their own line. If empty, more than one sound reference may appear in a single line. Ignored if sound_tokens_by_line is true. | [optional] [enum: UNKNOWN, INAUDIBLE, CROSSTALK, MUSIC, NOISE, LAUGH, COUGH, FOREIGN, BLANK_AUDIO, APPLAUSE, BLEEP, ENDS_SENTENCE] |
| **speakerOnNewLine** | **String**| If true, a speaker change will cause a new caption to be made. If false, multiple speakers may appear in a single caption. | [optional] [default to true] [enum: true, false] |
| **srtFormat** | **String**| If the caption format is SRT, determines what the caption blocks will look like. The default, prints caption blocks that look like this:    1:   00:00:06,060 --&gt; 00:00:16,060   This is the caption text.  You can alter the caption block by re-arranging or removing the substitution string values, shown enclosed in braces \&quot;{}\&quot; in the default value below. Substitution strings may used more than once if desired. Any text that is not a substitution string will be displayed as written. To add new lines, include a \\n. Note, you may need to escape the \\n with an extra backslash when encoding the request.  | [optional] [default to {caption_number:d}\n{start_hour:02d}:{start_minute:02d}:{start_second:02d},{start_millisecond:03d} --&gt;{end_hour:02d}:{end_minute:02d}:{end_second:02d},{end_millisecond:03d}\n{caption_text}\n\n] |
| **stripSquareBrackets** | **String**| Removes all square brackets like &#39;[&#39; or &#39;]&#39; from captions. By default square brackets surround sound references like &#39;[MUSIC]&#39;, but they may exist as part of the caption text as well. | [optional] [default to false] [enum: true, false] |
| **utf8Mark** | **String**| Adds a utf8 bytemark to the beginning of the caption. This should only be used if the system you are loading the caption files into needs a byte marker. The vast majority of systems do not. | [optional] [default to false] [enum: true, false] |
| **replaceEnglishSpelling** | **String**| Replaces English spelling with location accurate spelling. i.e. Color --&gt; Colour  A: American  B: British  Z: British ize  U: Australian  C: Canadian  | [optional] [default to A] [enum: A, B, Z, U, C] |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | An error occurred |  -  |

<a name="jobInfo"></a>
# **jobInfo**
> JobInfoResponse jobInfo(v, jobId)



### Example
```java
// Import classes:
import com.ApiClient;
import com.ApiException;
import com.Configuration;
import com.auth.*;
import com.models.*;
import com.cielo24.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cielo24.com/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JobApi apiInstance = new JobApi(defaultClient);
    Integer v = 1; // Integer | 
    String jobId = "0fbd6015910e42dca25a863c4925d77c"; // String | 
    try {
      JobInfoResponse result = apiInstance.jobInfo(v, jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#jobInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **v** | **Integer**|  | [default to 1] |
| **jobId** | **String**|  | |

### Return type

[**JobInfoResponse**](JobInfoResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | An error occurred |  -  |

<a name="newJob"></a>
# **newJob**
> NewJobResponse newJob(v, newJobBody)



Create a new job. A job is a container into which you can upload media and request that transcription be performed. Creating a job is prerequisite for virtually all other methods.

### Example
```java
// Import classes:
import com.ApiClient;
import com.ApiException;
import com.Configuration;
import com.auth.*;
import com.models.*;
import com.cielo24.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cielo24.com/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JobApi apiInstance = new JobApi(defaultClient);
    Integer v = 1; // Integer | 
    NewJobBody newJobBody = new NewJobBody(); // NewJobBody | 
    try {
      NewJobResponse result = apiInstance.newJob(v, newJobBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#newJob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **v** | **Integer**|  | [default to 1] |
| **newJobBody** | [**NewJobBody**](NewJobBody.md)|  | |

### Return type

[**NewJobResponse**](NewJobResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | An error occurred |  -  |

<a name="performTranscription"></a>
# **performTranscription**
> PerformTranscriptionResponse performTranscription(v, performTranscriptionBody)



Request that transcription be performed on the specified job. A callback URL, if specified, will be called when the transcription is complete. See [callback documentation](https://cielo24.readthedocs.io/en/latest/basics.html#callbacks-label) for details.

### Example
```java
// Import classes:
import com.ApiClient;
import com.ApiException;
import com.Configuration;
import com.auth.*;
import com.models.*;
import com.cielo24.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cielo24.com/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JobApi apiInstance = new JobApi(defaultClient);
    Integer v = 1; // Integer | 
    PerformTranscriptionBody performTranscriptionBody = new PerformTranscriptionBody(); // PerformTranscriptionBody | 
    try {
      PerformTranscriptionResponse result = apiInstance.performTranscription(v, performTranscriptionBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#performTranscription");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **v** | **Integer**|  | [default to 1] |
| **performTranscriptionBody** | [**PerformTranscriptionBody**](PerformTranscriptionBody.md)|  | |

### Return type

[**PerformTranscriptionResponse**](PerformTranscriptionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | An error occurred |  -  |

<a name="performTranslation"></a>
# **performTranslation**
> PerformTranslationResponse performTranslation(v, jobId, targetLanguages, approveUplevel)



Request that orders a new Translation language for a video that has been previously Transcribed and/or Translated. The New Job ID and job target language will be returned upon completion.

### Example
```java
// Import classes:
import com.ApiClient;
import com.ApiException;
import com.Configuration;
import com.auth.*;
import com.models.*;
import com.cielo24.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cielo24.com/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JobApi apiInstance = new JobApi(defaultClient);
    Integer v = 1; // Integer | 
    String jobId = "0fbd6015910e42dca25a863c4925d77c"; // String | 
    String targetLanguages = "fr,de"; // String | The language(s) being ordered (Any RFC 5646 language code) separated by comma (,)
    String approveUplevel = "true"; // String | 
    try {
      PerformTranslationResponse result = apiInstance.performTranslation(v, jobId, targetLanguages, approveUplevel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#performTranslation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **v** | **Integer**|  | [default to 1] |
| **jobId** | **String**|  | |
| **targetLanguages** | **String**| The language(s) being ordered (Any RFC 5646 language code) separated by comma (,) | |
| **approveUplevel** | **String**|  | [optional] [enum: true, false, t, f, true, false] |

### Return type

[**PerformTranslationResponse**](PerformTranslationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **400** | An error occurred |  -  |

