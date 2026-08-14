package org.graph4j.clique;

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
import static org.graph4j.clique.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayDeque;

public class BronKerboschCliqueIterator_hasNext_20499504993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term663;

    public BronKerboschCliqueIterator_hasNext_20499504993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term674 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueIterator$Node"));
        Object term675 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term678 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term681 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term675, term675.getClass(), "posMap", null);
        setField(term675, term675.getClass(), "graph", null);
        setField(term675, term675.getClass(), "vertices", null);
        setIntField(term675, term675.getClass(), "numVertices", -1252345779);
        setIntField(term675, term675.getClass(), "first", -2063365430);
        setField(term675, term675.getClass(), "bitset", null);
        setField(term674, term674.getClass(), "subg", term675);
        setField(term678, term678.getClass(), "posMap", null);
        setField(term678, term678.getClass(), "graph", null);
        setField(term678, term678.getClass(), "vertices", null);
        setIntField(term678, term678.getClass(), "numVertices", 202214133);
        setIntField(term678, term678.getClass(), "first", 1543091617);
        setField(term678, term678.getClass(), "bitset", null);
        setField(term674, term674.getClass(), "cand", term678);
        setField(term681, term681.getClass(), "posMap", null);
        setField(term681, term681.getClass(), "graph", null);
        setField(term681, term681.getClass(), "vertices", null);
        setIntField(term681, term681.getClass(), "numVertices", -1549607466);
        setIntField(term681, term681.getClass(), "first", 853609788);
        setField(term681, term681.getClass(), "bitset", null);
        setField(term674, term674.getClass(), "ext", term681);
        setField(term674, term674.getClass(), "this$0", null);
        Object term684 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueIterator$Node"));
        Object term685 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term688 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term691 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term685, term685.getClass(), "posMap", null);
        setField(term685, term685.getClass(), "graph", null);
        setField(term685, term685.getClass(), "vertices", null);
        setIntField(term685, term685.getClass(), "numVertices", 897010381);
        setIntField(term685, term685.getClass(), "first", -15712667);
        setField(term685, term685.getClass(), "bitset", null);
        setField(term684, term684.getClass(), "subg", term685);
        setField(term688, term688.getClass(), "posMap", null);
        setField(term688, term688.getClass(), "graph", null);
        setField(term688, term688.getClass(), "vertices", null);
        setIntField(term688, term688.getClass(), "numVertices", 319853052);
        setIntField(term688, term688.getClass(), "first", -1097563716);
        setField(term688, term688.getClass(), "bitset", null);
        setField(term684, term684.getClass(), "cand", term688);
        setField(term691, term691.getClass(), "posMap", null);
        setField(term691, term691.getClass(), "graph", null);
        setField(term691, term691.getClass(), "vertices", null);
        setIntField(term691, term691.getClass(), "numVertices", 1126618861);
        setIntField(term691, term691.getClass(), "first", 947449400);
        setField(term691, term691.getClass(), "bitset", null);
        setField(term684, term684.getClass(), "ext", term691);
        setField(term684, term684.getClass(), "this$0", null);
        Object term694 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueIterator$Node"));
        Object term695 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term698 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term701 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term695, term695.getClass(), "posMap", null);
        setField(term695, term695.getClass(), "graph", null);
        setField(term695, term695.getClass(), "vertices", null);
        setIntField(term695, term695.getClass(), "numVertices", -695279311);
        setIntField(term695, term695.getClass(), "first", 114279242);
        setField(term695, term695.getClass(), "bitset", null);
        setField(term694, term694.getClass(), "subg", term695);
        setField(term698, term698.getClass(), "posMap", null);
        setField(term698, term698.getClass(), "graph", null);
        setField(term698, term698.getClass(), "vertices", null);
        setIntField(term698, term698.getClass(), "numVertices", 0);
        setIntField(term698, term698.getClass(), "first", 0);
        setField(term698, term698.getClass(), "bitset", null);
        setField(term694, term694.getClass(), "cand", term698);
        setField(term701, term701.getClass(), "posMap", null);
        setField(term701, term701.getClass(), "graph", null);
        setField(term701, term701.getClass(), "vertices", null);
        setIntField(term701, term701.getClass(), "numVertices", 0);
        setIntField(term701, term701.getClass(), "first", 0);
        setField(term701, term701.getClass(), "bitset", null);
        setField(term694, term694.getClass(), "ext", term701);
        setField(term694, term694.getClass(), "this$0", null);
        Object term704 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueIterator$Node"));
        Object term705 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term705, term705.getClass(), "posMap", null);
        setField(term705, term705.getClass(), "graph", null);
        setField(term705, term705.getClass(), "vertices", null);
        setIntField(term705, term705.getClass(), "numVertices", 0);
        setIntField(term705, term705.getClass(), "first", 0);
        setField(term705, term705.getClass(), "bitset", null);
        setField(term704, term704.getClass(), "subg", term705);
        setField(term704, term704.getClass(), "cand", term698);
        setField(term704, term704.getClass(), "ext", term701);
        setField(term704, term704.getClass(), "this$0", null);
        Object term708 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueIterator$Node"));
        setField(term708, term708.getClass(), "subg", term675);
        setField(term708, term708.getClass(), "cand", term691);
        setField(term708, term708.getClass(), "ext", term685);
        setField(term708, term708.getClass(), "this$0", null);
        Object term709 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueIterator$Node"));
        setField(term709, term709.getClass(), "subg", term678);
        setField(term709, term709.getClass(), "cand", term678);
        setField(term709, term709.getClass(), "ext", term705);
        setField(term709, term709.getClass(), "this$0", null);
        Object term710 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueIterator$Node"));
        setField(term710, term710.getClass(), "subg", term698);
        setField(term710, term710.getClass(), "cand", term698);
        setField(term710, term710.getClass(), "ext", term688);
        setField(term710, term710.getClass(), "this$0", null);
        ArrayDeque term672 = new ArrayDeque();
        ((ArrayDeque) term672).add(term674);
        ((ArrayDeque) term672).add(term684);
        ((ArrayDeque) term672).add(term694);
        ((ArrayDeque) term672).add(term704);
        ((ArrayDeque) term672).add(term708);
        ((ArrayDeque) term672).add(term709);
        ((ArrayDeque) term672).add(term710);
        term663 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueIterator"));
        Object[] term664 = (Object[]) newArray("[I", 1);
        int[] term665 = (int[]) newIntArray(6);
        Object term713 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term714 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term715 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        Object term721 = newInstance(Class.forName("org.graph4j.util.Clique"));
        setIntElement(term665, 0, 1887772522);
        setIntElement(term665, 1, 354196060);
        setIntElement(term665, 2, -1840305774);
        setIntElement(term665, 3, 1365087144);
        setIntElement(term665, 4, -1537255112);
        setIntElement(term665, 5, 934477462);
        setElement(term664, 0, term665);
        setField(term663, term663.getClass(), "adjMatrix", term664);
        setField(term663, term663.getClass(), "stack", term672);
        setField(term714, term714.getClass(), "table", term715);
        setIntField(term714, term714.getClass(), "count", 0);
        setIntField(term714, term714.getClass(), "threshold", 15);
        setFloatField(term714, term714.getClass(), "loadFactor", 0.75F);
        setField(term713, term713.getClass(), "posMap", term714);
        setField(term713, term713.getClass(), "graph", null);
        setField(term713, term713.getClass(), "vertices", null);
        setIntField(term713, term713.getClass(), "numVertices", 0);
        setIntField(term713, term713.getClass(), "first", 0);
        setField(term713, term713.getClass(), "bitset", null);
        setField(term663, term663.getClass(), "workingClique", term713);
        setField(term721, term721.getClass(), "posMap", null);
        setField(term721, term721.getClass(), "graph", null);
        setField(term721, term721.getClass(), "vertices", null);
        setIntField(term721, term721.getClass(), "numVertices", 0);
        setIntField(term721, term721.getClass(), "first", 0);
        setField(term721, term721.getClass(), "bitset", null);
        setField(term663, term663.getClass(), "currentClique", term721);
        setField(term663, term663.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.BronKerboschCliqueIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term663, args);
    }

};


