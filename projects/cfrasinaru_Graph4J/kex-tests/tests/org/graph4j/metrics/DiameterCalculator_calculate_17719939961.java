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

public class DiameterCalculator_calculate_17719939961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10030;

    public DiameterCalculator_calculate_17719939961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10030 = newInstance(Class.forName("org.graph4j.metrics.DiameterCalculator"));
        int[] term10033 = (int[]) newIntArray(0);
        int[] term10034 = (int[]) newIntArray(5);
        int[] term10040 = (int[]) newIntArray(6);
        Object term10047 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term10048 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term10049 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term10053 = (int[]) newIntArray(8);
        Object term10064 = newInstance(Class.forName("java.util.BitSet"));
        long[] term10065 = (long[]) newLongArray(1);
        setIntField(term10030, term10030.getClass(), "diamUB", 1077647088);
        setIntField(term10030, term10030.getClass(), "diamLB", -705176810);
        setField(term10030, term10030.getClass(), "eccLB", term10033);
        setIntElement(term10034, 0, -1584779593);
        setIntElement(term10034, 1, 303007547);
        setIntElement(term10034, 2, 1498738343);
        setIntElement(term10034, 3, -1635571857);
        setIntElement(term10034, 4, 1407309162);
        setField(term10030, term10030.getClass(), "eccUB", term10034);
        setIntElement(term10040, 0, -534033672);
        setIntElement(term10040, 1, -1162790806);
        setIntElement(term10040, 2, -1264595049);
        setIntElement(term10040, 3, -2058884635);
        setIntElement(term10040, 4, 1064185088);
        setIntElement(term10040, 5, -1249782654);
        setField(term10030, term10030.getClass(), "dist", term10040);
        setField(term10048, term10048.getClass(), "table", term10049);
        setIntField(term10048, term10048.getClass(), "count", 399302934);
        setIntField(term10048, term10048.getClass(), "threshold", 15);
        setFloatField(term10048, term10048.getClass(), "loadFactor", 0.75F);
        setField(term10047, term10047.getClass(), "posMap", term10048);
        setField(term10047, term10047.getClass(), "graph", null);
        setIntElement(term10053, 0, -1823255084);
        setIntElement(term10053, 1, 793345010);
        setIntElement(term10053, 2, -2092117838);
        setIntElement(term10053, 3, 1524590776);
        setIntElement(term10053, 4, 1523896653);
        setIntElement(term10053, 5, -1731921726);
        setIntElement(term10053, 6, 919994471);
        setIntElement(term10053, 7, 183531701);
        setField(term10047, term10047.getClass(), "vertices", term10053);
        setIntField(term10047, term10047.getClass(), "numVertices", -974923743);
        setIntField(term10047, term10047.getClass(), "first", 1876738932);
        setField(term10064, term10064.getClass(), "words", term10065);
        setIntField(term10064, term10064.getClass(), "wordsInUse", -1870339027);
        setBooleanField(term10064, term10064.getClass(), "sizeIsSticky", true);
        setField(term10047, term10047.getClass(), "bitset", term10064);
        setField(term10030, term10030.getClass(), "candidates", term10047);
        setBooleanField(term10030, term10030.getClass(), "selector", false);
        setField(term10030, term10030.getClass(), "graph", null);
        setBooleanField(term10030, term10030.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.DiameterCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculate", argTypes, term10030, args);
    }

};


