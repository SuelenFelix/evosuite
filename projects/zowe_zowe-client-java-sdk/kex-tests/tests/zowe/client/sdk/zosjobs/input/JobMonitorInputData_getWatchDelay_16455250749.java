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

public class JobMonitorInputData_getWatchDelay_16455250749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8019;

    public JobMonitorInputData_getWatchDelay_16455250749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8044 = new Integer(579005622);
        Class<? extends Object> term8081 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term8080 = ((Class) term8081).getDeclaredField((String) "ACTIVE");
        ((Field) term8080).setAccessible(true);
        Object enum16 = ((Field) term8080).get((Object) null);
        Integer term8056 = new Integer(-14890619);
        Integer term8058 = new Integer(1632125673);
        term8019 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData"));
        setField(term8019, term8019.getClass(), "jobId", "tXfQjSqDzN");
        setField(term8019, term8019.getClass(), "jobName", "BjugTaMcxJ");
        setField(term8019, term8019.getClass(), "watchDelay", term8044);
        setField(term8019, term8019.getClass(), "jobStatus", enum16);
        setField(term8019, term8019.getClass(), "attempts", term8056);
        setField(term8019, term8019.getClass(), "lineLimit", term8058);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWatchDelay", argTypes, term8019, args);
    }

};


