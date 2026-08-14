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

public class CycleFinder_DFSCycleVisitor_treeEdge_6939514652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1211;
     Object term1227;
     Object term1252;

    public CycleFinder_DFSCycleVisitor_treeEdge_6939514652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1211 = newInstance(Class.forName("org.graph4j.route.CycleFinder$DFSCycleVisitor"));
        Object term1212 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term1214 = (int[]) newIntArray(5);
        Object term1222 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1223 = (long[]) newLongArray(1);
        setIntField(term1212, term1212.getClass(), "numEdges", 895255351);
        setField(term1212, term1212.getClass(), "graph", null);
        setIntElement(term1214, 0, -1317044799);
        setIntElement(term1214, 1, -1428063820);
        setIntElement(term1214, 2, -1271375703);
        setIntElement(term1214, 3, 1136208236);
        setIntElement(term1214, 4, -1220630391);
        setField(term1212, term1212.getClass(), "vertices", term1214);
        setIntField(term1212, term1212.getClass(), "numVertices", -995822131);
        setIntField(term1212, term1212.getClass(), "first", -687282231);
        setField(term1222, term1222.getClass(), "words", term1223);
        setIntField(term1222, term1222.getClass(), "wordsInUse", 1200440315);
        setBooleanField(term1222, term1222.getClass(), "sizeIsSticky", true);
        setField(term1212, term1212.getClass(), "bitset", term1222);
        setField(term1211, term1211.getClass(), "cycle", term1212);
        setField(term1211, term1211.getClass(), "this$0", null);
        term1227 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1232 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1237 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1242 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1247 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1227, term1227.getClass(), "component", 40571662);
        setIntField(term1227, term1227.getClass(), "vertex", 1863910269);
        setIntField(term1227, term1227.getClass(), "level", 864645689);
        setIntField(term1227, term1227.getClass(), "order", 279384872);
        setIntField(term1232, term1232.getClass(), "component", 1427305953);
        setIntField(term1232, term1232.getClass(), "vertex", -781832877);
        setIntField(term1232, term1232.getClass(), "level", 797203987);
        setIntField(term1232, term1232.getClass(), "order", 1973060703);
        setIntField(term1237, term1237.getClass(), "component", -138239905);
        setIntField(term1237, term1237.getClass(), "vertex", 1709474063);
        setIntField(term1237, term1237.getClass(), "level", 1406617209);
        setIntField(term1237, term1237.getClass(), "order", 1706047059);
        setIntField(term1242, term1242.getClass(), "component", 590451710);
        setIntField(term1242, term1242.getClass(), "vertex", -1999787419);
        setIntField(term1242, term1242.getClass(), "level", -1224443634);
        setIntField(term1242, term1242.getClass(), "order", 1048451946);
        setIntField(term1247, term1247.getClass(), "component", 5603560);
        setIntField(term1247, term1247.getClass(), "vertex", -1079020032);
        setIntField(term1247, term1247.getClass(), "level", -1973791064);
        setIntField(term1247, term1247.getClass(), "order", -2072158633);
        setField(term1247, term1247.getClass(), "parent", null);
        setField(term1242, term1242.getClass(), "parent", term1247);
        setField(term1237, term1237.getClass(), "parent", term1242);
        setField(term1232, term1232.getClass(), "parent", term1237);
        setField(term1227, term1227.getClass(), "parent", term1232);
        term1252 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1257 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1262 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1267 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1272 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1252, term1252.getClass(), "component", 1862191391);
        setIntField(term1252, term1252.getClass(), "vertex", 1131398807);
        setIntField(term1252, term1252.getClass(), "level", -344907703);
        setIntField(term1252, term1252.getClass(), "order", 824341437);
        setIntField(term1257, term1257.getClass(), "component", -1794965320);
        setIntField(term1257, term1257.getClass(), "vertex", 520504102);
        setIntField(term1257, term1257.getClass(), "level", -457396133);
        setIntField(term1257, term1257.getClass(), "order", -1793950607);
        setIntField(term1262, term1262.getClass(), "component", 1091954101);
        setIntField(term1262, term1262.getClass(), "vertex", 1895143076);
        setIntField(term1262, term1262.getClass(), "level", 1981860404);
        setIntField(term1262, term1262.getClass(), "order", 732174235);
        setIntField(term1267, term1267.getClass(), "component", 470895808);
        setIntField(term1267, term1267.getClass(), "vertex", 1787325291);
        setIntField(term1267, term1267.getClass(), "level", 1470349147);
        setIntField(term1267, term1267.getClass(), "order", -255317272);
        setIntField(term1272, term1272.getClass(), "component", -706253892);
        setIntField(term1272, term1272.getClass(), "vertex", -1341439819);
        setIntField(term1272, term1272.getClass(), "level", -728760750);
        setIntField(term1272, term1272.getClass(), "order", -1617383807);
        setField(term1272, term1272.getClass(), "parent", null);
        setField(term1267, term1267.getClass(), "parent", term1272);
        setField(term1262, term1262.getClass(), "parent", term1267);
        setField(term1257, term1257.getClass(), "parent", term1262);
        setField(term1252, term1252.getClass(), "parent", term1257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder$DFSCycleVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term1227;
        args[1] = term1252;
        callMethod(klass, "treeEdge", argTypes, term1211, args);
    }

};


