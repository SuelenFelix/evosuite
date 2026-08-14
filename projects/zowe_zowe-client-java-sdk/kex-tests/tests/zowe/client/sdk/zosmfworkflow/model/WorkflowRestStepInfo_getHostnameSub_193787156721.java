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

public class WorkflowRestStepInfo_getHostnameSub_193787156721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18287;

    public WorkflowRestStepInfo_getHostnameSub_193787156721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18287 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo"));
        setField(term18287, term18287.getClass(), "actualStatusCode", null);
        setField(term18287, term18287.getClass(), "expectedStatusCode", null);
        setField(term18287, term18287.getClass(), "hostname", null);
        setField(term18287, term18287.getClass(), "hostnameSub", null);
        setField(term18287, term18287.getClass(), "httpMethod", null);
        setField(term18287, term18287.getClass(), "port", null);
        setField(term18287, term18287.getClass(), "portSub", null);
        setField(term18287, term18287.getClass(), "queryParameters", null);
        setField(term18287, term18287.getClass(), "queryParametersSub", null);
        setField(term18287, term18287.getClass(), "requestBody", null);
        setField(term18287, term18287.getClass(), "requestBodySub", null);
        setField(term18287, term18287.getClass(), "schemeName", null);
        setField(term18287, term18287.getClass(), "schemeNameSub", null);
        setField(term18287, term18287.getClass(), "uriPath", null);
        setField(term18287, term18287.getClass(), "uriPathSub", null);
        setField(term18287, term18287.getClass(), "name", null);
        setField(term18287, term18287.getClass(), "title", null);
        setField(term18287, term18287.getClass(), "description", null);
        setField(term18287, term18287.getClass(), "state", null);
        setField(term18287, term18287.getClass(), "stepNumber", null);
        setField(term18287, term18287.getClass(), "optional", null);
        setField(term18287, term18287.getClass(), "autoEnable", null);
        setField(term18287, term18287.getClass(), "prereqStep", null);
        setField(term18287, term18287.getClass(), "userDefined", null);
        setField(term18287, term18287.getClass(), "runAsUser", null);
        setField(term18287, term18287.getClass(), "runAsUserDynamic", null);
        setField(term18287, term18287.getClass(), "isRestStep", null);
        setField(term18287, term18287.getClass(), "owner", null);
        setField(term18287, term18287.getClass(), "assignees", null);
        setField(term18287, term18287.getClass(), "skills", null);
        setField(term18287, term18287.getClass(), "weight", null);
        setField(term18287, term18287.getClass(), "hasCalledWorkflow", null);
        setField(term18287, term18287.getClass(), "isConditionStep", null);
        setField(term18287, term18287.getClass(), "steps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHostnameSub", argTypes, term18287, args);
    }

};


