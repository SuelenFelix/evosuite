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

public class WorkflowCreateInputData_getWorkflowDefinitionFile_7131337022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6681;

    public WorkflowCreateInputData_getWorkflowDefinitionFile_7131337022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6732 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term6732, term6732.getClass(), "name", "");
        setField(term6732, term6732.getClass(), "value", "");
        ArrayList term6730 = new ArrayList();
        ((ArrayList) term6730).add(term6732);
        Boolean term6797 = new Boolean(true);
        ArrayList term6823 = new ArrayList();
        ((ArrayList) term6823).add("AWRooQKkdW");
        ((ArrayList) term6823).add("vjxIhXHxGR");
        ((ArrayList) term6823).add("QXzGXbEXMu");
        ((ArrayList) term6823).add("qxSDVejjiY");
        ((ArrayList) term6823).add("xBsXSDjXYK");
        ((ArrayList) term6823).add("sEnIVFtZuQ");
        Boolean term6899 = new Boolean(true);
        Boolean term6913 = new Boolean(false);
        term6681 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term6681, term6681.getClass(), "workflowName", "jSpAteRute");
        setField(term6681, term6681.getClass(), "workflowDefinitionFile", "swZVeJAxjt");
        setField(term6681, term6681.getClass(), "workflowDefinitionFileSystem", "xOcJIiQQDu");
        setField(term6681, term6681.getClass(), "variableInputFile", "GVizqqzXpy");
        setField(term6681, term6681.getClass(), "variables", term6730);
        setField(term6681, term6681.getClass(), "resolveGlobalConflictByUsing", "DfISiziTgG");
        setField(term6681, term6681.getClass(), "system", "XqgfKFvPSD");
        setField(term6681, term6681.getClass(), "owner", "JiVRgTZvKc");
        setField(term6681, term6681.getClass(), "workflowArchiveSAFID", "XPKmummaqg");
        setField(term6681, term6681.getClass(), "comments", "BKLfkLiZTH");
        setField(term6681, term6681.getClass(), "assignToOwner", term6797);
        setField(term6681, term6681.getClass(), "accessType", "SPpkrGcPRr");
        setField(term6681, term6681.getClass(), "accountInfo", "sEccwbJKYE");
        setField(term6681, term6681.getClass(), "jobStatement", term6823);
        setField(term6681, term6681.getClass(), "deleteCompletedJobs", term6899);
        setField(term6681, term6681.getClass(), "jobsOutputDirectory", "ZVecLZMLHF");
        setField(term6681, term6681.getClass(), "autoDeleteOnCompletion", term6913);
        setField(term6681, term6681.getClass(), "targetSystemuid", "fztQhjqwdP");
        setField(term6681, term6681.getClass(), "targetSystempwd", "eVpkWxjuki");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowDefinitionFile", argTypes, term6681, args);
    }

};


