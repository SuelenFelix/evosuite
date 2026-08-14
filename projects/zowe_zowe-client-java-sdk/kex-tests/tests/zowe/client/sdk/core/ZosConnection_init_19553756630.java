package zowe.client.sdk.core;

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
import static zowe.client.sdk.core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class ZosConnection_init_19553756630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term574;
     Object enum0;

    public ZosConnection_init_19553756630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term574 = new Integer(1227103734);
        Class<? extends Object> term643 = Class.forName((String) "zowe.client.sdk.core.AuthType");
        Field term642 = ((Class) term643).getDeclaredField((String) "TOKEN");
        ((Field) term642).setAccessible(true);
        enum0 = ((Field) term642).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.core.ZosConnection");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("zowe.client.sdk.core.AuthType");
        Object[] args = new Object[4];
        args[0] = "BYqFIqCKAV";
        args[1] = term574;
        args[2] = "vrQLuWIDJX";
        args[3] = enum0;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


