package zowe.client.sdk.zosmfworkflow.model;

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
import static zowe.client.sdk.zosmfworkflow.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WorkflowRestStepInfo_getActualStatusCode_199475463818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18284;

    public WorkflowRestStepInfo_getActualStatusCode_199475463818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18284 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo"));
        setField(term18284, term18284.getClass(), "actualStatusCode", null);
        setField(term18284, term18284.getClass(), "expectedStatusCode", null);
        setField(term18284, term18284.getClass(), "hostname", null);
        setField(term18284, term18284.getClass(), "hostnameSub", null);
        setField(term18284, term18284.getClass(), "httpMethod", null);
        setField(term18284, term18284.getClass(), "port", null);
        setField(term18284, term18284.getClass(), "portSub", null);
        setField(term18284, term18284.getClass(), "queryParameters", null);
        setField(term18284, term18284.getClass(), "queryParametersSub", null);
        setField(term18284, term18284.getClass(), "requestBody", null);
        setField(term18284, term18284.getClass(), "requestBodySub", null);
        setField(term18284, term18284.getClass(), "schemeName", null);
        setField(term18284, term18284.getClass(), "schemeNameSub", null);
        setField(term18284, term18284.getClass(), "uriPath", null);
        setField(term18284, term18284.getClass(), "uriPathSub", null);
        setField(term18284, term18284.getClass(), "name", null);
        setField(term18284, term18284.getClass(), "title", null);
        setField(term18284, term18284.getClass(), "description", null);
        setField(term18284, term18284.getClass(), "state", null);
        setField(term18284, term18284.getClass(), "stepNumber", null);
        setField(term18284, term18284.getClass(), "optional", null);
        setField(term18284, term18284.getClass(), "autoEnable", null);
        setField(term18284, term18284.getClass(), "prereqStep", null);
        setField(term18284, term18284.getClass(), "userDefined", null);
        setField(term18284, term18284.getClass(), "runAsUser", null);
        setField(term18284, term18284.getClass(), "runAsUserDynamic", null);
        setField(term18284, term18284.getClass(), "isRestStep", null);
        setField(term18284, term18284.getClass(), "owner", null);
        setField(term18284, term18284.getClass(), "assignees", null);
        setField(term18284, term18284.getClass(), "skills", null);
        setField(term18284, term18284.getClass(), "weight", null);
        setField(term18284, term18284.getClass(), "hasCalledWorkflow", null);
        setField(term18284, term18284.getClass(), "isConditionStep", null);
        setField(term18284, term18284.getClass(), "steps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getActualStatusCode", argTypes, term18284, args);
    }

};


