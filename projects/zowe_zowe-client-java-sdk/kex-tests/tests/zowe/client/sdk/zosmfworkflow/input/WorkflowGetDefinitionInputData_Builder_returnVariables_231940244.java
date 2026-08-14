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
import java.lang.Boolean;

public class WorkflowGetDefinitionInputData_Builder_returnVariables_231940244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27876;
     Object term27903;

    public WorkflowGetDefinitionInputData_Builder_returnVariables_231940244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27876 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowGetDefinitionInputData$Builder"));
        setField(term27876, term27876.getClass(), "definitionFilePath", "lqFGhtlNRM");
        setField(term27876, term27876.getClass(), "workflowDefinitionFileSystem", "GLxLHUsuLw");
        setBooleanField(term27876, term27876.getClass(), "returnSteps", true);
        setBooleanField(term27876, term27876.getClass(), "returnVariables", false);
        term27903 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowGetDefinitionInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term27903;
        callMethod(klass, "returnVariables", argTypes, term27876, args);
    }

};


