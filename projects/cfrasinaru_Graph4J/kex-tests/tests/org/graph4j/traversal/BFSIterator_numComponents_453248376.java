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

public class BFSIterator_numComponents_453248376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1568;

    public BFSIterator_numComponents_453248376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1574 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1579 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1574, term1574.getClass(), "component", -1954937310);
        setIntField(term1574, term1574.getClass(), "vertex", -460657407);
        setIntField(term1574, term1574.getClass(), "level", 941003590);
        setIntField(term1574, term1574.getClass(), "order", -1825624890);
        setIntField(term1579, term1579.getClass(), "component", 413214164);
        setIntField(term1579, term1579.getClass(), "vertex", 355911655);
        setIntField(term1579, term1579.getClass(), "level", 1811833766);
        setIntField(term1579, term1579.getClass(), "order", 735987104);
        setField(term1579, term1579.getClass(), "parent", null);
        setField(term1574, term1574.getClass(), "parent", term1579);
        Object term1585 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1585, term1585.getClass(), "component", 1835568392);
        setIntField(term1585, term1585.getClass(), "vertex", 457470807);
        setIntField(term1585, term1585.getClass(), "level", -994742871);
        setIntField(term1585, term1585.getClass(), "order", -222412326);
        setField(term1585, term1585.getClass(), "parent", null);
        LinkedList term1571 = new LinkedList();
        ((LinkedList) term1571).add(term1574);
        ((LinkedList) term1571).add(term1585);
        ((LinkedList) term1571).add((Object)null);
        ((LinkedList) term1571).add((Object)null);
        ((LinkedList) term1571).add((Object)null);
        ((LinkedList) term1571).add((Object)null);
        term1568 = newInstance(Class.forName("org.graph4j.traversal.BFSIterator"));
        boolean[] term1610 = (boolean[]) newBooleanArray(8);
        setField(term1568, term1568.getClass(), "graph", null);
        setIntField(term1568, term1568.getClass(), "startVertex", -1541297110);
        setIntField(term1568, term1568.getClass(), "numVertices", -1581464804);
        setField(term1568, term1568.getClass(), "queue", term1571);
        setBooleanElement(term1610, 4, true);
        setBooleanElement(term1610, 7, true);
        setField(term1568, term1568.getClass(), "visited", term1610);
        setIntField(term1568, term1568.getClass(), "restartIndex", -299497261);
        setIntField(term1568, term1568.getClass(), "numIterations", -23054366);
        setIntField(term1568, term1568.getClass(), "compIndex", 153009426);
        setIntField(term1568, term1568.getClass(), "orderNumber", 185751892);
        setIntField(term1568, term1568.getClass(), "maxLevel", 1068256001);
        setBooleanField(term1568, term1568.getClass(), "reverse", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "numComponents", argTypes, term1568, args);
    }

};


