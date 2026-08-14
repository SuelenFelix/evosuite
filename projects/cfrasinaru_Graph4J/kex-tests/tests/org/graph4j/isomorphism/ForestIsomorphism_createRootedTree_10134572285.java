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
import java.lang.Object;
import java.util.HashMap;
import java.lang.Boolean;
import java.util.LinkedList;

public class ForestIsomorphism_createRootedTree_10134572285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3248;
     Object term3281;

    public ForestIsomorphism_createRootedTree_10134572285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3261 = new HashMap();
        Boolean term3267 = new Boolean(false);
        Boolean term3278 = new Boolean(false);
        term3248 = newInstance(Class.forName("org.graph4j.isomorphism.ForestIsomorphism"));
        Object term3249 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        int[] term3252 = (int[]) newIntArray(3);
        int[] term3256 = (int[]) newIntArray(4);
        Object term3269 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        int[] term3270 = (int[]) newIntArray(5);
        int[] term3276 = (int[]) newIntArray(1);
        Object term3280 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        setField(term3248, term3248.getClass(), "forest1", null);
        setField(term3248, term3248.getClass(), "forest2", null);
        setField(term3249, term3249.getClass(), "tree1", null);
        setField(term3249, term3249.getClass(), "tree2", null);
        setIntField(term3249, term3249.getClass(), "root1", 335780735);
        setIntField(term3249, term3249.getClass(), "root2", -1541981599);
        setIntElement(term3252, 0, 1605456363);
        setIntElement(term3252, 1, 2059896693);
        setIntElement(term3252, 2, 2109912812);
        setField(term3249, term3249.getClass(), "labels1", term3252);
        setIntElement(term3256, 0, 1841286431);
        setIntElement(term3256, 1, -1723168189);
        setIntElement(term3256, 2, -675283917);
        setIntElement(term3256, 3, -2093862988);
        setField(term3249, term3249.getClass(), "labels2", term3256);
        setField(term3249, term3249.getClass(), "labelListToInt", term3261);
        setIntField(term3249, term3249.getClass(), "maxLabel", 1337828646);
        setField(term3249, term3249.getClass(), "isomorphic", term3267);
        setField(term3269, term3269.getClass(), "graph1", null);
        setField(term3269, term3269.getClass(), "graph2", null);
        setIntElement(term3270, 0, 532666604);
        setIntElement(term3270, 1, -13725716);
        setIntElement(term3270, 2, -1695750603);
        setIntElement(term3270, 3, 63677360);
        setIntElement(term3270, 4, 1478914037);
        setField(term3269, term3269.getClass(), "mapping", term3270);
        setIntElement(term3276, 0, 1630231519);
        setField(term3269, term3269.getClass(), "inverse", term3276);
        setField(term3249, term3249.getClass(), "isomorphism", term3269);
        setField(term3249, term3249.getClass(), "sortingAlgorithm", null);
        setField(term3248, term3248.getClass(), "rootedTreeAlg", term3249);
        setField(term3248, term3248.getClass(), "isomorphic", term3278);
        setField(term3280, term3280.getClass(), "graph1", null);
        setField(term3280, term3280.getClass(), "graph2", null);
        setField(term3280, term3280.getClass(), "mapping", null);
        setField(term3280, term3280.getClass(), "inverse", null);
        setField(term3248, term3248.getClass(), "isomorphism", term3280);
        Object term3284 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3285 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3286 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3290 = (int[]) newIntArray(2);
        Object term3295 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3296 = (long[]) newLongArray(1);
        setField(term3285, term3285.getClass(), "table", term3286);
        setIntField(term3285, term3285.getClass(), "count", 1460702778);
        setIntField(term3285, term3285.getClass(), "threshold", 15);
        setFloatField(term3285, term3285.getClass(), "loadFactor", 0.75F);
        setField(term3284, term3284.getClass(), "posMap", term3285);
        setField(term3284, term3284.getClass(), "graph", null);
        setIntElement(term3290, 0, -1398142433);
        setIntElement(term3290, 1, -1112119058);
        setField(term3284, term3284.getClass(), "vertices", term3290);
        setIntField(term3284, term3284.getClass(), "numVertices", 2073858334);
        setIntField(term3284, term3284.getClass(), "first", -1693535639);
        setField(term3295, term3295.getClass(), "words", term3296);
        setIntField(term3295, term3295.getClass(), "wordsInUse", 1344744036);
        setBooleanField(term3295, term3295.getClass(), "sizeIsSticky", true);
        setField(term3284, term3284.getClass(), "bitset", term3295);
        term3281 = new LinkedList();
        ((LinkedList) term3281).add(term3284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.ForestIsomorphism");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3281;
        callMethod(klass, "createRootedTree", argTypes, term3248, args);
    }

};


