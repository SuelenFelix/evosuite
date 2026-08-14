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

public class WorkflowCreateInputData_getVariables_4328604325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7966;

    public WorkflowCreateInputData_getVariables_4328604325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8017 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term8017, term8017.getClass(), "name", "");
        setField(term8017, term8017.getClass(), "value", "");
        Object term8020 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term8020, term8020.getClass(), "name", "");
        setField(term8020, term8020.getClass(), "value", "");
        Object term8023 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term8023, term8023.getClass(), "name", "");
        setField(term8023, term8023.getClass(), "value", "");
        Object term8026 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term8026, term8026.getClass(), "name", "");
        setField(term8026, term8026.getClass(), "value", "");
        Object term8029 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term8029, term8029.getClass(), "name", "");
        setField(term8029, term8029.getClass(), "value", "");
        Object term8032 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term8032, term8032.getClass(), "name", "");
        setField(term8032, term8032.getClass(), "value", "");
        ArrayList term8015 = new ArrayList();
        ((ArrayList) term8015).add(term8017);
        ((ArrayList) term8015).add(term8020);
        ((ArrayList) term8015).add(term8023);
        ((ArrayList) term8015).add(term8026);
        ((ArrayList) term8015).add(term8029);
        ((ArrayList) term8015).add(term8032);
        Boolean term8097 = new Boolean(false);
        ArrayList term8123 = new ArrayList();
        ((ArrayList) term8123).add("iljANwuEjk");
        ((ArrayList) term8123).add("kNqaJKIATy");
        ((ArrayList) term8123).add("vKQukfbJUd");
        ((ArrayList) term8123).add("lFRJFUMVbx");
        ((ArrayList) term8123).add("sZdUNdggUW");
        Boolean term8187 = new Boolean(true);
        Boolean term8201 = new Boolean(true);
        term7966 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term7966, term7966.getClass(), "workflowName", "WzFopsaDuG");
        setField(term7966, term7966.getClass(), "workflowDefinitionFile", "PapWxkhEWe");
        setField(term7966, term7966.getClass(), "workflowDefinitionFileSystem", "smnHEqRFRx");
        setField(term7966, term7966.getClass(), "variableInputFile", "XYtryyobou");
        setField(term7966, term7966.getClass(), "variables", term8015);
        setField(term7966, term7966.getClass(), "resolveGlobalConflictByUsing", "DyiXbeYIaN");
        setField(term7966, term7966.getClass(), "system", "VGizxZnyHX");
        setField(term7966, term7966.getClass(), "owner", "kVEZMHmRtR");
        setField(term7966, term7966.getClass(), "workflowArchiveSAFID", "ekxGuOYIwi");
        setField(term7966, term7966.getClass(), "comments", "RbVQXSpxXy");
        setField(term7966, term7966.getClass(), "assignToOwner", term8097);
        setField(term7966, term7966.getClass(), "accessType", "YpJbIgJWWv");
        setField(term7966, term7966.getClass(), "accountInfo", "JppkknKVOw");
        setField(term7966, term7966.getClass(), "jobStatement", term8123);
        setField(term7966, term7966.getClass(), "deleteCompletedJobs", term8187);
        setField(term7966, term7966.getClass(), "jobsOutputDirectory", "OqbwYQfvAe");
        setField(term7966, term7966.getClass(), "autoDeleteOnCompletion", term8201);
        setField(term7966, term7966.getClass(), "targetSystemuid", "tRxZafjqIx");
        setField(term7966, term7966.getClass(), "targetSystempwd", "DhjNLmRMCu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVariables", argTypes, term7966, args);
    }

};


