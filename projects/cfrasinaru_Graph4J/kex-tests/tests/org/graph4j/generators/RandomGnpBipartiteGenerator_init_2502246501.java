package org.graph4j.generators;

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
import static org.graph4j.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Double;

public class RandomGnpBipartiteGenerator_init_2502246501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978;
     Object term980;
     Object term982;
     Object term984;
     Object term986;

    public RandomGnpBipartiteGenerator_init_2502246501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term978 = new Integer(-1464172784);
        term980 = new Integer(32185364);
        term982 = new Integer(1768204942);
        term984 = new Integer(1252951645);
        term986 = new Double(0.07802449704920456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnpBipartiteGenerator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = double.class;
        Object[] args = new Object[5];
        args[0] = term978;
        args[1] = term980;
        args[2] = term982;
        args[3] = term984;
        args[4] = term986;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


