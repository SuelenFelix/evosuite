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

public class IntArrays_asSet_63415958314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9107;

    public IntArrays_asSet_63415958314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9107 = (int[]) newIntArray(9);
        setIntElement(term9107, 0, 1722619795);
        setIntElement(term9107, 1, 558598813);
        setIntElement(term9107, 2, -282356982);
        setIntElement(term9107, 3, 1060240374);
        setIntElement(term9107, 4, 2119043046);
        setIntElement(term9107, 5, 375507053);
        setIntElement(term9107, 6, 1803067672);
        setIntElement(term9107, 7, -844822506);
        setIntElement(term9107, 8, -586687174);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9107;
        callMethod(klass, "asSet", argTypes, null, args);
    }

};


