package zowe.client.sdk.zosmfworkflow.input;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static zowe.client.sdk.zosmfworkflow.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;

public class WorkflowCreateInputData_getWorkflowArchiveSAFID_15571291889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9520;

    public WorkflowCreateInputData_getWorkflowArchiveSAFID_15571291889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9571 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term9571, term9571.getClass(), "name", "");
        setField(term9571, term9571.getClass(), "value", "");
        Object term9574 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term9574, term9574.getClass(), "name", "");
        setField(term9574, term9574.getClass(), "value", "");
        Object term9577 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term9577, term9577.getClass(), "name", "");
        setField(term9577, term9577.getClass(), "value", "");
        Object term9580 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term9580, term9580.getClass(), "name", "");
        setField(term9580, term9580.getClass(), "value", "");
        Object term9583 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term9583, term9583.getClass(), "name", "");
        setField(term9583, term9583.getClass(), "value", "");
        Object term9586 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term9586, term9586.getClass(), "name", "");
        setField(term9586, term9586.getClass(), "value", "");
        Object term9589 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term9589, term9589.getClass(), "name", "");
        setField(term9589, term9589.getClass(), "value", "");
        Object term9592 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term9592, term9592.getClass(), "name", "");
        setField(term9592, term9592.getClass(), "value", "");
        ArrayList term9569 = new ArrayList();
        ((ArrayList) term9569).add(term9571);
        ((ArrayList) term9569).add(term9574);
        ((ArrayList) term9569).add(term9577);
        ((ArrayList) term9569).add(term9580);
        ((ArrayList) term9569).add(term9583);
        ((ArrayList) term9569).add(term9586);
        ((ArrayList) term9569).add(term9589);
        ((ArrayList) term9569).add(term9592);
        Boolean term9657 = new Boolean(false);
        ArrayList term9683 = new ArrayList();
        ((ArrayList) term9683).add("tsTGdgQYUL");
        ((ArrayList) term9683).add("TtGbVmKcnX");
        ((ArrayList) term9683).add("GJVkUrCVdD");
        ((ArrayList) term9683).add("zNdorvdUgu");
        ((ArrayList) term9683).add("oPxuZbkYio");
        ((ArrayList) term9683).add("vKitydDVnM");
        Boolean term9759 = new Boolean(true);
        Boolean term9773 = new Boolean(true);
        term9520 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term9520, term9520.getClass(), "workflowName", "ypEdrstygY");
        setField(term9520, term9520.getClass(), "workflowDefinitionFile", "sNQFlATEeQ");
        setField(term9520, term9520.getClass(), "workflowDefinitionFileSystem", "ZKMLioamsY");
        setField(term9520, term9520.getClass(), "variableInputFile", "WVbxuoDBcn");
        setField(term9520, term9520.getClass(), "variables", term9569);
        setField(term9520, term9520.getClass(), "resolveGlobalConflictByUsing", "uPuCVuZYOI");
        setField(term9520, term9520.getClass(), "system", "TweMFhxNdj");
        setField(term9520, term9520.getClass(), "owner", "NBrvVzvQHe");
        setField(term9520, term9520.getClass(), "workflowArchiveSAFID", "FjOiNAfBOc");
        setField(term9520, term9520.getClass(), "comments", "iCCsaLHohG");
        setField(term9520, term9520.getClass(), "assignToOwner", term9657);
        setField(term9520, term9520.getClass(), "accessType", "NJhGgctbdj");
        setField(term9520, term9520.getClass(), "accountInfo", "MYWYUeLGOp");
        setField(term9520, term9520.getClass(), "jobStatement", term9683);
        setField(term9520, term9520.getClass(), "deleteCompletedJobs", term9759);
        setField(term9520, term9520.getClass(), "jobsOutputDirectory", "urCiQnUFBM");
        setField(term9520, term9520.getClass(), "autoDeleteOnCompletion", term9773);
        setField(term9520, term9520.getClass(), "targetSystemuid", "EKjQdtKxAM");
        setField(term9520, term9520.getClass(), "targetSystempwd", "TXZAIPQJHt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowArchiveSAFID", argTypes, term9520, args);
    }

};


