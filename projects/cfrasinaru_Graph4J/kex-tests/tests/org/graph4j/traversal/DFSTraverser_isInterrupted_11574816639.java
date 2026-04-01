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
import java.lang.Object;
import java.util.ArrayDeque;

public class DFSTraverser_isInterrupted_11574816639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110650;

    public DFSTraverser_isInterrupted_11574816639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term110661 = new ArrayDeque();
        term110650 = newInstance(Class.forName("org.graph4j.traversal.DFSTraverser"));
        Object[] term110654 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 0);
        int[] term110655 = (int[]) newIntArray(4);
        boolean[] term110665 = (boolean[]) newBooleanArray(5);
        setField(term110650, term110650.getClass(), "graph", null);
        setBooleanField(term110650, term110650.getClass(), "directed", true);
        setField(term110650, term110650.getClass(), "visitor", null);
        setIntField(term110650, term110650.getClass(), "orderIndex", -491909135);
        setIntField(term110650, term110650.getClass(), "compIndex", 867692955);
        setField(term110650, term110650.getClass(), "visited", term110654);
        setIntElement(term110655, 0, -604436957);
        setIntElement(term110655, 1, -199329423);
        setIntElement(term110655, 2, -1406544369);
        setIntElement(term110655, 3, 1404521823);
        setField(term110650, term110650.getClass(), "nextPos", term110655);
        setIntField(term110650, term110650.getClass(), "restartIndex", -269313334);
        setField(term110650, term110650.getClass(), "stack", term110661);
        setBooleanElement(term110665, 0, true);
        setBooleanElement(term110665, 1, true);
        setBooleanElement(term110665, 4, true);
        setField(term110650, term110650.getClass(), "instack", term110665);
        setBooleanField(term110650, term110650.getClass(), "interrupted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSTraverser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInterrupted", argTypes, term110650, args);
    }

};


