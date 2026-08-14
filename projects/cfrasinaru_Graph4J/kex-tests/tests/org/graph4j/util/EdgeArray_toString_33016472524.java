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

public class EdgeArray_toString_33016472524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2211;

    public EdgeArray_toString_33016472524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2211 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term2212 = (Object[]) newArray("[I", 2);
        int[] term2213 = (int[]) newIntArray(7);
        int[] term2221 = (int[]) newIntArray(3);
        setField(term2211, term2211.getClass(), "graph", null);
        setIntElement(term2213, 0, 722787672);
        setIntElement(term2213, 1, 2077491675);
        setIntElement(term2213, 2, -1728316609);
        setIntElement(term2213, 3, 47118909);
        setIntElement(term2213, 4, -2093707412);
        setIntElement(term2213, 5, -680627153);
        setIntElement(term2213, 6, 722519669);
        setElement(term2212, 0, term2213);
        setIntElement(term2221, 0, -40335961);
        setIntElement(term2221, 1, 175343605);
        setIntElement(term2221, 2, 1050853183);
        setElement(term2212, 1, term2221);
        setField(term2211, term2211.getClass(), "edges", term2212);
        setIntField(term2211, term2211.getClass(), "numEdges", 848428785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2211, args);
    }

};


