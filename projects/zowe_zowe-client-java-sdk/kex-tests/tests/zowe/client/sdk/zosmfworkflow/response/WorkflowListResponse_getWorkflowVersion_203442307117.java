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

public class WorkflowListResponse_getWorkflowVersion_203442307117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2656;

    public WorkflowListResponse_getWorkflowVersion_203442307117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2656 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse"));
        setField(term2656, term2656.getClass(), "workflowName", null);
        setField(term2656, term2656.getClass(), "workflowKey", null);
        setField(term2656, term2656.getClass(), "workflowDescription", null);
        setField(term2656, term2656.getClass(), "workflowID", null);
        setField(term2656, term2656.getClass(), "workflowVersion", null);
        setField(term2656, term2656.getClass(), "workflowDefinitionFileMD5Value", null);
        setField(term2656, term2656.getClass(), "instanceURI", null);
        setField(term2656, term2656.getClass(), "owner", null);
        setField(term2656, term2656.getClass(), "vendor", null);
        setField(term2656, term2656.getClass(), "access", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowVersion", argTypes, term2656, args);
    }

};


