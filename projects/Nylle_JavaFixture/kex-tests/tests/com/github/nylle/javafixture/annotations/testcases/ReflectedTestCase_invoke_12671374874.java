package com.github.nylle.javafixture.annotations.testcases;

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
import static com.github.nylle.javafixture.annotations.testcases.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;

public class ReflectedTestCase_invoke_12671374874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22;
     Object term28;

    public ReflectedTestCase_invoke_12671374874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term23 = new HashMap();
        term22 = newInstance(Class.forName("com.github.nylle.javafixture.annotations.testcases.ReflectedTestCase"));
        setField(term22, term22.getClass(), "matrix", term23);
        Class<? extends Object> term270 = Class.forName((String) "java.util.regex.ASCII");
        Class term386 = int.class;
        Object[] term387 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term387, 0, term386);
        term28 = ((Class) term270).getDeclaredMethod((String) "isSpace", (Class[]) term387);
        ((Method) term28).setAccessible(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.annotations.testcases.ReflectedTestCase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Method");
        argTypes[1] = Class.forName("com.github.nylle.javafixture.annotations.testcases.TestCase");
        Object[] args = new Object[2];
        args[0] = term28;
        args[1] = null;
        callMethod(klass, "invoke", argTypes, term22, args);
    }

};


