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

public class VertexSeparator_rightShore_8486261686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3292;

    public VertexSeparator_rightShore_8486261686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3292 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term3293 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3294 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3295 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3299 = (int[]) newIntArray(4);
        Object term3306 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3307 = (long[]) newLongArray(1);
        Object term3311 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3312 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3313 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3317 = (int[]) newIntArray(1);
        Object term3321 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3322 = (long[]) newLongArray(1);
        Object term3326 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3327 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3328 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3332 = (int[]) newIntArray(6);
        Object term3341 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3342 = (long[]) newLongArray(1);
        setField(term3292, term3292.getClass(), "graph", null);
        setField(term3294, term3294.getClass(), "table", term3295);
        setIntField(term3294, term3294.getClass(), "count", 1223703911);
        setIntField(term3294, term3294.getClass(), "threshold", 15);
        setFloatField(term3294, term3294.getClass(), "loadFactor", 0.75F);
        setField(term3293, term3293.getClass(), "posMap", term3294);
        setField(term3293, term3293.getClass(), "graph", null);
        setIntElement(term3299, 0, -1824905298);
        setIntElement(term3299, 1, -2062724184);
        setIntElement(term3299, 2, -716654499);
        setIntElement(term3299, 3, 1641117123);
        setField(term3293, term3293.getClass(), "vertices", term3299);
        setIntField(term3293, term3293.getClass(), "numVertices", -1084408453);
        setIntField(term3293, term3293.getClass(), "first", -1466822773);
        setField(term3306, term3306.getClass(), "words", term3307);
        setIntField(term3306, term3306.getClass(), "wordsInUse", -230022261);
        setBooleanField(term3306, term3306.getClass(), "sizeIsSticky", false);
        setField(term3293, term3293.getClass(), "bitset", term3306);
        setField(term3292, term3292.getClass(), "separator", term3293);
        setField(term3312, term3312.getClass(), "table", term3313);
        setIntField(term3312, term3312.getClass(), "count", 831967494);
        setIntField(term3312, term3312.getClass(), "threshold", 15);
        setFloatField(term3312, term3312.getClass(), "loadFactor", 0.75F);
        setField(term3311, term3311.getClass(), "posMap", term3312);
        setField(term3311, term3311.getClass(), "graph", null);
        setIntElement(term3317, 0, -1858635791);
        setField(term3311, term3311.getClass(), "vertices", term3317);
        setIntField(term3311, term3311.getClass(), "numVertices", 1919079331);
        setIntField(term3311, term3311.getClass(), "first", 144872711);
        setField(term3321, term3321.getClass(), "words", term3322);
        setIntField(term3321, term3321.getClass(), "wordsInUse", -720037395);
        setBooleanField(term3321, term3321.getClass(), "sizeIsSticky", false);
        setField(term3311, term3311.getClass(), "bitset", term3321);
        setField(term3292, term3292.getClass(), "leftShore", term3311);
        setField(term3327, term3327.getClass(), "table", term3328);
        setIntField(term3327, term3327.getClass(), "count", 1232105469);
        setIntField(term3327, term3327.getClass(), "threshold", 15);
        setFloatField(term3327, term3327.getClass(), "loadFactor", 0.75F);
        setField(term3326, term3326.getClass(), "posMap", term3327);
        setField(term3326, term3326.getClass(), "graph", null);
        setIntElement(term3332, 0, -1547322575);
        setIntElement(term3332, 1, -61444233);
        setIntElement(term3332, 2, -400720912);
        setIntElement(term3332, 3, 1266192397);
        setIntElement(term3332, 4, 218346781);
        setIntElement(term3332, 5, -984660976);
        setField(term3326, term3326.getClass(), "vertices", term3332);
        setIntField(term3326, term3326.getClass(), "numVertices", -1419341969);
        setIntField(term3326, term3326.getClass(), "first", -89522625);
        setField(term3341, term3341.getClass(), "words", term3342);
        setIntField(term3341, term3341.getClass(), "wordsInUse", 1475906894);
        setBooleanField(term3341, term3341.getClass(), "sizeIsSticky", false);
        setField(term3326, term3326.getClass(), "bitset", term3341);
        setField(term3292, term3292.getClass(), "rightShore", term3326);
        setIntField(term3292, term3292.getClass(), "maxShoreSize", -2004794532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.VertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "rightShore", argTypes, term3292, args);
    }

};


