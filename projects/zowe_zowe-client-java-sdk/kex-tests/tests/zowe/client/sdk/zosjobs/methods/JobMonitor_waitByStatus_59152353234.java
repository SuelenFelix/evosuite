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

public class JobMonitor_waitByStatus_59152353234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17797;

    public JobMonitor_waitByStatus_59152353234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17797 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor"));
        setField(term17797, term17797.getClass(), "connection", null);
        setIntField(term17797, term17797.getClass(), "attempts", 0);
        setIntField(term17797, term17797.getClass(), "watchDelay", 0);
        setIntField(term17797, term17797.getClass(), "lineLimit", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        argTypes[1] = Class.forName("zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "waitByStatus", argTypes, term17797, args);
    }

};


