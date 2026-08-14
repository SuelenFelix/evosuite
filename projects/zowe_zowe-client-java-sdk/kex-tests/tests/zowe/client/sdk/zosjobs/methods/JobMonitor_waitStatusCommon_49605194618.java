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
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class JobMonitor_waitStatusCommon_49605194618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17433;
     Object term17437;

    public JobMonitor_waitStatusCommon_49605194618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17433 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor"));
        setField(term17433, term17433.getClass(), "connection", null);
        setIntField(term17433, term17433.getClass(), "attempts", 579005622);
        setIntField(term17433, term17433.getClass(), "watchDelay", -14890619);
        setIntField(term17433, term17433.getClass(), "lineLimit", 1632125673);
        Integer term17462 = new Integer(-2068769794);
        Class<? extends Object> term17498 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term17497 = ((Class) term17498).getDeclaredField((String) "INPUT");
        ((Field) term17497).setAccessible(true);
        Object enum9 = ((Field) term17497).get((Object) null);
        Integer term17473 = new Integer(-117576464);
        Integer term17475 = new Integer(-1007160944);
        term17437 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData"));
        setField(term17437, term17437.getClass(), "jobId", "LuWMOXdAPA");
        setField(term17437, term17437.getClass(), "jobName", "blSffTnsOv");
        setField(term17437, term17437.getClass(), "watchDelay", term17462);
        setField(term17437, term17437.getClass(), "jobStatus", enum9);
        setField(term17437, term17437.getClass(), "attempts", term17473);
        setField(term17437, term17437.getClass(), "lineLimit", term17475);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData");
        Object[] args = new Object[1];
        args[0] = term17437;
        callMethod(klass, "waitStatusCommon", argTypes, term17433, args);
    }

};


