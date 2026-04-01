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

public class CycleFinder_DFSCycleVisitor_backEdge_18573838223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1283;
     Object term1299;
     Object term1324;

    public CycleFinder_DFSCycleVisitor_backEdge_18573838223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1283 = newInstance(Class.forName("org.graph4j.route.CycleFinder$DFSCycleVisitor"));
        Object term1284 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term1286 = (int[]) newIntArray(5);
        Object term1294 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1295 = (long[]) newLongArray(1);
        setIntField(term1284, term1284.getClass(), "numEdges", -838848221);
        setField(term1284, term1284.getClass(), "graph", null);
        setIntElement(term1286, 0, 1163761623);
        setIntElement(term1286, 1, 718742281);
        setIntElement(term1286, 2, 1532723756);
        setIntElement(term1286, 3, -124088550);
        setIntElement(term1286, 4, 777492093);
        setField(term1284, term1284.getClass(), "vertices", term1286);
        setIntField(term1284, term1284.getClass(), "numVertices", 1414025609);
        setIntField(term1284, term1284.getClass(), "first", 255145822);
        setField(term1294, term1294.getClass(), "words", term1295);
        setIntField(term1294, term1294.getClass(), "wordsInUse", -573608449);
        setBooleanField(term1294, term1294.getClass(), "sizeIsSticky", true);
        setField(term1284, term1284.getClass(), "bitset", term1294);
        setField(term1283, term1283.getClass(), "cycle", term1284);
        setField(term1283, term1283.getClass(), "this$0", null);
        term1299 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1304 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1309 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1314 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1319 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1299, term1299.getClass(), "component", -1660057757);
        setIntField(term1299, term1299.getClass(), "vertex", 1816273440);
        setIntField(term1299, term1299.getClass(), "level", -96541009);
        setIntField(term1299, term1299.getClass(), "order", -43719302);
        setIntField(term1304, term1304.getClass(), "component", 1024134939);
        setIntField(term1304, term1304.getClass(), "vertex", 109078154);
        setIntField(term1304, term1304.getClass(), "level", -314165467);
        setIntField(term1304, term1304.getClass(), "order", 963694071);
        setIntField(term1309, term1309.getClass(), "component", -995785731);
        setIntField(term1309, term1309.getClass(), "vertex", 1349815364);
        setIntField(term1309, term1309.getClass(), "level", 2128383340);
        setIntField(term1309, term1309.getClass(), "order", 1238598518);
        setIntField(term1314, term1314.getClass(), "component", -558146961);
        setIntField(term1314, term1314.getClass(), "vertex", 1505480070);
        setIntField(term1314, term1314.getClass(), "level", -829088844);
        setIntField(term1314, term1314.getClass(), "order", -31751777);
        setIntField(term1319, term1319.getClass(), "component", -246967963);
        setIntField(term1319, term1319.getClass(), "vertex", -1777140369);
        setIntField(term1319, term1319.getClass(), "level", 993627098);
        setIntField(term1319, term1319.getClass(), "order", 872295704);
        setField(term1319, term1319.getClass(), "parent", null);
        setField(term1314, term1314.getClass(), "parent", term1319);
        setField(term1309, term1309.getClass(), "parent", term1314);
        setField(term1304, term1304.getClass(), "parent", term1309);
        setField(term1299, term1299.getClass(), "parent", term1304);
        term1324 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1329 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1334 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1339 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1344 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1324, term1324.getClass(), "component", -47438786);
        setIntField(term1324, term1324.getClass(), "vertex", -1955400589);
        setIntField(term1324, term1324.getClass(), "level", 626179200);
        setIntField(term1324, term1324.getClass(), "order", -511077684);
        setIntField(term1329, term1329.getClass(), "component", -711507760);
        setIntField(term1329, term1329.getClass(), "vertex", 1053773809);
        setIntField(term1329, term1329.getClass(), "level", 924127883);
        setIntField(term1329, term1329.getClass(), "order", -751079123);
        setIntField(term1334, term1334.getClass(), "component", -110837188);
        setIntField(term1334, term1334.getClass(), "vertex", -271094506);
        setIntField(term1334, term1334.getClass(), "level", 455632030);
        setIntField(term1334, term1334.getClass(), "order", -1632929393);
        setIntField(term1339, term1339.getClass(), "component", -431440129);
        setIntField(term1339, term1339.getClass(), "vertex", -763576148);
        setIntField(term1339, term1339.getClass(), "level", 1568948514);
        setIntField(term1339, term1339.getClass(), "order", -1511130237);
        setIntField(term1344, term1344.getClass(), "component", 452088587);
        setIntField(term1344, term1344.getClass(), "vertex", -1630069454);
        setIntField(term1344, term1344.getClass(), "level", 1499735894);
        setIntField(term1344, term1344.getClass(), "order", 716486048);
        setField(term1344, term1344.getClass(), "parent", null);
        setField(term1339, term1339.getClass(), "parent", term1344);
        setField(term1334, term1334.getClass(), "parent", term1339);
        setField(term1329, term1329.getClass(), "parent", term1334);
        setField(term1324, term1324.getClass(), "parent", term1329);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder$DFSCycleVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term1299;
        args[1] = term1324;
        callMethod(klass, "backEdge", argTypes, term1283, args);
    }

};


