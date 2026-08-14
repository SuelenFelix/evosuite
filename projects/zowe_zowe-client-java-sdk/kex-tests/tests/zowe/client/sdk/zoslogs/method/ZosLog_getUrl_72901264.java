package zowe.client.sdk.zoslogs.method;

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
import static zowe.client.sdk.zoslogs.method.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;

public class ZosLog_getUrl_72901264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1219;
     Object term1220;
     Object term1286;

    public ZosLog_getUrl_72901264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1219 = newInstance(Class.forName("zowe.client.sdk.zoslogs.method.ZosLog"));
        setField(term1219, term1219.getClass(), "connection", null);
        setField(term1219, term1219.getClass(), "request", null);
        Class<? extends Object> term1299 = Class.forName((String) "zowe.client.sdk.zoslogs.types.HardCopyType");
        Field term1298 = ((Class) term1299).getDeclaredField((String) "OPERLOG");
        ((Field) term1298).setAccessible(true);
        Object enum4 = ((Field) term1298).get((Object) null);
        Class<? extends Object> term1537 = Class.forName((String) "zowe.client.sdk.zoslogs.types.DirectionType");
        Field term1536 = ((Class) term1537).getDeclaredField((String) "FORWARD");
        ((Field) term1536).setAccessible(true);
        Object enum5 = ((Field) term1536).get((Object) null);
        term1220 = newInstance(Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData"));
        setField(term1220, term1220.getClass(), "startTime", "jJCZpVmanW");
        setField(term1220, term1220.getClass(), "hardCopy", enum4);
        setField(term1220, term1220.getClass(), "direction", enum5);
        setField(term1220, term1220.getClass(), "timeRange", "EGtDIRbSSb");
        setBooleanField(term1220, term1220.getClass(), "processResponses", false);
        term1286 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.method.ZosLog");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term1220;
        args[1] = term1286;
        callMethod(klass, "getUrl", argTypes, term1219, args);
    }

};


