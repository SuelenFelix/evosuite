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

public class DSaturGreedyColoring_init_20277117012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4922;

    public DSaturGreedyColoring_init_20277117012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4922 = newInstance(Class.forName("org.graph4j.coloring.DSaturGreedyColoring"));
        Object term4923 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term4924 = (int[]) newIntArray(1);
        int[] term4926 = (int[]) newIntArray(4);
        int[] term4932 = (int[]) newIntArray(9);
        Object[] term4942 = (Object[]) newArray("java.util.BitSet", 8);
        Object term4943 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4944 = (long[]) newLongArray(1);
        Object term4948 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4949 = (long[]) newLongArray(1);
        Object term4953 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4954 = (long[]) newLongArray(1);
        Object term4958 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4959 = (long[]) newLongArray(1);
        Object term4963 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4964 = (long[]) newLongArray(1);
        Object term4968 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4969 = (long[]) newLongArray(1);
        Object term4973 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4974 = (long[]) newLongArray(1);
        Object term4978 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4979 = (long[]) newLongArray(1);
        int[] term4983 = (int[]) newIntArray(7);
        Object term4991 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4992 = (long[]) newLongArray(1);
        setField(term4923, term4923.getClass(), "graph", null);
        setField(term4923, term4923.getClass(), "comparator", null);
        setIntElement(term4924, 0, 872351195);
        setField(term4923, term4923.getClass(), "keys", term4924);
        setIntElement(term4926, 0, -1664328399);
        setIntElement(term4926, 1, 1422430512);
        setIntElement(term4926, 2, 1796581482);
        setIntElement(term4926, 3, 1286440081);
        setField(term4923, term4923.getClass(), "positions", term4926);
        setIntField(term4923, term4923.getClass(), "size", -928538452);
        setField(term4922, term4922.getClass(), "heap", term4923);
        setIntElement(term4932, 0, -1313207353);
        setIntElement(term4932, 1, 402612318);
        setIntElement(term4932, 2, -1628481565);
        setIntElement(term4932, 3, -217226756);
        setIntElement(term4932, 4, 1608000247);
        setIntElement(term4932, 5, 1354560887);
        setIntElement(term4932, 6, -749474542);
        setIntElement(term4932, 7, -47907780);
        setIntElement(term4932, 8, 1131462369);
        setField(term4922, term4922.getClass(), "degree", term4932);
        setField(term4943, term4943.getClass(), "words", term4944);
        setIntField(term4943, term4943.getClass(), "wordsInUse", -1161206731);
        setBooleanField(term4943, term4943.getClass(), "sizeIsSticky", false);
        setElement(term4942, 0, term4943);
        setField(term4948, term4948.getClass(), "words", term4949);
        setIntField(term4948, term4948.getClass(), "wordsInUse", -992847709);
        setBooleanField(term4948, term4948.getClass(), "sizeIsSticky", true);
        setElement(term4942, 1, term4948);
        setField(term4953, term4953.getClass(), "words", term4954);
        setIntField(term4953, term4953.getClass(), "wordsInUse", 1125156671);
        setBooleanField(term4953, term4953.getClass(), "sizeIsSticky", false);
        setElement(term4942, 2, term4953);
        setField(term4958, term4958.getClass(), "words", term4959);
        setIntField(term4958, term4958.getClass(), "wordsInUse", 1203107925);
        setBooleanField(term4958, term4958.getClass(), "sizeIsSticky", false);
        setElement(term4942, 3, term4958);
        setField(term4963, term4963.getClass(), "words", term4964);
        setIntField(term4963, term4963.getClass(), "wordsInUse", 1825448944);
        setBooleanField(term4963, term4963.getClass(), "sizeIsSticky", true);
        setElement(term4942, 4, term4963);
        setField(term4968, term4968.getClass(), "words", term4969);
        setIntField(term4968, term4968.getClass(), "wordsInUse", 1769496642);
        setBooleanField(term4968, term4968.getClass(), "sizeIsSticky", true);
        setElement(term4942, 5, term4968);
        setField(term4973, term4973.getClass(), "words", term4974);
        setIntField(term4973, term4973.getClass(), "wordsInUse", -947460705);
        setBooleanField(term4973, term4973.getClass(), "sizeIsSticky", true);
        setElement(term4942, 6, term4973);
        setField(term4978, term4978.getClass(), "words", term4979);
        setIntField(term4978, term4978.getClass(), "wordsInUse", -1435758764);
        setBooleanField(term4978, term4978.getClass(), "sizeIsSticky", false);
        setElement(term4942, 7, term4978);
        setField(term4922, term4922.getClass(), "dsatur", term4942);
        setIntElement(term4983, 0, 752858379);
        setIntElement(term4983, 1, -370819357);
        setIntElement(term4983, 2, -71819242);
        setIntElement(term4983, 3, 1268893136);
        setIntElement(term4983, 4, -1472700822);
        setIntElement(term4983, 5, 1626670889);
        setIntElement(term4983, 6, -2117361140);
        setField(term4922, term4922.getClass(), "colors", term4983);
        setField(term4991, term4991.getClass(), "words", term4992);
        setIntField(term4991, term4991.getClass(), "wordsInUse", 407708341);
        setBooleanField(term4991, term4991.getClass(), "sizeIsSticky", true);
        setField(term4922, term4922.getClass(), "used", term4991);
        setIntField(term4922, term4922.getClass(), "numColors", -287519200);
        setIntField(term4922, term4922.getClass(), "maxColor", -1490696181);
        setField(term4922, term4922.getClass(), "recolor", null);
        setField(term4922, term4922.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.DSaturGreedyColoring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term4922, args);
    }

};


