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

public class Clique_isValid_8243886477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141599;

    public Clique_isValid_8243886477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141599 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term141600 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term141601 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term141605 = (int[]) newIntArray(7);
        Object term141615 = newInstance(Class.forName("java.util.BitSet"));
        long[] term141616 = (long[]) newLongArray(1);
        setField(term141600, term141600.getClass(), "table", term141601);
        setIntField(term141600, term141600.getClass(), "count", -1989107035);
        setIntField(term141600, term141600.getClass(), "threshold", 15);
        setFloatField(term141600, term141600.getClass(), "loadFactor", 0.75F);
        setField(term141599, term141599.getClass(), "posMap", term141600);
        setField(term141599, term141599.getClass(), "graph", null);
        setIntElement(term141605, 0, -857276891);
        setIntElement(term141605, 1, 2117099734);
        setIntElement(term141605, 2, 2079685831);
        setIntElement(term141605, 3, 24665460);
        setIntElement(term141605, 4, -1907688379);
        setIntElement(term141605, 5, -185256197);
        setIntElement(term141605, 6, -2130092461);
        setField(term141599, term141599.getClass(), "vertices", term141605);
        setIntField(term141599, term141599.getClass(), "numVertices", -110195062);
        setIntField(term141599, term141599.getClass(), "first", -1377355787);
        setField(term141615, term141615.getClass(), "words", term141616);
        setIntField(term141615, term141615.getClass(), "wordsInUse", -1565928992);
        setBooleanField(term141615, term141615.getClass(), "sizeIsSticky", true);
        setField(term141599, term141599.getClass(), "bitset", term141615);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Clique");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term141599, args);
    }

};


