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

public class UssMountInputData_Builder_mode_9898155914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12187;
     Object enum36;

    public UssMountInputData_Builder_mode_9898155914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12271 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountActionType");
        Field term12270 = ((Class) term12271).getDeclaredField((String) "MOUNT");
        ((Field) term12270).setAccessible(true);
        Object enum34 = ((Field) term12270).get((Object) null);
        Class<? extends Object> term12563 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountModeType");
        Field term12562 = ((Class) term12563).getDeclaredField((String) "READ_WRITE");
        ((Field) term12562).setAccessible(true);
        Object enum35 = ((Field) term12562).get((Object) null);
        term12187 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData$Builder"));
        setField(term12187, term12187.getClass(), "action", enum34);
        setField(term12187, term12187.getClass(), "mountPoint", "DfISiziTgG");
        setField(term12187, term12187.getClass(), "fsType", "XqgfKFvPSD");
        setField(term12187, term12187.getClass(), "mode", enum35);
        Class<? extends Object> term12840 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountModeType");
        Field term12839 = ((Class) term12840).getDeclaredField((String) "READY_ONLY");
        ((Field) term12839).setAccessible(true);
        enum36 = ((Field) term12839).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.types.MountModeType");
        Object[] args = new Object[1];
        args[0] = enum36;
        callMethod(klass, "mode", argTypes, term12187, args);
    }

};


