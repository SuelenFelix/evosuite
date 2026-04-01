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
import java.lang.Double;

public class Walk_checkEdge_5351920894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143788;
     Object term143804;

    public Walk_checkEdge_5351920894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143788 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term143790 = (int[]) newIntArray(6);
        Object term143799 = newInstance(Class.forName("java.util.BitSet"));
        long[] term143800 = (long[]) newLongArray(1);
        setIntField(term143788, term143788.getClass(), "numEdges", 132475052);
        setField(term143788, term143788.getClass(), "graph", null);
        setIntElement(term143790, 0, 974144166);
        setIntElement(term143790, 1, 1435209857);
        setIntElement(term143790, 2, -796747447);
        setIntElement(term143790, 3, -1618844424);
        setIntElement(term143790, 4, 1705783596);
        setIntElement(term143790, 5, -1641801728);
        setField(term143788, term143788.getClass(), "vertices", term143790);
        setIntField(term143788, term143788.getClass(), "numVertices", -1861319447);
        setIntField(term143788, term143788.getClass(), "first", -464492428);
        setField(term143799, term143799.getClass(), "words", term143800);
        setIntField(term143799, term143799.getClass(), "wordsInUse", 863903329);
        setBooleanField(term143799, term143799.getClass(), "sizeIsSticky", false);
        setField(term143788, term143788.getClass(), "bitset", term143799);
        Double term143809 = new Double(0.434939079353607);
        Double term143811 = new Double(0.1750892962955467);
        Double term143813 = new Double(0.9119305866844153);
        Double term143815 = new Double(0.5291301488787364);
        Double term143817 = new Double(0.30152507731542666);
        term143804 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term143808 = (Object[]) newArray("java.lang.Double", 5);
        setBooleanField(term143804, term143804.getClass(), "directed", true);
        setIntField(term143804, term143804.getClass(), "source", -1590128044);
        setIntField(term143804, term143804.getClass(), "target", -2138770984);
        setElement(term143808, 0, term143809);
        setElement(term143808, 1, term143811);
        setElement(term143808, 2, term143813);
        setElement(term143808, 3, term143815);
        setElement(term143808, 4, term143817);
        setField(term143804, term143804.getClass(), "data", term143808);
        setField(term143804, term143804.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term143804;
        callMethod(klass, "checkEdge", argTypes, term143788, args);
    }

};


