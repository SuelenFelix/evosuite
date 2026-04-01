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

public class FlowData_edges_10374924049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1929;

    public FlowData_edges_10374924049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1929 = newInstance(Class.forName("org.graph4j.flow.FlowData"));
        setIntField(term1929, term1929.getClass(), "source", 0);
        setIntField(term1929, term1929.getClass(), "sink", 0);
        setField(term1929, term1929.getClass(), "graph", null);
        setField(term1929, term1929.getClass(), "map", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.flow.FlowData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "edges", argTypes, term1929, args);
    }

};


