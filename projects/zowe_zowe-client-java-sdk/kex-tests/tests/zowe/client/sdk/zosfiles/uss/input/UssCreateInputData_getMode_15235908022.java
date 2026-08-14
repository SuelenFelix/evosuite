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

public class UssCreateInputData_getMode_15235908022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37653;

    public UssCreateInputData_getMode_15235908022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37681 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.CreateType");
        Field term37680 = ((Class) term37681).getDeclaredField((String) "FILE");
        ((Field) term37680).setAccessible(true);
        Object enum117 = ((Field) term37680).get((Object) null);
        term37653 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateInputData"));
        setField(term37653, term37653.getClass(), "type", enum117);
        setField(term37653, term37653.getClass(), "mode", "vGiuZVPJNH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMode", argTypes, term37653, args);
    }

};


