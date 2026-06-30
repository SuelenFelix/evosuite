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

public class OutBitSet_toBytes_2514212127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55;

    public OutBitSet_toBytes_2514212127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55 = newInstance(Class.forName("com.jarslab.ts.OutBitSet"));
        Object term56 = newInstance(Class.forName("java.util.BitSet"));
        long[] term57 = (long[]) newLongArray(1);
        setField(term56, term56.getClass(), "words", term57);
        setIntField(term56, term56.getClass(), "wordsInUse", 0);
        setBooleanField(term56, term56.getClass(), "sizeIsSticky", false);
        setField(term55, term55.getClass(), "bitSet", term56);
        setIntField(term55, term55.getClass(), "position", -1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.OutBitSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBytes", argTypes, term55, args);
    }

};


