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

public class VertexSet1_intersection_82605667216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71661;
     Object term71679;

    public VertexSet1_intersection_82605667216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71661 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71662 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71663 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71667 = (int[]) newIntArray(4);
        Object term71674 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71675 = (long[]) newLongArray(1);
        setField(term71662, term71662.getClass(), "table", term71663);
        setIntField(term71662, term71662.getClass(), "count", -1826524081);
        setIntField(term71662, term71662.getClass(), "threshold", 15);
        setFloatField(term71662, term71662.getClass(), "loadFactor", 0.75F);
        setField(term71661, term71661.getClass(), "posMap", term71662);
        setField(term71661, term71661.getClass(), "graph", null);
        setIntElement(term71667, 0, -676295156);
        setIntElement(term71667, 1, -200393215);
        setIntElement(term71667, 2, 2082267818);
        setIntElement(term71667, 3, 4015114);
        setField(term71661, term71661.getClass(), "vertices", term71667);
        setIntField(term71661, term71661.getClass(), "numVertices", 2035858719);
        setIntField(term71661, term71661.getClass(), "first", 231711893);
        setField(term71674, term71674.getClass(), "words", term71675);
        setIntField(term71674, term71674.getClass(), "wordsInUse", 946699304);
        setBooleanField(term71674, term71674.getClass(), "sizeIsSticky", false);
        setField(term71661, term71661.getClass(), "bitset", term71674);
        term71679 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71680 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71681 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71685 = (int[]) newIntArray(5);
        Object term71693 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71694 = (long[]) newLongArray(1);
        setField(term71680, term71680.getClass(), "table", term71681);
        setIntField(term71680, term71680.getClass(), "count", -651225608);
        setIntField(term71680, term71680.getClass(), "threshold", 15);
        setFloatField(term71680, term71680.getClass(), "loadFactor", 0.75F);
        setField(term71679, term71679.getClass(), "posMap", term71680);
        setField(term71679, term71679.getClass(), "graph", null);
        setIntElement(term71685, 0, -838905023);
        setIntElement(term71685, 1, 1997861223);
        setIntElement(term71685, 2, -1861970851);
        setIntElement(term71685, 3, -1201375636);
        setIntElement(term71685, 4, 275797745);
        setField(term71679, term71679.getClass(), "vertices", term71685);
        setIntField(term71679, term71679.getClass(), "numVertices", -289448833);
        setIntField(term71679, term71679.getClass(), "first", -877446165);
        setField(term71693, term71693.getClass(), "words", term71694);
        setIntField(term71693, term71693.getClass(), "wordsInUse", -1334756045);
        setBooleanField(term71693, term71693.getClass(), "sizeIsSticky", true);
        setField(term71679, term71679.getClass(), "bitset", term71693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet1");
        Object[] args = new Object[1];
        args[0] = term71679;
        callMethod(klass, "intersection", argTypes, term71661, args);
    }

};


