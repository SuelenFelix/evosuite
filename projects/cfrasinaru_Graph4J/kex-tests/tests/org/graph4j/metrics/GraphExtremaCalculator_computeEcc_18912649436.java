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

public class GraphExtremaCalculator_computeEcc_18912649436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8377;
     Object term8462;

    public GraphExtremaCalculator_computeEcc_18912649436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8407 = new Integer(767834723);
        Integer term8409 = new Integer(-602026508);
        Class<? extends Object> term8483 = Class.forName((String) "org.graph4j.metrics.GraphExtremaCalculator$Type");
        Field term8482 = ((Class) term8483).getDeclaredField((String) "PERIPHERY");
        ((Field) term8482).setAccessible(true);
        Object enum17 = ((Field) term8482).get((Object) null);
        term8377 = newInstance(Class.forName("org.graph4j.metrics.GraphExtremaCalculator"));
        int[] term8382 = (int[]) newIntArray(2);
        int[] term8385 = (int[]) newIntArray(3);
        int[] term8389 = (int[]) newIntArray(1);
        Object term8391 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8392 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8393 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8397 = (int[]) newIntArray(0);
        Object term8400 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8401 = (long[]) newLongArray(1);
        Object term8411 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8412 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8413 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8417 = (int[]) newIntArray(0);
        Object term8420 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8421 = (long[]) newLongArray(1);
        Object term8425 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8426 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8427 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8431 = (int[]) newIntArray(9);
        Object term8443 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8444 = (long[]) newLongArray(1);
        setIntField(term8377, term8377.getClass(), "radiusLB", 1430066560);
        setIntField(term8377, term8377.getClass(), "radiusUB", 836734074);
        setIntField(term8377, term8377.getClass(), "diamLB", -1747711865);
        setIntField(term8377, term8377.getClass(), "diamUB", 682812715);
        setIntElement(term8382, 0, -1092883950);
        setIntElement(term8382, 1, 950385621);
        setField(term8377, term8377.getClass(), "eccLB", term8382);
        setIntElement(term8385, 0, -232352320);
        setIntElement(term8385, 1, -232333014);
        setIntElement(term8385, 2, -139694079);
        setField(term8377, term8377.getClass(), "eccUB", term8385);
        setIntElement(term8389, 0, -1602072035);
        setField(term8377, term8377.getClass(), "dist", term8389);
        setField(term8392, term8392.getClass(), "table", term8393);
        setIntField(term8392, term8392.getClass(), "count", 1902624392);
        setIntField(term8392, term8392.getClass(), "threshold", 15);
        setFloatField(term8392, term8392.getClass(), "loadFactor", 0.75F);
        setField(term8391, term8391.getClass(), "posMap", term8392);
        setField(term8391, term8391.getClass(), "graph", null);
        setField(term8391, term8391.getClass(), "vertices", term8397);
        setIntField(term8391, term8391.getClass(), "numVertices", 904607217);
        setIntField(term8391, term8391.getClass(), "first", 434914590);
        setField(term8400, term8400.getClass(), "words", term8401);
        setIntField(term8400, term8400.getClass(), "wordsInUse", 1983756621);
        setBooleanField(term8400, term8400.getClass(), "sizeIsSticky", true);
        setField(term8391, term8391.getClass(), "bitset", term8400);
        setField(term8377, term8377.getClass(), "candidates", term8391);
        setBooleanField(term8377, term8377.getClass(), "selector", false);
        setBooleanField(term8377, term8377.getClass(), "connected", true);
        setField(term8377, term8377.getClass(), "radius", term8407);
        setField(term8377, term8377.getClass(), "diameter", term8409);
        setField(term8412, term8412.getClass(), "table", term8413);
        setIntField(term8412, term8412.getClass(), "count", -2134711835);
        setIntField(term8412, term8412.getClass(), "threshold", 15);
        setFloatField(term8412, term8412.getClass(), "loadFactor", 0.75F);
        setField(term8411, term8411.getClass(), "posMap", term8412);
        setField(term8411, term8411.getClass(), "graph", null);
        setField(term8411, term8411.getClass(), "vertices", term8417);
        setIntField(term8411, term8411.getClass(), "numVertices", -1641244494);
        setIntField(term8411, term8411.getClass(), "first", 1124282188);
        setField(term8420, term8420.getClass(), "words", term8421);
        setIntField(term8420, term8420.getClass(), "wordsInUse", -489441521);
        setBooleanField(term8420, term8420.getClass(), "sizeIsSticky", false);
        setField(term8411, term8411.getClass(), "bitset", term8420);
        setField(term8377, term8377.getClass(), "center", term8411);
        setField(term8426, term8426.getClass(), "table", term8427);
        setIntField(term8426, term8426.getClass(), "count", 225873732);
        setIntField(term8426, term8426.getClass(), "threshold", 15);
        setFloatField(term8426, term8426.getClass(), "loadFactor", 0.75F);
        setField(term8425, term8425.getClass(), "posMap", term8426);
        setField(term8425, term8425.getClass(), "graph", null);
        setIntElement(term8431, 0, 529879356);
        setIntElement(term8431, 1, 18072182);
        setIntElement(term8431, 2, 1544768934);
        setIntElement(term8431, 3, -383508597);
        setIntElement(term8431, 4, -819372164);
        setIntElement(term8431, 5, 958132675);
        setIntElement(term8431, 6, -689879283);
        setIntElement(term8431, 7, 1985432430);
        setIntElement(term8431, 8, -1769933499);
        setField(term8425, term8425.getClass(), "vertices", term8431);
        setIntField(term8425, term8425.getClass(), "numVertices", -1510932472);
        setIntField(term8425, term8425.getClass(), "first", 1970654816);
        setField(term8443, term8443.getClass(), "words", term8444);
        setIntField(term8443, term8443.getClass(), "wordsInUse", 1354781442);
        setBooleanField(term8443, term8443.getClass(), "sizeIsSticky", false);
        setField(term8425, term8425.getClass(), "bitset", term8443);
        setField(term8377, term8377.getClass(), "periphery", term8425);
        setField(term8377, term8377.getClass(), "extremaType", enum17);
        setField(term8377, term8377.getClass(), "graph", null);
        setBooleanField(term8377, term8377.getClass(), "directed", true);
        term8462 = new Integer(-393590701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8462;
        callMethod(klass, "computeEcc", argTypes, term8377, args);
    }

};


