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
import java.lang.Long;
import java.lang.Integer;

public class OutBitSet_write_11290343775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;
     Object term42;
     Object term44;

    public OutBitSet_write_11290343775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35 = newInstance(Class.forName("com.jarslab.ts.OutBitSet"));
        Object term36 = newInstance(Class.forName("java.util.BitSet"));
        long[] term37 = (long[]) newLongArray(1);
        setField(term36, term36.getClass(), "words", term37);
        setIntField(term36, term36.getClass(), "wordsInUse", 0);
        setBooleanField(term36, term36.getClass(), "sizeIsSticky", false);
        setField(term35, term35.getClass(), "bitSet", term36);
        setIntField(term35, term35.getClass(), "position", -1955890973);
        term42 = new Long(2442117782898005296L);
        term44 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.OutBitSet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term42;
        args[1] = term44;
        callMethod(klass, "write", argTypes, term35, args);
    }

};


