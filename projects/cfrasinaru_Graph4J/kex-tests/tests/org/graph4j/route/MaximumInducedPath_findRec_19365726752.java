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

public class MaximumInducedPath_findRec_19365726752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term857;

    public MaximumInducedPath_findRec_19365726752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term857 = newInstance(Class.forName("org.graph4j.route.MaximumInducedPath"));
        Object term858 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term860 = (int[]) newIntArray(6);
        Object term869 = newInstance(Class.forName("java.util.BitSet"));
        long[] term870 = (long[]) newLongArray(1);
        Object term874 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term876 = (int[]) newIntArray(7);
        Object term886 = newInstance(Class.forName("java.util.BitSet"));
        long[] term887 = (long[]) newLongArray(1);
        setIntField(term858, term858.getClass(), "numEdges", 934477462);
        setField(term858, term858.getClass(), "graph", null);
        setIntElement(term860, 0, 4900410);
        setIntElement(term860, 1, -1252345779);
        setIntElement(term860, 2, -2063365430);
        setIntElement(term860, 3, 812570053);
        setIntElement(term860, 4, -1488938905);
        setIntElement(term860, 5, 1916544127);
        setField(term858, term858.getClass(), "vertices", term860);
        setIntField(term858, term858.getClass(), "numVertices", -1133405894);
        setIntField(term858, term858.getClass(), "first", 1289741214);
        setField(term869, term869.getClass(), "words", term870);
        setIntField(term869, term869.getClass(), "wordsInUse", 243280944);
        setBooleanField(term869, term869.getClass(), "sizeIsSticky", false);
        setField(term858, term858.getClass(), "bitset", term869);
        setField(term857, term857.getClass(), "currentPath", term858);
        setIntField(term874, term874.getClass(), "numEdges", -726681073);
        setField(term874, term874.getClass(), "graph", null);
        setIntElement(term876, 0, -1724487863);
        setIntElement(term876, 1, -128490829);
        setIntElement(term876, 2, 202214133);
        setIntElement(term876, 3, 1543091617);
        setIntElement(term876, 4, -763166094);
        setIntElement(term876, 5, -222941705);
        setIntElement(term876, 6, 291864719);
        setField(term874, term874.getClass(), "vertices", term876);
        setIntField(term874, term874.getClass(), "numVertices", -1549607466);
        setIntField(term874, term874.getClass(), "first", 853609788);
        setField(term886, term886.getClass(), "words", term887);
        setIntField(term886, term886.getClass(), "wordsInUse", -197820800);
        setBooleanField(term886, term886.getClass(), "sizeIsSticky", false);
        setField(term874, term874.getClass(), "bitset", term886);
        setField(term857, term857.getClass(), "maxPath", term874);
        setField(term857, term857.getClass(), "graph", null);
        setBooleanField(term857, term857.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.MaximumInducedPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findRec", argTypes, term857, args);
    }

};


