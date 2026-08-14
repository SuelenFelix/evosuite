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

public class ZosLogInputData_Builder_direction_10400516363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1239;
     Object enum5;

    public ZosLogInputData_Builder_direction_10400516363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1317 = Class.forName((String) "zowe.client.sdk.zoslogs.types.HardCopyType");
        Field term1316 = ((Class) term1317).getDeclaredField((String) "OPERLOG");
        ((Field) term1316).setAccessible(true);
        Object enum4 = ((Field) term1316).get((Object) null);
        Class<? extends Object> term1555 = Class.forName((String) "zowe.client.sdk.zoslogs.types.DirectionType");
        Field term1554 = ((Class) term1555).getDeclaredField((String) "FORWARD");
        ((Field) term1554).setAccessible(true);
        enum5 = ((Field) term1554).get((Object) null);
        term1239 = newInstance(Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData$Builder"));
        setField(term1239, term1239.getClass(), "startTime", "EGtDIRbSSb");
        setField(term1239, term1239.getClass(), "hardCopy", enum4);
        setField(term1239, term1239.getClass(), "direction", enum5);
        setField(term1239, term1239.getClass(), "timeRange", "SzjVpOQTyS");
        setBooleanField(term1239, term1239.getClass(), "processResponses", false);
        setIntField(term1239, term1239.getClass(), "queryCount", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zoslogs.types.DirectionType");
        Object[] args = new Object[1];
        args[0] = enum5;
        callMethod(klass, "direction", argTypes, term1239, args);
    }

};


