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

public class ZosLogInputData_getDirection_11775856823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5257;

    public ZosLogInputData_getDirection_11775856823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5334 = Class.forName((String) "zowe.client.sdk.zoslogs.types.HardCopyType");
        Field term5333 = ((Class) term5334).getDeclaredField((String) "OPERLOG");
        ((Field) term5333).setAccessible(true);
        Object enum18 = ((Field) term5333).get((Object) null);
        Class<? extends Object> term5572 = Class.forName((String) "zowe.client.sdk.zoslogs.types.DirectionType");
        Field term5571 = ((Class) term5572).getDeclaredField((String) "FORWARD");
        ((Field) term5571).setAccessible(true);
        Object enum19 = ((Field) term5571).get((Object) null);
        term5257 = newInstance(Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData"));
        setField(term5257, term5257.getClass(), "startTime", "hNxWaHcfhY");
        setField(term5257, term5257.getClass(), "hardCopy", enum18);
        setField(term5257, term5257.getClass(), "direction", enum19);
        setField(term5257, term5257.getClass(), "timeRange", "RkybSrpybU");
        setBooleanField(term5257, term5257.getClass(), "processResponses", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDirection", argTypes, term5257, args);
    }

};


