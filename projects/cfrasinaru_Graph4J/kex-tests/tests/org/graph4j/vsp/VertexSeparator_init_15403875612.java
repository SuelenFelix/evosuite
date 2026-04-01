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

public class VertexSeparator_init_15403875612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78368;

    public VertexSeparator_init_15403875612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78368 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term78369 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78370 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78371 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78375 = (int[]) newIntArray(7);
        Object term78385 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78386 = (long[]) newLongArray(1);
        Object term78390 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78391 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78392 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78396 = (int[]) newIntArray(8);
        Object term78407 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78408 = (long[]) newLongArray(1);
        Object term78412 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78413 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78414 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78418 = (int[]) newIntArray(2);
        Object term78423 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78424 = (long[]) newLongArray(1);
        setField(term78368, term78368.getClass(), "graph", null);
        setField(term78370, term78370.getClass(), "table", term78371);
        setIntField(term78370, term78370.getClass(), "count", 980943695);
        setIntField(term78370, term78370.getClass(), "threshold", 15);
        setFloatField(term78370, term78370.getClass(), "loadFactor", 0.75F);
        setField(term78369, term78369.getClass(), "posMap", term78370);
        setField(term78369, term78369.getClass(), "graph", null);
        setIntElement(term78375, 0, 1100165285);
        setIntElement(term78375, 1, -686406135);
        setIntElement(term78375, 2, -287429580);
        setIntElement(term78375, 3, -1517877256);
        setIntElement(term78375, 4, 1926230705);
        setIntElement(term78375, 5, 230249356);
        setIntElement(term78375, 6, 81634969);
        setField(term78369, term78369.getClass(), "vertices", term78375);
        setIntField(term78369, term78369.getClass(), "numVertices", -564270021);
        setIntField(term78369, term78369.getClass(), "first", -711410886);
        setField(term78385, term78385.getClass(), "words", term78386);
        setIntField(term78385, term78385.getClass(), "wordsInUse", 1905282682);
        setBooleanField(term78385, term78385.getClass(), "sizeIsSticky", false);
        setField(term78369, term78369.getClass(), "bitset", term78385);
        setField(term78368, term78368.getClass(), "separator", term78369);
        setField(term78391, term78391.getClass(), "table", term78392);
        setIntField(term78391, term78391.getClass(), "count", 1714255787);
        setIntField(term78391, term78391.getClass(), "threshold", 15);
        setFloatField(term78391, term78391.getClass(), "loadFactor", 0.75F);
        setField(term78390, term78390.getClass(), "posMap", term78391);
        setField(term78390, term78390.getClass(), "graph", null);
        setIntElement(term78396, 0, 257119068);
        setIntElement(term78396, 1, 1243637000);
        setIntElement(term78396, 2, 1377854679);
        setIntElement(term78396, 3, -563428268);
        setIntElement(term78396, 4, 60476165);
        setIntElement(term78396, 5, 238928554);
        setIntElement(term78396, 6, 1223346141);
        setIntElement(term78396, 7, -2030508372);
        setField(term78390, term78390.getClass(), "vertices", term78396);
        setIntField(term78390, term78390.getClass(), "numVertices", 1541228086);
        setIntField(term78390, term78390.getClass(), "first", 297742417);
        setField(term78407, term78407.getClass(), "words", term78408);
        setIntField(term78407, term78407.getClass(), "wordsInUse", 1816437264);
        setBooleanField(term78407, term78407.getClass(), "sizeIsSticky", true);
        setField(term78390, term78390.getClass(), "bitset", term78407);
        setField(term78368, term78368.getClass(), "leftShore", term78390);
        setField(term78413, term78413.getClass(), "table", term78414);
        setIntField(term78413, term78413.getClass(), "count", -1501877126);
        setIntField(term78413, term78413.getClass(), "threshold", 15);
        setFloatField(term78413, term78413.getClass(), "loadFactor", 0.75F);
        setField(term78412, term78412.getClass(), "posMap", term78413);
        setField(term78412, term78412.getClass(), "graph", null);
        setIntElement(term78418, 0, 803853178);
        setIntElement(term78418, 1, -1572151301);
        setField(term78412, term78412.getClass(), "vertices", term78418);
        setIntField(term78412, term78412.getClass(), "numVertices", 1802492559);
        setIntField(term78412, term78412.getClass(), "first", -800228870);
        setField(term78423, term78423.getClass(), "words", term78424);
        setIntField(term78423, term78423.getClass(), "wordsInUse", -604044709);
        setBooleanField(term78423, term78423.getClass(), "sizeIsSticky", true);
        setField(term78412, term78412.getClass(), "bitset", term78423);
        setField(term78368, term78368.getClass(), "rightShore", term78412);
        setIntField(term78368, term78368.getClass(), "maxShoreSize", -474659885);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.VertexSeparator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.vsp.VertexSeparator");
        Object[] args = new Object[1];
        args[0] = term78368;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


