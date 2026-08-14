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

public class WorkflowGetDefinitionResponse_getProductVersion_20102444838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49867;

    public WorkflowGetDefinitionResponse_getProductVersion_20102444838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49867 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetDefinitionResponse"));
        setField(term49867, term49867.getClass(), "workflowDefaultName", null);
        setField(term49867, term49867.getClass(), "workflowDescription", null);
        setField(term49867, term49867.getClass(), "workflowID", null);
        setField(term49867, term49867.getClass(), "workflowVersion", null);
        setField(term49867, term49867.getClass(), "vendor", null);
        setField(term49867, term49867.getClass(), "workflowDefinitionFileMD5Value", null);
        setField(term49867, term49867.getClass(), "isCallable", null);
        setField(term49867, term49867.getClass(), "containsParallelSteps", null);
        setField(term49867, term49867.getClass(), "scope", null);
        setField(term49867, term49867.getClass(), "jobsOutputDirectory", null);
        setField(term49867, term49867.getClass(), "category", null);
        setField(term49867, term49867.getClass(), "productID", null);
        setField(term49867, term49867.getClass(), "productName", null);
        setField(term49867, term49867.getClass(), "productVersion", null);
        setField(term49867, term49867.getClass(), "globalVariableGroup", null);
        setField(term49867, term49867.getClass(), "isInstanceVariableWithoutPrefix", null);
        setField(term49867, term49867.getClass(), "steps", null);
        setField(term49867, term49867.getClass(), "variables", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetDefinitionResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProductVersion", argTypes, term49867, args);
    }

};


