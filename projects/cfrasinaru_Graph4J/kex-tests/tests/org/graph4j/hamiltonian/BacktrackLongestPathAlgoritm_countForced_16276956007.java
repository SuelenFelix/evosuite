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

public class BacktrackLongestPathAlgoritm_countForced_16276956007 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263;
     Object term294;

    public BacktrackLongestPathAlgoritm_countForced_16276956007() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263 = newInstance(Class.forName("org.graph4j.hamiltonian.BacktrackLongestPathAlgoritm"));
        Object term264 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term266 = (int[]) newIntArray(5);
        Object term274 = newInstance(Class.forName("java.util.BitSet"));
        long[] term275 = (long[]) newLongArray(1);
        Object term279 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term281 = (int[]) newIntArray(2);
        Object term286 = newInstance(Class.forName("java.util.BitSet"));
        long[] term287 = (long[]) newLongArray(1);
        setIntField(term264, term264.getClass(), "numEdges", 1141317871);
        setField(term264, term264.getClass(), "graph", null);
        setIntElement(term266, 0, 890669485);
        setIntElement(term266, 1, 691577392);
        setIntElement(term266, 2, -893623680);
        setIntElement(term266, 3, -1963434938);
        setIntElement(term266, 4, 906181092);
        setField(term264, term264.getClass(), "vertices", term266);
        setIntField(term264, term264.getClass(), "numVertices", 1045657203);
        setIntField(term264, term264.getClass(), "first", 1386130016);
        setField(term274, term274.getClass(), "words", term275);
        setIntField(term274, term274.getClass(), "wordsInUse", 1072005683);
        setBooleanField(term274, term274.getClass(), "sizeIsSticky", false);
        setField(term264, term264.getClass(), "bitset", term274);
        setField(term263, term263.getClass(), "currentBest", term264);
        setIntField(term279, term279.getClass(), "numEdges", 1861318859);
        setField(term279, term279.getClass(), "graph", null);
        setIntElement(term281, 0, 1474524152);
        setIntElement(term281, 1, 568954359);
        setField(term279, term279.getClass(), "vertices", term281);
        setIntField(term279, term279.getClass(), "numVertices", 53410913);
        setIntField(term279, term279.getClass(), "first", -375014958);
        setField(term286, term286.getClass(), "words", term287);
        setIntField(term286, term286.getClass(), "wordsInUse", 1107176718);
        setBooleanField(term286, term286.getClass(), "sizeIsSticky", false);
        setField(term279, term279.getClass(), "bitset", term286);
        setField(term263, term263.getClass(), "currentPath", term279);
        setIntField(term263, term263.getClass(), "source", 480137250);
        setIntField(term263, term263.getClass(), "target", -341152642);
        setField(term263, term263.getClass(), "graph", null);
        setBooleanField(term263, term263.getClass(), "directed", true);
        term294 = new Integer(-2015854073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.hamiltonian.BacktrackLongestPathAlgoritm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term294;
        callMethod(klass, "countForced", argTypes, term263, args);
    }

};


