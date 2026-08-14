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
import java.lang.Double;

public class EdgeDataGenerator_randomDoubles_15698969278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1533;
     Object term1535;
     Object term1537;

    public EdgeDataGenerator_randomDoubles_15698969278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1533 = newInstance(Class.forName("org.graph4j.generators.EdgeDataGenerator"));
        setField(term1533, term1533.getClass(), "graph", null);
        setIntField(term1533, term1533.getClass(), "dataType", 0);
        term1535 = new Double(0.0);
        term1537 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.EdgeDataGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term1535;
        args[1] = term1537;
        callMethod(klass, "randomDoubles", argTypes, term1533, args);
    }

};


