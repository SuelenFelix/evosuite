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

public class AdjacencyBitSet_remove_17848259024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59887;
     Object term59893;

    public AdjacencyBitSet_remove_17848259024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59887 = newInstance(Class.forName("org.graph4j.AdjacencyBitSet"));
        Object term59888 = newInstance(Class.forName("java.util.BitSet"));
        long[] term59889 = (long[]) newLongArray(1);
        setField(term59888, term59888.getClass(), "words", term59889);
        setIntField(term59888, term59888.getClass(), "wordsInUse", 0);
        setBooleanField(term59888, term59888.getClass(), "sizeIsSticky", false);
        setField(term59887, term59887.getClass(), "bitSet", term59888);
        term59893 = new Integer(-269402208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.AdjacencyBitSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term59893;
        callMethod(klass, "remove", argTypes, term59887, args);
    }

};


