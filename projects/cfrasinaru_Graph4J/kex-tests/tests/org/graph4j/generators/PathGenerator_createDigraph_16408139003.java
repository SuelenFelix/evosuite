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
import java.lang.Boolean;

public class PathGenerator_createDigraph_16408139003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1629;
     Object term1638;

    public PathGenerator_createDigraph_16408139003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1629 = newInstance(Class.forName("org.graph4j.generators.PathGenerator"));
        int[] term1630 = (int[]) newIntArray(7);
        setIntElement(term1630, 0, -975748721);
        setIntElement(term1630, 1, 433248783);
        setIntElement(term1630, 2, -507944154);
        setIntElement(term1630, 3, -1736183862);
        setIntElement(term1630, 4, 897010381);
        setIntElement(term1630, 5, -15712667);
        setIntElement(term1630, 6, 1964967720);
        setField(term1629, term1629.getClass(), "vertices", term1630);
        term1638 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.PathGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1638;
        callMethod(klass, "createDigraph", argTypes, term1629, args);
    }

};


