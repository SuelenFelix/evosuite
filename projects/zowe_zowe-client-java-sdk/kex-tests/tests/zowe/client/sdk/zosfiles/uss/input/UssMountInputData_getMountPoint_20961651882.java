package zowe.client.sdk.zosfiles.uss.input;

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
import static zowe.client.sdk.zosfiles.uss.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class UssMountInputData_getMountPoint_20961651882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1343;

    public UssMountInputData_getMountPoint_20961651882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1407 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountActionType");
        Field term1406 = ((Class) term1407).getDeclaredField((String) "MOUNT");
        ((Field) term1406).setAccessible(true);
        Object enum4 = ((Field) term1406).get((Object) null);
        Class<? extends Object> term1699 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountModeType");
        Field term1698 = ((Class) term1699).getDeclaredField((String) "READY_ONLY");
        ((Field) term1698).setAccessible(true);
        Object enum5 = ((Field) term1698).get((Object) null);
        term1343 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData"));
        setField(term1343, term1343.getClass(), "action", enum4);
        setField(term1343, term1343.getClass(), "mountPoint", "jJCZpVmanW");
        setField(term1343, term1343.getClass(), "fsType", "EGtDIRbSSb");
        setField(term1343, term1343.getClass(), "mode", enum5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMountPoint", argTypes, term1343, args);
    }

};


