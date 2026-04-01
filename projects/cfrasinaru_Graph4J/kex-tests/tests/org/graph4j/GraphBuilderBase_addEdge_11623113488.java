package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GraphBuilderBase_addEdge_11623113488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58711;

    public GraphBuilderBase_addEdge_11623113488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58711 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term58715 = (Object[]) newArray("java.lang.Double", 0);
        setBooleanField(term58711, term58711.getClass(), "directed", false);
        setIntField(term58711, term58711.getClass(), "source", 1524003020);
        setIntField(term58711, term58711.getClass(), "target", 1117653130);
        setField(term58711, term58711.getClass(), "data", term58715);
        setField(term58711, term58711.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilderBase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term58711;
        callMethod(klass, "addEdge", argTypes, null, args);
    }

};


