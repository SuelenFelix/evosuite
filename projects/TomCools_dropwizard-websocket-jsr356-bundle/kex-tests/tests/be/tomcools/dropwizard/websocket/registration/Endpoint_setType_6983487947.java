package be.tomcools.dropwizard.websocket.registration;

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
import static be.tomcools.dropwizard.websocket.registration.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Endpoint_setType_6983487947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;

    public Endpoint_setType_6983487947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term140 = Class.forName((String) "be.tomcools.dropwizard.websocket.registration.endpointtypes.EndpointType");
        Field term139 = ((Class) term140).getDeclaredField((String) "JAVA_ANNOTATED_ENDPOINT");
        ((Field) term139).setAccessible(true);
        enum0 = ((Field) term139).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("be.tomcools.dropwizard.websocket.registration.Endpoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("be.tomcools.dropwizard.websocket.registration.endpointtypes.EndpointType");
        Object[] args = new Object[1];
        args[0] = enum0;
        callMethod(klass, "setType", argTypes, null, args);
    }

};


