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
     Object term5775;
     Object term5879;
     Object term5881;

    public IntArrayHeap_compareTo_13401326549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5775 = newInstance(Class.forName("org.graph4j.util.IntArrayHeap"));
        int[] term5776 = (int[]) newIntArray(101);
        setField(term5775, term5775.getClass(), "comparator", null);
        setIntElement(term5776, 0, -2147483648);
        setField(term5775, term5775.getClass(), "heap", term5776);
        setIntField(term5775, term5775.getClass(), "size", -287519200);
        term5879 = new Integer(-1490696181);
        term5881 = new Integer(623717232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrayHeap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term5879;
        args[1] = term5881;
        callMethod(klass, "compareTo", argTypes, term5775, args);
    }

};


