package org.graph4j.flow;

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
import static org.graph4j.flow.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class DinicMaximumFlow_init_10397135321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1938;

    public DinicMaximumFlow_init_10397135321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1941 = new HashMap();
        term1938 = newInstance(Class.forName("org.graph4j.flow.FlowData"));
        setIntField(term1938, term1938.getClass(), "source", 633598642);
        setIntField(term1938, term1938.getClass(), "sink", 1862841859);
        setField(term1938, term1938.getClass(), "graph", null);
        setField(term1938, term1938.getClass(), "map", term1941);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.flow.DinicMaximumFlow");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Network");
        argTypes[1] = Class.forName("org.graph4j.flow.FlowData");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1938;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


