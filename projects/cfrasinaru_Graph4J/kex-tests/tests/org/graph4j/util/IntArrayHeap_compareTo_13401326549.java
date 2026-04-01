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

public class IntArrayHeap_compareTo_13401326549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111736;
     Object term111840;
     Object term111842;

    public IntArrayHeap_compareTo_13401326549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111736 = newInstance(Class.forName("org.graph4j.util.IntArrayHeap"));
        int[] term111737 = (int[]) newIntArray(101);
        setField(term111736, term111736.getClass(), "comparator", null);
        setIntElement(term111737, 0, -2147483648);
        setField(term111736, term111736.getClass(), "heap", term111737);
        setIntField(term111736, term111736.getClass(), "size", -408710017);
        term111840 = new Integer(1412968182);
        term111842 = new Integer(444654725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrayHeap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term111840;
        args[1] = term111842;
        callMethod(klass, "compareTo", argTypes, term111736, args);
    }

};


