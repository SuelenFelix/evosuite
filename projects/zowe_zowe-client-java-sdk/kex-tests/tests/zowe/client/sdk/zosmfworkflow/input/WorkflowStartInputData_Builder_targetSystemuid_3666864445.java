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

public class WorkflowStartInputData_Builder_targetSystemuid_3666864445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26244;

    public WorkflowStartInputData_Builder_targetSystemuid_3666864445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26363 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.ConflictStartType");
        Field term26362 = ((Class) term26363).getDeclaredField((String) "EXISTING_VALUE");
        ((Field) term26362).setAccessible(true);
        Object enum20 = ((Field) term26362).get((Object) null);
        Boolean term26302 = new Boolean(false);
        term26244 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData$Builder"));
        setField(term26244, term26244.getClass(), "workflowKey", "QRwANPSyfT");
        setField(term26244, term26244.getClass(), "resolveConflictByUsing", enum20);
        setField(term26244, term26244.getClass(), "stepName", "DbZKLwYBgy");
        setField(term26244, term26244.getClass(), "performSubsequent", term26302);
        setField(term26244, term26244.getClass(), "notificationUrl", "LnNRVsjmxw");
        setField(term26244, term26244.getClass(), "targetSystemuid", "PlOnDkNrvX");
        setField(term26244, term26244.getClass(), "targetSystempwd", "MltgFGldop");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JCWSoxnBJs";
        callMethod(klass, "targetSystemuid", argTypes, term26244, args);
    }

};


