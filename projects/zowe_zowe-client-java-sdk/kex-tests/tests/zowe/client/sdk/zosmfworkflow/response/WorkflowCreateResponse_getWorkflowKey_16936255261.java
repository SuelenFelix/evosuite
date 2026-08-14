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

public class WorkflowCreateResponse_getWorkflowKey_16936255261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37955;

    public WorkflowCreateResponse_getWorkflowKey_16936255261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37955 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateResponse"));
        setField(term37955, term37955.getClass(), "workflowKey", "PTEWoxLNqQ");
        setField(term37955, term37955.getClass(), "workflowDescription", "XiAUBffMZP");
        setField(term37955, term37955.getClass(), "workflowID", "pkfsHvqODq");
        setField(term37955, term37955.getClass(), "workflowVersion", "OoRBUdwown");
        setField(term37955, term37955.getClass(), "vendor", "lSidZunNtu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowKey", argTypes, term37955, args);
    }

};


