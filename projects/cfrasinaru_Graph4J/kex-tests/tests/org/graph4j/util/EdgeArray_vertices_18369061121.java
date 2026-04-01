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
     Object term62634;

    public EdgeArray_vertices_18369061121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62634 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term62635 = (Object[]) newArray("[I", 3);
        int[] term62636 = (int[]) newIntArray(3);
        int[] term62640 = (int[]) newIntArray(1);
        int[] term62642 = (int[]) newIntArray(9);
        setField(term62634, term62634.getClass(), "graph", null);
        setIntElement(term62636, 0, 1494869778);
        setIntElement(term62636, 1, 1841534409);
        setIntElement(term62636, 2, -454011518);
        setElement(term62635, 0, term62636);
        setIntElement(term62640, 0, 912352909);
        setElement(term62635, 1, term62640);
        setIntElement(term62642, 0, -1991098590);
        setIntElement(term62642, 1, -1125437654);
        setIntElement(term62642, 2, -1672681991);
        setIntElement(term62642, 3, 1344218803);
        setIntElement(term62642, 4, 997123210);
        setIntElement(term62642, 5, 354354316);
        setIntElement(term62642, 6, 1271683860);
        setIntElement(term62642, 7, 391963036);
        setIntElement(term62642, 8, 971387953);
        setElement(term62635, 2, term62642);
        setField(term62634, term62634.getClass(), "edges", term62635);
        setIntField(term62634, term62634.getClass(), "numEdges", 1267426986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "vertices", argTypes, term62634, args);
    }

};


