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

public class TopologicalOrderIterator_next_6560598743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119686;

    public TopologicalOrderIterator_next_6560598743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119686 = newInstance(Class.forName("org.graph4j.traversal.TopologicalOrderIterator"));
        int[] term119688 = (int[]) newIntArray(3);
        int[] term119692 = (int[]) newIntArray(0);
        Object term119693 = newInstance(Class.forName("org.graph4j.util.VertexQueue"));
        int[] term119694 = (int[]) newIntArray(5);
        Object term119702 = newInstance(Class.forName("java.util.BitSet"));
        long[] term119703 = (long[]) newLongArray(1);
        setField(term119686, term119686.getClass(), "graph", null);
        setBooleanField(term119686, term119686.getClass(), "computeLevels", false);
        setIntElement(term119688, 0, -125433342);
        setIntElement(term119688, 1, 2138132426);
        setIntElement(term119688, 2, 447637059);
        setField(term119686, term119686.getClass(), "indegrees", term119688);
        setField(term119686, term119686.getClass(), "levels", term119692);
        setField(term119693, term119693.getClass(), "graph", null);
        setIntElement(term119694, 0, -1515997420);
        setIntElement(term119694, 1, 736187393);
        setIntElement(term119694, 2, 451224390);
        setIntElement(term119694, 3, 1611341095);
        setIntElement(term119694, 4, 1035979953);
        setField(term119693, term119693.getClass(), "vertices", term119694);
        setIntField(term119693, term119693.getClass(), "numVertices", -1619724677);
        setIntField(term119693, term119693.getClass(), "first", 484570444);
        setField(term119702, term119702.getClass(), "words", term119703);
        setIntField(term119702, term119702.getClass(), "wordsInUse", -590318386);
        setBooleanField(term119702, term119702.getClass(), "sizeIsSticky", true);
        setField(term119693, term119693.getClass(), "bitset", term119702);
        setField(term119686, term119686.getClass(), "queue", term119693);
        setIntField(term119686, term119686.getClass(), "currentVertex", 193707542);
        setIntField(term119686, term119686.getClass(), "counter", 843737635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.TopologicalOrderIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term119686, args);
    }

};


