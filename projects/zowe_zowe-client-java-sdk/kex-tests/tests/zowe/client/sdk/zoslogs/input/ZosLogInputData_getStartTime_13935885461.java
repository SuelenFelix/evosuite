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

public class ZosLogInputData_getStartTime_13935885461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4123;

    public ZosLogInputData_getStartTime_13935885461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4200 = Class.forName((String) "zowe.client.sdk.zoslogs.types.HardCopyType");
        Field term4199 = ((Class) term4200).getDeclaredField((String) "OPERLOG");
        ((Field) term4199).setAccessible(true);
        Object enum14 = ((Field) term4199).get((Object) null);
        Class<? extends Object> term4438 = Class.forName((String) "zowe.client.sdk.zoslogs.types.DirectionType");
        Field term4437 = ((Class) term4438).getDeclaredField((String) "FORWARD");
        ((Field) term4437).setAccessible(true);
        Object enum15 = ((Field) term4437).get((Object) null);
        term4123 = newInstance(Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData"));
        setField(term4123, term4123.getClass(), "startTime", "ZiaGIbnzTs");
        setField(term4123, term4123.getClass(), "hardCopy", enum14);
        setField(term4123, term4123.getClass(), "direction", enum15);
        setField(term4123, term4123.getClass(), "timeRange", "tbcdzjIfER");
        setBooleanField(term4123, term4123.getClass(), "processResponses", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartTime", argTypes, term4123, args);
    }

};


