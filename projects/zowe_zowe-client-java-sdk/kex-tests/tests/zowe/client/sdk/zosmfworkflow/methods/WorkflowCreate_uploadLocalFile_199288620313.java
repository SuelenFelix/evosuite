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

public class WorkflowCreate_uploadLocalFile_199288620313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3793;

    public WorkflowCreate_uploadLocalFile_199288620313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3793 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowCreate"));
        setField(term3793, term3793.getClass(), "connection", null);
        setField(term3793, term3793.getClass(), "request", null);
        setField(term3793, term3793.getClass(), "ussWrite", null);
        setField(term3793, term3793.getClass(), "ussDelete", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowCreate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "uploadLocalFile", argTypes, term3793, args);
    }

};


