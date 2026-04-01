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

public class DSaturGreedyColoring_nextUncoloredVertex_18023013755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5218;

    public DSaturGreedyColoring_nextUncoloredVertex_18023013755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5218 = newInstance(Class.forName("org.graph4j.coloring.DSaturGreedyColoring"));
        Object term5219 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term5220 = (int[]) newIntArray(2);
        int[] term5223 = (int[]) newIntArray(8);
        int[] term5233 = (int[]) newIntArray(3);
        Object[] term5237 = (Object[]) newArray("java.util.BitSet", 7);
        Object term5238 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5239 = (long[]) newLongArray(1);
        Object term5243 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5244 = (long[]) newLongArray(1);
        Object term5248 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5249 = (long[]) newLongArray(1);
        Object term5253 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5254 = (long[]) newLongArray(1);
        Object term5258 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5259 = (long[]) newLongArray(1);
        Object term5263 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5264 = (long[]) newLongArray(1);
        Object term5268 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5269 = (long[]) newLongArray(1);
        int[] term5273 = (int[]) newIntArray(3);
        Object term5277 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5278 = (long[]) newLongArray(1);
        setField(term5219, term5219.getClass(), "graph", null);
        setField(term5219, term5219.getClass(), "comparator", null);
        setIntElement(term5220, 0, -223786928);
        setIntElement(term5220, 1, 1703103733);
        setField(term5219, term5219.getClass(), "keys", term5220);
        setIntElement(term5223, 0, 1057562436);
        setIntElement(term5223, 1, 646610000);
        setIntElement(term5223, 2, 2003399396);
        setIntElement(term5223, 3, 1223703911);
        setIntElement(term5223, 4, -1824905298);
        setIntElement(term5223, 5, -2062724184);
        setIntElement(term5223, 6, -716654499);
        setIntElement(term5223, 7, 1641117123);
        setField(term5219, term5219.getClass(), "positions", term5223);
        setIntField(term5219, term5219.getClass(), "size", -1084408453);
        setField(term5218, term5218.getClass(), "heap", term5219);
        setIntElement(term5233, 0, -1466822773);
        setIntElement(term5233, 1, -230022261);
        setIntElement(term5233, 2, 831967494);
        setField(term5218, term5218.getClass(), "degree", term5233);
        setField(term5238, term5238.getClass(), "words", term5239);
        setIntField(term5238, term5238.getClass(), "wordsInUse", -1858635791);
        setBooleanField(term5238, term5238.getClass(), "sizeIsSticky", false);
        setElement(term5237, 0, term5238);
        setField(term5243, term5243.getClass(), "words", term5244);
        setIntField(term5243, term5243.getClass(), "wordsInUse", 1919079331);
        setBooleanField(term5243, term5243.getClass(), "sizeIsSticky", false);
        setElement(term5237, 1, term5243);
        setField(term5248, term5248.getClass(), "words", term5249);
        setIntField(term5248, term5248.getClass(), "wordsInUse", 144872711);
        setBooleanField(term5248, term5248.getClass(), "sizeIsSticky", true);
        setElement(term5237, 2, term5248);
        setField(term5253, term5253.getClass(), "words", term5254);
        setIntField(term5253, term5253.getClass(), "wordsInUse", -720037395);
        setBooleanField(term5253, term5253.getClass(), "sizeIsSticky", false);
        setElement(term5237, 3, term5253);
        setField(term5258, term5258.getClass(), "words", term5259);
        setIntField(term5258, term5258.getClass(), "wordsInUse", 1232105469);
        setBooleanField(term5258, term5258.getClass(), "sizeIsSticky", false);
        setElement(term5237, 4, term5258);
        setField(term5263, term5263.getClass(), "words", term5264);
        setIntField(term5263, term5263.getClass(), "wordsInUse", -1547322575);
        setBooleanField(term5263, term5263.getClass(), "sizeIsSticky", false);
        setElement(term5237, 5, term5263);
        setField(term5268, term5268.getClass(), "words", term5269);
        setIntField(term5268, term5268.getClass(), "wordsInUse", -61444233);
        setBooleanField(term5268, term5268.getClass(), "sizeIsSticky", false);
        setElement(term5237, 6, term5268);
        setField(term5218, term5218.getClass(), "dsatur", term5237);
        setIntElement(term5273, 0, -400720912);
        setIntElement(term5273, 1, 1266192397);
        setIntElement(term5273, 2, 218346781);
        setField(term5218, term5218.getClass(), "colors", term5273);
        setField(term5277, term5277.getClass(), "words", term5278);
        setIntField(term5277, term5277.getClass(), "wordsInUse", -984660976);
        setBooleanField(term5277, term5277.getClass(), "sizeIsSticky", true);
        setField(term5218, term5218.getClass(), "used", term5277);
        setIntField(term5218, term5218.getClass(), "numColors", -1419341969);
        setIntField(term5218, term5218.getClass(), "maxColor", -89522625);
        setField(term5218, term5218.getClass(), "recolor", null);
        setField(term5218, term5218.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.DSaturGreedyColoring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextUncoloredVertex", argTypes, term5218, args);
    }

};


