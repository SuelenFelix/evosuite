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
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class WorkflowStartInputData_Builder_targetSystempwd_3624859136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26726;

    public WorkflowStartInputData_Builder_targetSystempwd_3624859136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26845 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.ConflictStartType");
        Field term26844 = ((Class) term26845).getDeclaredField((String) "LEAVE_CONFLICT");
        ((Field) term26844).setAccessible(true);
        Object enum21 = ((Field) term26844).get((Object) null);
        Boolean term26784 = new Boolean(true);
        term26726 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData$Builder"));
        setField(term26726, term26726.getClass(), "workflowKey", "vAxcpvjEEa");
        setField(term26726, term26726.getClass(), "resolveConflictByUsing", enum21);
        setField(term26726, term26726.getClass(), "stepName", "FCkOgIBqXE");
        setField(term26726, term26726.getClass(), "performSubsequent", term26784);
        setField(term26726, term26726.getClass(), "notificationUrl", "kadRHthQRD");
        setField(term26726, term26726.getClass(), "targetSystemuid", "cGbJSRSpNn");
        setField(term26726, term26726.getClass(), "targetSystempwd", "MzXzaqaiHW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jWOWtrhVkA";
        callMethod(klass, "targetSystempwd", argTypes, term26726, args);
    }

};


