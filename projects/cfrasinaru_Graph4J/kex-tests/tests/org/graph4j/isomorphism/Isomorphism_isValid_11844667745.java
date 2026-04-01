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

public class Isomorphism_isValid_11844667745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4106;

    public Isomorphism_isValid_11844667745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4106 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        int[] term4107 = (int[]) newIntArray(2);
        int[] term4110 = (int[]) newIntArray(8);
        setField(term4106, term4106.getClass(), "graph1", null);
        setField(term4106, term4106.getClass(), "graph2", null);
        setIntElement(term4107, 0, 1068256001);
        setIntElement(term4107, 1, 1139078354);
        setField(term4106, term4106.getClass(), "mapping", term4107);
        setIntElement(term4110, 0, -691164974);
        setIntElement(term4110, 1, -761675396);
        setIntElement(term4110, 2, -1954860951);
        setIntElement(term4110, 3, -2078879114);
        setIntElement(term4110, 4, -1186882318);
        setIntElement(term4110, 5, 1077647088);
        setIntElement(term4110, 6, -705176810);
        setIntElement(term4110, 7, -1584779593);
        setField(term4106, term4106.getClass(), "inverse", term4110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.Isomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term4106, args);
    }

};


