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

public class WorkflowStartInputData_getNotificationUrl_19339508065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29005;

    public WorkflowStartInputData_getNotificationUrl_19339508065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term29042 = new Boolean(true);
        term29005 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData"));
        setField(term29005, term29005.getClass(), "workflowKey", "WRIQkTdeMl");
        setField(term29005, term29005.getClass(), "resolveConflictByUsing", "rLSEheWsHd");
        setField(term29005, term29005.getClass(), "stepName", "DoUKDhlGCY");
        setField(term29005, term29005.getClass(), "performSubsequent", term29042);
        setField(term29005, term29005.getClass(), "notificationUrl", "IeoToWsQWU");
        setField(term29005, term29005.getClass(), "targetSystemuid", "QxiiHtQAzN");
        setField(term29005, term29005.getClass(), "targetSystempwd", "gQgTBlRIvX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNotificationUrl", argTypes, term29005, args);
    }

};


