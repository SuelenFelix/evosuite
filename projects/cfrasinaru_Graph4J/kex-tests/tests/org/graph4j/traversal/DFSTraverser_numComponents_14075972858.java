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
import java.lang.Object;
import java.util.ArrayDeque;

public class DFSTraverser_numComponents_14075972858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2066;

    public DFSTraverser_numComponents_14075972858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2081 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2086 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2081, term2081.getClass(), "component", 1766479154);
        setIntField(term2081, term2081.getClass(), "vertex", 533171496);
        setIntField(term2081, term2081.getClass(), "level", 1369020869);
        setIntField(term2081, term2081.getClass(), "order", -1428947021);
        setIntField(term2086, term2086.getClass(), "component", -134324004);
        setIntField(term2086, term2086.getClass(), "vertex", -1813266173);
        setIntField(term2086, term2086.getClass(), "level", -1201819537);
        setIntField(term2086, term2086.getClass(), "order", 2135922049);
        setField(term2086, term2086.getClass(), "parent", null);
        setField(term2081, term2081.getClass(), "parent", term2086);
        Object term2091 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2096 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2091, term2091.getClass(), "component", -2009434910);
        setIntField(term2091, term2091.getClass(), "vertex", -374887532);
        setIntField(term2091, term2091.getClass(), "level", -165487736);
        setIntField(term2091, term2091.getClass(), "order", -608393431);
        setIntField(term2096, term2096.getClass(), "component", 298082829);
        setIntField(term2096, term2096.getClass(), "vertex", -1494372780);
        setIntField(term2096, term2096.getClass(), "level", 703799187);
        setIntField(term2096, term2096.getClass(), "order", -1305898281);
        setField(term2096, term2096.getClass(), "parent", null);
        setField(term2091, term2091.getClass(), "parent", term2096);
        Object term2101 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2106 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2101, term2101.getClass(), "component", -291618851);
        setIntField(term2101, term2101.getClass(), "vertex", -378436487);
        setIntField(term2101, term2101.getClass(), "level", 584949609);
        setIntField(term2101, term2101.getClass(), "order", 879795058);
        setIntField(term2106, term2106.getClass(), "component", -1016087889);
        setIntField(term2106, term2106.getClass(), "vertex", 1968287557);
        setIntField(term2106, term2106.getClass(), "level", 1101385603);
        setIntField(term2106, term2106.getClass(), "order", 1980267589);
        setField(term2106, term2106.getClass(), "parent", null);
        setField(term2101, term2101.getClass(), "parent", term2106);
        ArrayDeque term2079 = new ArrayDeque();
        ((ArrayDeque) term2079).add(term2081);
        ((ArrayDeque) term2079).add(term2091);
        ((ArrayDeque) term2079).add(term2091);
        ((ArrayDeque) term2079).add(term2081);
        ((ArrayDeque) term2079).add(term2101);
        term2066 = newInstance(Class.forName("org.graph4j.traversal.DFSTraverser"));
        Object[] term2070 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 0);
        int[] term2071 = (int[]) newIntArray(6);
        boolean[] term2113 = (boolean[]) newBooleanArray(1);
        setField(term2066, term2066.getClass(), "graph", null);
        setBooleanField(term2066, term2066.getClass(), "directed", true);
        setField(term2066, term2066.getClass(), "visitor", null);
        setIntField(term2066, term2066.getClass(), "orderIndex", 1734630901);
        setIntField(term2066, term2066.getClass(), "compIndex", -703815246);
        setField(term2066, term2066.getClass(), "visited", term2070);
        setIntElement(term2071, 0, 157300746);
        setIntElement(term2071, 1, -1600748613);
        setIntElement(term2071, 2, -1509192782);
        setIntElement(term2071, 3, -867925573);
        setIntElement(term2071, 4, 478422495);
        setIntElement(term2071, 5, 1727771237);
        setField(term2066, term2066.getClass(), "nextPos", term2071);
        setIntField(term2066, term2066.getClass(), "restartIndex", 2033663549);
        setField(term2066, term2066.getClass(), "stack", term2079);
        setField(term2066, term2066.getClass(), "instack", term2113);
        setBooleanField(term2066, term2066.getClass(), "interrupted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSTraverser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "numComponents", argTypes, term2066, args);
    }

};


