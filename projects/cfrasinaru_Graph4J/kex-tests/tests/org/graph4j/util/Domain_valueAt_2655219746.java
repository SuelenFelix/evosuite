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

public class Domain_valueAt_2655219746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157585;
     Object term157599;

    public Domain_valueAt_2655219746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157585 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term157587 = (int[]) newIntArray(3);
        int[] term157591 = (int[]) newIntArray(6);
        setIntField(term157585, term157585.getClass(), "vertex", 676209930);
        setIntElement(term157587, 0, 1702044236);
        setIntElement(term157587, 1, -1424993532);
        setIntElement(term157587, 2, 747189926);
        setField(term157585, term157585.getClass(), "values", term157587);
        setIntElement(term157591, 0, 1761899355);
        setIntElement(term157591, 1, 989058674);
        setIntElement(term157591, 2, -764752196);
        setIntElement(term157591, 3, -356577477);
        setIntElement(term157591, 4, 1440348022);
        setIntElement(term157591, 5, -675862516);
        setField(term157585, term157585.getClass(), "positions", term157591);
        setIntField(term157585, term157585.getClass(), "size", 1968595047);
        term157599 = new Integer(-1721087773);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term157599;
        callMethod(klass, "valueAt", argTypes, term157585, args);
    }

};


