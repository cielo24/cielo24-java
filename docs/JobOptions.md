

# JobOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerApprovalSteps** | [**List&lt;CustomerApprovalStepsEnum&gt;**](#List&lt;CustomerApprovalStepsEnum&gt;) | Requires your approval of a job at specified points in the workflow. When the job is ready for approval you will be emailed a link that will take you to a web based tool you can use to view, edit and approve the job. You may request approval at two points in the workflow: before translation and before the job is returned. |  [optional] |
|**customerApprovalTool** | [**CustomerApprovalToolEnum**](#CustomerApprovalToolEnum) | Determines which web based tool to use for viewing, editing and approving jobs. |  [optional] |
|**customMetadata** | **Object** | A JSON dictionary of key value pairs. These will be used as substitution strings when building the callback URL and custom DFXP caption header. |  [optional] |
|**notes** | **Object** | Allows you to provide text that will be displayed to the transcriber when the job is processed. An HTML included will be escaped. |  [optional] |
|**returnIwp** | **List&lt;IWPEnum&gt;** | Allows you to receive additional callbacks when interim versions of the job are completed. If you specified a callback_url, then a callback will sent for FINAL regardless of the value of this option. |  [optional] |
|**generateMediaIntelligenceIwp** | **List&lt;IWPEnum&gt;** | Requests that media intelligence be generated for the specified interim/final versions of the transcript. Media intelligence data is added to the ElementList and can be retrieve using the get_elementlist API call. See [ElementList](https://cielo24.readthedocs.io/en/latest/output_formats/elementlist.html#media-intelligence-label) for details. |  [optional] |
|**speakerId** | [**SpeakerIdEnum**](#SpeakerIdEnum) | Requests that speaker names be identified. |  [optional] |
|**audioDescription** | [**AudioDescriptionEnum**](#AudioDescriptionEnum) | Requests that all noises and sounds be identified. |  [optional] |
|**onScreenText** | [**OnScreenTextEnum**](#OnScreenTextEnum) | Requests that any text that appears in the media be added to the transcription. |  [optional] |
|**musicLyrics** | [**MusicLyricsEnum**](#MusicLyricsEnum) | Requests that lyrics to songs be transcribed instead of labeled [MUSIC]. |  [optional] |
|**customSpecialHandling** | [**CustomSpecialHandlingEnum**](#CustomSpecialHandlingEnum) | Requests that transcribers follow submitted instruction set. |  [optional] |



## Enum: List&lt;CustomerApprovalStepsEnum&gt;

| Name | Value |
|---- | -----|
| TRANSLATION | &quot;TRANSLATION&quot; |
| RETURN | &quot;RETURN&quot; |



## Enum: CustomerApprovalToolEnum

| Name | Value |
|---- | -----|
| AMARA | &quot;AMARA&quot; |
| CIELO24 | &quot;CIELO24&quot; |



## Enum: SpeakerIdEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: AudioDescriptionEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: OnScreenTextEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: MusicLyricsEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: CustomSpecialHandlingEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



