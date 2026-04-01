package org.graph4j.route;

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
import static org.graph4j.route.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MaximumInducedPath_findPath_4864417161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term817;

    public MaximumInducedPath_findPath_4864417161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term817 = newInstance(Class.forName("org.graph4j.route.MaximumInducedPath"));
        Object term818 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term820 = (int[]) newIntArray(6);
        Object term829 = newInstance(Class.forName("java.util.BitSet"));
        long[] term830 = (long[]) newLongArray(1);
        Object term834 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term836 = (int[]) newIntArray(2);
        Object term841 = newInstance(Class.forName("java.util.BitSet"));
        long[] term842 = (long[]) newLongArray(1);
        setIntField(term818, term818.getClass(), "numEdges", 1168633950);
        setField(term818, term818.getClass(), "graph", null);
        setIntElement(term820, 0, 1607082164);
        setIntElement(term820, 1, 1890399366);
        setIntElement(term820, 2, -1867239125);
        setIntElement(term820, 3, 952869601);
        setIntElement(term820, 4, 91958879);
        setIntElement(term820, 5, -645429025);
        setField(term818, term818.getClass(), "vertices", term820);
        setIntField(term818, term818.getClass(), "numVertices", -688213483);
        setIntField(term818, term818.getClass(), "first", 644154104);
        setField(term829, term829.getClass(), "words", term830);
        setIntField(term829, term829.getClass(), "wordsInUse", 76650923);
        setBooleanField(term829, term829.getClass(), "sizeIsSticky", true);
        setField(term818, term818.getClass(), "bitset", term829);
        setField(term817, term817.getClass(), "currentPath", term818);
        setIntField(term834, term834.getClass(), "numEdges", 1003743923);
        setField(term834, term834.getClass(), "graph", null);
        setIntElement(term836, 0, 1887772522);
        setIntElement(term836, 1, 354196060);
        setField(term834, term834.getClass(), "vertices", term836);
        setIntField(term834, term834.getClass(), "numVertices", -1840305774);
        setIntField(term834, term834.getClass(), "first", 1365087144);
        setField(term841, term841.getClass(), "words", term842);
        setIntField(term841, term841.getClass(), "wordsInUse", -1537255112);
        setBooleanField(term841, term841.getClass(), "sizeIsSticky", false);
        setField(term834, term834.getClass(), "bitset", term841);
        setField(term817, term817.getClass(), "maxPath", term834);
        setField(term817, term817.getClass(), "graph", null);
        setBooleanField(term817, term817.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.MaximumInducedPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findPath", argTypes, term817, args);
    }

};


