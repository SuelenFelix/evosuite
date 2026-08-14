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

public class WorkflowCreateInputData_Builder_targetSystempwd_180955618519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22904;

    public WorkflowCreateInputData_Builder_targetSystempwd_180955618519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22955 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term22955, term22955.getClass(), "name", "");
        setField(term22955, term22955.getClass(), "value", "");
        ArrayList term22953 = new ArrayList();
        ((ArrayList) term22953).add(term22955);
        Boolean term23020 = new Boolean(false);
        ArrayList term23046 = new ArrayList();
        ((ArrayList) term23046).add("NNkIIFpxiB");
        ((ArrayList) term23046).add("sBmtvFPDso");
        ((ArrayList) term23046).add("qsUIxrLolr");
        ((ArrayList) term23046).add("IlQxArYcgB");
        ((ArrayList) term23046).add("lIgKCvCuoH");
        ((ArrayList) term23046).add("dHuWgRwLOm");
        Boolean term23122 = new Boolean(false);
        Boolean term23136 = new Boolean(false);
        term22904 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder"));
        setField(term22904, term22904.getClass(), "workflowName", "PrHWfHydsG");
        setField(term22904, term22904.getClass(), "workflowDefinitionFile", "igruEzTbBE");
        setField(term22904, term22904.getClass(), "workflowDefinitionFileSystem", "LFjgROsRUV");
        setField(term22904, term22904.getClass(), "variableInputFile", "kHxujKiCsr");
        setField(term22904, term22904.getClass(), "variables", term22953);
        setField(term22904, term22904.getClass(), "resolveGlobalConflictByUsing", "HyFLOXeoDX");
        setField(term22904, term22904.getClass(), "system", "crkNabVaWs");
        setField(term22904, term22904.getClass(), "owner", "qBcAJgrABE");
        setField(term22904, term22904.getClass(), "workflowArchiveSAFID", "JKdZuLFRwC");
        setField(term22904, term22904.getClass(), "comments", "hfhLLoWnRU");
        setField(term22904, term22904.getClass(), "assignToOwner", term23020);
        setField(term22904, term22904.getClass(), "accessType", "RpofnOPYha");
        setField(term22904, term22904.getClass(), "accountInfo", "CQYmAsjvPU");
        setField(term22904, term22904.getClass(), "jobStatement", term23046);
        setField(term22904, term22904.getClass(), "deleteCompletedJobs", term23122);
        setField(term22904, term22904.getClass(), "jobsOutputDirectory", "PsTQDxNIld");
        setField(term22904, term22904.getClass(), "autoDeleteOnCompletion", term23136);
        setField(term22904, term22904.getClass(), "targetSystemuid", "uoBijJjvaj");
        setField(term22904, term22904.getClass(), "targetSystempwd", "BdsLFSRWda");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tMhhBYonAI";
        callMethod(klass, "targetSystempwd", argTypes, term22904, args);
    }

};


