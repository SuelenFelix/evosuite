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

public class EdgeArray_hashCode_18059496522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2130;

    public EdgeArray_hashCode_18059496522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2130 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term2131 = (Object[]) newArray("[I", 1);
        int[] term2132 = (int[]) newIntArray(6);
        setField(term2130, term2130.getClass(), "graph", null);
        setIntElement(term2132, 0, -98060427);
        setIntElement(term2132, 1, -1272268399);
        setIntElement(term2132, 2, 1120271104);
        setIntElement(term2132, 3, -128435804);
        setIntElement(term2132, 4, 2136158480);
        setIntElement(term2132, 5, 2118747457);
        setElement(term2131, 0, term2132);
        setField(term2130, term2130.getClass(), "edges", term2131);
        setIntField(term2130, term2130.getClass(), "numEdges", 1868344256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2130, args);
    }

};


