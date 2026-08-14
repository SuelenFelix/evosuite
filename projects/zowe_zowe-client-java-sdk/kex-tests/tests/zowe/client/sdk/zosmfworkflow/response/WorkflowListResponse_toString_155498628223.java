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

public class WorkflowListResponse_toString_155498628223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2662;

    public WorkflowListResponse_toString_155498628223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2662 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse"));
        setField(term2662, term2662.getClass(), "workflowName", null);
        setField(term2662, term2662.getClass(), "workflowKey", null);
        setField(term2662, term2662.getClass(), "workflowDescription", null);
        setField(term2662, term2662.getClass(), "workflowID", null);
        setField(term2662, term2662.getClass(), "workflowVersion", null);
        setField(term2662, term2662.getClass(), "workflowDefinitionFileMD5Value", null);
        setField(term2662, term2662.getClass(), "instanceURI", null);
        setField(term2662, term2662.getClass(), "owner", null);
        setField(term2662, term2662.getClass(), "vendor", null);
        setField(term2662, term2662.getClass(), "access", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2662, args);
    }

};


