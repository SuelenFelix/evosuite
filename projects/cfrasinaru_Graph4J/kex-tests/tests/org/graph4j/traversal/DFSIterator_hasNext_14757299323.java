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
import java.util.ArrayDeque;
import java.lang.Object;

public class DFSIterator_hasNext_14757299323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101656;

    public DFSIterator_hasNext_14757299323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101661 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term101666 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term101661, term101661.getClass(), "component", -1111915638);
        setIntField(term101661, term101661.getClass(), "vertex", 663576021);
        setIntField(term101661, term101661.getClass(), "level", -1254576977);
        setIntField(term101661, term101661.getClass(), "order", -1258344496);
        setIntField(term101666, term101666.getClass(), "component", -1827033542);
        setIntField(term101666, term101666.getClass(), "vertex", -1247831869);
        setIntField(term101666, term101666.getClass(), "level", 1449688423);
        setIntField(term101666, term101666.getClass(), "order", -1845034925);
        setField(term101666, term101666.getClass(), "parent", null);
        setField(term101661, term101661.getClass(), "parent", term101666);
        ArrayDeque term101659 = new ArrayDeque();
        ((ArrayDeque) term101659).add(term101661);
        term101656 = newInstance(Class.forName("org.graph4j.traversal.DFSIterator"));
        boolean[] term101673 = (boolean[]) newBooleanArray(8);
        int[] term101682 = (int[]) newIntArray(7);
        setField(term101656, term101656.getClass(), "graph", null);
        setIntField(term101656, term101656.getClass(), "numVertices", 107685809);
        setIntField(term101656, term101656.getClass(), "startVertex", 1946075579);
        setField(term101656, term101656.getClass(), "stack", term101659);
        setBooleanElement(term101673, 0, true);
        setBooleanElement(term101673, 1, true);
        setBooleanElement(term101673, 3, true);
        setBooleanElement(term101673, 4, true);
        setBooleanElement(term101673, 6, true);
        setBooleanElement(term101673, 7, true);
        setField(term101656, term101656.getClass(), "visited", term101673);
        setIntElement(term101682, 0, -852602236);
        setIntElement(term101682, 1, -442221418);
        setIntElement(term101682, 2, 974356617);
        setIntElement(term101682, 3, 660265178);
        setIntElement(term101682, 4, 1982277135);
        setIntElement(term101682, 5, 405631945);
        setIntElement(term101682, 6, -1114642017);
        setField(term101656, term101656.getClass(), "nextPos", term101682);
        setIntField(term101656, term101656.getClass(), "restartIndex", 322604433);
        setIntField(term101656, term101656.getClass(), "numIterations", -863608100);
        setIntField(term101656, term101656.getClass(), "component", -809977936);
        setIntField(term101656, term101656.getClass(), "orderNumber", -584343331);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term101656, args);
    }

};


