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
import java.lang.String;

public class GraphExtremaCalculator_getPeriphery_18898562183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7179;

    public GraphExtremaCalculator_getPeriphery_18898562183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7228 = new Integer(-1087774327);
        Integer term7230 = new Integer(-1530420153);
        Class<? extends Object> term7318 = Class.forName((String) "org.graph4j.metrics.GraphExtremaCalculator$Type");
        Field term7317 = ((Class) term7318).getDeclaredField((String) "DIAMETER");
        ((Field) term7317).setAccessible(true);
        Object enum14 = ((Field) term7317).get((Object) null);
        term7179 = newInstance(Class.forName("org.graph4j.metrics.GraphExtremaCalculator"));
        int[] term7184 = (int[]) newIntArray(9);
        int[] term7194 = (int[]) newIntArray(9);
        int[] term7204 = (int[]) newIntArray(6);
        Object term7211 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term7212 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term7213 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term7217 = (int[]) newIntArray(1);
        Object term7221 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7222 = (long[]) newLongArray(1);
        Object term7232 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term7233 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term7234 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term7238 = (int[]) newIntArray(5);
        Object term7246 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7247 = (long[]) newLongArray(1);
        Object term7251 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term7252 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term7253 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term7257 = (int[]) newIntArray(3);
        Object term7263 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7264 = (long[]) newLongArray(1);
        setIntField(term7179, term7179.getClass(), "radiusLB", -626779272);
        setIntField(term7179, term7179.getClass(), "radiusUB", -1150062870);
        setIntField(term7179, term7179.getClass(), "diamLB", -886200503);
        setIntField(term7179, term7179.getClass(), "diamUB", 1136393691);
        setIntElement(term7184, 0, -1288536479);
        setIntElement(term7184, 1, 1092038167);
        setIntElement(term7184, 2, 1879729823);
        setIntElement(term7184, 3, 1443855558);
        setIntElement(term7184, 4, -1933419449);
        setIntElement(term7184, 5, -1804322375);
        setIntElement(term7184, 6, 1595814906);
        setIntElement(term7184, 7, -834193529);
        setIntElement(term7184, 8, 335780735);
        setField(term7179, term7179.getClass(), "eccLB", term7184);
        setIntElement(term7194, 0, -1541981599);
        setIntElement(term7194, 1, 1605456363);
        setIntElement(term7194, 2, 2059896693);
        setIntElement(term7194, 3, 2109912812);
        setIntElement(term7194, 4, 1841286431);
        setIntElement(term7194, 5, -1723168189);
        setIntElement(term7194, 6, -675283917);
        setIntElement(term7194, 7, -2093862988);
        setIntElement(term7194, 8, 1337828646);
        setField(term7179, term7179.getClass(), "eccUB", term7194);
        setIntElement(term7204, 0, 532666604);
        setIntElement(term7204, 1, -13725716);
        setIntElement(term7204, 2, -1695750603);
        setIntElement(term7204, 3, 63677360);
        setIntElement(term7204, 4, 1478914037);
        setIntElement(term7204, 5, 1630231519);
        setField(term7179, term7179.getClass(), "dist", term7204);
        setField(term7212, term7212.getClass(), "table", term7213);
        setIntField(term7212, term7212.getClass(), "count", 1460702778);
        setIntField(term7212, term7212.getClass(), "threshold", 15);
        setFloatField(term7212, term7212.getClass(), "loadFactor", 0.75F);
        setField(term7211, term7211.getClass(), "posMap", term7212);
        setField(term7211, term7211.getClass(), "graph", null);
        setIntElement(term7217, 0, -1398142433);
        setField(term7211, term7211.getClass(), "vertices", term7217);
        setIntField(term7211, term7211.getClass(), "numVertices", -1112119058);
        setIntField(term7211, term7211.getClass(), "first", 2073858334);
        setField(term7221, term7221.getClass(), "words", term7222);
        setIntField(term7221, term7221.getClass(), "wordsInUse", -1693535639);
        setBooleanField(term7221, term7221.getClass(), "sizeIsSticky", false);
        setField(term7211, term7211.getClass(), "bitset", term7221);
        setField(term7179, term7179.getClass(), "candidates", term7211);
        setBooleanField(term7179, term7179.getClass(), "selector", false);
        setBooleanField(term7179, term7179.getClass(), "connected", false);
        setField(term7179, term7179.getClass(), "radius", term7228);
        setField(term7179, term7179.getClass(), "diameter", term7230);
        setField(term7233, term7233.getClass(), "table", term7234);
        setIntField(term7233, term7233.getClass(), "count", 1344744036);
        setIntField(term7233, term7233.getClass(), "threshold", 15);
        setFloatField(term7233, term7233.getClass(), "loadFactor", 0.75F);
        setField(term7232, term7232.getClass(), "posMap", term7233);
        setField(term7232, term7232.getClass(), "graph", null);
        setIntElement(term7238, 0, -98060427);
        setIntElement(term7238, 1, -1272268399);
        setIntElement(term7238, 2, 1120271104);
        setIntElement(term7238, 3, -128435804);
        setIntElement(term7238, 4, 2136158480);
        setField(term7232, term7232.getClass(), "vertices", term7238);
        setIntField(term7232, term7232.getClass(), "numVertices", 2118747457);
        setIntField(term7232, term7232.getClass(), "first", 1868344256);
        setField(term7246, term7246.getClass(), "words", term7247);
        setIntField(term7246, term7246.getClass(), "wordsInUse", 1857693976);
        setBooleanField(term7246, term7246.getClass(), "sizeIsSticky", false);
        setField(term7232, term7232.getClass(), "bitset", term7246);
        setField(term7179, term7179.getClass(), "center", term7232);
        setField(term7252, term7252.getClass(), "table", term7253);
        setIntField(term7252, term7252.getClass(), "count", 1631305277);
        setIntField(term7252, term7252.getClass(), "threshold", 15);
        setFloatField(term7252, term7252.getClass(), "loadFactor", 0.75F);
        setField(term7251, term7251.getClass(), "posMap", term7252);
        setField(term7251, term7251.getClass(), "graph", null);
        setIntElement(term7257, 0, 162113491);
        setIntElement(term7257, 1, -932147928);
        setIntElement(term7257, 2, 487369012);
        setField(term7251, term7251.getClass(), "vertices", term7257);
        setIntField(term7251, term7251.getClass(), "numVertices", -179238712);
        setIntField(term7251, term7251.getClass(), "first", -2018735535);
        setField(term7263, term7263.getClass(), "words", term7264);
        setIntField(term7263, term7263.getClass(), "wordsInUse", -658524954);
        setBooleanField(term7263, term7263.getClass(), "sizeIsSticky", true);
        setField(term7251, term7251.getClass(), "bitset", term7263);
        setField(term7179, term7179.getClass(), "periphery", term7251);
        setField(term7179, term7179.getClass(), "extremaType", enum14);
        setField(term7179, term7179.getClass(), "graph", null);
        setBooleanField(term7179, term7179.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPeriphery", argTypes, term7179, args);
    }

};


