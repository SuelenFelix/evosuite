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

public class DijkstraShortestPathDefault_findMinIndex_9668714181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334;

    public DijkstraShortestPathDefault_findMinIndex_9668714181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term334 = newInstance(Class.forName("org.graph4j.shortestpath.DijkstraShortestPathDefault"));
        int[] term336 = (int[]) newIntArray(9);
        double[] term346 = (double[]) newDoubleArray(4);
        int[] term351 = (int[]) newIntArray(8);
        int[] term360 = (int[]) newIntArray(6);
        boolean[] term367 = (boolean[]) newBooleanArray(2);
        setIntField(term334, term334.getClass(), "source", 458147407);
        setIntElement(term336, 0, -184153539);
        setIntElement(term336, 1, 493620644);
        setIntElement(term336, 2, 1328271830);
        setIntElement(term336, 3, 1596070772);
        setIntElement(term336, 4, 97029295);
        setIntElement(term336, 5, -1371869594);
        setIntElement(term336, 6, -2095575670);
        setIntElement(term336, 7, 1225272962);
        setIntElement(term336, 8, 1324040357);
        setField(term334, term334.getClass(), "vertices", term336);
        setDoubleElement(term346, 0, 0.6047137830113202);
        setDoubleElement(term346, 1, 0.6767213143579776);
        setDoubleElement(term346, 2, 0.48862955528902696);
        setDoubleElement(term346, 3, 0.426231085465289);
        setField(term334, term334.getClass(), "cost", term346);
        setIntElement(term351, 0, -1588772968);
        setIntElement(term351, 1, -93135961);
        setIntElement(term351, 2, -112921587);
        setIntElement(term351, 3, 933028652);
        setIntElement(term351, 4, 287287233);
        setIntElement(term351, 5, 962840079);
        setIntElement(term351, 6, 1540719661);
        setIntElement(term351, 7, 1265463001);
        setField(term334, term334.getClass(), "before", term351);
        setIntElement(term360, 0, 335112684);
        setIntElement(term360, 1, 1551099402);
        setIntElement(term360, 2, -2027534003);
        setIntElement(term360, 3, 1063420942);
        setIntElement(term360, 4, 1375330971);
        setIntElement(term360, 5, -478195677);
        setField(term334, term334.getClass(), "size", term360);
        setBooleanElement(term367, 0, true);
        setBooleanElement(term367, 1, true);
        setField(term334, term334.getClass(), "solved", term367);
        setIntField(term334, term334.getClass(), "numSolved", 972867650);
        setField(term334, term334.getClass(), "graph", null);
        setBooleanField(term334, term334.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.DijkstraShortestPathDefault");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findMinIndex", argTypes, term334, args);
    }

};


