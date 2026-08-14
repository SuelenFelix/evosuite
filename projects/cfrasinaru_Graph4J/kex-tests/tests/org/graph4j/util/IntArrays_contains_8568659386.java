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

public class IntArrays_contains_8568659386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8987;
     Object term8993;
     Object term8995;

    public IntArrays_contains_8568659386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8987 = (int[]) newIntArray(5);
        setIntElement(term8987, 0, -665938382);
        setIntElement(term8987, 1, 325391588);
        setIntElement(term8987, 2, 1443046313);
        setIntElement(term8987, 3, 1055117337);
        setIntElement(term8987, 4, -705616896);
        term8993 = new Integer(1057965724);
        term8995 = new Integer(2134707657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term8987;
        args[1] = term8993;
        args[2] = term8995;
        callMethod(klass, "contains", argTypes, null, args);
    }

};


