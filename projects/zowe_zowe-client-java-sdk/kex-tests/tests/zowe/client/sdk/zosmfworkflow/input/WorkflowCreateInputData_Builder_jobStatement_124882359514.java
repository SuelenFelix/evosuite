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
import java.util.LinkedList;

public class WorkflowCreateInputData_Builder_jobStatement_124882359514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20703;
     Object term20949;

    public WorkflowCreateInputData_Builder_jobStatement_124882359514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term20754 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term20754, term20754.getClass(), "name", "");
        setField(term20754, term20754.getClass(), "value", "");
        Object term20757 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term20757, term20757.getClass(), "name", "");
        setField(term20757, term20757.getClass(), "value", "");
        Object term20760 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term20760, term20760.getClass(), "name", "");
        setField(term20760, term20760.getClass(), "value", "");
        Object term20763 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term20763, term20763.getClass(), "name", "");
        setField(term20763, term20763.getClass(), "value", "");
        Object term20766 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term20766, term20766.getClass(), "name", "");
        setField(term20766, term20766.getClass(), "value", "");
        Object term20769 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term20769, term20769.getClass(), "name", "");
        setField(term20769, term20769.getClass(), "value", "");
        Object term20772 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term20772, term20772.getClass(), "name", "");
        setField(term20772, term20772.getClass(), "value", "");
        Object term20775 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term20775, term20775.getClass(), "name", "");
        setField(term20775, term20775.getClass(), "value", "");
        Object term20778 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term20778, term20778.getClass(), "name", "");
        setField(term20778, term20778.getClass(), "value", "");
        ArrayList term20752 = new ArrayList();
        ((ArrayList) term20752).add(term20754);
        ((ArrayList) term20752).add(term20757);
        ((ArrayList) term20752).add(term20760);
        ((ArrayList) term20752).add(term20763);
        ((ArrayList) term20752).add(term20766);
        ((ArrayList) term20752).add(term20769);
        ((ArrayList) term20752).add(term20772);
        ((ArrayList) term20752).add(term20775);
        ((ArrayList) term20752).add(term20778);
        Boolean term20843 = new Boolean(true);
        ArrayList term20869 = new ArrayList();
        ((ArrayList) term20869).add("RhLliqMiOF");
        ((ArrayList) term20869).add("jlhonEGrJH");
        ((ArrayList) term20869).add("RKcKwlEYZb");
        Boolean term20909 = new Boolean(false);
        Boolean term20923 = new Boolean(true);
        term20703 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder"));
        setField(term20703, term20703.getClass(), "workflowName", "ZiyMvLArWJ");
        setField(term20703, term20703.getClass(), "workflowDefinitionFile", "MaeokjEfWD");
        setField(term20703, term20703.getClass(), "workflowDefinitionFileSystem", "ocZcumnXEz");
        setField(term20703, term20703.getClass(), "variableInputFile", "rNNwyactDR");
        setField(term20703, term20703.getClass(), "variables", term20752);
        setField(term20703, term20703.getClass(), "resolveGlobalConflictByUsing", "IKfozyyKEj");
        setField(term20703, term20703.getClass(), "system", "thCjwQjRBL");
        setField(term20703, term20703.getClass(), "owner", "ojLrjltndD");
        setField(term20703, term20703.getClass(), "workflowArchiveSAFID", "VJtFSexKat");
        setField(term20703, term20703.getClass(), "comments", "xPVddlPSQR");
        setField(term20703, term20703.getClass(), "assignToOwner", term20843);
        setField(term20703, term20703.getClass(), "accessType", "MxrhCLTMTH");
        setField(term20703, term20703.getClass(), "accountInfo", "kEehLMZcOU");
        setField(term20703, term20703.getClass(), "jobStatement", term20869);
        setField(term20703, term20703.getClass(), "deleteCompletedJobs", term20909);
        setField(term20703, term20703.getClass(), "jobsOutputDirectory", "acPRDlpsid");
        setField(term20703, term20703.getClass(), "autoDeleteOnCompletion", term20923);
        setField(term20703, term20703.getClass(), "targetSystemuid", "YyojIzvxLZ");
        setField(term20703, term20703.getClass(), "targetSystempwd", "fxapaYlZea");
        term20949 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term20949;
        callMethod(klass, "jobStatement", argTypes, term20703, args);
    }

};


