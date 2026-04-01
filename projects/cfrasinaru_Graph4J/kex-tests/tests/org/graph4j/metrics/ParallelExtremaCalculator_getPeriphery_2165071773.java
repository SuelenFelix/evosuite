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

public class ParallelExtremaCalculator_getPeriphery_2165071773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1423;

    public ParallelExtremaCalculator_getPeriphery_2165071773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1456 = new Integer(-1922583790);
        Integer term1458 = new Integer(-616727354);
        Class<? extends Object> term1517 = Class.forName((String) "org.graph4j.metrics.ParallelExtremaCalculator$Type");
        Field term1516 = ((Class) term1517).getDeclaredField((String) "DIAMETER");
        ((Field) term1516).setAccessible(true);
        Object enum4 = ((Field) term1516).get((Object) null);
        term1423 = newInstance(Class.forName("org.graph4j.metrics.ParallelExtremaCalculator"));
        int[] term1428 = (int[]) newIntArray(5);
        int[] term1434 = (int[]) newIntArray(2);
        Object term1437 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term1438 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term1439 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term1443 = (int[]) newIntArray(3);
        Object term1449 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1450 = (long[]) newLongArray(1);
        Object term1460 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term1461 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term1462 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term1466 = (int[]) newIntArray(1);
        Object term1470 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1471 = (long[]) newLongArray(1);
        Object term1475 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term1476 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term1477 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term1481 = (int[]) newIntArray(0);
        Object term1484 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1485 = (long[]) newLongArray(1);
        setIntField(term1423, term1423.getClass(), "radiusLB", 1375330971);
        setIntField(term1423, term1423.getClass(), "radiusUB", -478195677);
        setIntField(term1423, term1423.getClass(), "diamLB", 972867650);
        setIntField(term1423, term1423.getClass(), "diamUB", 1655935355);
        setIntElement(term1428, 0, -481533957);
        setIntElement(term1428, 1, 1240914516);
        setIntElement(term1428, 2, -1465035361);
        setIntElement(term1428, 3, 1090617576);
        setIntElement(term1428, 4, -1547384488);
        setField(term1423, term1423.getClass(), "eccLB", term1428);
        setIntElement(term1434, 0, 1442160736);
        setIntElement(term1434, 1, 1114000454);
        setField(term1423, term1423.getClass(), "eccUB", term1434);
        setField(term1438, term1438.getClass(), "table", term1439);
        setIntField(term1438, term1438.getClass(), "count", -556405712);
        setIntField(term1438, term1438.getClass(), "threshold", 15);
        setFloatField(term1438, term1438.getClass(), "loadFactor", 0.75F);
        setField(term1437, term1437.getClass(), "posMap", term1438);
        setField(term1437, term1437.getClass(), "graph", null);
        setIntElement(term1443, 0, -1772434990);
        setIntElement(term1443, 1, -1845499264);
        setIntElement(term1443, 2, -505439934);
        setField(term1437, term1437.getClass(), "vertices", term1443);
        setIntField(term1437, term1437.getClass(), "numVertices", -344842608);
        setIntField(term1437, term1437.getClass(), "first", 941650513);
        setField(term1449, term1449.getClass(), "words", term1450);
        setIntField(term1449, term1449.getClass(), "wordsInUse", 444029505);
        setBooleanField(term1449, term1449.getClass(), "sizeIsSticky", true);
        setField(term1437, term1437.getClass(), "bitset", term1449);
        setField(term1423, term1423.getClass(), "candidates", term1437);
        setBooleanField(term1423, term1423.getClass(), "selector", false);
        setBooleanField(term1423, term1423.getClass(), "connected", false);
        setField(term1423, term1423.getClass(), "radius", term1456);
        setField(term1423, term1423.getClass(), "diameter", term1458);
        setField(term1461, term1461.getClass(), "table", term1462);
        setIntField(term1461, term1461.getClass(), "count", -1034506028);
        setIntField(term1461, term1461.getClass(), "threshold", 15);
        setFloatField(term1461, term1461.getClass(), "loadFactor", 0.75F);
        setField(term1460, term1460.getClass(), "posMap", term1461);
        setField(term1460, term1460.getClass(), "graph", null);
        setIntElement(term1466, 0, -1263114719);
        setField(term1460, term1460.getClass(), "vertices", term1466);
        setIntField(term1460, term1460.getClass(), "numVertices", -894662986);
        setIntField(term1460, term1460.getClass(), "first", 304775596);
        setField(term1470, term1470.getClass(), "words", term1471);
        setIntField(term1470, term1470.getClass(), "wordsInUse", -1347665717);
        setBooleanField(term1470, term1470.getClass(), "sizeIsSticky", true);
        setField(term1460, term1460.getClass(), "bitset", term1470);
        setField(term1423, term1423.getClass(), "center", term1460);
        setField(term1476, term1476.getClass(), "table", term1477);
        setIntField(term1476, term1476.getClass(), "count", -1888585309);
        setIntField(term1476, term1476.getClass(), "threshold", 15);
        setFloatField(term1476, term1476.getClass(), "loadFactor", 0.75F);
        setField(term1475, term1475.getClass(), "posMap", term1476);
        setField(term1475, term1475.getClass(), "graph", null);
        setField(term1475, term1475.getClass(), "vertices", term1481);
        setIntField(term1475, term1475.getClass(), "numVertices", 683666002);
        setIntField(term1475, term1475.getClass(), "first", 1596213415);
        setField(term1484, term1484.getClass(), "words", term1485);
        setIntField(term1484, term1484.getClass(), "wordsInUse", -268815336);
        setBooleanField(term1484, term1484.getClass(), "sizeIsSticky", true);
        setField(term1475, term1475.getClass(), "bitset", term1484);
        setField(term1423, term1423.getClass(), "periphery", term1475);
        setField(term1423, term1423.getClass(), "extremaType", enum4);
        setField(term1423, term1423.getClass(), "graph", null);
        setBooleanField(term1423, term1423.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.ParallelExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPeriphery", argTypes, term1423, args);
    }

};


