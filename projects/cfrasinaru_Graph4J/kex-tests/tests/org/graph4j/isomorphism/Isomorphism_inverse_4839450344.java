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
import java.lang.Integer;

public class Isomorphism_inverse_4839450344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4081;
     Object term4094;

    public Isomorphism_inverse_4839450344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4081 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        int[] term4082 = (int[]) newIntArray(6);
        int[] term4089 = (int[]) newIntArray(4);
        setField(term4081, term4081.getClass(), "graph1", null);
        setField(term4081, term4081.getClass(), "graph2", null);
        setIntElement(term4082, 0, -1549952664);
        setIntElement(term4082, 1, 148394188);
        setIntElement(term4082, 2, 504525721);
        setIntElement(term4082, 3, 1835568392);
        setIntElement(term4082, 4, 457470807);
        setIntElement(term4082, 5, -994742871);
        setField(term4081, term4081.getClass(), "mapping", term4082);
        setIntElement(term4089, 0, -222412326);
        setIntElement(term4089, 1, -299497261);
        setIntElement(term4089, 2, -23054366);
        setIntElement(term4089, 3, 153009426);
        setField(term4081, term4081.getClass(), "inverse", term4089);
        term4094 = new Integer(185751892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.Isomorphism");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4094;
        callMethod(klass, "inverse", argTypes, term4081, args);
    }

};


