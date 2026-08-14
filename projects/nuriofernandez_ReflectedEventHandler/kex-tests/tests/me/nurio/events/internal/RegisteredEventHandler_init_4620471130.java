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

public class RegisteredEventHandler_init_4620471130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1381;

    public RegisteredEventHandler_init_4620471130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1603 = Class.forName((String) "java.util.stream.Nodes$ToArrayTask$OfPrimitive");
        Object[] term1830 = (Object[]) newArray("java.lang.Class", 0);
        Method term1382 = ((Class) term1603).getDeclaredMethod((String) "copyNodeToArray", (Class[]) term1830);
        ((Method) term1382).setAccessible(true);
        term1381 = newInstance(Class.forName("me.nurio.events.internal.annotations.HandledMethod"));
        setField(term1381, term1381.getClass(), "method", term1382);
        setField(term1381, term1381.getClass(), "handler", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.RegisteredEventHandler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("me.nurio.events.handler.EventListener");
        argTypes[1] = Class.forName("me.nurio.events.internal.annotations.HandledMethod");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1381;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


