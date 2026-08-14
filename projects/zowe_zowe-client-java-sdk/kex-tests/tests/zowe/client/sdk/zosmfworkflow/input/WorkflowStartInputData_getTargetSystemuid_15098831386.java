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

public class WorkflowStartInputData_getTargetSystemuid_15098831386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29140;

    public WorkflowStartInputData_getTargetSystemuid_15098831386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term29177 = new Boolean(false);
        term29140 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData"));
        setField(term29140, term29140.getClass(), "workflowKey", "ulKaKnANzj");
        setField(term29140, term29140.getClass(), "resolveConflictByUsing", "ABwhdjjeJi");
        setField(term29140, term29140.getClass(), "stepName", "KKEcpYXNZV");
        setField(term29140, term29140.getClass(), "performSubsequent", term29177);
        setField(term29140, term29140.getClass(), "notificationUrl", "shLHFznysy");
        setField(term29140, term29140.getClass(), "targetSystemuid", "YCKIloBHLj");
        setField(term29140, term29140.getClass(), "targetSystempwd", "qUWDhAeFJY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTargetSystemuid", argTypes, term29140, args);
    }

};


