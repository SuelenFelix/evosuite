package org.graph4j.generators;

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
import static org.graph4j.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GridGenerator_createDigraph_16190495892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2519;

    public GridGenerator_createDigraph_16190495892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2519 = newInstance(Class.forName("org.graph4j.generators.GridGenerator"));
        int[] term2522 = (int[]) newIntArray(1);
        setIntField(term2519, term2519.getClass(), "rows", -1934033808);
        setIntField(term2519, term2519.getClass(), "cols", 950322609);
        setIntElement(term2522, 0, -2023791789);
        setField(term2519, term2519.getClass(), "vertices", term2522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.GridGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDigraph", argTypes, term2519, args);
    }

};


