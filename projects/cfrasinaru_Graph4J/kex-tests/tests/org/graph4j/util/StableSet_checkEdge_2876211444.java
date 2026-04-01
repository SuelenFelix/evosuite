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
import java.lang.Integer;

public class StableSet_checkEdge_2876211444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154743;
     Object term154764;
     Object term154766;

    public StableSet_checkEdge_2876211444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154743 = newInstance(Class.forName("org.graph4j.util.StableSet"));
        Object term154744 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term154745 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term154749 = (int[]) newIntArray(7);
        Object term154759 = newInstance(Class.forName("java.util.BitSet"));
        long[] term154760 = (long[]) newLongArray(1);
        setField(term154744, term154744.getClass(), "table", term154745);
        setIntField(term154744, term154744.getClass(), "count", -411040514);
        setIntField(term154744, term154744.getClass(), "threshold", 15);
        setFloatField(term154744, term154744.getClass(), "loadFactor", 0.75F);
        setField(term154743, term154743.getClass(), "posMap", term154744);
        setField(term154743, term154743.getClass(), "graph", null);
        setIntElement(term154749, 0, 172622070);
        setIntElement(term154749, 1, -1496567726);
        setIntElement(term154749, 2, 848000871);
        setIntElement(term154749, 3, -79755760);
        setIntElement(term154749, 4, 991438693);
        setIntElement(term154749, 5, -1027563321);
        setIntElement(term154749, 6, 1964966250);
        setField(term154743, term154743.getClass(), "vertices", term154749);
        setIntField(term154743, term154743.getClass(), "numVertices", 766514561);
        setIntField(term154743, term154743.getClass(), "first", -97882835);
        setField(term154759, term154759.getClass(), "words", term154760);
        setIntField(term154759, term154759.getClass(), "wordsInUse", 1173985628);
        setBooleanField(term154759, term154759.getClass(), "sizeIsSticky", false);
        setField(term154743, term154743.getClass(), "bitset", term154759);
        term154764 = new Integer(1246918689);
        term154766 = new Integer(1143987761);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.StableSet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term154764;
        args[1] = term154766;
        callMethod(klass, "checkEdge", argTypes, term154743, args);
    }

};


