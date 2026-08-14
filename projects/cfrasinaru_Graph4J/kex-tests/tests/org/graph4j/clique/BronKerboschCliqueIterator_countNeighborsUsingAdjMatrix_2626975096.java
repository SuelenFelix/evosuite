package org.graph4j.clique;

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
import static org.graph4j.clique.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayDeque;
import java.lang.Integer;

public class BronKerboschCliqueIterator_countNeighborsUsingAdjMatrix_2626975096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term979;
     Object term1058;
     Object term1060;

    public BronKerboschCliqueIterator_countNeighborsUsingAdjMatrix_2626975096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1009 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueIterator$Node"));
        Object term1010 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term1013 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term1016 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term1010, term1010.getClass(), "posMap", null);
        setField(term1010, term1010.getClass(), "graph", null);
        setField(term1010, term1010.getClass(), "vertices", null);
        setIntField(term1010, term1010.getClass(), "numVertices", -271094506);
        setIntField(term1010, term1010.getClass(), "first", 455632030);
        setField(term1010, term1010.getClass(), "bitset", null);
        setField(term1009, term1009.getClass(), "subg", term1010);
        setField(term1013, term1013.getClass(), "posMap", null);
        setField(term1013, term1013.getClass(), "graph", null);
        setField(term1013, term1013.getClass(), "vertices", null);
        setIntField(term1013, term1013.getClass(), "numVertices", 716486048);
        setIntField(term1013, term1013.getClass(), "first", -466708718);
        setField(term1013, term1013.getClass(), "bitset", null);
        setField(term1009, term1009.getClass(), "cand", term1013);
        setField(term1016, term1016.getClass(), "posMap", null);
        setField(term1016, term1016.getClass(), "graph", null);
        setField(term1016, term1016.getClass(), "vertices", null);
        setIntField(term1016, term1016.getClass(), "numVertices", -1608123016);
        setIntField(term1016, term1016.getClass(), "first", -896473214);
        setField(term1016, term1016.getClass(), "bitset", null);
        setField(term1009, term1009.getClass(), "ext", term1016);
        setField(term1009, term1009.getClass(), "this$0", null);
        ArrayDeque term1007 = new ArrayDeque();
        ((ArrayDeque) term1007).add(term1009);
        term979 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueIterator"));
        Object[] term980 = (Object[]) newArray("[I", 5);
        int[] term981 = (int[]) newIntArray(4);
        int[] term986 = (int[]) newIntArray(8);
        int[] term995 = (int[]) newIntArray(0);
        int[] term996 = (int[]) newIntArray(5);
        int[] term1002 = (int[]) newIntArray(4);
        Object term1021 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term1022 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term1023 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term1027 = (int[]) newIntArray(4);
        Object term1034 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1035 = (long[]) newLongArray(1);
        Object term1039 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term1040 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term1041 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term1045 = (int[]) newIntArray(5);
        Object term1053 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1054 = (long[]) newLongArray(1);
        setIntElement(term981, 0, 633765954);
        setIntElement(term981, 1, 269110087);
        setIntElement(term981, 2, 1545119095);
        setIntElement(term981, 3, 1671229683);
        setElement(term980, 0, term981);
        setIntElement(term986, 0, 34167717);
        setIntElement(term986, 1, -514195141);
        setIntElement(term986, 2, -297946422);
        setIntElement(term986, 3, 385463636);
        setIntElement(term986, 4, -1677599962);
        setIntElement(term986, 5, -1790275458);
        setIntElement(term986, 6, -497534255);
        setIntElement(term986, 7, 1588942911);
        setElement(term980, 1, term986);
        setElement(term980, 2, term995);
        setIntElement(term996, 0, -2129828854);
        setIntElement(term996, 1, -47438786);
        setIntElement(term996, 2, -1955400589);
        setIntElement(term996, 3, 626179200);
        setIntElement(term996, 4, -511077684);
        setElement(term980, 3, term996);
        setIntElement(term1002, 0, -711507760);
        setIntElement(term1002, 1, 1053773809);
        setIntElement(term1002, 2, 924127883);
        setIntElement(term1002, 3, -751079123);
        setElement(term980, 4, term1002);
        setField(term979, term979.getClass(), "adjMatrix", term980);
        setField(term979, term979.getClass(), "stack", term1007);
        setField(term1022, term1022.getClass(), "table", term1023);
        setIntField(term1022, term1022.getClass(), "count", -1212399479);
        setIntField(term1022, term1022.getClass(), "threshold", 15);
        setFloatField(term1022, term1022.getClass(), "loadFactor", 0.75F);
        setField(term1021, term1021.getClass(), "posMap", term1022);
        setField(term1021, term1021.getClass(), "graph", null);
        setIntElement(term1027, 0, 2107679041);
        setIntElement(term1027, 1, 2040965507);
        setIntElement(term1027, 2, -1281083262);
        setIntElement(term1027, 3, 1059930704);
        setField(term1021, term1021.getClass(), "vertices", term1027);
        setIntField(term1021, term1021.getClass(), "numVertices", -1967153290);
        setIntField(term1021, term1021.getClass(), "first", -1397251956);
        setField(term1034, term1034.getClass(), "words", term1035);
        setIntField(term1034, term1034.getClass(), "wordsInUse", -796934571);
        setBooleanField(term1034, term1034.getClass(), "sizeIsSticky", false);
        setField(term1021, term1021.getClass(), "bitset", term1034);
        setField(term979, term979.getClass(), "workingClique", term1021);
        setField(term1040, term1040.getClass(), "table", term1041);
        setIntField(term1040, term1040.getClass(), "count", 405295896);
        setIntField(term1040, term1040.getClass(), "threshold", 15);
        setFloatField(term1040, term1040.getClass(), "loadFactor", 0.75F);
        setField(term1039, term1039.getClass(), "posMap", term1040);
        setField(term1039, term1039.getClass(), "graph", null);
        setIntElement(term1045, 0, -814977075);
        setIntElement(term1045, 1, 808614267);
        setIntElement(term1045, 2, 1611734632);
        setIntElement(term1045, 3, 868908117);
        setIntElement(term1045, 4, 1789351397);
        setField(term1039, term1039.getClass(), "vertices", term1045);
        setIntField(term1039, term1039.getClass(), "numVertices", 2145528170);
        setIntField(term1039, term1039.getClass(), "first", -585773976);
        setField(term1053, term1053.getClass(), "words", term1054);
        setIntField(term1053, term1053.getClass(), "wordsInUse", 852806940);
        setBooleanField(term1053, term1053.getClass(), "sizeIsSticky", false);
        setField(term1039, term1039.getClass(), "bitset", term1053);
        setField(term979, term979.getClass(), "currentClique", term1039);
        setField(term979, term979.getClass(), "graph", null);
        term1058 = new Integer(698551724);
        term1060 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term1061 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term1062 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term1066 = (int[]) newIntArray(8);
        Object term1077 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1078 = (long[]) newLongArray(1);
        setField(term1061, term1061.getClass(), "table", term1062);
        setIntField(term1061, term1061.getClass(), "count", -1631048635);
        setIntField(term1061, term1061.getClass(), "threshold", 15);
        setFloatField(term1061, term1061.getClass(), "loadFactor", 0.75F);
        setField(term1060, term1060.getClass(), "posMap", term1061);
        setField(term1060, term1060.getClass(), "graph", null);
        setIntElement(term1066, 0, 1342808731);
        setIntElement(term1066, 1, -64893740);
        setIntElement(term1066, 2, -222012928);
        setIntElement(term1066, 3, -146564963);
        setIntElement(term1066, 4, -83178716);
        setIntElement(term1066, 5, -1292704466);
        setIntElement(term1066, 6, 1991858584);
        setIntElement(term1066, 7, -1300947782);
        setField(term1060, term1060.getClass(), "vertices", term1066);
        setIntField(term1060, term1060.getClass(), "numVertices", 188512644);
        setIntField(term1060, term1060.getClass(), "first", 1851127634);
        setField(term1077, term1077.getClass(), "words", term1078);
        setIntField(term1077, term1077.getClass(), "wordsInUse", 783730213);
        setBooleanField(term1077, term1077.getClass(), "sizeIsSticky", true);
        setField(term1060, term1060.getClass(), "bitset", term1077);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.BronKerboschCliqueIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[2];
        args[0] = term1058;
        args[1] = term1060;
        callMethod(klass, "countNeighborsUsingAdjMatrix", argTypes, term979, args);
    }

};


