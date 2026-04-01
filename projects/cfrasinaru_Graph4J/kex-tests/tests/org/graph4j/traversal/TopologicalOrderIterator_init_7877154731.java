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

public class TopologicalOrderIterator_init_7877154731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119596;

    public TopologicalOrderIterator_init_7877154731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119596 = newInstance(Class.forName("org.graph4j.traversal.TopologicalOrderIterator"));
        int[] term119598 = (int[]) newIntArray(8);
        int[] term119607 = (int[]) newIntArray(5);
        Object term119613 = newInstance(Class.forName("org.graph4j.util.VertexQueue"));
        int[] term119614 = (int[]) newIntArray(5);
        Object term119622 = newInstance(Class.forName("java.util.BitSet"));
        long[] term119623 = (long[]) newLongArray(1);
        setField(term119596, term119596.getClass(), "graph", null);
        setBooleanField(term119596, term119596.getClass(), "computeLevels", true);
        setIntElement(term119598, 0, 1083982722);
        setIntElement(term119598, 1, -1101836538);
        setIntElement(term119598, 2, -1916712623);
        setIntElement(term119598, 3, 2140215899);
        setIntElement(term119598, 4, -1668575256);
        setIntElement(term119598, 5, 1599291001);
        setIntElement(term119598, 6, -472341969);
        setIntElement(term119598, 7, 331537526);
        setField(term119596, term119596.getClass(), "indegrees", term119598);
        setIntElement(term119607, 0, 2071433680);
        setIntElement(term119607, 1, 1943446095);
        setIntElement(term119607, 2, 1652858351);
        setIntElement(term119607, 3, -913279940);
        setIntElement(term119607, 4, 870323209);
        setField(term119596, term119596.getClass(), "levels", term119607);
        setField(term119613, term119613.getClass(), "graph", null);
        setIntElement(term119614, 0, -1190049621);
        setIntElement(term119614, 1, 1903492873);
        setIntElement(term119614, 2, -1822278676);
        setIntElement(term119614, 3, -718669557);
        setIntElement(term119614, 4, 1872640975);
        setField(term119613, term119613.getClass(), "vertices", term119614);
        setIntField(term119613, term119613.getClass(), "numVertices", 1834274419);
        setIntField(term119613, term119613.getClass(), "first", -1484154691);
        setField(term119622, term119622.getClass(), "words", term119623);
        setIntField(term119622, term119622.getClass(), "wordsInUse", -1067244232);
        setBooleanField(term119622, term119622.getClass(), "sizeIsSticky", false);
        setField(term119613, term119613.getClass(), "bitset", term119622);
        setField(term119596, term119596.getClass(), "queue", term119613);
        setIntField(term119596, term119596.getClass(), "currentVertex", 1511233817);
        setIntField(term119596, term119596.getClass(), "counter", -1597236849);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.TopologicalOrderIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term119596, args);
    }

};


