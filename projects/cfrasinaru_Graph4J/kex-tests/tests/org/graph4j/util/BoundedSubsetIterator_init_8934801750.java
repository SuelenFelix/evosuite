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

public class BoundedSubsetIterator_init_8934801750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56516;
     Object term56525;

    public BoundedSubsetIterator_init_8934801750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56516 = (int[]) newIntArray(8);
        setIntElement(term56516, 0, -1749048132);
        setIntElement(term56516, 1, 201489622);
        setIntElement(term56516, 2, -1557911649);
        setIntElement(term56516, 3, -2023283754);
        setIntElement(term56516, 4, 100828116);
        setIntElement(term56516, 5, -1959805707);
        setIntElement(term56516, 6, 30813741);
        setIntElement(term56516, 7, 2044603094);
        term56525 = new Integer(726068108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.BoundedSubsetIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term56516;
        args[1] = term56525;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


