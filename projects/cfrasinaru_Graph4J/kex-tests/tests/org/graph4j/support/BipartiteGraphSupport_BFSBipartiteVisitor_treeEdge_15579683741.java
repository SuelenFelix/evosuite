package org.graph4j.support;

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
import static org.graph4j.support.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BipartiteGraphSupport_BFSBipartiteVisitor_treeEdge_15579683741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156084;
     Object term156085;
     Object term156110;

    public BipartiteGraphSupport_BFSBipartiteVisitor_treeEdge_15579683741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156084 = newInstance(Class.forName("org.graph4j.support.BipartiteGraphSupport$BFSBipartiteVisitor"));
        setField(term156084, term156084.getClass(), "this$0", null);
        term156085 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term156090 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term156095 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term156100 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term156105 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term156085, term156085.getClass(), "component", -1286051083);
        setIntField(term156085, term156085.getClass(), "vertex", -289588624);
        setIntField(term156085, term156085.getClass(), "level", 1622716753);
        setIntField(term156085, term156085.getClass(), "order", -590550948);
        setIntField(term156090, term156090.getClass(), "component", -502837512);
        setIntField(term156090, term156090.getClass(), "vertex", 1209111872);
        setIntField(term156090, term156090.getClass(), "level", -1801979366);
        setIntField(term156090, term156090.getClass(), "order", -338340829);
        setIntField(term156095, term156095.getClass(), "component", -1089559568);
        setIntField(term156095, term156095.getClass(), "vertex", -1988630587);
        setIntField(term156095, term156095.getClass(), "level", 72578123);
        setIntField(term156095, term156095.getClass(), "order", 1222305896);
        setIntField(term156100, term156100.getClass(), "component", -571187279);
        setIntField(term156100, term156100.getClass(), "vertex", -150798513);
        setIntField(term156100, term156100.getClass(), "level", 1424280812);
        setIntField(term156100, term156100.getClass(), "order", -2043121975);
        setIntField(term156105, term156105.getClass(), "component", -590590649);
        setIntField(term156105, term156105.getClass(), "vertex", -1707397435);
        setIntField(term156105, term156105.getClass(), "level", 589185734);
        setIntField(term156105, term156105.getClass(), "order", -1523812035);
        setField(term156105, term156105.getClass(), "parent", null);
        setField(term156100, term156100.getClass(), "parent", term156105);
        setField(term156095, term156095.getClass(), "parent", term156100);
        setField(term156090, term156090.getClass(), "parent", term156095);
        setField(term156085, term156085.getClass(), "parent", term156090);
        term156110 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term156115 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term156120 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term156125 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term156130 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term156110, term156110.getClass(), "component", 1973399688);
        setIntField(term156110, term156110.getClass(), "vertex", -1835163825);
        setIntField(term156110, term156110.getClass(), "level", 1028627817);
        setIntField(term156110, term156110.getClass(), "order", 1179364729);
        setIntField(term156115, term156115.getClass(), "component", -1938207595);
        setIntField(term156115, term156115.getClass(), "vertex", 607057359);
        setIntField(term156115, term156115.getClass(), "level", -1407209832);
        setIntField(term156115, term156115.getClass(), "order", -1293654091);
        setIntField(term156120, term156120.getClass(), "component", -1448921128);
        setIntField(term156120, term156120.getClass(), "vertex", -532561175);
        setIntField(term156120, term156120.getClass(), "level", -1662801236);
        setIntField(term156120, term156120.getClass(), "order", 1300054908);
        setIntField(term156125, term156125.getClass(), "component", -872642152);
        setIntField(term156125, term156125.getClass(), "vertex", 1953951916);
        setIntField(term156125, term156125.getClass(), "level", 1147301797);
        setIntField(term156125, term156125.getClass(), "order", -1559602593);
        setIntField(term156130, term156130.getClass(), "component", 1058783996);
        setIntField(term156130, term156130.getClass(), "vertex", -1777849782);
        setIntField(term156130, term156130.getClass(), "level", 1897395752);
        setIntField(term156130, term156130.getClass(), "order", 589973778);
        setField(term156130, term156130.getClass(), "parent", null);
        setField(term156125, term156125.getClass(), "parent", term156130);
        setField(term156120, term156120.getClass(), "parent", term156125);
        setField(term156115, term156115.getClass(), "parent", term156120);
        setField(term156110, term156110.getClass(), "parent", term156115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.BipartiteGraphSupport$BFSBipartiteVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term156085;
        args[1] = term156110;
        callMethod(klass, "treeEdge", argTypes, term156084, args);
    }

};


