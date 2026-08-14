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

public class WorkflowGetPropertiesInputData_isReturnVariables_3343922959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39056;

    public WorkflowGetPropertiesInputData_isReturnVariables_3343922959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39056 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowGetPropertiesInputData"));
        setField(term39056, term39056.getClass(), "workflowKey", null);
        setBooleanField(term39056, term39056.getClass(), "returnSteps", false);
        setBooleanField(term39056, term39056.getClass(), "returnVariables", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowGetPropertiesInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isReturnVariables", argTypes, term39056, args);
    }

};


