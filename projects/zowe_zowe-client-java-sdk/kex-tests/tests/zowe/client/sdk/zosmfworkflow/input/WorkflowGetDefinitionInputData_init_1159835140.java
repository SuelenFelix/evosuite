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

public class WorkflowGetDefinitionInputData_init_1159835140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39065;

    public WorkflowGetDefinitionInputData_init_1159835140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39065 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowGetDefinitionInputData$Builder"));
        setField(term39065, term39065.getClass(), "definitionFilePath", "mRDwekkZQg");
        setField(term39065, term39065.getClass(), "workflowDefinitionFileSystem", "RIGChgqpTI");
        setBooleanField(term39065, term39065.getClass(), "returnSteps", true);
        setBooleanField(term39065, term39065.getClass(), "returnVariables", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowGetDefinitionInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowGetDefinitionInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term39065;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


