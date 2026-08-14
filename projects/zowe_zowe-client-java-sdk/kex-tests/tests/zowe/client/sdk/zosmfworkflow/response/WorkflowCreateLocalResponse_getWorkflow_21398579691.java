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
import java.lang.Object;
import java.util.ArrayList;

public class WorkflowCreateLocalResponse_getWorkflow_21398579691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2987;

    public WorkflowCreateLocalResponse_getWorkflow_21398579691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3049 = new ArrayList();
        ((ArrayList) term3049).add("GgZWSjxjyE");
        ((ArrayList) term3049).add("EeBVbzjcCI");
        ((ArrayList) term3049).add("UfQtPRyWRC");
        ((ArrayList) term3049).add("FPvxVzzSvD");
        ArrayList term3101 = new ArrayList();
        ((ArrayList) term3101).add("WHcwFgsGFC");
        ((ArrayList) term3101).add("HzqpegHiRq");
        ((ArrayList) term3101).add("jwsfVjMoJT");
        term2987 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateLocalResponse"));
        Object term2988 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateResponse"));
        setField(term2988, term2988.getClass(), "workflowKey", "ZzIujlwVsw");
        setField(term2988, term2988.getClass(), "workflowDescription", "LWyEaeIyAo");
        setField(term2988, term2988.getClass(), "workflowID", "yVMkkQhvmN");
        setField(term2988, term2988.getClass(), "workflowVersion", "mvrkADEgpp");
        setField(term2988, term2988.getClass(), "vendor", "pXOkjyeIRb");
        setField(term2987, term2987.getClass(), "workflow", term2988);
        setField(term2987, term2987.getClass(), "filesKept", term3049);
        setField(term2987, term2987.getClass(), "failedToDelete", term3101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateLocalResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflow", argTypes, term2987, args);
    }

};


