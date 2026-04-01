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
     Object term155450;
     Object term155454;

    public IntArrays_intersects_83421279910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155450 = (int[]) newIntArray(3);
        setIntElement(term155450, 0, 808650440);
        setIntElement(term155450, 1, -243590988);
        setIntElement(term155450, 2, -1919328664);
        term155454 = (int[]) newIntArray(9);
        setIntElement(term155454, 0, -1057227877);
        setIntElement(term155454, 1, -863836703);
        setIntElement(term155454, 2, 1600067942);
        setIntElement(term155454, 3, 142931590);
        setIntElement(term155454, 4, -1647187835);
        setIntElement(term155454, 5, 905295334);
        setIntElement(term155454, 6, 437900622);
        setIntElement(term155454, 7, -1920675618);
        setIntElement(term155454, 8, -233793568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term155450;
        args[1] = term155454;
        callMethod(klass, "intersects", argTypes, null, args);
    }

};


