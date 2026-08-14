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

public class UssMountInputData_toString_8513864405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3247;

    public UssMountInputData_toString_8513864405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3313 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountActionType");
        Field term3312 = ((Class) term3313).getDeclaredField((String) "UNMOUNT");
        ((Field) term3312).setAccessible(true);
        Object enum10 = ((Field) term3312).get((Object) null);
        Class<? extends Object> term3611 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountModeType");
        Field term3610 = ((Class) term3611).getDeclaredField((String) "READ_WRITE");
        ((Field) term3610).setAccessible(true);
        Object enum11 = ((Field) term3610).get((Object) null);
        term3247 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData"));
        setField(term3247, term3247.getClass(), "action", enum10);
        setField(term3247, term3247.getClass(), "mountPoint", "NRdvgJlhkX");
        setField(term3247, term3247.getClass(), "fsType", "uuaPigETmJ");
        setField(term3247, term3247.getClass(), "mode", enum11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3247, args);
    }

};


