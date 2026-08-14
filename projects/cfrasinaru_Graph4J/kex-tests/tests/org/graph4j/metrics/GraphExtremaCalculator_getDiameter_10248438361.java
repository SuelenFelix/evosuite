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

public class GraphExtremaCalculator_getDiameter_10248438361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6367;

    public GraphExtremaCalculator_getDiameter_10248438361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6407 = new Integer(-1179120542);
        Integer term6409 = new Integer(-73683645);
        Class<? extends Object> term6490 = Class.forName((String) "org.graph4j.metrics.GraphExtremaCalculator$Type");
        Field term6489 = ((Class) term6490).getDeclaredField((String) "RADIUS");
        ((Field) term6489).setAccessible(true);
        Object enum12 = ((Field) term6489).get((Object) null);
        term6367 = newInstance(Class.forName("org.graph4j.metrics.GraphExtremaCalculator"));
        int[] term6372 = (int[]) newIntArray(5);
        int[] term6378 = (int[]) newIntArray(1);
        int[] term6380 = (int[]) newIntArray(2);
        Object term6383 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6384 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term6385 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term6389 = (int[]) newIntArray(8);
        Object term6400 = newInstance(Class.forName("java.util.BitSet"));
        long[] term6401 = (long[]) newLongArray(1);
        Object term6411 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6412 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term6413 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term6417 = (int[]) newIntArray(1);
        Object term6421 = newInstance(Class.forName("java.util.BitSet"));
        long[] term6422 = (long[]) newLongArray(1);
        Object term6426 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6427 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term6428 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term6432 = (int[]) newIntArray(9);
        Object term6444 = newInstance(Class.forName("java.util.BitSet"));
        long[] term6445 = (long[]) newLongArray(1);
        setIntField(term6367, term6367.getClass(), "radiusLB", 1505480070);
        setIntField(term6367, term6367.getClass(), "radiusUB", -829088844);
        setIntField(term6367, term6367.getClass(), "diamLB", -31751777);
        setIntField(term6367, term6367.getClass(), "diamUB", -246967963);
        setIntElement(term6372, 0, -1777140369);
        setIntElement(term6372, 1, 993627098);
        setIntElement(term6372, 2, 872295704);
        setIntElement(term6372, 3, 86041387);
        setIntElement(term6372, 4, 1010721666);
        setField(term6367, term6367.getClass(), "eccLB", term6372);
        setIntElement(term6378, 0, 27043781);
        setField(term6367, term6367.getClass(), "eccUB", term6378);
        setIntElement(term6380, 0, -1367122405);
        setIntElement(term6380, 1, -1703625118);
        setField(term6367, term6367.getClass(), "dist", term6380);
        setField(term6384, term6384.getClass(), "table", term6385);
        setIntField(term6384, term6384.getClass(), "count", 1104108112);
        setIntField(term6384, term6384.getClass(), "threshold", 15);
        setFloatField(term6384, term6384.getClass(), "loadFactor", 0.75F);
        setField(term6383, term6383.getClass(), "posMap", term6384);
        setField(term6383, term6383.getClass(), "graph", null);
        setIntElement(term6389, 0, 1648665618);
        setIntElement(term6389, 1, 633765954);
        setIntElement(term6389, 2, 269110087);
        setIntElement(term6389, 3, 1545119095);
        setIntElement(term6389, 4, 1671229683);
        setIntElement(term6389, 5, 34167717);
        setIntElement(term6389, 6, -514195141);
        setIntElement(term6389, 7, -297946422);
        setField(term6383, term6383.getClass(), "vertices", term6389);
        setIntField(term6383, term6383.getClass(), "numVertices", 385463636);
        setIntField(term6383, term6383.getClass(), "first", -1677599962);
        setField(term6400, term6400.getClass(), "words", term6401);
        setIntField(term6400, term6400.getClass(), "wordsInUse", -1790275458);
        setBooleanField(term6400, term6400.getClass(), "sizeIsSticky", true);
        setField(term6383, term6383.getClass(), "bitset", term6400);
        setField(term6367, term6367.getClass(), "candidates", term6383);
        setBooleanField(term6367, term6367.getClass(), "selector", false);
        setBooleanField(term6367, term6367.getClass(), "connected", true);
        setField(term6367, term6367.getClass(), "radius", term6407);
        setField(term6367, term6367.getClass(), "diameter", term6409);
        setField(term6412, term6412.getClass(), "table", term6413);
        setIntField(term6412, term6412.getClass(), "count", -497534255);
        setIntField(term6412, term6412.getClass(), "threshold", 15);
        setFloatField(term6412, term6412.getClass(), "loadFactor", 0.75F);
        setField(term6411, term6411.getClass(), "posMap", term6412);
        setField(term6411, term6411.getClass(), "graph", null);
        setIntElement(term6417, 0, 1588942911);
        setField(term6411, term6411.getClass(), "vertices", term6417);
        setIntField(term6411, term6411.getClass(), "numVertices", -2129828854);
        setIntField(term6411, term6411.getClass(), "first", -47438786);
        setField(term6421, term6421.getClass(), "words", term6422);
        setIntField(term6421, term6421.getClass(), "wordsInUse", -1955400589);
        setBooleanField(term6421, term6421.getClass(), "sizeIsSticky", false);
        setField(term6411, term6411.getClass(), "bitset", term6421);
        setField(term6367, term6367.getClass(), "center", term6411);
        setField(term6427, term6427.getClass(), "table", term6428);
        setIntField(term6427, term6427.getClass(), "count", 626179200);
        setIntField(term6427, term6427.getClass(), "threshold", 15);
        setFloatField(term6427, term6427.getClass(), "loadFactor", 0.75F);
        setField(term6426, term6426.getClass(), "posMap", term6427);
        setField(term6426, term6426.getClass(), "graph", null);
        setIntElement(term6432, 0, -511077684);
        setIntElement(term6432, 1, -711507760);
        setIntElement(term6432, 2, 1053773809);
        setIntElement(term6432, 3, 924127883);
        setIntElement(term6432, 4, -751079123);
        setIntElement(term6432, 5, -110837188);
        setIntElement(term6432, 6, -271094506);
        setIntElement(term6432, 7, 455632030);
        setIntElement(term6432, 8, -1632929393);
        setField(term6426, term6426.getClass(), "vertices", term6432);
        setIntField(term6426, term6426.getClass(), "numVertices", -431440129);
        setIntField(term6426, term6426.getClass(), "first", -763576148);
        setField(term6444, term6444.getClass(), "words", term6445);
        setIntField(term6444, term6444.getClass(), "wordsInUse", 1568948514);
        setBooleanField(term6444, term6444.getClass(), "sizeIsSticky", false);
        setField(term6426, term6426.getClass(), "bitset", term6444);
        setField(term6367, term6367.getClass(), "periphery", term6426);
        setField(term6367, term6367.getClass(), "extremaType", enum12);
        setField(term6367, term6367.getClass(), "graph", null);
        setBooleanField(term6367, term6367.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDiameter", argTypes, term6367, args);
    }

};


