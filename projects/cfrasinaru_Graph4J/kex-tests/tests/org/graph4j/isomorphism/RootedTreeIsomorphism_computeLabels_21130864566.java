package org.graph4j.isomorphism;

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
import static org.graph4j.isomorphism.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Integer;

public class RootedTreeIsomorphism_computeLabels_21130864566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12078;
     Object term12120;
     Object term12122;
     Object term12138;

    public RootedTreeIsomorphism_computeLabels_21130864566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12099 = new HashMap();
        Boolean term12105 = new Boolean(true);
        term12078 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        int[] term12081 = (int[]) newIntArray(8);
        int[] term12090 = (int[]) newIntArray(8);
        Object term12107 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        int[] term12108 = (int[]) newIntArray(9);
        int[] term12118 = (int[]) newIntArray(1);
        setField(term12078, term12078.getClass(), "tree1", null);
        setField(term12078, term12078.getClass(), "tree2", null);
        setIntField(term12078, term12078.getClass(), "root1", 1000189054);
        setIntField(term12078, term12078.getClass(), "root2", 832500285);
        setIntElement(term12081, 0, 1519973734);
        setIntElement(term12081, 1, -988300994);
        setIntElement(term12081, 2, 1939692211);
        setIntElement(term12081, 3, 121806851);
        setIntElement(term12081, 4, 1753247664);
        setIntElement(term12081, 5, 521507971);
        setIntElement(term12081, 6, 1760654275);
        setIntElement(term12081, 7, -1048247843);
        setField(term12078, term12078.getClass(), "labels1", term12081);
        setIntElement(term12090, 0, -545135207);
        setIntElement(term12090, 1, 969786656);
        setIntElement(term12090, 2, -1568320050);
        setIntElement(term12090, 3, 398869857);
        setIntElement(term12090, 4, -2011847985);
        setIntElement(term12090, 5, 1113480119);
        setIntElement(term12090, 6, -159235116);
        setIntElement(term12090, 7, 1280384723);
        setField(term12078, term12078.getClass(), "labels2", term12090);
        setField(term12078, term12078.getClass(), "labelListToInt", term12099);
        setIntField(term12078, term12078.getClass(), "maxLabel", 1755299610);
        setField(term12078, term12078.getClass(), "isomorphic", term12105);
        setField(term12107, term12107.getClass(), "graph1", null);
        setField(term12107, term12107.getClass(), "graph2", null);
        setIntElement(term12108, 0, 1141997389);
        setIntElement(term12108, 1, -1491507262);
        setIntElement(term12108, 2, 1071463645);
        setIntElement(term12108, 3, 165616136);
        setIntElement(term12108, 4, 887351836);
        setIntElement(term12108, 5, 2002612399);
        setIntElement(term12108, 6, -1256668289);
        setIntElement(term12108, 7, -1377964851);
        setIntElement(term12108, 8, -1288314969);
        setField(term12107, term12107.getClass(), "mapping", term12108);
        setIntElement(term12118, 0, -1625206430);
        setField(term12107, term12107.getClass(), "inverse", term12118);
        setField(term12078, term12078.getClass(), "isomorphism", term12107);
        setField(term12078, term12078.getClass(), "sortingAlgorithm", null);
        term12120 = new Integer(1599734340);
        term12122 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term12123 = (int[]) newIntArray(7);
        Object term12133 = newInstance(Class.forName("java.util.BitSet"));
        long[] term12134 = (long[]) newLongArray(1);
        setField(term12122, term12122.getClass(), "graph", null);
        setIntElement(term12123, 0, 1262425699);
        setIntElement(term12123, 1, -515051505);
        setIntElement(term12123, 2, -1071258857);
        setIntElement(term12123, 3, 1274665398);
        setIntElement(term12123, 4, -1093564935);
        setIntElement(term12123, 5, -1092739931);
        setIntElement(term12123, 6, 859336834);
        setField(term12122, term12122.getClass(), "vertices", term12123);
        setIntField(term12122, term12122.getClass(), "numVertices", -924154861);
        setIntField(term12122, term12122.getClass(), "first", -1878694006);
        setField(term12133, term12133.getClass(), "words", term12134);
        setIntField(term12133, term12133.getClass(), "wordsInUse", 1950167487);
        setBooleanField(term12133, term12133.getClass(), "sizeIsSticky", true);
        setField(term12122, term12122.getClass(), "bitset", term12133);
        term12138 = (int[]) newIntArray(3);
        setIntElement(term12138, 0, 1031826708);
        setIntElement(term12138, 1, -735726273);
        setIntElement(term12138, 2, 1618278091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.graph4j.util.VertexList");
        argTypes[3] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term12120;
        args[2] = term12122;
        args[3] = term12138;
        callMethod(klass, "computeLabels", argTypes, term12078, args);
    }

};


