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

public class FlowData_edges_10374924043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1870;

    public FlowData_edges_10374924043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1873 = new HashMap();
        term1870 = newInstance(Class.forName("org.graph4j.flow.FlowData"));
        setIntField(term1870, term1870.getClass(), "source", -763799087);
        setIntField(term1870, term1870.getClass(), "sink", 1207142014);
        setField(term1870, term1870.getClass(), "graph", null);
        setField(term1870, term1870.getClass(), "map", term1873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.flow.FlowData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "edges", argTypes, term1870, args);
    }

};


