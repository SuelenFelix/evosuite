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
import java.lang.Integer;

public class DiameterCalculator_computeEcc_15221776302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10091;
     Object term10129;

    public DiameterCalculator_computeEcc_15221776302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10091 = newInstance(Class.forName("org.graph4j.metrics.DiameterCalculator"));
        int[] term10094 = (int[]) newIntArray(4);
        int[] term10099 = (int[]) newIntArray(0);
        int[] term10100 = (int[]) newIntArray(4);
        Object term10105 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term10106 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term10107 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term10111 = (int[]) newIntArray(8);
        Object term10122 = newInstance(Class.forName("java.util.BitSet"));
        long[] term10123 = (long[]) newLongArray(1);
        setIntField(term10091, term10091.getClass(), "diamUB", -1549603566);
        setIntField(term10091, term10091.getClass(), "diamLB", 1077223540);
        setIntElement(term10094, 0, -1823813592);
        setIntElement(term10094, 1, -1644358555);
        setIntElement(term10094, 2, -388591034);
        setIntElement(term10094, 3, -1270258033);
        setField(term10091, term10091.getClass(), "eccLB", term10094);
        setField(term10091, term10091.getClass(), "eccUB", term10099);
        setIntElement(term10100, 0, 1677994069);
        setIntElement(term10100, 1, -439999692);
        setIntElement(term10100, 2, 924095007);
        setIntElement(term10100, 3, 1302110708);
        setField(term10091, term10091.getClass(), "dist", term10100);
        setField(term10106, term10106.getClass(), "table", term10107);
        setIntField(term10106, term10106.getClass(), "count", 594705497);
        setIntField(term10106, term10106.getClass(), "threshold", 15);
        setFloatField(term10106, term10106.getClass(), "loadFactor", 0.75F);
        setField(term10105, term10105.getClass(), "posMap", term10106);
        setField(term10105, term10105.getClass(), "graph", null);
        setIntElement(term10111, 0, -600102466);
        setIntElement(term10111, 1, -899986714);
        setIntElement(term10111, 2, 1307244466);
        setIntElement(term10111, 3, -252262096);
        setIntElement(term10111, 4, -37129068);
        setIntElement(term10111, 5, -861014847);
        setIntElement(term10111, 6, 2132934139);
        setIntElement(term10111, 7, -1261824381);
        setField(term10105, term10105.getClass(), "vertices", term10111);
        setIntField(term10105, term10105.getClass(), "numVertices", 1594426218);
        setIntField(term10105, term10105.getClass(), "first", -2060535464);
        setField(term10122, term10122.getClass(), "words", term10123);
        setIntField(term10122, term10122.getClass(), "wordsInUse", -1242946317);
        setBooleanField(term10122, term10122.getClass(), "sizeIsSticky", true);
        setField(term10105, term10105.getClass(), "bitset", term10122);
        setField(term10091, term10091.getClass(), "candidates", term10105);
        setBooleanField(term10091, term10091.getClass(), "selector", false);
        setField(term10091, term10091.getClass(), "graph", null);
        setBooleanField(term10091, term10091.getClass(), "directed", false);
        term10129 = new Integer(-1541566235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.DiameterCalculator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10129;
        callMethod(klass, "computeEcc", argTypes, term10091, args);
    }

};


