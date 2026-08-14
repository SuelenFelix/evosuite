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

public class WorkflowGetDefinitionInputData_Builder_workflowDefinitionFileSystem_3141195592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27758;

    public WorkflowGetDefinitionInputData_Builder_workflowDefinitionFileSystem_3141195592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27758 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowGetDefinitionInputData$Builder"));
        setField(term27758, term27758.getClass(), "definitionFilePath", "ARnOWpgtAg");
        setField(term27758, term27758.getClass(), "workflowDefinitionFileSystem", "MRrYxZoJBW");
        setBooleanField(term27758, term27758.getClass(), "returnSteps", false);
        setBooleanField(term27758, term27758.getClass(), "returnVariables", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowGetDefinitionInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fheZXFNQZh";
        callMethod(klass, "workflowDefinitionFileSystem", argTypes, term27758, args);
    }

};


