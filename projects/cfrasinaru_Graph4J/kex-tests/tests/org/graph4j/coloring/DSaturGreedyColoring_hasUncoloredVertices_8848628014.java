package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DSaturGreedyColoring_hasUncoloredVertices_8848628014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5126;

    public DSaturGreedyColoring_hasUncoloredVertices_8848628014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5126 = newInstance(Class.forName("org.graph4j.coloring.DSaturGreedyColoring"));
        Object term5127 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term5128 = (int[]) newIntArray(9);
        int[] term5138 = (int[]) newIntArray(0);
        int[] term5140 = (int[]) newIntArray(7);
        Object[] term5148 = (Object[]) newArray("java.util.BitSet", 6);
        Object term5149 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5150 = (long[]) newLongArray(1);
        Object term5154 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5155 = (long[]) newLongArray(1);
        Object term5159 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5160 = (long[]) newLongArray(1);
        Object term5164 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5165 = (long[]) newLongArray(1);
        Object term5169 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5170 = (long[]) newLongArray(1);
        Object term5174 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5175 = (long[]) newLongArray(1);
        int[] term5179 = (int[]) newIntArray(4);
        Object term5184 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5185 = (long[]) newLongArray(1);
        setField(term5127, term5127.getClass(), "graph", null);
        setField(term5127, term5127.getClass(), "comparator", null);
        setIntElement(term5128, 0, 383244929);
        setIntElement(term5128, 1, -2114034003);
        setIntElement(term5128, 2, 207213904);
        setIntElement(term5128, 3, -484303394);
        setIntElement(term5128, 4, -31125530);
        setIntElement(term5128, 5, 1909773180);
        setIntElement(term5128, 6, -970417907);
        setIntElement(term5128, 7, 1097894139);
        setIntElement(term5128, 8, 390256347);
        setField(term5127, term5127.getClass(), "keys", term5128);
        setField(term5127, term5127.getClass(), "positions", term5138);
        setIntField(term5127, term5127.getClass(), "size", 1471619998);
        setField(term5126, term5126.getClass(), "heap", term5127);
        setIntElement(term5140, 0, -1623489521);
        setIntElement(term5140, 1, 1179937517);
        setIntElement(term5140, 2, 200150950);
        setIntElement(term5140, 3, -366198044);
        setIntElement(term5140, 4, -1350380769);
        setIntElement(term5140, 5, -1432215030);
        setIntElement(term5140, 6, 1233186320);
        setField(term5126, term5126.getClass(), "degree", term5140);
        setField(term5149, term5149.getClass(), "words", term5150);
        setIntField(term5149, term5149.getClass(), "wordsInUse", -1303269101);
        setBooleanField(term5149, term5149.getClass(), "sizeIsSticky", true);
        setElement(term5148, 0, term5149);
        setField(term5154, term5154.getClass(), "words", term5155);
        setIntField(term5154, term5154.getClass(), "wordsInUse", 1435572720);
        setBooleanField(term5154, term5154.getClass(), "sizeIsSticky", true);
        setElement(term5148, 1, term5154);
        setField(term5159, term5159.getClass(), "words", term5160);
        setIntField(term5159, term5159.getClass(), "wordsInUse", 1437618365);
        setBooleanField(term5159, term5159.getClass(), "sizeIsSticky", false);
        setElement(term5148, 2, term5159);
        setField(term5164, term5164.getClass(), "words", term5165);
        setIntField(term5164, term5164.getClass(), "wordsInUse", 1122535239);
        setBooleanField(term5164, term5164.getClass(), "sizeIsSticky", true);
        setElement(term5148, 3, term5164);
        setField(term5169, term5169.getClass(), "words", term5170);
        setIntField(term5169, term5169.getClass(), "wordsInUse", 1158923260);
        setBooleanField(term5169, term5169.getClass(), "sizeIsSticky", true);
        setElement(term5148, 4, term5169);
        setField(term5174, term5174.getClass(), "words", term5175);
        setIntField(term5174, term5174.getClass(), "wordsInUse", 1633508772);
        setBooleanField(term5174, term5174.getClass(), "sizeIsSticky", false);
        setElement(term5148, 5, term5174);
        setField(term5126, term5126.getClass(), "dsatur", term5148);
        setIntElement(term5179, 0, -545275970);
        setIntElement(term5179, 1, 1355471365);
        setIntElement(term5179, 2, -1746962742);
        setIntElement(term5179, 3, -575810668);
        setField(term5126, term5126.getClass(), "colors", term5179);
        setField(term5184, term5184.getClass(), "words", term5185);
        setIntField(term5184, term5184.getClass(), "wordsInUse", 256028547);
        setBooleanField(term5184, term5184.getClass(), "sizeIsSticky", false);
        setField(term5126, term5126.getClass(), "used", term5184);
        setIntField(term5126, term5126.getClass(), "numColors", -750603024);
        setIntField(term5126, term5126.getClass(), "maxColor", 1255234202);
        setField(term5126, term5126.getClass(), "recolor", null);
        setField(term5126, term5126.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.DSaturGreedyColoring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasUncoloredVertices", argTypes, term5126, args);
    }

};


