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
import java.lang.Integer;

public class VertexSeparator_contains_13422699057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78739;
     Object term78796;

    public VertexSeparator_contains_13422699057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78739 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term78740 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78741 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78742 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78746 = (int[]) newIntArray(3);
        Object term78752 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78753 = (long[]) newLongArray(1);
        Object term78757 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78758 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78759 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78763 = (int[]) newIntArray(1);
        Object term78767 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78768 = (long[]) newLongArray(1);
        Object term78772 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78773 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78774 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78778 = (int[]) newIntArray(9);
        Object term78790 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78791 = (long[]) newLongArray(1);
        setField(term78739, term78739.getClass(), "graph", null);
        setField(term78741, term78741.getClass(), "table", term78742);
        setIntField(term78741, term78741.getClass(), "count", -1853602802);
        setIntField(term78741, term78741.getClass(), "threshold", 15);
        setFloatField(term78741, term78741.getClass(), "loadFactor", 0.75F);
        setField(term78740, term78740.getClass(), "posMap", term78741);
        setField(term78740, term78740.getClass(), "graph", null);
        setIntElement(term78746, 0, 1418314493);
        setIntElement(term78746, 1, -232598231);
        setIntElement(term78746, 2, -1780188367);
        setField(term78740, term78740.getClass(), "vertices", term78746);
        setIntField(term78740, term78740.getClass(), "numVertices", -1733286958);
        setIntField(term78740, term78740.getClass(), "first", 1883405940);
        setField(term78752, term78752.getClass(), "words", term78753);
        setIntField(term78752, term78752.getClass(), "wordsInUse", 821199094);
        setBooleanField(term78752, term78752.getClass(), "sizeIsSticky", false);
        setField(term78740, term78740.getClass(), "bitset", term78752);
        setField(term78739, term78739.getClass(), "separator", term78740);
        setField(term78758, term78758.getClass(), "table", term78759);
        setIntField(term78758, term78758.getClass(), "count", 2054042505);
        setIntField(term78758, term78758.getClass(), "threshold", 15);
        setFloatField(term78758, term78758.getClass(), "loadFactor", 0.75F);
        setField(term78757, term78757.getClass(), "posMap", term78758);
        setField(term78757, term78757.getClass(), "graph", null);
        setIntElement(term78763, 0, 1071566861);
        setField(term78757, term78757.getClass(), "vertices", term78763);
        setIntField(term78757, term78757.getClass(), "numVertices", 10685441);
        setIntField(term78757, term78757.getClass(), "first", -739572674);
        setField(term78767, term78767.getClass(), "words", term78768);
        setIntField(term78767, term78767.getClass(), "wordsInUse", -1228576844);
        setBooleanField(term78767, term78767.getClass(), "sizeIsSticky", true);
        setField(term78757, term78757.getClass(), "bitset", term78767);
        setField(term78739, term78739.getClass(), "leftShore", term78757);
        setField(term78773, term78773.getClass(), "table", term78774);
        setIntField(term78773, term78773.getClass(), "count", 1430441426);
        setIntField(term78773, term78773.getClass(), "threshold", 15);
        setFloatField(term78773, term78773.getClass(), "loadFactor", 0.75F);
        setField(term78772, term78772.getClass(), "posMap", term78773);
        setField(term78772, term78772.getClass(), "graph", null);
        setIntElement(term78778, 0, -33697595);
        setIntElement(term78778, 1, 1376076514);
        setIntElement(term78778, 2, -1838652199);
        setIntElement(term78778, 3, 1298254943);
        setIntElement(term78778, 4, 816808363);
        setIntElement(term78778, 5, 1297344752);
        setIntElement(term78778, 6, 2091257387);
        setIntElement(term78778, 7, 1262385462);
        setIntElement(term78778, 8, 146198205);
        setField(term78772, term78772.getClass(), "vertices", term78778);
        setIntField(term78772, term78772.getClass(), "numVertices", 1811207533);
        setIntField(term78772, term78772.getClass(), "first", -1241224611);
        setField(term78790, term78790.getClass(), "words", term78791);
        setIntField(term78790, term78790.getClass(), "wordsInUse", 1661530764);
        setBooleanField(term78790, term78790.getClass(), "sizeIsSticky", true);
        setField(term78772, term78772.getClass(), "bitset", term78790);
        setField(term78739, term78739.getClass(), "rightShore", term78772);
        setIntField(term78739, term78739.getClass(), "maxShoreSize", -1244991565);
        term78796 = new Integer(-865604268);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.VertexSeparator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term78796;
        callMethod(klass, "contains", argTypes, term78739, args);
    }

};


