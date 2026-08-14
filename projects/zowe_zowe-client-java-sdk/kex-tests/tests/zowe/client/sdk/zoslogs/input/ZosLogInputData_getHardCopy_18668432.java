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

public class ZosLogInputData_getHardCopy_18668432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4690;

    public ZosLogInputData_getHardCopy_18668432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4767 = Class.forName((String) "zowe.client.sdk.zoslogs.types.HardCopyType");
        Field term4766 = ((Class) term4767).getDeclaredField((String) "SYSLOG");
        ((Field) term4766).setAccessible(true);
        Object enum16 = ((Field) term4766).get((Object) null);
        Class<? extends Object> term5002 = Class.forName((String) "zowe.client.sdk.zoslogs.types.DirectionType");
        Field term5001 = ((Class) term5002).getDeclaredField((String) "BACKWARD");
        ((Field) term5001).setAccessible(true);
        Object enum17 = ((Field) term5001).get((Object) null);
        term4690 = newInstance(Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData"));
        setField(term4690, term4690.getClass(), "startTime", "HyxfbSQYBe");
        setField(term4690, term4690.getClass(), "hardCopy", enum16);
        setField(term4690, term4690.getClass(), "direction", enum17);
        setField(term4690, term4690.getClass(), "timeRange", "pCTimMblYc");
        setBooleanField(term4690, term4690.getClass(), "processResponses", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHardCopy", argTypes, term4690, args);
    }

};


