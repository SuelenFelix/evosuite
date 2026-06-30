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

public class OutBitSet_skipBit_6645861062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;

    public OutBitSet_skipBit_6645861062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9 = newInstance(Class.forName("com.jarslab.ts.OutBitSet"));
        Object term10 = newInstance(Class.forName("java.util.BitSet"));
        long[] term11 = (long[]) newLongArray(1);
        setField(term10, term10.getClass(), "words", term11);
        setIntField(term10, term10.getClass(), "wordsInUse", 0);
        setBooleanField(term10, term10.getClass(), "sizeIsSticky", false);
        setField(term9, term9.getClass(), "bitSet", term10);
        setIntField(term9, term9.getClass(), "position", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.OutBitSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipBit", argTypes, term9, args);
    }

};


