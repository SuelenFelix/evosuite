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
import java.lang.Integer;

public class InBitSet_read_18466732277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389;
     Object term391;

    public InBitSet_read_18466732277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term389 = newInstance(Class.forName("com.jarslab.ts.InBitSet"));
        setIntField(term389, term389.getClass(), "position", 0);
        setField(term389, term389.getClass(), "bitSet", null);
        term391 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.InBitSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term391;
        callMethod(klass, "read", argTypes, term389, args);
    }

};


