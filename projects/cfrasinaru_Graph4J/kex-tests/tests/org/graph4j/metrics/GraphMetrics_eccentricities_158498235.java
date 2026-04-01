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
import java.lang.Double;

public class GraphMetrics_eccentricities_158498235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5116;

    public GraphMetrics_eccentricities_158498235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5128 = new Integer(-2068769794);
        Double term5130 = new Double(0.6436713023569729);
        Double term5132 = new Double(0.7332741045694002);
        Double term5134 = new Double(0.4569171842750229);
        term5116 = newInstance(Class.forName("org.graph4j.metrics.GraphMetrics"));
        Object[] term5117 = (Object[]) newArray("[D", 1);
        double[] term5118 = (double[]) newDoubleArray(5);
        double[] term5124 = (double[]) newDoubleArray(3);
        Object term5136 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5137 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5138 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5142 = (int[]) newIntArray(9);
        Object term5154 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5155 = (long[]) newLongArray(1);
        Object term5159 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5160 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5161 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5165 = (int[]) newIntArray(7);
        Object term5175 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5176 = (long[]) newLongArray(1);
        setField(term5116, term5116.getClass(), "extremaCalculator", null);
        setDoubleElement(term5118, 0, 0.9165240441138934);
        setDoubleElement(term5118, 1, 0.22227423914231126);
        setDoubleElement(term5118, 2, 0.06480976831423468);
        setDoubleElement(term5118, 3, 0.8490790645379176);
        setDoubleElement(term5118, 4, 0.23129126164078717);
        setElement(term5117, 0, term5118);
        setField(term5116, term5116.getClass(), "dist", term5117);
        setDoubleElement(term5124, 0, 0.6047138318674447);
        setDoubleElement(term5124, 1, 0.5597136413549945);
        setDoubleElement(term5124, 2, 0.28292420012823627);
        setField(term5116, term5116.getClass(), "ecc", term5124);
        setField(term5116, term5116.getClass(), "girth", term5128);
        setField(term5116, term5116.getClass(), "diameter", term5130);
        setField(term5116, term5116.getClass(), "pseudoDiameter", term5132);
        setField(term5116, term5116.getClass(), "radius", term5134);
        setField(term5137, term5137.getClass(), "table", term5138);
        setIntField(term5137, term5137.getClass(), "count", 2143282300);
        setIntField(term5137, term5137.getClass(), "threshold", 15);
        setFloatField(term5137, term5137.getClass(), "loadFactor", 0.75F);
        setField(term5136, term5136.getClass(), "posMap", term5137);
        setField(term5136, term5136.getClass(), "graph", null);
        setIntElement(term5142, 0, 1137624258);
        setIntElement(term5142, 1, 977862393);
        setIntElement(term5142, 2, 301401782);
        setIntElement(term5142, 3, 1988605357);
        setIntElement(term5142, 4, 808203320);
        setIntElement(term5142, 5, -544382127);
        setIntElement(term5142, 6, -1830198043);
        setIntElement(term5142, 7, -439048495);
        setIntElement(term5142, 8, -1849105286);
        setField(term5136, term5136.getClass(), "vertices", term5142);
        setIntField(term5136, term5136.getClass(), "numVertices", 1334483645);
        setIntField(term5136, term5136.getClass(), "first", 917513193);
        setField(term5154, term5154.getClass(), "words", term5155);
        setIntField(term5154, term5154.getClass(), "wordsInUse", 787278105);
        setBooleanField(term5154, term5154.getClass(), "sizeIsSticky", true);
        setField(term5136, term5136.getClass(), "bitset", term5154);
        setField(term5116, term5116.getClass(), "center", term5136);
        setField(term5160, term5160.getClass(), "table", term5161);
        setIntField(term5160, term5160.getClass(), "count", -2063843486);
        setIntField(term5160, term5160.getClass(), "threshold", 15);
        setFloatField(term5160, term5160.getClass(), "loadFactor", 0.75F);
        setField(term5159, term5159.getClass(), "posMap", term5160);
        setField(term5159, term5159.getClass(), "graph", null);
        setIntElement(term5165, 0, 833762980);
        setIntElement(term5165, 1, 320711637);
        setIntElement(term5165, 2, 1241164745);
        setIntElement(term5165, 3, 1723148410);
        setIntElement(term5165, 4, -920797484);
        setIntElement(term5165, 5, -1631697577);
        setIntElement(term5165, 6, 765731371);
        setField(term5159, term5159.getClass(), "vertices", term5165);
        setIntField(term5159, term5159.getClass(), "numVertices", -1703035419);
        setIntField(term5159, term5159.getClass(), "first", 765766290);
        setField(term5175, term5175.getClass(), "words", term5176);
        setIntField(term5175, term5175.getClass(), "wordsInUse", -1284825282);
        setBooleanField(term5175, term5175.getClass(), "sizeIsSticky", false);
        setField(term5159, term5159.getClass(), "bitset", term5175);
        setField(term5116, term5116.getClass(), "periphery", term5159);
        setField(term5116, term5116.getClass(), "graph", null);
        setBooleanField(term5116, term5116.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphMetrics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "eccentricities", argTypes, term5116, args);
    }

};


