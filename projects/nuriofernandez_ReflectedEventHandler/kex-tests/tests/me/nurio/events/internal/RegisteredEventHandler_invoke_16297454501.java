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

public class RegisteredEventHandler_invoke_16297454501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1831;

    public RegisteredEventHandler_invoke_16297454501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2042 = Class.forName((String) "java.util.stream.WhileOps$2$1");
        Class term2188 = int.class;
        Object[] term2189 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term2189, 0, term2188);
        Method term1832 = ((Class) term2042).getDeclaredMethod((String) "accept", (Class[]) term2189);
        ((Method) term1832).setAccessible(true);
        Class<? extends Object> term2254 = Class.forName((String) "me.nurio.events.handler.EventPriority");
        Field term2253 = ((Class) term2254).getDeclaredField((String) "HIGHEST");
        ((Field) term2253).setAccessible(true);
        Object enum0 = ((Field) term2253).get((Object) null);
        term1831 = newInstance(Class.forName("me.nurio.events.internal.RegisteredEventHandler"));
        setField(term1831, term1831.getClass(), "method", term1832);
        setField(term1831, term1831.getClass(), "handler", null);
        setField(term1831, term1831.getClass(), "event", null);
        setField(term1831, term1831.getClass(), "listener", null);
        setField(term1831, term1831.getClass(), "priority", enum0);
        setBooleanField(term1831, term1831.getClass(), "ignoreCancelled", true);
        setField(term1831, term1831.getClass(), "name", "ffYhPOzlUs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.RegisteredEventHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("me.nurio.events.handler.Event");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "invoke", argTypes, term1831, args);
    }

};


