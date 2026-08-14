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

public class VertexSet1_intersection_82605667218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71669;
     Object term71687;

    public VertexSet1_intersection_82605667218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71669 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71670 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71671 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71675 = (int[]) newIntArray(4);
        Object term71682 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71683 = (long[]) newLongArray(1);
        setField(term71670, term71670.getClass(), "table", term71671);
        setIntField(term71670, term71670.getClass(), "count", -1826524081);
        setIntField(term71670, term71670.getClass(), "threshold", 15);
        setFloatField(term71670, term71670.getClass(), "loadFactor", 0.75F);
        setField(term71669, term71669.getClass(), "posMap", term71670);
        setField(term71669, term71669.getClass(), "graph", null);
        setIntElement(term71675, 0, -676295156);
        setIntElement(term71675, 1, -200393215);
        setIntElement(term71675, 2, 2082267818);
        setIntElement(term71675, 3, 4015114);
        setField(term71669, term71669.getClass(), "vertices", term71675);
        setIntField(term71669, term71669.getClass(), "numVertices", 2035858719);
        setIntField(term71669, term71669.getClass(), "first", 231711893);
        setField(term71682, term71682.getClass(), "words", term71683);
        setIntField(term71682, term71682.getClass(), "wordsInUse", 946699304);
        setBooleanField(term71682, term71682.getClass(), "sizeIsSticky", false);
        setField(term71669, term71669.getClass(), "bitset", term71682);
        term71687 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71688 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71689 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71693 = (int[]) newIntArray(5);
        Object term71701 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71702 = (long[]) newLongArray(1);
        setField(term71688, term71688.getClass(), "table", term71689);
        setIntField(term71688, term71688.getClass(), "count", -651225608);
        setIntField(term71688, term71688.getClass(), "threshold", 15);
        setFloatField(term71688, term71688.getClass(), "loadFactor", 0.75F);
        setField(term71687, term71687.getClass(), "posMap", term71688);
        setField(term71687, term71687.getClass(), "graph", null);
        setIntElement(term71693, 0, -838905023);
        setIntElement(term71693, 1, 1997861223);
        setIntElement(term71693, 2, -1861970851);
        setIntElement(term71693, 3, -1201375636);
        setIntElement(term71693, 4, 275797745);
        setField(term71687, term71687.getClass(), "vertices", term71693);
        setIntField(term71687, term71687.getClass(), "numVertices", -289448833);
        setIntField(term71687, term71687.getClass(), "first", -877446165);
        setField(term71701, term71701.getClass(), "words", term71702);
        setIntField(term71701, term71701.getClass(), "wordsInUse", -1334756045);
        setBooleanField(term71701, term71701.getClass(), "sizeIsSticky", true);
        setField(term71687, term71687.getClass(), "bitset", term71701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet1");
        Object[] args = new Object[1];
        args[0] = term71687;
        callMethod(klass, "intersection", argTypes, term71669, args);
    }

};


