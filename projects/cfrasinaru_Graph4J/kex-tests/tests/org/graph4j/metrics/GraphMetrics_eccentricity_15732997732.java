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

public class GraphMetrics_eccentricity_15732997732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4804;
     Object term4856;

    public GraphMetrics_eccentricity_15732997732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4813 = new Integer(1048535127);
        Double term4815 = new Double(0.37773193782763337);
        Double term4817 = new Double(0.8474802076607362);
        Double term4819 = new Double(0.5183269973490326);
        term4804 = newInstance(Class.forName("org.graph4j.metrics.GraphMetrics"));
        Object[] term4805 = (Object[]) newArray("[D", 0);
        double[] term4806 = (double[]) newDoubleArray(6);
        Object term4821 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term4822 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term4823 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term4827 = (int[]) newIntArray(5);
        Object term4835 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4836 = (long[]) newLongArray(1);
        Object term4840 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term4841 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term4842 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term4846 = (int[]) newIntArray(1);
        Object term4850 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4851 = (long[]) newLongArray(1);
        setField(term4804, term4804.getClass(), "extremaCalculator", null);
        setField(term4804, term4804.getClass(), "dist", term4805);
        setDoubleElement(term4806, 0, 0.5617009352394552);
        setDoubleElement(term4806, 1, 0.09067063848644474);
        setDoubleElement(term4806, 2, 0.268304014379393);
        setDoubleElement(term4806, 3, 0.7171972879282721);
        setDoubleElement(term4806, 4, 0.9006361024877096);
        setDoubleElement(term4806, 5, 0.5644914462415626);
        setField(term4804, term4804.getClass(), "ecc", term4806);
        setField(term4804, term4804.getClass(), "girth", term4813);
        setField(term4804, term4804.getClass(), "diameter", term4815);
        setField(term4804, term4804.getClass(), "pseudoDiameter", term4817);
        setField(term4804, term4804.getClass(), "radius", term4819);
        setField(term4822, term4822.getClass(), "table", term4823);
        setIntField(term4822, term4822.getClass(), "count", -868676396);
        setIntField(term4822, term4822.getClass(), "threshold", 15);
        setFloatField(term4822, term4822.getClass(), "loadFactor", 0.75F);
        setField(term4821, term4821.getClass(), "posMap", term4822);
        setField(term4821, term4821.getClass(), "graph", null);
        setIntElement(term4827, 0, 1922684808);
        setIntElement(term4827, 1, -2005784375);
        setIntElement(term4827, 2, -288604325);
        setIntElement(term4827, 3, -1268314569);
        setIntElement(term4827, 4, 877649659);
        setField(term4821, term4821.getClass(), "vertices", term4827);
        setIntField(term4821, term4821.getClass(), "numVertices", -1332748804);
        setIntField(term4821, term4821.getClass(), "first", 1774507971);
        setField(term4835, term4835.getClass(), "words", term4836);
        setIntField(term4835, term4835.getClass(), "wordsInUse", -1420269858);
        setBooleanField(term4835, term4835.getClass(), "sizeIsSticky", false);
        setField(term4821, term4821.getClass(), "bitset", term4835);
        setField(term4804, term4804.getClass(), "center", term4821);
        setField(term4841, term4841.getClass(), "table", term4842);
        setIntField(term4841, term4841.getClass(), "count", -2119545015);
        setIntField(term4841, term4841.getClass(), "threshold", 15);
        setFloatField(term4841, term4841.getClass(), "loadFactor", 0.75F);
        setField(term4840, term4840.getClass(), "posMap", term4841);
        setField(term4840, term4840.getClass(), "graph", null);
        setIntElement(term4846, 0, 1272542218);
        setField(term4840, term4840.getClass(), "vertices", term4846);
        setIntField(term4840, term4840.getClass(), "numVertices", 1209799204);
        setIntField(term4840, term4840.getClass(), "first", 1094107751);
        setField(term4850, term4850.getClass(), "words", term4851);
        setIntField(term4850, term4850.getClass(), "wordsInUse", 844222656);
        setBooleanField(term4850, term4850.getClass(), "sizeIsSticky", false);
        setField(term4840, term4840.getClass(), "bitset", term4850);
        setField(term4804, term4804.getClass(), "periphery", term4840);
        setField(term4804, term4804.getClass(), "graph", null);
        setBooleanField(term4804, term4804.getClass(), "directed", false);
        term4856 = new Integer(-18216811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphMetrics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4856;
        callMethod(klass, "eccentricity", argTypes, term4804, args);
    }

};


