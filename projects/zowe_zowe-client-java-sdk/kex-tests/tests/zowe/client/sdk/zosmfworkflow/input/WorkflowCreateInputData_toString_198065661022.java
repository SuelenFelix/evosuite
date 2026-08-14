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

public class WorkflowCreateInputData_toString_198065661022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14774;

    public WorkflowCreateInputData_toString_198065661022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14825 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term14825, term14825.getClass(), "name", "");
        setField(term14825, term14825.getClass(), "value", "");
        Object term14828 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term14828, term14828.getClass(), "name", "");
        setField(term14828, term14828.getClass(), "value", "");
        Object term14831 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term14831, term14831.getClass(), "name", "");
        setField(term14831, term14831.getClass(), "value", "");
        Object term14834 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term14834, term14834.getClass(), "name", "");
        setField(term14834, term14834.getClass(), "value", "");
        Object term14837 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term14837, term14837.getClass(), "name", "");
        setField(term14837, term14837.getClass(), "value", "");
        Object term14840 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term14840, term14840.getClass(), "name", "");
        setField(term14840, term14840.getClass(), "value", "");
        ArrayList term14823 = new ArrayList();
        ((ArrayList) term14823).add(term14825);
        ((ArrayList) term14823).add(term14828);
        ((ArrayList) term14823).add(term14831);
        ((ArrayList) term14823).add(term14834);
        ((ArrayList) term14823).add(term14837);
        ((ArrayList) term14823).add(term14840);
        Boolean term14905 = new Boolean(true);
        ArrayList term14931 = new ArrayList();
        ((ArrayList) term14931).add("pdSvedKgPq");
        ((ArrayList) term14931).add("epPTwvcoyb");
        Boolean term14959 = new Boolean(false);
        Boolean term14973 = new Boolean(false);
        term14774 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term14774, term14774.getClass(), "workflowName", "ZbHJVEqcoa");
        setField(term14774, term14774.getClass(), "workflowDefinitionFile", "awDQVEVIKi");
        setField(term14774, term14774.getClass(), "workflowDefinitionFileSystem", "HJwNgUzZZR");
        setField(term14774, term14774.getClass(), "variableInputFile", "FvUCZgTXhq");
        setField(term14774, term14774.getClass(), "variables", term14823);
        setField(term14774, term14774.getClass(), "resolveGlobalConflictByUsing", "GSzQdbHLHw");
        setField(term14774, term14774.getClass(), "system", "IkfarsYNJO");
        setField(term14774, term14774.getClass(), "owner", "aZKOWhHMEh");
        setField(term14774, term14774.getClass(), "workflowArchiveSAFID", "YfkhviKZwl");
        setField(term14774, term14774.getClass(), "comments", "DcOhhAfJTI");
        setField(term14774, term14774.getClass(), "assignToOwner", term14905);
        setField(term14774, term14774.getClass(), "accessType", "gYTIkBFOoS");
        setField(term14774, term14774.getClass(), "accountInfo", "xmzSoVgiED");
        setField(term14774, term14774.getClass(), "jobStatement", term14931);
        setField(term14774, term14774.getClass(), "deleteCompletedJobs", term14959);
        setField(term14774, term14774.getClass(), "jobsOutputDirectory", "UBPHmOICBs");
        setField(term14774, term14774.getClass(), "autoDeleteOnCompletion", term14973);
        setField(term14774, term14774.getClass(), "targetSystemuid", "IDJUVPgUJf");
        setField(term14774, term14774.getClass(), "targetSystempwd", "JmnWRJUxGr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term14774, args);
    }

};


