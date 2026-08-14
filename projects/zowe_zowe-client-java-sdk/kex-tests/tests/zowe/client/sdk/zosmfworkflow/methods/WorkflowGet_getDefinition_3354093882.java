package zowe.client.sdk.zosmfworkflow.methods;

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
import static zowe.client.sdk.zosmfworkflow.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WorkflowGet_getDefinition_3354093882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2078;

    public WorkflowGet_getDefinition_3354093882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2078 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowGet"));
        setField(term2078, term2078.getClass(), "connection", null);
        setField(term2078, term2078.getClass(), "request", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowGet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hRNSzYYIrc";
        callMethod(klass, "getDefinition", argTypes, term2078, args);
    }

};


