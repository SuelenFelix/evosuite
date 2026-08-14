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

public class Clique_init_9970951632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7495;

    public Clique_init_9970951632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7495 = (int[]) newIntArray(9);
        setIntElement(term7495, 0, 896275171);
        setIntElement(term7495, 1, 466010);
        setIntElement(term7495, 2, -169463842);
        setIntElement(term7495, 3, -2106837394);
        setIntElement(term7495, 4, -533202192);
        setIntElement(term7495, 5, -1349617857);
        setIntElement(term7495, 6, 1346331516);
        setIntElement(term7495, 7, 1018925421);
        setIntElement(term7495, 8, -1658031378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Clique");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term7495;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


