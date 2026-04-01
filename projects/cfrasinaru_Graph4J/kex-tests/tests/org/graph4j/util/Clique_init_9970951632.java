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
     Object term141483;

    public Clique_init_9970951632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141483 = (int[]) newIntArray(9);
        setIntElement(term141483, 0, -2121122733);
        setIntElement(term141483, 1, 571653804);
        setIntElement(term141483, 2, -164270853);
        setIntElement(term141483, 3, -1305444081);
        setIntElement(term141483, 4, -556582214);
        setIntElement(term141483, 5, 1710050300);
        setIntElement(term141483, 6, 1467232017);
        setIntElement(term141483, 7, -3531973);
        setIntElement(term141483, 8, 2016586909);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Clique");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term141483;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


