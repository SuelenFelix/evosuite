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

public class WorkflowCreateInputData_getJobStatement_66973979914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11640;

    public WorkflowCreateInputData_getJobStatement_66973979914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11691 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term11691, term11691.getClass(), "name", "");
        setField(term11691, term11691.getClass(), "value", "");
        Object term11694 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term11694, term11694.getClass(), "name", "");
        setField(term11694, term11694.getClass(), "value", "");
        Object term11697 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term11697, term11697.getClass(), "name", "");
        setField(term11697, term11697.getClass(), "value", "");
        Object term11700 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term11700, term11700.getClass(), "name", "");
        setField(term11700, term11700.getClass(), "value", "");
        Object term11703 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term11703, term11703.getClass(), "name", "");
        setField(term11703, term11703.getClass(), "value", "");
        Object term11706 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term11706, term11706.getClass(), "name", "");
        setField(term11706, term11706.getClass(), "value", "");
        Object term11709 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term11709, term11709.getClass(), "name", "");
        setField(term11709, term11709.getClass(), "value", "");
        ArrayList term11689 = new ArrayList();
        ((ArrayList) term11689).add(term11691);
        ((ArrayList) term11689).add(term11694);
        ((ArrayList) term11689).add(term11697);
        ((ArrayList) term11689).add(term11700);
        ((ArrayList) term11689).add(term11703);
        ((ArrayList) term11689).add(term11706);
        ((ArrayList) term11689).add(term11709);
        Boolean term11774 = new Boolean(true);
        ArrayList term11800 = new ArrayList();
        ((ArrayList) term11800).add("dwlZSxlXOo");
        ((ArrayList) term11800).add("lKrEAkypza");
        Boolean term11828 = new Boolean(true);
        Boolean term11842 = new Boolean(false);
        term11640 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term11640, term11640.getClass(), "workflowName", "vSeruUyNWX");
        setField(term11640, term11640.getClass(), "workflowDefinitionFile", "UkKvaeJfEC");
        setField(term11640, term11640.getClass(), "workflowDefinitionFileSystem", "WPxXsahPRq");
        setField(term11640, term11640.getClass(), "variableInputFile", "IENRuqmwUU");
        setField(term11640, term11640.getClass(), "variables", term11689);
        setField(term11640, term11640.getClass(), "resolveGlobalConflictByUsing", "qYtAeLzOhW");
        setField(term11640, term11640.getClass(), "system", "tJzmOfcUnY");
        setField(term11640, term11640.getClass(), "owner", "TKlccZUpjz");
        setField(term11640, term11640.getClass(), "workflowArchiveSAFID", "GGzwMoHZXC");
        setField(term11640, term11640.getClass(), "comments", "IpmgwHTgnG");
        setField(term11640, term11640.getClass(), "assignToOwner", term11774);
        setField(term11640, term11640.getClass(), "accessType", "tIpkeYIezR");
        setField(term11640, term11640.getClass(), "accountInfo", "YkZtEtthvz");
        setField(term11640, term11640.getClass(), "jobStatement", term11800);
        setField(term11640, term11640.getClass(), "deleteCompletedJobs", term11828);
        setField(term11640, term11640.getClass(), "jobsOutputDirectory", "KtuuNAqGCQ");
        setField(term11640, term11640.getClass(), "autoDeleteOnCompletion", term11842);
        setField(term11640, term11640.getClass(), "targetSystemuid", "OGQsfjmReM");
        setField(term11640, term11640.getClass(), "targetSystempwd", "YsUtbngnRO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobStatement", argTypes, term11640, args);
    }

};


