

# PerformTranscriptionBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jobId** | **String** | The ID of the job |  |
|**transcriptionFidelity** | [**TranscriptionFidelityEnum**](#TranscriptionFidelityEnum) | The desired fidelity of the transcription |  |
|**priority** | [**PriorityEnum**](#PriorityEnum) | The desired priority of the transcription |  |
|**callbackUrl** | **String** | A URL with query string which will be called on completion. If submitting the callback_url as a query string parameter, rather than a value in the POST data, the callback_url should be URL encoded. The callback URL can contain tags that will be replaced with job specific data when the callback is called. Below is the list of tags that are supported: {job_id}, {job_name}, {elementlist_version}, {iwp_name} (The Interim Work Product name associated with this ElementList version) |  [optional] |
|**options** | **String** | A job options json. See JobOptions object for details. |  [optional] |
|**targetLanguage** | **String** | An RFC 5646 language code to translate this job into. If not specified, then no translation will be performed. If specified, but the language code specified matches the language code on the job request, then no translation will be performed. |  [optional] |
|**turnaroundHours** | **Integer** | The number of hours after submission that the job will be returned. If not specified, it will be set to a default based on the value of the priority parameter. The defaults are 24 and 48 for the PRIORITY and STANDARD priorities respectively. If you request a smaller number of hours than the default for the priority you have selected, the priority will be automatically changed. For example if you request a turnaround_hours of 16 with a priority of STANDARD, the priority will be automatically, and silently, changed to PRIORITY. |  [optional] |



## Enum: TranscriptionFidelityEnum

| Name | Value |
|---- | -----|
| MECHANICAL | &quot;MECHANICAL&quot; |
| PREMIUM | &quot;PREMIUM&quot; |
| PROFESSIONAL | &quot;PROFESSIONAL&quot; |



## Enum: PriorityEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;STANDARD&quot; |
| PRIORITY | &quot;PRIORITY&quot; |



