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

public class WorkflowCreateResponse_getWorkflowDescription_11156384399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38622;

    public WorkflowCreateResponse_getWorkflowDescription_11156384399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38622 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateResponse"));
        setField(term38622, term38622.getClass(), "workflowKey", null);
        setField(term38622, term38622.getClass(), "workflowDescription", null);
        setField(term38622, term38622.getClass(), "workflowID", null);
        setField(term38622, term38622.getClass(), "workflowVersion", null);
        setField(term38622, term38622.getClass(), "vendor", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowDescription", argTypes, term38622, args);
    }

};


