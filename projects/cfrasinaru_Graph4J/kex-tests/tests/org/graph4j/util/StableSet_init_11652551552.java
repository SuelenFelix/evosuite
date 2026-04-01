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

public class StableSet_init_11652551552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154705;

    public StableSet_init_11652551552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154705 = (int[]) newIntArray(8);
        setIntElement(term154705, 0, -196016970);
        setIntElement(term154705, 1, -487996080);
        setIntElement(term154705, 2, -2051167298);
        setIntElement(term154705, 3, 331151432);
        setIntElement(term154705, 4, 1820080066);
        setIntElement(term154705, 5, -1656693937);
        setIntElement(term154705, 6, 1314004627);
        setIntElement(term154705, 7, -1567136907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.StableSet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term154705;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


