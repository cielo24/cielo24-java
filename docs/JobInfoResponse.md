

# JobInfoResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jobId** | **String** |  |  [optional] |
|**jobName** | **String** |  |  [optional] |
|**mediaLengthSeconds** | **BigDecimal** |  |  [optional] |
|**externalId** | **String** | Depends on third-party integrations. |  [optional] |
|**priority** | [**PriorityEnum**](#PriorityEnum) |  |  [optional] |
|**fidelity** | [**FidelityEnum**](#FidelityEnum) |  |  [optional] |
|**jobStatus** | [**JobStatusEnum**](#JobStatusEnum) |  |  [optional] |
|**options** | [**JobOptions**](JobOptions.md) |  |  [optional] |
|**returnTargets** | **Object** |  |  [optional] |
|**sourceLanguage** | **String** | RFC 5646 Language Code |  [optional] |
|**targetLanguage** | **String** | RFC 5646 Language Code |  [optional] |
|**creationDate** | **String** | ISO 8601 Date String |  [optional] |
|**startDate** | **String** | ISO 8601 Date String |  [optional] |
|**dueDate** | **String** | ISO 8601 Date String |  [optional] |
|**completedDate** | **String** | ISO 8601 Date String |  [optional] |
|**returnDate** | **String** | ISO 8601 Date String |  [optional] |
|**authorizationDate** | **String** | ISO 8601 Date String |  [optional] |
|**jobDifficulty** | [**JobDifficultyEnum**](#JobDifficultyEnum) |  |  [optional] |



## Enum: PriorityEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;STANDARD&quot; |
| PRIORITY | &quot;PRIORITY&quot; |



## Enum: FidelityEnum

| Name | Value |
|---- | -----|
| MECHANICAL | &quot;MECHANICAL&quot; |
| PREMIUM | &quot;PREMIUM&quot; |
| PROFESSIONAL | &quot;PROFESSIONAL&quot; |
| HIGH | &quot;HIGH&quot; |



## Enum: JobStatusEnum

| Name | Value |
|---- | -----|
| AUTHORIZING | &quot;Authorizing&quot; |
| PENDING | &quot;Pending&quot; |
| IN_PROCESS | &quot;In Process&quot; |
| COMPLETE | &quot;Complete&quot; |
| MEDIA_FAILURE | &quot;Media Failure&quot; |
| REVIEWING | &quot;Reviewing&quot; |



## Enum: JobDifficultyEnum

| Name | Value |
|---- | -----|
| GOOD | &quot;Good&quot; |
| BAD | &quot;Bad&quot; |
| UNKNOWN | &quot;Unknown&quot; |



