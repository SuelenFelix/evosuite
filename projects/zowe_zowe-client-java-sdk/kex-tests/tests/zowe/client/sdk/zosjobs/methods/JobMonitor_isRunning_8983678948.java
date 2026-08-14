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

public class JobMonitor_isRunning_8983678948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12987;
     Object term12991;

    public JobMonitor_isRunning_8983678948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12987 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor"));
        setField(term12987, term12987.getClass(), "connection", null);
        setIntField(term12987, term12987.getClass(), "attempts", 1622346318);
        setIntField(term12987, term12987.getClass(), "watchDelay", 1048535127);
        setIntField(term12987, term12987.getClass(), "lineLimit", -655067527);
        Integer term13016 = new Integer(1725571209);
        Class<? extends Object> term13053 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term13052 = ((Class) term13053).getDeclaredField((String) "OUTPUT");
        ((Field) term13052).setAccessible(true);
        Object enum3 = ((Field) term13052).get((Object) null);
        Integer term13028 = new Integer(-522618178);
        Integer term13030 = new Integer(1134449235);
        term12991 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData"));
        setField(term12991, term12991.getClass(), "jobId", "MlzTkzKMCX");
        setField(term12991, term12991.getClass(), "jobName", "UqKUbMyPMJ");
        setField(term12991, term12991.getClass(), "watchDelay", term13016);
        setField(term12991, term12991.getClass(), "jobStatus", enum3);
        setField(term12991, term12991.getClass(), "attempts", term13028);
        setField(term12991, term12991.getClass(), "lineLimit", term13030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData");
        Object[] args = new Object[1];
        args[0] = term12991;
        callMethod(klass, "isRunning", argTypes, term12987, args);
    }

};


