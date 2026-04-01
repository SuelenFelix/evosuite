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

public class RadiusCalculator_calculate_3230450711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6073;

    public RadiusCalculator_calculate_3230450711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6073 = newInstance(Class.forName("org.graph4j.metrics.RadiusCalculator"));
        Object term6076 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6077 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term6078 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term6082 = (int[]) newIntArray(4);
        Object term6089 = newInstance(Class.forName("java.util.BitSet"));
        long[] term6090 = (long[]) newLongArray(1);
        int[] term6094 = (int[]) newIntArray(6);
        int[] term6101 = (int[]) newIntArray(1);
        int[] term6103 = (int[]) newIntArray(2);
        setIntField(term6073, term6073.getClass(), "radiusLB", -1220630391);
        setIntField(term6073, term6073.getClass(), "radiusUB", -995822131);
        setField(term6077, term6077.getClass(), "table", term6078);
        setIntField(term6077, term6077.getClass(), "count", -687282231);
        setIntField(term6077, term6077.getClass(), "threshold", 15);
        setFloatField(term6077, term6077.getClass(), "loadFactor", 0.75F);
        setField(term6076, term6076.getClass(), "posMap", term6077);
        setField(term6076, term6076.getClass(), "graph", null);
        setIntElement(term6082, 0, 1200440315);
        setIntElement(term6082, 1, 40571662);
        setIntElement(term6082, 2, 1863910269);
        setIntElement(term6082, 3, 864645689);
        setField(term6076, term6076.getClass(), "vertices", term6082);
        setIntField(term6076, term6076.getClass(), "numVertices", 279384872);
        setIntField(term6076, term6076.getClass(), "first", 1427305953);
        setField(term6089, term6089.getClass(), "words", term6090);
        setIntField(term6089, term6089.getClass(), "wordsInUse", -781832877);
        setBooleanField(term6089, term6089.getClass(), "sizeIsSticky", false);
        setField(term6076, term6076.getClass(), "bitset", term6089);
        setField(term6073, term6073.getClass(), "vertexSet", term6076);
        setIntElement(term6094, 0, 797203987);
        setIntElement(term6094, 1, 1973060703);
        setIntElement(term6094, 2, -138239905);
        setIntElement(term6094, 3, 1709474063);
        setIntElement(term6094, 4, 1406617209);
        setIntElement(term6094, 5, 1706047059);
        setField(term6073, term6073.getClass(), "eccLB", term6094);
        setIntElement(term6101, 0, 590451710);
        setField(term6073, term6073.getClass(), "eccUB", term6101);
        setIntElement(term6103, 0, -1999787419);
        setIntElement(term6103, 1, -1224443634);
        setField(term6073, term6073.getClass(), "dist", term6103);
        setBooleanField(term6073, term6073.getClass(), "selector", true);
        setField(term6073, term6073.getClass(), "graph", null);
        setBooleanField(term6073, term6073.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.RadiusCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculate", argTypes, term6073, args);
    }

};


