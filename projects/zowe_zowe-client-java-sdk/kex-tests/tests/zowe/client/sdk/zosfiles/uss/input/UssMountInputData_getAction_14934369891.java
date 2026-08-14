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

public class UssMountInputData_getAction_14934369891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term711;

    public UssMountInputData_getAction_14934369891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term775 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountActionType");
        Field term774 = ((Class) term775).getDeclaredField((String) "MOUNT");
        ((Field) term774).setAccessible(true);
        Object enum2 = ((Field) term774).get((Object) null);
        Class<? extends Object> term1067 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountModeType");
        Field term1066 = ((Class) term1067).getDeclaredField((String) "READY_ONLY");
        ((Field) term1066).setAccessible(true);
        Object enum3 = ((Field) term1066).get((Object) null);
        term711 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData"));
        setField(term711, term711.getClass(), "action", enum2);
        setField(term711, term711.getClass(), "mountPoint", "MuLcgQHgqz");
        setField(term711, term711.getClass(), "fsType", "xxtlPwDYFs");
        setField(term711, term711.getClass(), "mode", enum3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAction", argTypes, term711, args);
    }

};


