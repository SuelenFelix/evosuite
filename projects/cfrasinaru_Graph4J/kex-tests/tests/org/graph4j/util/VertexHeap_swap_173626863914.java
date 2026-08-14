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
     Object term653;
     Object term666;
     Object term668;

    public VertexHeap_swap_173626863914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term653 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term654 = (int[]) newIntArray(5);
        int[] term660 = (int[]) newIntArray(4);
        setField(term653, term653.getClass(), "graph", null);
        setField(term653, term653.getClass(), "comparator", null);
        setIntElement(term654, 0, -1214628358);
        setIntElement(term654, 1, 1102721075);
        setIntElement(term654, 2, -426764678);
        setIntElement(term654, 3, -1222614956);
        setIntElement(term654, 4, -1870495012);
        setField(term653, term653.getClass(), "keys", term654);
        setIntElement(term660, 0, -1310015129);
        setIntElement(term660, 1, -2104981311);
        setIntElement(term660, 2, -571169753);
        setIntElement(term660, 3, 318591690);
        setField(term653, term653.getClass(), "positions", term660);
        setIntField(term653, term653.getClass(), "size", -165587447);
        term666 = new Integer(-1347358701);
        term668 = new Integer(806595993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term666;
        args[1] = term668;
        callMethod(klass, "swap", argTypes, term653, args);
    }

};


