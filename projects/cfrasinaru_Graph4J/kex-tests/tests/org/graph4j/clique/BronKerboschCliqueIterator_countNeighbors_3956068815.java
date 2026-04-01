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

public class BronKerboschCliqueIterator_countNeighbors_3956068815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term848;
     Object term927;
     Object term929;

    public BronKerboschCliqueIterator_countNeighbors_3956068815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term882 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueIterator$Node"));
        Object term883 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term886 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term889 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term883, term883.getClass(), "posMap", null);
        setField(term883, term883.getClass(), "graph", null);
        setField(term883, term883.getClass(), "vertices", null);
        setIntField(term883, term883.getClass(), "numVertices", 1302807565);
        setIntField(term883, term883.getClass(), "first", -838848221);
        setField(term883, term883.getClass(), "bitset", null);
        setField(term882, term882.getClass(), "subg", term883);
        setField(term886, term886.getClass(), "posMap", null);
        setField(term886, term886.getClass(), "graph", null);
        setField(term886, term886.getClass(), "vertices", null);
        setIntField(term886, term886.getClass(), "numVertices", -124088550);
        setIntField(term886, term886.getClass(), "first", 777492093);
        setField(term886, term886.getClass(), "bitset", null);
        setField(term882, term882.getClass(), "cand", term886);
        setField(term889, term889.getClass(), "posMap", null);
        setField(term889, term889.getClass(), "graph", null);
        setField(term889, term889.getClass(), "vertices", null);
        setIntField(term889, term889.getClass(), "numVertices", 1024134939);
        setIntField(term889, term889.getClass(), "first", 109078154);
        setField(term889, term889.getClass(), "bitset", null);
        setField(term882, term882.getClass(), "ext", term889);
        setField(term882, term882.getClass(), "this$0", null);
        ArrayDeque term880 = new ArrayDeque();
        ((ArrayDeque) term880).add(term882);
        term848 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueIterator"));
        Object[] term849 = (Object[]) newArray("[I", 6);
        int[] term850 = (int[]) newIntArray(5);
        int[] term856 = (int[]) newIntArray(3);
        int[] term860 = (int[]) newIntArray(4);
        int[] term865 = (int[]) newIntArray(8);
        int[] term874 = (int[]) newIntArray(0);
        int[] term875 = (int[]) newIntArray(4);
        Object term894 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term895 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term896 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term900 = (int[]) newIntArray(3);
        Object term906 = newInstance(Class.forName("java.util.BitSet"));
        long[] term907 = (long[]) newLongArray(1);
        Object term911 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term912 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term913 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term917 = (int[]) newIntArray(2);
        Object term922 = newInstance(Class.forName("java.util.BitSet"));
        long[] term923 = (long[]) newLongArray(1);
        setIntElement(term850, 0, 1470349147);
        setIntElement(term850, 1, -255317272);
        setIntElement(term850, 2, -706253892);
        setIntElement(term850, 3, -1341439819);
        setIntElement(term850, 4, -728760750);
        setElement(term849, 0, term850);
        setIntElement(term856, 0, -1617383807);
        setIntElement(term856, 1, -1244386281);
        setIntElement(term856, 2, -885788574);
        setElement(term849, 1, term856);
        setIntElement(term860, 0, -865722613);
        setIntElement(term860, 1, -1551355284);
        setIntElement(term860, 2, -1381970335);
        setIntElement(term860, 3, 1213549815);
        setElement(term849, 2, term860);
        setIntElement(term865, 0, -1518419301);
        setIntElement(term865, 1, 674879025);
        setIntElement(term865, 2, -1538936030);
        setIntElement(term865, 3, -752870423);
        setIntElement(term865, 4, -1698809299);
        setIntElement(term865, 5, 401512128);
        setIntElement(term865, 6, -2069930777);
        setIntElement(term865, 7, 1543696412);
        setElement(term849, 3, term865);
        setElement(term849, 4, term874);
        setIntElement(term875, 0, -1385748168);
        setIntElement(term875, 1, -270592367);
        setIntElement(term875, 2, 178847646);
        setIntElement(term875, 3, 273590437);
        setElement(term849, 5, term875);
        setField(term848, term848.getClass(), "adjMatrix", term849);
        setField(term848, term848.getClass(), "stack", term880);
        setField(term895, term895.getClass(), "table", term896);
        setIntField(term895, term895.getClass(), "count", 963694071);
        setIntField(term895, term895.getClass(), "threshold", 15);
        setFloatField(term895, term895.getClass(), "loadFactor", 0.75F);
        setField(term894, term894.getClass(), "posMap", term895);
        setField(term894, term894.getClass(), "graph", null);
        setIntElement(term900, 0, -995785731);
        setIntElement(term900, 1, 1349815364);
        setIntElement(term900, 2, 2128383340);
        setField(term894, term894.getClass(), "vertices", term900);
        setIntField(term894, term894.getClass(), "numVertices", 1238598518);
        setIntField(term894, term894.getClass(), "first", -558146961);
        setField(term906, term906.getClass(), "words", term907);
        setIntField(term906, term906.getClass(), "wordsInUse", 1505480070);
        setBooleanField(term906, term906.getClass(), "sizeIsSticky", false);
        setField(term894, term894.getClass(), "bitset", term906);
        setField(term848, term848.getClass(), "workingClique", term894);
        setField(term912, term912.getClass(), "table", term913);
        setIntField(term912, term912.getClass(), "count", -829088844);
        setIntField(term912, term912.getClass(), "threshold", 15);
        setFloatField(term912, term912.getClass(), "loadFactor", 0.75F);
        setField(term911, term911.getClass(), "posMap", term912);
        setField(term911, term911.getClass(), "graph", null);
        setIntElement(term917, 0, -31751777);
        setIntElement(term917, 1, -246967963);
        setField(term911, term911.getClass(), "vertices", term917);
        setIntField(term911, term911.getClass(), "numVertices", -1777140369);
        setIntField(term911, term911.getClass(), "first", 993627098);
        setField(term922, term922.getClass(), "words", term923);
        setIntField(term922, term922.getClass(), "wordsInUse", 872295704);
        setBooleanField(term922, term922.getClass(), "sizeIsSticky", false);
        setField(term911, term911.getClass(), "bitset", term922);
        setField(term848, term848.getClass(), "currentClique", term911);
        setField(term848, term848.getClass(), "graph", null);
        term927 = new Integer(86041387);
        term929 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term930 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term931 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term935 = (int[]) newIntArray(2);
        Object term940 = newInstance(Class.forName("java.util.BitSet"));
        long[] term941 = (long[]) newLongArray(1);
        setField(term930, term930.getClass(), "table", term931);
        setIntField(term930, term930.getClass(), "count", 1010721666);
        setIntField(term930, term930.getClass(), "threshold", 15);
        setFloatField(term930, term930.getClass(), "loadFactor", 0.75F);
        setField(term929, term929.getClass(), "posMap", term930);
        setField(term929, term929.getClass(), "graph", null);
        setIntElement(term935, 0, 27043781);
        setIntElement(term935, 1, -1367122405);
        setField(term929, term929.getClass(), "vertices", term935);
        setIntField(term929, term929.getClass(), "numVertices", -1703625118);
        setIntField(term929, term929.getClass(), "first", 1104108112);
        setField(term940, term940.getClass(), "words", term941);
        setIntField(term940, term940.getClass(), "wordsInUse", 1648665618);
        setBooleanField(term940, term940.getClass(), "sizeIsSticky", false);
        setField(term929, term929.getClass(), "bitset", term940);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.BronKerboschCliqueIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[2];
        args[0] = term927;
        args[1] = term929;
        callMethod(klass, "countNeighbors", argTypes, term848, args);
    }

};


