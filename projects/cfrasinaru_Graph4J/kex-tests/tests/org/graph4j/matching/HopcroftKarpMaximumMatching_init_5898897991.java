package org.graph4j.matching;

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
import static org.graph4j.matching.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class HopcroftKarpMaximumMatching_init_5898897991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term20;

    public HopcroftKarpMaximumMatching_init_5898897991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.graph4j.util.StableSet"));
        Object term2 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term7 = (int[]) newIntArray(5);
        Object term15 = newInstance(Class.forName("java.util.BitSet"));
        long[] term16 = (long[]) newLongArray(1);
        setField(term2, term2.getClass(), "table", term3);
        setIntField(term2, term2.getClass(), "count", 568599855);
        setIntField(term2, term2.getClass(), "threshold", 15);
        setFloatField(term2, term2.getClass(), "loadFactor", 0.75F);
        setField(term1, term1.getClass(), "posMap", term2);
        setField(term1, term1.getClass(), "graph", null);
        setIntElement(term7, 0, 1162663216);
        setIntElement(term7, 1, 1484323161);
        setIntElement(term7, 2, 391863371);
        setIntElement(term7, 3, -1922583790);
        setIntElement(term7, 4, -616727354);
        setField(term1, term1.getClass(), "vertices", term7);
        setIntField(term1, term1.getClass(), "numVertices", -1955890973);
        setIntField(term1, term1.getClass(), "first", -2038273078);
        setField(term15, term15.getClass(), "words", term16);
        setIntField(term15, term15.getClass(), "wordsInUse", 1227103734);
        setBooleanField(term15, term15.getClass(), "sizeIsSticky", false);
        setField(term1, term1.getClass(), "bitset", term15);
        term20 = newInstance(Class.forName("org.graph4j.util.StableSet"));
        Object term21 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term22 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term26 = (int[]) newIntArray(4);
        Object term33 = newInstance(Class.forName("java.util.BitSet"));
        long[] term34 = (long[]) newLongArray(1);
        setField(term21, term21.getClass(), "table", term22);
        setIntField(term21, term21.getClass(), "count", -1339778481);
        setIntField(term21, term21.getClass(), "threshold", 15);
        setFloatField(term21, term21.getClass(), "loadFactor", 0.75F);
        setField(term20, term20.getClass(), "posMap", term21);
        setField(term20, term20.getClass(), "graph", null);
        setIntElement(term26, 0, 1725571209);
        setIntElement(term26, 1, -522618178);
        setIntElement(term26, 2, 1134449235);
        setIntElement(term26, 3, -883034806);
        setField(term20, term20.getClass(), "vertices", term26);
        setIntField(term20, term20.getClass(), "numVertices", 1585847225);
        setIntField(term20, term20.getClass(), "first", 597278769);
        setField(term33, term33.getClass(), "words", term34);
        setIntField(term33, term33.getClass(), "wordsInUse", -1685132342);
        setBooleanField(term33, term33.getClass(), "sizeIsSticky", false);
        setField(term20, term20.getClass(), "bitset", term33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.matching.HopcroftKarpMaximumMatching");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("org.graph4j.util.StableSet");
        argTypes[2] = Class.forName("org.graph4j.util.StableSet");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1;
        args[2] = term20;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


