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

public class JobMonitorInputData_Builder_attempts_14294821051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403;
     Object term444;

    public JobMonitorInputData_Builder_attempts_14294821051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term428 = new Integer(568599855);
        Class<? extends Object> term496 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term495 = ((Class) term496).getDeclaredField((String) "ACTIVE");
        ((Field) term495).setAccessible(true);
        Object enum0 = ((Field) term495).get((Object) null);
        Integer term440 = new Integer(1162663216);
        Integer term442 = new Integer(1484323161);
        term403 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData$Builder"));
        setField(term403, term403.getClass(), "jobId", "HyxfbSQYBe");
        setField(term403, term403.getClass(), "jobName", "pCTimMblYc");
        setField(term403, term403.getClass(), "watchDelay", term428);
        setField(term403, term403.getClass(), "jobStatus", enum0);
        setField(term403, term403.getClass(), "attempts", term440);
        setField(term403, term403.getClass(), "lineLimit", term442);
        term444 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term444;
        callMethod(klass, "attempts", argTypes, term403, args);
    }

};


