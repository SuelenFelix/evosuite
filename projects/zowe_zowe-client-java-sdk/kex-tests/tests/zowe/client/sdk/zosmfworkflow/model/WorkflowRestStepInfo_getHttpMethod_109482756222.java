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

public class WorkflowRestStepInfo_getHttpMethod_109482756222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18288;

    public WorkflowRestStepInfo_getHttpMethod_109482756222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18288 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo"));
        setField(term18288, term18288.getClass(), "actualStatusCode", null);
        setField(term18288, term18288.getClass(), "expectedStatusCode", null);
        setField(term18288, term18288.getClass(), "hostname", null);
        setField(term18288, term18288.getClass(), "hostnameSub", null);
        setField(term18288, term18288.getClass(), "httpMethod", null);
        setField(term18288, term18288.getClass(), "port", null);
        setField(term18288, term18288.getClass(), "portSub", null);
        setField(term18288, term18288.getClass(), "queryParameters", null);
        setField(term18288, term18288.getClass(), "queryParametersSub", null);
        setField(term18288, term18288.getClass(), "requestBody", null);
        setField(term18288, term18288.getClass(), "requestBodySub", null);
        setField(term18288, term18288.getClass(), "schemeName", null);
        setField(term18288, term18288.getClass(), "schemeNameSub", null);
        setField(term18288, term18288.getClass(), "uriPath", null);
        setField(term18288, term18288.getClass(), "uriPathSub", null);
        setField(term18288, term18288.getClass(), "name", null);
        setField(term18288, term18288.getClass(), "title", null);
        setField(term18288, term18288.getClass(), "description", null);
        setField(term18288, term18288.getClass(), "state", null);
        setField(term18288, term18288.getClass(), "stepNumber", null);
        setField(term18288, term18288.getClass(), "optional", null);
        setField(term18288, term18288.getClass(), "autoEnable", null);
        setField(term18288, term18288.getClass(), "prereqStep", null);
        setField(term18288, term18288.getClass(), "userDefined", null);
        setField(term18288, term18288.getClass(), "runAsUser", null);
        setField(term18288, term18288.getClass(), "runAsUserDynamic", null);
        setField(term18288, term18288.getClass(), "isRestStep", null);
        setField(term18288, term18288.getClass(), "owner", null);
        setField(term18288, term18288.getClass(), "assignees", null);
        setField(term18288, term18288.getClass(), "skills", null);
        setField(term18288, term18288.getClass(), "weight", null);
        setField(term18288, term18288.getClass(), "hasCalledWorkflow", null);
        setField(term18288, term18288.getClass(), "isConditionStep", null);
        setField(term18288, term18288.getClass(), "steps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHttpMethod", argTypes, term18288, args);
    }

};


