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

public class EdgeDataGenerator_randomIntegers_6380477681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1505;
     Object term1507;
     Object term1509;

    public EdgeDataGenerator_randomIntegers_6380477681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1505 = newInstance(Class.forName("org.graph4j.generators.EdgeDataGenerator"));
        setField(term1505, term1505.getClass(), "graph", null);
        setIntField(term1505, term1505.getClass(), "dataType", 354196060);
        term1507 = new Integer(-1840305774);
        term1509 = new Integer(1365087144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.EdgeDataGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1507;
        args[1] = term1509;
        callMethod(klass, "randomIntegers", argTypes, term1505, args);
    }

};


