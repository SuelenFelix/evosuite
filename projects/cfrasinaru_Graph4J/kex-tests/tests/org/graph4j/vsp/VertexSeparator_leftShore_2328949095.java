package org.graph4j.vsp;

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
import static org.graph4j.vsp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class VertexSeparator_leftShore_2328949095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3227;

    public VertexSeparator_leftShore_2328949095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3227 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term3228 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3229 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3230 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3234 = (int[]) newIntArray(3);
        Object term3240 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3241 = (long[]) newLongArray(1);
        Object term3245 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3246 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3247 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3251 = (int[]) newIntArray(4);
        Object term3258 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3259 = (long[]) newLongArray(1);
        Object term3263 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3264 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3265 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3269 = (int[]) newIntArray(2);
        Object term3274 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3275 = (long[]) newLongArray(1);
        setField(term3227, term3227.getClass(), "graph", null);
        setField(term3229, term3229.getClass(), "table", term3230);
        setIntField(term3229, term3229.getClass(), "count", -366198044);
        setIntField(term3229, term3229.getClass(), "threshold", 15);
        setFloatField(term3229, term3229.getClass(), "loadFactor", 0.75F);
        setField(term3228, term3228.getClass(), "posMap", term3229);
        setField(term3228, term3228.getClass(), "graph", null);
        setIntElement(term3234, 0, -1350380769);
        setIntElement(term3234, 1, -1432215030);
        setIntElement(term3234, 2, 1233186320);
        setField(term3228, term3228.getClass(), "vertices", term3234);
        setIntField(term3228, term3228.getClass(), "numVertices", -1303269101);
        setIntField(term3228, term3228.getClass(), "first", 1435572720);
        setField(term3240, term3240.getClass(), "words", term3241);
        setIntField(term3240, term3240.getClass(), "wordsInUse", 1437618365);
        setBooleanField(term3240, term3240.getClass(), "sizeIsSticky", false);
        setField(term3228, term3228.getClass(), "bitset", term3240);
        setField(term3227, term3227.getClass(), "separator", term3228);
        setField(term3246, term3246.getClass(), "table", term3247);
        setIntField(term3246, term3246.getClass(), "count", 1122535239);
        setIntField(term3246, term3246.getClass(), "threshold", 15);
        setFloatField(term3246, term3246.getClass(), "loadFactor", 0.75F);
        setField(term3245, term3245.getClass(), "posMap", term3246);
        setField(term3245, term3245.getClass(), "graph", null);
        setIntElement(term3251, 0, 1158923260);
        setIntElement(term3251, 1, 1633508772);
        setIntElement(term3251, 2, -545275970);
        setIntElement(term3251, 3, 1355471365);
        setField(term3245, term3245.getClass(), "vertices", term3251);
        setIntField(term3245, term3245.getClass(), "numVertices", -1746962742);
        setIntField(term3245, term3245.getClass(), "first", -575810668);
        setField(term3258, term3258.getClass(), "words", term3259);
        setIntField(term3258, term3258.getClass(), "wordsInUse", 256028547);
        setBooleanField(term3258, term3258.getClass(), "sizeIsSticky", true);
        setField(term3245, term3245.getClass(), "bitset", term3258);
        setField(term3227, term3227.getClass(), "leftShore", term3245);
        setField(term3264, term3264.getClass(), "table", term3265);
        setIntField(term3264, term3264.getClass(), "count", -750603024);
        setIntField(term3264, term3264.getClass(), "threshold", 15);
        setFloatField(term3264, term3264.getClass(), "loadFactor", 0.75F);
        setField(term3263, term3263.getClass(), "posMap", term3264);
        setField(term3263, term3263.getClass(), "graph", null);
        setIntElement(term3269, 0, 1255234202);
        setIntElement(term3269, 1, -223786928);
        setField(term3263, term3263.getClass(), "vertices", term3269);
        setIntField(term3263, term3263.getClass(), "numVertices", 1703103733);
        setIntField(term3263, term3263.getClass(), "first", 1057562436);
        setField(term3274, term3274.getClass(), "words", term3275);
        setIntField(term3274, term3274.getClass(), "wordsInUse", 646610000);
        setBooleanField(term3274, term3274.getClass(), "sizeIsSticky", true);
        setField(term3263, term3263.getClass(), "bitset", term3274);
        setField(term3227, term3227.getClass(), "rightShore", term3263);
        setIntField(term3227, term3227.getClass(), "maxShoreSize", 2003399396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.VertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "leftShore", argTypes, term3227, args);
    }

};


