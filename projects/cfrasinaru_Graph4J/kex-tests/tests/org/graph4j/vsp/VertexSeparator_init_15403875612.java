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

public class VertexSeparator_init_15403875612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2978;

    public VertexSeparator_init_15403875612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2978 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term2979 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term2980 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2981 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2985 = (int[]) newIntArray(8);
        Object term2996 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2997 = (long[]) newLongArray(1);
        Object term3001 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3002 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3003 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3007 = (int[]) newIntArray(7);
        Object term3017 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3018 = (long[]) newLongArray(1);
        Object term3022 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3023 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3024 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3028 = (int[]) newIntArray(3);
        Object term3034 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3035 = (long[]) newLongArray(1);
        setField(term2978, term2978.getClass(), "graph", null);
        setField(term2980, term2980.getClass(), "table", term2981);
        setIntField(term2980, term2980.getClass(), "count", 1795358995);
        setIntField(term2980, term2980.getClass(), "threshold", 15);
        setFloatField(term2980, term2980.getClass(), "loadFactor", 0.75F);
        setField(term2979, term2979.getClass(), "posMap", term2980);
        setField(term2979, term2979.getClass(), "graph", null);
        setIntElement(term2985, 0, -781185864);
        setIntElement(term2985, 1, 340500914);
        setIntElement(term2985, 2, -2061712635);
        setIntElement(term2985, 3, 1182911731);
        setIntElement(term2985, 4, 644726932);
        setIntElement(term2985, 5, -1515977761);
        setIntElement(term2985, 6, -1476037190);
        setIntElement(term2985, 7, -718204437);
        setField(term2979, term2979.getClass(), "vertices", term2985);
        setIntField(term2979, term2979.getClass(), "numVertices", 468974358);
        setIntField(term2979, term2979.getClass(), "first", 346282818);
        setField(term2996, term2996.getClass(), "words", term2997);
        setIntField(term2996, term2996.getClass(), "wordsInUse", -857876056);
        setBooleanField(term2996, term2996.getClass(), "sizeIsSticky", true);
        setField(term2979, term2979.getClass(), "bitset", term2996);
        setField(term2978, term2978.getClass(), "separator", term2979);
        setField(term3002, term3002.getClass(), "table", term3003);
        setIntField(term3002, term3002.getClass(), "count", 1392910876);
        setIntField(term3002, term3002.getClass(), "threshold", 15);
        setFloatField(term3002, term3002.getClass(), "loadFactor", 0.75F);
        setField(term3001, term3001.getClass(), "posMap", term3002);
        setField(term3001, term3001.getClass(), "graph", null);
        setIntElement(term3007, 0, 1086383182);
        setIntElement(term3007, 1, 1425319286);
        setIntElement(term3007, 2, 1729919228);
        setIntElement(term3007, 3, 872351195);
        setIntElement(term3007, 4, -1664328399);
        setIntElement(term3007, 5, 1422430512);
        setIntElement(term3007, 6, 1796581482);
        setField(term3001, term3001.getClass(), "vertices", term3007);
        setIntField(term3001, term3001.getClass(), "numVertices", 1286440081);
        setIntField(term3001, term3001.getClass(), "first", -928538452);
        setField(term3017, term3017.getClass(), "words", term3018);
        setIntField(term3017, term3017.getClass(), "wordsInUse", -1313207353);
        setBooleanField(term3017, term3017.getClass(), "sizeIsSticky", true);
        setField(term3001, term3001.getClass(), "bitset", term3017);
        setField(term2978, term2978.getClass(), "leftShore", term3001);
        setField(term3023, term3023.getClass(), "table", term3024);
        setIntField(term3023, term3023.getClass(), "count", 402612318);
        setIntField(term3023, term3023.getClass(), "threshold", 15);
        setFloatField(term3023, term3023.getClass(), "loadFactor", 0.75F);
        setField(term3022, term3022.getClass(), "posMap", term3023);
        setField(term3022, term3022.getClass(), "graph", null);
        setIntElement(term3028, 0, -1628481565);
        setIntElement(term3028, 1, -217226756);
        setIntElement(term3028, 2, 1608000247);
        setField(term3022, term3022.getClass(), "vertices", term3028);
        setIntField(term3022, term3022.getClass(), "numVertices", 1354560887);
        setIntField(term3022, term3022.getClass(), "first", -749474542);
        setField(term3034, term3034.getClass(), "words", term3035);
        setIntField(term3034, term3034.getClass(), "wordsInUse", -47907780);
        setBooleanField(term3034, term3034.getClass(), "sizeIsSticky", true);
        setField(term3022, term3022.getClass(), "bitset", term3034);
        setField(term2978, term2978.getClass(), "rightShore", term3022);
        setIntField(term2978, term2978.getClass(), "maxShoreSize", 1131462369);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.VertexSeparator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.vsp.VertexSeparator");
        Object[] args = new Object[1];
        args[0] = term2978;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


