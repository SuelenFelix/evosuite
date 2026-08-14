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

public class WorkflowStartInputData_getTargetSystempwd_15056826077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29275;

    public WorkflowStartInputData_getTargetSystempwd_15056826077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term29312 = new Boolean(false);
        term29275 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData"));
        setField(term29275, term29275.getClass(), "workflowKey", "wboNBMhRjP");
        setField(term29275, term29275.getClass(), "resolveConflictByUsing", "HZODpafOGe");
        setField(term29275, term29275.getClass(), "stepName", "dUTYEKtTfQ");
        setField(term29275, term29275.getClass(), "performSubsequent", term29312);
        setField(term29275, term29275.getClass(), "notificationUrl", "HUtbHklGel");
        setField(term29275, term29275.getClass(), "targetSystemuid", "QbfKDAwhSB");
        setField(term29275, term29275.getClass(), "targetSystempwd", "ckTRHEIcCK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTargetSystempwd", argTypes, term29275, args);
    }

};


