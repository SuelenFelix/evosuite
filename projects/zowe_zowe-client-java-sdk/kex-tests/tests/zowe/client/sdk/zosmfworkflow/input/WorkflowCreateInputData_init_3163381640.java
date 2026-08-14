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

public class WorkflowCreateInputData_init_3163381640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5835;

    public WorkflowCreateInputData_init_3163381640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5886 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term5886, term5886.getClass(), "name", "");
        setField(term5886, term5886.getClass(), "value", "");
        Object term5889 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term5889, term5889.getClass(), "name", "");
        setField(term5889, term5889.getClass(), "value", "");
        Object term5892 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term5892, term5892.getClass(), "name", "");
        setField(term5892, term5892.getClass(), "value", "");
        Object term5895 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term5895, term5895.getClass(), "name", "");
        setField(term5895, term5895.getClass(), "value", "");
        Object term5898 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term5898, term5898.getClass(), "name", "");
        setField(term5898, term5898.getClass(), "value", "");
        ArrayList term5884 = new ArrayList();
        ((ArrayList) term5884).add(term5886);
        ((ArrayList) term5884).add(term5889);
        ((ArrayList) term5884).add(term5892);
        ((ArrayList) term5884).add(term5895);
        ((ArrayList) term5884).add(term5898);
        Boolean term5963 = new Boolean(false);
        ArrayList term5989 = new ArrayList();
        ((ArrayList) term5989).add("ytSBIKXogI");
        ((ArrayList) term5989).add("nHXjMycHlU");
        ((ArrayList) term5989).add("ieCtQFdkii");
        ((ArrayList) term5989).add("dEnhdmILtU");
        Boolean term6041 = new Boolean(false);
        Boolean term6055 = new Boolean(false);
        term5835 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder"));
        setField(term5835, term5835.getClass(), "workflowName", "IDCWpPLRkE");
        setField(term5835, term5835.getClass(), "workflowDefinitionFile", "nyiiPDVjAc");
        setField(term5835, term5835.getClass(), "workflowDefinitionFileSystem", "aKnKipADSo");
        setField(term5835, term5835.getClass(), "variableInputFile", "wSQxaModmm");
        setField(term5835, term5835.getClass(), "variables", term5884);
        setField(term5835, term5835.getClass(), "resolveGlobalConflictByUsing", "UiUYnPrcCi");
        setField(term5835, term5835.getClass(), "system", "UoYtihxVaS");
        setField(term5835, term5835.getClass(), "owner", "JDswTTCZHV");
        setField(term5835, term5835.getClass(), "workflowArchiveSAFID", "onpbIeEKoi");
        setField(term5835, term5835.getClass(), "comments", "YRHGsAkhxb");
        setField(term5835, term5835.getClass(), "assignToOwner", term5963);
        setField(term5835, term5835.getClass(), "accessType", "ffYhPOzlUs");
        setField(term5835, term5835.getClass(), "accountInfo", "MLqYREekMl");
        setField(term5835, term5835.getClass(), "jobStatement", term5989);
        setField(term5835, term5835.getClass(), "deleteCompletedJobs", term6041);
        setField(term5835, term5835.getClass(), "jobsOutputDirectory", "hoicvmsovO");
        setField(term5835, term5835.getClass(), "autoDeleteOnCompletion", term6055);
        setField(term5835, term5835.getClass(), "targetSystemuid", "eqJfYWRaEL");
        setField(term5835, term5835.getClass(), "targetSystempwd", "fhkbdRViHi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term5835;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


