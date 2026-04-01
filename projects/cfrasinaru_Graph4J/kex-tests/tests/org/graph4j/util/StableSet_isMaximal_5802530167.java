package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StableSet_isMaximal_5802530167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154824;

    public StableSet_isMaximal_5802530167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154824 = newInstance(Class.forName("org.graph4j.util.StableSet"));
        Object term154825 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term154826 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term154830 = (int[]) newIntArray(3);
        Object term154836 = newInstance(Class.forName("java.util.BitSet"));
        long[] term154837 = (long[]) newLongArray(1);
        setField(term154825, term154825.getClass(), "table", term154826);
        setIntField(term154825, term154825.getClass(), "count", 843529098);
        setIntField(term154825, term154825.getClass(), "threshold", 15);
        setFloatField(term154825, term154825.getClass(), "loadFactor", 0.75F);
        setField(term154824, term154824.getClass(), "posMap", term154825);
        setField(term154824, term154824.getClass(), "graph", null);
        setIntElement(term154830, 0, -1182260153);
        setIntElement(term154830, 1, -1338657460);
        setIntElement(term154830, 2, 780427198);
        setField(term154824, term154824.getClass(), "vertices", term154830);
        setIntField(term154824, term154824.getClass(), "numVertices", 44427923);
        setIntField(term154824, term154824.getClass(), "first", 1595690379);
        setField(term154836, term154836.getClass(), "words", term154837);
        setIntField(term154836, term154836.getClass(), "wordsInUse", -1259753114);
        setBooleanField(term154836, term154836.getClass(), "sizeIsSticky", false);
        setField(term154824, term154824.getClass(), "bitset", term154836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.StableSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isMaximal", argTypes, term154824, args);
    }

};


