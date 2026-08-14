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

public class ZosLogInputData_init_5373213800 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3555;

    public ZosLogInputData_init_5373213800() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3633 = Class.forName((String) "zowe.client.sdk.zoslogs.types.HardCopyType");
        Field term3632 = ((Class) term3633).getDeclaredField((String) "SYSLOG");
        ((Field) term3632).setAccessible(true);
        Object enum12 = ((Field) term3632).get((Object) null);
        Class<? extends Object> term3868 = Class.forName((String) "zowe.client.sdk.zoslogs.types.DirectionType");
        Field term3867 = ((Class) term3868).getDeclaredField((String) "BACKWARD");
        ((Field) term3867).setAccessible(true);
        Object enum13 = ((Field) term3867).get((Object) null);
        term3555 = newInstance(Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData$Builder"));
        setField(term3555, term3555.getClass(), "startTime", "oVcInYnLWB");
        setField(term3555, term3555.getClass(), "hardCopy", enum12);
        setField(term3555, term3555.getClass(), "direction", enum13);
        setField(term3555, term3555.getClass(), "timeRange", "aJlieCFVtF");
        setBooleanField(term3555, term3555.getClass(), "processResponses", true);
        setIntField(term3555, term3555.getClass(), "queryCount", -1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term3555;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


