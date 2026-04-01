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

public class FanGenerator_create_2181473545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2213;

    public FanGenerator_create_2181473545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2213 = newInstance(Class.forName("org.graph4j.generators.FanGenerator"));
        setIntField(term2213, term2213.getClass(), "emptyGraphNumVertices", 0);
        setIntField(term2213, term2213.getClass(), "pathGraphNumVertices", 0);
        setField(term2213, term2213.getClass(), "emptyGraph", null);
        setField(term2213, term2213.getClass(), "pathGraph", null);
        setField(term2213, term2213.getClass(), "vertices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.FanGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "create", argTypes, term2213, args);
    }

};


