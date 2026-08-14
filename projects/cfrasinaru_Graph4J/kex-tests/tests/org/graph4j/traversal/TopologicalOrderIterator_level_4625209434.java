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

public class TopologicalOrderIterator_level_4625209434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2312;

    public TopologicalOrderIterator_level_4625209434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2312 = newInstance(Class.forName("org.graph4j.traversal.TopologicalOrderIterator"));
        int[] term2314 = (int[]) newIntArray(4);
        int[] term2319 = (int[]) newIntArray(6);
        Object term2326 = newInstance(Class.forName("org.graph4j.util.VertexQueue"));
        int[] term2327 = (int[]) newIntArray(7);
        Object term2337 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2338 = (long[]) newLongArray(1);
        setField(term2312, term2312.getClass(), "graph", null);
        setBooleanField(term2312, term2312.getClass(), "computeLevels", true);
        setIntElement(term2314, 0, -1897199214);
        setIntElement(term2314, 1, -1016478729);
        setIntElement(term2314, 2, -206889003);
        setIntElement(term2314, 3, 638046409);
        setField(term2312, term2312.getClass(), "indegrees", term2314);
        setIntElement(term2319, 0, 427274898);
        setIntElement(term2319, 1, -1654552020);
        setIntElement(term2319, 2, -1049546692);
        setIntElement(term2319, 3, 1397781598);
        setIntElement(term2319, 4, -44720365);
        setIntElement(term2319, 5, 1963632911);
        setField(term2312, term2312.getClass(), "levels", term2319);
        setField(term2326, term2326.getClass(), "graph", null);
        setIntElement(term2327, 0, -1100497683);
        setIntElement(term2327, 1, 155423433);
        setIntElement(term2327, 2, -815471632);
        setIntElement(term2327, 3, -1469668708);
        setIntElement(term2327, 4, 1796950482);
        setIntElement(term2327, 5, -945759470);
        setIntElement(term2327, 6, 657342039);
        setField(term2326, term2326.getClass(), "vertices", term2327);
        setIntField(term2326, term2326.getClass(), "numVertices", 1483999606);
        setIntField(term2326, term2326.getClass(), "first", 1871761182);
        setField(term2337, term2337.getClass(), "words", term2338);
        setIntField(term2337, term2337.getClass(), "wordsInUse", 233983728);
        setBooleanField(term2337, term2337.getClass(), "sizeIsSticky", true);
        setField(term2326, term2326.getClass(), "bitset", term2337);
        setField(term2312, term2312.getClass(), "queue", term2326);
        setIntField(term2312, term2312.getClass(), "currentVertex", -1650132476);
        setIntField(term2312, term2312.getClass(), "counter", 1719680265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.TopologicalOrderIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "level", argTypes, term2312, args);
    }

};


