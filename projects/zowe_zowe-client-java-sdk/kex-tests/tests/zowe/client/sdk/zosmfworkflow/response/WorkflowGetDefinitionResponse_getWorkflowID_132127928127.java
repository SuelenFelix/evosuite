package zowe.client.sdk.zosmfworkflow.response;

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
import static zowe.client.sdk.zosmfworkflow.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WorkflowGetDefinitionResponse_getWorkflowID_132127928127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49856;

    public WorkflowGetDefinitionResponse_getWorkflowID_132127928127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49856 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetDefinitionResponse"));
        setField(term49856, term49856.getClass(), "workflowDefaultName", null);
        setField(term49856, term49856.getClass(), "workflowDescription", null);
        setField(term49856, term49856.getClass(), "workflowID", null);
        setField(term49856, term49856.getClass(), "workflowVersion", null);
        setField(term49856, term49856.getClass(), "vendor", null);
        setField(term49856, term49856.getClass(), "workflowDefinitionFileMD5Value", null);
        setField(term49856, term49856.getClass(), "isCallable", null);
        setField(term49856, term49856.getClass(), "containsParallelSteps", null);
        setField(term49856, term49856.getClass(), "scope", null);
        setField(term49856, term49856.getClass(), "jobsOutputDirectory", null);
        setField(term49856, term49856.getClass(), "category", null);
        setField(term49856, term49856.getClass(), "productID", null);
        setField(term49856, term49856.getClass(), "productName", null);
        setField(term49856, term49856.getClass(), "productVersion", null);
        setField(term49856, term49856.getClass(), "globalVariableGroup", null);
        setField(term49856, term49856.getClass(), "isInstanceVariableWithoutPrefix", null);
        setField(term49856, term49856.getClass(), "steps", null);
        setField(term49856, term49856.getClass(), "variables", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetDefinitionResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowID", argTypes, term49856, args);
    }

};


