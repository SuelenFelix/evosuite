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

public class EdgeArray_indexOf_82959564533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62817;
     Object term62819;
     Object term62821;

    public EdgeArray_indexOf_82959564533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62817 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        setField(term62817, term62817.getClass(), "graph", null);
        setField(term62817, term62817.getClass(), "edges", null);
        setIntField(term62817, term62817.getClass(), "numEdges", 0);
        term62819 = new Integer(0);
        term62821 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term62819;
        args[1] = term62821;
        callMethod(klass, "indexOf", argTypes, term62817, args);
    }

};


