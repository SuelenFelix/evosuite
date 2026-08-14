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

public class GreedyVertexSeparator_neighborhood_11188318084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5713;
     Object term5766;

    public GreedyVertexSeparator_neighborhood_11188318084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5713 = newInstance(Class.forName("org.graph4j.vsp.GreedyVertexSeparator"));
        Object term5715 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term5716 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5717 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5718 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5722 = (int[]) newIntArray(6);
        Object term5731 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5732 = (long[]) newLongArray(1);
        Object term5736 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5737 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5738 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5742 = (int[]) newIntArray(1);
        Object term5746 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5747 = (long[]) newLongArray(1);
        Object term5751 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5752 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5753 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5757 = (int[]) newIntArray(0);
        Object term5760 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5761 = (long[]) newLongArray(1);
        setIntField(term5713, term5713.getClass(), "maxShoreSize", 174682854);
        setField(term5715, term5715.getClass(), "graph", null);
        setField(term5717, term5717.getClass(), "table", term5718);
        setIntField(term5717, term5717.getClass(), "count", -1618786023);
        setIntField(term5717, term5717.getClass(), "threshold", 15);
        setFloatField(term5717, term5717.getClass(), "loadFactor", 0.75F);
        setField(term5716, term5716.getClass(), "posMap", term5717);
        setField(term5716, term5716.getClass(), "graph", null);
        setIntElement(term5722, 0, -316033780);
        setIntElement(term5722, 1, -1242223364);
        setIntElement(term5722, 2, -347672279);
        setIntElement(term5722, 3, -2001561246);
        setIntElement(term5722, 4, -526492477);
        setIntElement(term5722, 5, 934758494);
        setField(term5716, term5716.getClass(), "vertices", term5722);
        setIntField(term5716, term5716.getClass(), "numVertices", -1458746421);
        setIntField(term5716, term5716.getClass(), "first", 1248508832);
        setField(term5731, term5731.getClass(), "words", term5732);
        setIntField(term5731, term5731.getClass(), "wordsInUse", -1508290965);
        setBooleanField(term5731, term5731.getClass(), "sizeIsSticky", false);
        setField(term5716, term5716.getClass(), "bitset", term5731);
        setField(term5715, term5715.getClass(), "separator", term5716);
        setField(term5737, term5737.getClass(), "table", term5738);
        setIntField(term5737, term5737.getClass(), "count", -537204050);
        setIntField(term5737, term5737.getClass(), "threshold", 15);
        setFloatField(term5737, term5737.getClass(), "loadFactor", 0.75F);
        setField(term5736, term5736.getClass(), "posMap", term5737);
        setField(term5736, term5736.getClass(), "graph", null);
        setIntElement(term5742, 0, 549083285);
        setField(term5736, term5736.getClass(), "vertices", term5742);
        setIntField(term5736, term5736.getClass(), "numVertices", 110630919);
        setIntField(term5736, term5736.getClass(), "first", 2002558305);
        setField(term5746, term5746.getClass(), "words", term5747);
        setIntField(term5746, term5746.getClass(), "wordsInUse", -1729207675);
        setBooleanField(term5746, term5746.getClass(), "sizeIsSticky", true);
        setField(term5736, term5736.getClass(), "bitset", term5746);
        setField(term5715, term5715.getClass(), "leftShore", term5736);
        setField(term5752, term5752.getClass(), "table", term5753);
        setIntField(term5752, term5752.getClass(), "count", -861852803);
        setIntField(term5752, term5752.getClass(), "threshold", 15);
        setFloatField(term5752, term5752.getClass(), "loadFactor", 0.75F);
        setField(term5751, term5751.getClass(), "posMap", term5752);
        setField(term5751, term5751.getClass(), "graph", null);
        setField(term5751, term5751.getClass(), "vertices", term5757);
        setIntField(term5751, term5751.getClass(), "numVertices", -2085852488);
        setIntField(term5751, term5751.getClass(), "first", 600214846);
        setField(term5760, term5760.getClass(), "words", term5761);
        setIntField(term5760, term5760.getClass(), "wordsInUse", 697208850);
        setBooleanField(term5760, term5760.getClass(), "sizeIsSticky", true);
        setField(term5751, term5751.getClass(), "bitset", term5760);
        setField(term5715, term5715.getClass(), "rightShore", term5751);
        setIntField(term5715, term5715.getClass(), "maxShoreSize", -973142506);
        setField(term5713, term5713.getClass(), "solution", term5715);
        setField(term5713, term5713.getClass(), "graph", null);
        term5766 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5767 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5768 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5772 = (int[]) newIntArray(4);
        Object term5779 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5780 = (long[]) newLongArray(1);
        setField(term5767, term5767.getClass(), "table", term5768);
        setIntField(term5767, term5767.getClass(), "count", -15011809);
        setIntField(term5767, term5767.getClass(), "threshold", 15);
        setFloatField(term5767, term5767.getClass(), "loadFactor", 0.75F);
        setField(term5766, term5766.getClass(), "posMap", term5767);
        setField(term5766, term5766.getClass(), "graph", null);
        setIntElement(term5772, 0, -482193296);
        setIntElement(term5772, 1, 1506869786);
        setIntElement(term5772, 2, 950749769);
        setIntElement(term5772, 3, 1497396124);
        setField(term5766, term5766.getClass(), "vertices", term5772);
        setIntField(term5766, term5766.getClass(), "numVertices", 1013816325);
        setIntField(term5766, term5766.getClass(), "first", -756785345);
        setField(term5779, term5779.getClass(), "words", term5780);
        setIntField(term5779, term5779.getClass(), "wordsInUse", -1077451707);
        setBooleanField(term5779, term5779.getClass(), "sizeIsSticky", false);
        setField(term5766, term5766.getClass(), "bitset", term5779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.GreedyVertexSeparator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = term5766;
        callMethod(klass, "neighborhood", argTypes, term5713, args);
    }

};


