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

public class BFSIterator_maxLevel_611280877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1633;

    public BFSIterator_maxLevel_611280877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1639 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1644 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1639, term1639.getClass(), "component", -761675396);
        setIntField(term1639, term1639.getClass(), "vertex", -1954860951);
        setIntField(term1639, term1639.getClass(), "level", -2078879114);
        setIntField(term1639, term1639.getClass(), "order", -1186882318);
        setIntField(term1644, term1644.getClass(), "component", 1077647088);
        setIntField(term1644, term1644.getClass(), "vertex", -705176810);
        setIntField(term1644, term1644.getClass(), "level", -1584779593);
        setIntField(term1644, term1644.getClass(), "order", 303007547);
        setField(term1644, term1644.getClass(), "parent", null);
        setField(term1639, term1639.getClass(), "parent", term1644);
        Object term1650 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1650, term1650.getClass(), "component", -1644358555);
        setIntField(term1650, term1650.getClass(), "vertex", -388591034);
        setIntField(term1650, term1650.getClass(), "level", -1270258033);
        setIntField(term1650, term1650.getClass(), "order", 1677994069);
        setField(term1650, term1650.getClass(), "parent", null);
        LinkedList term1636 = new LinkedList();
        ((LinkedList) term1636).add(term1639);
        ((LinkedList) term1636).add(term1650);
        ((LinkedList) term1636).add((Object)null);
        ((LinkedList) term1636).add((Object)null);
        ((LinkedList) term1636).add((Object)null);
        ((LinkedList) term1636).add((Object)null);
        ((LinkedList) term1636).add((Object)null);
        ((LinkedList) term1636).add((Object)null);
        ((LinkedList) term1636).add((Object)null);
        term1633 = newInstance(Class.forName("org.graph4j.traversal.BFSIterator"));
        boolean[] term1660 = (boolean[]) newBooleanArray(7);
        setField(term1633, term1633.getClass(), "graph", null);
        setIntField(term1633, term1633.getClass(), "startVertex", 1139078354);
        setIntField(term1633, term1633.getClass(), "numVertices", -691164974);
        setField(term1633, term1633.getClass(), "queue", term1636);
        setBooleanElement(term1660, 1, true);
        setBooleanElement(term1660, 3, true);
        setBooleanElement(term1660, 5, true);
        setField(term1633, term1633.getClass(), "visited", term1660);
        setIntField(term1633, term1633.getClass(), "restartIndex", -439999692);
        setIntField(term1633, term1633.getClass(), "numIterations", 924095007);
        setIntField(term1633, term1633.getClass(), "compIndex", 1302110708);
        setIntField(term1633, term1633.getClass(), "orderNumber", 594705497);
        setIntField(term1633, term1633.getClass(), "maxLevel", -600102466);
        setBooleanField(term1633, term1633.getClass(), "reverse", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "maxLevel", argTypes, term1633, args);
    }

};


