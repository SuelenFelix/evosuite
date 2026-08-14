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

public class WorkflowListInputData_getWorkflowName_1122313731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33982;

    public WorkflowListInputData_getWorkflowName_1122313731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34124 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.CategoryType");
        Field term34123 = ((Class) term34124).getDeclaredField((String) "CONFIGURATION");
        ((Field) term34123).setAccessible(true);
        Object enum40 = ((Field) term34123).get((Object) null);
        Class<? extends Object> term34420 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.StatusNameType");
        Field term34419 = ((Class) term34420).getDeclaredField((String) "AUTOMATION_IN_PROGRESS");
        ((Field) term34419).setAccessible(true);
        Object enum41 = ((Field) term34419).get((Object) null);
        term33982 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData"));
        setField(term33982, term33982.getClass(), "workflowName", "iVIrSxTsaM");
        setField(term33982, term33982.getClass(), "category", enum40);
        setField(term33982, term33982.getClass(), "system", "FmJNEfmYgq");
        setField(term33982, term33982.getClass(), "statusName", enum41);
        setField(term33982, term33982.getClass(), "owner", "NqQofgWsJd");
        setField(term33982, term33982.getClass(), "vendor", "ZlVRdHsBMO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowName", argTypes, term33982, args);
    }

};


