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
import java.lang.Object;

public class WorkflowCreate_uploadLocalFile_19928862036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3740;

    public WorkflowCreate_uploadLocalFile_19928862036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3740 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowCreate"));
        Object term3741 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssWrite"));
        Object term3742 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssDelete"));
        setField(term3740, term3740.getClass(), "connection", null);
        setField(term3740, term3740.getClass(), "request", null);
        setField(term3741, term3741.getClass(), "connection", null);
        setField(term3741, term3741.getClass(), "request", null);
        setField(term3740, term3740.getClass(), "ussWrite", term3741);
        setField(term3742, term3742.getClass(), "connection", null);
        setField(term3742, term3742.getClass(), "request", null);
        setField(term3740, term3740.getClass(), "ussDelete", term3742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowCreate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "XqgfKFvPSD";
        args[1] = "JiVRgTZvKc";
        callMethod(klass, "uploadLocalFile", argTypes, term3740, args);
    }

};


