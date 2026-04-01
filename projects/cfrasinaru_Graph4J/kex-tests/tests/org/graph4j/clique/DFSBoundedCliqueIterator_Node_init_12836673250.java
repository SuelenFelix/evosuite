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
import java.util.ArrayDeque;
import java.lang.Object;
import java.lang.Double;

public class DFSBoundedCliqueIterator_Node_init_12836673250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2747;
     Object term2775;
     Object term2795;
     Object term2817;

    public DFSBoundedCliqueIterator_Node_init_12836673250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term2752 = new ArrayDeque();
        term2747 = newInstance(Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator"));
        Object term2756 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term2757 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2758 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2762 = (int[]) newIntArray(5);
        Object term2770 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2771 = (long[]) newLongArray(1);
        setIntField(term2747, term2747.getClass(), "minSize", 1125156671);
        setIntField(term2747, term2747.getClass(), "maxSize", 1203107925);
        setDoubleField(term2747, term2747.getClass(), "maxWeight", 0.7332741045694002);
        setLongField(term2747, term2747.getClass(), "timeout", 2535595959091595249L);
        setField(term2747, term2747.getClass(), "stack", term2752);
        setField(term2757, term2757.getClass(), "table", term2758);
        setIntField(term2757, term2757.getClass(), "count", 1825448944);
        setIntField(term2757, term2757.getClass(), "threshold", 15);
        setFloatField(term2757, term2757.getClass(), "loadFactor", 0.75F);
        setField(term2756, term2756.getClass(), "posMap", term2757);
        setField(term2756, term2756.getClass(), "graph", null);
        setIntElement(term2762, 0, 1769496642);
        setIntElement(term2762, 1, -947460705);
        setIntElement(term2762, 2, -1435758764);
        setIntElement(term2762, 3, 752858379);
        setIntElement(term2762, 4, -370819357);
        setField(term2756, term2756.getClass(), "vertices", term2762);
        setIntField(term2756, term2756.getClass(), "numVertices", -71819242);
        setIntField(term2756, term2756.getClass(), "first", 1268893136);
        setField(term2770, term2770.getClass(), "words", term2771);
        setIntField(term2770, term2770.getClass(), "wordsInUse", -1472700822);
        setBooleanField(term2770, term2770.getClass(), "sizeIsSticky", true);
        setField(term2756, term2756.getClass(), "bitset", term2770);
        setField(term2747, term2747.getClass(), "currentClique", term2756);
        setField(term2747, term2747.getClass(), "graph", null);
        term2775 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term2776 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2777 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2781 = (int[]) newIntArray(6);
        Object term2790 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2791 = (long[]) newLongArray(1);
        setField(term2776, term2776.getClass(), "table", term2777);
        setIntField(term2776, term2776.getClass(), "count", 1626670889);
        setIntField(term2776, term2776.getClass(), "threshold", 15);
        setFloatField(term2776, term2776.getClass(), "loadFactor", 0.75F);
        setField(term2775, term2775.getClass(), "posMap", term2776);
        setField(term2775, term2775.getClass(), "graph", null);
        setIntElement(term2781, 0, -2117361140);
        setIntElement(term2781, 1, 407708341);
        setIntElement(term2781, 2, -287519200);
        setIntElement(term2781, 3, -1490696181);
        setIntElement(term2781, 4, 623717232);
        setIntElement(term2781, 5, -1413291732);
        setField(term2775, term2775.getClass(), "vertices", term2781);
        setIntField(term2775, term2775.getClass(), "numVertices", 203264365);
        setIntField(term2775, term2775.getClass(), "first", -1066281036);
        setField(term2790, term2790.getClass(), "words", term2791);
        setIntField(term2790, term2790.getClass(), "wordsInUse", 30837706);
        setBooleanField(term2790, term2790.getClass(), "sizeIsSticky", true);
        setField(term2775, term2775.getClass(), "bitset", term2790);
        term2795 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term2796 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2797 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2801 = (int[]) newIntArray(8);
        Object term2812 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2813 = (long[]) newLongArray(1);
        setField(term2796, term2796.getClass(), "table", term2797);
        setIntField(term2796, term2796.getClass(), "count", 379523101);
        setIntField(term2796, term2796.getClass(), "threshold", 15);
        setFloatField(term2796, term2796.getClass(), "loadFactor", 0.75F);
        setField(term2795, term2795.getClass(), "posMap", term2796);
        setField(term2795, term2795.getClass(), "graph", null);
        setIntElement(term2801, 0, 1017354215);
        setIntElement(term2801, 1, 695330987);
        setIntElement(term2801, 2, -267289967);
        setIntElement(term2801, 3, 773432822);
        setIntElement(term2801, 4, -488294922);
        setIntElement(term2801, 5, -397161164);
        setIntElement(term2801, 6, -703717191);
        setIntElement(term2801, 7, -1255535445);
        setField(term2795, term2795.getClass(), "vertices", term2801);
        setIntField(term2795, term2795.getClass(), "numVertices", -2033952124);
        setIntField(term2795, term2795.getClass(), "first", 560401653);
        setField(term2812, term2812.getClass(), "words", term2813);
        setIntField(term2812, term2812.getClass(), "wordsInUse", 1633691536);
        setBooleanField(term2812, term2812.getClass(), "sizeIsSticky", false);
        setField(term2795, term2795.getClass(), "bitset", term2812);
        term2817 = new Double(0.4569171842750229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator$Node");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator");
        argTypes[1] = Class.forName("org.graph4j.util.Clique");
        argTypes[2] = Class.forName("org.graph4j.util.VertexSet");
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term2747;
        args[1] = term2775;
        args[2] = term2795;
        args[3] = term2817;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


