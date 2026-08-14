package zowe.client.sdk.rest;

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
import static zowe.client.sdk.rest.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ZosmfRequestFactory_buildRequest_10571040941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum2;

    public ZosmfRequestFactory_buildRequest_10571040941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9073 = Class.forName((String) "zowe.client.sdk.rest.type.ZosmfRequestType");
        Field term9072 = ((Class) term9073).getDeclaredField((String) "GET_TEXT");
        ((Field) term9072).setAccessible(true);
        enum2 = ((Field) term9072).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.rest.ZosmfRequestFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("zowe.client.sdk.core.ZosConnection");
        argTypes[1] = Class.forName("zowe.client.sdk.rest.type.ZosmfRequestType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = enum2;
        callMethod(klass, "buildRequest", argTypes, null, args);
    }

};


