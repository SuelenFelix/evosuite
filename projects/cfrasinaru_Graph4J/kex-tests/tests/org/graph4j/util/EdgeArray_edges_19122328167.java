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

public class EdgeArray_edges_19122328167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61724;

    public EdgeArray_edges_19122328167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61724 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term61725 = (Object[]) newArray("[I", 2);
        int[] term61726 = (int[]) newIntArray(0);
        int[] term61727 = (int[]) newIntArray(3);
        setField(term61724, term61724.getClass(), "graph", null);
        setElement(term61725, 0, term61726);
        setIntElement(term61727, 0, 982773727);
        setIntElement(term61727, 1, -1195380899);
        setIntElement(term61727, 2, 777693111);
        setElement(term61725, 1, term61727);
        setField(term61724, term61724.getClass(), "edges", term61725);
        setIntField(term61724, term61724.getClass(), "numEdges", 2053588730);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "edges", argTypes, term61724, args);
    }

};


