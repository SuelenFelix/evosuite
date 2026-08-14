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

public class UssMountInputData_getMode_12879504804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2607;

    public UssMountInputData_getMode_12879504804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2673 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountActionType");
        Field term2672 = ((Class) term2673).getDeclaredField((String) "UNMOUNT");
        ((Field) term2672).setAccessible(true);
        Object enum8 = ((Field) term2672).get((Object) null);
        Class<? extends Object> term2971 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountModeType");
        Field term2970 = ((Class) term2971).getDeclaredField((String) "READ_WRITE");
        ((Field) term2970).setAccessible(true);
        Object enum9 = ((Field) term2970).get((Object) null);
        term2607 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData"));
        setField(term2607, term2607.getClass(), "action", enum8);
        setField(term2607, term2607.getClass(), "mountPoint", "hRNSzYYIrc");
        setField(term2607, term2607.getClass(), "fsType", "RMFIsYGgne");
        setField(term2607, term2607.getClass(), "mode", enum9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMode", argTypes, term2607, args);
    }

};


