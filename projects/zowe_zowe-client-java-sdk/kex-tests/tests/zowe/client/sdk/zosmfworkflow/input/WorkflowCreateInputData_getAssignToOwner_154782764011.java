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

public class WorkflowCreateInputData_getAssignToOwner_154782764011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10350;

    public WorkflowCreateInputData_getAssignToOwner_154782764011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10401 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term10401, term10401.getClass(), "name", "");
        setField(term10401, term10401.getClass(), "value", "");
        Object term10404 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term10404, term10404.getClass(), "name", "");
        setField(term10404, term10404.getClass(), "value", "");
        Object term10407 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term10407, term10407.getClass(), "name", "");
        setField(term10407, term10407.getClass(), "value", "");
        Object term10410 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term10410, term10410.getClass(), "name", "");
        setField(term10410, term10410.getClass(), "value", "");
        Object term10413 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term10413, term10413.getClass(), "name", "");
        setField(term10413, term10413.getClass(), "value", "");
        Object term10416 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term10416, term10416.getClass(), "name", "");
        setField(term10416, term10416.getClass(), "value", "");
        Object term10419 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term10419, term10419.getClass(), "name", "");
        setField(term10419, term10419.getClass(), "value", "");
        Object term10422 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term10422, term10422.getClass(), "name", "");
        setField(term10422, term10422.getClass(), "value", "");
        Object term10425 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term10425, term10425.getClass(), "name", "");
        setField(term10425, term10425.getClass(), "value", "");
        ArrayList term10399 = new ArrayList();
        ((ArrayList) term10399).add(term10401);
        ((ArrayList) term10399).add(term10404);
        ((ArrayList) term10399).add(term10407);
        ((ArrayList) term10399).add(term10410);
        ((ArrayList) term10399).add(term10413);
        ((ArrayList) term10399).add(term10416);
        ((ArrayList) term10399).add(term10419);
        ((ArrayList) term10399).add(term10422);
        ((ArrayList) term10399).add(term10425);
        Boolean term10490 = new Boolean(true);
        ArrayList term10516 = new ArrayList();
        ((ArrayList) term10516).add("aanyiAOJCl");
        ((ArrayList) term10516).add("VDokbsCuqq");
        ((ArrayList) term10516).add("xClUIcPECX");
        Boolean term10556 = new Boolean(false);
        Boolean term10570 = new Boolean(true);
        term10350 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term10350, term10350.getClass(), "workflowName", "GEJABPlHSI");
        setField(term10350, term10350.getClass(), "workflowDefinitionFile", "aQFUvuaYxd");
        setField(term10350, term10350.getClass(), "workflowDefinitionFileSystem", "zNFLXMifnS");
        setField(term10350, term10350.getClass(), "variableInputFile", "HHQcYMSBVc");
        setField(term10350, term10350.getClass(), "variables", term10399);
        setField(term10350, term10350.getClass(), "resolveGlobalConflictByUsing", "GPSEWEDSTo");
        setField(term10350, term10350.getClass(), "system", "RCOqfVsRHt");
        setField(term10350, term10350.getClass(), "owner", "TSyCeEZPaT");
        setField(term10350, term10350.getClass(), "workflowArchiveSAFID", "JeZFtaqkzW");
        setField(term10350, term10350.getClass(), "comments", "vOVuNSCCLe");
        setField(term10350, term10350.getClass(), "assignToOwner", term10490);
        setField(term10350, term10350.getClass(), "accessType", "fzeqPnzpnt");
        setField(term10350, term10350.getClass(), "accountInfo", "RxbhrFBjkO");
        setField(term10350, term10350.getClass(), "jobStatement", term10516);
        setField(term10350, term10350.getClass(), "deleteCompletedJobs", term10556);
        setField(term10350, term10350.getClass(), "jobsOutputDirectory", "avhRaGZaBF");
        setField(term10350, term10350.getClass(), "autoDeleteOnCompletion", term10570);
        setField(term10350, term10350.getClass(), "targetSystemuid", "JkgoRtImdE");
        setField(term10350, term10350.getClass(), "targetSystempwd", "qFGKIJjlmV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAssignToOwner", argTypes, term10350, args);
    }

};


