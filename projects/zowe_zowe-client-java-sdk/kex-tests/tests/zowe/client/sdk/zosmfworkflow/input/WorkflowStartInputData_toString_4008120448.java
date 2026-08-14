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

public class WorkflowStartInputData_toString_4008120448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29410;

    public WorkflowStartInputData_toString_4008120448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term29447 = new Boolean(true);
        term29410 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData"));
        setField(term29410, term29410.getClass(), "workflowKey", "NYSBqIpNlD");
        setField(term29410, term29410.getClass(), "resolveConflictByUsing", "OWglDUWQYb");
        setField(term29410, term29410.getClass(), "stepName", "FiqETbKjpv");
        setField(term29410, term29410.getClass(), "performSubsequent", term29447);
        setField(term29410, term29410.getClass(), "notificationUrl", "FxXtdhhXyS");
        setField(term29410, term29410.getClass(), "targetSystemuid", "HxCEzaCcgj");
        setField(term29410, term29410.getClass(), "targetSystempwd", "PDYPOQncAB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term29410, args);
    }

};


