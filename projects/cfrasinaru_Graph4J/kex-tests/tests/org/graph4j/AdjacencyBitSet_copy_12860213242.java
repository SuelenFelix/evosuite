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

public class AdjacencyBitSet_copy_12860213242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59871;

    public AdjacencyBitSet_copy_12860213242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59871 = newInstance(Class.forName("org.graph4j.AdjacencyBitSet"));
        Object term59872 = newInstance(Class.forName("java.util.BitSet"));
        long[] term59873 = (long[]) newLongArray(1);
        setField(term59872, term59872.getClass(), "words", term59873);
        setIntField(term59872, term59872.getClass(), "wordsInUse", 0);
        setBooleanField(term59872, term59872.getClass(), "sizeIsSticky", false);
        setField(term59871, term59871.getClass(), "bitSet", term59872);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.AdjacencyBitSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term59871, args);
    }

};


