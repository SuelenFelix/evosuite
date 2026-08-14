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

public class IntArrayHeap_swap_18138780557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5359;
     Object term5463;
     Object term5465;

    public IntArrayHeap_swap_18138780557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5359 = newInstance(Class.forName("org.graph4j.util.IntArrayHeap"));
        int[] term5360 = (int[]) newIntArray(101);
        setField(term5359, term5359.getClass(), "comparator", null);
        setIntElement(term5360, 0, -2147483648);
        setField(term5359, term5359.getClass(), "heap", term5360);
        setIntField(term5359, term5359.getClass(), "size", 1268893136);
        term5463 = new Integer(-1472700822);
        term5465 = new Integer(1626670889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrayHeap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term5463;
        args[1] = term5465;
        callMethod(klass, "swap", argTypes, term5359, args);
    }

};


