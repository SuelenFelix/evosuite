package org.graph4j.vsp;

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
import static org.graph4j.vsp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class VertexSeparator_isComplete_14678928138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78814;

    public VertexSeparator_isComplete_14678928138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78814 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term78815 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78816 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78817 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78821 = (int[]) newIntArray(6);
        Object term78830 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78831 = (long[]) newLongArray(1);
        Object term78835 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78836 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78837 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78841 = (int[]) newIntArray(1);
        Object term78845 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78846 = (long[]) newLongArray(1);
        Object term78850 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78851 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78852 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78856 = (int[]) newIntArray(7);
        Object term78866 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78867 = (long[]) newLongArray(1);
        setField(term78814, term78814.getClass(), "graph", null);
        setField(term78816, term78816.getClass(), "table", term78817);
        setIntField(term78816, term78816.getClass(), "count", -629271467);
        setIntField(term78816, term78816.getClass(), "threshold", 15);
        setFloatField(term78816, term78816.getClass(), "loadFactor", 0.75F);
        setField(term78815, term78815.getClass(), "posMap", term78816);
        setField(term78815, term78815.getClass(), "graph", null);
        setIntElement(term78821, 0, -1485210649);
        setIntElement(term78821, 1, 343270861);
        setIntElement(term78821, 2, 408001246);
        setIntElement(term78821, 3, -413564129);
        setIntElement(term78821, 4, -32548606);
        setIntElement(term78821, 5, 129009378);
        setField(term78815, term78815.getClass(), "vertices", term78821);
        setIntField(term78815, term78815.getClass(), "numVertices", 1817148676);
        setIntField(term78815, term78815.getClass(), "first", 1276665124);
        setField(term78830, term78830.getClass(), "words", term78831);
        setIntField(term78830, term78830.getClass(), "wordsInUse", 631763699);
        setBooleanField(term78830, term78830.getClass(), "sizeIsSticky", false);
        setField(term78815, term78815.getClass(), "bitset", term78830);
        setField(term78814, term78814.getClass(), "separator", term78815);
        setField(term78836, term78836.getClass(), "table", term78837);
        setIntField(term78836, term78836.getClass(), "count", -2016696905);
        setIntField(term78836, term78836.getClass(), "threshold", 15);
        setFloatField(term78836, term78836.getClass(), "loadFactor", 0.75F);
        setField(term78835, term78835.getClass(), "posMap", term78836);
        setField(term78835, term78835.getClass(), "graph", null);
        setIntElement(term78841, 0, 820644673);
        setField(term78835, term78835.getClass(), "vertices", term78841);
        setIntField(term78835, term78835.getClass(), "numVertices", 1395411611);
        setIntField(term78835, term78835.getClass(), "first", 1535159183);
        setField(term78845, term78845.getClass(), "words", term78846);
        setIntField(term78845, term78845.getClass(), "wordsInUse", 542305172);
        setBooleanField(term78845, term78845.getClass(), "sizeIsSticky", true);
        setField(term78835, term78835.getClass(), "bitset", term78845);
        setField(term78814, term78814.getClass(), "leftShore", term78835);
        setField(term78851, term78851.getClass(), "table", term78852);
        setIntField(term78851, term78851.getClass(), "count", 1880502684);
        setIntField(term78851, term78851.getClass(), "threshold", 15);
        setFloatField(term78851, term78851.getClass(), "loadFactor", 0.75F);
        setField(term78850, term78850.getClass(), "posMap", term78851);
        setField(term78850, term78850.getClass(), "graph", null);
        setIntElement(term78856, 0, 1208089406);
        setIntElement(term78856, 1, -822607091);
        setIntElement(term78856, 2, -1404356844);
        setIntElement(term78856, 3, 1214654693);
        setIntElement(term78856, 4, -1144368319);
        setIntElement(term78856, 5, -1299647512);
        setIntElement(term78856, 6, -738749379);
        setField(term78850, term78850.getClass(), "vertices", term78856);
        setIntField(term78850, term78850.getClass(), "numVertices", 2067337022);
        setIntField(term78850, term78850.getClass(), "first", -462097537);
        setField(term78866, term78866.getClass(), "words", term78867);
        setIntField(term78866, term78866.getClass(), "wordsInUse", 1791338762);
        setBooleanField(term78866, term78866.getClass(), "sizeIsSticky", false);
        setField(term78850, term78850.getClass(), "bitset", term78866);
        setField(term78814, term78814.getClass(), "rightShore", term78850);
        setIntField(term78814, term78814.getClass(), "maxShoreSize", 1852645839);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.VertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isComplete", argTypes, term78814, args);
    }

};


