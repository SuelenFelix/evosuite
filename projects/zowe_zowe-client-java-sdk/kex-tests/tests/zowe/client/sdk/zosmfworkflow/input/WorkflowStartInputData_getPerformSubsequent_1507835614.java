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

public class WorkflowStartInputData_getPerformSubsequent_1507835614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28870;

    public WorkflowStartInputData_getPerformSubsequent_1507835614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term28907 = new Boolean(false);
        term28870 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData"));
        setField(term28870, term28870.getClass(), "workflowKey", "KnnoLMOuur");
        setField(term28870, term28870.getClass(), "resolveConflictByUsing", "buRpVghIvt");
        setField(term28870, term28870.getClass(), "stepName", "oTGxFdiaIW");
        setField(term28870, term28870.getClass(), "performSubsequent", term28907);
        setField(term28870, term28870.getClass(), "notificationUrl", "jlyFvaZlmv");
        setField(term28870, term28870.getClass(), "targetSystemuid", "sofyLEfomV");
        setField(term28870, term28870.getClass(), "targetSystempwd", "zHcDSJHKAb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPerformSubsequent", argTypes, term28870, args);
    }

};


