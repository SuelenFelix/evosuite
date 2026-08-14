package zowe.client.sdk.zosfiles.uss.methods;

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
import static zowe.client.sdk.zosfiles.uss.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class UssMount_mountCommon_7115019734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1246;
     Object term1259;

    public UssMount_mountCommon_7115019734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1246 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssMount"));
        setField(term1246, term1246.getClass(), "connection", null);
        setField(term1246, term1246.getClass(), "request", null);
        Class<? extends Object> term1369 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountActionType");
        Field term1368 = ((Class) term1369).getDeclaredField((String) "MOUNT");
        ((Field) term1368).setAccessible(true);
        Object enum3 = ((Field) term1368).get((Object) null);
        Class<? extends Object> term1703 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountModeType");
        Field term1702 = ((Class) term1703).getDeclaredField((String) "READY_ONLY");
        ((Field) term1702).setAccessible(true);
        Object enum4 = ((Field) term1702).get((Object) null);
        term1259 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData"));
        setField(term1259, term1259.getClass(), "action", enum3);
        setField(term1259, term1259.getClass(), "mountPoint", "MxlszYVzRf");
        setField(term1259, term1259.getClass(), "fsType", "LQFpaHEwXR");
        setField(term1259, term1259.getClass(), "mode", enum4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssMount");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData");
        Object[] args = new Object[2];
        args[0] = "uuaPigETmJ";
        args[1] = term1259;
        callMethod(klass, "mountCommon", argTypes, term1246, args);
    }

};


