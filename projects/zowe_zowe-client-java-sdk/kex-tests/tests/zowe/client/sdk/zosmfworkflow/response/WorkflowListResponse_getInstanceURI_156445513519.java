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

public class WorkflowListResponse_getInstanceURI_156445513519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2658;

    public WorkflowListResponse_getInstanceURI_156445513519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2658 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse"));
        setField(term2658, term2658.getClass(), "workflowName", null);
        setField(term2658, term2658.getClass(), "workflowKey", null);
        setField(term2658, term2658.getClass(), "workflowDescription", null);
        setField(term2658, term2658.getClass(), "workflowID", null);
        setField(term2658, term2658.getClass(), "workflowVersion", null);
        setField(term2658, term2658.getClass(), "workflowDefinitionFileMD5Value", null);
        setField(term2658, term2658.getClass(), "instanceURI", null);
        setField(term2658, term2658.getClass(), "owner", null);
        setField(term2658, term2658.getClass(), "vendor", null);
        setField(term2658, term2658.getClass(), "access", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInstanceURI", argTypes, term2658, args);
    }

};


