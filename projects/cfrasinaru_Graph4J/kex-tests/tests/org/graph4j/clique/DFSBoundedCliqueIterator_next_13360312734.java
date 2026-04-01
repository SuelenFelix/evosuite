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
import java.util.ArrayDeque;
import java.lang.Object;

public class DFSBoundedCliqueIterator_next_13360312734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1582;

    public DFSBoundedCliqueIterator_next_13360312734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1589 = newInstance(Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator$Node"));
        Object term1590 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term1593 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term1590, term1590.getClass(), "posMap", null);
        setField(term1590, term1590.getClass(), "graph", null);
        setField(term1590, term1590.getClass(), "vertices", null);
        setIntField(term1590, term1590.getClass(), "numVertices", 1782600602);
        setIntField(term1590, term1590.getClass(), "first", -185892708);
        setField(term1590, term1590.getClass(), "bitset", null);
        setField(term1589, term1589.getClass(), "clique", term1590);
        setField(term1593, term1593.getClass(), "posMap", null);
        setField(term1593, term1593.getClass(), "graph", null);
        setField(term1593, term1593.getClass(), "vertices", null);
        setIntField(term1593, term1593.getClass(), "numVertices", 593962063);
        setIntField(term1593, term1593.getClass(), "first", -1485826786);
        setField(term1593, term1593.getClass(), "bitset", null);
        setField(term1589, term1589.getClass(), "cand", term1593);
        setDoubleField(term1589, term1589.getClass(), "weight", 0.36923381893433327);
        setField(term1589, term1589.getClass(), "this$0", null);
        Object term1597 = newInstance(Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator$Node"));
        Object term1598 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term1601 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term1598, term1598.getClass(), "posMap", null);
        setField(term1598, term1598.getClass(), "graph", null);
        setField(term1598, term1598.getClass(), "vertices", null);
        setIntField(term1598, term1598.getClass(), "numVertices", 153009426);
        setIntField(term1598, term1598.getClass(), "first", 185751892);
        setField(term1598, term1598.getClass(), "bitset", null);
        setField(term1597, term1597.getClass(), "clique", term1598);
        setField(term1601, term1601.getClass(), "posMap", null);
        setField(term1601, term1601.getClass(), "graph", null);
        setField(term1601, term1601.getClass(), "vertices", null);
        setIntField(term1601, term1601.getClass(), "numVertices", 1077647088);
        setIntField(term1601, term1601.getClass(), "first", -705176810);
        setField(term1601, term1601.getClass(), "bitset", null);
        setField(term1597, term1597.getClass(), "cand", term1601);
        setDoubleField(term1597, term1597.getClass(), "weight", 0.6076495596892013);
        setField(term1597, term1597.getClass(), "this$0", null);
        Object term1605 = newInstance(Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator$Node"));
        Object term1606 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term1609 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term1606, term1606.getClass(), "posMap", null);
        setField(term1606, term1606.getClass(), "graph", null);
        setField(term1606, term1606.getClass(), "vertices", null);
        setIntField(term1606, term1606.getClass(), "numVertices", -1264595049);
        setIntField(term1606, term1606.getClass(), "first", -2058884635);
        setField(term1606, term1606.getClass(), "bitset", null);
        setField(term1605, term1605.getClass(), "clique", term1606);
        setField(term1609, term1609.getClass(), "posMap", null);
        setField(term1609, term1609.getClass(), "graph", null);
        setField(term1609, term1609.getClass(), "vertices", null);
        setIntField(term1609, term1609.getClass(), "numVertices", 793345010);
        setIntField(term1609, term1609.getClass(), "first", -2092117838);
        setField(term1609, term1609.getClass(), "bitset", null);
        setField(term1605, term1605.getClass(), "cand", term1609);
        setDoubleField(term1605, term1605.getClass(), "weight", 0.37773193782763337);
        setField(term1605, term1605.getClass(), "this$0", null);
        Object term1613 = newInstance(Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator$Node"));
        Object term1614 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term1617 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term1614, term1614.getClass(), "posMap", null);
        setField(term1614, term1614.getClass(), "graph", null);
        setField(term1614, term1614.getClass(), "vertices", null);
        setIntField(term1614, term1614.getClass(), "numVertices", -1731921726);
        setIntField(term1614, term1614.getClass(), "first", 919994471);
        setField(term1614, term1614.getClass(), "bitset", null);
        setField(term1613, term1613.getClass(), "clique", term1614);
        setField(term1617, term1617.getClass(), "posMap", null);
        setField(term1617, term1617.getClass(), "graph", null);
        setField(term1617, term1617.getClass(), "vertices", null);
        setIntField(term1617, term1617.getClass(), "numVertices", 0);
        setIntField(term1617, term1617.getClass(), "first", 0);
        setField(term1617, term1617.getClass(), "bitset", null);
        setField(term1613, term1613.getClass(), "cand", term1617);
        setDoubleField(term1613, term1613.getClass(), "weight", 0.8474802076607362);
        setField(term1613, term1613.getClass(), "this$0", null);
        ArrayDeque term1587 = new ArrayDeque();
        ((ArrayDeque) term1587).add(term1589);
        ((ArrayDeque) term1587).add(term1597);
        ((ArrayDeque) term1587).add(term1605);
        ((ArrayDeque) term1587).add(term1613);
        term1582 = newInstance(Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator"));
        Object term1623 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term1624 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term1625 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setIntField(term1582, term1582.getClass(), "minSize", -1784072578);
        setIntField(term1582, term1582.getClass(), "maxSize", 2011764585);
        setDoubleField(term1582, term1582.getClass(), "maxWeight", 0.2641345529914265);
        setLongField(term1582, term1582.getClass(), "timeout", -2813493605142626659L);
        setField(term1582, term1582.getClass(), "stack", term1587);
        setField(term1624, term1624.getClass(), "table", term1625);
        setIntField(term1624, term1624.getClass(), "count", 0);
        setIntField(term1624, term1624.getClass(), "threshold", 15);
        setFloatField(term1624, term1624.getClass(), "loadFactor", 0.75F);
        setField(term1623, term1623.getClass(), "posMap", term1624);
        setField(term1623, term1623.getClass(), "graph", null);
        setField(term1623, term1623.getClass(), "vertices", null);
        setIntField(term1623, term1623.getClass(), "numVertices", 0);
        setIntField(term1623, term1623.getClass(), "first", 0);
        setField(term1623, term1623.getClass(), "bitset", null);
        setField(term1582, term1582.getClass(), "currentClique", term1623);
        setField(term1582, term1582.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term1582, args);
    }

};


