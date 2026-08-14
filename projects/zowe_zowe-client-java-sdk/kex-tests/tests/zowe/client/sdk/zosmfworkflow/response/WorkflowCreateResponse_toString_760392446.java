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

public class WorkflowCreateResponse_toString_760392446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38510;

    public WorkflowCreateResponse_toString_760392446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38510 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateResponse"));
        setField(term38510, term38510.getClass(), "workflowKey", "RbXhBDZbRT");
        setField(term38510, term38510.getClass(), "workflowDescription", "QDaTqkWnGj");
        setField(term38510, term38510.getClass(), "workflowID", "vNObzQvzxo");
        setField(term38510, term38510.getClass(), "workflowVersion", "uyuWzXeJvn");
        setField(term38510, term38510.getClass(), "vendor", "jvQHxWAYDO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term38510, args);
    }

};


