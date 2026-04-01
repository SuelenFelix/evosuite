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

public class VertexSeparator_isValid_8484783069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78889;

    public VertexSeparator_isValid_8484783069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78889 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term78890 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78891 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78892 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78896 = (int[]) newIntArray(2);
        Object term78901 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78902 = (long[]) newLongArray(1);
        Object term78906 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78907 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78908 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78912 = (int[]) newIntArray(0);
        Object term78915 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78916 = (long[]) newLongArray(1);
        Object term78920 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78921 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78922 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78926 = (int[]) newIntArray(9);
        Object term78938 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78939 = (long[]) newLongArray(1);
        setField(term78889, term78889.getClass(), "graph", null);
        setField(term78891, term78891.getClass(), "table", term78892);
        setIntField(term78891, term78891.getClass(), "count", 439157981);
        setIntField(term78891, term78891.getClass(), "threshold", 15);
        setFloatField(term78891, term78891.getClass(), "loadFactor", 0.75F);
        setField(term78890, term78890.getClass(), "posMap", term78891);
        setField(term78890, term78890.getClass(), "graph", null);
        setIntElement(term78896, 0, 2026803446);
        setIntElement(term78896, 1, -1060834778);
        setField(term78890, term78890.getClass(), "vertices", term78896);
        setIntField(term78890, term78890.getClass(), "numVertices", 1424979936);
        setIntField(term78890, term78890.getClass(), "first", 1913639183);
        setField(term78901, term78901.getClass(), "words", term78902);
        setIntField(term78901, term78901.getClass(), "wordsInUse", -2065117323);
        setBooleanField(term78901, term78901.getClass(), "sizeIsSticky", false);
        setField(term78890, term78890.getClass(), "bitset", term78901);
        setField(term78889, term78889.getClass(), "separator", term78890);
        setField(term78907, term78907.getClass(), "table", term78908);
        setIntField(term78907, term78907.getClass(), "count", 1455954533);
        setIntField(term78907, term78907.getClass(), "threshold", 15);
        setFloatField(term78907, term78907.getClass(), "loadFactor", 0.75F);
        setField(term78906, term78906.getClass(), "posMap", term78907);
        setField(term78906, term78906.getClass(), "graph", null);
        setField(term78906, term78906.getClass(), "vertices", term78912);
        setIntField(term78906, term78906.getClass(), "numVertices", 596927400);
        setIntField(term78906, term78906.getClass(), "first", 717640575);
        setField(term78915, term78915.getClass(), "words", term78916);
        setIntField(term78915, term78915.getClass(), "wordsInUse", 1377342355);
        setBooleanField(term78915, term78915.getClass(), "sizeIsSticky", false);
        setField(term78906, term78906.getClass(), "bitset", term78915);
        setField(term78889, term78889.getClass(), "leftShore", term78906);
        setField(term78921, term78921.getClass(), "table", term78922);
        setIntField(term78921, term78921.getClass(), "count", 303367492);
        setIntField(term78921, term78921.getClass(), "threshold", 15);
        setFloatField(term78921, term78921.getClass(), "loadFactor", 0.75F);
        setField(term78920, term78920.getClass(), "posMap", term78921);
        setField(term78920, term78920.getClass(), "graph", null);
        setIntElement(term78926, 0, -1689842535);
        setIntElement(term78926, 1, 1550009784);
        setIntElement(term78926, 2, -1322057757);
        setIntElement(term78926, 3, 106608060);
        setIntElement(term78926, 4, -97528141);
        setIntElement(term78926, 5, 103420135);
        setIntElement(term78926, 6, 998281573);
        setIntElement(term78926, 7, 1538565026);
        setIntElement(term78926, 8, 1510446613);
        setField(term78920, term78920.getClass(), "vertices", term78926);
        setIntField(term78920, term78920.getClass(), "numVertices", -591217691);
        setIntField(term78920, term78920.getClass(), "first", -1436479682);
        setField(term78938, term78938.getClass(), "words", term78939);
        setIntField(term78938, term78938.getClass(), "wordsInUse", -87850160);
        setBooleanField(term78938, term78938.getClass(), "sizeIsSticky", true);
        setField(term78920, term78920.getClass(), "bitset", term78938);
        setField(term78889, term78889.getClass(), "rightShore", term78920);
        setIntField(term78889, term78889.getClass(), "maxShoreSize", 2100422614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.VertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term78889, args);
    }

};


