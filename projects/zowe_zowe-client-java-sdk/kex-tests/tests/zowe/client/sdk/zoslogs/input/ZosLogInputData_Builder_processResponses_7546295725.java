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
import java.lang.Boolean;

public class ZosLogInputData_Builder_processResponses_7546295725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2397;
     Object term2464;

    public ZosLogInputData_Builder_processResponses_7546295725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2477 = Class.forName((String) "zowe.client.sdk.zoslogs.types.HardCopyType");
        Field term2476 = ((Class) term2477).getDeclaredField((String) "SYSLOG");
        ((Field) term2476).setAccessible(true);
        Object enum8 = ((Field) term2476).get((Object) null);
        Class<? extends Object> term2712 = Class.forName((String) "zowe.client.sdk.zoslogs.types.DirectionType");
        Field term2711 = ((Class) term2712).getDeclaredField((String) "BACKWARD");
        ((Field) term2711).setAccessible(true);
        Object enum9 = ((Field) term2711).get((Object) null);
        term2397 = newInstance(Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData$Builder"));
        setField(term2397, term2397.getClass(), "startTime", "NRdvgJlhkX");
        setField(term2397, term2397.getClass(), "hardCopy", enum8);
        setField(term2397, term2397.getClass(), "direction", enum9);
        setField(term2397, term2397.getClass(), "timeRange", "uuaPigETmJ");
        setBooleanField(term2397, term2397.getClass(), "processResponses", true);
        setIntField(term2397, term2397.getClass(), "queryCount", -1922583790);
        term2464 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2464;
        callMethod(klass, "processResponses", argTypes, term2397, args);
    }

};


