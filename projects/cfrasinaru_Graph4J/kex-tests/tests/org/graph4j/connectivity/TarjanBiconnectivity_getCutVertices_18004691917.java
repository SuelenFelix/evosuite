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

public class TarjanBiconnectivity_getCutVertices_18004691917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2136;

    public TarjanBiconnectivity_getCutVertices_18004691917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2136 = newInstance(Class.forName("org.graph4j.connectivity.TarjanBiconnectivity"));
        setField(term2136, term2136.getClass(), "biconnected", null);
        setField(term2136, term2136.getClass(), "blocks", null);
        setField(term2136, term2136.getClass(), "cutVertices", null);
        setField(term2136, term2136.getClass(), "lowpoints", null);
        setField(term2136, term2136.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanBiconnectivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCutVertices", argTypes, term2136, args);
    }

};


