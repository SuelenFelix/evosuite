package zowe.client.sdk.zosmfworkflow.methods;

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
import static zowe.client.sdk.zosmfworkflow.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class WorkflowGet_getPropertiesCommon_7049092257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2240;
     Object term2241;
     Object term2256;

    public WorkflowGet_getPropertiesCommon_7049092257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2240 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowGet"));
        setField(term2240, term2240.getClass(), "connection", null);
        setField(term2240, term2240.getClass(), "request", null);
        term2241 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowGetPropertiesInputData"));
        setField(term2241, term2241.getClass(), "workflowKey", "aJlieCFVtF");
        setBooleanField(term2241, term2241.getClass(), "returnSteps", false);
        setBooleanField(term2241, term2241.getClass(), "returnVariables", false);
        term2256 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowGet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowGetPropertiesInputData");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term2241;
        args[1] = term2256;
        callMethod(klass, "getPropertiesCommon", argTypes, term2240, args);
    }

};


