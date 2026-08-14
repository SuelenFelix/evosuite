package com.voodoodyne.hattery.util;

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
import static com.voodoodyne.hattery.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TeeOutputStream_write_7186714252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137;
     Object term138;

    public TeeOutputStream_write_7186714252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137 = newInstance(Class.forName("com.voodoodyne.hattery.util.TeeOutputStream"));
        setField(term137, term137.getClass(), "one", null);
        setField(term137, term137.getClass(), "two", null);
        term138 = (byte[]) newByteArray(4);
        setByteElement(term138, 0, (byte) 47);
        setByteElement(term138, 1, (byte) 48);
        setByteElement(term138, 2, (byte) 89);
        setByteElement(term138, 3, (byte) 75);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.voodoodyne.hattery.util.TeeOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term138;
        callMethod(klass, "write", argTypes, term137, args);
    }

};


