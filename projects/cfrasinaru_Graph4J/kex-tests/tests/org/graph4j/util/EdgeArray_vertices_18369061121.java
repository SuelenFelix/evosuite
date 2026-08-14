package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class EdgeArray_vertices_18369061121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2088;

    public EdgeArray_vertices_18369061121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2088 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term2089 = (Object[]) newArray("[I", 5);
        int[] term2090 = (int[]) newIntArray(4);
        int[] term2095 = (int[]) newIntArray(1);
        int[] term2097 = (int[]) newIntArray(5);
        int[] term2103 = (int[]) newIntArray(3);
        int[] term2107 = (int[]) newIntArray(4);
        setField(term2088, term2088.getClass(), "graph", null);
        setIntElement(term2090, 0, 2109912812);
        setIntElement(term2090, 1, 1841286431);
        setIntElement(term2090, 2, -1723168189);
        setIntElement(term2090, 3, -675283917);
        setElement(term2089, 0, term2090);
        setIntElement(term2095, 0, -2093862988);
        setElement(term2089, 1, term2095);
        setIntElement(term2097, 0, 1337828646);
        setIntElement(term2097, 1, 532666604);
        setIntElement(term2097, 2, -13725716);
        setIntElement(term2097, 3, -1695750603);
        setIntElement(term2097, 4, 63677360);
        setElement(term2089, 2, term2097);
        setIntElement(term2103, 0, 1478914037);
        setIntElement(term2103, 1, 1630231519);
        setIntElement(term2103, 2, 1460702778);
        setElement(term2089, 3, term2103);
        setIntElement(term2107, 0, -1398142433);
        setIntElement(term2107, 1, -1112119058);
        setIntElement(term2107, 2, 2073858334);
        setIntElement(term2107, 3, -1693535639);
        setElement(term2089, 4, term2107);
        setField(term2088, term2088.getClass(), "edges", term2089);
        setIntField(term2088, term2088.getClass(), "numEdges", 1344744036);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "vertices", argTypes, term2088, args);
    }

};


