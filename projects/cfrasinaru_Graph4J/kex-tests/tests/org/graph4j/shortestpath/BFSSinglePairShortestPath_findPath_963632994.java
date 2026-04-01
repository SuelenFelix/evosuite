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

public class BFSSinglePairShortestPath_findPath_963632994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119869;

    public BFSSinglePairShortestPath_findPath_963632994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119869 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath"));
        int[] term119872 = (int[]) newIntArray(6);
        Object term119879 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term119881 = (int[]) newIntArray(3);
        Object term119887 = newInstance(Class.forName("java.util.BitSet"));
        long[] term119888 = (long[]) newLongArray(1);
        setIntField(term119869, term119869.getClass(), "source", 128063546);
        setIntField(term119869, term119869.getClass(), "target", 708796296);
        setIntElement(term119872, 0, 131265477);
        setIntElement(term119872, 1, 268467759);
        setIntElement(term119872, 2, -982835812);
        setIntElement(term119872, 3, 1186918206);
        setIntElement(term119872, 4, -1277338163);
        setIntElement(term119872, 5, -583910918);
        setField(term119869, term119869.getClass(), "forbiddenVertices", term119872);
        setIntField(term119879, term119879.getClass(), "numEdges", 226497471);
        setField(term119879, term119879.getClass(), "graph", null);
        setIntElement(term119881, 0, 812740211);
        setIntElement(term119881, 1, -1023703523);
        setIntElement(term119881, 2, 1152661598);
        setField(term119879, term119879.getClass(), "vertices", term119881);
        setIntField(term119879, term119879.getClass(), "numVertices", 938746477);
        setIntField(term119879, term119879.getClass(), "first", 1687946692);
        setField(term119887, term119887.getClass(), "words", term119888);
        setIntField(term119887, term119887.getClass(), "wordsInUse", -1014618629);
        setBooleanField(term119887, term119887.getClass(), "sizeIsSticky", true);
        setField(term119879, term119879.getClass(), "bitset", term119887);
        setField(term119869, term119869.getClass(), "bestPath", term119879);
        setDoubleField(term119869, term119869.getClass(), "bestWeight", 0.41809039173687657);
        setField(term119869, term119869.getClass(), "graph", null);
        setBooleanField(term119869, term119869.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findPath", argTypes, term119869, args);
    }

};


