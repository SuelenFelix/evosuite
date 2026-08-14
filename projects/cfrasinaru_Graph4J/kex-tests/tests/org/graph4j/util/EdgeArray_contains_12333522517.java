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
import java.lang.Integer;

public class EdgeArray_contains_12333522517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1918;
     Object term1938;
     Object term1940;

    public EdgeArray_contains_12333522517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1918 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term1919 = (Object[]) newArray("[I", 3);
        int[] term1920 = (int[]) newIntArray(6);
        int[] term1927 = (int[]) newIntArray(1);
        int[] term1929 = (int[]) newIntArray(7);
        setField(term1918, term1918.getClass(), "graph", null);
        setIntElement(term1920, 0, 1499735894);
        setIntElement(term1920, 1, 716486048);
        setIntElement(term1920, 2, -466708718);
        setIntElement(term1920, 3, 1038029515);
        setIntElement(term1920, 4, 1137154606);
        setIntElement(term1920, 5, -100681578);
        setElement(term1919, 0, term1920);
        setIntElement(term1927, 0, 296568835);
        setElement(term1919, 1, term1927);
        setIntElement(term1929, 0, 1431951992);
        setIntElement(term1929, 1, -1608123016);
        setIntElement(term1929, 2, -896473214);
        setIntElement(term1929, 3, 401203924);
        setIntElement(term1929, 4, -1212399479);
        setIntElement(term1929, 5, 2107679041);
        setIntElement(term1929, 6, 2040965507);
        setElement(term1919, 2, term1929);
        setField(term1918, term1918.getClass(), "edges", term1919);
        setIntField(term1918, term1918.getClass(), "numEdges", -1281083262);
        term1938 = new Integer(1059930704);
        term1940 = new Integer(-1967153290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1938;
        args[1] = term1940;
        callMethod(klass, "contains", argTypes, term1918, args);
    }

};


