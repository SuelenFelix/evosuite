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
import java.util.LinkedList;
import java.lang.Object;

public class BFSIterator_next_500484615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1528;

    public BFSIterator_next_500484615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1534 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1539 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1534, term1534.getClass(), "component", 2060027076);
        setIntField(term1534, term1534.getClass(), "vertex", 2084868811);
        setIntField(term1534, term1534.getClass(), "level", 314478878);
        setIntField(term1534, term1534.getClass(), "order", 1425342686);
        setIntField(term1539, term1539.getClass(), "component", -1042470635);
        setIntField(term1539, term1539.getClass(), "vertex", -524352937);
        setIntField(term1539, term1539.getClass(), "level", 1472218987);
        setIntField(term1539, term1539.getClass(), "order", 805176809);
        setField(term1539, term1539.getClass(), "parent", null);
        setField(term1534, term1534.getClass(), "parent", term1539);
        Object term1545 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1545, term1545.getClass(), "component", 1558810715);
        setIntField(term1545, term1545.getClass(), "vertex", -382652403);
        setIntField(term1545, term1545.getClass(), "level", -2126539433);
        setIntField(term1545, term1545.getClass(), "order", 196952878);
        setField(term1545, term1545.getClass(), "parent", null);
        LinkedList term1531 = new LinkedList();
        ((LinkedList) term1531).add(term1534);
        ((LinkedList) term1531).add(term1545);
        ((LinkedList) term1531).add((Object)null);
        ((LinkedList) term1531).add((Object)null);
        ((LinkedList) term1531).add((Object)null);
        ((LinkedList) term1531).add((Object)null);
        ((LinkedList) term1531).add((Object)null);
        ((LinkedList) term1531).add((Object)null);
        term1528 = newInstance(Class.forName("org.graph4j.traversal.BFSIterator"));
        boolean[] term1555 = (boolean[]) newBooleanArray(3);
        setField(term1528, term1528.getClass(), "graph", null);
        setIntField(term1528, term1528.getClass(), "startVertex", -1767079160);
        setIntField(term1528, term1528.getClass(), "numVertices", -201010601);
        setField(term1528, term1528.getClass(), "queue", term1531);
        setBooleanElement(term1555, 0, true);
        setField(term1528, term1528.getClass(), "visited", term1555);
        setIntField(term1528, term1528.getClass(), "restartIndex", 802673242);
        setIntField(term1528, term1528.getClass(), "numIterations", -1808638031);
        setIntField(term1528, term1528.getClass(), "compIndex", -1514240086);
        setIntField(term1528, term1528.getClass(), "orderNumber", 2052244839);
        setIntField(term1528, term1528.getClass(), "maxLevel", -1763480506);
        setBooleanField(term1528, term1528.getClass(), "reverse", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term1528, args);
    }

};


