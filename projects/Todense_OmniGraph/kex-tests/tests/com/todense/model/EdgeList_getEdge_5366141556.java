package com.todense.model;

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
import static com.todense.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EdgeList_getEdge_5366141556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1734;

    public EdgeList_getEdge_5366141556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1734 = newInstance(Class.forName("com.todense.model.EdgeList"));
        setField(term1734, term1734.getClass(), "edgeMap", null);
        setField(term1734, term1734.getClass(), "elementData", null);
        setIntField(term1734, term1734.getClass(), "size", 0);
        setIntField(term1734, term1734.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.model.EdgeList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.todense.model.graph.Node");
        argTypes[1] = Class.forName("com.todense.model.graph.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getEdge", argTypes, term1734, args);
    }

};


