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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Integer;

public class BFSCliqueIterator_neighbors_14247238732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349;
     Object term384;
     Object term386;

    public BFSCliqueIterator_neighbors_14247238732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term355 = newInstance(Class.forName("org.graph4j.clique.BFSCliqueIterator$Node"));
        Object term356 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term359 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term356, term356.getClass(), "posMap", null);
        setField(term356, term356.getClass(), "graph", null);
        setField(term356, term356.getClass(), "vertices", null);
        setIntField(term356, term356.getClass(), "numVertices", 197109649);
        setIntField(term356, term356.getClass(), "first", -1239406390);
        setField(term356, term356.getClass(), "bitset", null);
        setField(term355, term355.getClass(), "clique", term356);
        setField(term359, term359.getClass(), "posMap", null);
        setField(term359, term359.getClass(), "graph", null);
        setField(term359, term359.getClass(), "vertices", null);
        setIntField(term359, term359.getClass(), "numVertices", -1896376975);
        setIntField(term359, term359.getClass(), "first", 729658803);
        setField(term359, term359.getClass(), "bitset", null);
        setField(term355, term355.getClass(), "cand", term359);
        setField(term355, term355.getClass(), "this$0", null);
        Object term363 = newInstance(Class.forName("org.graph4j.clique.BFSCliqueIterator$Node"));
        setField(term363, term363.getClass(), "clique", null);
        setField(term363, term363.getClass(), "cand", null);
        setField(term363, term363.getClass(), "this$0", null);
        LinkedList term352 = new LinkedList();
        ((LinkedList) term352).add(term355);
        ((LinkedList) term352).add(term363);
        ((LinkedList) term352).add((Object)null);
        ((LinkedList) term352).add((Object)null);
        ((LinkedList) term352).add((Object)null);
        term349 = newInstance(Class.forName("org.graph4j.clique.BFSCliqueIterator"));
        Object term376 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term377 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term378 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setIntField(term349, term349.getClass(), "minSize", 1041916673);
        setIntField(term349, term349.getClass(), "maxSize", -601863069);
        setField(term349, term349.getClass(), "queue", term352);
        setField(term377, term377.getClass(), "table", term378);
        setIntField(term377, term377.getClass(), "count", 0);
        setIntField(term377, term377.getClass(), "threshold", 15);
        setFloatField(term377, term377.getClass(), "loadFactor", 0.75F);
        setField(term376, term376.getClass(), "posMap", term377);
        setField(term376, term376.getClass(), "graph", null);
        setField(term376, term376.getClass(), "vertices", null);
        setIntField(term376, term376.getClass(), "numVertices", 0);
        setIntField(term376, term376.getClass(), "first", 0);
        setField(term376, term376.getClass(), "bitset", null);
        setField(term349, term349.getClass(), "currentClique", term376);
        setField(term349, term349.getClass(), "graph", null);
        term384 = new Integer(-1476644457);
        term386 = (int[]) newIntArray(8);
        setIntElement(term386, 0, 1270666529);
        setIntElement(term386, 1, -1146679443);
        setIntElement(term386, 2, -860131894);
        setIntElement(term386, 3, -1022990421);
        setIntElement(term386, 4, 1045547089);
        setIntElement(term386, 5, -1122880881);
        setIntElement(term386, 6, -542712742);
        setIntElement(term386, 7, -1254072822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.BFSCliqueIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term384;
        args[1] = term386;
        callMethod(klass, "neighbors", argTypes, term349, args);
    }

};


