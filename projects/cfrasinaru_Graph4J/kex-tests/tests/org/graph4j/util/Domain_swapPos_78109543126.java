package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Domain_swapPos_78109543126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10171;
     Object term10174;
     Object term10176;

    public Domain_swapPos_78109543126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10171 = newInstance(Class.forName("org.graph4j.util.Domain"));
        setIntField(term10171, term10171.getClass(), "vertex", 0);
        setField(term10171, term10171.getClass(), "values", null);
        setField(term10171, term10171.getClass(), "positions", null);
        setIntField(term10171, term10171.getClass(), "size", 0);
        term10174 = new Integer(0);
        term10176 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term10174;
        args[1] = term10176;
        callMethod(klass, "swapPos", argTypes, term10171, args);
    }

};


