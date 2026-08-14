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

public class UssMountInputData_init_2273164160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public UssMountInputData_init_2273164160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term101 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountActionType");
        Field term100 = ((Class) term101).getDeclaredField((String) "MOUNT");
        ((Field) term100).setAccessible(true);
        Object enum0 = ((Field) term100).get((Object) null);
        Class<? extends Object> term435 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountModeType");
        Field term434 = ((Class) term435).getDeclaredField((String) "READY_ONLY");
        ((Field) term434).setAccessible(true);
        Object enum1 = ((Field) term434).get((Object) null);
        term1 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData$Builder"));
        setField(term1, term1.getClass(), "action", enum0);
        setField(term1, term1.getClass(), "mountPoint", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "fsType", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "mode", enum1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


