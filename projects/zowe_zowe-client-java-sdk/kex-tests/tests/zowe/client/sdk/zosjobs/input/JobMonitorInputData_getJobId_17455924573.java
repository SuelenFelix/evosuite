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

public class JobMonitorInputData_getJobId_17455924573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5938;

    public JobMonitorInputData_getJobId_17455924573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5963 = new Integer(-203030934);
        Class<? extends Object> term5999 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term5998 = ((Class) term5999).getDeclaredField((String) "INPUT");
        ((Field) term5998).setAccessible(true);
        Object enum9 = ((Field) term5998).get((Object) null);
        Integer term5974 = new Integer(-1179120542);
        Integer term5976 = new Integer(-73683645);
        term5938 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData"));
        setField(term5938, term5938.getClass(), "jobId", "sZdUNdggUW");
        setField(term5938, term5938.getClass(), "jobName", "OqbwYQfvAe");
        setField(term5938, term5938.getClass(), "watchDelay", term5963);
        setField(term5938, term5938.getClass(), "jobStatus", enum9);
        setField(term5938, term5938.getClass(), "attempts", term5974);
        setField(term5938, term5938.getClass(), "lineLimit", term5976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobId", argTypes, term5938, args);
    }

};


