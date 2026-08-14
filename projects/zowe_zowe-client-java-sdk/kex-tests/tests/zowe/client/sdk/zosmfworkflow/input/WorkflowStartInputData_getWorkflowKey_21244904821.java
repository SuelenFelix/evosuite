package zowe.client.sdk.zosmfworkflow.input;

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
import static zowe.client.sdk.zosmfworkflow.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class WorkflowStartInputData_getWorkflowKey_21244904821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28465;

    public WorkflowStartInputData_getWorkflowKey_21244904821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term28502 = new Boolean(true);
        term28465 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData"));
        setField(term28465, term28465.getClass(), "workflowKey", "dUHylIprea");
        setField(term28465, term28465.getClass(), "resolveConflictByUsing", "FKDqHRpMcc");
        setField(term28465, term28465.getClass(), "stepName", "mIRMQIxHUD");
        setField(term28465, term28465.getClass(), "performSubsequent", term28502);
        setField(term28465, term28465.getClass(), "notificationUrl", "FbBMtntDbw");
        setField(term28465, term28465.getClass(), "targetSystemuid", "zRnpRGaHlI");
        setField(term28465, term28465.getClass(), "targetSystempwd", "dVHfxjbMRK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowStartInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowKey", argTypes, term28465, args);
    }

};


