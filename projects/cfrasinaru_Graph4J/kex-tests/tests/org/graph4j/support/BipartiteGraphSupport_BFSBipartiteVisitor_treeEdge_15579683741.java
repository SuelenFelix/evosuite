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
     Object term6059;
     Object term6060;
     Object term6085;

    public BipartiteGraphSupport_BFSBipartiteVisitor_treeEdge_15579683741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6059 = newInstance(Class.forName("org.graph4j.support.BipartiteGraphSupport$BFSBipartiteVisitor"));
        setField(term6059, term6059.getClass(), "this$0", null);
        term6060 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term6065 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term6070 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term6075 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term6080 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term6060, term6060.getClass(), "component", 1713005479);
        setIntField(term6060, term6060.getClass(), "vertex", -1948910444);
        setIntField(term6060, term6060.getClass(), "level", -1099061955);
        setIntField(term6060, term6060.getClass(), "order", -1672904007);
        setIntField(term6065, term6065.getClass(), "component", -217232010);
        setIntField(term6065, term6065.getClass(), "vertex", 2053372601);
        setIntField(term6065, term6065.getClass(), "level", -1828855069);
        setIntField(term6065, term6065.getClass(), "order", -1213694931);
        setIntField(term6070, term6070.getClass(), "component", -1255656944);
        setIntField(term6070, term6070.getClass(), "vertex", -377697034);
        setIntField(term6070, term6070.getClass(), "level", 1102778743);
        setIntField(term6070, term6070.getClass(), "order", 1300928519);
        setIntField(term6075, term6075.getClass(), "component", 338172676);
        setIntField(term6075, term6075.getClass(), "vertex", -1896960942);
        setIntField(term6075, term6075.getClass(), "level", -935912608);
        setIntField(term6075, term6075.getClass(), "order", 505087197);
        setIntField(term6080, term6080.getClass(), "component", 427005798);
        setIntField(term6080, term6080.getClass(), "vertex", -993454505);
        setIntField(term6080, term6080.getClass(), "level", -238353821);
        setIntField(term6080, term6080.getClass(), "order", -818992228);
        setField(term6080, term6080.getClass(), "parent", null);
        setField(term6075, term6075.getClass(), "parent", term6080);
        setField(term6070, term6070.getClass(), "parent", term6075);
        setField(term6065, term6065.getClass(), "parent", term6070);
        setField(term6060, term6060.getClass(), "parent", term6065);
        term6085 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term6090 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term6095 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term6100 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term6105 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term6085, term6085.getClass(), "component", -748022064);
        setIntField(term6085, term6085.getClass(), "vertex", -1745708025);
        setIntField(term6085, term6085.getClass(), "level", 790614624);
        setIntField(term6085, term6085.getClass(), "order", 117387225);
        setIntField(term6090, term6090.getClass(), "component", 948347134);
        setIntField(term6090, term6090.getClass(), "vertex", -1552842218);
        setIntField(term6090, term6090.getClass(), "level", -157220068);
        setIntField(term6090, term6090.getClass(), "order", 141434141);
        setIntField(term6095, term6095.getClass(), "component", -288619829);
        setIntField(term6095, term6095.getClass(), "vertex", -505635206);
        setIntField(term6095, term6095.getClass(), "level", 932246615);
        setIntField(term6095, term6095.getClass(), "order", 261281668);
        setIntField(term6100, term6100.getClass(), "component", 1712273163);
        setIntField(term6100, term6100.getClass(), "vertex", 234306621);
        setIntField(term6100, term6100.getClass(), "level", 1025525602);
        setIntField(term6100, term6100.getClass(), "order", 1669406334);
        setIntField(term6105, term6105.getClass(), "component", -780862464);
        setIntField(term6105, term6105.getClass(), "vertex", 2014099129);
        setIntField(term6105, term6105.getClass(), "level", -1024382698);
        setIntField(term6105, term6105.getClass(), "order", -168406824);
        setField(term6105, term6105.getClass(), "parent", null);
        setField(term6100, term6100.getClass(), "parent", term6105);
        setField(term6095, term6095.getClass(), "parent", term6100);
        setField(term6090, term6090.getClass(), "parent", term6095);
        setField(term6085, term6085.getClass(), "parent", term6090);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.BipartiteGraphSupport$BFSBipartiteVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term6060;
        args[1] = term6085;
        callMethod(klass, "treeEdge", argTypes, term6059, args);
    }

};


