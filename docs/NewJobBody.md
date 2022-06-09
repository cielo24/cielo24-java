

# NewJobBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jobName** | **String** | A human readable identifier for the job |  [optional] |
|**language** | **String** | Native job language |  [optional] |
|**externalId** | **String** | An identifier you want to associate with this job |  [optional] |
|**username** | **String** | Create the job in specified sub-account |  [optional] |
|**requestor** | **String** | An requestor you want to associate with this job |  [optional] |
|**reference** | **String** | An reference you want to associate with this job |  [optional] |
|**expectedSpeakers** | **Integer** | Amount of speakers that the video will have |  [optional] |
|**isDuplicate** | [**IsDuplicateEnum**](#IsDuplicateEnum) | Allows creating multiple jobs with the same external_id |  [optional] |



## Enum: IsDuplicateEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



