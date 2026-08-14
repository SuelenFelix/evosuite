package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Walk_add_206175580623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7956;
     Object term7960;

    public Walk_add_206175580623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7956 = newInstance(Class.forName("org.graph4j.util.Walk"));
        setIntField(term7956, term7956.getClass(), "numEdges", 0);
        setField(term7956, term7956.getClass(), "graph", null);
        setField(term7956, term7956.getClass(), "vertices", null);
        setIntField(term7956, term7956.getClass(), "numVertices", 0);
        setIntField(term7956, term7956.getClass(), "first", 0);
        setField(term7956, term7956.getClass(), "bitset", null);
        term7960 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7960;
        callMethod(klass, "add", argTypes, term7956, args);
    }

};


