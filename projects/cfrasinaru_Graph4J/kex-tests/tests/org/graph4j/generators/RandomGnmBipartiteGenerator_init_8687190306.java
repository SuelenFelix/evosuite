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
import java.lang.Long;

public class RandomGnmBipartiteGenerator_init_8687190306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term944;
     Object term946;
     Object term948;
     Object term950;
     Object term952;

    public RandomGnmBipartiteGenerator_init_8687190306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term944 = new Integer(0);
        term946 = new Integer(0);
        term948 = new Integer(0);
        term950 = new Integer(0);
        term952 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnmBipartiteGenerator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = long.class;
        Object[] args = new Object[5];
        args[0] = term944;
        args[1] = term946;
        args[2] = term948;
        args[3] = term950;
        args[4] = term952;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


