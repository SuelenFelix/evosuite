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
     Object term98392;

    public BoruvkaMinimumSpanningTreeDefault_updateCheapestEdges_2417272353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98392 = newInstance(Class.forName("org.graph4j.spanning.BoruvkaMinimumSpanningTreeDefault"));
        setField(term98392, term98392.getClass(), "uf", null);
        setField(term98392, term98392.getClass(), "cheapest", null);
        setField(term98392, term98392.getClass(), "tree", null);
        setField(term98392, term98392.getClass(), "treeEdges", null);
        setField(term98392, term98392.getClass(), "minWeight", null);
        setField(term98392, term98392.getClass(), "graph", null);
        setBooleanField(term98392, term98392.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.BoruvkaMinimumSpanningTreeDefault");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateCheapestEdges", argTypes, term98392, args);
    }

};


