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

public class VertexSeparator_separator_18572164524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78514;

    public VertexSeparator_separator_18572164524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78514 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term78515 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78516 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78517 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78521 = (int[]) newIntArray(7);
        Object term78531 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78532 = (long[]) newLongArray(1);
        Object term78536 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78537 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78538 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78542 = (int[]) newIntArray(7);
        Object term78552 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78553 = (long[]) newLongArray(1);
        Object term78557 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78558 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78559 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78563 = (int[]) newIntArray(6);
        Object term78572 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78573 = (long[]) newLongArray(1);
        setField(term78514, term78514.getClass(), "graph", null);
        setField(term78516, term78516.getClass(), "table", term78517);
        setIntField(term78516, term78516.getClass(), "count", 146408738);
        setIntField(term78516, term78516.getClass(), "threshold", 15);
        setFloatField(term78516, term78516.getClass(), "loadFactor", 0.75F);
        setField(term78515, term78515.getClass(), "posMap", term78516);
        setField(term78515, term78515.getClass(), "graph", null);
        setIntElement(term78521, 0, -496409376);
        setIntElement(term78521, 1, 1373203092);
        setIntElement(term78521, 2, -120921180);
        setIntElement(term78521, 3, -1303194402);
        setIntElement(term78521, 4, -1332211856);
        setIntElement(term78521, 5, 213669888);
        setIntElement(term78521, 6, -1050684350);
        setField(term78515, term78515.getClass(), "vertices", term78521);
        setIntField(term78515, term78515.getClass(), "numVertices", 1871723856);
        setIntField(term78515, term78515.getClass(), "first", -159300758);
        setField(term78531, term78531.getClass(), "words", term78532);
        setIntField(term78531, term78531.getClass(), "wordsInUse", 478919523);
        setBooleanField(term78531, term78531.getClass(), "sizeIsSticky", true);
        setField(term78515, term78515.getClass(), "bitset", term78531);
        setField(term78514, term78514.getClass(), "separator", term78515);
        setField(term78537, term78537.getClass(), "table", term78538);
        setIntField(term78537, term78537.getClass(), "count", -922902226);
        setIntField(term78537, term78537.getClass(), "threshold", 15);
        setFloatField(term78537, term78537.getClass(), "loadFactor", 0.75F);
        setField(term78536, term78536.getClass(), "posMap", term78537);
        setField(term78536, term78536.getClass(), "graph", null);
        setIntElement(term78542, 0, -2136789857);
        setIntElement(term78542, 1, 2107900783);
        setIntElement(term78542, 2, 2014990351);
        setIntElement(term78542, 3, 1711544909);
        setIntElement(term78542, 4, -257220805);
        setIntElement(term78542, 5, -32183821);
        setIntElement(term78542, 6, 391771406);
        setField(term78536, term78536.getClass(), "vertices", term78542);
        setIntField(term78536, term78536.getClass(), "numVertices", 930395359);
        setIntField(term78536, term78536.getClass(), "first", 510293262);
        setField(term78552, term78552.getClass(), "words", term78553);
        setIntField(term78552, term78552.getClass(), "wordsInUse", -71096217);
        setBooleanField(term78552, term78552.getClass(), "sizeIsSticky", true);
        setField(term78536, term78536.getClass(), "bitset", term78552);
        setField(term78514, term78514.getClass(), "leftShore", term78536);
        setField(term78558, term78558.getClass(), "table", term78559);
        setIntField(term78558, term78558.getClass(), "count", -1809406090);
        setIntField(term78558, term78558.getClass(), "threshold", 15);
        setFloatField(term78558, term78558.getClass(), "loadFactor", 0.75F);
        setField(term78557, term78557.getClass(), "posMap", term78558);
        setField(term78557, term78557.getClass(), "graph", null);
        setIntElement(term78563, 0, -1783195316);
        setIntElement(term78563, 1, -1932630543);
        setIntElement(term78563, 2, -1460939623);
        setIntElement(term78563, 3, 1024871937);
        setIntElement(term78563, 4, 1248282915);
        setIntElement(term78563, 5, 530401633);
        setField(term78557, term78557.getClass(), "vertices", term78563);
        setIntField(term78557, term78557.getClass(), "numVertices", -2102777765);
        setIntField(term78557, term78557.getClass(), "first", 994126300);
        setField(term78572, term78572.getClass(), "words", term78573);
        setIntField(term78572, term78572.getClass(), "wordsInUse", -1753144993);
        setBooleanField(term78572, term78572.getClass(), "sizeIsSticky", false);
        setField(term78557, term78557.getClass(), "bitset", term78572);
        setField(term78514, term78514.getClass(), "rightShore", term78557);
        setIntField(term78514, term78514.getClass(), "maxShoreSize", -829086350);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.VertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "separator", argTypes, term78514, args);
    }

};


