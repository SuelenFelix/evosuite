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
import java.lang.Boolean;

public class JobMonitor_checkStatus_11155397026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12649;
     Object term12653;
     Object term12694;

    public JobMonitor_checkStatus_11155397026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12649 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor"));
        setField(term12649, term12649.getClass(), "connection", null);
        setIntField(term12649, term12649.getClass(), "attempts", 1134449235);
        setIntField(term12649, term12649.getClass(), "watchDelay", -883034806);
        setIntField(term12649, term12649.getClass(), "lineLimit", 1585847225);
        Integer term12678 = new Integer(-2038273078);
        Class<? extends Object> term12717 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term12716 = ((Class) term12717).getDeclaredField((String) "ACTIVE");
        ((Field) term12716).setAccessible(true);
        Object enum2 = ((Field) term12716).get((Object) null);
        Integer term12690 = new Integer(1227103734);
        Integer term12692 = new Integer(-1339778481);
        term12653 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData"));
        setField(term12653, term12653.getClass(), "jobId", "PNoWXrsFic");
        setField(term12653, term12653.getClass(), "jobName", "QZBHZqZope");
        setField(term12653, term12653.getClass(), "watchDelay", term12678);
        setField(term12653, term12653.getClass(), "jobStatus", enum2);
        setField(term12653, term12653.getClass(), "attempts", term12690);
        setField(term12653, term12653.getClass(), "lineLimit", term12692);
        term12694 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term12653;
        args[1] = term12694;
        callMethod(klass, "checkStatus", argTypes, term12649, args);
    }

};


