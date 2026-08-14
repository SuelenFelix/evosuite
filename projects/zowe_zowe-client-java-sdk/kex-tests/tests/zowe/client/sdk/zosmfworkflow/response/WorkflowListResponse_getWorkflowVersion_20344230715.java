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

public class WorkflowListResponse_getWorkflowVersion_20344230715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1105;

    public WorkflowListResponse_getWorkflowVersion_20344230715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1105 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse"));
        setField(term1105, term1105.getClass(), "workflowName", "nGKItKLYNC");
        setField(term1105, term1105.getClass(), "workflowKey", "UiUYnPrcCi");
        setField(term1105, term1105.getClass(), "workflowDescription", "UoYtihxVaS");
        setField(term1105, term1105.getClass(), "workflowID", "JDswTTCZHV");
        setField(term1105, term1105.getClass(), "workflowVersion", "onpbIeEKoi");
        setField(term1105, term1105.getClass(), "workflowDefinitionFileMD5Value", "YRHGsAkhxb");
        setField(term1105, term1105.getClass(), "instanceURI", "ffYhPOzlUs");
        setField(term1105, term1105.getClass(), "owner", "MLqYREekMl");
        setField(term1105, term1105.getClass(), "vendor", "ytSBIKXogI");
        setField(term1105, term1105.getClass(), "access", "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowVersion", argTypes, term1105, args);
    }

};


