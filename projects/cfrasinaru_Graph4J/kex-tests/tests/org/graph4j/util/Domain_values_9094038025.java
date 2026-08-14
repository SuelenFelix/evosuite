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

public class Domain_values_9094038025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9889;

    public Domain_values_9094038025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9889 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term9891 = (int[]) newIntArray(3);
        int[] term9895 = (int[]) newIntArray(8);
        setIntField(term9889, term9889.getClass(), "vertex", 312330930);
        setIntElement(term9891, 0, 1635910980);
        setIntElement(term9891, 1, 1560346640);
        setIntElement(term9891, 2, 100626332);
        setField(term9889, term9889.getClass(), "values", term9891);
        setIntElement(term9895, 0, 763794722);
        setIntElement(term9895, 1, -696403395);
        setIntElement(term9895, 2, 227321148);
        setIntElement(term9895, 3, -266870537);
        setIntElement(term9895, 4, -453010858);
        setIntElement(term9895, 5, -1855427206);
        setIntElement(term9895, 6, -647618746);
        setIntElement(term9895, 7, -91129577);
        setField(term9889, term9889.getClass(), "positions", term9895);
        setIntField(term9889, term9889.getClass(), "size", 1629059877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "values", argTypes, term9889, args);
    }

};


