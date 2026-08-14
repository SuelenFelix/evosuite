package com.todense.viewmodel.random;

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
import static com.todense.viewmodel.random.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class RandomGraphGenerator_generateEdges_5682460444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2845;

    public RandomGraphGenerator_generateEdges_5682460444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2848 = new ArrayList();
        HashMap term2853 = new HashMap();
        term2845 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term2852 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term2858 = (Object[]) newArray("java.lang.Object", 0);
        setDoubleField(term2845, term2845.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term2845, term2845.getClass(), "idCounter", 1162663216);
        setField(term2845, term2845.getClass(), "nodes", term2848);
        setField(term2852, term2852.getClass(), "edgeMap", term2853);
        setField(term2852, term2852.getClass(), "elementData", term2858);
        setIntField(term2852, term2852.getClass(), "size", 0);
        setIntField(term2852, term2852.getClass(), "modCount", 0);
        setField(term2845, term2845.getClass(), "edges", term2852);
        setField(term2845, term2845.getClass(), "name", "UnnamedGraph");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.random.RandomGraphGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.todense.model.graph.Graph");
        argTypes[1] = Class.forName("com.todense.viewmodel.random.EdgeGenerator");
        Object[] args = new Object[2];
        args[0] = term2845;
        args[1] = null;
        callMethod(klass, "generateEdges", argTypes, null, args);
    }

};


