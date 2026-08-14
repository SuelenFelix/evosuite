package zowe.client.sdk.zosjobs.methods;

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
import static zowe.client.sdk.zosjobs.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class JobMonitor_checkStatus_111553970225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17759;
     Object term17763;

    public JobMonitor_checkStatus_111553970225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17759 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor"));
        setField(term17759, term17759.getClass(), "connection", null);
        setIntField(term17759, term17759.getClass(), "attempts", 0);
        setIntField(term17759, term17759.getClass(), "watchDelay", 0);
        setIntField(term17759, term17759.getClass(), "lineLimit", 0);
        term17763 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term17763;
        callMethod(klass, "checkStatus", argTypes, term17759, args);
    }

};


