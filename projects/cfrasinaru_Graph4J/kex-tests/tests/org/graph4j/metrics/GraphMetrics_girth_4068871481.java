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

public class GraphMetrics_girth_4068871481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4649;

    public GraphMetrics_girth_4068871481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4706 = new Integer(1622346318);
        Double term4708 = new Double(0.2641345529914265);
        Double term4710 = new Double(0.36923381893433327);
        Double term4712 = new Double(0.6076495596892013);
        term4649 = newInstance(Class.forName("org.graph4j.metrics.GraphMetrics"));
        Object[] term4650 = (Object[]) newArray("[D", 7);
        double[] term4651 = (double[]) newDoubleArray(6);
        double[] term4658 = (double[]) newDoubleArray(7);
        double[] term4666 = (double[]) newDoubleArray(9);
        double[] term4676 = (double[]) newDoubleArray(7);
        double[] term4684 = (double[]) newDoubleArray(6);
        double[] term4691 = (double[]) newDoubleArray(6);
        double[] term4698 = (double[]) newDoubleArray(0);
        double[] term4699 = (double[]) newDoubleArray(6);
        Object term4714 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term4715 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term4716 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term4720 = (int[]) newIntArray(5);
        Object term4728 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4729 = (long[]) newLongArray(1);
        Object term4733 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term4734 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term4735 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term4739 = (int[]) newIntArray(1);
        Object term4743 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4744 = (long[]) newLongArray(1);
        setField(term4649, term4649.getClass(), "extremaCalculator", null);
        setDoubleElement(term4651, 0, 0.6862221294683138);
        setDoubleElement(term4651, 1, 0.15917839663695388);
        setDoubleElement(term4651, 2, 0.9374115574082594);
        setDoubleElement(term4651, 3, 0.8454723071922143);
        setDoubleElement(term4651, 4, 0.8566567697571895);
        setDoubleElement(term4651, 5, 0.9203805380592256);
        setElement(term4650, 0, term4651);
        setDoubleElement(term4658, 0, 0.5804948995371725);
        setDoubleElement(term4658, 1, 0.20737514139742264);
        setDoubleElement(term4658, 2, 0.7919370314903882);
        setDoubleElement(term4658, 3, 0.2109867221632754);
        setDoubleElement(term4658, 4, 0.3227335400819148);
        setDoubleElement(term4658, 5, 0.43337207054070237);
        setDoubleElement(term4658, 6, 0.13246999699526574);
        setElement(term4650, 1, term4658);
        setDoubleElement(term4666, 0, 0.9126850255993704);
        setDoubleElement(term4666, 1, 0.11179067076100713);
        setDoubleElement(term4666, 2, 0.5306473989087822);
        setDoubleElement(term4666, 3, 0.022483645678509023);
        setDoubleElement(term4666, 4, 0.025133051616627267);
        setDoubleElement(term4666, 5, 0.016575281023182953);
        setDoubleElement(term4666, 6, 0.5308350402051779);
        setDoubleElement(term4666, 7, 0.7154795600170818);
        setDoubleElement(term4666, 8, 0.6355029654528058);
        setElement(term4650, 2, term4666);
        setDoubleElement(term4676, 0, 0.0022646783892913414);
        setDoubleElement(term4676, 1, 0.36226058076369927);
        setDoubleElement(term4676, 2, 0.03699061125289671);
        setDoubleElement(term4676, 3, 0.6047137830113202);
        setDoubleElement(term4676, 4, 0.6767213143579776);
        setDoubleElement(term4676, 5, 0.48862955528902696);
        setDoubleElement(term4676, 6, 0.426231085465289);
        setElement(term4650, 3, term4676);
        setDoubleElement(term4684, 0, 0.0027299293098262956);
        setDoubleElement(term4684, 1, 0.29874017652881824);
        setDoubleElement(term4684, 2, 0.32554480512985284);
        setDoubleElement(term4684, 3, 0.8924855581421237);
        setDoubleElement(term4684, 4, 0.32237559209193944);
        setDoubleElement(term4684, 5, 0.53094494792755);
        setElement(term4650, 4, term4684);
        setDoubleElement(term4691, 0, 0.146431486357265);
        setDoubleElement(term4691, 1, 0.24259014218848696);
        setDoubleElement(term4691, 2, 0.1544348383112728);
        setDoubleElement(term4691, 3, 0.5187846213101265);
        setDoubleElement(term4691, 4, 0.045893173090043815);
        setDoubleElement(term4691, 5, 0.3626177854778667);
        setElement(term4650, 5, term4691);
        setElement(term4650, 6, term4698);
        setField(term4649, term4649.getClass(), "dist", term4650);
        setDoubleElement(term4699, 0, 0.3163771663728089);
        setDoubleElement(term4699, 1, 0.8819646072665548);
        setDoubleElement(term4699, 2, 0.5412182593116958);
        setDoubleElement(term4699, 3, 0.16988691727397487);
        setDoubleElement(term4699, 4, 0.39286935532362843);
        setDoubleElement(term4699, 5, 0.11577948268926874);
        setField(term4649, term4649.getClass(), "ecc", term4699);
        setField(term4649, term4649.getClass(), "girth", term4706);
        setField(term4649, term4649.getClass(), "diameter", term4708);
        setField(term4649, term4649.getClass(), "pseudoDiameter", term4710);
        setField(term4649, term4649.getClass(), "radius", term4712);
        setField(term4715, term4715.getClass(), "table", term4716);
        setIntField(term4715, term4715.getClass(), "count", 1215150180);
        setIntField(term4715, term4715.getClass(), "threshold", 15);
        setFloatField(term4715, term4715.getClass(), "loadFactor", 0.75F);
        setField(term4714, term4714.getClass(), "posMap", term4715);
        setField(term4714, term4714.getClass(), "graph", null);
        setIntElement(term4720, 0, -1422859977);
        setIntElement(term4720, 1, -1972436591);
        setIntElement(term4720, 2, 68922753);
        setIntElement(term4720, 3, -220791533);
        setIntElement(term4720, 4, 1741500243);
        setField(term4714, term4714.getClass(), "vertices", term4720);
        setIntField(term4714, term4714.getClass(), "numVertices", -2070466617);
        setIntField(term4714, term4714.getClass(), "first", -1127721881);
        setField(term4728, term4728.getClass(), "words", term4729);
        setIntField(term4728, term4728.getClass(), "wordsInUse", 1074848808);
        setBooleanField(term4728, term4728.getClass(), "sizeIsSticky", false);
        setField(term4714, term4714.getClass(), "bitset", term4728);
        setField(term4649, term4649.getClass(), "center", term4714);
        setField(term4734, term4734.getClass(), "table", term4735);
        setIntField(term4734, term4734.getClass(), "count", -146054762);
        setIntField(term4734, term4734.getClass(), "threshold", 15);
        setFloatField(term4734, term4734.getClass(), "loadFactor", 0.75F);
        setField(term4733, term4733.getClass(), "posMap", term4734);
        setField(term4733, term4733.getClass(), "graph", null);
        setIntElement(term4739, 0, 798043553);
        setField(term4733, term4733.getClass(), "vertices", term4739);
        setIntField(term4733, term4733.getClass(), "numVertices", 533197381);
        setIntField(term4733, term4733.getClass(), "first", 1048271679);
        setField(term4743, term4743.getClass(), "words", term4744);
        setIntField(term4743, term4743.getClass(), "wordsInUse", -1529797673);
        setBooleanField(term4743, term4743.getClass(), "sizeIsSticky", false);
        setField(term4733, term4733.getClass(), "bitset", term4743);
        setField(term4649, term4649.getClass(), "periphery", term4733);
        setField(term4649, term4649.getClass(), "graph", null);
        setBooleanField(term4649, term4649.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphMetrics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "girth", argTypes, term4649, args);
    }

};


