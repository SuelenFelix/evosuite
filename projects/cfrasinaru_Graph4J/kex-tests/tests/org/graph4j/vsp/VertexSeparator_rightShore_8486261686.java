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

public class VertexSeparator_rightShore_8486261686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78678;

    public VertexSeparator_rightShore_8486261686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78678 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term78679 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78680 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78681 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78685 = (int[]) newIntArray(1);
        Object term78689 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78690 = (long[]) newLongArray(1);
        Object term78694 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78695 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78696 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78700 = (int[]) newIntArray(5);
        Object term78708 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78709 = (long[]) newLongArray(1);
        Object term78713 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78714 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78715 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78719 = (int[]) newIntArray(1);
        Object term78723 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78724 = (long[]) newLongArray(1);
        setField(term78678, term78678.getClass(), "graph", null);
        setField(term78680, term78680.getClass(), "table", term78681);
        setIntField(term78680, term78680.getClass(), "count", 1162343322);
        setIntField(term78680, term78680.getClass(), "threshold", 15);
        setFloatField(term78680, term78680.getClass(), "loadFactor", 0.75F);
        setField(term78679, term78679.getClass(), "posMap", term78680);
        setField(term78679, term78679.getClass(), "graph", null);
        setIntElement(term78685, 0, -769830529);
        setField(term78679, term78679.getClass(), "vertices", term78685);
        setIntField(term78679, term78679.getClass(), "numVertices", 980926498);
        setIntField(term78679, term78679.getClass(), "first", 215326924);
        setField(term78689, term78689.getClass(), "words", term78690);
        setIntField(term78689, term78689.getClass(), "wordsInUse", -1550515105);
        setBooleanField(term78689, term78689.getClass(), "sizeIsSticky", false);
        setField(term78679, term78679.getClass(), "bitset", term78689);
        setField(term78678, term78678.getClass(), "separator", term78679);
        setField(term78695, term78695.getClass(), "table", term78696);
        setIntField(term78695, term78695.getClass(), "count", -1856677255);
        setIntField(term78695, term78695.getClass(), "threshold", 15);
        setFloatField(term78695, term78695.getClass(), "loadFactor", 0.75F);
        setField(term78694, term78694.getClass(), "posMap", term78695);
        setField(term78694, term78694.getClass(), "graph", null);
        setIntElement(term78700, 0, -1066312681);
        setIntElement(term78700, 1, 1151101967);
        setIntElement(term78700, 2, 720162054);
        setIntElement(term78700, 3, 1656175535);
        setIntElement(term78700, 4, -529922125);
        setField(term78694, term78694.getClass(), "vertices", term78700);
        setIntField(term78694, term78694.getClass(), "numVertices", -1030934359);
        setIntField(term78694, term78694.getClass(), "first", -1413405889);
        setField(term78708, term78708.getClass(), "words", term78709);
        setIntField(term78708, term78708.getClass(), "wordsInUse", 351830399);
        setBooleanField(term78708, term78708.getClass(), "sizeIsSticky", false);
        setField(term78694, term78694.getClass(), "bitset", term78708);
        setField(term78678, term78678.getClass(), "leftShore", term78694);
        setField(term78714, term78714.getClass(), "table", term78715);
        setIntField(term78714, term78714.getClass(), "count", -398403935);
        setIntField(term78714, term78714.getClass(), "threshold", 15);
        setFloatField(term78714, term78714.getClass(), "loadFactor", 0.75F);
        setField(term78713, term78713.getClass(), "posMap", term78714);
        setField(term78713, term78713.getClass(), "graph", null);
        setIntElement(term78719, 0, -1098793577);
        setField(term78713, term78713.getClass(), "vertices", term78719);
        setIntField(term78713, term78713.getClass(), "numVertices", 937901039);
        setIntField(term78713, term78713.getClass(), "first", 729310767);
        setField(term78723, term78723.getClass(), "words", term78724);
        setIntField(term78723, term78723.getClass(), "wordsInUse", -517546330);
        setBooleanField(term78723, term78723.getClass(), "sizeIsSticky", true);
        setField(term78713, term78713.getClass(), "bitset", term78723);
        setField(term78678, term78678.getClass(), "rightShore", term78713);
        setIntField(term78678, term78678.getClass(), "maxShoreSize", -1850791590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.VertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "rightShore", argTypes, term78678, args);
    }

};


