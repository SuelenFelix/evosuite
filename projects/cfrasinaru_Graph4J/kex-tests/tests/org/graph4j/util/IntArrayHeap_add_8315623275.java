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

public class IntArrayHeap_add_8315623275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4947;
     Object term5051;

    public IntArrayHeap_add_8315623275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4947 = newInstance(Class.forName("org.graph4j.util.IntArrayHeap"));
        int[] term4948 = (int[]) newIntArray(101);
        setField(term4947, term4947.getClass(), "comparator", null);
        setIntElement(term4948, 0, -2147483648);
        setField(term4947, term4947.getClass(), "heap", term4948);
        setIntField(term4947, term4947.getClass(), "size", 752858379);
        term5051 = new Integer(-370819357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrayHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5051;
        callMethod(klass, "add", argTypes, term4947, args);
    }

};


