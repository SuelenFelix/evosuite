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

public class WorkflowGetPropertiesInputData_Builder_workflowKey_10267092521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5693;

    public WorkflowGetPropertiesInputData_Builder_workflowKey_10267092521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5693 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowGetPropertiesInputData$Builder"));
        setField(term5693, term5693.getClass(), "workflowKey", "AijpHYOFuy");
        setBooleanField(term5693, term5693.getClass(), "returnSteps", false);
        setBooleanField(term5693, term5693.getClass(), "returnVariables", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowGetPropertiesInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SbAoxhfrkn";
        callMethod(klass, "workflowKey", argTypes, term5693, args);
    }

};


