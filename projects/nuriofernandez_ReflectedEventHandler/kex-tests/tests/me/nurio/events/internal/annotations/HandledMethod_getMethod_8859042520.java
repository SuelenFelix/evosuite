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

public class HandledMethod_getMethod_8859042520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public HandledMethod_getMethod_8859042520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term201 = Class.forName((String) "java.lang.invoke.ConstantBootstraps");
        Class<? extends Object> term417 = Class.forName((String) "java.lang.invoke.MethodHandles$Lookup");
        Class<? extends Object> term436 = Class.forName((String) "java.lang.String");
        Class<? extends Object> term454 = Class.forName((String) "java.lang.Class");
        Object[] term455 = (Object[]) newArray("java.lang.Class", 3);
        setElement(term455, 0, term417);
        setElement(term455, 1, term436);
        setElement(term455, 2, term454);
        Method term2 = ((Class) term201).getDeclaredMethod((String) "enumConstant", (Class[]) term455);
        ((Method) term2).setAccessible(true);
        term1 = newInstance(Class.forName("me.nurio.events.internal.annotations.HandledMethod"));
        setField(term1, term1.getClass(), "method", term2);
        setField(term1, term1.getClass(), "handler", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.annotations.HandledMethod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMethod", argTypes, term1, args);
    }

};


