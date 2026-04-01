package org.graph4j.vsp;

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
import static org.graph4j.vsp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class VertexSeparator_init_12628843373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78449;
     Object term78469;
     Object term78484;

    public VertexSeparator_init_12628843373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78449 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78450 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78451 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78455 = (int[]) newIntArray(6);
        Object term78464 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78465 = (long[]) newLongArray(1);
        setField(term78450, term78450.getClass(), "table", term78451);
        setIntField(term78450, term78450.getClass(), "count", 992754091);
        setIntField(term78450, term78450.getClass(), "threshold", 15);
        setFloatField(term78450, term78450.getClass(), "loadFactor", 0.75F);
        setField(term78449, term78449.getClass(), "posMap", term78450);
        setField(term78449, term78449.getClass(), "graph", null);
        setIntElement(term78455, 0, -711076640);
        setIntElement(term78455, 1, 994094102);
        setIntElement(term78455, 2, -1536607529);
        setIntElement(term78455, 3, 2103296701);
        setIntElement(term78455, 4, 56957852);
        setIntElement(term78455, 5, 1777669010);
        setField(term78449, term78449.getClass(), "vertices", term78455);
        setIntField(term78449, term78449.getClass(), "numVertices", 152298427);
        setIntField(term78449, term78449.getClass(), "first", 450778931);
        setField(term78464, term78464.getClass(), "words", term78465);
        setIntField(term78464, term78464.getClass(), "wordsInUse", -1482855200);
        setBooleanField(term78464, term78464.getClass(), "sizeIsSticky", true);
        setField(term78449, term78449.getClass(), "bitset", term78464);
        term78469 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78470 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78471 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78475 = (int[]) newIntArray(1);
        Object term78479 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78480 = (long[]) newLongArray(1);
        setField(term78470, term78470.getClass(), "table", term78471);
        setIntField(term78470, term78470.getClass(), "count", 1147113614);
        setIntField(term78470, term78470.getClass(), "threshold", 15);
        setFloatField(term78470, term78470.getClass(), "loadFactor", 0.75F);
        setField(term78469, term78469.getClass(), "posMap", term78470);
        setField(term78469, term78469.getClass(), "graph", null);
        setIntElement(term78475, 0, -243254772);
        setField(term78469, term78469.getClass(), "vertices", term78475);
        setIntField(term78469, term78469.getClass(), "numVertices", -1721895188);
        setIntField(term78469, term78469.getClass(), "first", 1090061150);
        setField(term78479, term78479.getClass(), "words", term78480);
        setIntField(term78479, term78479.getClass(), "wordsInUse", -1849804262);
        setBooleanField(term78479, term78479.getClass(), "sizeIsSticky", true);
        setField(term78469, term78469.getClass(), "bitset", term78479);
        term78484 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78485 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78486 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78490 = (int[]) newIntArray(3);
        Object term78496 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78497 = (long[]) newLongArray(1);
        setField(term78485, term78485.getClass(), "table", term78486);
        setIntField(term78485, term78485.getClass(), "count", -391323239);
        setIntField(term78485, term78485.getClass(), "threshold", 15);
        setFloatField(term78485, term78485.getClass(), "loadFactor", 0.75F);
        setField(term78484, term78484.getClass(), "posMap", term78485);
        setField(term78484, term78484.getClass(), "graph", null);
        setIntElement(term78490, 0, 563491270);
        setIntElement(term78490, 1, 1732544982);
        setIntElement(term78490, 2, 961758280);
        setField(term78484, term78484.getClass(), "vertices", term78490);
        setIntField(term78484, term78484.getClass(), "numVertices", -1645689842);
        setIntField(term78484, term78484.getClass(), "first", 1363844724);
        setField(term78496, term78496.getClass(), "words", term78497);
        setIntField(term78496, term78496.getClass(), "wordsInUse", 63712079);
        setBooleanField(term78496, term78496.getClass(), "sizeIsSticky", false);
        setField(term78484, term78484.getClass(), "bitset", term78496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.VertexSeparator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        argTypes[1] = Class.forName("org.graph4j.util.VertexSet");
        argTypes[2] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[3];
        args[0] = term78449;
        args[1] = term78469;
        args[2] = term78484;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


