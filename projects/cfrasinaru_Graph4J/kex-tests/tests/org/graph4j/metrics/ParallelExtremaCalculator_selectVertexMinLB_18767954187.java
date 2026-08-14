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

public class ParallelExtremaCalculator_selectVertexMinLB_18767954187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2983;

    public ParallelExtremaCalculator_selectVertexMinLB_18767954187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3016 = new Integer(1134449235);
        Integer term3018 = new Integer(-883034806);
        Class<? extends Object> term3093 = Class.forName((String) "org.graph4j.metrics.ParallelExtremaCalculator$Type");
        Field term3092 = ((Class) term3093).getDeclaredField((String) "CENTER");
        ((Field) term3092).setAccessible(true);
        Object enum8 = ((Field) term3092).get((Object) null);
        term2983 = newInstance(Class.forName("org.graph4j.metrics.ParallelExtremaCalculator"));
        int[] term2988 = (int[]) newIntArray(2);
        int[] term2991 = (int[]) newIntArray(5);
        Object term2997 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term2998 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2999 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3003 = (int[]) newIntArray(3);
        Object term3009 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3010 = (long[]) newLongArray(1);
        Object term3020 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3021 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3022 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3026 = (int[]) newIntArray(5);
        Object term3034 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3035 = (long[]) newLongArray(1);
        Object term3039 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3040 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3041 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3045 = (int[]) newIntArray(5);
        Object term3053 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3054 = (long[]) newLongArray(1);
        setIntField(term2983, term2983.getClass(), "radiusLB", -1618206977);
        setIntField(term2983, term2983.getClass(), "radiusUB", -1747406163);
        setIntField(term2983, term2983.getClass(), "diamLB", 388157121);
        setIntField(term2983, term2983.getClass(), "diamUB", 1684998508);
        setIntElement(term2988, 0, -1476644457);
        setIntElement(term2988, 1, 1270666529);
        setField(term2983, term2983.getClass(), "eccLB", term2988);
        setIntElement(term2991, 0, -1146679443);
        setIntElement(term2991, 1, -860131894);
        setIntElement(term2991, 2, -1022990421);
        setIntElement(term2991, 3, 1045547089);
        setIntElement(term2991, 4, -1122880881);
        setField(term2983, term2983.getClass(), "eccUB", term2991);
        setField(term2998, term2998.getClass(), "table", term2999);
        setIntField(term2998, term2998.getClass(), "count", -542712742);
        setIntField(term2998, term2998.getClass(), "threshold", 15);
        setFloatField(term2998, term2998.getClass(), "loadFactor", 0.75F);
        setField(term2997, term2997.getClass(), "posMap", term2998);
        setField(term2997, term2997.getClass(), "graph", null);
        setIntElement(term3003, 0, -1254072822);
        setIntElement(term3003, 1, -1111249833);
        setIntElement(term3003, 2, -1692331299);
        setField(term2997, term2997.getClass(), "vertices", term3003);
        setIntField(term2997, term2997.getClass(), "numVertices", 479531250);
        setIntField(term2997, term2997.getClass(), "first", 1320570890);
        setField(term3009, term3009.getClass(), "words", term3010);
        setIntField(term3009, term3009.getClass(), "wordsInUse", -130649791);
        setBooleanField(term3009, term3009.getClass(), "sizeIsSticky", true);
        setField(term2997, term2997.getClass(), "bitset", term3009);
        setField(term2983, term2983.getClass(), "candidates", term2997);
        setBooleanField(term2983, term2983.getClass(), "selector", true);
        setBooleanField(term2983, term2983.getClass(), "connected", false);
        setField(term2983, term2983.getClass(), "radius", term3016);
        setField(term2983, term2983.getClass(), "diameter", term3018);
        setField(term3021, term3021.getClass(), "table", term3022);
        setIntField(term3021, term3021.getClass(), "count", 534834644);
        setIntField(term3021, term3021.getClass(), "threshold", 15);
        setFloatField(term3021, term3021.getClass(), "loadFactor", 0.75F);
        setField(term3020, term3020.getClass(), "posMap", term3021);
        setField(term3020, term3020.getClass(), "graph", null);
        setIntElement(term3026, 0, 1959097203);
        setIntElement(term3026, 1, -209654048);
        setIntElement(term3026, 2, 477625804);
        setIntElement(term3026, 3, 252575029);
        setIntElement(term3026, 4, 57189932);
        setField(term3020, term3020.getClass(), "vertices", term3026);
        setIntField(term3020, term3020.getClass(), "numVertices", 1460722225);
        setIntField(term3020, term3020.getClass(), "first", 1743224434);
        setField(term3034, term3034.getClass(), "words", term3035);
        setIntField(term3034, term3034.getClass(), "wordsInUse", 842904495);
        setBooleanField(term3034, term3034.getClass(), "sizeIsSticky", false);
        setField(term3020, term3020.getClass(), "bitset", term3034);
        setField(term2983, term2983.getClass(), "center", term3020);
        setField(term3040, term3040.getClass(), "table", term3041);
        setIntField(term3040, term3040.getClass(), "count", 1008080511);
        setIntField(term3040, term3040.getClass(), "threshold", 15);
        setFloatField(term3040, term3040.getClass(), "loadFactor", 0.75F);
        setField(term3039, term3039.getClass(), "posMap", term3040);
        setField(term3039, term3039.getClass(), "graph", null);
        setIntElement(term3045, 0, 1935707624);
        setIntElement(term3045, 1, 1507074215);
        setIntElement(term3045, 2, -282881827);
        setIntElement(term3045, 3, -1183353915);
        setIntElement(term3045, 4, -420030135);
        setField(term3039, term3039.getClass(), "vertices", term3045);
        setIntField(term3039, term3039.getClass(), "numVertices", 267763294);
        setIntField(term3039, term3039.getClass(), "first", -1497710478);
        setField(term3053, term3053.getClass(), "words", term3054);
        setIntField(term3053, term3053.getClass(), "wordsInUse", 49950830);
        setBooleanField(term3053, term3053.getClass(), "sizeIsSticky", false);
        setField(term3039, term3039.getClass(), "bitset", term3053);
        setField(term2983, term2983.getClass(), "periphery", term3039);
        setField(term2983, term2983.getClass(), "extremaType", enum8);
        setField(term2983, term2983.getClass(), "graph", null);
        setBooleanField(term2983, term2983.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.ParallelExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "selectVertexMinLB", argTypes, term2983, args);
    }

};


