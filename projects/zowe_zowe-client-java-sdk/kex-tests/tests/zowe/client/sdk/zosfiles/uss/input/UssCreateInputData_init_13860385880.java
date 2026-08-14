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

public class UssCreateInputData_init_13860385880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum115;

    public UssCreateInputData_init_13860385880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37119 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.CreateType");
        Field term37118 = ((Class) term37119).getDeclaredField((String) "FILE");
        ((Field) term37118).setAccessible(true);
        enum115 = ((Field) term37118).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateInputData");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.types.CreateType");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = enum115;
        args[1] = "tXfQjSqDzN";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


