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

public class GraphCoarsener_coarsen_16890890753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term478;

    public GraphCoarsener_coarsen_16890890753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term482 = new ArrayList();
        HashMap term487 = new HashMap();
        ArrayList term513 = new ArrayList();
        HashMap term518 = new HashMap();
        ArrayList term543 = new ArrayList();
        HashMap term548 = new HashMap();
        LinkedList term571 = new LinkedList();
        ArrayList term574 = new ArrayList();
        ArrayList term583 = new ArrayList();
        HashMap term598 = new HashMap();
        term478 = newInstance(Class.forName("com.todense.viewmodel.layout.GraphCoarsener"));
        Object term479 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term486 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term492 = (Object[]) newArray("java.lang.Object", 0);
        Object term509 = newInstance(Class.forName("com.todense.viewmodel.graph.GraphManager"));
        Object term510 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term517 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term523 = (Object[]) newArray("java.lang.Object", 0);
        Object term540 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term547 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term553 = (Object[]) newArray("java.lang.Object", 0);
        Object term578 = newInstance(Class.forName("java.util.Stack"));
        Object[] term579 = (Object[]) newArray("java.lang.Object", 10);
        Object term580 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term586 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object term593 = newInstance(Class.forName("java.util.Stack"));
        Object[] term594 = (Object[]) newArray("java.lang.Object", 10);
        setDoubleField(term479, term479.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term479, term479.getClass(), "idCounter", -883034806);
        setField(term479, term479.getClass(), "nodes", term482);
        setField(term486, term486.getClass(), "edgeMap", term487);
        setField(term486, term486.getClass(), "elementData", term492);
        setIntField(term486, term486.getClass(), "size", 0);
        setIntField(term486, term486.getClass(), "modCount", 0);
        setField(term479, term479.getClass(), "edges", term486);
        setField(term479, term479.getClass(), "name", "UnnamedGraph");
        setField(term478, term478.getClass(), "originalGraph", term479);
        setDoubleField(term510, term510.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term510, term510.getClass(), "idCounter", 0);
        setField(term510, term510.getClass(), "nodes", term513);
        setField(term517, term517.getClass(), "edgeMap", term518);
        setField(term517, term517.getClass(), "elementData", term523);
        setIntField(term517, term517.getClass(), "size", 0);
        setIntField(term517, term517.getClass(), "modCount", 0);
        setField(term510, term510.getClass(), "edges", term517);
        setField(term510, term510.getClass(), "name", "UnnamedGraph");
        setField(term509, term509.getClass(), "graph", term510);
        setDoubleField(term540, term540.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term540, term540.getClass(), "idCounter", 1585847225);
        setField(term540, term540.getClass(), "nodes", term543);
        setField(term547, term547.getClass(), "edgeMap", term548);
        setField(term547, term547.getClass(), "elementData", term553);
        setIntField(term547, term547.getClass(), "size", 0);
        setIntField(term547, term547.getClass(), "modCount", 0);
        setField(term540, term540.getClass(), "edges", term547);
        setField(term540, term540.getClass(), "name", "UnnamedGraph");
        setField(term509, term509.getClass(), "clipboardGraph", term540);
        setBooleanField(term509, term509.getClass(), "queueGraphOperationsOn", false);
        setField(term509, term509.getClass(), "operationQueue", term571);
        setField(term509, term509.getClass(), "selectedNodes", term574);
        setField(term478, term478.getClass(), "graphManager", term509);
        setDoubleField(term580, term580.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term580, term580.getClass(), "idCounter", 597278769);
        setField(term580, term580.getClass(), "nodes", term583);
        setField(term586, term586.getClass(), "edgeMap", null);
        setField(term586, term586.getClass(), "elementData", null);
        setIntField(term586, term586.getClass(), "size", 0);
        setIntField(term586, term586.getClass(), "modCount", 0);
        setField(term580, term580.getClass(), "edges", term586);
        setField(term580, term580.getClass(), "name", "");
        setElement(term579, 0, term580);
        setField(term578, term578.getClass(), "elementData", term579);
        setIntField(term578, term578.getClass(), "elementCount", 1);
        setIntField(term578, term578.getClass(), "capacityIncrement", 0);
        setIntField(term578, term578.getClass(), "modCount", 1);
        setField(term478, term478.getClass(), "graphSequence", term578);
        setField(term593, term593.getClass(), "elementData", term594);
        setIntField(term593, term593.getClass(), "elementCount", 0);
        setIntField(term593, term593.getClass(), "capacityIncrement", 0);
        setIntField(term593, term593.getClass(), "modCount", 0);
        setField(term478, term478.getClass(), "collapseMaps", term593);
        setField(term478, term478.getClass(), "nodeWeights", term598);
        setDoubleField(term478, term478.getClass(), "reductionRate", 0.5523635872663106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.layout.GraphCoarsener");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "coarsen", argTypes, term478, args);
    }

};


