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
import java.lang.Object;
import java.lang.Integer;

public class InBitSet_read_18466732273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377;
     Object term384;

    public InBitSet_read_18466732273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term377 = newInstance(Class.forName("com.jarslab.ts.InBitSet"));
        Object term379 = newInstance(Class.forName("java.util.BitSet"));
        long[] term380 = (long[]) newLongArray(1);
        setIntField(term377, term377.getClass(), "position", -1048298087);
        setField(term379, term379.getClass(), "words", term380);
        setIntField(term379, term379.getClass(), "wordsInUse", 292681826);
        setBooleanField(term379, term379.getClass(), "sizeIsSticky", true);
        setField(term377, term377.getClass(), "bitSet", term379);
        term384 = new Integer(458147407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.InBitSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term384;
        callMethod(klass, "read", argTypes, term377, args);
    }

};


