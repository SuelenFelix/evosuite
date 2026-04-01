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

public class VertexCollection_addAll_202365359610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182972;

    public VertexCollection_addAll_202365359610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182972 = (int[]) newIntArray(7);
        setIntElement(term182972, 0, 1419830873);
        setIntElement(term182972, 1, -1202800114);
        setIntElement(term182972, 2, -83367895);
        setIntElement(term182972, 3, -652729952);
        setIntElement(term182972, 4, -1989885386);
        setIntElement(term182972, 5, -2098742465);
        setIntElement(term182972, 6, -801751893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexCollection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term182972;
        callMethod(klass, "addAll", argTypes, null, args);
    }

};


