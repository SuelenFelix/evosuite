package com.github.nscuro.bradamsang.radamsa;

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
import static com.github.nscuro.bradamsang.radamsa.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RadamsaOptions_withSample_16746541671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187;

    public RadamsaOptions_withSample_16746541671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187 = (byte[]) newByteArray(5);
        setByteElement(term187, 0, (byte) -10);
        setByteElement(term187, 1, (byte) 79);
        setByteElement(term187, 2, (byte) -119);
        setByteElement(term187, 3, (byte) -66);
        setByteElement(term187, 4, (byte) 83);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nscuro.bradamsang.radamsa.RadamsaOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term187;
        callMethod(klass, "withSample", argTypes, null, args);
    }

};


