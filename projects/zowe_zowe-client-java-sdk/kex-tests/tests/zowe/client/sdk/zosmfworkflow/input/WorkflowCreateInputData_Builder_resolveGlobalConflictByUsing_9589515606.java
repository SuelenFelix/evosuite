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

public class WorkflowCreateInputData_Builder_resolveGlobalConflictByUsing_9589515606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17565;

    public WorkflowCreateInputData_Builder_resolveGlobalConflictByUsing_9589515606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17616 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term17616, term17616.getClass(), "name", "");
        setField(term17616, term17616.getClass(), "value", "");
        Object term17619 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term17619, term17619.getClass(), "name", "");
        setField(term17619, term17619.getClass(), "value", "");
        Object term17622 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term17622, term17622.getClass(), "name", "");
        setField(term17622, term17622.getClass(), "value", "");
        Object term17625 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term17625, term17625.getClass(), "name", "");
        setField(term17625, term17625.getClass(), "value", "");
        Object term17628 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term17628, term17628.getClass(), "name", "");
        setField(term17628, term17628.getClass(), "value", "");
        ArrayList term17614 = new ArrayList();
        ((ArrayList) term17614).add(term17616);
        ((ArrayList) term17614).add(term17619);
        ((ArrayList) term17614).add(term17622);
        ((ArrayList) term17614).add(term17625);
        ((ArrayList) term17614).add(term17628);
        Boolean term17693 = new Boolean(false);
        ArrayList term17719 = new ArrayList();
        ((ArrayList) term17719).add("SQZVNkAVBB");
        Boolean term17735 = new Boolean(true);
        Boolean term17749 = new Boolean(false);
        term17565 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder"));
        setField(term17565, term17565.getClass(), "workflowName", "DddqUYfomL");
        setField(term17565, term17565.getClass(), "workflowDefinitionFile", "YQwoogpPyi");
        setField(term17565, term17565.getClass(), "workflowDefinitionFileSystem", "rnPhHoorxj");
        setField(term17565, term17565.getClass(), "variableInputFile", "GuwJLKquuI");
        setField(term17565, term17565.getClass(), "variables", term17614);
        setField(term17565, term17565.getClass(), "resolveGlobalConflictByUsing", "cDOXXottZh");
        setField(term17565, term17565.getClass(), "system", "rfqJDkDppz");
        setField(term17565, term17565.getClass(), "owner", "MGorMVGauT");
        setField(term17565, term17565.getClass(), "workflowArchiveSAFID", "jXKxUGTuEF");
        setField(term17565, term17565.getClass(), "comments", "nDCcyhiTnS");
        setField(term17565, term17565.getClass(), "assignToOwner", term17693);
        setField(term17565, term17565.getClass(), "accessType", "Bcivwcjece");
        setField(term17565, term17565.getClass(), "accountInfo", "QTefjRuiez");
        setField(term17565, term17565.getClass(), "jobStatement", term17719);
        setField(term17565, term17565.getClass(), "deleteCompletedJobs", term17735);
        setField(term17565, term17565.getClass(), "jobsOutputDirectory", "mrSAYJlddZ");
        setField(term17565, term17565.getClass(), "autoDeleteOnCompletion", term17749);
        setField(term17565, term17565.getClass(), "targetSystemuid", "KbwxawvYsw");
        setField(term17565, term17565.getClass(), "targetSystempwd", "gvjdfHNzOa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HqitWglYWX";
        callMethod(klass, "resolveGlobalConflictByUsing", argTypes, term17565, args);
    }

};


