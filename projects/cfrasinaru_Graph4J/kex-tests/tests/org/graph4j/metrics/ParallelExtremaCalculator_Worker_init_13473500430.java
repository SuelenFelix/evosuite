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

public class ParallelExtremaCalculator_Worker_init_13473500430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10482;

    public ParallelExtremaCalculator_Worker_init_13473500430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10514 = new Integer(-14890619);
        Integer term10516 = new Integer(1632125673);
        Class<? extends Object> term10598 = Class.forName((String) "org.graph4j.metrics.ParallelExtremaCalculator$Type");
        Field term10597 = ((Class) term10598).getDeclaredField((String) "DIAMETER");
        ((Field) term10597).setAccessible(true);
        Object enum21 = ((Field) term10597).get((Object) null);
        term10482 = newInstance(Class.forName("org.graph4j.metrics.ParallelExtremaCalculator"));
        int[] term10487 = (int[]) newIntArray(3);
        int[] term10491 = (int[]) newIntArray(1);
        Object term10493 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term10494 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term10495 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term10499 = (int[]) newIntArray(5);
        Object term10507 = newInstance(Class.forName("java.util.BitSet"));
        long[] term10508 = (long[]) newLongArray(1);
        Object term10518 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term10519 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term10520 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term10524 = (int[]) newIntArray(5);
        Object term10532 = newInstance(Class.forName("java.util.BitSet"));
        long[] term10533 = (long[]) newLongArray(1);
        Object term10537 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term10538 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term10539 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term10543 = (int[]) newIntArray(8);
        Object term10554 = newInstance(Class.forName("java.util.BitSet"));
        long[] term10555 = (long[]) newLongArray(1);
        setIntField(term10482, term10482.getClass(), "radiusLB", -1902823385);
        setIntField(term10482, term10482.getClass(), "radiusUB", -784924879);
        setIntField(term10482, term10482.getClass(), "diamLB", -1062027102);
        setIntField(term10482, term10482.getClass(), "diamUB", 1763217806);
        setIntElement(term10487, 0, 1644949396);
        setIntElement(term10487, 1, -2017073245);
        setIntElement(term10487, 2, 522440332);
        setField(term10482, term10482.getClass(), "eccLB", term10487);
        setIntElement(term10491, 0, 1516598327);
        setField(term10482, term10482.getClass(), "eccUB", term10491);
        setField(term10494, term10494.getClass(), "table", term10495);
        setIntField(term10494, term10494.getClass(), "count", 82353584);
        setIntField(term10494, term10494.getClass(), "threshold", 15);
        setFloatField(term10494, term10494.getClass(), "loadFactor", 0.75F);
        setField(term10493, term10493.getClass(), "posMap", term10494);
        setField(term10493, term10493.getClass(), "graph", null);
        setIntElement(term10499, 0, -758778797);
        setIntElement(term10499, 1, 765680355);
        setIntElement(term10499, 2, -1012090049);
        setIntElement(term10499, 3, -2025214553);
        setIntElement(term10499, 4, -154750730);
        setField(term10493, term10493.getClass(), "vertices", term10499);
        setIntField(term10493, term10493.getClass(), "numVertices", -2047179134);
        setIntField(term10493, term10493.getClass(), "first", 44908093);
        setField(term10507, term10507.getClass(), "words", term10508);
        setIntField(term10507, term10507.getClass(), "wordsInUse", 887198203);
        setBooleanField(term10507, term10507.getClass(), "sizeIsSticky", true);
        setField(term10493, term10493.getClass(), "bitset", term10507);
        setField(term10482, term10482.getClass(), "candidates", term10493);
        setBooleanField(term10482, term10482.getClass(), "selector", false);
        setBooleanField(term10482, term10482.getClass(), "connected", false);
        setField(term10482, term10482.getClass(), "radius", term10514);
        setField(term10482, term10482.getClass(), "diameter", term10516);
        setField(term10519, term10519.getClass(), "table", term10520);
        setIntField(term10519, term10519.getClass(), "count", 12581312);
        setIntField(term10519, term10519.getClass(), "threshold", 15);
        setFloatField(term10519, term10519.getClass(), "loadFactor", 0.75F);
        setField(term10518, term10518.getClass(), "posMap", term10519);
        setField(term10518, term10518.getClass(), "graph", null);
        setIntElement(term10524, 0, 2087383644);
        setIntElement(term10524, 1, 405527523);
        setIntElement(term10524, 2, -1123526433);
        setIntElement(term10524, 3, 910269225);
        setIntElement(term10524, 4, -298852874);
        setField(term10518, term10518.getClass(), "vertices", term10524);
        setIntField(term10518, term10518.getClass(), "numVertices", 1094297953);
        setIntField(term10518, term10518.getClass(), "first", -329141819);
        setField(term10532, term10532.getClass(), "words", term10533);
        setIntField(term10532, term10532.getClass(), "wordsInUse", -963204620);
        setBooleanField(term10532, term10532.getClass(), "sizeIsSticky", true);
        setField(term10518, term10518.getClass(), "bitset", term10532);
        setField(term10482, term10482.getClass(), "center", term10518);
        setField(term10538, term10538.getClass(), "table", term10539);
        setIntField(term10538, term10538.getClass(), "count", 172898580);
        setIntField(term10538, term10538.getClass(), "threshold", 15);
        setFloatField(term10538, term10538.getClass(), "loadFactor", 0.75F);
        setField(term10537, term10537.getClass(), "posMap", term10538);
        setField(term10537, term10537.getClass(), "graph", null);
        setIntElement(term10543, 0, -777833461);
        setIntElement(term10543, 1, 1583691829);
        setIntElement(term10543, 2, -1468541076);
        setIntElement(term10543, 3, -1796760393);
        setIntElement(term10543, 4, -2099267271);
        setIntElement(term10543, 5, 1134565344);
        setIntElement(term10543, 6, -1747434000);
        setIntElement(term10543, 7, 1611620166);
        setField(term10537, term10537.getClass(), "vertices", term10543);
        setIntField(term10537, term10537.getClass(), "numVertices", 249657454);
        setIntField(term10537, term10537.getClass(), "first", 1734630901);
        setField(term10554, term10554.getClass(), "words", term10555);
        setIntField(term10554, term10554.getClass(), "wordsInUse", -703815246);
        setBooleanField(term10554, term10554.getClass(), "sizeIsSticky", true);
        setField(term10537, term10537.getClass(), "bitset", term10554);
        setField(term10482, term10482.getClass(), "periphery", term10537);
        setField(term10482, term10482.getClass(), "extremaType", enum21);
        setField(term10482, term10482.getClass(), "graph", null);
        setBooleanField(term10482, term10482.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.ParallelExtremaCalculator$Worker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.metrics.ParallelExtremaCalculator");
        Object[] args = new Object[1];
        args[0] = term10482;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


