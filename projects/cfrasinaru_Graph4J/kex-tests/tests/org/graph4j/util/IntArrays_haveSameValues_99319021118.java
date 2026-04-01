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

public class IntArrays_haveSameValues_99319021118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155653;
     Object term155658;

    public IntArrays_haveSameValues_99319021118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155653 = (int[]) newIntArray(4);
        setIntElement(term155653, 0, 813472302);
        setIntElement(term155653, 1, -1082054895);
        setIntElement(term155653, 2, -1009968865);
        setIntElement(term155653, 3, 1439513745);
        term155658 = (int[]) newIntArray(3);
        setIntElement(term155658, 0, -676410993);
        setIntElement(term155658, 1, -345439239);
        setIntElement(term155658, 2, -71660535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term155653;
        args[1] = term155658;
        callMethod(klass, "haveSameValues", argTypes, null, args);
    }

};


