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

public class JobMonitor_checkMessage_14026256954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11978;
     Object term11982;

    public JobMonitor_checkMessage_14026256954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11978 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor"));
        setField(term11978, term11978.getClass(), "connection", null);
        setIntField(term11978, term11978.getClass(), "attempts", -1955890973);
        setIntField(term11978, term11978.getClass(), "watchDelay", -2038273078);
        setIntField(term11978, term11978.getClass(), "lineLimit", 1227103734);
        Integer term12007 = new Integer(1162663216);
        Class<? extends Object> term12085 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term12084 = ((Class) term12085).getDeclaredField((String) "ACTIVE");
        ((Field) term12084).setAccessible(true);
        Object enum0 = ((Field) term12084).get((Object) null);
        Integer term12019 = new Integer(1484323161);
        Integer term12021 = new Integer(391863371);
        term11982 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData"));
        setField(term11982, term11982.getClass(), "jobId", "zHvfKaOstO");
        setField(term11982, term11982.getClass(), "jobName", "tOszriqETr");
        setField(term11982, term11982.getClass(), "watchDelay", term12007);
        setField(term11982, term11982.getClass(), "jobStatus", enum0);
        setField(term11982, term11982.getClass(), "attempts", term12019);
        setField(term11982, term11982.getClass(), "lineLimit", term12021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term11982;
        args[1] = "ncSPTkhKjO";
        callMethod(klass, "checkMessage", argTypes, term11978, args);
    }

};


