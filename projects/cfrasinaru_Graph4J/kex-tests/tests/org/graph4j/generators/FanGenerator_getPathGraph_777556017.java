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

public class FanGenerator_getPathGraph_777556017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2219;

    public FanGenerator_getPathGraph_777556017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2219 = newInstance(Class.forName("org.graph4j.generators.FanGenerator"));
        setIntField(term2219, term2219.getClass(), "emptyGraphNumVertices", 0);
        setIntField(term2219, term2219.getClass(), "pathGraphNumVertices", 0);
        setField(term2219, term2219.getClass(), "emptyGraph", null);
        setField(term2219, term2219.getClass(), "pathGraph", null);
        setField(term2219, term2219.getClass(), "vertices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.FanGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathGraph", argTypes, term2219, args);
    }

};


