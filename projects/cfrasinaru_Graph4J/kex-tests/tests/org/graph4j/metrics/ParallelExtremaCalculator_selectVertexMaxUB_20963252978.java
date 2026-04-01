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

public class ParallelExtremaCalculator_selectVertexMaxUB_20963252978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3367;

    public ParallelExtremaCalculator_selectVertexMaxUB_20963252978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3400 = new Integer(1585847225);
        Integer term3402 = new Integer(597278769);
        Class<? extends Object> term3481 = Class.forName((String) "org.graph4j.metrics.ParallelExtremaCalculator$Type");
        Field term3480 = ((Class) term3481).getDeclaredField((String) "CENTER");
        ((Field) term3480).setAccessible(true);
        Object enum9 = ((Field) term3480).get((Object) null);
        term3367 = newInstance(Class.forName("org.graph4j.metrics.ParallelExtremaCalculator"));
        int[] term3372 = (int[]) newIntArray(1);
        int[] term3374 = (int[]) newIntArray(0);
        Object term3375 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3376 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3377 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3381 = (int[]) newIntArray(9);
        Object term3393 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3394 = (long[]) newLongArray(1);
        Object term3404 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3405 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3406 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3410 = (int[]) newIntArray(4);
        Object term3417 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3418 = (long[]) newLongArray(1);
        Object term3422 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3423 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3424 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3428 = (int[]) newIntArray(8);
        Object term3439 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3440 = (long[]) newLongArray(1);
        setIntField(term3367, term3367.getClass(), "radiusLB", -525257914);
        setIntField(term3367, term3367.getClass(), "radiusUB", 147209682);
        setIntField(term3367, term3367.getClass(), "diamLB", 34470066);
        setIntField(term3367, term3367.getClass(), "diamUB", 2058711405);
        setIntElement(term3372, 0, 1743683601);
        setField(term3367, term3367.getClass(), "eccLB", term3372);
        setField(term3367, term3367.getClass(), "eccUB", term3374);
        setField(term3376, term3376.getClass(), "table", term3377);
        setIntField(term3376, term3376.getClass(), "count", -945116798);
        setIntField(term3376, term3376.getClass(), "threshold", 15);
        setFloatField(term3376, term3376.getClass(), "loadFactor", 0.75F);
        setField(term3375, term3375.getClass(), "posMap", term3376);
        setField(term3375, term3375.getClass(), "graph", null);
        setIntElement(term3381, 0, 1593461795);
        setIntElement(term3381, 1, 515182546);
        setIntElement(term3381, 2, -936895502);
        setIntElement(term3381, 3, -129547140);
        setIntElement(term3381, 4, 199287428);
        setIntElement(term3381, 5, -1195339592);
        setIntElement(term3381, 6, -376422566);
        setIntElement(term3381, 7, 306847454);
        setIntElement(term3381, 8, 1745276158);
        setField(term3375, term3375.getClass(), "vertices", term3381);
        setIntField(term3375, term3375.getClass(), "numVertices", 2009020256);
        setIntField(term3375, term3375.getClass(), "first", 2049577015);
        setField(term3393, term3393.getClass(), "words", term3394);
        setIntField(term3393, term3393.getClass(), "wordsInUse", 1236004505);
        setBooleanField(term3393, term3393.getClass(), "sizeIsSticky", true);
        setField(term3375, term3375.getClass(), "bitset", term3393);
        setField(term3367, term3367.getClass(), "candidates", term3375);
        setBooleanField(term3367, term3367.getClass(), "selector", false);
        setBooleanField(term3367, term3367.getClass(), "connected", true);
        setField(term3367, term3367.getClass(), "radius", term3400);
        setField(term3367, term3367.getClass(), "diameter", term3402);
        setField(term3405, term3405.getClass(), "table", term3406);
        setIntField(term3405, term3405.getClass(), "count", 1050765721);
        setIntField(term3405, term3405.getClass(), "threshold", 15);
        setFloatField(term3405, term3405.getClass(), "loadFactor", 0.75F);
        setField(term3404, term3404.getClass(), "posMap", term3405);
        setField(term3404, term3404.getClass(), "graph", null);
        setIntElement(term3410, 0, 474518942);
        setIntElement(term3410, 1, -1656687479);
        setIntElement(term3410, 2, -249614216);
        setIntElement(term3410, 3, 1870727665);
        setField(term3404, term3404.getClass(), "vertices", term3410);
        setIntField(term3404, term3404.getClass(), "numVertices", -519881101);
        setIntField(term3404, term3404.getClass(), "first", -680920524);
        setField(term3417, term3417.getClass(), "words", term3418);
        setIntField(term3417, term3417.getClass(), "wordsInUse", -916335264);
        setBooleanField(term3417, term3417.getClass(), "sizeIsSticky", true);
        setField(term3404, term3404.getClass(), "bitset", term3417);
        setField(term3367, term3367.getClass(), "center", term3404);
        setField(term3423, term3423.getClass(), "table", term3424);
        setIntField(term3423, term3423.getClass(), "count", -919416536);
        setIntField(term3423, term3423.getClass(), "threshold", 15);
        setFloatField(term3423, term3423.getClass(), "loadFactor", 0.75F);
        setField(term3422, term3422.getClass(), "posMap", term3423);
        setField(term3422, term3422.getClass(), "graph", null);
        setIntElement(term3428, 0, -43417861);
        setIntElement(term3428, 1, -1533843432);
        setIntElement(term3428, 2, -123338791);
        setIntElement(term3428, 3, -1467089634);
        setIntElement(term3428, 4, 413548937);
        setIntElement(term3428, 5, 1901317214);
        setIntElement(term3428, 6, 1166710220);
        setIntElement(term3428, 7, -1070592289);
        setField(term3422, term3422.getClass(), "vertices", term3428);
        setIntField(term3422, term3422.getClass(), "numVertices", -1464172784);
        setIntField(term3422, term3422.getClass(), "first", 32185364);
        setField(term3439, term3439.getClass(), "words", term3440);
        setIntField(term3439, term3439.getClass(), "wordsInUse", 1768204942);
        setBooleanField(term3439, term3439.getClass(), "sizeIsSticky", true);
        setField(term3422, term3422.getClass(), "bitset", term3439);
        setField(term3367, term3367.getClass(), "periphery", term3422);
        setField(term3367, term3367.getClass(), "extremaType", enum9);
        setField(term3367, term3367.getClass(), "graph", null);
        setBooleanField(term3367, term3367.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.ParallelExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "selectVertexMaxUB", argTypes, term3367, args);
    }

};


