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

public class GreedyVertexSeparator_choose_13694200253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5580;
     Object term5636;
     Object term5659;

    public GreedyVertexSeparator_choose_13694200253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5580 = newInstance(Class.forName("org.graph4j.vsp.GreedyVertexSeparator"));
        Object term5582 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term5583 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5584 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5585 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5589 = (int[]) newIntArray(3);
        Object term5595 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5596 = (long[]) newLongArray(1);
        Object term5600 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5601 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5602 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5606 = (int[]) newIntArray(5);
        Object term5614 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5615 = (long[]) newLongArray(1);
        Object term5619 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5620 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5621 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5625 = (int[]) newIntArray(2);
        Object term5630 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5631 = (long[]) newLongArray(1);
        setIntField(term5580, term5580.getClass(), "maxShoreSize", 1934437115);
        setField(term5582, term5582.getClass(), "graph", null);
        setField(term5584, term5584.getClass(), "table", term5585);
        setIntField(term5584, term5584.getClass(), "count", 1820319919);
        setIntField(term5584, term5584.getClass(), "threshold", 15);
        setFloatField(term5584, term5584.getClass(), "loadFactor", 0.75F);
        setField(term5583, term5583.getClass(), "posMap", term5584);
        setField(term5583, term5583.getClass(), "graph", null);
        setIntElement(term5589, 0, 1444962020);
        setIntElement(term5589, 1, 1636228804);
        setIntElement(term5589, 2, -1650533427);
        setField(term5583, term5583.getClass(), "vertices", term5589);
        setIntField(term5583, term5583.getClass(), "numVertices", -1076430316);
        setIntField(term5583, term5583.getClass(), "first", 1984492528);
        setField(term5595, term5595.getClass(), "words", term5596);
        setIntField(term5595, term5595.getClass(), "wordsInUse", -655764067);
        setBooleanField(term5595, term5595.getClass(), "sizeIsSticky", true);
        setField(term5583, term5583.getClass(), "bitset", term5595);
        setField(term5582, term5582.getClass(), "separator", term5583);
        setField(term5601, term5601.getClass(), "table", term5602);
        setIntField(term5601, term5601.getClass(), "count", 31238744);
        setIntField(term5601, term5601.getClass(), "threshold", 15);
        setFloatField(term5601, term5601.getClass(), "loadFactor", 0.75F);
        setField(term5600, term5600.getClass(), "posMap", term5601);
        setField(term5600, term5600.getClass(), "graph", null);
        setIntElement(term5606, 0, 680031965);
        setIntElement(term5606, 1, -2112419098);
        setIntElement(term5606, 2, -1649429373);
        setIntElement(term5606, 3, -1605518502);
        setIntElement(term5606, 4, -499081946);
        setField(term5600, term5600.getClass(), "vertices", term5606);
        setIntField(term5600, term5600.getClass(), "numVertices", 1834067063);
        setIntField(term5600, term5600.getClass(), "first", -1578513908);
        setField(term5614, term5614.getClass(), "words", term5615);
        setIntField(term5614, term5614.getClass(), "wordsInUse", 312330930);
        setBooleanField(term5614, term5614.getClass(), "sizeIsSticky", false);
        setField(term5600, term5600.getClass(), "bitset", term5614);
        setField(term5582, term5582.getClass(), "leftShore", term5600);
        setField(term5620, term5620.getClass(), "table", term5621);
        setIntField(term5620, term5620.getClass(), "count", 1635910980);
        setIntField(term5620, term5620.getClass(), "threshold", 15);
        setFloatField(term5620, term5620.getClass(), "loadFactor", 0.75F);
        setField(term5619, term5619.getClass(), "posMap", term5620);
        setField(term5619, term5619.getClass(), "graph", null);
        setIntElement(term5625, 0, 1560346640);
        setIntElement(term5625, 1, 100626332);
        setField(term5619, term5619.getClass(), "vertices", term5625);
        setIntField(term5619, term5619.getClass(), "numVertices", 763794722);
        setIntField(term5619, term5619.getClass(), "first", -696403395);
        setField(term5630, term5630.getClass(), "words", term5631);
        setIntField(term5630, term5630.getClass(), "wordsInUse", 227321148);
        setBooleanField(term5630, term5630.getClass(), "sizeIsSticky", false);
        setField(term5619, term5619.getClass(), "bitset", term5630);
        setField(term5582, term5582.getClass(), "rightShore", term5619);
        setIntField(term5582, term5582.getClass(), "maxShoreSize", -266870537);
        setField(term5580, term5580.getClass(), "solution", term5582);
        setField(term5580, term5580.getClass(), "graph", null);
        term5636 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5637 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5638 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5642 = (int[]) newIntArray(9);
        Object term5654 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5655 = (long[]) newLongArray(1);
        setField(term5637, term5637.getClass(), "table", term5638);
        setIntField(term5637, term5637.getClass(), "count", -453010858);
        setIntField(term5637, term5637.getClass(), "threshold", 15);
        setFloatField(term5637, term5637.getClass(), "loadFactor", 0.75F);
        setField(term5636, term5636.getClass(), "posMap", term5637);
        setField(term5636, term5636.getClass(), "graph", null);
        setIntElement(term5642, 0, -1855427206);
        setIntElement(term5642, 1, -647618746);
        setIntElement(term5642, 2, -91129577);
        setIntElement(term5642, 3, 1629059877);
        setIntElement(term5642, 4, -649940550);
        setIntElement(term5642, 5, 36785954);
        setIntElement(term5642, 6, -907057089);
        setIntElement(term5642, 7, -1740998635);
        setIntElement(term5642, 8, 183857482);
        setField(term5636, term5636.getClass(), "vertices", term5642);
        setIntField(term5636, term5636.getClass(), "numVertices", -1845135476);
        setIntField(term5636, term5636.getClass(), "first", -811321521);
        setField(term5654, term5654.getClass(), "words", term5655);
        setIntField(term5654, term5654.getClass(), "wordsInUse", 449172516);
        setBooleanField(term5654, term5654.getClass(), "sizeIsSticky", false);
        setField(term5636, term5636.getClass(), "bitset", term5654);
        term5659 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5660 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5661 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5665 = (int[]) newIntArray(8);
        Object term5676 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5677 = (long[]) newLongArray(1);
        setField(term5660, term5660.getClass(), "table", term5661);
        setIntField(term5660, term5660.getClass(), "count", -1224535182);
        setIntField(term5660, term5660.getClass(), "threshold", 15);
        setFloatField(term5660, term5660.getClass(), "loadFactor", 0.75F);
        setField(term5659, term5659.getClass(), "posMap", term5660);
        setField(term5659, term5659.getClass(), "graph", null);
        setIntElement(term5665, 0, 1181771633);
        setIntElement(term5665, 1, -21975974);
        setIntElement(term5665, 2, -862969915);
        setIntElement(term5665, 3, -1289681614);
        setIntElement(term5665, 4, 496461454);
        setIntElement(term5665, 5, -697047947);
        setIntElement(term5665, 6, 505327656);
        setIntElement(term5665, 7, 1779734830);
        setField(term5659, term5659.getClass(), "vertices", term5665);
        setIntField(term5659, term5659.getClass(), "numVertices", -714618793);
        setIntField(term5659, term5659.getClass(), "first", 1350743761);
        setField(term5676, term5676.getClass(), "words", term5677);
        setIntField(term5676, term5676.getClass(), "wordsInUse", -2100246850);
        setBooleanField(term5676, term5676.getClass(), "sizeIsSticky", true);
        setField(term5659, term5659.getClass(), "bitset", term5676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.GreedyVertexSeparator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        argTypes[1] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[2];
        args[0] = term5636;
        args[1] = term5659;
        callMethod(klass, "choose", argTypes, term5580, args);
    }

};


