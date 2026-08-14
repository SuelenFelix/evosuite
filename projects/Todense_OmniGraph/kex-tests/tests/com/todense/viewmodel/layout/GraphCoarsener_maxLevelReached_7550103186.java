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

public class GraphCoarsener_maxLevelReached_7550103186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1076;

    public GraphCoarsener_maxLevelReached_7550103186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1080 = new ArrayList();
        HashMap term1085 = new HashMap();
        ArrayList term1111 = new ArrayList();
        HashMap term1116 = new HashMap();
        ArrayList term1141 = new ArrayList();
        HashMap term1146 = new HashMap();
        LinkedList term1169 = new LinkedList();
        ArrayList term1172 = new ArrayList();
        ArrayList term1181 = new ArrayList();
        ArrayList term1191 = new ArrayList();
        ArrayList term1201 = new ArrayList();
        ArrayList term1211 = new ArrayList();
        ArrayList term1221 = new ArrayList();
        ArrayList term1231 = new ArrayList();
        HashMap term1246 = new HashMap();
        term1076 = newInstance(Class.forName("com.todense.viewmodel.layout.GraphCoarsener"));
        Object term1077 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term1084 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term1090 = (Object[]) newArray("java.lang.Object", 0);
        Object term1107 = newInstance(Class.forName("com.todense.viewmodel.graph.GraphManager"));
        Object term1108 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term1115 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term1121 = (Object[]) newArray("java.lang.Object", 0);
        Object term1138 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term1145 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object[] term1151 = (Object[]) newArray("java.lang.Object", 0);
        Object term1176 = newInstance(Class.forName("java.util.Stack"));
        Object[] term1177 = (Object[]) newArray("java.lang.Object", 10);
        Object term1178 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term1184 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object term1188 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term1194 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object term1198 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term1204 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object term1208 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term1214 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object term1218 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term1224 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object term1228 = newInstance(Class.forName("com.todense.model.graph.Graph"));
        Object term1234 = newInstance(Class.forName("com.todense.model.EdgeList"));
        Object term1241 = newInstance(Class.forName("java.util.Stack"));
        Object[] term1242 = (Object[]) newArray("java.lang.Object", 10);
        setDoubleField(term1077, term1077.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term1077, term1077.getClass(), "idCounter", -203030934);
        setField(term1077, term1077.getClass(), "nodes", term1080);
        setField(term1084, term1084.getClass(), "edgeMap", term1085);
        setField(term1084, term1084.getClass(), "elementData", term1090);
        setIntField(term1084, term1084.getClass(), "size", 0);
        setIntField(term1084, term1084.getClass(), "modCount", 0);
        setField(term1077, term1077.getClass(), "edges", term1084);
        setField(term1077, term1077.getClass(), "name", "UnnamedGraph");
        setField(term1076, term1076.getClass(), "originalGraph", term1077);
        setDoubleField(term1108, term1108.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term1108, term1108.getClass(), "idCounter", 0);
        setField(term1108, term1108.getClass(), "nodes", term1111);
        setField(term1115, term1115.getClass(), "edgeMap", term1116);
        setField(term1115, term1115.getClass(), "elementData", term1121);
        setIntField(term1115, term1115.getClass(), "size", 0);
        setIntField(term1115, term1115.getClass(), "modCount", 0);
        setField(term1108, term1108.getClass(), "edges", term1115);
        setField(term1108, term1108.getClass(), "name", "UnnamedGraph");
        setField(term1107, term1107.getClass(), "graph", term1108);
        setDoubleField(term1138, term1138.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term1138, term1138.getClass(), "idCounter", -1179120542);
        setField(term1138, term1138.getClass(), "nodes", term1141);
        setField(term1145, term1145.getClass(), "edgeMap", term1146);
        setField(term1145, term1145.getClass(), "elementData", term1151);
        setIntField(term1145, term1145.getClass(), "size", 0);
        setIntField(term1145, term1145.getClass(), "modCount", 0);
        setField(term1138, term1138.getClass(), "edges", term1145);
        setField(term1138, term1138.getClass(), "name", "UnnamedGraph");
        setField(term1107, term1107.getClass(), "clipboardGraph", term1138);
        setBooleanField(term1107, term1107.getClass(), "queueGraphOperationsOn", true);
        setField(term1107, term1107.getClass(), "operationQueue", term1169);
        setField(term1107, term1107.getClass(), "selectedNodes", term1172);
        setField(term1076, term1076.getClass(), "graphManager", term1107);
        setDoubleField(term1178, term1178.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term1178, term1178.getClass(), "idCounter", -73683645);
        setField(term1178, term1178.getClass(), "nodes", term1181);
        setField(term1184, term1184.getClass(), "edgeMap", null);
        setField(term1184, term1184.getClass(), "elementData", null);
        setIntField(term1184, term1184.getClass(), "size", 0);
        setIntField(term1184, term1184.getClass(), "modCount", 0);
        setField(term1178, term1178.getClass(), "edges", term1184);
        setField(term1178, term1178.getClass(), "name", "");
        setElement(term1177, 0, term1178);
        setDoubleField(term1188, term1188.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term1188, term1188.getClass(), "idCounter", -226514366);
        setField(term1188, term1188.getClass(), "nodes", term1191);
        setField(term1194, term1194.getClass(), "edgeMap", null);
        setField(term1194, term1194.getClass(), "elementData", null);
        setIntField(term1194, term1194.getClass(), "size", 0);
        setIntField(term1194, term1194.getClass(), "modCount", 0);
        setField(term1188, term1188.getClass(), "edges", term1194);
        setField(term1188, term1188.getClass(), "name", "");
        setElement(term1177, 1, term1188);
        setDoubleField(term1198, term1198.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term1198, term1198.getClass(), "idCounter", 1193880199);
        setField(term1198, term1198.getClass(), "nodes", term1201);
        setField(term1204, term1204.getClass(), "edgeMap", null);
        setField(term1204, term1204.getClass(), "elementData", null);
        setIntField(term1204, term1204.getClass(), "size", 0);
        setIntField(term1204, term1204.getClass(), "modCount", 0);
        setField(term1198, term1198.getClass(), "edges", term1204);
        setField(term1198, term1198.getClass(), "name", "");
        setElement(term1177, 2, term1198);
        setDoubleField(term1208, term1208.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term1208, term1208.getClass(), "idCounter", -1087774327);
        setField(term1208, term1208.getClass(), "nodes", term1211);
        setField(term1214, term1214.getClass(), "edgeMap", null);
        setField(term1214, term1214.getClass(), "elementData", null);
        setIntField(term1214, term1214.getClass(), "size", 0);
        setIntField(term1214, term1214.getClass(), "modCount", 0);
        setField(term1208, term1208.getClass(), "edges", term1214);
        setField(term1208, term1208.getClass(), "name", "");
        setElement(term1177, 3, term1208);
        setDoubleField(term1218, term1218.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term1218, term1218.getClass(), "idCounter", -1530420153);
        setField(term1218, term1218.getClass(), "nodes", term1221);
        setField(term1224, term1224.getClass(), "edgeMap", null);
        setField(term1224, term1224.getClass(), "elementData", null);
        setIntField(term1224, term1224.getClass(), "size", 0);
        setIntField(term1224, term1224.getClass(), "modCount", 0);
        setField(term1218, term1218.getClass(), "edges", term1224);
        setField(term1218, term1218.getClass(), "name", "");
        setElement(term1177, 4, term1218);
        setDoubleField(term1228, term1228.getClass(), "MAX_NODE_POSITION_MAGNITUDE", 1.0E20);
        setIntField(term1228, term1228.getClass(), "idCounter", -469968304);
        setField(term1228, term1228.getClass(), "nodes", term1231);
        setField(term1234, term1234.getClass(), "edgeMap", null);
        setField(term1234, term1234.getClass(), "elementData", null);
        setIntField(term1234, term1234.getClass(), "size", 0);
        setIntField(term1234, term1234.getClass(), "modCount", 0);
        setField(term1228, term1228.getClass(), "edges", term1234);
        setField(term1228, term1228.getClass(), "name", "");
        setElement(term1177, 5, term1228);
        setField(term1176, term1176.getClass(), "elementData", term1177);
        setIntField(term1176, term1176.getClass(), "elementCount", 6);
        setIntField(term1176, term1176.getClass(), "capacityIncrement", 0);
        setIntField(term1176, term1176.getClass(), "modCount", 6);
        setField(term1076, term1076.getClass(), "graphSequence", term1176);
        setField(term1241, term1241.getClass(), "elementData", term1242);
        setIntField(term1241, term1241.getClass(), "elementCount", 0);
        setIntField(term1241, term1241.getClass(), "capacityIncrement", 0);
        setIntField(term1241, term1241.getClass(), "modCount", 0);
        setField(term1076, term1076.getClass(), "collapseMaps", term1241);
        setField(term1076, term1076.getClass(), "nodeWeights", term1246);
        setDoubleField(term1076, term1076.getClass(), "reductionRate", 0.40176586625454525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.layout.GraphCoarsener");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "maxLevelReached", argTypes, term1076, args);
    }

};


