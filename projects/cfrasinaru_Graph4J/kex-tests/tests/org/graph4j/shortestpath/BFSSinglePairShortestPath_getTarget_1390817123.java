package org.graph4j.shortestpath;

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
import static org.graph4j.shortestpath.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BFSSinglePairShortestPath_getTarget_1390817123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2536;

    public BFSSinglePairShortestPath_getTarget_1390817123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2536 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath"));
        int[] term2539 = (int[]) newIntArray(5);
        Object term2545 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term2547 = (int[]) newIntArray(2);
        Object term2552 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2553 = (long[]) newLongArray(1);
        setIntField(term2536, term2536.getClass(), "source", -1428063820);
        setIntField(term2536, term2536.getClass(), "target", -1271375703);
        setIntElement(term2539, 0, 1136208236);
        setIntElement(term2539, 1, -1220630391);
        setIntElement(term2539, 2, -995822131);
        setIntElement(term2539, 3, -687282231);
        setIntElement(term2539, 4, 1200440315);
        setField(term2536, term2536.getClass(), "forbiddenVertices", term2539);
        setIntField(term2545, term2545.getClass(), "numEdges", 40571662);
        setField(term2545, term2545.getClass(), "graph", null);
        setIntElement(term2547, 0, 1863910269);
        setIntElement(term2547, 1, 864645689);
        setField(term2545, term2545.getClass(), "vertices", term2547);
        setIntField(term2545, term2545.getClass(), "numVertices", 279384872);
        setIntField(term2545, term2545.getClass(), "first", 1427305953);
        setField(term2552, term2552.getClass(), "words", term2553);
        setIntField(term2552, term2552.getClass(), "wordsInUse", -781832877);
        setBooleanField(term2552, term2552.getClass(), "sizeIsSticky", true);
        setField(term2545, term2545.getClass(), "bitset", term2552);
        setField(term2536, term2536.getClass(), "bestPath", term2545);
        setDoubleField(term2536, term2536.getClass(), "bestWeight", 0.9459012738750242);
        setField(term2536, term2536.getClass(), "graph", null);
        setBooleanField(term2536, term2536.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTarget", argTypes, term2536, args);
    }

};


