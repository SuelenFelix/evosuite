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

public class WorkflowCreateInputData_Builder_workflowArchiveSAFID_2810559169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18676;

    public WorkflowCreateInputData_Builder_workflowArchiveSAFID_2810559169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18727 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term18727, term18727.getClass(), "name", "");
        setField(term18727, term18727.getClass(), "value", "");
        Object term18730 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term18730, term18730.getClass(), "name", "");
        setField(term18730, term18730.getClass(), "value", "");
        Object term18733 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term18733, term18733.getClass(), "name", "");
        setField(term18733, term18733.getClass(), "value", "");
        Object term18736 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term18736, term18736.getClass(), "name", "");
        setField(term18736, term18736.getClass(), "value", "");
        Object term18739 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term18739, term18739.getClass(), "name", "");
        setField(term18739, term18739.getClass(), "value", "");
        Object term18742 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term18742, term18742.getClass(), "name", "");
        setField(term18742, term18742.getClass(), "value", "");
        Object term18745 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term18745, term18745.getClass(), "name", "");
        setField(term18745, term18745.getClass(), "value", "");
        ArrayList term18725 = new ArrayList();
        ((ArrayList) term18725).add(term18727);
        ((ArrayList) term18725).add(term18730);
        ((ArrayList) term18725).add(term18733);
        ((ArrayList) term18725).add(term18736);
        ((ArrayList) term18725).add(term18739);
        ((ArrayList) term18725).add(term18742);
        ((ArrayList) term18725).add(term18745);
        Boolean term18810 = new Boolean(true);
        ArrayList term18836 = new ArrayList();
        ((ArrayList) term18836).add("HegRNsidFg");
        ((ArrayList) term18836).add("udRdJkgXmH");
        ((ArrayList) term18836).add("FBCXbjHVXO");
        ((ArrayList) term18836).add("dIWAnvmLiC");
        Boolean term18888 = new Boolean(true);
        Boolean term18902 = new Boolean(true);
        term18676 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder"));
        setField(term18676, term18676.getClass(), "workflowName", "TLxQzxvizR");
        setField(term18676, term18676.getClass(), "workflowDefinitionFile", "uUgJfKAzDM");
        setField(term18676, term18676.getClass(), "workflowDefinitionFileSystem", "gZPZNkweEp");
        setField(term18676, term18676.getClass(), "variableInputFile", "vfennwtmqe");
        setField(term18676, term18676.getClass(), "variables", term18725);
        setField(term18676, term18676.getClass(), "resolveGlobalConflictByUsing", "OxNXeKMDje");
        setField(term18676, term18676.getClass(), "system", "hGTqHomrbc");
        setField(term18676, term18676.getClass(), "owner", "NNMBrIWEBw");
        setField(term18676, term18676.getClass(), "workflowArchiveSAFID", "GrTaccOQzl");
        setField(term18676, term18676.getClass(), "comments", "uuSYOUCVHU");
        setField(term18676, term18676.getClass(), "assignToOwner", term18810);
        setField(term18676, term18676.getClass(), "accessType", "DfWwbodtVw");
        setField(term18676, term18676.getClass(), "accountInfo", "kTbFMpVWqx");
        setField(term18676, term18676.getClass(), "jobStatement", term18836);
        setField(term18676, term18676.getClass(), "deleteCompletedJobs", term18888);
        setField(term18676, term18676.getClass(), "jobsOutputDirectory", "CuWebzZQjZ");
        setField(term18676, term18676.getClass(), "autoDeleteOnCompletion", term18902);
        setField(term18676, term18676.getClass(), "targetSystemuid", "wRVaaJxKYI");
        setField(term18676, term18676.getClass(), "targetSystempwd", "yOQuJXRvOo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XmLHcnVsch";
        callMethod(klass, "workflowArchiveSAFID", argTypes, term18676, args);
    }

};


