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

public class UssCreateInputData_getType_17063339971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37372;

    public UssCreateInputData_getType_17063339971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37400 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.CreateType");
        Field term37399 = ((Class) term37400).getDeclaredField((String) "FILE");
        ((Field) term37399).setAccessible(true);
        Object enum116 = ((Field) term37399).get((Object) null);
        term37372 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateInputData"));
        setField(term37372, term37372.getClass(), "type", enum116);
        setField(term37372, term37372.getClass(), "mode", "BjugTaMcxJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term37372, args);
    }

};


