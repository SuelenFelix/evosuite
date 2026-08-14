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

public class UssMountInputData_getFsType_9554982523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1975;

    public UssMountInputData_getFsType_9554982523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2039 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountActionType");
        Field term2038 = ((Class) term2039).getDeclaredField((String) "MOUNT");
        ((Field) term2038).setAccessible(true);
        Object enum6 = ((Field) term2038).get((Object) null);
        Class<? extends Object> term2331 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountModeType");
        Field term2330 = ((Class) term2331).getDeclaredField((String) "READY_ONLY");
        ((Field) term2330).setAccessible(true);
        Object enum7 = ((Field) term2330).get((Object) null);
        term1975 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData"));
        setField(term1975, term1975.getClass(), "action", enum6);
        setField(term1975, term1975.getClass(), "mountPoint", "SzjVpOQTyS");
        setField(term1975, term1975.getClass(), "fsType", "MjGYSRKTNF");
        setField(term1975, term1975.getClass(), "mode", enum7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFsType", argTypes, term1975, args);
    }

};


