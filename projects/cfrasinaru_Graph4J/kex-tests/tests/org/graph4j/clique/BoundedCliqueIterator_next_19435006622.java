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

public class BoundedCliqueIterator_next_19435006622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80;

    public BoundedCliqueIterator_next_19435006622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term123 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueIterator$Node"));
        setField(term123, term123.getClass(), "subg", null);
        setField(term123, term123.getClass(), "cand", null);
        setField(term123, term123.getClass(), "ext", null);
        setField(term123, term123.getClass(), "this$0", null);
        ArrayDeque term121 = new ArrayDeque();
        ((ArrayDeque) term121).add(term123);
        term80 = newInstance(Class.forName("org.graph4j.clique.BoundedCliqueIterator"));
        Object term84 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term85 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term86 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term90 = (int[]) newIntArray(6);
        Object term99 = newInstance(Class.forName("java.util.BitSet"));
        long[] term100 = (long[]) newLongArray(1);
        Object term104 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueIterator"));
        Object[] term105 = (Object[]) newArray("[I", 2);
        int[] term106 = (int[]) newIntArray(6);
        int[] term113 = (int[]) newIntArray(7);
        Object term126 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term127 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term128 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term132 = (int[]) newIntArray(2);
        Object term137 = newInstance(Class.forName("java.util.BitSet"));
        long[] term138 = (long[]) newLongArray(1);
        Object term142 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term143 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term144 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term148 = (int[]) newIntArray(3);
        Object term154 = newInstance(Class.forName("java.util.BitSet"));
        long[] term155 = (long[]) newLongArray(1);
        Object term159 = newInstance(Class.forName("org.graph4j.util.BoundedSubsetIterator"));
        int[] term160 = (int[]) newIntArray(1);
        int[] term165 = (int[]) newIntArray(0);
        setIntField(term80, term80.getClass(), "minSize", -883034806);
        setIntField(term80, term80.getClass(), "maxSize", 1585847225);
        setLongField(term80, term80.getClass(), "timeout", -8257434502486459194L);
        setField(term85, term85.getClass(), "table", term86);
        setIntField(term85, term85.getClass(), "count", 597278769);
        setIntField(term85, term85.getClass(), "threshold", 15);
        setFloatField(term85, term85.getClass(), "loadFactor", 0.75F);
        setField(term84, term84.getClass(), "posMap", term85);
        setField(term84, term84.getClass(), "graph", null);
        setIntElement(term90, 0, -1685132342);
        setIntElement(term90, 1, -1456670397);
        setIntElement(term90, 2, 1622346318);
        setIntElement(term90, 3, 1048535127);
        setIntElement(term90, 4, -655067527);
        setIntElement(term90, 5, -6029667);
        setField(term84, term84.getClass(), "vertices", term90);
        setIntField(term84, term84.getClass(), "numVertices", -2068769794);
        setIntField(term84, term84.getClass(), "first", -117576464);
        setField(term99, term99.getClass(), "words", term100);
        setIntField(term99, term99.getClass(), "wordsInUse", -1007160944);
        setBooleanField(term99, term99.getClass(), "sizeIsSticky", false);
        setField(term84, term84.getClass(), "bitset", term99);
        setField(term80, term80.getClass(), "currentClique", term84);
        setIntElement(term106, 0, 1135664017);
        setIntElement(term106, 1, 590364439);
        setIntElement(term106, 2, 865208305);
        setIntElement(term106, 3, -1275173084);
        setIntElement(term106, 4, -244121226);
        setIntElement(term106, 5, -203030934);
        setElement(term105, 0, term106);
        setIntElement(term113, 0, -1179120542);
        setIntElement(term113, 1, -73683645);
        setIntElement(term113, 2, -226514366);
        setIntElement(term113, 3, 1193880199);
        setIntElement(term113, 4, -1087774327);
        setIntElement(term113, 5, -1530420153);
        setIntElement(term113, 6, -469968304);
        setElement(term105, 1, term113);
        setField(term104, term104.getClass(), "adjMatrix", term105);
        setField(term104, term104.getClass(), "stack", term121);
        setField(term127, term127.getClass(), "table", term128);
        setIntField(term127, term127.getClass(), "count", -1588772968);
        setIntField(term127, term127.getClass(), "threshold", 15);
        setFloatField(term127, term127.getClass(), "loadFactor", 0.75F);
        setField(term126, term126.getClass(), "posMap", term127);
        setField(term126, term126.getClass(), "graph", null);
        setIntElement(term132, 0, -93135961);
        setIntElement(term132, 1, -112921587);
        setField(term126, term126.getClass(), "vertices", term132);
        setIntField(term126, term126.getClass(), "numVertices", 933028652);
        setIntField(term126, term126.getClass(), "first", 287287233);
        setField(term137, term137.getClass(), "words", term138);
        setIntField(term137, term137.getClass(), "wordsInUse", 962840079);
        setBooleanField(term137, term137.getClass(), "sizeIsSticky", false);
        setField(term126, term126.getClass(), "bitset", term137);
        setField(term104, term104.getClass(), "workingClique", term126);
        setField(term143, term143.getClass(), "table", term144);
        setIntField(term143, term143.getClass(), "count", 1540719661);
        setIntField(term143, term143.getClass(), "threshold", 15);
        setFloatField(term143, term143.getClass(), "loadFactor", 0.75F);
        setField(term142, term142.getClass(), "posMap", term143);
        setField(term142, term142.getClass(), "graph", null);
        setIntElement(term148, 0, 1265463001);
        setIntElement(term148, 1, 335112684);
        setIntElement(term148, 2, 1551099402);
        setField(term142, term142.getClass(), "vertices", term148);
        setIntField(term142, term142.getClass(), "numVertices", -2027534003);
        setIntField(term142, term142.getClass(), "first", 1063420942);
        setField(term154, term154.getClass(), "words", term155);
        setIntField(term154, term154.getClass(), "wordsInUse", 1375330971);
        setBooleanField(term154, term154.getClass(), "sizeIsSticky", false);
        setField(term142, term142.getClass(), "bitset", term154);
        setField(term104, term104.getClass(), "currentClique", term142);
        setField(term104, term104.getClass(), "graph", null);
        setField(term80, term80.getClass(), "bkIterator", term104);
        setIntElement(term160, 0, -478195677);
        setField(term159, term159.getClass(), "elements", term160);
        setIntField(term159, term159.getClass(), "numElements", 972867650);
        setIntField(term159, term159.getClass(), "maxSubsetSize", 1655935355);
        setIntField(term159, term159.getClass(), "currentSubsetSize", -481533957);
        setField(term159, term159.getClass(), "indices", term165);
        setField(term80, term80.getClass(), "subsetIterator", term159);
        setBooleanField(term80, term80.getClass(), "timeExpired", true);
        setField(term80, term80.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.BoundedCliqueIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term80, args);
    }

};


