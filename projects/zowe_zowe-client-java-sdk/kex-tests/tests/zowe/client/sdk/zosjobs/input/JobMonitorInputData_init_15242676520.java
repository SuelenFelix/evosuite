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

public class JobMonitorInputData_init_15242676520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5026;

    public JobMonitorInputData_init_15242676520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5051 = new Integer(-6029667);
        Class<? extends Object> term5088 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term5087 = ((Class) term5088).getDeclaredField((String) "OUTPUT");
        ((Field) term5087).setAccessible(true);
        Object enum6 = ((Field) term5087).get((Object) null);
        Integer term5063 = new Integer(-2068769794);
        Integer term5065 = new Integer(-117576464);
        term5026 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData$Builder"));
        setField(term5026, term5026.getClass(), "jobId", "YpJbIgJWWv");
        setField(term5026, term5026.getClass(), "jobName", "JppkknKVOw");
        setField(term5026, term5026.getClass(), "watchDelay", term5051);
        setField(term5026, term5026.getClass(), "jobStatus", enum6);
        setField(term5026, term5026.getClass(), "attempts", term5063);
        setField(term5026, term5026.getClass(), "lineLimit", term5065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term5026;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


