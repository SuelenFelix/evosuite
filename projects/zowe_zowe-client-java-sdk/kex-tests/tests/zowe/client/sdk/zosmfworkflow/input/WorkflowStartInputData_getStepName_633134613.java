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
import java.lang.Boolean;

public class WorkflowStartInputData_getStepName_633134613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28735;

    public WorkflowStartInputData_getStepName_633134613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term28772 = new Boolean(true);
        term28735 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData"));
        setField(term28735, term28735.getClass(), "workflowKey", "MFIdGVLoDo");
        setField(term28735, term28735.getClass(), "resolveConflictByUsing", "kbxgTcnXyU");
        setField(term28735, term28735.getClass(), "stepName", "lnJvDbbuwo");
        setField(term28735, term28735.getClass(), "performSubsequent", term28772);
        setField(term28735, term28735.getClass(), "notificationUrl", "KExnWkKGvF");
        setField(term28735, term28735.getClass(), "targetSystemuid", "luGUNfvmKk");
        setField(term28735, term28735.getClass(), "targetSystempwd", "oOUHomyJff");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStepName", argTypes, term28735, args);
    }

};


