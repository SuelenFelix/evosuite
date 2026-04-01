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

public class TopologicalOrderIterator_hasNext_363097042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119648;

    public TopologicalOrderIterator_hasNext_363097042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119648 = newInstance(Class.forName("org.graph4j.traversal.TopologicalOrderIterator"));
        int[] term119650 = (int[]) newIntArray(9);
        int[] term119660 = (int[]) newIntArray(1);
        Object term119662 = newInstance(Class.forName("org.graph4j.util.VertexQueue"));
        int[] term119663 = (int[]) newIntArray(1);
        Object term119667 = newInstance(Class.forName("java.util.BitSet"));
        long[] term119668 = (long[]) newLongArray(1);
        setField(term119648, term119648.getClass(), "graph", null);
        setBooleanField(term119648, term119648.getClass(), "computeLevels", false);
        setIntElement(term119650, 0, -590762770);
        setIntElement(term119650, 1, 1625573732);
        setIntElement(term119650, 2, -544709840);
        setIntElement(term119650, 3, 306522691);
        setIntElement(term119650, 4, 1894815516);
        setIntElement(term119650, 5, -1545186921);
        setIntElement(term119650, 6, 1281934202);
        setIntElement(term119650, 7, -1073046167);
        setIntElement(term119650, 8, 99930835);
        setField(term119648, term119648.getClass(), "indegrees", term119650);
        setIntElement(term119660, 0, -2093384687);
        setField(term119648, term119648.getClass(), "levels", term119660);
        setField(term119662, term119662.getClass(), "graph", null);
        setIntElement(term119663, 0, 281571025);
        setField(term119662, term119662.getClass(), "vertices", term119663);
        setIntField(term119662, term119662.getClass(), "numVertices", 499514218);
        setIntField(term119662, term119662.getClass(), "first", -1120956826);
        setField(term119667, term119667.getClass(), "words", term119668);
        setIntField(term119667, term119667.getClass(), "wordsInUse", -39297907);
        setBooleanField(term119667, term119667.getClass(), "sizeIsSticky", false);
        setField(term119662, term119662.getClass(), "bitset", term119667);
        setField(term119648, term119648.getClass(), "queue", term119662);
        setIntField(term119648, term119648.getClass(), "currentVertex", 1915363701);
        setIntField(term119648, term119648.getClass(), "counter", -591612123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.TopologicalOrderIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term119648, args);
    }

};


