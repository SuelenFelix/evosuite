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

public class DFSIterator_next_3082138994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101709;

    public DFSIterator_next_3082138994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term101712 = new ArrayDeque();
        term101709 = newInstance(Class.forName("org.graph4j.traversal.DFSIterator"));
        boolean[] term101716 = (boolean[]) newBooleanArray(3);
        int[] term101720 = (int[]) newIntArray(5);
        setField(term101709, term101709.getClass(), "graph", null);
        setIntField(term101709, term101709.getClass(), "numVertices", 1773024551);
        setIntField(term101709, term101709.getClass(), "startVertex", -1168008314);
        setField(term101709, term101709.getClass(), "stack", term101712);
        setBooleanElement(term101716, 0, true);
        setField(term101709, term101709.getClass(), "visited", term101716);
        setIntElement(term101720, 0, -1880112250);
        setIntElement(term101720, 1, -84187747);
        setIntElement(term101720, 2, -674794156);
        setIntElement(term101720, 3, -321760913);
        setIntElement(term101720, 4, -99070568);
        setField(term101709, term101709.getClass(), "nextPos", term101720);
        setIntField(term101709, term101709.getClass(), "restartIndex", 597463097);
        setIntField(term101709, term101709.getClass(), "numIterations", 639141268);
        setIntField(term101709, term101709.getClass(), "component", 2102047934);
        setIntField(term101709, term101709.getClass(), "orderNumber", -2040700684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term101709, args);
    }

};


