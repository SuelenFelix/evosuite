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

public class OutBitSet_copy_6158058568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63;

    public OutBitSet_copy_6158058568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63 = newInstance(Class.forName("com.jarslab.ts.OutBitSet"));
        Object term64 = newInstance(Class.forName("java.util.BitSet"));
        long[] term65 = (long[]) newLongArray(1);
        setField(term64, term64.getClass(), "words", term65);
        setIntField(term64, term64.getClass(), "wordsInUse", 0);
        setBooleanField(term64, term64.getClass(), "sizeIsSticky", false);
        setField(term63, term63.getClass(), "bitSet", term64);
        setIntField(term63, term63.getClass(), "position", 1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.OutBitSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term63, args);
    }

};


