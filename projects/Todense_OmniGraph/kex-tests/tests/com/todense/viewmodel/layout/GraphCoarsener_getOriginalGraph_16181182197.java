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

public class GraphCoarsener_getOriginalGraph_16181182197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1288;

    public GraphCoarsener_getOriginalGraph_16181182197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1292 = new ArrayList();
        HashMap term1297 = new HashMap();
        ArrayList term1323 = new ArrayList();
        HashMap term1328 = new HashMap();
        ArrayList term1353 = new ArrayList();
        HashMap term1358 = new HashMap();
        LinkedList term1381 = new LinkedList();
        ArrayList term1384 = new ArrayList();
        ArrayList term1393 = new ArrayList();
        ArrayList term1403 = new ArrayList();
        ArrayList term1413 = new ArrayList();
        ArrayList term1423 = new ArrayList();
        ArrayList term1433 = new ArrayList();
        HashMap term1448 = new HashMap();
        term1288 = newInstance(Class.forName("com.todense.viewmodel.layout.GraphCoarsener"));
        Object term1289 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term1296 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term1302 = (Object[]) newArray("java.lang.Object", 0);
        Object term1319 = newInstance(Class.forName("com.todense.viewmodel.graph.GraphManager"));
        Object term1320 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term1327 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term1333 = (Object[]) newArray("java.lang.Object", 0);
        Object term1350 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term1357 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term1363 = (Object[]) newArray("java.lang.Object", 0);
        Object term1388 = newInstance(Class.forName("java.util.Stack"));
        Object[] term1389 = (Object[]) newArray("java.lang.Object", 10);
        Object term1390 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term1396 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object term1400 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term1406 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object term1410 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term1416 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object term1420 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term1426 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object term1430 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term1436 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object term1443 = newInstance(Class.forName("java.util.Stack"));
        Object[] term1444 = (Object[]) newArray("java.lang.Object", 10);
        setDoubleField(term1289, term1289.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term1289, term1289.getClass(), "idCounter", -1145578966);
        setField(term1289, term1289.getClass(), "nodes", term1292);
        setField(term1296, term1296.getClass(), "edgeMap", term1297);
        setField(term1296, term1296.getClass(), "elementData", term1302);
        setIntField(term1296, term1296.getClass(), "size", 0);
        setIntField(term1296, term1296.getClass(), "modCount", 0);
        setField(term1289, term1289.getClass(), "edges", term1296);
        setField(term1289, term1289.getClass(), "name", "UnnamedGraph");
        setField(term1288, term1288.getClass(), "originalGraph", term1289);
        setDoubleField(term1320, term1320.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term1320, term1320.getClass(), "idCounter", 0);
        setField(term1320, term1320.getClass(), "nodes", term1323);
        setField(term1327, term1327.getClass(), "edgeMap", term1328);
        setField(term1327, term1327.getClass(), "elementData", term1333);
        setIntField(term1327, term1327.getClass(), "size", 0);
        setIntField(term1327, term1327.getClass(), "modCount", 0);
        setField(term1320, term1320.getClass(), "edges", term1327);
        setField(term1320, term1320.getClass(), "name", "UnnamedGraph");
        setField(term1319, term1319.getClass(), "graph", term1320);
        setDoubleField(term1350, term1350.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term1350, term1350.getClass(), "idCounter", 679763016);
        setField(term1350, term1350.getClass(), "nodes", term1353);
        setField(term1357, term1357.getClass(), "edgeMap", term1358);
        setField(term1357, term1357.getClass(), "elementData", term1363);
        setIntField(term1357, term1357.getClass(), "size", 0);
        setIntField(term1357, term1357.getClass(), "modCount", 0);
        setField(term1350, term1350.getClass(), "edges", term1357);
        setField(term1350, term1350.getClass(), "name", "UnnamedGraph");
        setField(term1319, term1319.getClass(), "clipboardGraph", term1350);
        setBooleanField(term1319, term1319.getClass(), "queueGraphOperationsOn", true);
        setField(term1319, term1319.getClass(), "operationQueue", term1381);
        setField(term1319, term1319.getClass(), "selectedNodes", term1384);
        setField(term1288, term1288.getClass(), "graphManager", term1319);
        setDoubleField(term1390, term1390.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term1390, term1390.getClass(), "idCounter", 1962444399);
        setField(term1390, term1390.getClass(), "nodes", term1393);
        setField(term1396, term1396.getClass(), "edgeMap", null);
        setField(term1396, term1396.getClass(), "elementData", null);
        setIntField(term1396, term1396.getClass(), "size", 0);
        setIntField(term1396, term1396.getClass(), "modCount", 0);
        setField(term1390, term1390.getClass(), "edges", term1396);
        setField(term1390, term1390.getClass(), "name", "");
        setElement(term1389, 0, term1390);
        setDoubleField(term1400, term1400.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term1400, term1400.getClass(), "idCounter", 767834723);
        setField(term1400, term1400.getClass(), "nodes", term1403);
        setField(term1406, term1406.getClass(), "edgeMap", null);
        setField(term1406, term1406.getClass(), "elementData", null);
        setIntField(term1406, term1406.getClass(), "size", 0);
        setIntField(term1406, term1406.getClass(), "modCount", 0);
        setField(term1400, term1400.getClass(), "edges", term1406);
        setField(term1400, term1400.getClass(), "name", "");
        setElement(term1389, 1, term1400);
        setDoubleField(term1410, term1410.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term1410, term1410.getClass(), "idCounter", -602026508);
        setField(term1410, term1410.getClass(), "nodes", term1413);
        setField(term1416, term1416.getClass(), "edgeMap", null);
        setField(term1416, term1416.getClass(), "elementData", null);
        setIntField(term1416, term1416.getClass(), "size", 0);
        setIntField(term1416, term1416.getClass(), "modCount", 0);
        setField(term1410, term1410.getClass(), "edges", term1416);
        setField(term1410, term1410.getClass(), "name", "");
        setElement(term1389, 2, term1410);
        setDoubleField(term1420, term1420.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term1420, term1420.getClass(), "idCounter", -157887805);
        setField(term1420, term1420.getClass(), "nodes", term1423);
        setField(term1426, term1426.getClass(), "edgeMap", null);
        setField(term1426, term1426.getClass(), "elementData", null);
        setIntField(term1426, term1426.getClass(), "size", 0);
        setIntField(term1426, term1426.getClass(), "modCount", 0);
        setField(term1420, term1420.getClass(), "edges", term1426);
        setField(term1420, term1420.getClass(), "name", "");
        setElement(term1389, 3, term1420);
        setDoubleField(term1430, term1430.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term1430, term1430.getClass(), "idCounter", 1876565163);
        setField(term1430, term1430.getClass(), "nodes", term1433);
        setField(term1436, term1436.getClass(), "edgeMap", null);
        setField(term1436, term1436.getClass(), "elementData", null);
        setIntField(term1436, term1436.getClass(), "size", 0);
        setIntField(term1436, term1436.getClass(), "modCount", 0);
        setField(term1430, term1430.getClass(), "edges", term1436);
        setField(term1430, term1430.getClass(), "name", "");
        setElement(term1389, 4, term1430);
        setField(term1388, term1388.getClass(), "elementData", term1389);
        setIntField(term1388, term1388.getClass(), "elementCount", 5);
        setIntField(term1388, term1388.getClass(), "capacityIncrement", 0);
        setIntField(term1388, term1388.getClass(), "modCount", 5);
        setField(term1288, term1288.getClass(), "graphSequence", term1388);
        setField(term1443, term1443.getClass(), "elementData", term1444);
        setIntField(term1443, term1443.getClass(), "elementCount", 0);
        setIntField(term1443, term1443.getClass(), "capacityIncrement", 0);
        setIntField(term1443, term1443.getClass(), "modCount", 0);
        setField(term1288, term1288.getClass(), "collapseMaps", term1443);
        setField(term1288, term1288.getClass(), "nodeWeights", term1448);
        setDoubleField(term1288, term1288.getClass(), "reductionRate", 0.2641345529914265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.layout.GraphCoarsener");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOriginalGraph", argTypes, term1288, args);
    }

};


