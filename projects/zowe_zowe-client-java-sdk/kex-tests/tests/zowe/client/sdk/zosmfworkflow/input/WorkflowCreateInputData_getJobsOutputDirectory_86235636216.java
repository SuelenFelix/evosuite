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

public class WorkflowCreateInputData_getJobsOutputDirectory_86235636216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12501;

    public WorkflowCreateInputData_getJobsOutputDirectory_86235636216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term12552 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term12552, term12552.getClass(), "name", "");
        setField(term12552, term12552.getClass(), "value", "");
        Object term12555 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term12555, term12555.getClass(), "name", "");
        setField(term12555, term12555.getClass(), "value", "");
        ArrayList term12550 = new ArrayList();
        ((ArrayList) term12550).add(term12552);
        ((ArrayList) term12550).add(term12555);
        Boolean term12620 = new Boolean(false);
        ArrayList term12646 = new ArrayList();
        ((ArrayList) term12646).add("JWodNQzjjV");
        ((ArrayList) term12646).add("CAgxWjhxNf");
        ((ArrayList) term12646).add("goAoCMhKBu");
        ((ArrayList) term12646).add("BWxJSgKHRT");
        ((ArrayList) term12646).add("AGXoIndFnm");
        Boolean term12710 = new Boolean(true);
        Boolean term12724 = new Boolean(false);
        term12501 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term12501, term12501.getClass(), "workflowName", "IApvtmfhnq");
        setField(term12501, term12501.getClass(), "workflowDefinitionFile", "VSaNnhMpRc");
        setField(term12501, term12501.getClass(), "workflowDefinitionFileSystem", "QNjNTLlUaV");
        setField(term12501, term12501.getClass(), "variableInputFile", "hIYsRyOZxk");
        setField(term12501, term12501.getClass(), "variables", term12550);
        setField(term12501, term12501.getClass(), "resolveGlobalConflictByUsing", "wwAwLLcLPp");
        setField(term12501, term12501.getClass(), "system", "nHpMKOmlpQ");
        setField(term12501, term12501.getClass(), "owner", "fKhrQsJToZ");
        setField(term12501, term12501.getClass(), "workflowArchiveSAFID", "wsysQLGFnl");
        setField(term12501, term12501.getClass(), "comments", "ckQLZGFjMX");
        setField(term12501, term12501.getClass(), "assignToOwner", term12620);
        setField(term12501, term12501.getClass(), "accessType", "qphdrqUtNx");
        setField(term12501, term12501.getClass(), "accountInfo", "bwlLFAfNWx");
        setField(term12501, term12501.getClass(), "jobStatement", term12646);
        setField(term12501, term12501.getClass(), "deleteCompletedJobs", term12710);
        setField(term12501, term12501.getClass(), "jobsOutputDirectory", "mwmFMNEzkK");
        setField(term12501, term12501.getClass(), "autoDeleteOnCompletion", term12724);
        setField(term12501, term12501.getClass(), "targetSystemuid", "kVAmKknVln");
        setField(term12501, term12501.getClass(), "targetSystempwd", "MRFLbEGYKG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobsOutputDirectory", argTypes, term12501, args);
    }

};


