package org.graph4j.realization;

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
import static org.graph4j.realization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class KleitmanWangDigraphRealization_init_17981621490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157;
     Object term166;

    public KleitmanWangDigraphRealization_init_17981621490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157 = (int[]) newIntArray(8);
        setIntElement(term157, 0, -2095575670);
        setIntElement(term157, 1, 1225272962);
        setIntElement(term157, 2, 1324040357);
        setIntElement(term157, 3, -1588772968);
        setIntElement(term157, 4, -93135961);
        setIntElement(term157, 5, -112921587);
        setIntElement(term157, 6, 933028652);
        setIntElement(term157, 7, 287287233);
        term166 = (int[]) newIntArray(6);
        setIntElement(term166, 0, 962840079);
        setIntElement(term166, 1, 1540719661);
        setIntElement(term166, 2, 1265463001);
        setIntElement(term166, 3, 335112684);
        setIntElement(term166, 4, 1551099402);
        setIntElement(term166, 5, -2027534003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.realization.KleitmanWangDigraphRealization");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term157;
        args[1] = term166;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


