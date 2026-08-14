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

public class WorkflowCreateInputData_getWorkflowDefinitionFileSystem_2970514013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7139;

    public WorkflowCreateInputData_getWorkflowDefinitionFileSystem_2970514013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7190 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term7190, term7190.getClass(), "name", "");
        setField(term7190, term7190.getClass(), "value", "");
        Object term7193 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term7193, term7193.getClass(), "name", "");
        setField(term7193, term7193.getClass(), "value", "");
        ArrayList term7188 = new ArrayList();
        ((ArrayList) term7188).add(term7190);
        ((ArrayList) term7188).add(term7193);
        Boolean term7258 = new Boolean(true);
        ArrayList term7284 = new ArrayList();
        ((ArrayList) term7284).add("JDaAnsVTGV");
        ((ArrayList) term7284).add("mLUZFTfjle");
        ((ArrayList) term7284).add("xIeFjkHkOe");
        ((ArrayList) term7284).add("SdCKLMIYnX");
        ((ArrayList) term7284).add("OJJtVNPyKZ");
        ((ArrayList) term7284).add("AKNapTAfmD");
        Boolean term7360 = new Boolean(false);
        Boolean term7374 = new Boolean(true);
        term7139 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term7139, term7139.getClass(), "workflowName", "SJiQaLvSKv");
        setField(term7139, term7139.getClass(), "workflowDefinitionFile", "OEXDRUKcFl");
        setField(term7139, term7139.getClass(), "workflowDefinitionFileSystem", "RYdKCNNMBR");
        setField(term7139, term7139.getClass(), "variableInputFile", "yGtHPyvYiQ");
        setField(term7139, term7139.getClass(), "variables", term7188);
        setField(term7139, term7139.getClass(), "resolveGlobalConflictByUsing", "mXGCWJDOqA");
        setField(term7139, term7139.getClass(), "system", "dpNsDgfPso");
        setField(term7139, term7139.getClass(), "owner", "hCWPJQKpdc");
        setField(term7139, term7139.getClass(), "workflowArchiveSAFID", "WzMEhMXkKx");
        setField(term7139, term7139.getClass(), "comments", "XOiDvlDhdc");
        setField(term7139, term7139.getClass(), "assignToOwner", term7258);
        setField(term7139, term7139.getClass(), "accessType", "AdxvLJhNLe");
        setField(term7139, term7139.getClass(), "accountInfo", "lHfTrWKMPk");
        setField(term7139, term7139.getClass(), "jobStatement", term7284);
        setField(term7139, term7139.getClass(), "deleteCompletedJobs", term7360);
        setField(term7139, term7139.getClass(), "jobsOutputDirectory", "xJgPlLxpgC");
        setField(term7139, term7139.getClass(), "autoDeleteOnCompletion", term7374);
        setField(term7139, term7139.getClass(), "targetSystemuid", "EYtfuJaxiM");
        setField(term7139, term7139.getClass(), "targetSystempwd", "gCWtLVKVVe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowDefinitionFileSystem", argTypes, term7139, args);
    }

};


