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
import java.lang.Integer;
import java.lang.Double;

public class DFSBoundedCliqueIterator_neighbors_10966799953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1523;
     Object term1571;
     Object term1573;
     Object term1576;

    public DFSBoundedCliqueIterator_neighbors_10966799953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1530 = newInstance(Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator$Node"));
        Object term1531 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term1534 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term1531, term1531.getClass(), "posMap", null);
        setField(term1531, term1531.getClass(), "graph", null);
        setField(term1531, term1531.getClass(), "vertices", null);
        setIntField(term1531, term1531.getClass(), "numVertices", -524352937);
        setIntField(term1531, term1531.getClass(), "first", 1472218987);
        setField(term1531, term1531.getClass(), "bitset", null);
        setField(term1530, term1530.getClass(), "clique", term1531);
        setField(term1534, term1534.getClass(), "posMap", null);
        setField(term1534, term1534.getClass(), "graph", null);
        setField(term1534, term1534.getClass(), "vertices", null);
        setIntField(term1534, term1534.getClass(), "numVertices", 692873905);
        setIntField(term1534, term1534.getClass(), "first", 1734759369);
        setField(term1534, term1534.getClass(), "bitset", null);
        setField(term1530, term1530.getClass(), "cand", term1534);
        setDoubleField(term1530, term1530.getClass(), "weight", 0.5523635872663106);
        setField(term1530, term1530.getClass(), "this$0", null);
        Object term1538 = newInstance(Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator$Node"));
        Object term1539 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term1542 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term1539, term1539.getClass(), "posMap", null);
        setField(term1539, term1539.getClass(), "graph", null);
        setField(term1539, term1539.getClass(), "vertices", null);
        setIntField(term1539, term1539.getClass(), "numVertices", -1986366126);
        setIntField(term1539, term1539.getClass(), "first", -1963228619);
        setField(term1539, term1539.getClass(), "bitset", null);
        setField(term1538, term1538.getClass(), "clique", term1539);
        setField(term1542, term1542.getClass(), "posMap", null);
        setField(term1542, term1542.getClass(), "graph", null);
        setField(term1542, term1542.getClass(), "vertices", null);
        setIntField(term1542, term1542.getClass(), "numVertices", -975856245);
        setIntField(term1542, term1542.getClass(), "first", -1023366103);
        setField(term1542, term1542.getClass(), "bitset", null);
        setField(term1538, term1538.getClass(), "cand", term1542);
        setDoubleField(term1538, term1538.getClass(), "weight", 0.544608645520025);
        setField(term1538, term1538.getClass(), "this$0", null);
        Object term1546 = newInstance(Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator$Node"));
        Object term1547 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term1550 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term1547, term1547.getClass(), "posMap", null);
        setField(term1547, term1547.getClass(), "graph", null);
        setField(term1547, term1547.getClass(), "vertices", null);
        setIntField(term1547, term1547.getClass(), "numVertices", 1175146356);
        setIntField(term1547, term1547.getClass(), "first", -2137419728);
        setField(term1547, term1547.getClass(), "bitset", null);
        setField(term1546, term1546.getClass(), "clique", term1547);
        setField(term1550, term1550.getClass(), "posMap", null);
        setField(term1550, term1550.getClass(), "graph", null);
        setField(term1550, term1550.getClass(), "vertices", null);
        setIntField(term1550, term1550.getClass(), "numVertices", -1763480506);
        setIntField(term1550, term1550.getClass(), "first", -1541297110);
        setField(term1550, term1550.getClass(), "bitset", null);
        setField(term1546, term1546.getClass(), "cand", term1550);
        setDoubleField(term1546, term1546.getClass(), "weight", 0.28570734989730284);
        setField(term1546, term1546.getClass(), "this$0", null);
        ArrayDeque term1528 = new ArrayDeque();
        ((ArrayDeque) term1528).add(term1530);
        ((ArrayDeque) term1528).add(term1538);
        ((ArrayDeque) term1528).add(term1546);
        term1523 = newInstance(Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator"));
        Object term1556 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term1557 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term1558 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term1562 = (int[]) newIntArray(1);
        Object term1566 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1567 = (long[]) newLongArray(1);
        setIntField(term1523, term1523.getClass(), "minSize", -1767079160);
        setIntField(term1523, term1523.getClass(), "maxSize", -201010601);
        setDoubleField(term1523, term1523.getClass(), "maxWeight", 0.3455959125047594);
        setLongField(term1523, term1523.getClass(), "timeout", 6967924379644551255L);
        setField(term1523, term1523.getClass(), "stack", term1528);
        setField(term1557, term1557.getClass(), "table", term1558);
        setIntField(term1557, term1557.getClass(), "count", -1954937310);
        setIntField(term1557, term1557.getClass(), "threshold", 15);
        setFloatField(term1557, term1557.getClass(), "loadFactor", 0.75F);
        setField(term1556, term1556.getClass(), "posMap", term1557);
        setField(term1556, term1556.getClass(), "graph", null);
        setIntElement(term1562, 0, -460657407);
        setField(term1556, term1556.getClass(), "vertices", term1562);
        setIntField(term1556, term1556.getClass(), "numVertices", 941003590);
        setIntField(term1556, term1556.getClass(), "first", -1825624890);
        setField(term1566, term1566.getClass(), "words", term1567);
        setIntField(term1566, term1566.getClass(), "wordsInUse", 413214164);
        setBooleanField(term1566, term1566.getClass(), "sizeIsSticky", true);
        setField(term1556, term1556.getClass(), "bitset", term1566);
        setField(term1523, term1523.getClass(), "currentClique", term1556);
        setField(term1523, term1523.getClass(), "graph", null);
        term1571 = new Integer(355911655);
        term1573 = (int[]) newIntArray(2);
        setIntElement(term1573, 0, 1811833766);
        setIntElement(term1573, 1, 735987104);
        term1576 = new Double(0.40176586625454525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term1571;
        args[1] = term1573;
        args[2] = term1576;
        callMethod(klass, "neighbors", argTypes, term1523, args);
    }

};


