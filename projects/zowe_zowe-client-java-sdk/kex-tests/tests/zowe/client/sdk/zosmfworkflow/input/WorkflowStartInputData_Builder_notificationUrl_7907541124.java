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

public class WorkflowStartInputData_Builder_notificationUrl_7907541124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25748;

    public WorkflowStartInputData_Builder_notificationUrl_7907541124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25872 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.ConflictStartType");
        Field term25871 = ((Class) term25872).getDeclaredField((String) "OUTPUT_FILE_VALUE");
        ((Field) term25871).setAccessible(true);
        Object enum19 = ((Field) term25871).get((Object) null);
        Boolean term25811 = new Boolean(true);
        term25748 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData$Builder"));
        setField(term25748, term25748.getClass(), "workflowKey", "IyukykAHLQ");
        setField(term25748, term25748.getClass(), "resolveConflictByUsing", enum19);
        setField(term25748, term25748.getClass(), "stepName", "CwZcgFJqMh");
        setField(term25748, term25748.getClass(), "performSubsequent", term25811);
        setField(term25748, term25748.getClass(), "notificationUrl", "RldCZqgRbO");
        setField(term25748, term25748.getClass(), "targetSystemuid", "LOVugCAgJs");
        setField(term25748, term25748.getClass(), "targetSystempwd", "SNmHXwCiFY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HZfkWoqyUW";
        callMethod(klass, "notificationUrl", argTypes, term25748, args);
    }

};


