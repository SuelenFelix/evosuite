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

public class EdmondsKarpMaximumFlow_init_11466229611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term929;

    public EdmondsKarpMaximumFlow_init_11466229611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term932 = new HashMap();
        term929 = newInstance(Class.forName("org.graph4j.flow.FlowData"));
        setIntField(term929, term929.getClass(), "source", 306847454);
        setIntField(term929, term929.getClass(), "sink", 1745276158);
        setField(term929, term929.getClass(), "graph", null);
        setField(term929, term929.getClass(), "map", term932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.flow.EdmondsKarpMaximumFlow");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Network");
        argTypes[1] = Class.forName("org.graph4j.flow.FlowData");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term929;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


