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

public class VertexHeap_poll_16396300399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567;

    public VertexHeap_poll_16396300399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term567 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term568 = (int[]) newIntArray(8);
        int[] term577 = (int[]) newIntArray(7);
        setField(term567, term567.getClass(), "graph", null);
        setField(term567, term567.getClass(), "comparator", null);
        setIntElement(term568, 0, 1398204340);
        setIntElement(term568, 1, 229204365);
        setIntElement(term568, 2, -461771056);
        setIntElement(term568, 3, -243422082);
        setIntElement(term568, 4, 1384592638);
        setIntElement(term568, 5, -1002370457);
        setIntElement(term568, 6, -2014576105);
        setIntElement(term568, 7, 1296895584);
        setField(term567, term567.getClass(), "keys", term568);
        setIntElement(term577, 0, 628918458);
        setIntElement(term577, 1, -1274456137);
        setIntElement(term577, 2, 1041916673);
        setIntElement(term577, 3, -601863069);
        setIntElement(term577, 4, 663292551);
        setIntElement(term577, 5, -1885090354);
        setIntElement(term577, 6, -2066804303);
        setField(term567, term567.getClass(), "positions", term577);
        setIntField(term567, term567.getClass(), "size", -1731761810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "poll", argTypes, term567, args);
    }

};


