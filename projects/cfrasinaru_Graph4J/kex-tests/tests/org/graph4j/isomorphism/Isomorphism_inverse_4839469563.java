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

public class Isomorphism_inverse_4839469563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4064;

    public Isomorphism_inverse_4839469563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4064 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        int[] term4065 = (int[]) newIntArray(0);
        int[] term4066 = (int[]) newIntArray(7);
        setField(term4064, term4064.getClass(), "graph1", null);
        setField(term4064, term4064.getClass(), "graph2", null);
        setField(term4064, term4064.getClass(), "mapping", term4065);
        setIntElement(term4066, 0, 21095258);
        setIntElement(term4066, 1, -1793997256);
        setIntElement(term4066, 2, -1271598018);
        setIntElement(term4066, 3, 157967613);
        setIntElement(term4066, 4, 811839399);
        setIntElement(term4066, 5, 593962063);
        setIntElement(term4066, 6, -1485826786);
        setField(term4064, term4064.getClass(), "inverse", term4066);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.Isomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "inverse", argTypes, term4064, args);
    }

};


