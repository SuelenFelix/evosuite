package zowe.client.sdk.zosmfworkflow.methods;

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
import static zowe.client.sdk.zosmfworkflow.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Boolean;

public class WorkflowCreate_createLocal_15769050433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2785;
     Object term2788;

    public WorkflowCreate_createLocal_15769050433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2785 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowCreate"));
        Object term2786 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssWrite"));
        Object term2787 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssDelete"));
        setField(term2785, term2785.getClass(), "connection", null);
        setField(term2785, term2785.getClass(), "request", null);
        setField(term2786, term2786.getClass(), "connection", null);
        setField(term2786, term2786.getClass(), "request", null);
        setField(term2785, term2785.getClass(), "ussWrite", term2786);
        setField(term2787, term2787.getClass(), "connection", null);
        setField(term2787, term2787.getClass(), "request", null);
        setField(term2785, term2785.getClass(), "ussDelete", term2787);
        Object term2839 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term2839, term2839.getClass(), "name", "");
        setField(term2839, term2839.getClass(), "value", "");
        Object term2842 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term2842, term2842.getClass(), "name", "");
        setField(term2842, term2842.getClass(), "value", "");
        Object term2845 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term2845, term2845.getClass(), "name", "");
        setField(term2845, term2845.getClass(), "value", "");
        ArrayList term2837 = new ArrayList();
        ((ArrayList) term2837).add(term2839);
        ((ArrayList) term2837).add(term2842);
        ((ArrayList) term2837).add(term2845);
        Boolean term2910 = new Boolean(false);
        ArrayList term2936 = new ArrayList();
        ((ArrayList) term2936).add("fhkbdRViHi");
        ((ArrayList) term2936).add("uWHnvSvaPl");
        ((ArrayList) term2936).add("kBdSllIBVz");
        ((ArrayList) term2936).add("TJmVBGfTML");
        Boolean term2988 = new Boolean(true);
        Boolean term3002 = new Boolean(true);
        term2788 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term2788, term2788.getClass(), "workflowName", "LvtrsXUliU");
        setField(term2788, term2788.getClass(), "workflowDefinitionFile", "xLbjWUgOIL");
        setField(term2788, term2788.getClass(), "workflowDefinitionFileSystem", "jDtqGUpnZN");
        setField(term2788, term2788.getClass(), "variableInputFile", "nGKItKLYNC");
        setField(term2788, term2788.getClass(), "variables", term2837);
        setField(term2788, term2788.getClass(), "resolveGlobalConflictByUsing", "MLqYREekMl");
        setField(term2788, term2788.getClass(), "system", "ytSBIKXogI");
        setField(term2788, term2788.getClass(), "owner", "nHXjMycHlU");
        setField(term2788, term2788.getClass(), "workflowArchiveSAFID", "ieCtQFdkii");
        setField(term2788, term2788.getClass(), "comments", "dEnhdmILtU");
        setField(term2788, term2788.getClass(), "assignToOwner", term2910);
        setField(term2788, term2788.getClass(), "accessType", "hoicvmsovO");
        setField(term2788, term2788.getClass(), "accountInfo", "eqJfYWRaEL");
        setField(term2788, term2788.getClass(), "jobStatement", term2936);
        setField(term2788, term2788.getClass(), "deleteCompletedJobs", term2988);
        setField(term2788, term2788.getClass(), "jobsOutputDirectory", "tPlsykYBqO");
        setField(term2788, term2788.getClass(), "autoDeleteOnCompletion", term3002);
        setField(term2788, term2788.getClass(), "targetSystemuid", "bLPjGVBhlX");
        setField(term2788, term2788.getClass(), "targetSystempwd", "whBvTVIIlC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowCreate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Object[] args = new Object[1];
        args[0] = term2788;
        callMethod(klass, "createLocal", argTypes, term2785, args);
    }

};


