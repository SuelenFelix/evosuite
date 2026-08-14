package zowe.client.sdk.zoslogs.input;

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
import static zowe.client.sdk.zoslogs.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ZosLogInputData_Builder_timeRange_20320619724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1807;

    public ZosLogInputData_Builder_timeRange_20320619724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1897 = Class.forName((String) "zowe.client.sdk.zoslogs.types.HardCopyType");
        Field term1896 = ((Class) term1897).getDeclaredField((String) "SYSLOG");
        ((Field) term1896).setAccessible(true);
        Object enum6 = ((Field) term1896).get((Object) null);
        Class<? extends Object> term2132 = Class.forName((String) "zowe.client.sdk.zoslogs.types.DirectionType");
        Field term2131 = ((Class) term2132).getDeclaredField((String) "BACKWARD");
        ((Field) term2131).setAccessible(true);
        Object enum7 = ((Field) term2131).get((Object) null);
        term1807 = newInstance(Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData$Builder"));
        setField(term1807, term1807.getClass(), "startTime", "MjGYSRKTNF");
        setField(term1807, term1807.getClass(), "hardCopy", enum6);
        setField(term1807, term1807.getClass(), "direction", enum7);
        setField(term1807, term1807.getClass(), "timeRange", "hRNSzYYIrc");
        setBooleanField(term1807, term1807.getClass(), "processResponses", false);
        setIntField(term1807, term1807.getClass(), "queryCount", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RMFIsYGgne";
        callMethod(klass, "timeRange", argTypes, term1807, args);
    }

};


