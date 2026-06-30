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

public class OutBitSet_flipBit_11946715283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17;

    public OutBitSet_flipBit_11946715283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17 = newInstance(Class.forName("com.jarslab.ts.OutBitSet"));
        Object term18 = newInstance(Class.forName("java.util.BitSet"));
        long[] term19 = (long[]) newLongArray(1);
        setField(term18, term18.getClass(), "words", term19);
        setIntField(term18, term18.getClass(), "wordsInUse", 0);
        setBooleanField(term18, term18.getClass(), "sizeIsSticky", false);
        setField(term17, term17.getClass(), "bitSet", term18);
        setIntField(term17, term17.getClass(), "position", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.OutBitSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flipBit", argTypes, term17, args);
    }

};


