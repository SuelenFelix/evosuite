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
import java.lang.Integer;

public class VertexSeparator_contains_134226990518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79035;
     Object term79037;

    public VertexSeparator_contains_134226990518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79035 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        setField(term79035, term79035.getClass(), "graph", null);
        setField(term79035, term79035.getClass(), "separator", null);
        setField(term79035, term79035.getClass(), "leftShore", null);
        setField(term79035, term79035.getClass(), "rightShore", null);
        setIntField(term79035, term79035.getClass(), "maxShoreSize", 0);
        term79037 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.VertexSeparator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term79037;
        callMethod(klass, "contains", argTypes, term79035, args);
    }

};


