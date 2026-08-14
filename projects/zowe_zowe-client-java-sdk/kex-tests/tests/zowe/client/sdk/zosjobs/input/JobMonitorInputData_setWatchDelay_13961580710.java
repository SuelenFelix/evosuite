package zowe.client.sdk.zosjobs.input;

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
import static zowe.client.sdk.zosjobs.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class JobMonitorInputData_setWatchDelay_13961580710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8325;
     Object term8365;

    public JobMonitorInputData_setWatchDelay_13961580710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8350 = new Integer(454281060);
        Class<? extends Object> term8388 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term8387 = ((Class) term8388).getDeclaredField((String) "INPUT");
        ((Field) term8387).setAccessible(true);
        Object enum17 = ((Field) term8387).get((Object) null);
        Integer term8361 = new Integer(-1786399638);
        Integer term8363 = new Integer(2055867847);
        term8325 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData"));
        setField(term8325, term8325.getClass(), "jobId", "vGiuZVPJNH");
        setField(term8325, term8325.getClass(), "jobName", "tlzpzIjMib");
        setField(term8325, term8325.getClass(), "watchDelay", term8350);
        setField(term8325, term8325.getClass(), "jobStatus", enum17);
        setField(term8325, term8325.getClass(), "attempts", term8361);
        setField(term8325, term8325.getClass(), "lineLimit", term8363);
        term8365 = new Integer(-616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8365;
        callMethod(klass, "setWatchDelay", argTypes, term8325, args);
    }

};


