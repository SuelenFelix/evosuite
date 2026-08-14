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

public class WorkflowRestStepInfo_getExpectedStatusCode_106115405619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18285;

    public WorkflowRestStepInfo_getExpectedStatusCode_106115405619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18285 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo"));
        setField(term18285, term18285.getClass(), "actualStatusCode", null);
        setField(term18285, term18285.getClass(), "expectedStatusCode", null);
        setField(term18285, term18285.getClass(), "hostname", null);
        setField(term18285, term18285.getClass(), "hostnameSub", null);
        setField(term18285, term18285.getClass(), "httpMethod", null);
        setField(term18285, term18285.getClass(), "port", null);
        setField(term18285, term18285.getClass(), "portSub", null);
        setField(term18285, term18285.getClass(), "queryParameters", null);
        setField(term18285, term18285.getClass(), "queryParametersSub", null);
        setField(term18285, term18285.getClass(), "requestBody", null);
        setField(term18285, term18285.getClass(), "requestBodySub", null);
        setField(term18285, term18285.getClass(), "schemeName", null);
        setField(term18285, term18285.getClass(), "schemeNameSub", null);
        setField(term18285, term18285.getClass(), "uriPath", null);
        setField(term18285, term18285.getClass(), "uriPathSub", null);
        setField(term18285, term18285.getClass(), "name", null);
        setField(term18285, term18285.getClass(), "title", null);
        setField(term18285, term18285.getClass(), "description", null);
        setField(term18285, term18285.getClass(), "state", null);
        setField(term18285, term18285.getClass(), "stepNumber", null);
        setField(term18285, term18285.getClass(), "optional", null);
        setField(term18285, term18285.getClass(), "autoEnable", null);
        setField(term18285, term18285.getClass(), "prereqStep", null);
        setField(term18285, term18285.getClass(), "userDefined", null);
        setField(term18285, term18285.getClass(), "runAsUser", null);
        setField(term18285, term18285.getClass(), "runAsUserDynamic", null);
        setField(term18285, term18285.getClass(), "isRestStep", null);
        setField(term18285, term18285.getClass(), "owner", null);
        setField(term18285, term18285.getClass(), "assignees", null);
        setField(term18285, term18285.getClass(), "skills", null);
        setField(term18285, term18285.getClass(), "weight", null);
        setField(term18285, term18285.getClass(), "hasCalledWorkflow", null);
        setField(term18285, term18285.getClass(), "isConditionStep", null);
        setField(term18285, term18285.getClass(), "steps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExpectedStatusCode", argTypes, term18285, args);
    }

};


