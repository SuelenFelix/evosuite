package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class PseudographImpl_init_43579870913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118372;
     Object term118374;
     Object term118376;
     Object term118378;
     Object term118380;
     Object term118382;
     Object term118384;

    public PseudographImpl_init_43579870913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118372 = new Integer(0);
        term118374 = new Integer(0);
        term118376 = new Boolean(false);
        term118378 = new Boolean(false);
        term118380 = new Boolean(false);
        term118382 = new Integer(0);
        term118384 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.PseudographImpl");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        Object[] args = new Object[8];
        args[0] = null;
        args[1] = term118372;
        args[2] = term118374;
        args[3] = term118376;
        args[4] = term118378;
        args[5] = term118380;
        args[6] = term118382;
        args[7] = term118384;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


