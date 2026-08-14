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

public class IntArrays_intersects_83421279910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9028;
     Object term9037;

    public IntArrays_intersects_83421279910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9028 = (int[]) newIntArray(8);
        setIntElement(term9028, 0, 1970986976);
        setIntElement(term9028, 1, 530909877);
        setIntElement(term9028, 2, -123945804);
        setIntElement(term9028, 3, 2133669766);
        setIntElement(term9028, 4, -1423215684);
        setIntElement(term9028, 5, -1096652631);
        setIntElement(term9028, 6, 1116810901);
        setIntElement(term9028, 7, 1944430959);
        term9037 = (int[]) newIntArray(2);
        setIntElement(term9037, 0, 98801346);
        setIntElement(term9037, 1, 2133290622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term9028;
        args[1] = term9037;
        callMethod(klass, "intersects", argTypes, null, args);
    }

};


