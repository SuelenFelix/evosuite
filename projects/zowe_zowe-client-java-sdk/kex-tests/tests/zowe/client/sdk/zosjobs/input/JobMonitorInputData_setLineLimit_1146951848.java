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

public class JobMonitorInputData_setLineLimit_1146951848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7711;
     Object term7752;

    public JobMonitorInputData_setLineLimit_1146951848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7736 = new Integer(-817164822);
        Class<? extends Object> term7775 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term7774 = ((Class) term7775).getDeclaredField((String) "ACTIVE");
        ((Field) term7774).setAccessible(true);
        Object enum15 = ((Field) term7774).get((Object) null);
        Integer term7748 = new Integer(-1016503459);
        Integer term7750 = new Integer(-1968847291);
        term7711 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData"));
        setField(term7711, term7711.getClass(), "jobId", "nhoHrZfnIN");
        setField(term7711, term7711.getClass(), "jobName", "ZkMALXpEAZ");
        setField(term7711, term7711.getClass(), "watchDelay", term7736);
        setField(term7711, term7711.getClass(), "jobStatus", enum15);
        setField(term7711, term7711.getClass(), "attempts", term7748);
        setField(term7711, term7711.getClass(), "lineLimit", term7750);
        term7752 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7752;
        callMethod(klass, "setLineLimit", argTypes, term7711, args);
    }

};


