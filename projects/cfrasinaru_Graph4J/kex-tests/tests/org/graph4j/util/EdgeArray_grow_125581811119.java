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

public class EdgeArray_grow_125581811119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62593;

    public EdgeArray_grow_125581811119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62593 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term62594 = (Object[]) newArray("[I", 3);
        int[] term62595 = (int[]) newIntArray(6);
        int[] term62602 = (int[]) newIntArray(2);
        int[] term62605 = (int[]) newIntArray(8);
        setField(term62593, term62593.getClass(), "graph", null);
        setIntElement(term62595, 0, -476865589);
        setIntElement(term62595, 1, -426524240);
        setIntElement(term62595, 2, -2094943009);
        setIntElement(term62595, 3, -6347300);
        setIntElement(term62595, 4, -2028885510);
        setIntElement(term62595, 5, 1898148089);
        setElement(term62594, 0, term62595);
        setIntElement(term62602, 0, 1620462199);
        setIntElement(term62602, 1, -418350686);
        setElement(term62594, 1, term62602);
        setIntElement(term62605, 0, 2108089284);
        setIntElement(term62605, 1, 1042300663);
        setIntElement(term62605, 2, -1957248425);
        setIntElement(term62605, 3, 437128088);
        setIntElement(term62605, 4, 1196324194);
        setIntElement(term62605, 5, 489535471);
        setIntElement(term62605, 6, -2003174737);
        setIntElement(term62605, 7, 554212199);
        setElement(term62594, 2, term62605);
        setField(term62593, term62593.getClass(), "edges", term62594);
        setIntField(term62593, term62593.getClass(), "numEdges", 389737737);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "grow", argTypes, term62593, args);
    }

};


