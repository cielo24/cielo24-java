package cielo24.options;

import cielo24.utils.QueryName;
import cielo24.Enums.*;

import javax.time.calendar.LocalDateTime;

public class JobListOptions extends BaseOptions {

    @QueryName("CreationDateFrom")
    public LocalDateTime creationDateFrom = null;
    @QueryName("CreationDateTo")
    public LocalDateTime creationDateTo = null;
    @QueryName("StartDateFrom")
    public LocalDateTime startDateFrom = null;
    @QueryName("StartDateTo")
    public LocalDateTime startDateTo = null;
    @QueryName("DueDateFrom")
    public LocalDateTime dueDateFrom = null;
    @QueryName("DueDateTo")
    public LocalDateTime dueDateTo = null;
    @QueryName("CompleteDateFrom")
    public LocalDateTime completeDateFrom = null;
    @QueryName("CompleteDateTo")
    public LocalDateTime completeDateTo = null;
    @QueryName("JobStatus")
    public JobStatus jobStatus = null;
    @QueryName("Fidelity")
    public Fidelity fidelity = null;
    @QueryName("Priority")
    public Priority priority = null;
    @QueryName("TurnaroundTimeHoursFrom")
    public Integer turnaroundTimeHoursFrom = null;
    @QueryName("TurnaroundTimeHoursTo")
    public Integer turnaroundTimeHoursTo = null;
    @QueryName("JobName")
    public String jobName = null;
    @QueryName("ExternalId")
    public String externalId = null;
    @QueryName("JobDifficulty")
    public JobDifficulty jobDifficulty = null;
    @QueryName("username")
    public String subAccount = null;
}
