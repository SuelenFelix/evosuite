package com.jarslab.ts;

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
import static com.jarslab.ts.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ByteUtils_concat_10218746822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401;
     Object term405;

    public ByteUtils_concat_10218746822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term401 = (byte[]) newByteArray(3);
        setByteElement(term401, 0, (byte) 79);
        setByteElement(term401, 1, (byte) -119);
        setByteElement(term401, 2, (byte) -66);
        term405 = (byte[]) newByteArray(4);
        setByteElement(term405, 0, (byte) 83);
        setByteElement(term405, 1, (byte) 74);
        setByteElement(term405, 2, (byte) -71);
        setByteElement(term405, 3, (byte) 49);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.ByteUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term401;
        args[1] = term405;
        callMethod(klass, "concat", argTypes, null, args);
    }

};


