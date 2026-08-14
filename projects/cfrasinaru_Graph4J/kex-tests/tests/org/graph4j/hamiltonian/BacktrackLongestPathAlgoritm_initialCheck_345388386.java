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

public class BacktrackLongestPathAlgoritm_initialCheck_345388386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215;

    public BacktrackLongestPathAlgoritm_initialCheck_345388386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215 = newInstance(Class.forName("org.graph4j.hamiltonian.BacktrackLongestPathAlgoritm"));
        Object term216 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term218 = (int[]) newIntArray(6);
        Object term227 = newInstance(Class.forName("java.util.BitSet"));
        long[] term228 = (long[]) newLongArray(1);
        Object term232 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term234 = (int[]) newIntArray(5);
        Object term242 = newInstance(Class.forName("java.util.BitSet"));
        long[] term243 = (long[]) newLongArray(1);
        setIntField(term216, term216.getClass(), "numEdges", -505439934);
        setField(term216, term216.getClass(), "graph", null);
        setIntElement(term218, 0, -344842608);
        setIntElement(term218, 1, 941650513);
        setIntElement(term218, 2, 444029505);
        setIntElement(term218, 3, -1034506028);
        setIntElement(term218, 4, -1263114719);
        setIntElement(term218, 5, -894662986);
        setField(term216, term216.getClass(), "vertices", term218);
        setIntField(term216, term216.getClass(), "numVertices", 304775596);
        setIntField(term216, term216.getClass(), "first", -1347665717);
        setField(term227, term227.getClass(), "words", term228);
        setIntField(term227, term227.getClass(), "wordsInUse", -1888585309);
        setBooleanField(term227, term227.getClass(), "sizeIsSticky", false);
        setField(term216, term216.getClass(), "bitset", term227);
        setField(term215, term215.getClass(), "currentBest", term216);
        setIntField(term232, term232.getClass(), "numEdges", 683666002);
        setField(term232, term232.getClass(), "graph", null);
        setIntElement(term234, 0, 1596213415);
        setIntElement(term234, 1, -268815336);
        setIntElement(term234, 2, -1210583429);
        setIntElement(term234, 3, -663691365);
        setIntElement(term234, 4, 339854490);
        setField(term232, term232.getClass(), "vertices", term234);
        setIntField(term232, term232.getClass(), "numVertices", -615654495);
        setIntField(term232, term232.getClass(), "first", -1476117762);
        setField(term242, term242.getClass(), "words", term243);
        setIntField(term242, term242.getClass(), "wordsInUse", -341962980);
        setBooleanField(term242, term242.getClass(), "sizeIsSticky", true);
        setField(term232, term232.getClass(), "bitset", term242);
        setField(term215, term215.getClass(), "currentPath", term232);
        setIntField(term215, term215.getClass(), "source", 1532716628);
        setIntField(term215, term215.getClass(), "target", -1801760683);
        setField(term215, term215.getClass(), "graph", null);
        setBooleanField(term215, term215.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.hamiltonian.BacktrackLongestPathAlgoritm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initialCheck", argTypes, term215, args);
    }

};


