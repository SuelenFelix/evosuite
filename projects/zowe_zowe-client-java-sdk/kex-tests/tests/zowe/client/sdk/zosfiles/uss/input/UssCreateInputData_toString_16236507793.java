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

public class UssCreateInputData_toString_16236507793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37934;

    public UssCreateInputData_toString_16236507793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37962 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.CreateType");
        Field term37961 = ((Class) term37962).getDeclaredField((String) "FILE");
        ((Field) term37961).setAccessible(true);
        Object enum118 = ((Field) term37961).get((Object) null);
        term37934 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateInputData"));
        setField(term37934, term37934.getClass(), "type", enum118);
        setField(term37934, term37934.getClass(), "mode", "tlzpzIjMib");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term37934, args);
    }

};


