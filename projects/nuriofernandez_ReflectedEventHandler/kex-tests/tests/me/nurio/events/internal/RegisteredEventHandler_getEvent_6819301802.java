package me.nurio.events.internal;

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
import static me.nurio.events.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class RegisteredEventHandler_getEvent_6819301802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2476;

    public RegisteredEventHandler_getEvent_6819301802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2679 = Class.forName((String) "java.util.ServiceLoader$ProviderImpl$1");
        Object[] term2850 = (Object[]) newArray("java.lang.Class", 0);
        Method term2477 = ((Class) term2679).getDeclaredMethod((String) "run", (Class[]) term2850);
        ((Method) term2477).setAccessible(true);
        term2476 = newInstance(Class.forName("me.nurio.events.internal.RegisteredEventHandler"));
        setField(term2476, term2476.getClass(), "method", term2477);
        setField(term2476, term2476.getClass(), "handler", null);
        setField(term2476, term2476.getClass(), "event", null);
        setField(term2476, term2476.getClass(), "listener", null);
        setField(term2476, term2476.getClass(), "priority", null);
        setBooleanField(term2476, term2476.getClass(), "ignoreCancelled", false);
        setField(term2476, term2476.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.RegisteredEventHandler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEvent", argTypes, term2476, args);
    }

};


