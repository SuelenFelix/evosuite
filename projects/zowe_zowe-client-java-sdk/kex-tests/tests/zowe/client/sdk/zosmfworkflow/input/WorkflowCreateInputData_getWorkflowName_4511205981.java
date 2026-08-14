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

public class WorkflowCreateInputData_getWorkflowName_4511205981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6261;

    public WorkflowCreateInputData_getWorkflowName_4511205981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6312 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term6312, term6312.getClass(), "name", "");
        setField(term6312, term6312.getClass(), "value", "");
        Object term6315 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term6315, term6315.getClass(), "name", "");
        setField(term6315, term6315.getClass(), "value", "");
        Object term6318 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term6318, term6318.getClass(), "name", "");
        setField(term6318, term6318.getClass(), "value", "");
        ArrayList term6310 = new ArrayList();
        ((ArrayList) term6310).add(term6312);
        ((ArrayList) term6310).add(term6315);
        ((ArrayList) term6310).add(term6318);
        Boolean term6383 = new Boolean(false);
        ArrayList term6409 = new ArrayList();
        ((ArrayList) term6409).add("jUbSRrkrYZ");
        ((ArrayList) term6409).add("bWWfajKbEX");
        ((ArrayList) term6409).add("cAPeiZHKGJ");
        ((ArrayList) term6409).add("LvJFtLBaxj");
        Boolean term6461 = new Boolean(true);
        Boolean term6475 = new Boolean(true);
        term6261 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term6261, term6261.getClass(), "workflowName", "uWHnvSvaPl");
        setField(term6261, term6261.getClass(), "workflowDefinitionFile", "kBdSllIBVz");
        setField(term6261, term6261.getClass(), "workflowDefinitionFileSystem", "TJmVBGfTML");
        setField(term6261, term6261.getClass(), "variableInputFile", "tPlsykYBqO");
        setField(term6261, term6261.getClass(), "variables", term6310);
        setField(term6261, term6261.getClass(), "resolveGlobalConflictByUsing", "MAcUBcBckh");
        setField(term6261, term6261.getClass(), "system", "oVgzLbrsFr");
        setField(term6261, term6261.getClass(), "owner", "vQVyKLdtaz");
        setField(term6261, term6261.getClass(), "workflowArchiveSAFID", "OWKQODBLzb");
        setField(term6261, term6261.getClass(), "comments", "wGmYcqUkgE");
        setField(term6261, term6261.getClass(), "assignToOwner", term6383);
        setField(term6261, term6261.getClass(), "accessType", "idgaQsnJpQ");
        setField(term6261, term6261.getClass(), "accountInfo", "VgZnGoIFwQ");
        setField(term6261, term6261.getClass(), "jobStatement", term6409);
        setField(term6261, term6261.getClass(), "deleteCompletedJobs", term6461);
        setField(term6261, term6261.getClass(), "jobsOutputDirectory", "PHvxnGHptP");
        setField(term6261, term6261.getClass(), "autoDeleteOnCompletion", term6475);
        setField(term6261, term6261.getClass(), "targetSystemuid", "TimdotUuNC");
        setField(term6261, term6261.getClass(), "targetSystempwd", "PkWMRdJcBb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowName", argTypes, term6261, args);
    }

};


