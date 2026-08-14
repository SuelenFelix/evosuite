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

public class EdgeArray_removeLast_108969167215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1768;

    public EdgeArray_removeLast_108969167215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1768 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term1769 = (Object[]) newArray("[I", 7);
        int[] term1770 = (int[]) newIntArray(8);
        int[] term1779 = (int[]) newIntArray(2);
        int[] term1782 = (int[]) newIntArray(0);
        int[] term1783 = (int[]) newIntArray(3);
        int[] term1787 = (int[]) newIntArray(0);
        int[] term1788 = (int[]) newIntArray(0);
        int[] term1789 = (int[]) newIntArray(2);
        setField(term1768, term1768.getClass(), "graph", null);
        setIntElement(term1770, 0, 1163761623);
        setIntElement(term1770, 1, 718742281);
        setIntElement(term1770, 2, 1532723756);
        setIntElement(term1770, 3, -124088550);
        setIntElement(term1770, 4, 777492093);
        setIntElement(term1770, 5, 1414025609);
        setIntElement(term1770, 6, 255145822);
        setIntElement(term1770, 7, -573608449);
        setElement(term1769, 0, term1770);
        setIntElement(term1779, 0, -1660057757);
        setIntElement(term1779, 1, 1816273440);
        setElement(term1769, 1, term1779);
        setElement(term1769, 2, term1782);
        setIntElement(term1783, 0, -96541009);
        setIntElement(term1783, 1, -43719302);
        setIntElement(term1783, 2, 1024134939);
        setElement(term1769, 3, term1783);
        setElement(term1769, 4, term1787);
        setElement(term1769, 5, term1788);
        setIntElement(term1789, 0, 109078154);
        setIntElement(term1789, 1, -314165467);
        setElement(term1769, 6, term1789);
        setField(term1768, term1768.getClass(), "edges", term1769);
        setIntField(term1768, term1768.getClass(), "numEdges", 963694071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeLast", argTypes, term1768, args);
    }

};


