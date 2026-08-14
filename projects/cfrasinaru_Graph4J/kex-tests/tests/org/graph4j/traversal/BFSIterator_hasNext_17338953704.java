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

public class BFSIterator_hasNext_17338953704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1475;

    public BFSIterator_hasNext_17338953704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1481 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1486 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1481, term1481.getClass(), "component", -1458980236);
        setIntField(term1481, term1481.getClass(), "vertex", 890505372);
        setIntField(term1481, term1481.getClass(), "level", 2044137055);
        setIntField(term1481, term1481.getClass(), "order", -1452324619);
        setIntField(term1486, term1486.getClass(), "component", -1121709274);
        setIntField(term1486, term1486.getClass(), "vertex", -532304223);
        setIntField(term1486, term1486.getClass(), "level", 666218293);
        setIntField(term1486, term1486.getClass(), "order", 1737876343);
        setField(term1486, term1486.getClass(), "parent", null);
        setField(term1481, term1481.getClass(), "parent", term1486);
        Object term1492 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1492, term1492.getClass(), "component", 66817373);
        setIntField(term1492, term1492.getClass(), "vertex", 1459628013);
        setIntField(term1492, term1492.getClass(), "level", -1641507499);
        setIntField(term1492, term1492.getClass(), "order", -33436796);
        setField(term1492, term1492.getClass(), "parent", null);
        LinkedList term1478 = new LinkedList();
        ((LinkedList) term1478).add(term1481);
        ((LinkedList) term1478).add(term1492);
        ((LinkedList) term1478).add((Object)null);
        ((LinkedList) term1478).add((Object)null);
        ((LinkedList) term1478).add((Object)null);
        ((LinkedList) term1478).add((Object)null);
        term1475 = newInstance(Class.forName("org.graph4j.traversal.BFSIterator"));
        boolean[] term1517 = (boolean[]) newBooleanArray(2);
        setField(term1475, term1475.getClass(), "graph", null);
        setIntField(term1475, term1475.getClass(), "startVertex", -890538258);
        setIntField(term1475, term1475.getClass(), "numVertices", -1085899912);
        setField(term1475, term1475.getClass(), "queue", term1478);
        setBooleanElement(term1517, 1, true);
        setField(term1475, term1475.getClass(), "visited", term1517);
        setIntField(term1475, term1475.getClass(), "restartIndex", -1527326823);
        setIntField(term1475, term1475.getClass(), "numIterations", 469871899);
        setIntField(term1475, term1475.getClass(), "compIndex", -1348703436);
        setIntField(term1475, term1475.getClass(), "orderNumber", -2027012650);
        setIntField(term1475, term1475.getClass(), "maxLevel", 1343432022);
        setBooleanField(term1475, term1475.getClass(), "reverse", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term1475, args);
    }

};


