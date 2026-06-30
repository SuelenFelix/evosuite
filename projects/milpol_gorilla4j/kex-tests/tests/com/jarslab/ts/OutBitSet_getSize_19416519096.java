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

public class OutBitSet_getSize_19416519096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;

    public OutBitSet_getSize_19416519096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47 = newInstance(Class.forName("com.jarslab.ts.OutBitSet"));
        Object term48 = newInstance(Class.forName("java.util.BitSet"));
        long[] term49 = (long[]) newLongArray(1);
        setField(term48, term48.getClass(), "words", term49);
        setIntField(term48, term48.getClass(), "wordsInUse", 0);
        setBooleanField(term48, term48.getClass(), "sizeIsSticky", false);
        setField(term47, term47.getClass(), "bitSet", term48);
        setIntField(term47, term47.getClass(), "position", 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.OutBitSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSize", argTypes, term47, args);
    }

};


