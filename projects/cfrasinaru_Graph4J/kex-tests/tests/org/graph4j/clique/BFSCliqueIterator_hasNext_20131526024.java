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

public class BFSCliqueIterator_hasNext_20131526024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439;

    public BFSCliqueIterator_hasNext_20131526024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term445 = newInstance(Class.forName("org.graph4j.clique.BFSCliqueIterator$Node"));
        Object term446 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term449 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term446, term446.getClass(), "posMap", null);
        setField(term446, term446.getClass(), "graph", null);
        setField(term446, term446.getClass(), "vertices", null);
        setIntField(term446, term446.getClass(), "numVertices", -358526505);
        setIntField(term446, term446.getClass(), "first", 1843268026);
        setField(term446, term446.getClass(), "bitset", null);
        setField(term445, term445.getClass(), "clique", term446);
        setField(term449, term449.getClass(), "posMap", null);
        setField(term449, term449.getClass(), "graph", null);
        setField(term449, term449.getClass(), "vertices", null);
        setIntField(term449, term449.getClass(), "numVertices", -648200466);
        setIntField(term449, term449.getClass(), "first", 2007134147);
        setField(term449, term449.getClass(), "bitset", null);
        setField(term445, term445.getClass(), "cand", term449);
        setField(term445, term445.getClass(), "this$0", null);
        Object term453 = newInstance(Class.forName("org.graph4j.clique.BFSCliqueIterator$Node"));
        setField(term453, term453.getClass(), "clique", null);
        setField(term453, term453.getClass(), "cand", null);
        setField(term453, term453.getClass(), "this$0", null);
        LinkedList term442 = new LinkedList();
        ((LinkedList) term442).add(term445);
        ((LinkedList) term442).add(term453);
        ((LinkedList) term442).add((Object)null);
        term439 = newInstance(Class.forName("org.graph4j.clique.BFSCliqueIterator"));
        Object term456 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term457 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term458 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term462 = (int[]) newIntArray(2);
        Object term467 = newInstance(Class.forName("java.util.BitSet"));
        long[] term468 = (long[]) newLongArray(1);
        setIntField(term439, term439.getClass(), "minSize", -1362856620);
        setIntField(term439, term439.getClass(), "maxSize", -1835839814);
        setField(term439, term439.getClass(), "queue", term442);
        setField(term457, term457.getClass(), "table", term458);
        setIntField(term457, term457.getClass(), "count", 1209799204);
        setIntField(term457, term457.getClass(), "threshold", 15);
        setFloatField(term457, term457.getClass(), "loadFactor", 0.75F);
        setField(term456, term456.getClass(), "posMap", term457);
        setField(term456, term456.getClass(), "graph", null);
        setIntElement(term462, 0, 1094107751);
        setIntElement(term462, 1, 844222656);
        setField(term456, term456.getClass(), "vertices", term462);
        setIntField(term456, term456.getClass(), "numVertices", -18216811);
        setIntField(term456, term456.getClass(), "first", -1813280137);
        setField(term467, term467.getClass(), "words", term468);
        setIntField(term467, term467.getClass(), "wordsInUse", 719656595);
        setBooleanField(term467, term467.getClass(), "sizeIsSticky", true);
        setField(term456, term456.getClass(), "bitset", term467);
        setField(term439, term439.getClass(), "currentClique", term456);
        setField(term439, term439.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.BFSCliqueIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term439, args);
    }

};


