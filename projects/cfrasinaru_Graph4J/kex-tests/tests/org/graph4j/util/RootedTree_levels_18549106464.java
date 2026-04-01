package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class RootedTree_levels_18549106464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118895;

    public RootedTree_levels_18549106464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term118909 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term118910 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term118914 = (int[]) newIntArray(0);
        Object term118917 = newInstance(Class.forName("java.util.BitSet"));
        setField(term118910, term118910.getClass(), "table", null);
        setIntField(term118910, term118910.getClass(), "count", 1654533596);
        setIntField(term118910, term118910.getClass(), "threshold", 15);
        setFloatField(term118910, term118910.getClass(), "loadFactor", 0.75F);
        setField(term118909, term118909.getClass(), "posMap", term118910);
        setField(term118909, term118909.getClass(), "graph", null);
        setField(term118909, term118909.getClass(), "vertices", term118914);
        setIntField(term118909, term118909.getClass(), "numVertices", 2022064558);
        setIntField(term118909, term118909.getClass(), "first", -53372402);
        setField(term118917, term118917.getClass(), "words", null);
        setIntField(term118917, term118917.getClass(), "wordsInUse", 1387618380);
        setBooleanField(term118917, term118917.getClass(), "sizeIsSticky", false);
        setField(term118909, term118909.getClass(), "bitset", term118917);
        Object term118920 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term118921 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term118925 = (int[]) newIntArray(0);
        Object term118928 = newInstance(Class.forName("java.util.BitSet"));
        setField(term118921, term118921.getClass(), "table", null);
        setIntField(term118921, term118921.getClass(), "count", -1207988984);
        setIntField(term118921, term118921.getClass(), "threshold", 15);
        setFloatField(term118921, term118921.getClass(), "loadFactor", 0.75F);
        setField(term118920, term118920.getClass(), "posMap", term118921);
        setField(term118920, term118920.getClass(), "graph", null);
        setField(term118920, term118920.getClass(), "vertices", term118925);
        setIntField(term118920, term118920.getClass(), "numVertices", 337129947);
        setIntField(term118920, term118920.getClass(), "first", 189757655);
        setField(term118928, term118928.getClass(), "words", null);
        setIntField(term118928, term118928.getClass(), "wordsInUse", -1825052032);
        setBooleanField(term118928, term118928.getClass(), "sizeIsSticky", true);
        setField(term118920, term118920.getClass(), "bitset", term118928);
        Object term118931 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term118932 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term118936 = (int[]) newIntArray(8);
        Object term118947 = newInstance(Class.forName("java.util.BitSet"));
        setField(term118932, term118932.getClass(), "table", null);
        setIntField(term118932, term118932.getClass(), "count", 209094476);
        setIntField(term118932, term118932.getClass(), "threshold", 15);
        setFloatField(term118932, term118932.getClass(), "loadFactor", 0.75F);
        setField(term118931, term118931.getClass(), "posMap", term118932);
        setField(term118931, term118931.getClass(), "graph", null);
        setIntElement(term118936, 0, -1307273912);
        setIntElement(term118936, 1, 126451352);
        setIntElement(term118936, 2, -1404768430);
        setIntElement(term118936, 3, -1256356721);
        setIntElement(term118936, 4, 2055399146);
        setIntElement(term118936, 5, -959131846);
        setIntElement(term118936, 6, -32576473);
        setIntElement(term118936, 7, 265606564);
        setField(term118931, term118931.getClass(), "vertices", term118936);
        setIntField(term118931, term118931.getClass(), "numVertices", -96596021);
        setIntField(term118931, term118931.getClass(), "first", -396078581);
        setField(term118947, term118947.getClass(), "words", null);
        setIntField(term118947, term118947.getClass(), "wordsInUse", 663055983);
        setBooleanField(term118947, term118947.getClass(), "sizeIsSticky", true);
        setField(term118931, term118931.getClass(), "bitset", term118947);
        Object term118950 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term118951 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term118955 = (int[]) newIntArray(8);
        Object term118966 = newInstance(Class.forName("java.util.BitSet"));
        setField(term118951, term118951.getClass(), "table", null);
        setIntField(term118951, term118951.getClass(), "count", 460058320);
        setIntField(term118951, term118951.getClass(), "threshold", 15);
        setFloatField(term118951, term118951.getClass(), "loadFactor", 0.75F);
        setField(term118950, term118950.getClass(), "posMap", term118951);
        setField(term118950, term118950.getClass(), "graph", null);
        setIntElement(term118955, 0, 1623517509);
        setIntElement(term118955, 1, -1678059035);
        setIntElement(term118955, 2, -378502409);
        setIntElement(term118955, 3, 1237665417);
        setIntElement(term118955, 4, -2007749012);
        setIntElement(term118955, 5, -1831523442);
        setIntElement(term118955, 6, -1744615813);
        setIntElement(term118955, 7, 697490560);
        setField(term118950, term118950.getClass(), "vertices", term118955);
        setIntField(term118950, term118950.getClass(), "numVertices", -1943433012);
        setIntField(term118950, term118950.getClass(), "first", 1824753250);
        setField(term118966, term118966.getClass(), "words", null);
        setIntField(term118966, term118966.getClass(), "wordsInUse", -1364300929);
        setBooleanField(term118966, term118966.getClass(), "sizeIsSticky", false);
        setField(term118950, term118950.getClass(), "bitset", term118966);
        Object term118969 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term118970 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term118974 = (int[]) newIntArray(8);
        Object term118985 = newInstance(Class.forName("java.util.BitSet"));
        setField(term118970, term118970.getClass(), "table", null);
        setIntField(term118970, term118970.getClass(), "count", -1297765151);
        setIntField(term118970, term118970.getClass(), "threshold", 15);
        setFloatField(term118970, term118970.getClass(), "loadFactor", 0.75F);
        setField(term118969, term118969.getClass(), "posMap", term118970);
        setField(term118969, term118969.getClass(), "graph", null);
        setIntElement(term118974, 0, -493427629);
        setIntElement(term118974, 1, 683709231);
        setIntElement(term118974, 2, 1295305054);
        setIntElement(term118974, 3, 1051366361);
        setIntElement(term118974, 4, 797415056);
        setIntElement(term118974, 5, -1395794593);
        setIntElement(term118974, 6, 177293474);
        setIntElement(term118974, 7, -1663867560);
        setField(term118969, term118969.getClass(), "vertices", term118974);
        setIntField(term118969, term118969.getClass(), "numVertices", 1871308062);
        setIntField(term118969, term118969.getClass(), "first", 716978780);
        setField(term118985, term118985.getClass(), "words", null);
        setIntField(term118985, term118985.getClass(), "wordsInUse", -211894122);
        setBooleanField(term118985, term118985.getClass(), "sizeIsSticky", false);
        setField(term118969, term118969.getClass(), "bitset", term118985);
        Object term118988 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term118989 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term118993 = (int[]) newIntArray(0);
        Object term118996 = newInstance(Class.forName("java.util.BitSet"));
        setField(term118989, term118989.getClass(), "table", null);
        setIntField(term118989, term118989.getClass(), "count", 1368603928);
        setIntField(term118989, term118989.getClass(), "threshold", 15);
        setFloatField(term118989, term118989.getClass(), "loadFactor", 0.75F);
        setField(term118988, term118988.getClass(), "posMap", term118989);
        setField(term118988, term118988.getClass(), "graph", null);
        setField(term118988, term118988.getClass(), "vertices", term118993);
        setIntField(term118988, term118988.getClass(), "numVertices", -2037348518);
        setIntField(term118988, term118988.getClass(), "first", 1896399663);
        setField(term118996, term118996.getClass(), "words", null);
        setIntField(term118996, term118996.getClass(), "wordsInUse", -613967334);
        setBooleanField(term118996, term118996.getClass(), "sizeIsSticky", false);
        setField(term118988, term118988.getClass(), "bitset", term118996);
        ArrayList term118907 = new ArrayList();
        ((ArrayList) term118907).add(term118909);
        ((ArrayList) term118907).add(term118920);
        ((ArrayList) term118907).add(term118931);
        ((ArrayList) term118907).add(term118950);
        ((ArrayList) term118907).add(term118969);
        ((ArrayList) term118907).add(term118988);
        term118895 = newInstance(Class.forName("org.graph4j.util.RootedTree"));
        int[] term118897 = (int[]) newIntArray(9);
        setField(term118895, term118895.getClass(), "tree", null);
        setIntField(term118895, term118895.getClass(), "root", 1225074549);
        setIntElement(term118897, 0, 1184210193);
        setIntElement(term118897, 1, 2086235255);
        setIntElement(term118897, 2, -92302532);
        setIntElement(term118897, 3, 436721064);
        setIntElement(term118897, 4, 738788126);
        setIntElement(term118897, 5, 810127498);
        setIntElement(term118897, 6, -1265159953);
        setIntElement(term118897, 7, 714658774);
        setIntElement(term118897, 8, 1593835846);
        setField(term118895, term118895.getClass(), "parents", term118897);
        setField(term118895, term118895.getClass(), "levels", term118907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.RootedTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "levels", argTypes, term118895, args);
    }

};


