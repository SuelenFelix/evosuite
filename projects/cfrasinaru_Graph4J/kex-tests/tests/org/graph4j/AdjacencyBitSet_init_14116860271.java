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

public class AdjacencyBitSet_init_14116860271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59865;

    public AdjacencyBitSet_init_14116860271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59865 = newInstance(Class.forName("java.util.BitSet"));
        long[] term59866 = (long[]) newLongArray(1);
        setField(term59865, term59865.getClass(), "words", term59866);
        setIntField(term59865, term59865.getClass(), "wordsInUse", -345324675);
        setBooleanField(term59865, term59865.getClass(), "sizeIsSticky", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.AdjacencyBitSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.BitSet");
        Object[] args = new Object[1];
        args[0] = term59865;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


