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
import java.lang.Integer;

public class VertexHeap_swap_173626863914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60232;
     Object term60248;
     Object term60250;

    public VertexHeap_swap_173626863914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60232 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term60233 = (int[]) newIntArray(9);
        int[] term60243 = (int[]) newIntArray(3);
        setField(term60232, term60232.getClass(), "graph", null);
        setField(term60232, term60232.getClass(), "comparator", null);
        setIntElement(term60233, 0, -1518919035);
        setIntElement(term60233, 1, -653688131);
        setIntElement(term60233, 2, 729662498);
        setIntElement(term60233, 3, 1640664646);
        setIntElement(term60233, 4, 975935985);
        setIntElement(term60233, 5, -1159976869);
        setIntElement(term60233, 6, -154385431);
        setIntElement(term60233, 7, 495187606);
        setIntElement(term60233, 8, 2022697730);
        setField(term60232, term60232.getClass(), "keys", term60233);
        setIntElement(term60243, 0, 2078279488);
        setIntElement(term60243, 1, -2114547605);
        setIntElement(term60243, 2, 1231278686);
        setField(term60232, term60232.getClass(), "positions", term60243);
        setIntField(term60232, term60232.getClass(), "size", -314088371);
        term60248 = new Integer(-44831526);
        term60250 = new Integer(1856189526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term60248;
        args[1] = term60250;
        callMethod(klass, "swap", argTypes, term60232, args);
    }

};


