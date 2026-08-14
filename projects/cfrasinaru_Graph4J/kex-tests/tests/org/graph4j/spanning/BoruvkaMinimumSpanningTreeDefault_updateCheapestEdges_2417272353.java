package org.graph4j.spanning;

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
import static org.graph4j.spanning.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BoruvkaMinimumSpanningTreeDefault_updateCheapestEdges_2417272353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1148;

    public BoruvkaMinimumSpanningTreeDefault_updateCheapestEdges_2417272353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1148 = newInstance(Class.forName("org.graph4j.spanning.BoruvkaMinimumSpanningTreeDefault"));
        setField(term1148, term1148.getClass(), "uf", null);
        setField(term1148, term1148.getClass(), "cheapest", null);
        setField(term1148, term1148.getClass(), "tree", null);
        setField(term1148, term1148.getClass(), "treeEdges", null);
        setField(term1148, term1148.getClass(), "minWeight", null);
        setField(term1148, term1148.getClass(), "graph", null);
        setBooleanField(term1148, term1148.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.BoruvkaMinimumSpanningTreeDefault");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateCheapestEdges", argTypes, term1148, args);
    }

};


