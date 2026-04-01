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

public class DFSCliqueIterator_next_10380429784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1397;

    public DFSCliqueIterator_next_10380429784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1403 = newInstance(Class.forName("org.graph4j.clique.DFSCliqueIterator$Node"));
        Object term1404 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term1407 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term1404, term1404.getClass(), "posMap", null);
        setField(term1404, term1404.getClass(), "graph", null);
        setField(term1404, term1404.getClass(), "vertices", null);
        setIntField(term1404, term1404.getClass(), "numVertices", -1092883950);
        setIntField(term1404, term1404.getClass(), "first", 950385621);
        setField(term1404, term1404.getClass(), "bitset", null);
        setField(term1403, term1403.getClass(), "clique", term1404);
        setField(term1407, term1407.getClass(), "posMap", null);
        setField(term1407, term1407.getClass(), "graph", null);
        setField(term1407, term1407.getClass(), "vertices", null);
        setIntField(term1407, term1407.getClass(), "numVertices", -1602072035);
        setIntField(term1407, term1407.getClass(), "first", 1902624392);
        setField(term1407, term1407.getClass(), "bitset", null);
        setField(term1403, term1403.getClass(), "cand", term1407);
        setField(term1403, term1403.getClass(), "this$0", null);
        Object term1410 = newInstance(Class.forName("org.graph4j.clique.DFSCliqueIterator$Node"));
        Object term1411 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term1414 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term1411, term1411.getClass(), "posMap", null);
        setField(term1411, term1411.getClass(), "graph", null);
        setField(term1411, term1411.getClass(), "vertices", null);
        setIntField(term1411, term1411.getClass(), "numVertices", 529879356);
        setIntField(term1411, term1411.getClass(), "first", 18072182);
        setField(term1411, term1411.getClass(), "bitset", null);
        setField(term1410, term1410.getClass(), "clique", term1411);
        setField(term1414, term1414.getClass(), "posMap", null);
        setField(term1414, term1414.getClass(), "graph", null);
        setField(term1414, term1414.getClass(), "vertices", null);
        setIntField(term1414, term1414.getClass(), "numVertices", -393590701);
        setIntField(term1414, term1414.getClass(), "first", 86344574);
        setField(term1414, term1414.getClass(), "bitset", null);
        setField(term1410, term1410.getClass(), "cand", term1414);
        setField(term1410, term1410.getClass(), "this$0", null);
        ArrayDeque term1401 = new ArrayDeque();
        ((ArrayDeque) term1401).add(term1403);
        ((ArrayDeque) term1401).add(term1410);
        term1397 = newInstance(Class.forName("org.graph4j.clique.DFSCliqueIterator"));
        Object term1419 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term1420 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term1421 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term1425 = (int[]) newIntArray(5);
        Object term1433 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1434 = (long[]) newLongArray(1);
        setIntField(term1397, term1397.getClass(), "minSize", 1436978289);
        setIntField(term1397, term1397.getClass(), "maxSize", 696225243);
        setLongField(term1397, term1397.getClass(), "timeout", 4872422362414183754L);
        setField(term1397, term1397.getClass(), "stack", term1401);
        setField(term1420, term1420.getClass(), "table", term1421);
        setIntField(term1420, term1420.getClass(), "count", -1489991025);
        setIntField(term1420, term1420.getClass(), "threshold", 15);
        setFloatField(term1420, term1420.getClass(), "loadFactor", 0.75F);
        setField(term1419, term1419.getClass(), "posMap", term1420);
        setField(term1419, term1419.getClass(), "graph", null);
        setIntElement(term1425, 0, -1542979444);
        setIntElement(term1425, 1, -1130401612);
        setIntElement(term1425, 2, -316771104);
        setIntElement(term1425, 3, -1374527319);
        setIntElement(term1425, 4, -1735276919);
        setField(term1419, term1419.getClass(), "vertices", term1425);
        setIntField(term1419, term1419.getClass(), "numVertices", -712023865);
        setIntField(term1419, term1419.getClass(), "first", 613256157);
        setField(term1433, term1433.getClass(), "words", term1434);
        setIntField(term1433, term1433.getClass(), "wordsInUse", 454242689);
        setBooleanField(term1433, term1433.getClass(), "sizeIsSticky", true);
        setField(term1419, term1419.getClass(), "bitset", term1433);
        setField(term1397, term1397.getClass(), "currentClique", term1419);
        setField(term1397, term1397.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.DFSCliqueIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term1397, args);
    }

};


