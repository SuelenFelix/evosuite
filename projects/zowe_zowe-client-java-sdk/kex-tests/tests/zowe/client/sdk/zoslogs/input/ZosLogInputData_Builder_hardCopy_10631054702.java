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

public class ZosLogInputData_Builder_hardCopy_10631054702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term671;
     Object enum2;

    public ZosLogInputData_Builder_hardCopy_10631054702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term749 = Class.forName((String) "zowe.client.sdk.zoslogs.types.HardCopyType");
        Field term748 = ((Class) term749).getDeclaredField((String) "OPERLOG");
        ((Field) term748).setAccessible(true);
        enum2 = ((Field) term748).get((Object) null);
        Class<? extends Object> term987 = Class.forName((String) "zowe.client.sdk.zoslogs.types.DirectionType");
        Field term986 = ((Class) term987).getDeclaredField((String) "FORWARD");
        ((Field) term986).setAccessible(true);
        Object enum3 = ((Field) term986).get((Object) null);
        term671 = newInstance(Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData$Builder"));
        setField(term671, term671.getClass(), "startTime", "xxtlPwDYFs");
        setField(term671, term671.getClass(), "hardCopy", enum2);
        setField(term671, term671.getClass(), "direction", enum3);
        setField(term671, term671.getClass(), "timeRange", "jJCZpVmanW");
        setBooleanField(term671, term671.getClass(), "processResponses", false);
        setIntField(term671, term671.getClass(), "queryCount", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zoslogs.types.HardCopyType");
        Object[] args = new Object[1];
        args[0] = enum2;
        callMethod(klass, "hardCopy", argTypes, term671, args);
    }

};


