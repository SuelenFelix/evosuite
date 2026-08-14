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

public class WorkflowListInputData_Builder_workflowName_3163775621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public WorkflowListInputData_Builder_workflowName_3163775621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term173 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.CategoryType");
        Field term172 = ((Class) term173).getDeclaredField((String) "GENERAL");
        ((Field) term172).setAccessible(true);
        Object enum0 = ((Field) term172).get((Object) null);
        Class<? extends Object> term573 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.StatusNameType");
        Field term572 = ((Class) term573).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term572).setAccessible(true);
        Object enum1 = ((Field) term572).get((Object) null);
        term1 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData$Builder"));
        setField(term1, term1.getClass(), "workflowName", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "category", enum0);
        setField(term1, term1.getClass(), "system", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "statusName", enum1);
        setField(term1, term1.getClass(), "owner", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "vendor", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        callMethod(klass, "workflowName", argTypes, term1, args);
    }

};


