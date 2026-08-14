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

public class WorkflowCreateInputData_getVariableInputFile_21053532064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7600;

    public WorkflowCreateInputData_getVariableInputFile_21053532064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7651 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term7651, term7651.getClass(), "name", "");
        setField(term7651, term7651.getClass(), "value", "");
        Object term7654 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term7654, term7654.getClass(), "name", "");
        setField(term7654, term7654.getClass(), "value", "");
        Object term7657 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term7657, term7657.getClass(), "name", "");
        setField(term7657, term7657.getClass(), "value", "");
        Object term7660 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term7660, term7660.getClass(), "name", "");
        setField(term7660, term7660.getClass(), "value", "");
        Object term7663 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term7663, term7663.getClass(), "name", "");
        setField(term7663, term7663.getClass(), "value", "");
        Object term7666 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term7666, term7666.getClass(), "name", "");
        setField(term7666, term7666.getClass(), "value", "");
        Object term7669 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term7669, term7669.getClass(), "name", "");
        setField(term7669, term7669.getClass(), "value", "");
        ArrayList term7649 = new ArrayList();
        ((ArrayList) term7649).add(term7651);
        ((ArrayList) term7649).add(term7654);
        ((ArrayList) term7649).add(term7657);
        ((ArrayList) term7649).add(term7660);
        ((ArrayList) term7649).add(term7663);
        ((ArrayList) term7649).add(term7666);
        ((ArrayList) term7649).add(term7669);
        Boolean term7734 = new Boolean(false);
        ArrayList term7760 = new ArrayList();
        ((ArrayList) term7760).add("VeDtgDzGAN");
        Boolean term7776 = new Boolean(true);
        Boolean term7790 = new Boolean(false);
        term7600 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term7600, term7600.getClass(), "workflowName", "fWKJoSoCwE");
        setField(term7600, term7600.getClass(), "workflowDefinitionFile", "wfaXBpWAUH");
        setField(term7600, term7600.getClass(), "workflowDefinitionFileSystem", "VMeAzAHwZj");
        setField(term7600, term7600.getClass(), "variableInputFile", "PznxWXsZME");
        setField(term7600, term7600.getClass(), "variables", term7649);
        setField(term7600, term7600.getClass(), "resolveGlobalConflictByUsing", "VYkqXKVlAJ");
        setField(term7600, term7600.getClass(), "system", "XkIoWJRNwN");
        setField(term7600, term7600.getClass(), "owner", "aNWLJdrZMq");
        setField(term7600, term7600.getClass(), "workflowArchiveSAFID", "HHmNoYxIGj");
        setField(term7600, term7600.getClass(), "comments", "PtirvZmsGt");
        setField(term7600, term7600.getClass(), "assignToOwner", term7734);
        setField(term7600, term7600.getClass(), "accessType", "HWkpTmtlrc");
        setField(term7600, term7600.getClass(), "accountInfo", "hMmaoREuCK");
        setField(term7600, term7600.getClass(), "jobStatement", term7760);
        setField(term7600, term7600.getClass(), "deleteCompletedJobs", term7776);
        setField(term7600, term7600.getClass(), "jobsOutputDirectory", "aWYOWZFyaX");
        setField(term7600, term7600.getClass(), "autoDeleteOnCompletion", term7790);
        setField(term7600, term7600.getClass(), "targetSystemuid", "BRIVNtfUWU");
        setField(term7600, term7600.getClass(), "targetSystempwd", "DbiCVtPPCT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVariableInputFile", argTypes, term7600, args);
    }

};


