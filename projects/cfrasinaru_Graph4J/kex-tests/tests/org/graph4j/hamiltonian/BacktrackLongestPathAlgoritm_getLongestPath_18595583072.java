package org.graph4j.hamiltonian;

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
import static org.graph4j.hamiltonian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class BacktrackLongestPathAlgoritm_getLongestPath_18595583072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;
     Object term76;

    public BacktrackLongestPathAlgoritm_getLongestPath_18595583072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45 = newInstance(Class.forName("org.graph4j.hamiltonian.BacktrackLongestPathAlgoritm"));
        Object term46 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term48 = (int[]) newIntArray(3);
        Object term54 = newInstance(Class.forName("java.util.BitSet"));
        long[] term55 = (long[]) newLongArray(1);
        Object term59 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term61 = (int[]) newIntArray(4);
        Object term68 = newInstance(Class.forName("java.util.BitSet"));
        long[] term69 = (long[]) newLongArray(1);
        setIntField(term46, term46.getClass(), "numEdges", 1048535127);
        setField(term46, term46.getClass(), "graph", null);
        setIntElement(term48, 0, -655067527);
        setIntElement(term48, 1, -6029667);
        setIntElement(term48, 2, -2068769794);
        setField(term46, term46.getClass(), "vertices", term48);
        setIntField(term46, term46.getClass(), "numVertices", -117576464);
        setIntField(term46, term46.getClass(), "first", -1007160944);
        setField(term54, term54.getClass(), "words", term55);
        setIntField(term54, term54.getClass(), "wordsInUse", 1135664017);
        setBooleanField(term54, term54.getClass(), "sizeIsSticky", false);
        setField(term46, term46.getClass(), "bitset", term54);
        setField(term45, term45.getClass(), "currentBest", term46);
        setIntField(term59, term59.getClass(), "numEdges", 590364439);
        setField(term59, term59.getClass(), "graph", null);
        setIntElement(term61, 0, 865208305);
        setIntElement(term61, 1, -1275173084);
        setIntElement(term61, 2, -244121226);
        setIntElement(term61, 3, -203030934);
        setField(term59, term59.getClass(), "vertices", term61);
        setIntField(term59, term59.getClass(), "numVertices", -1179120542);
        setIntField(term59, term59.getClass(), "first", -73683645);
        setField(term68, term68.getClass(), "words", term69);
        setIntField(term68, term68.getClass(), "wordsInUse", -226514366);
        setBooleanField(term68, term68.getClass(), "sizeIsSticky", true);
        setField(term59, term59.getClass(), "bitset", term68);
        setField(term45, term45.getClass(), "currentPath", term59);
        setIntField(term45, term45.getClass(), "source", 1193880199);
        setIntField(term45, term45.getClass(), "target", -1087774327);
        setField(term45, term45.getClass(), "graph", null);
        setBooleanField(term45, term45.getClass(), "directed", true);
        term76 = new Integer(-1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.hamiltonian.BacktrackLongestPathAlgoritm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term76;
        callMethod(klass, "getLongestPath", argTypes, term45, args);
    }

};


