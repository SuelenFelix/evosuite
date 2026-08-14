package org.graph4j.metrics;

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
import static org.graph4j.metrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;

public class ParallelExtremaCalculator_getCenter_16018246564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1797;

    public ParallelExtremaCalculator_getCenter_16018246564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1836 = new Integer(-1955890973);
        Integer term1838 = new Integer(-2038273078);
        Class<? extends Object> term1905 = Class.forName((String) "org.graph4j.metrics.ParallelExtremaCalculator$Type");
        Field term1904 = ((Class) term1905).getDeclaredField((String) "RADIUS");
        ((Field) term1904).setAccessible(true);
        Object enum5 = ((Field) term1904).get((Object) null);
        term1797 = newInstance(Class.forName("org.graph4j.metrics.ParallelExtremaCalculator"));
        int[] term1802 = (int[]) newIntArray(2);
        int[] term1805 = (int[]) newIntArray(8);
        Object term1814 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term1815 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term1816 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term1820 = (int[]) newIntArray(6);
        Object term1829 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1830 = (long[]) newLongArray(1);
        Object term1840 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term1841 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term1842 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term1846 = (int[]) newIntArray(2);
        Object term1851 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1852 = (long[]) newLongArray(1);
        Object term1856 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term1857 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term1858 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term1862 = (int[]) newIntArray(1);
        Object term1866 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1867 = (long[]) newLongArray(1);
        setIntField(term1797, term1797.getClass(), "radiusLB", -1210583429);
        setIntField(term1797, term1797.getClass(), "radiusUB", -663691365);
        setIntField(term1797, term1797.getClass(), "diamLB", 339854490);
        setIntField(term1797, term1797.getClass(), "diamUB", -615654495);
        setIntElement(term1802, 0, -1476117762);
        setIntElement(term1802, 1, -341962980);
        setField(term1797, term1797.getClass(), "eccLB", term1802);
        setIntElement(term1805, 0, 1532716628);
        setIntElement(term1805, 1, -1801760683);
        setIntElement(term1805, 2, 1141317871);
        setIntElement(term1805, 3, 890669485);
        setIntElement(term1805, 4, 691577392);
        setIntElement(term1805, 5, -893623680);
        setIntElement(term1805, 6, -1963434938);
        setIntElement(term1805, 7, 906181092);
        setField(term1797, term1797.getClass(), "eccUB", term1805);
        setField(term1815, term1815.getClass(), "table", term1816);
        setIntField(term1815, term1815.getClass(), "count", 1045657203);
        setIntField(term1815, term1815.getClass(), "threshold", 15);
        setFloatField(term1815, term1815.getClass(), "loadFactor", 0.75F);
        setField(term1814, term1814.getClass(), "posMap", term1815);
        setField(term1814, term1814.getClass(), "graph", null);
        setIntElement(term1820, 0, 1386130016);
        setIntElement(term1820, 1, 1072005683);
        setIntElement(term1820, 2, 1861318859);
        setIntElement(term1820, 3, 1474524152);
        setIntElement(term1820, 4, 568954359);
        setIntElement(term1820, 5, 53410913);
        setField(term1814, term1814.getClass(), "vertices", term1820);
        setIntField(term1814, term1814.getClass(), "numVertices", -375014958);
        setIntField(term1814, term1814.getClass(), "first", 1107176718);
        setField(term1829, term1829.getClass(), "words", term1830);
        setIntField(term1829, term1829.getClass(), "wordsInUse", 480137250);
        setBooleanField(term1829, term1829.getClass(), "sizeIsSticky", false);
        setField(term1814, term1814.getClass(), "bitset", term1829);
        setField(term1797, term1797.getClass(), "candidates", term1814);
        setBooleanField(term1797, term1797.getClass(), "selector", true);
        setBooleanField(term1797, term1797.getClass(), "connected", true);
        setField(term1797, term1797.getClass(), "radius", term1836);
        setField(term1797, term1797.getClass(), "diameter", term1838);
        setField(term1841, term1841.getClass(), "table", term1842);
        setIntField(term1841, term1841.getClass(), "count", -341152642);
        setIntField(term1841, term1841.getClass(), "threshold", 15);
        setFloatField(term1841, term1841.getClass(), "loadFactor", 0.75F);
        setField(term1840, term1840.getClass(), "posMap", term1841);
        setField(term1840, term1840.getClass(), "graph", null);
        setIntElement(term1846, 0, -2015854073);
        setIntElement(term1846, 1, 538259104);
        setField(term1840, term1840.getClass(), "vertices", term1846);
        setIntField(term1840, term1840.getClass(), "numVertices", 96566506);
        setIntField(term1840, term1840.getClass(), "first", -343325701);
        setField(term1851, term1851.getClass(), "words", term1852);
        setIntField(term1851, term1851.getClass(), "wordsInUse", 107945604);
        setBooleanField(term1851, term1851.getClass(), "sizeIsSticky", true);
        setField(term1840, term1840.getClass(), "bitset", term1851);
        setField(term1797, term1797.getClass(), "center", term1840);
        setField(term1857, term1857.getClass(), "table", term1858);
        setIntField(term1857, term1857.getClass(), "count", -1963464809);
        setIntField(term1857, term1857.getClass(), "threshold", 15);
        setFloatField(term1857, term1857.getClass(), "loadFactor", 0.75F);
        setField(term1856, term1856.getClass(), "posMap", term1857);
        setField(term1856, term1856.getClass(), "graph", null);
        setIntElement(term1862, 0, 71190297);
        setField(term1856, term1856.getClass(), "vertices", term1862);
        setIntField(term1856, term1856.getClass(), "numVertices", 1202361360);
        setIntField(term1856, term1856.getClass(), "first", -2015048153);
        setField(term1866, term1866.getClass(), "words", term1867);
        setIntField(term1866, term1866.getClass(), "wordsInUse", -2063457669);
        setBooleanField(term1866, term1866.getClass(), "sizeIsSticky", true);
        setField(term1856, term1856.getClass(), "bitset", term1866);
        setField(term1797, term1797.getClass(), "periphery", term1856);
        setField(term1797, term1797.getClass(), "extremaType", enum5);
        setField(term1797, term1797.getClass(), "graph", null);
        setBooleanField(term1797, term1797.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.ParallelExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCenter", argTypes, term1797, args);
    }

};


