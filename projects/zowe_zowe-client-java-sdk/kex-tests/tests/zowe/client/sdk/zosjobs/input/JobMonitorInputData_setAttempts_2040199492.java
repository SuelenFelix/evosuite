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

public class JobMonitorInputData_setAttempts_2040199492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5634;
     Object term5674;

    public JobMonitorInputData_setAttempts_2040199492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5659 = new Integer(865208305);
        Class<? extends Object> term5697 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term5696 = ((Class) term5697).getDeclaredField((String) "INPUT");
        ((Field) term5696).setAccessible(true);
        Object enum8 = ((Field) term5696).get((Object) null);
        Integer term5670 = new Integer(-1275173084);
        Integer term5672 = new Integer(-244121226);
        term5634 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData"));
        setField(term5634, term5634.getClass(), "jobId", "vKQukfbJUd");
        setField(term5634, term5634.getClass(), "jobName", "lFRJFUMVbx");
        setField(term5634, term5634.getClass(), "watchDelay", term5659);
        setField(term5634, term5634.getClass(), "jobStatus", enum8);
        setField(term5634, term5634.getClass(), "attempts", term5670);
        setField(term5634, term5634.getClass(), "lineLimit", term5672);
        term5674 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5674;
        callMethod(klass, "setAttempts", argTypes, term5634, args);
    }

};


