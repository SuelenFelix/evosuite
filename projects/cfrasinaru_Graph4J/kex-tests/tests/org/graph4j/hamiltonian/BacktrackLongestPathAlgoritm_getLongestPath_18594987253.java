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

public class BacktrackLongestPathAlgoritm_getLongestPath_18594987253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87;
     Object term118;
     Object term120;

    public BacktrackLongestPathAlgoritm_getLongestPath_18594987253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87 = newInstance(Class.forName("org.graph4j.hamiltonian.BacktrackLongestPathAlgoritm"));
        Object term88 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term90 = (int[]) newIntArray(1);
        Object term94 = newInstance(Class.forName("java.util.BitSet"));
        long[] term95 = (long[]) newLongArray(1);
        Object term99 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term101 = (int[]) newIntArray(6);
        Object term110 = newInstance(Class.forName("java.util.BitSet"));
        long[] term111 = (long[]) newLongArray(1);
        setIntField(term88, term88.getClass(), "numEdges", -469968304);
        setField(term88, term88.getClass(), "graph", null);
        setIntElement(term90, 0, -1145578966);
        setField(term88, term88.getClass(), "vertices", term90);
        setIntField(term88, term88.getClass(), "numVertices", 679763016);
        setIntField(term88, term88.getClass(), "first", 1962444399);
        setField(term94, term94.getClass(), "words", term95);
        setIntField(term94, term94.getClass(), "wordsInUse", 767834723);
        setBooleanField(term94, term94.getClass(), "sizeIsSticky", true);
        setField(term88, term88.getClass(), "bitset", term94);
        setField(term87, term87.getClass(), "currentBest", term88);
        setIntField(term99, term99.getClass(), "numEdges", -602026508);
        setField(term99, term99.getClass(), "graph", null);
        setIntElement(term101, 0, -157887805);
        setIntElement(term101, 1, 1876565163);
        setIntElement(term101, 2, -817164822);
        setIntElement(term101, 3, -1016503459);
        setIntElement(term101, 4, -1968847291);
        setIntElement(term101, 5, 579005622);
        setField(term99, term99.getClass(), "vertices", term101);
        setIntField(term99, term99.getClass(), "numVertices", -14890619);
        setIntField(term99, term99.getClass(), "first", 1632125673);
        setField(term110, term110.getClass(), "words", term111);
        setIntField(term110, term110.getClass(), "wordsInUse", 454281060);
        setBooleanField(term110, term110.getClass(), "sizeIsSticky", true);
        setField(term99, term99.getClass(), "bitset", term110);
        setField(term87, term87.getClass(), "currentPath", term99);
        setIntField(term87, term87.getClass(), "source", -1786399638);
        setIntField(term87, term87.getClass(), "target", 2055867847);
        setField(term87, term87.getClass(), "graph", null);
        setBooleanField(term87, term87.getClass(), "directed", false);
        term118 = new Integer(-1048298087);
        term120 = new Integer(292681826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.hamiltonian.BacktrackLongestPathAlgoritm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term118;
        args[1] = term120;
        callMethod(klass, "getLongestPath", argTypes, term87, args);
    }

};


