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

public class DijkstraShortestPathHeap_preCompute_5586548361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1674;

    public DijkstraShortestPathHeap_preCompute_5586548361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1674 = newInstance(Class.forName("org.graph4j.shortestpath.DijkstraShortestPathHeap"));
        Object term1675 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term1676 = (int[]) newIntArray(0);
        int[] term1677 = (int[]) newIntArray(9);
        int[] term1689 = (int[]) newIntArray(5);
        double[] term1695 = (double[]) newDoubleArray(1);
        int[] term1697 = (int[]) newIntArray(2);
        int[] term1700 = (int[]) newIntArray(8);
        boolean[] term1709 = (boolean[]) newBooleanArray(1);
        setField(term1675, term1675.getClass(), "graph", null);
        setField(term1675, term1675.getClass(), "comparator", null);
        setField(term1675, term1675.getClass(), "keys", term1676);
        setIntElement(term1677, 0, 842904495);
        setIntElement(term1677, 1, 1008080511);
        setIntElement(term1677, 2, 1935707624);
        setIntElement(term1677, 3, 1507074215);
        setIntElement(term1677, 4, -282881827);
        setIntElement(term1677, 5, -1183353915);
        setIntElement(term1677, 6, -420030135);
        setIntElement(term1677, 7, 267763294);
        setIntElement(term1677, 8, -1497710478);
        setField(term1675, term1675.getClass(), "positions", term1677);
        setIntField(term1675, term1675.getClass(), "size", 49950830);
        setField(term1674, term1674.getClass(), "heap", term1675);
        setIntField(term1674, term1674.getClass(), "source", -525257914);
        setIntElement(term1689, 0, 147209682);
        setIntElement(term1689, 1, 34470066);
        setIntElement(term1689, 2, 2058711405);
        setIntElement(term1689, 3, 1743683601);
        setIntElement(term1689, 4, -945116798);
        setField(term1674, term1674.getClass(), "vertices", term1689);
        setDoubleElement(term1695, 0, 0.3294886032690195);
        setField(term1674, term1674.getClass(), "cost", term1695);
        setIntElement(term1697, 0, 1593461795);
        setIntElement(term1697, 1, 515182546);
        setField(term1674, term1674.getClass(), "before", term1697);
        setIntElement(term1700, 0, -936895502);
        setIntElement(term1700, 1, -129547140);
        setIntElement(term1700, 2, 199287428);
        setIntElement(term1700, 3, -1195339592);
        setIntElement(term1700, 4, -376422566);
        setIntElement(term1700, 5, 306847454);
        setIntElement(term1700, 6, 1745276158);
        setIntElement(term1700, 7, 2009020256);
        setField(term1674, term1674.getClass(), "size", term1700);
        setBooleanElement(term1709, 0, true);
        setField(term1674, term1674.getClass(), "solved", term1709);
        setIntField(term1674, term1674.getClass(), "numSolved", 2049577015);
        setField(term1674, term1674.getClass(), "graph", null);
        setBooleanField(term1674, term1674.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.DijkstraShortestPathHeap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "preCompute", argTypes, term1674, args);
    }

};


