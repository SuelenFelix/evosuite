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

public class GraphMetrics_pseudoDiameter_8708682208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5412;

    public GraphMetrics_pseudoDiameter_8708682208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5433 = new Integer(1135664017);
        Double term5435 = new Double(0.7559240768573477);
        Double term5437 = new Double(0.10667076642995188);
        Double term5439 = new Double(0.11493000848982304);
        term5412 = newInstance(Class.forName("org.graph4j.metrics.GraphMetrics"));
        Object[] term5413 = (Object[]) newArray("[D", 4);
        double[] term5414 = (double[]) newDoubleArray(1);
        double[] term5416 = (double[]) newDoubleArray(0);
        double[] term5417 = (double[]) newDoubleArray(6);
        double[] term5424 = (double[]) newDoubleArray(3);
        double[] term5428 = (double[]) newDoubleArray(4);
        Object term5441 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5442 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5443 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5447 = (int[]) newIntArray(5);
        Object term5455 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5456 = (long[]) newLongArray(1);
        Object term5460 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5461 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5462 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5466 = (int[]) newIntArray(8);
        Object term5477 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5478 = (long[]) newLongArray(1);
        setField(term5412, term5412.getClass(), "extremaCalculator", null);
        setDoubleElement(term5414, 0, 0.04662501176438627);
        setElement(term5413, 0, term5414);
        setElement(term5413, 1, term5416);
        setDoubleElement(term5417, 0, 0.17512426723256447);
        setDoubleElement(term5417, 1, 0.9379214810416256);
        setDoubleElement(term5417, 2, 0.10807577760679721);
        setDoubleElement(term5417, 3, 0.7808234535616719);
        setDoubleElement(term5417, 4, 0.9772425797816359);
        setDoubleElement(term5417, 5, 0.32009327814110977);
        setElement(term5413, 2, term5417);
        setDoubleElement(term5424, 0, 0.9013029318694921);
        setDoubleElement(term5424, 1, 0.1755673139619638);
        setDoubleElement(term5424, 2, 0.9136597256674437);
        setElement(term5413, 3, term5424);
        setField(term5412, term5412.getClass(), "dist", term5413);
        setDoubleElement(term5428, 0, 0.3741779691002205);
        setDoubleElement(term5428, 1, 0.5652495059647745);
        setDoubleElement(term5428, 2, 0.021410850431387685);
        setDoubleElement(term5428, 3, 0.8397628091272534);
        setField(term5412, term5412.getClass(), "ecc", term5428);
        setField(term5412, term5412.getClass(), "girth", term5433);
        setField(term5412, term5412.getClass(), "diameter", term5435);
        setField(term5412, term5412.getClass(), "pseudoDiameter", term5437);
        setField(term5412, term5412.getClass(), "radius", term5439);
        setField(term5442, term5442.getClass(), "table", term5443);
        setIntField(term5442, term5442.getClass(), "count", -97742366);
        setIntField(term5442, term5442.getClass(), "threshold", 15);
        setFloatField(term5442, term5442.getClass(), "loadFactor", 0.75F);
        setField(term5441, term5441.getClass(), "posMap", term5442);
        setField(term5441, term5441.getClass(), "graph", null);
        setIntElement(term5447, 0, 1638851942);
        setIntElement(term5447, 1, 1374790203);
        setIntElement(term5447, 2, 1160010161);
        setIntElement(term5447, 3, -423900705);
        setIntElement(term5447, 4, -525570815);
        setField(term5441, term5441.getClass(), "vertices", term5447);
        setIntField(term5441, term5441.getClass(), "numVertices", 754055848);
        setIntField(term5441, term5441.getClass(), "first", -19246901);
        setField(term5455, term5455.getClass(), "words", term5456);
        setIntField(term5455, term5455.getClass(), "wordsInUse", -370828664);
        setBooleanField(term5455, term5455.getClass(), "sizeIsSticky", false);
        setField(term5441, term5441.getClass(), "bitset", term5455);
        setField(term5412, term5412.getClass(), "center", term5441);
        setField(term5461, term5461.getClass(), "table", term5462);
        setIntField(term5461, term5461.getClass(), "count", 1168633950);
        setIntField(term5461, term5461.getClass(), "threshold", 15);
        setFloatField(term5461, term5461.getClass(), "loadFactor", 0.75F);
        setField(term5460, term5460.getClass(), "posMap", term5461);
        setField(term5460, term5460.getClass(), "graph", null);
        setIntElement(term5466, 0, 1607082164);
        setIntElement(term5466, 1, 1890399366);
        setIntElement(term5466, 2, -1867239125);
        setIntElement(term5466, 3, 952869601);
        setIntElement(term5466, 4, 91958879);
        setIntElement(term5466, 5, -645429025);
        setIntElement(term5466, 6, -688213483);
        setIntElement(term5466, 7, 644154104);
        setField(term5460, term5460.getClass(), "vertices", term5466);
        setIntField(term5460, term5460.getClass(), "numVertices", 76650923);
        setIntField(term5460, term5460.getClass(), "first", 1003743923);
        setField(term5477, term5477.getClass(), "words", term5478);
        setIntField(term5477, term5477.getClass(), "wordsInUse", 1887772522);
        setBooleanField(term5477, term5477.getClass(), "sizeIsSticky", false);
        setField(term5460, term5460.getClass(), "bitset", term5477);
        setField(term5412, term5412.getClass(), "periphery", term5460);
        setField(term5412, term5412.getClass(), "graph", null);
        setBooleanField(term5412, term5412.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphMetrics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pseudoDiameter", argTypes, term5412, args);
    }

};


