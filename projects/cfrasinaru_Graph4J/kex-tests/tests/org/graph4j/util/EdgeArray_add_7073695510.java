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

public class EdgeArray_add_7073695510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1429;
     Object term1449;
     Object term1451;

    public EdgeArray_add_7073695510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1429 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term1430 = (Object[]) newArray("[I", 3);
        int[] term1431 = (int[]) newIntArray(7);
        int[] term1439 = (int[]) newIntArray(1);
        int[] term1441 = (int[]) newIntArray(6);
        setField(term1429, term1429.getClass(), "graph", null);
        setIntElement(term1431, 0, -975748721);
        setIntElement(term1431, 1, 433248783);
        setIntElement(term1431, 2, -507944154);
        setIntElement(term1431, 3, -1736183862);
        setIntElement(term1431, 4, 897010381);
        setIntElement(term1431, 5, -15712667);
        setIntElement(term1431, 6, 1964967720);
        setElement(term1430, 0, term1431);
        setIntElement(term1439, 0, 1351900243);
        setElement(term1430, 1, term1439);
        setIntElement(term1441, 0, -330897705);
        setIntElement(term1441, 1, 1065595802);
        setIntElement(term1441, 2, 21031843);
        setIntElement(term1441, 3, -380787857);
        setIntElement(term1441, 4, 319853052);
        setIntElement(term1441, 5, -1097563716);
        setElement(term1430, 2, term1441);
        setField(term1429, term1429.getClass(), "edges", term1430);
        setIntField(term1429, term1429.getClass(), "numEdges", 1572907769);
        term1449 = new Integer(1608016787);
        term1451 = new Integer(-516303035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1449;
        args[1] = term1451;
        callMethod(klass, "add", argTypes, term1429, args);
    }

};


