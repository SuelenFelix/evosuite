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

public class Isomorphism_toString_12248180056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4129;

    public Isomorphism_toString_12248180056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4129 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        int[] term4130 = (int[]) newIntArray(3);
        int[] term4134 = (int[]) newIntArray(7);
        setField(term4129, term4129.getClass(), "graph1", null);
        setField(term4129, term4129.getClass(), "graph2", null);
        setIntElement(term4130, 0, 303007547);
        setIntElement(term4130, 1, 1498738343);
        setIntElement(term4130, 2, -1635571857);
        setField(term4129, term4129.getClass(), "mapping", term4130);
        setIntElement(term4134, 0, 1407309162);
        setIntElement(term4134, 1, -534033672);
        setIntElement(term4134, 2, -1162790806);
        setIntElement(term4134, 3, -1264595049);
        setIntElement(term4134, 4, -2058884635);
        setIntElement(term4134, 5, 1064185088);
        setIntElement(term4134, 6, -1249782654);
        setField(term4129, term4129.getClass(), "inverse", term4134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.Isomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4129, args);
    }

};


