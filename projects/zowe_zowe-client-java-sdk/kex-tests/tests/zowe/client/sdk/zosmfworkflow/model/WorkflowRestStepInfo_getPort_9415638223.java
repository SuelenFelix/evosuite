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

public class WorkflowRestStepInfo_getPort_9415638223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18289;

    public WorkflowRestStepInfo_getPort_9415638223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18289 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo"));
        setField(term18289, term18289.getClass(), "actualStatusCode", null);
        setField(term18289, term18289.getClass(), "expectedStatusCode", null);
        setField(term18289, term18289.getClass(), "hostname", null);
        setField(term18289, term18289.getClass(), "hostnameSub", null);
        setField(term18289, term18289.getClass(), "httpMethod", null);
        setField(term18289, term18289.getClass(), "port", null);
        setField(term18289, term18289.getClass(), "portSub", null);
        setField(term18289, term18289.getClass(), "queryParameters", null);
        setField(term18289, term18289.getClass(), "queryParametersSub", null);
        setField(term18289, term18289.getClass(), "requestBody", null);
        setField(term18289, term18289.getClass(), "requestBodySub", null);
        setField(term18289, term18289.getClass(), "schemeName", null);
        setField(term18289, term18289.getClass(), "schemeNameSub", null);
        setField(term18289, term18289.getClass(), "uriPath", null);
        setField(term18289, term18289.getClass(), "uriPathSub", null);
        setField(term18289, term18289.getClass(), "name", null);
        setField(term18289, term18289.getClass(), "title", null);
        setField(term18289, term18289.getClass(), "description", null);
        setField(term18289, term18289.getClass(), "state", null);
        setField(term18289, term18289.getClass(), "stepNumber", null);
        setField(term18289, term18289.getClass(), "optional", null);
        setField(term18289, term18289.getClass(), "autoEnable", null);
        setField(term18289, term18289.getClass(), "prereqStep", null);
        setField(term18289, term18289.getClass(), "userDefined", null);
        setField(term18289, term18289.getClass(), "runAsUser", null);
        setField(term18289, term18289.getClass(), "runAsUserDynamic", null);
        setField(term18289, term18289.getClass(), "isRestStep", null);
        setField(term18289, term18289.getClass(), "owner", null);
        setField(term18289, term18289.getClass(), "assignees", null);
        setField(term18289, term18289.getClass(), "skills", null);
        setField(term18289, term18289.getClass(), "weight", null);
        setField(term18289, term18289.getClass(), "hasCalledWorkflow", null);
        setField(term18289, term18289.getClass(), "isConditionStep", null);
        setField(term18289, term18289.getClass(), "steps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPort", argTypes, term18289, args);
    }

};


