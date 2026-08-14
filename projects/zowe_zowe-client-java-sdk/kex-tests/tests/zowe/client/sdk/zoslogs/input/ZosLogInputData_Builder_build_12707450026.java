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

public class ZosLogInputData_Builder_build_12707450026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2967;

    public ZosLogInputData_Builder_build_12707450026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3045 = Class.forName((String) "zowe.client.sdk.zoslogs.types.HardCopyType");
        Field term3044 = ((Class) term3045).getDeclaredField((String) "SYSLOG");
        ((Field) term3044).setAccessible(true);
        Object enum10 = ((Field) term3044).get((Object) null);
        Class<? extends Object> term3280 = Class.forName((String) "zowe.client.sdk.zoslogs.types.DirectionType");
        Field term3279 = ((Class) term3280).getDeclaredField((String) "BACKWARD");
        ((Field) term3279).setAccessible(true);
        Object enum11 = ((Field) term3279).get((Object) null);
        term2967 = newInstance(Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData$Builder"));
        setField(term2967, term2967.getClass(), "startTime", "MxlszYVzRf");
        setField(term2967, term2967.getClass(), "hardCopy", enum10);
        setField(term2967, term2967.getClass(), "direction", enum11);
        setField(term2967, term2967.getClass(), "timeRange", "LQFpaHEwXR");
        setBooleanField(term2967, term2967.getClass(), "processResponses", true);
        setIntField(term2967, term2967.getClass(), "queryCount", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term2967, args);
    }

};


