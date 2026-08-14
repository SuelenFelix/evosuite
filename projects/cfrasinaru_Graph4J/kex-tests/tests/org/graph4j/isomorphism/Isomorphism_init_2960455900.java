package org.graph4j.isomorphism;

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
import static org.graph4j.isomorphism.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Isomorphism_init_2960455900 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3986;
     Object term3995;

    public Isomorphism_init_2960455900() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3986 = (int[]) newIntArray(8);
        setIntElement(term3986, 0, 1175146356);
        setIntElement(term3986, 1, -2137419728);
        setIntElement(term3986, 2, 1558810715);
        setIntElement(term3986, 3, -382652403);
        setIntElement(term3986, 4, -2126539433);
        setIntElement(term3986, 5, 196952878);
        setIntElement(term3986, 6, 802673242);
        setIntElement(term3986, 7, -1808638031);
        term3995 = (int[]) newIntArray(2);
        setIntElement(term3995, 0, -1514240086);
        setIntElement(term3995, 1, 2052244839);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.Isomorphism");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("org.graph4j.Graph");
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term3986;
        args[3] = term3995;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


