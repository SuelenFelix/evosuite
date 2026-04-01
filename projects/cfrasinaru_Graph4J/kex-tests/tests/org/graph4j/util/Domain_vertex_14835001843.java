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

public class Domain_vertex_14835001843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157524;

    public Domain_vertex_14835001843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157524 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term157526 = (int[]) newIntArray(2);
        int[] term157529 = (int[]) newIntArray(8);
        setIntField(term157524, term157524.getClass(), "vertex", 1824682170);
        setIntElement(term157526, 0, 2125208037);
        setIntElement(term157526, 1, -2088038373);
        setField(term157524, term157524.getClass(), "values", term157526);
        setIntElement(term157529, 0, -88974117);
        setIntElement(term157529, 1, -961372772);
        setIntElement(term157529, 2, -1909364793);
        setIntElement(term157529, 3, -2005126237);
        setIntElement(term157529, 4, -764234801);
        setIntElement(term157529, 5, 1918659060);
        setIntElement(term157529, 6, -978500543);
        setIntElement(term157529, 7, 546397154);
        setField(term157524, term157524.getClass(), "positions", term157529);
        setIntField(term157524, term157524.getClass(), "size", -1335032361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "vertex", argTypes, term157524, args);
    }

};


