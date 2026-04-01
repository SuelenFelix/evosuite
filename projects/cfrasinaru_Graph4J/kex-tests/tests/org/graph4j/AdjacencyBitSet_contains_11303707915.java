package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class AdjacencyBitSet_contains_11303707915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59896;
     Object term59902;

    public AdjacencyBitSet_contains_11303707915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59896 = newInstance(Class.forName("org.graph4j.AdjacencyBitSet"));
        Object term59897 = newInstance(Class.forName("java.util.BitSet"));
        long[] term59898 = (long[]) newLongArray(1);
        setField(term59897, term59897.getClass(), "words", term59898);
        setIntField(term59897, term59897.getClass(), "wordsInUse", 0);
        setBooleanField(term59897, term59897.getClass(), "sizeIsSticky", false);
        setField(term59896, term59896.getClass(), "bitSet", term59897);
        term59902 = new Integer(714123083);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.AdjacencyBitSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term59902;
        callMethod(klass, "contains", argTypes, term59896, args);
    }

};


