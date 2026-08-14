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

public class WorkflowGetDefinitionInputData_isReturnSteps_176733202310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39353;

    public WorkflowGetDefinitionInputData_isReturnSteps_176733202310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39353 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowGetDefinitionInputData"));
        setField(term39353, term39353.getClass(), "definitionFilePath", null);
        setField(term39353, term39353.getClass(), "workflowDefinitionFileSystem", null);
        setBooleanField(term39353, term39353.getClass(), "returnSteps", false);
        setBooleanField(term39353, term39353.getClass(), "returnVariables", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowGetDefinitionInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isReturnSteps", argTypes, term39353, args);
    }

};


