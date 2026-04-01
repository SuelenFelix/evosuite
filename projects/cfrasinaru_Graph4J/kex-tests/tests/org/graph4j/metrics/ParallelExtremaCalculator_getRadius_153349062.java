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

public class ParallelExtremaCalculator_getRadius_153349062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1021;

    public ParallelExtremaCalculator_getRadius_153349062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1058 = new Integer(1484323161);
        Integer term1060 = new Integer(391863371);
        Class<? extends Object> term1143 = Class.forName((String) "org.graph4j.metrics.ParallelExtremaCalculator$Type");
        Field term1142 = ((Class) term1143).getDeclaredField((String) "DIAMETER");
        ((Field) term1142).setAccessible(true);
        Object enum3 = ((Field) term1142).get((Object) null);
        term1021 = newInstance(Class.forName("org.graph4j.metrics.ParallelExtremaCalculator"));
        int[] term1026 = (int[]) newIntArray(6);
        int[] term1033 = (int[]) newIntArray(7);
        Object term1041 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term1042 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term1043 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term1047 = (int[]) newIntArray(1);
        Object term1051 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1052 = (long[]) newLongArray(1);
        Object term1062 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term1063 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term1064 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term1068 = (int[]) newIntArray(6);
        Object term1077 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1078 = (long[]) newLongArray(1);
        Object term1082 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term1083 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term1084 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term1088 = (int[]) newIntArray(5);
        Object term1096 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1097 = (long[]) newLongArray(1);
        setIntField(term1021, term1021.getClass(), "radiusLB", -469968304);
        setIntField(term1021, term1021.getClass(), "radiusUB", -1145578966);
        setIntField(term1021, term1021.getClass(), "diamLB", 679763016);
        setIntField(term1021, term1021.getClass(), "diamUB", 1962444399);
        setIntElement(term1026, 0, 767834723);
        setIntElement(term1026, 1, -602026508);
        setIntElement(term1026, 2, -157887805);
        setIntElement(term1026, 3, 1876565163);
        setIntElement(term1026, 4, -817164822);
        setIntElement(term1026, 5, -1016503459);
        setField(term1021, term1021.getClass(), "eccLB", term1026);
        setIntElement(term1033, 0, -1968847291);
        setIntElement(term1033, 1, 579005622);
        setIntElement(term1033, 2, -14890619);
        setIntElement(term1033, 3, 1632125673);
        setIntElement(term1033, 4, 454281060);
        setIntElement(term1033, 5, -1786399638);
        setIntElement(term1033, 6, 2055867847);
        setField(term1021, term1021.getClass(), "eccUB", term1033);
        setField(term1042, term1042.getClass(), "table", term1043);
        setIntField(term1042, term1042.getClass(), "count", -1048298087);
        setIntField(term1042, term1042.getClass(), "threshold", 15);
        setFloatField(term1042, term1042.getClass(), "loadFactor", 0.75F);
        setField(term1041, term1041.getClass(), "posMap", term1042);
        setField(term1041, term1041.getClass(), "graph", null);
        setIntElement(term1047, 0, 292681826);
        setField(term1041, term1041.getClass(), "vertices", term1047);
        setIntField(term1041, term1041.getClass(), "numVertices", 458147407);
        setIntField(term1041, term1041.getClass(), "first", -184153539);
        setField(term1051, term1051.getClass(), "words", term1052);
        setIntField(term1051, term1051.getClass(), "wordsInUse", 493620644);
        setBooleanField(term1051, term1051.getClass(), "sizeIsSticky", true);
        setField(term1041, term1041.getClass(), "bitset", term1051);
        setField(term1021, term1021.getClass(), "candidates", term1041);
        setBooleanField(term1021, term1021.getClass(), "selector", false);
        setBooleanField(term1021, term1021.getClass(), "connected", true);
        setField(term1021, term1021.getClass(), "radius", term1058);
        setField(term1021, term1021.getClass(), "diameter", term1060);
        setField(term1063, term1063.getClass(), "table", term1064);
        setIntField(term1063, term1063.getClass(), "count", 1328271830);
        setIntField(term1063, term1063.getClass(), "threshold", 15);
        setFloatField(term1063, term1063.getClass(), "loadFactor", 0.75F);
        setField(term1062, term1062.getClass(), "posMap", term1063);
        setField(term1062, term1062.getClass(), "graph", null);
        setIntElement(term1068, 0, 1596070772);
        setIntElement(term1068, 1, 97029295);
        setIntElement(term1068, 2, -1371869594);
        setIntElement(term1068, 3, -2095575670);
        setIntElement(term1068, 4, 1225272962);
        setIntElement(term1068, 5, 1324040357);
        setField(term1062, term1062.getClass(), "vertices", term1068);
        setIntField(term1062, term1062.getClass(), "numVertices", -1588772968);
        setIntField(term1062, term1062.getClass(), "first", -93135961);
        setField(term1077, term1077.getClass(), "words", term1078);
        setIntField(term1077, term1077.getClass(), "wordsInUse", -112921587);
        setBooleanField(term1077, term1077.getClass(), "sizeIsSticky", false);
        setField(term1062, term1062.getClass(), "bitset", term1077);
        setField(term1021, term1021.getClass(), "center", term1062);
        setField(term1083, term1083.getClass(), "table", term1084);
        setIntField(term1083, term1083.getClass(), "count", 933028652);
        setIntField(term1083, term1083.getClass(), "threshold", 15);
        setFloatField(term1083, term1083.getClass(), "loadFactor", 0.75F);
        setField(term1082, term1082.getClass(), "posMap", term1083);
        setField(term1082, term1082.getClass(), "graph", null);
        setIntElement(term1088, 0, 287287233);
        setIntElement(term1088, 1, 962840079);
        setIntElement(term1088, 2, 1540719661);
        setIntElement(term1088, 3, 1265463001);
        setIntElement(term1088, 4, 335112684);
        setField(term1082, term1082.getClass(), "vertices", term1088);
        setIntField(term1082, term1082.getClass(), "numVertices", 1551099402);
        setIntField(term1082, term1082.getClass(), "first", -2027534003);
        setField(term1096, term1096.getClass(), "words", term1097);
        setIntField(term1096, term1096.getClass(), "wordsInUse", 1063420942);
        setBooleanField(term1096, term1096.getClass(), "sizeIsSticky", true);
        setField(term1082, term1082.getClass(), "bitset", term1096);
        setField(term1021, term1021.getClass(), "periphery", term1082);
        setField(term1021, term1021.getClass(), "extremaType", enum3);
        setField(term1021, term1021.getClass(), "graph", null);
        setBooleanField(term1021, term1021.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.ParallelExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRadius", argTypes, term1021, args);
    }

};


