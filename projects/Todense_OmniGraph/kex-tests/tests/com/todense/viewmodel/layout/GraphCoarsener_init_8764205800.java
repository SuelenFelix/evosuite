package com.todense.viewmodel.layout;

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
import static com.todense.viewmodel.layout.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class GraphCoarsener_init_8764205800 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public GraphCoarsener_init_8764205800() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5 = new ArrayList();
        HashMap term10 = new HashMap();
        ArrayList term35 = new ArrayList();
        HashMap term40 = new HashMap();
        LinkedList term63 = new LinkedList();
        ArrayList term66 = new ArrayList();
        term1 = newInstance(Class.forName("com.todense.viewmodel.graph.GraphManager"));
        Object term2 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term9 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term15 = (Object[]) newArray("java.lang.Object", 0);
        Object term32 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term39 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term45 = (Object[]) newArray("java.lang.Object", 0);
        setDoubleField(term2, term2.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term2, term2.getClass(), "idCounter", 0);
        setField(term2, term2.getClass(), "nodes", term5);
        setField(term9, term9.getClass(), "edgeMap", term10);
        setField(term9, term9.getClass(), "elementData", term15);
        setIntField(term9, term9.getClass(), "size", 0);
        setIntField(term9, term9.getClass(), "modCount", 0);
        setField(term2, term2.getClass(), "edges", term9);
        setField(term2, term2.getClass(), "name", "UnnamedGraph");
        setField(term1, term1.getClass(), "graph", term2);
        setDoubleField(term32, term32.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term32, term32.getClass(), "idCounter", 568599855);
        setField(term32, term32.getClass(), "nodes", term35);
        setField(term39, term39.getClass(), "edgeMap", term40);
        setField(term39, term39.getClass(), "elementData", term45);
        setIntField(term39, term39.getClass(), "size", 0);
        setIntField(term39, term39.getClass(), "modCount", 0);
        setField(term32, term32.getClass(), "edges", term39);
        setField(term32, term32.getClass(), "name", "UnnamedGraph");
        setField(term1, term1.getClass(), "clipboardGraph", term32);
        setBooleanField(term1, term1.getClass(), "queueGraphOperationsOn", false);
        setField(term1, term1.getClass(), "operationQueue", term63);
        setField(term1, term1.getClass(), "selectedNodes", term66);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.layout.GraphCoarsener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.todense.viewmodel.graph.GraphManager");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


