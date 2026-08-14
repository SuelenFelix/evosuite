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

public class WorkflowListInputData_Builder_system_11222620593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1572;

    public WorkflowListInputData_Builder_system_11222620593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1686 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.CategoryType");
        Field term1685 = ((Class) term1686).getDeclaredField((String) "GENERAL");
        ((Field) term1685).setAccessible(true);
        Object enum4 = ((Field) term1685).get((Object) null);
        Class<? extends Object> term1964 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.StatusNameType");
        Field term1963 = ((Class) term1964).getDeclaredField((String) "COMPLETE");
        ((Field) term1963).setAccessible(true);
        Object enum5 = ((Field) term1963).get((Object) null);
        term1572 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData$Builder"));
        setField(term1572, term1572.getClass(), "workflowName", "RMFIsYGgne");
        setField(term1572, term1572.getClass(), "category", enum4);
        setField(term1572, term1572.getClass(), "system", "NRdvgJlhkX");
        setField(term1572, term1572.getClass(), "statusName", enum5);
        setField(term1572, term1572.getClass(), "owner", "uuaPigETmJ");
        setField(term1572, term1572.getClass(), "vendor", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LQFpaHEwXR";
        callMethod(klass, "system", argTypes, term1572, args);
    }

};


