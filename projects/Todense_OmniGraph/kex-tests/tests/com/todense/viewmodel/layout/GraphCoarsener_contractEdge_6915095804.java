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

public class GraphCoarsener_contractEdge_6915095804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term640;
     Object term776;

    public GraphCoarsener_contractEdge_6915095804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term644 = new ArrayList();
        HashMap term649 = new HashMap();
        ArrayList term675 = new ArrayList();
        HashMap term680 = new HashMap();
        ArrayList term705 = new ArrayList();
        HashMap term710 = new HashMap();
        LinkedList term733 = new LinkedList();
        ArrayList term736 = new ArrayList();
        ArrayList term745 = new ArrayList();
        ArrayList term755 = new ArrayList();
        HashMap term770 = new HashMap();
        term640 = newInstance(Class.forName("com.todense.viewmodel.layout.GraphCoarsener"));
        Object term641 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term648 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term654 = (Object[]) newArray("java.lang.Object", 0);
        Object term671 = newInstance(Class.forName("com.todense.viewmodel.graph.GraphManager"));
        Object term672 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term679 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term685 = (Object[]) newArray("java.lang.Object", 0);
        Object term702 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term709 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term715 = (Object[]) newArray("java.lang.Object", 0);
        Object term740 = newInstance(Class.forName("java.util.Stack"));
        Object[] term741 = (Object[]) newArray("java.lang.Object", 10);
        Object term742 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term748 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object term752 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term758 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object term765 = newInstance(Class.forName("java.util.Stack"));
        Object[] term766 = (Object[]) newArray("java.lang.Object", 10);
        setDoubleField(term641, term641.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term641, term641.getClass(), "idCounter", -1685132342);
        setField(term641, term641.getClass(), "nodes", term644);
        setField(term648, term648.getClass(), "edgeMap", term649);
        setField(term648, term648.getClass(), "elementData", term654);
        setIntField(term648, term648.getClass(), "size", 0);
        setIntField(term648, term648.getClass(), "modCount", 0);
        setField(term641, term641.getClass(), "edges", term648);
        setField(term641, term641.getClass(), "name", "UnnamedGraph");
        setField(term640, term640.getClass(), "originalGraph", term641);
        setDoubleField(term672, term672.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term672, term672.getClass(), "idCounter", 0);
        setField(term672, term672.getClass(), "nodes", term675);
        setField(term679, term679.getClass(), "edgeMap", term680);
        setField(term679, term679.getClass(), "elementData", term685);
        setIntField(term679, term679.getClass(), "size", 0);
        setIntField(term679, term679.getClass(), "modCount", 0);
        setField(term672, term672.getClass(), "edges", term679);
        setField(term672, term672.getClass(), "name", "UnnamedGraph");
        setField(term671, term671.getClass(), "graph", term672);
        setDoubleField(term702, term702.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term702, term702.getClass(), "idCounter", -1456670397);
        setField(term702, term702.getClass(), "nodes", term705);
        setField(term709, term709.getClass(), "edgeMap", term710);
        setField(term709, term709.getClass(), "elementData", term715);
        setIntField(term709, term709.getClass(), "size", 0);
        setIntField(term709, term709.getClass(), "modCount", 0);
        setField(term702, term702.getClass(), "edges", term709);
        setField(term702, term702.getClass(), "name", "UnnamedGraph");
        setField(term671, term671.getClass(), "clipboardGraph", term702);
        setBooleanField(term671, term671.getClass(), "queueGraphOperationsOn", true);
        setField(term671, term671.getClass(), "operationQueue", term733);
        setField(term671, term671.getClass(), "selectedNodes", term736);
        setField(term640, term640.getClass(), "graphManager", term671);
        setDoubleField(term742, term742.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term742, term742.getClass(), "idCounter", 1622346318);
        setField(term742, term742.getClass(), "nodes", term745);
        setField(term748, term748.getClass(), "edgeMap", null);
        setField(term748, term748.getClass(), "elementData", null);
        setIntField(term748, term748.getClass(), "size", 0);
        setIntField(term748, term748.getClass(), "modCount", 0);
        setField(term742, term742.getClass(), "edges", term748);
        setField(term742, term742.getClass(), "name", "");
        setElement(term741, 0, term742);
        setDoubleField(term752, term752.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term752, term752.getClass(), "idCounter", 1048535127);
        setField(term752, term752.getClass(), "nodes", term755);
        setField(term758, term758.getClass(), "edgeMap", null);
        setField(term758, term758.getClass(), "elementData", null);
        setIntField(term758, term758.getClass(), "size", 0);
        setIntField(term758, term758.getClass(), "modCount", 0);
        setField(term752, term752.getClass(), "edges", term758);
        setField(term752, term752.getClass(), "name", "");
        setElement(term741, 1, term752);
        setField(term740, term740.getClass(), "elementData", term741);
        setIntField(term740, term740.getClass(), "elementCount", 2);
        setIntField(term740, term740.getClass(), "capacityIncrement", 0);
        setIntField(term740, term740.getClass(), "modCount", 2);
        setField(term640, term640.getClass(), "graphSequence", term740);
        setField(term765, term765.getClass(), "elementData", term766);
        setIntField(term765, term765.getClass(), "elementCount", 0);
        setIntField(term765, term765.getClass(), "capacityIncrement", 0);
        setIntField(term765, term765.getClass(), "modCount", 0);
        setField(term640, term640.getClass(), "collapseMaps", term765);
        setField(term640, term640.getClass(), "nodeWeights", term770);
        setDoubleField(term640, term640.getClass(), "reductionRate", 0.544608645520025);
        ArrayList term779 = new ArrayList();
        HashMap term784 = new HashMap();
        term776 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term783 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term789 = (Object[]) newArray("java.lang.Object", 0);
        setDoubleField(term776, term776.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term776, term776.getClass(), "idCounter", -655067527);
        setField(term776, term776.getClass(), "nodes", term779);
        setField(term783, term783.getClass(), "edgeMap", term784);
        setField(term783, term783.getClass(), "elementData", term789);
        setIntField(term783, term783.getClass(), "size", 0);
        setIntField(term783, term783.getClass(), "modCount", 0);
        setField(term776, term776.getClass(), "edges", term783);
        setField(term776, term776.getClass(), "name", "UnnamedGraph");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.layout.GraphCoarsener");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.todense.model.graph.Graph");
        argTypes[1] = Class.forName("com.todense.model.graph.Edge");
        Object[] args = new Object[2];
        args[0] = term776;
        args[1] = null;
        callMethod(klass, "contractEdge", argTypes, term640, args);
    }

};


