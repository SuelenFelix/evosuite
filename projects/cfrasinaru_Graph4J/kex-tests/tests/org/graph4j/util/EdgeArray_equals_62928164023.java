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

public class EdgeArray_equals_62928164023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2146;
     Object term2182;

    public EdgeArray_equals_62928164023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2146 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term2147 = (Object[]) newArray("[I", 5);
        int[] term2148 = (int[]) newIntArray(3);
        int[] term2152 = (int[]) newIntArray(9);
        int[] term2162 = (int[]) newIntArray(2);
        int[] term2165 = (int[]) newIntArray(5);
        int[] term2171 = (int[]) newIntArray(9);
        setField(term2146, term2146.getClass(), "graph", null);
        setIntElement(term2148, 0, 1857693976);
        setIntElement(term2148, 1, 1631305277);
        setIntElement(term2148, 2, 162113491);
        setElement(term2147, 0, term2148);
        setIntElement(term2152, 0, -932147928);
        setIntElement(term2152, 1, 487369012);
        setIntElement(term2152, 2, -179238712);
        setIntElement(term2152, 3, -2018735535);
        setIntElement(term2152, 4, -658524954);
        setIntElement(term2152, 5, -2009613557);
        setIntElement(term2152, 6, 654195547);
        setIntElement(term2152, 7, 1622857008);
        setIntElement(term2152, 8, 934338954);
        setElement(term2147, 1, term2152);
        setIntElement(term2162, 0, 598635505);
        setIntElement(term2162, 1, -944986533);
        setElement(term2147, 2, term2162);
        setIntElement(term2165, 0, 1894454926);
        setIntElement(term2165, 1, 1415142780);
        setIntElement(term2165, 2, -574105759);
        setIntElement(term2165, 3, -1165271567);
        setIntElement(term2165, 4, 376834234);
        setElement(term2147, 3, term2165);
        setIntElement(term2171, 0, -1911972560);
        setIntElement(term2171, 1, -642716895);
        setIntElement(term2171, 2, 1743398246);
        setIntElement(term2171, 3, -934658823);
        setIntElement(term2171, 4, 1632177303);
        setIntElement(term2171, 5, -802592348);
        setIntElement(term2171, 6, -1576584269);
        setIntElement(term2171, 7, 1474899591);
        setIntElement(term2171, 8, 297582552);
        setElement(term2147, 4, term2171);
        setField(term2146, term2146.getClass(), "edges", term2147);
        setIntField(term2146, term2146.getClass(), "numEdges", -1485916498);
        term2182 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2182;
        callMethod(klass, "equals", argTypes, term2146, args);
    }

};


