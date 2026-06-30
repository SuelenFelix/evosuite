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

public class OutBitSet_flipBits_19794623494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term32;

    public OutBitSet_flipBits_19794623494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = newInstance(Class.forName("com.jarslab.ts.OutBitSet"));
        Object term26 = newInstance(Class.forName("java.util.BitSet"));
        long[] term27 = (long[]) newLongArray(1);
        setField(term26, term26.getClass(), "words", term27);
        setIntField(term26, term26.getClass(), "wordsInUse", 0);
        setBooleanField(term26, term26.getClass(), "sizeIsSticky", false);
        setField(term25, term25.getClass(), "bitSet", term26);
        setIntField(term25, term25.getClass(), "position", -1922583790);
        term32 = new Integer(-616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.OutBitSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term32;
        callMethod(klass, "flipBits", argTypes, term25, args);
    }

};


