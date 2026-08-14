package org.graph4j.metrics;

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
import static org.graph4j.metrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DiameterCalculator_selectVertex_18692525303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10148;

    public DiameterCalculator_selectVertex_18692525303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10148 = newInstance(Class.forName("org.graph4j.metrics.DiameterCalculator"));
        int[] term10151 = (int[]) newIntArray(8);
        int[] term10160 = (int[]) newIntArray(7);
        int[] term10168 = (int[]) newIntArray(7);
        Object term10176 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term10177 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term10178 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term10182 = (int[]) newIntArray(7);
        Object term10192 = newInstance(Class.forName("java.util.BitSet"));
        long[] term10193 = (long[]) newLongArray(1);
        setIntField(term10148, term10148.getClass(), "diamUB", -189738995);
        setIntField(term10148, term10148.getClass(), "diamLB", 1943019963);
        setIntElement(term10151, 0, 186472650);
        setIntElement(term10151, 1, 279675992);
        setIntElement(term10151, 2, -1626074989);
        setIntElement(term10151, 3, -552272253);
        setIntElement(term10151, 4, -633523956);
        setIntElement(term10151, 5, 1761540885);
        setIntElement(term10151, 6, -168498989);
        setIntElement(term10151, 7, 388247095);
        setField(term10148, term10148.getClass(), "eccLB", term10151);
        setIntElement(term10160, 0, -1320402633);
        setIntElement(term10160, 1, 919602316);
        setIntElement(term10160, 2, 1833713431);
        setIntElement(term10160, 3, -706222608);
        setIntElement(term10160, 4, -2003607923);
        setIntElement(term10160, 5, 1378805929);
        setIntElement(term10160, 6, 695052304);
        setField(term10148, term10148.getClass(), "eccUB", term10160);
        setIntElement(term10168, 0, -179937218);
        setIntElement(term10168, 1, 940896043);
        setIntElement(term10168, 2, -1156002984);
        setIntElement(term10168, 3, 1676254730);
        setIntElement(term10168, 4, -1661200819);
        setIntElement(term10168, 5, -235039141);
        setIntElement(term10168, 6, -1414233013);
        setField(term10148, term10148.getClass(), "dist", term10168);
        setField(term10177, term10177.getClass(), "table", term10178);
        setIntField(term10177, term10177.getClass(), "count", -1174440096);
        setIntField(term10177, term10177.getClass(), "threshold", 15);
        setFloatField(term10177, term10177.getClass(), "loadFactor", 0.75F);
        setField(term10176, term10176.getClass(), "posMap", term10177);
        setField(term10176, term10176.getClass(), "graph", null);
        setIntElement(term10182, 0, -679614653);
        setIntElement(term10182, 1, -561851867);
        setIntElement(term10182, 2, -1809928454);
        setIntElement(term10182, 3, -191639503);
        setIntElement(term10182, 4, -1563700756);
        setIntElement(term10182, 5, -208314837);
        setIntElement(term10182, 6, 697841387);
        setField(term10176, term10176.getClass(), "vertices", term10182);
        setIntField(term10176, term10176.getClass(), "numVertices", -1749591213);
        setIntField(term10176, term10176.getClass(), "first", 1703093401);
        setField(term10192, term10192.getClass(), "words", term10193);
        setIntField(term10192, term10192.getClass(), "wordsInUse", 47607734);
        setBooleanField(term10192, term10192.getClass(), "sizeIsSticky", true);
        setField(term10176, term10176.getClass(), "bitset", term10192);
        setField(term10148, term10148.getClass(), "candidates", term10176);
        setBooleanField(term10148, term10148.getClass(), "selector", false);
        setField(term10148, term10148.getClass(), "graph", null);
        setBooleanField(term10148, term10148.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.DiameterCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "selectVertex", argTypes, term10148, args);
    }

};


