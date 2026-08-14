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

public class JobMonitor_pollByMessage_13886859019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13297;
     Object term13301;

    public JobMonitor_pollByMessage_13886859019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13297 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor"));
        setField(term13297, term13297.getClass(), "connection", null);
        setIntField(term13297, term13297.getClass(), "attempts", -6029667);
        setIntField(term13297, term13297.getClass(), "watchDelay", -2068769794);
        setIntField(term13297, term13297.getClass(), "lineLimit", -117576464);
        Integer term13326 = new Integer(-883034806);
        Class<? extends Object> term13374 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term13373 = ((Class) term13374).getDeclaredField((String) "INPUT");
        ((Field) term13373).setAccessible(true);
        Object enum4 = ((Field) term13373).get((Object) null);
        Integer term13337 = new Integer(1585847225);
        Integer term13339 = new Integer(597278769);
        term13301 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData"));
        setField(term13301, term13301.getClass(), "jobId", "QpYltHAdyY");
        setField(term13301, term13301.getClass(), "jobName", "lbmSGBwIiV");
        setField(term13301, term13301.getClass(), "watchDelay", term13326);
        setField(term13301, term13301.getClass(), "jobStatus", enum4);
        setField(term13301, term13301.getClass(), "attempts", term13337);
        setField(term13301, term13301.getClass(), "lineLimit", term13339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term13301;
        args[1] = "DAxyHoTLzZ";
        callMethod(klass, "pollByMessage", argTypes, term13297, args);
    }

};


