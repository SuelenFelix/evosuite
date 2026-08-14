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

public class JobMonitor_pollByStatus_183677618010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13625;
     Object term13629;

    public JobMonitor_pollByStatus_183677618010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13625 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor"));
        setField(term13625, term13625.getClass(), "connection", null);
        setIntField(term13625, term13625.getClass(), "attempts", -1007160944);
        setIntField(term13625, term13625.getClass(), "watchDelay", 1135664017);
        setIntField(term13625, term13625.getClass(), "lineLimit", 590364439);
        Integer term13654 = new Integer(-1685132342);
        Class<? extends Object> term13691 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term13690 = ((Class) term13691).getDeclaredField((String) "ACTIVE");
        ((Field) term13690).setAccessible(true);
        Object enum5 = ((Field) term13690).get((Object) null);
        Integer term13666 = new Integer(-1456670397);
        Integer term13668 = new Integer(1622346318);
        term13629 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData"));
        setField(term13629, term13629.getClass(), "jobId", "fhZgTouhCC");
        setField(term13629, term13629.getClass(), "jobName", "wrikqJwXvL");
        setField(term13629, term13629.getClass(), "watchDelay", term13654);
        setField(term13629, term13629.getClass(), "jobStatus", enum5);
        setField(term13629, term13629.getClass(), "attempts", term13666);
        setField(term13629, term13629.getClass(), "lineLimit", term13668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData");
        Object[] args = new Object[1];
        args[0] = term13629;
        callMethod(klass, "pollByStatus", argTypes, term13625, args);
    }

};


