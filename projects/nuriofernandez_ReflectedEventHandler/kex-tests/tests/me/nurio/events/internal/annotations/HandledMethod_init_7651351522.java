package me.nurio.events.internal.annotations;

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
import static me.nurio.events.internal.annotations.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class HandledMethod_init_7651351522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1013;

    public HandledMethod_init_7651351522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1257 = Class.forName((String) "java.util.TreeMap$Entry");
        Object[] term1378 = (Object[]) newArray("java.lang.Class", 0);
        term1013 = ((Class) term1257).getDeclaredMethod((String) "getValue", (Class[]) term1378);
        ((Method) term1013).setAccessible(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.annotations.HandledMethod");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Method");
        argTypes[1] = Class.forName("me.nurio.events.internal.annotations.AnnotationEventHandler");
        Object[] args = new Object[2];
        args[0] = term1013;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


