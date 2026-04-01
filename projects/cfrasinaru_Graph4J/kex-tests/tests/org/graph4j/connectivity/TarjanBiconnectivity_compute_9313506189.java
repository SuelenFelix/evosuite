package org.graph4j.connectivity;

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
import static org.graph4j.connectivity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class TarjanBiconnectivity_compute_9313506189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2138;
     Object term2139;

    public TarjanBiconnectivity_compute_9313506189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2138 = newInstance(Class.forName("org.graph4j.connectivity.TarjanBiconnectivity"));
        setField(term2138, term2138.getClass(), "biconnected", null);
        setField(term2138, term2138.getClass(), "blocks", null);
        setField(term2138, term2138.getClass(), "cutVertices", null);
        setField(term2138, term2138.getClass(), "lowpoints", null);
        setField(term2138, term2138.getClass(), "graph", null);
        term2139 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanBiconnectivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2139;
        callMethod(klass, "compute", argTypes, term2138, args);
    }

};


