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

public class GraphCoarsener_reconstruct_2692875121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94;

    public GraphCoarsener_reconstruct_2692875121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term98 = new ArrayList();
        HashMap term103 = new HashMap();
        ArrayList term129 = new ArrayList();
        HashMap term134 = new HashMap();
        ArrayList term159 = new ArrayList();
        HashMap term164 = new HashMap();
        LinkedList term187 = new LinkedList();
        ArrayList term190 = new ArrayList();
        ArrayList term199 = new ArrayList();
        ArrayList term209 = new ArrayList();
        ArrayList term219 = new ArrayList();
        ArrayList term229 = new ArrayList();
        ArrayList term239 = new ArrayList();
        HashMap term254 = new HashMap();
        term94 = newInstance(Class.forName("com.todense.viewmodel.layout.GraphCoarsener"));
        Object term95 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term102 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term108 = (Object[]) newArray("java.lang.Object", 0);
        Object term125 = newInstance(Class.forName("com.todense.viewmodel.graph.GraphManager"));
        Object term126 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term133 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term139 = (Object[]) newArray("java.lang.Object", 0);
        Object term156 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term163 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term169 = (Object[]) newArray("java.lang.Object", 0);
        Object term194 = newInstance(Class.forName("java.util.Stack"));
        Object[] term195 = (Object[]) newArray("java.lang.Object", 10);
        Object term196 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term202 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object term206 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term212 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object term216 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term222 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object term226 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term232 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object term236 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term242 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object term249 = newInstance(Class.forName("java.util.Stack"));
        Object[] term250 = (Object[]) newArray("java.lang.Object", 10);
        setDoubleField(term95, term95.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term95, term95.getClass(), "idCounter", 1162663216);
        setField(term95, term95.getClass(), "nodes", term98);
        setField(term102, term102.getClass(), "edgeMap", term103);
        setField(term102, term102.getClass(), "elementData", term108);
        setIntField(term102, term102.getClass(), "size", 0);
        setIntField(term102, term102.getClass(), "modCount", 0);
        setField(term95, term95.getClass(), "edges", term102);
        setField(term95, term95.getClass(), "name", "UnnamedGraph");
        setField(term94, term94.getClass(), "originalGraph", term95);
        setDoubleField(term126, term126.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term126, term126.getClass(), "idCounter", 0);
        setField(term126, term126.getClass(), "nodes", term129);
        setField(term133, term133.getClass(), "edgeMap", term134);
        setField(term133, term133.getClass(), "elementData", term139);
        setIntField(term133, term133.getClass(), "size", 0);
        setIntField(term133, term133.getClass(), "modCount", 0);
        setField(term126, term126.getClass(), "edges", term133);
        setField(term126, term126.getClass(), "name", "UnnamedGraph");
        setField(term125, term125.getClass(), "graph", term126);
        setDoubleField(term156, term156.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term156, term156.getClass(), "idCounter", 1484323161);
        setField(term156, term156.getClass(), "nodes", term159);
        setField(term163, term163.getClass(), "edgeMap", term164);
        setField(term163, term163.getClass(), "elementData", term169);
        setIntField(term163, term163.getClass(), "size", 0);
        setIntField(term163, term163.getClass(), "modCount", 0);
        setField(term156, term156.getClass(), "edges", term163);
        setField(term156, term156.getClass(), "name", "UnnamedGraph");
        setField(term125, term125.getClass(), "clipboardGraph", term156);
        setBooleanField(term125, term125.getClass(), "queueGraphOperationsOn", false);
        setField(term125, term125.getClass(), "operationQueue", term187);
        setField(term125, term125.getClass(), "selectedNodes", term190);
        setField(term94, term94.getClass(), "graphManager", term125);
        setDoubleField(term196, term196.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term196, term196.getClass(), "idCounter", 391863371);
        setField(term196, term196.getClass(), "nodes", term199);
        setField(term202, term202.getClass(), "edgeMap", null);
        setField(term202, term202.getClass(), "elementData", null);
        setIntField(term202, term202.getClass(), "size", 0);
        setIntField(term202, term202.getClass(), "modCount", 0);
        setField(term196, term196.getClass(), "edges", term202);
        setField(term196, term196.getClass(), "name", "");
        setElement(term195, 0, term196);
        setDoubleField(term206, term206.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term206, term206.getClass(), "idCounter", -1922583790);
        setField(term206, term206.getClass(), "nodes", term209);
        setField(term212, term212.getClass(), "edgeMap", null);
        setField(term212, term212.getClass(), "elementData", null);
        setIntField(term212, term212.getClass(), "size", 0);
        setIntField(term212, term212.getClass(), "modCount", 0);
        setField(term206, term206.getClass(), "edges", term212);
        setField(term206, term206.getClass(), "name", "");
        setElement(term195, 1, term206);
        setDoubleField(term216, term216.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term216, term216.getClass(), "idCounter", -616727354);
        setField(term216, term216.getClass(), "nodes", term219);
        setField(term222, term222.getClass(), "edgeMap", null);
        setField(term222, term222.getClass(), "elementData", null);
        setIntField(term222, term222.getClass(), "size", 0);
        setIntField(term222, term222.getClass(), "modCount", 0);
        setField(term216, term216.getClass(), "edges", term222);
        setField(term216, term216.getClass(), "name", "");
        setElement(term195, 2, term216);
        setDoubleField(term226, term226.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term226, term226.getClass(), "idCounter", -1955890973);
        setField(term226, term226.getClass(), "nodes", term229);
        setField(term232, term232.getClass(), "edgeMap", null);
        setField(term232, term232.getClass(), "elementData", null);
        setIntField(term232, term232.getClass(), "size", 0);
        setIntField(term232, term232.getClass(), "modCount", 0);
        setField(term226, term226.getClass(), "edges", term232);
        setField(term226, term226.getClass(), "name", "");
        setElement(term195, 3, term226);
        setDoubleField(term236, term236.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term236, term236.getClass(), "idCounter", -2038273078);
        setField(term236, term236.getClass(), "nodes", term239);
        setField(term242, term242.getClass(), "edgeMap", null);
        setField(term242, term242.getClass(), "elementData", null);
        setIntField(term242, term242.getClass(), "size", 0);
        setIntField(term242, term242.getClass(), "modCount", 0);
        setField(term236, term236.getClass(), "edges", term242);
        setField(term236, term236.getClass(), "name", "");
        setElement(term195, 4, term236);
        setField(term194, term194.getClass(), "elementData", term195);
        setIntField(term194, term194.getClass(), "elementCount", 5);
        setIntField(term194, term194.getClass(), "capacityIncrement", 0);
        setIntField(term194, term194.getClass(), "modCount", 5);
        setField(term94, term94.getClass(), "graphSequence", term194);
        setField(term249, term249.getClass(), "elementData", term250);
        setIntField(term249, term249.getClass(), "elementCount", 0);
        setIntField(term249, term249.getClass(), "capacityIncrement", 0);
        setIntField(term249, term249.getClass(), "modCount", 0);
        setField(term94, term94.getClass(), "collapseMaps", term249);
        setField(term94, term94.getClass(), "nodeWeights", term254);
        setDoubleField(term94, term94.getClass(), "reductionRate", 0.13238746331190498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.layout.GraphCoarsener");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reconstruct", argTypes, term94, args);
    }

};


