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

public class JobMonitorInputData_getAttempts_15733079041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5332;

    public JobMonitorInputData_getAttempts_15733079041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5357 = new Integer(-1007160944);
        Class<? extends Object> term5393 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term5392 = ((Class) term5393).getDeclaredField((String) "INPUT");
        ((Field) term5392).setAccessible(true);
        Object enum7 = ((Field) term5392).get((Object) null);
        Integer term5368 = new Integer(1135664017);
        Integer term5370 = new Integer(590364439);
        term5332 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData"));
        setField(term5332, term5332.getClass(), "jobId", "iljANwuEjk");
        setField(term5332, term5332.getClass(), "jobName", "kNqaJKIATy");
        setField(term5332, term5332.getClass(), "watchDelay", term5357);
        setField(term5332, term5332.getClass(), "jobStatus", enum7);
        setField(term5332, term5332.getClass(), "attempts", term5368);
        setField(term5332, term5332.getClass(), "lineLimit", term5370);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttempts", argTypes, term5332, args);
    }

};


