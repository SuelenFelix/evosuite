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

public class WorkflowGetDefinitionInputData_getDefinitionFilePath_2330980048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39347;

    public WorkflowGetDefinitionInputData_getDefinitionFilePath_2330980048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39347 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowGetDefinitionInputData"));
        setField(term39347, term39347.getClass(), "definitionFilePath", null);
        setField(term39347, term39347.getClass(), "workflowDefinitionFileSystem", null);
        setBooleanField(term39347, term39347.getClass(), "returnSteps", false);
        setBooleanField(term39347, term39347.getClass(), "returnVariables", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowGetDefinitionInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefinitionFilePath", argTypes, term39347, args);
    }

};


