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

public class GraphCoarsener_initGraphSequence_19551361472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296;

    public GraphCoarsener_initGraphSequence_19551361472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term300 = new ArrayList();
        HashMap term305 = new HashMap();
        ArrayList term331 = new ArrayList();
        HashMap term336 = new HashMap();
        ArrayList term361 = new ArrayList();
        HashMap term366 = new HashMap();
        LinkedList term389 = new LinkedList();
        ArrayList term392 = new ArrayList();
        ArrayList term401 = new ArrayList();
        ArrayList term411 = new ArrayList();
        ArrayList term421 = new ArrayList();
        HashMap term436 = new HashMap();
        term296 = newInstance(Class.forName("com.todense.viewmodel.layout.GraphCoarsener"));
        Object term297 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term304 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term310 = (Object[]) newArray("java.lang.Object", 0);
        Object term327 = newInstance(Class.forName("com.todense.viewmodel.graph.GraphManager"));
        Object term328 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term335 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term341 = (Object[]) newArray("java.lang.Object", 0);
        Object term358 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term365 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term371 = (Object[]) newArray("java.lang.Object", 0);
        Object term396 = newInstance(Class.forName("java.util.Stack"));
        Object[] term397 = (Object[]) newArray("java.lang.Object", 10);
        Object term398 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term404 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object term408 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term414 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object term418 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term424 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object term431 = newInstance(Class.forName("java.util.Stack"));
        Object[] term432 = (Object[]) newArray("java.lang.Object", 10);
        setDoubleField(term297, term297.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term297, term297.getClass(), "idCounter", 1227103734);
        setField(term297, term297.getClass(), "nodes", term300);
        setField(term304, term304.getClass(), "edgeMap", term305);
        setField(term304, term304.getClass(), "elementData", term310);
        setIntField(term304, term304.getClass(), "size", 0);
        setIntField(term304, term304.getClass(), "modCount", 0);
        setField(term297, term297.getClass(), "edges", term304);
        setField(term297, term297.getClass(), "name", "UnnamedGraph");
        setField(term296, term296.getClass(), "originalGraph", term297);
        setDoubleField(term328, term328.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term328, term328.getClass(), "idCounter", 0);
        setField(term328, term328.getClass(), "nodes", term331);
        setField(term335, term335.getClass(), "edgeMap", term336);
        setField(term335, term335.getClass(), "elementData", term341);
        setIntField(term335, term335.getClass(), "size", 0);
        setIntField(term335, term335.getClass(), "modCount", 0);
        setField(term328, term328.getClass(), "edges", term335);
        setField(term328, term328.getClass(), "name", "UnnamedGraph");
        setField(term327, term327.getClass(), "graph", term328);
        setDoubleField(term358, term358.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term358, term358.getClass(), "idCounter", -1339778481);
        setField(term358, term358.getClass(), "nodes", term361);
        setField(term365, term365.getClass(), "edgeMap", term366);
        setField(term365, term365.getClass(), "elementData", term371);
        setIntField(term365, term365.getClass(), "size", 0);
        setIntField(term365, term365.getClass(), "modCount", 0);
        setField(term358, term358.getClass(), "edges", term365);
        setField(term358, term358.getClass(), "name", "UnnamedGraph");
        setField(term327, term327.getClass(), "clipboardGraph", term358);
        setBooleanField(term327, term327.getClass(), "queueGraphOperationsOn", false);
        setField(term327, term327.getClass(), "operationQueue", term389);
        setField(term327, term327.getClass(), "selectedNodes", term392);
        setField(term296, term296.getClass(), "graphManager", term327);
        setDoubleField(term398, term398.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term398, term398.getClass(), "idCounter", 1725571209);
        setField(term398, term398.getClass(), "nodes", term401);
        setField(term404, term404.getClass(), "edgeMap", null);
        setField(term404, term404.getClass(), "elementData", null);
        setIntField(term404, term404.getClass(), "size", 0);
        setIntField(term404, term404.getClass(), "modCount", 0);
        setField(term398, term398.getClass(), "edges", term404);
        setField(term398, term398.getClass(), "name", "");
        setElement(term397, 0, term398);
        setDoubleField(term408, term408.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term408, term408.getClass(), "idCounter", -522618178);
        setField(term408, term408.getClass(), "nodes", term411);
        setField(term414, term414.getClass(), "edgeMap", null);
        setField(term414, term414.getClass(), "elementData", null);
        setIntField(term414, term414.getClass(), "size", 0);
        setIntField(term414, term414.getClass(), "modCount", 0);
        setField(term408, term408.getClass(), "edges", term414);
        setField(term408, term408.getClass(), "name", "");
        setElement(term397, 1, term408);
        setDoubleField(term418, term418.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term418, term418.getClass(), "idCounter", 1134449235);
        setField(term418, term418.getClass(), "nodes", term421);
        setField(term424, term424.getClass(), "edgeMap", null);
        setField(term424, term424.getClass(), "elementData", null);
        setIntField(term424, term424.getClass(), "size", 0);
        setIntField(term424, term424.getClass(), "modCount", 0);
        setField(term418, term418.getClass(), "edges", term424);
        setField(term418, term418.getClass(), "name", "");
        setElement(term397, 2, term418);
        setField(term396, term396.getClass(), "elementData", term397);
        setIntField(term396, term396.getClass(), "elementCount", 3);
        setIntField(term396, term396.getClass(), "capacityIncrement", 0);
        setIntField(term396, term396.getClass(), "modCount", 3);
        setField(term296, term296.getClass(), "graphSequence", term396);
        setField(term431, term431.getClass(), "elementData", term432);
        setIntField(term431, term431.getClass(), "elementCount", 0);
        setIntField(term431, term431.getClass(), "capacityIncrement", 0);
        setIntField(term431, term431.getClass(), "modCount", 0);
        setField(term296, term296.getClass(), "collapseMaps", term431);
        setField(term296, term296.getClass(), "nodeWeights", term436);
        setDoubleField(term296, term296.getClass(), "reductionRate", 0.3455959125047594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.layout.GraphCoarsener");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initGraphSequence", argTypes, term296, args);
    }

};


