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

public class HandledMethod_getHandler_21105823551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660;

    public HandledMethod_getHandler_21105823551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term851 = Class.forName((String) "java.nio.ByteBufferAsCharBufferB");
        Object[] term1012 = (Object[]) newArray("java.lang.Class", 0);
        Method term661 = ((Class) term851).getDeclaredMethod((String) "isReadOnly", (Class[]) term1012);
        ((Method) term661).setAccessible(false);
        term660 = newInstance(Class.forName("me.nurio.events.internal.annotations.HandledMethod"));
        setField(term660, term660.getClass(), "method", term661);
        setField(term660, term660.getClass(), "handler", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.annotations.HandledMethod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHandler", argTypes, term660, args);
    }

};


