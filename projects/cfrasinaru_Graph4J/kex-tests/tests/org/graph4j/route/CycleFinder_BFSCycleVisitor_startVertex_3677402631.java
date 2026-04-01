package org.graph4j.route;

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
import static org.graph4j.route.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CycleFinder_BFSCycleVisitor_startVertex_3677402631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term515;
     Object term551;

    public CycleFinder_BFSCycleVisitor_startVertex_3677402631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term515 = newInstance(Class.forName("org.graph4j.route.CycleFinder$BFSCycleVisitor"));
        Object term516 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term518 = (int[]) newIntArray(5);
        Object term526 = newInstance(Class.forName("java.util.BitSet"));
        long[] term527 = (long[]) newLongArray(1);
        Object term531 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term536 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term541 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term546 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term516, term516.getClass(), "numEdges", -1465035361);
        setField(term516, term516.getClass(), "graph", null);
        setIntElement(term518, 0, 1090617576);
        setIntElement(term518, 1, -1547384488);
        setIntElement(term518, 2, 1442160736);
        setIntElement(term518, 3, 1114000454);
        setIntElement(term518, 4, -556405712);
        setField(term516, term516.getClass(), "vertices", term518);
        setIntField(term516, term516.getClass(), "numVertices", -1772434990);
        setIntField(term516, term516.getClass(), "first", -1845499264);
        setField(term526, term526.getClass(), "words", term527);
        setIntField(term526, term526.getClass(), "wordsInUse", -505439934);
        setBooleanField(term526, term526.getClass(), "sizeIsSticky", true);
        setField(term516, term516.getClass(), "bitset", term526);
        setField(term515, term515.getClass(), "cycle", term516);
        setIntField(term531, term531.getClass(), "component", -344842608);
        setIntField(term531, term531.getClass(), "vertex", 941650513);
        setIntField(term531, term531.getClass(), "level", 444029505);
        setIntField(term531, term531.getClass(), "order", -1034506028);
        setIntField(term536, term536.getClass(), "component", -1263114719);
        setIntField(term536, term536.getClass(), "vertex", -894662986);
        setIntField(term536, term536.getClass(), "level", 304775596);
        setIntField(term536, term536.getClass(), "order", -1347665717);
        setIntField(term541, term541.getClass(), "component", -1888585309);
        setIntField(term541, term541.getClass(), "vertex", 683666002);
        setIntField(term541, term541.getClass(), "level", 1596213415);
        setIntField(term541, term541.getClass(), "order", -268815336);
        setIntField(term546, term546.getClass(), "component", -1210583429);
        setIntField(term546, term546.getClass(), "vertex", -663691365);
        setIntField(term546, term546.getClass(), "level", 339854490);
        setIntField(term546, term546.getClass(), "order", -615654495);
        setField(term546, term546.getClass(), "parent", null);
        setField(term541, term541.getClass(), "parent", term546);
        setField(term536, term536.getClass(), "parent", term541);
        setField(term531, term531.getClass(), "parent", term536);
        setField(term515, term515.getClass(), "targetNode", term531);
        setField(term515, term515.getClass(), "this$0", null);
        term551 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term556 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term561 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term566 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term571 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term551, term551.getClass(), "component", 53410913);
        setIntField(term551, term551.getClass(), "vertex", -375014958);
        setIntField(term551, term551.getClass(), "level", 1107176718);
        setIntField(term551, term551.getClass(), "order", 480137250);
        setIntField(term556, term556.getClass(), "component", -341152642);
        setIntField(term556, term556.getClass(), "vertex", -2015854073);
        setIntField(term556, term556.getClass(), "level", 538259104);
        setIntField(term556, term556.getClass(), "order", 96566506);
        setIntField(term561, term561.getClass(), "component", -343325701);
        setIntField(term561, term561.getClass(), "vertex", 107945604);
        setIntField(term561, term561.getClass(), "level", -1963464809);
        setIntField(term561, term561.getClass(), "order", 71190297);
        setIntField(term566, term566.getClass(), "component", 1202361360);
        setIntField(term566, term566.getClass(), "vertex", -2015048153);
        setIntField(term566, term566.getClass(), "level", -2063457669);
        setIntField(term566, term566.getClass(), "order", -1222006000);
        setIntField(term571, term571.getClass(), "component", 2095798786);
        setIntField(term571, term571.getClass(), "vertex", -1565502840);
        setIntField(term571, term571.getClass(), "level", 344323424);
        setIntField(term571, term571.getClass(), "order", 9726679);
        setField(term571, term571.getClass(), "parent", null);
        setField(term566, term566.getClass(), "parent", term571);
        setField(term561, term561.getClass(), "parent", term566);
        setField(term556, term556.getClass(), "parent", term561);
        setField(term551, term551.getClass(), "parent", term556);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder$BFSCycleVisitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[1];
        args[0] = term551;
        callMethod(klass, "startVertex", argTypes, term515, args);
    }

};


