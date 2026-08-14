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

public class WorkflowListResponse_getWorkflowKey_21467848814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2653;

    public WorkflowListResponse_getWorkflowKey_21467848814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2653 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse"));
        setField(term2653, term2653.getClass(), "workflowName", null);
        setField(term2653, term2653.getClass(), "workflowKey", null);
        setField(term2653, term2653.getClass(), "workflowDescription", null);
        setField(term2653, term2653.getClass(), "workflowID", null);
        setField(term2653, term2653.getClass(), "workflowVersion", null);
        setField(term2653, term2653.getClass(), "workflowDefinitionFileMD5Value", null);
        setField(term2653, term2653.getClass(), "instanceURI", null);
        setField(term2653, term2653.getClass(), "owner", null);
        setField(term2653, term2653.getClass(), "vendor", null);
        setField(term2653, term2653.getClass(), "access", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowKey", argTypes, term2653, args);
    }

};


