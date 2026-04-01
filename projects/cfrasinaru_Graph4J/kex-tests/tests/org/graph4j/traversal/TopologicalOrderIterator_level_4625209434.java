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
     Object term119718;

    public TopologicalOrderIterator_level_4625209434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119718 = newInstance(Class.forName("org.graph4j.traversal.TopologicalOrderIterator"));
        int[] term119720 = (int[]) newIntArray(6);
        int[] term119727 = (int[]) newIntArray(5);
        Object term119733 = newInstance(Class.forName("org.graph4j.util.VertexQueue"));
        int[] term119734 = (int[]) newIntArray(7);
        Object term119744 = newInstance(Class.forName("java.util.BitSet"));
        long[] term119745 = (long[]) newLongArray(1);
        setField(term119718, term119718.getClass(), "graph", null);
        setBooleanField(term119718, term119718.getClass(), "computeLevels", true);
        setIntElement(term119720, 0, -556953295);
        setIntElement(term119720, 1, -845722720);
        setIntElement(term119720, 2, 1736623587);
        setIntElement(term119720, 3, 1301307983);
        setIntElement(term119720, 4, 404933593);
        setIntElement(term119720, 5, -1929368595);
        setField(term119718, term119718.getClass(), "indegrees", term119720);
        setIntElement(term119727, 0, 372813155);
        setIntElement(term119727, 1, -645249448);
        setIntElement(term119727, 2, 14263424);
        setIntElement(term119727, 3, -198617243);
        setIntElement(term119727, 4, -1881742095);
        setField(term119718, term119718.getClass(), "levels", term119727);
        setField(term119733, term119733.getClass(), "graph", null);
        setIntElement(term119734, 0, 1173187619);
        setIntElement(term119734, 1, -64344650);
        setIntElement(term119734, 2, 1958057421);
        setIntElement(term119734, 3, -660062568);
        setIntElement(term119734, 4, -1908480000);
        setIntElement(term119734, 5, 749109931);
        setIntElement(term119734, 6, -1931166992);
        setField(term119733, term119733.getClass(), "vertices", term119734);
        setIntField(term119733, term119733.getClass(), "numVertices", 215166713);
        setIntField(term119733, term119733.getClass(), "first", -1734474318);
        setField(term119744, term119744.getClass(), "words", term119745);
        setIntField(term119744, term119744.getClass(), "wordsInUse", -1347924820);
        setBooleanField(term119744, term119744.getClass(), "sizeIsSticky", false);
        setField(term119733, term119733.getClass(), "bitset", term119744);
        setField(term119718, term119718.getClass(), "queue", term119733);
        setIntField(term119718, term119718.getClass(), "currentVertex", 148510675);
        setIntField(term119718, term119718.getClass(), "counter", -386090895);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.TopologicalOrderIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "level", argTypes, term119718, args);
    }

};


