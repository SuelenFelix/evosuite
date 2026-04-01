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

public class BacktrackLongestPathAlgoritm_getPathRec_16751442515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173;

    public BacktrackLongestPathAlgoritm_getPathRec_16751442515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173 = newInstance(Class.forName("org.graph4j.hamiltonian.BacktrackLongestPathAlgoritm"));
        Object term174 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term176 = (int[]) newIntArray(7);
        Object term186 = newInstance(Class.forName("java.util.BitSet"));
        long[] term187 = (long[]) newLongArray(1);
        Object term191 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term193 = (int[]) newIntArray(1);
        Object term197 = newInstance(Class.forName("java.util.BitSet"));
        long[] term198 = (long[]) newLongArray(1);
        setIntField(term174, term174.getClass(), "numEdges", 335112684);
        setField(term174, term174.getClass(), "graph", null);
        setIntElement(term176, 0, 1551099402);
        setIntElement(term176, 1, -2027534003);
        setIntElement(term176, 2, 1063420942);
        setIntElement(term176, 3, 1375330971);
        setIntElement(term176, 4, -478195677);
        setIntElement(term176, 5, 972867650);
        setIntElement(term176, 6, 1655935355);
        setField(term174, term174.getClass(), "vertices", term176);
        setIntField(term174, term174.getClass(), "numVertices", -481533957);
        setIntField(term174, term174.getClass(), "first", 1240914516);
        setField(term186, term186.getClass(), "words", term187);
        setIntField(term186, term186.getClass(), "wordsInUse", -1465035361);
        setBooleanField(term186, term186.getClass(), "sizeIsSticky", false);
        setField(term174, term174.getClass(), "bitset", term186);
        setField(term173, term173.getClass(), "currentBest", term174);
        setIntField(term191, term191.getClass(), "numEdges", 1090617576);
        setField(term191, term191.getClass(), "graph", null);
        setIntElement(term193, 0, -1547384488);
        setField(term191, term191.getClass(), "vertices", term193);
        setIntField(term191, term191.getClass(), "numVertices", 1442160736);
        setIntField(term191, term191.getClass(), "first", 1114000454);
        setField(term197, term197.getClass(), "words", term198);
        setIntField(term197, term197.getClass(), "wordsInUse", -556405712);
        setBooleanField(term197, term197.getClass(), "sizeIsSticky", true);
        setField(term191, term191.getClass(), "bitset", term197);
        setField(term173, term173.getClass(), "currentPath", term191);
        setIntField(term173, term173.getClass(), "source", -1772434990);
        setIntField(term173, term173.getClass(), "target", -1845499264);
        setField(term173, term173.getClass(), "graph", null);
        setBooleanField(term173, term173.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.hamiltonian.BacktrackLongestPathAlgoritm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathRec", argTypes, term173, args);
    }

};


