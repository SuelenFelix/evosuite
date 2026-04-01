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

public class WattsStrogatzGenerator_init_18315407381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2447;
     Object term2449;
     Object term2451;
     Object term2453;
     Object term2455;

    public WattsStrogatzGenerator_init_18315407381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2447 = new Integer(-1292704466);
        term2449 = new Integer(1991858584);
        term2451 = new Integer(-1300947782);
        term2453 = new Double(0.9126850255993704);
        term2455 = new Double(0.11179067076100713);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.WattsStrogatzGenerator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        Object[] args = new Object[5];
        args[0] = term2447;
        args[1] = term2449;
        args[2] = term2451;
        args[3] = term2453;
        args[4] = term2455;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


