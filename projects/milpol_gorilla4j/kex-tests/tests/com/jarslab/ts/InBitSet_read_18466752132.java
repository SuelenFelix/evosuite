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

public class InBitSet_read_18466752132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369;

    public InBitSet_read_18466752132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369 = newInstance(Class.forName("com.jarslab.ts.InBitSet"));
        Object term371 = newInstance(Class.forName("java.util.BitSet"));
        long[] term372 = (long[]) newLongArray(1);
        setIntField(term369, term369.getClass(), "position", -1786399638);
        setField(term371, term371.getClass(), "words", term372);
        setIntField(term371, term371.getClass(), "wordsInUse", 2055867847);
        setBooleanField(term371, term371.getClass(), "sizeIsSticky", false);
        setField(term369, term369.getClass(), "bitSet", term371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.InBitSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "read", argTypes, term369, args);
    }

};


