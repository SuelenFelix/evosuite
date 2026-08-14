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

public class WorkflowRestStepInfo_getPortSub_13052143724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18290;

    public WorkflowRestStepInfo_getPortSub_13052143724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18290 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo"));
        setField(term18290, term18290.getClass(), "actualStatusCode", null);
        setField(term18290, term18290.getClass(), "expectedStatusCode", null);
        setField(term18290, term18290.getClass(), "hostname", null);
        setField(term18290, term18290.getClass(), "hostnameSub", null);
        setField(term18290, term18290.getClass(), "httpMethod", null);
        setField(term18290, term18290.getClass(), "port", null);
        setField(term18290, term18290.getClass(), "portSub", null);
        setField(term18290, term18290.getClass(), "queryParameters", null);
        setField(term18290, term18290.getClass(), "queryParametersSub", null);
        setField(term18290, term18290.getClass(), "requestBody", null);
        setField(term18290, term18290.getClass(), "requestBodySub", null);
        setField(term18290, term18290.getClass(), "schemeName", null);
        setField(term18290, term18290.getClass(), "schemeNameSub", null);
        setField(term18290, term18290.getClass(), "uriPath", null);
        setField(term18290, term18290.getClass(), "uriPathSub", null);
        setField(term18290, term18290.getClass(), "name", null);
        setField(term18290, term18290.getClass(), "title", null);
        setField(term18290, term18290.getClass(), "description", null);
        setField(term18290, term18290.getClass(), "state", null);
        setField(term18290, term18290.getClass(), "stepNumber", null);
        setField(term18290, term18290.getClass(), "optional", null);
        setField(term18290, term18290.getClass(), "autoEnable", null);
        setField(term18290, term18290.getClass(), "prereqStep", null);
        setField(term18290, term18290.getClass(), "userDefined", null);
        setField(term18290, term18290.getClass(), "runAsUser", null);
        setField(term18290, term18290.getClass(), "runAsUserDynamic", null);
        setField(term18290, term18290.getClass(), "isRestStep", null);
        setField(term18290, term18290.getClass(), "owner", null);
        setField(term18290, term18290.getClass(), "assignees", null);
        setField(term18290, term18290.getClass(), "skills", null);
        setField(term18290, term18290.getClass(), "weight", null);
        setField(term18290, term18290.getClass(), "hasCalledWorkflow", null);
        setField(term18290, term18290.getClass(), "isConditionStep", null);
        setField(term18290, term18290.getClass(), "steps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPortSub", argTypes, term18290, args);
    }

};


