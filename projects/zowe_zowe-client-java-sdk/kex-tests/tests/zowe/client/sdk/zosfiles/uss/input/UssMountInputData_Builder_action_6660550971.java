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

public class UssMountInputData_Builder_action_6660550971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10231;
     Object enum28;

    public UssMountInputData_Builder_action_6660550971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10297 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountActionType");
        Field term10296 = ((Class) term10297).getDeclaredField((String) "UNMOUNT");
        ((Field) term10296).setAccessible(true);
        enum28 = ((Field) term10296).get((Object) null);
        Class<? extends Object> term10595 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountModeType");
        Field term10594 = ((Class) term10595).getDeclaredField((String) "READ_WRITE");
        ((Field) term10594).setAccessible(true);
        Object enum29 = ((Field) term10594).get((Object) null);
        term10231 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData$Builder"));
        setField(term10231, term10231.getClass(), "action", enum28);
        setField(term10231, term10231.getClass(), "mountPoint", "TimdotUuNC");
        setField(term10231, term10231.getClass(), "fsType", "PkWMRdJcBb");
        setField(term10231, term10231.getClass(), "mode", enum29);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.types.MountActionType");
        Object[] args = new Object[1];
        args[0] = enum28;
        callMethod(klass, "action", argTypes, term10231, args);
    }

};


