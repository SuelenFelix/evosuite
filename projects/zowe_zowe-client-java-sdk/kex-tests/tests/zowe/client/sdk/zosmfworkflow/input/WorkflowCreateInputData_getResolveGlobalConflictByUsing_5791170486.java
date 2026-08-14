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

public class WorkflowCreateInputData_getResolveGlobalConflictByUsing_5791170486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8417;

    public WorkflowCreateInputData_getResolveGlobalConflictByUsing_5791170486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8468 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term8468, term8468.getClass(), "name", "");
        setField(term8468, term8468.getClass(), "value", "");
        Object term8471 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term8471, term8471.getClass(), "name", "");
        setField(term8471, term8471.getClass(), "value", "");
        Object term8474 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term8474, term8474.getClass(), "name", "");
        setField(term8474, term8474.getClass(), "value", "");
        Object term8477 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term8477, term8477.getClass(), "name", "");
        setField(term8477, term8477.getClass(), "value", "");
        Object term8480 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term8480, term8480.getClass(), "name", "");
        setField(term8480, term8480.getClass(), "value", "");
        ArrayList term8466 = new ArrayList();
        ((ArrayList) term8466).add(term8468);
        ((ArrayList) term8466).add(term8471);
        ((ArrayList) term8466).add(term8474);
        ((ArrayList) term8466).add(term8477);
        ((ArrayList) term8466).add(term8480);
        Boolean term8545 = new Boolean(false);
        ArrayList term8571 = new ArrayList();
        ((ArrayList) term8571).add("zcorEihhLK");
        ((ArrayList) term8571).add("GrqozDKFOk");
        Boolean term8599 = new Boolean(false);
        Boolean term8613 = new Boolean(true);
        term8417 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term8417, term8417.getClass(), "workflowName", "PgPzMSEjjX");
        setField(term8417, term8417.getClass(), "workflowDefinitionFile", "wzsPSPcRdj");
        setField(term8417, term8417.getClass(), "workflowDefinitionFileSystem", "kGMQdqJYyB");
        setField(term8417, term8417.getClass(), "variableInputFile", "XJJNClzHRf");
        setField(term8417, term8417.getClass(), "variables", term8466);
        setField(term8417, term8417.getClass(), "resolveGlobalConflictByUsing", "FwPbDZcHmB");
        setField(term8417, term8417.getClass(), "system", "hOncybyCAH");
        setField(term8417, term8417.getClass(), "owner", "QduALnDSVo");
        setField(term8417, term8417.getClass(), "workflowArchiveSAFID", "izPpKDErnQ");
        setField(term8417, term8417.getClass(), "comments", "NnpwZBUTvx");
        setField(term8417, term8417.getClass(), "assignToOwner", term8545);
        setField(term8417, term8417.getClass(), "accessType", "tlQSNgTkQX");
        setField(term8417, term8417.getClass(), "accountInfo", "PCipZnmBOF");
        setField(term8417, term8417.getClass(), "jobStatement", term8571);
        setField(term8417, term8417.getClass(), "deleteCompletedJobs", term8599);
        setField(term8417, term8417.getClass(), "jobsOutputDirectory", "CFyoseFGLF");
        setField(term8417, term8417.getClass(), "autoDeleteOnCompletion", term8613);
        setField(term8417, term8417.getClass(), "targetSystemuid", "SFqCrhEWLm");
        setField(term8417, term8417.getClass(), "targetSystempwd", "GZdcJyZntS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResolveGlobalConflictByUsing", argTypes, term8417, args);
    }

};


