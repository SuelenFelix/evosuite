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

public class WorkflowCreateInputData_getTargetSystemuid_40361550418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13382;

    public WorkflowCreateInputData_getTargetSystemuid_40361550418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13433 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term13433, term13433.getClass(), "name", "");
        setField(term13433, term13433.getClass(), "value", "");
        Object term13436 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term13436, term13436.getClass(), "name", "");
        setField(term13436, term13436.getClass(), "value", "");
        Object term13439 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term13439, term13439.getClass(), "name", "");
        setField(term13439, term13439.getClass(), "value", "");
        Object term13442 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term13442, term13442.getClass(), "name", "");
        setField(term13442, term13442.getClass(), "value", "");
        Object term13445 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term13445, term13445.getClass(), "name", "");
        setField(term13445, term13445.getClass(), "value", "");
        ArrayList term13431 = new ArrayList();
        ((ArrayList) term13431).add(term13433);
        ((ArrayList) term13431).add(term13436);
        ((ArrayList) term13431).add(term13439);
        ((ArrayList) term13431).add(term13442);
        ((ArrayList) term13431).add(term13445);
        Boolean term13510 = new Boolean(true);
        ArrayList term13536 = new ArrayList();
        ((ArrayList) term13536).add("NWldOLAbqk");
        Boolean term13552 = new Boolean(false);
        Boolean term13566 = new Boolean(false);
        term13382 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term13382, term13382.getClass(), "workflowName", "ceCWHUTQUM");
        setField(term13382, term13382.getClass(), "workflowDefinitionFile", "LrqwfrKKtS");
        setField(term13382, term13382.getClass(), "workflowDefinitionFileSystem", "ZUdnQXfzCI");
        setField(term13382, term13382.getClass(), "variableInputFile", "EULDrUNQvw");
        setField(term13382, term13382.getClass(), "variables", term13431);
        setField(term13382, term13382.getClass(), "resolveGlobalConflictByUsing", "xeyjTOCOJb");
        setField(term13382, term13382.getClass(), "system", "DGRqjjdhzy");
        setField(term13382, term13382.getClass(), "owner", "lQFkjJUPAR");
        setField(term13382, term13382.getClass(), "workflowArchiveSAFID", "BsuVlGUUjV");
        setField(term13382, term13382.getClass(), "comments", "bHHjfDCntT");
        setField(term13382, term13382.getClass(), "assignToOwner", term13510);
        setField(term13382, term13382.getClass(), "accessType", "sEphiduvkv");
        setField(term13382, term13382.getClass(), "accountInfo", "PbLgCSAHce");
        setField(term13382, term13382.getClass(), "jobStatement", term13536);
        setField(term13382, term13382.getClass(), "deleteCompletedJobs", term13552);
        setField(term13382, term13382.getClass(), "jobsOutputDirectory", "qnYaYSpDwO");
        setField(term13382, term13382.getClass(), "autoDeleteOnCompletion", term13566);
        setField(term13382, term13382.getClass(), "targetSystemuid", "dgbFDCdHtj");
        setField(term13382, term13382.getClass(), "targetSystempwd", "EKpdCBubDE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTargetSystemuid", argTypes, term13382, args);
    }

};


