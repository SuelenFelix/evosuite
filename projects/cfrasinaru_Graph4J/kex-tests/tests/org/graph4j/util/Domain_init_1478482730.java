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

public class Domain_init_1478482730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157492;

    public Domain_init_1478482730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157492 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term157494 = (int[]) newIntArray(0);
        int[] term157495 = (int[]) newIntArray(5);
        setIntField(term157492, term157492.getClass(), "vertex", 1522767067);
        setField(term157492, term157492.getClass(), "values", term157494);
        setIntElement(term157495, 0, -612238878);
        setIntElement(term157495, 1, 460656115);
        setIntElement(term157495, 2, -1233803771);
        setIntElement(term157495, 3, 803976351);
        setIntElement(term157495, 4, 454949102);
        setField(term157492, term157492.getClass(), "positions", term157495);
        setIntField(term157492, term157492.getClass(), "size", -1467946079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.Domain");
        Object[] args = new Object[1];
        args[0] = term157492;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


