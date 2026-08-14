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

public class RootedForestIsomorphism_buildRootedTree_13802691426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3848;
     Object term3915;

    public RootedForestIsomorphism_buildRootedTree_13802691426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3904 = new HashMap();
        Boolean term3910 = new Boolean(false);
        term3848 = newInstance(Class.forName("org.graph4j.isomorphism.RootedForestIsomorphism"));
        Object term3849 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3850 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3851 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3855 = (int[]) newIntArray(1);
        Object term3859 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3860 = (long[]) newLongArray(1);
        Object term3864 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3865 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3866 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3870 = (int[]) newIntArray(4);
        Object term3877 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3878 = (long[]) newLongArray(1);
        Object term3882 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        int[] term3885 = (int[]) newIntArray(9);
        int[] term3895 = (int[]) newIntArray(8);
        Object term3912 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        setField(term3848, term3848.getClass(), "forest1", null);
        setField(term3848, term3848.getClass(), "forest2", null);
        setField(term3850, term3850.getClass(), "table", term3851);
        setIntField(term3850, term3850.getClass(), "count", -1330529019);
        setIntField(term3850, term3850.getClass(), "threshold", 15);
        setFloatField(term3850, term3850.getClass(), "loadFactor", 0.75F);
        setField(term3849, term3849.getClass(), "posMap", term3850);
        setField(term3849, term3849.getClass(), "graph", null);
        setIntElement(term3855, 0, 237134844);
        setField(term3849, term3849.getClass(), "vertices", term3855);
        setIntField(term3849, term3849.getClass(), "numVertices", 2076413861);
        setIntField(term3849, term3849.getClass(), "first", 66817373);
        setField(term3859, term3859.getClass(), "words", term3860);
        setIntField(term3859, term3859.getClass(), "wordsInUse", 1459628013);
        setBooleanField(term3859, term3859.getClass(), "sizeIsSticky", false);
        setField(term3849, term3849.getClass(), "bitset", term3859);
        setField(term3848, term3848.getClass(), "roots1", term3849);
        setField(term3865, term3865.getClass(), "table", term3866);
        setIntField(term3865, term3865.getClass(), "count", -1641507499);
        setIntField(term3865, term3865.getClass(), "threshold", 15);
        setFloatField(term3865, term3865.getClass(), "loadFactor", 0.75F);
        setField(term3864, term3864.getClass(), "posMap", term3865);
        setField(term3864, term3864.getClass(), "graph", null);
        setIntElement(term3870, 0, -33436796);
        setIntElement(term3870, 1, -1527326823);
        setIntElement(term3870, 2, 469871899);
        setIntElement(term3870, 3, -1348703436);
        setField(term3864, term3864.getClass(), "vertices", term3870);
        setIntField(term3864, term3864.getClass(), "numVertices", -2027012650);
        setIntField(term3864, term3864.getClass(), "first", 1343432022);
        setField(term3877, term3877.getClass(), "words", term3878);
        setIntField(term3877, term3877.getClass(), "wordsInUse", -1767079160);
        setBooleanField(term3877, term3877.getClass(), "sizeIsSticky", true);
        setField(term3864, term3864.getClass(), "bitset", term3877);
        setField(term3848, term3848.getClass(), "roots2", term3864);
        setField(term3882, term3882.getClass(), "tree1", null);
        setField(term3882, term3882.getClass(), "tree2", null);
        setIntField(term3882, term3882.getClass(), "root1", -201010601);
        setIntField(term3882, term3882.getClass(), "root2", 2060027076);
        setIntElement(term3885, 0, 2084868811);
        setIntElement(term3885, 1, 314478878);
        setIntElement(term3885, 2, 1425342686);
        setIntElement(term3885, 3, -1042470635);
        setIntElement(term3885, 4, -524352937);
        setIntElement(term3885, 5, 1472218987);
        setIntElement(term3885, 6, 805176809);
        setIntElement(term3885, 7, -82632953);
        setIntElement(term3885, 8, -1473876284);
        setField(term3882, term3882.getClass(), "labels1", term3885);
        setIntElement(term3895, 0, -1389314671);
        setIntElement(term3895, 1, -499699841);
        setIntElement(term3895, 2, 360972386);
        setIntElement(term3895, 3, -2063884849);
        setIntElement(term3895, 4, 1054887169);
        setIntElement(term3895, 5, 692873905);
        setIntElement(term3895, 6, 1734759369);
        setIntElement(term3895, 7, 1841493736);
        setField(term3882, term3882.getClass(), "labels2", term3895);
        setField(term3882, term3882.getClass(), "labelListToInt", term3904);
        setIntField(term3882, term3882.getClass(), "maxLabel", 320739944);
        setField(term3882, term3882.getClass(), "isomorphic", term3910);
        setField(term3912, term3912.getClass(), "graph1", null);
        setField(term3912, term3912.getClass(), "graph2", null);
        setField(term3912, term3912.getClass(), "mapping", null);
        setField(term3912, term3912.getClass(), "inverse", null);
        setField(term3882, term3882.getClass(), "isomorphism", term3912);
        setField(term3882, term3882.getClass(), "sortingAlgorithm", null);
        setField(term3848, term3848.getClass(), "rootedTreeAlg", term3882);
        setField(term3848, term3848.getClass(), "tree1", null);
        setField(term3848, term3848.getClass(), "tree2", null);
        setIntField(term3848, term3848.getClass(), "root1", 0);
        setIntField(term3848, term3848.getClass(), "root2", 0);
        setField(term3848, term3848.getClass(), "isomorphic", null);
        setField(term3848, term3848.getClass(), "isomorphism", null);
        term3915 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3916 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3917 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3921 = (int[]) newIntArray(7);
        Object term3931 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3932 = (long[]) newLongArray(1);
        setField(term3916, term3916.getClass(), "table", term3917);
        setIntField(term3916, term3916.getClass(), "count", 760218111);
        setIntField(term3916, term3916.getClass(), "threshold", 15);
        setFloatField(term3916, term3916.getClass(), "loadFactor", 0.75F);
        setField(term3915, term3915.getClass(), "posMap", term3916);
        setField(term3915, term3915.getClass(), "graph", null);
        setIntElement(term3921, 0, -1986366126);
        setIntElement(term3921, 1, -1963228619);
        setIntElement(term3921, 2, -709868952);
        setIntElement(term3921, 3, 847207929);
        setIntElement(term3921, 4, -1665928103);
        setIntElement(term3921, 5, 1574458332);
        setIntElement(term3921, 6, -975856245);
        setField(term3915, term3915.getClass(), "vertices", term3921);
        setIntField(term3915, term3915.getClass(), "numVertices", -1023366103);
        setIntField(term3915, term3915.getClass(), "first", 81427089);
        setField(term3931, term3931.getClass(), "words", term3932);
        setIntField(term3931, term3931.getClass(), "wordsInUse", 755951489);
        setBooleanField(term3931, term3931.getClass(), "sizeIsSticky", true);
        setField(term3915, term3915.getClass(), "bitset", term3931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.RootedForestIsomorphism");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3915;
        callMethod(klass, "buildRootedTree", argTypes, term3848, args);
    }

};


