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

public class CycleFinder_BFSCycleVisitor_analyze_4138952154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term760;
     Object term795;

    public CycleFinder_BFSCycleVisitor_analyze_4138952154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term760 = newInstance(Class.forName("org.graph4j.route.CycleFinder$BFSCycleVisitor"));
        Object term761 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term763 = (int[]) newIntArray(4);
        Object term770 = newInstance(Class.forName("java.util.BitSet"));
        long[] term771 = (long[]) newLongArray(1);
        Object term775 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term780 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term785 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term790 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term761, term761.getClass(), "numEdges", 1334483645);
        setField(term761, term761.getClass(), "graph", null);
        setIntElement(term763, 0, 917513193);
        setIntElement(term763, 1, 787278105);
        setIntElement(term763, 2, -2063843486);
        setIntElement(term763, 3, 833762980);
        setField(term761, term761.getClass(), "vertices", term763);
        setIntField(term761, term761.getClass(), "numVertices", 320711637);
        setIntField(term761, term761.getClass(), "first", 1241164745);
        setField(term770, term770.getClass(), "words", term771);
        setIntField(term770, term770.getClass(), "wordsInUse", 1723148410);
        setBooleanField(term770, term770.getClass(), "sizeIsSticky", true);
        setField(term761, term761.getClass(), "bitset", term770);
        setField(term760, term760.getClass(), "cycle", term761);
        setIntField(term775, term775.getClass(), "component", -920797484);
        setIntField(term775, term775.getClass(), "vertex", -1631697577);
        setIntField(term775, term775.getClass(), "level", 765731371);
        setIntField(term775, term775.getClass(), "order", -1703035419);
        setIntField(term780, term780.getClass(), "component", 765766290);
        setIntField(term780, term780.getClass(), "vertex", -1284825282);
        setIntField(term780, term780.getClass(), "level", -1941343035);
        setIntField(term780, term780.getClass(), "order", 947897214);
        setIntField(term785, term785.getClass(), "component", 1496340209);
        setIntField(term785, term785.getClass(), "vertex", -1748391876);
        setIntField(term785, term785.getClass(), "level", 43258317);
        setIntField(term785, term785.getClass(), "order", 1707220033);
        setIntField(term790, term790.getClass(), "component", -1792504217);
        setIntField(term790, term790.getClass(), "vertex", 1824538861);
        setIntField(term790, term790.getClass(), "level", 499519708);
        setIntField(term790, term790.getClass(), "order", 1501165033);
        setField(term790, term790.getClass(), "parent", null);
        setField(term785, term785.getClass(), "parent", term790);
        setField(term780, term780.getClass(), "parent", term785);
        setField(term775, term775.getClass(), "parent", term780);
        setField(term760, term760.getClass(), "targetNode", term775);
        setField(term760, term760.getClass(), "this$0", null);
        term795 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term797 = (int[]) newIntArray(1);
        Object term801 = newInstance(Class.forName("java.util.BitSet"));
        long[] term802 = (long[]) newLongArray(1);
        setIntField(term795, term795.getClass(), "numEdges", -423900705);
        setField(term795, term795.getClass(), "graph", null);
        setIntElement(term797, 0, -525570815);
        setField(term795, term795.getClass(), "vertices", term797);
        setIntField(term795, term795.getClass(), "numVertices", 754055848);
        setIntField(term795, term795.getClass(), "first", -19246901);
        setField(term801, term801.getClass(), "words", term802);
        setIntField(term801, term801.getClass(), "wordsInUse", -370828664);
        setBooleanField(term801, term801.getClass(), "sizeIsSticky", false);
        setField(term795, term795.getClass(), "bitset", term801);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder$BFSCycleVisitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.Cycle");
        Object[] args = new Object[1];
        args[0] = term795;
        callMethod(klass, "analyze", argTypes, term760, args);
    }

};


