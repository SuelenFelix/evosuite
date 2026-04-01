package org.graph4j.vsp;

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
import static org.graph4j.vsp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class VertexSeparator_toString_88882953721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79043;

    public VertexSeparator_toString_88882953721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79043 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        setField(term79043, term79043.getClass(), "graph", null);
        setField(term79043, term79043.getClass(), "separator", null);
        setField(term79043, term79043.getClass(), "leftShore", null);
        setField(term79043, term79043.getClass(), "rightShore", null);
        setIntField(term79043, term79043.getClass(), "maxShoreSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.VertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term79043, args);
    }

};


