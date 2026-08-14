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

public class WorkflowCreate_buildTempPath_712604295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3693;

    public WorkflowCreate_buildTempPath_712604295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3693 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowCreate"));
        Object term3694 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssWrite"));
        Object term3695 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssDelete"));
        setField(term3693, term3693.getClass(), "connection", null);
        setField(term3693, term3693.getClass(), "request", null);
        setField(term3694, term3694.getClass(), "connection", null);
        setField(term3694, term3694.getClass(), "request", null);
        setField(term3693, term3693.getClass(), "ussWrite", term3694);
        setField(term3695, term3695.getClass(), "connection", null);
        setField(term3695, term3695.getClass(), "request", null);
        setField(term3693, term3693.getClass(), "ussDelete", term3695);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowCreate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "jiKYgYHqIS";
        args[1] = "DfISiziTgG";
        callMethod(klass, "buildTempPath", argTypes, term3693, args);
    }

};


