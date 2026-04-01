package org.graph4j.traversal;

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
import static org.graph4j.traversal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayDeque;
import java.lang.Object;

public class DFSIterator_init_20678315952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101588;

    public DFSIterator_init_20678315952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101593 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term101598 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term101593, term101593.getClass(), "component", -1660860876);
        setIntField(term101593, term101593.getClass(), "vertex", -380593610);
        setIntField(term101593, term101593.getClass(), "level", 724828471);
        setIntField(term101593, term101593.getClass(), "order", -1395142728);
        setIntField(term101598, term101598.getClass(), "component", -783988653);
        setIntField(term101598, term101598.getClass(), "vertex", 1870111253);
        setIntField(term101598, term101598.getClass(), "level", -1561622640);
        setIntField(term101598, term101598.getClass(), "order", 523331108);
        setField(term101598, term101598.getClass(), "parent", null);
        setField(term101593, term101593.getClass(), "parent", term101598);
        Object term101603 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term101608 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term101603, term101603.getClass(), "component", -969245918);
        setIntField(term101603, term101603.getClass(), "vertex", -463956795);
        setIntField(term101603, term101603.getClass(), "level", -1133440031);
        setIntField(term101603, term101603.getClass(), "order", -188396386);
        setIntField(term101608, term101608.getClass(), "component", -1632065019);
        setIntField(term101608, term101608.getClass(), "vertex", 376145605);
        setIntField(term101608, term101608.getClass(), "level", -2056990359);
        setIntField(term101608, term101608.getClass(), "order", 470753899);
        setField(term101608, term101608.getClass(), "parent", null);
        setField(term101603, term101603.getClass(), "parent", term101608);
        Object term101613 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term101613, term101613.getClass(), "component", 0);
        setIntField(term101613, term101613.getClass(), "vertex", 0);
        setIntField(term101613, term101613.getClass(), "level", 0);
        setIntField(term101613, term101613.getClass(), "order", 0);
        setField(term101613, term101613.getClass(), "parent", null);
        Object term101618 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term101623 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term101618, term101618.getClass(), "component", 341079997);
        setIntField(term101618, term101618.getClass(), "vertex", 1704594619);
        setIntField(term101618, term101618.getClass(), "level", -1621997613);
        setIntField(term101618, term101618.getClass(), "order", 194498105);
        setIntField(term101623, term101623.getClass(), "component", 228119722);
        setIntField(term101623, term101623.getClass(), "vertex", 1712935684);
        setIntField(term101623, term101623.getClass(), "level", -1167014426);
        setIntField(term101623, term101623.getClass(), "order", -1186828963);
        setField(term101623, term101623.getClass(), "parent", term101608);
        setField(term101618, term101618.getClass(), "parent", term101623);
        Object term101628 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term101633 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term101628, term101628.getClass(), "component", 614734386);
        setIntField(term101628, term101628.getClass(), "vertex", 1969128557);
        setIntField(term101628, term101628.getClass(), "level", -735661938);
        setIntField(term101628, term101628.getClass(), "order", -2094281568);
        setIntField(term101633, term101633.getClass(), "component", -1335091031);
        setIntField(term101633, term101633.getClass(), "vertex", -99232346);
        setIntField(term101633, term101633.getClass(), "level", 699136563);
        setIntField(term101633, term101633.getClass(), "order", 147252551);
        setField(term101633, term101633.getClass(), "parent", term101618);
        setField(term101628, term101628.getClass(), "parent", term101633);
        ArrayDeque term101591 = new ArrayDeque();
        ((ArrayDeque) term101591).add(term101593);
        ((ArrayDeque) term101591).add(term101603);
        ((ArrayDeque) term101591).add(term101613);
        ((ArrayDeque) term101591).add(term101593);
        ((ArrayDeque) term101591).add(term101618);
        ((ArrayDeque) term101591).add(term101628);
        term101588 = newInstance(Class.forName("org.graph4j.traversal.DFSIterator"));
        boolean[] term101640 = (boolean[]) newBooleanArray(1);
        int[] term101642 = (int[]) newIntArray(4);
        setField(term101588, term101588.getClass(), "graph", null);
        setIntField(term101588, term101588.getClass(), "numVertices", -131211631);
        setIntField(term101588, term101588.getClass(), "startVertex", 1582546878);
        setField(term101588, term101588.getClass(), "stack", term101591);
        setBooleanElement(term101640, 0, true);
        setField(term101588, term101588.getClass(), "visited", term101640);
        setIntElement(term101642, 0, -288980551);
        setIntElement(term101642, 1, 670193441);
        setIntElement(term101642, 2, 1084480415);
        setIntElement(term101642, 3, -256116824);
        setField(term101588, term101588.getClass(), "nextPos", term101642);
        setIntField(term101588, term101588.getClass(), "restartIndex", -124548665);
        setIntField(term101588, term101588.getClass(), "numIterations", 1655508317);
        setIntField(term101588, term101588.getClass(), "component", -74173370);
        setIntField(term101588, term101588.getClass(), "orderNumber", -1760304154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term101588, args);
    }

};


