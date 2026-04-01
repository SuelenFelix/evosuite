package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GraphBuilderBase_addCycle_112552080616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58875;

    public GraphBuilderBase_addCycle_112552080616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58875 = (int[]) newIntArray(7);
        setIntElement(term58875, 0, 1188626740);
        setIntElement(term58875, 1, -114111309);
        setIntElement(term58875, 2, -2138943082);
        setIntElement(term58875, 3, -186268116);
        setIntElement(term58875, 4, -2082248803);
        setIntElement(term58875, 5, -1705126082);
        setIntElement(term58875, 6, -720862130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilderBase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term58875;
        callMethod(klass, "addCycle", argTypes, null, args);
    }

};


