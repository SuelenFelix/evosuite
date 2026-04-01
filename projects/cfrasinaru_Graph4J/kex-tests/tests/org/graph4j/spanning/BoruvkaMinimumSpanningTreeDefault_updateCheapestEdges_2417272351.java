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
import java.lang.Object;
import java.lang.Double;

public class BoruvkaMinimumSpanningTreeDefault_updateCheapestEdges_2417272351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98369;

    public BoruvkaMinimumSpanningTreeDefault_updateCheapestEdges_2417272351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term98383 = new Double(0.8994044184659324);
        term98369 = newInstance(Class.forName("org.graph4j.spanning.BoruvkaMinimumSpanningTreeDefault"));
        Object term98370 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term98373 = (int[]) newIntArray(6);
        Object[] term98381 = (Object[]) newArray("org.graph4j.Edge", 0);
        Object term98382 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setIntField(term98370, term98370.getClass(), "numVertices", 1666502127);
        setBooleanField(term98370, term98370.getClass(), "pathCompression", true);
        setIntElement(term98373, 0, 367278412);
        setIntElement(term98373, 1, 465117660);
        setIntElement(term98373, 2, -379995752);
        setIntElement(term98373, 3, 1865503652);
        setIntElement(term98373, 4, -721396613);
        setIntElement(term98373, 5, -1851350391);
        setField(term98370, term98370.getClass(), "parent", term98373);
        setIntField(term98370, term98370.getClass(), "numSets", 1793584876);
        setField(term98369, term98369.getClass(), "uf", term98370);
        setField(term98369, term98369.getClass(), "cheapest", term98381);
        setField(term98369, term98369.getClass(), "tree", null);
        setField(term98382, term98382.getClass(), "graph", null);
        setField(term98382, term98382.getClass(), "map", null);
        setField(term98369, term98369.getClass(), "treeEdges", term98382);
        setField(term98369, term98369.getClass(), "minWeight", term98383);
        setField(term98369, term98369.getClass(), "graph", null);
        setBooleanField(term98369, term98369.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.BoruvkaMinimumSpanningTreeDefault");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateCheapestEdges", argTypes, term98369, args);
    }

};


