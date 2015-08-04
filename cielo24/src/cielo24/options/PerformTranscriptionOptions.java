package cielo24.options;

import static cielo24.Enums.*;

import java.util.ArrayList;

import cielo24.utils.QueryName;

public class PerformTranscriptionOptions extends BaseOptions {
    
    @QueryName("customer_approval_steps")
    public ArrayList<CustomerApprovalStep> customerApprovalSteps = null;
    @QueryName("customer_approval_tool")
    public CustomerApprovalTool customerApprovalTool = null;
    @QueryName("custom_metadata")
    public String customMetadata = null;
    @QueryName("notes")
    public String notes = null;
    @QueryName("return_iwp")
    public ArrayList<IWP> returnIwp = null;
    @QueryName("speaker_id")
    public Boolean speakerId = null;
}