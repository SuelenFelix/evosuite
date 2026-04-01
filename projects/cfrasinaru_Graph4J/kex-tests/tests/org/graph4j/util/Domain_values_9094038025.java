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
     Object term157560;

    public Domain_values_9094038025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157560 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term157562 = (int[]) newIntArray(5);
        int[] term157568 = (int[]) newIntArray(5);
        setIntField(term157560, term157560.getClass(), "vertex", -794272894);
        setIntElement(term157562, 0, -17775793);
        setIntElement(term157562, 1, -1054393085);
        setIntElement(term157562, 2, 1886469593);
        setIntElement(term157562, 3, -11817049);
        setIntElement(term157562, 4, 1651418176);
        setField(term157560, term157560.getClass(), "values", term157562);
        setIntElement(term157568, 0, -910287205);
        setIntElement(term157568, 1, -824262111);
        setIntElement(term157568, 2, 808924002);
        setIntElement(term157568, 3, 2129687066);
        setIntElement(term157568, 4, -1519779910);
        setField(term157560, term157560.getClass(), "positions", term157568);
        setIntField(term157560, term157560.getClass(), "size", 1842561618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "values", argTypes, term157560, args);
    }

};


