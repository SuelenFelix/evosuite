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

public class IntArrays_max_9003587012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8957;

    public IntArrays_max_9003587012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8957 = (int[]) newIntArray(8);
        setIntElement(term8957, 0, -861962061);
        setIntElement(term8957, 1, -1867124507);
        setIntElement(term8957, 2, 416116291);
        setIntElement(term8957, 3, 1104795023);
        setIntElement(term8957, 4, -1833777337);
        setIntElement(term8957, 5, -2068333492);
        setIntElement(term8957, 6, 1892862475);
        setIntElement(term8957, 7, -807914927);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term8957;
        callMethod(klass, "max", argTypes, null, args);
    }

};


