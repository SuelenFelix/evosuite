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
import java.lang.Double;

public class TreeMetrics_girth_20102213761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3819;

    public TreeMetrics_girth_20102213761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3871 = new Integer(-1685132342);
        Double term3873 = new Double(0.13238746331190498);
        Double term3875 = new Double(0.3455959125047594);
        Double term3877 = new Double(0.5523635872663106);
        term3819 = newInstance(Class.forName("org.graph4j.metrics.TreeMetrics"));
        Object[] term3820 = (Object[]) newArray("[D", 6);
        double[] term3821 = (double[]) newDoubleArray(2);
        double[] term3824 = (double[]) newDoubleArray(8);
        double[] term3833 = (double[]) newDoubleArray(3);
        double[] term3837 = (double[]) newDoubleArray(6);
        double[] term3844 = (double[]) newDoubleArray(8);
        double[] term3853 = (double[]) newDoubleArray(9);
        double[] term3863 = (double[]) newDoubleArray(7);
        Object term3879 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3880 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3881 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3885 = (int[]) newIntArray(3);
        Object term3891 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3892 = (long[]) newLongArray(1);
        Object term3896 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3897 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3898 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3902 = (int[]) newIntArray(4);
        Object term3909 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3910 = (long[]) newLongArray(1);
        setField(term3819, term3819.getClass(), "extremaCalculator", null);
        setDoubleElement(term3821, 0, 0.13238746331190498);
        setDoubleElement(term3821, 1, 0.3455959125047594);
        setElement(term3820, 0, term3821);
        setDoubleElement(term3824, 0, 0.5523635872663106);
        setDoubleElement(term3824, 1, 0.544608645520025);
        setDoubleElement(term3824, 2, 0.28570734989730284);
        setDoubleElement(term3824, 3, 0.40176586625454525);
        setDoubleElement(term3824, 4, 0.2641345529914265);
        setDoubleElement(term3824, 5, 0.36923381893433327);
        setDoubleElement(term3824, 6, 0.6076495596892013);
        setDoubleElement(term3824, 7, 0.37773193782763337);
        setElement(term3820, 1, term3824);
        setDoubleElement(term3833, 0, 0.8474802076607362);
        setDoubleElement(term3833, 1, 0.5183269973490326);
        setDoubleElement(term3833, 2, 0.7655020693602768);
        setElement(term3820, 2, term3833);
        setDoubleElement(term3837, 0, 0.1374549299694151);
        setDoubleElement(term3837, 1, 0.7031006357544823);
        setDoubleElement(term3837, 2, 0.9527281779865117);
        setDoubleElement(term3837, 3, 0.9828442029246764);
        setDoubleElement(term3837, 4, 0.2779719046761513);
        setDoubleElement(term3837, 5, 0.6436713023569729);
        setElement(term3820, 3, term3837);
        setDoubleElement(term3844, 0, 0.7332741045694002);
        setDoubleElement(term3844, 1, 0.4569171842750229);
        setDoubleElement(term3844, 2, 0.8598297828918529);
        setDoubleElement(term3844, 3, 0.43692187681405226);
        setDoubleElement(term3844, 4, 0.7633268466829064);
        setDoubleElement(term3844, 5, 0.13481025392611334);
        setDoubleElement(term3844, 6, 0.3800088629986428);
        setDoubleElement(term3844, 7, 0.5840714198152577);
        setElement(term3820, 4, term3844);
        setDoubleElement(term3853, 0, 0.7559240768573477);
        setDoubleElement(term3853, 1, 0.10667076642995188);
        setDoubleElement(term3853, 2, 0.11493000848982304);
        setDoubleElement(term3853, 3, 0.37161417339133307);
        setDoubleElement(term3853, 4, 0.6805867182029153);
        setDoubleElement(term3853, 5, 0.2852810965221698);
        setDoubleElement(term3853, 6, 0.6300849762307866);
        setDoubleElement(term3853, 7, 0.9737083944266686);
        setDoubleElement(term3853, 8, 0.0668892744806211);
        setElement(term3820, 5, term3853);
        setField(term3819, term3819.getClass(), "dist", term3820);
        setDoubleElement(term3863, 0, 0.3587267442738795);
        setDoubleElement(term3863, 1, 0.07802449704920456);
        setDoubleElement(term3863, 2, 0.5279279537140873);
        setDoubleElement(term3863, 3, 0.3202192021706908);
        setDoubleElement(term3863, 4, 0.22651340641904605);
        setDoubleElement(term3863, 5, 0.8878841294187743);
        setDoubleElement(term3863, 6, 0.6588948704887806);
        setField(term3819, term3819.getClass(), "ecc", term3863);
        setField(term3819, term3819.getClass(), "girth", term3871);
        setField(term3819, term3819.getClass(), "diameter", term3873);
        setField(term3819, term3819.getClass(), "pseudoDiameter", term3875);
        setField(term3819, term3819.getClass(), "radius", term3877);
        setField(term3880, term3880.getClass(), "table", term3881);
        setIntField(term3880, term3880.getClass(), "count", 1252951645);
        setIntField(term3880, term3880.getClass(), "threshold", 15);
        setFloatField(term3880, term3880.getClass(), "loadFactor", 0.75F);
        setField(term3879, term3879.getClass(), "posMap", term3880);
        setField(term3879, term3879.getClass(), "graph", null);
        setIntElement(term3885, 0, 574481092);
        setIntElement(term3885, 1, -310528004);
        setIntElement(term3885, 2, -634976996);
        setField(term3879, term3879.getClass(), "vertices", term3885);
        setIntField(term3879, term3879.getClass(), "numVertices", -1015274146);
        setIntField(term3879, term3879.getClass(), "first", -49052672);
        setField(term3891, term3891.getClass(), "words", term3892);
        setIntField(term3891, term3891.getClass(), "wordsInUse", 339372704);
        setBooleanField(term3891, term3891.getClass(), "sizeIsSticky", true);
        setField(term3879, term3879.getClass(), "bitset", term3891);
        setField(term3819, term3819.getClass(), "center", term3879);
        setField(term3897, term3897.getClass(), "table", term3898);
        setIntField(term3897, term3897.getClass(), "count", -851097944);
        setIntField(term3897, term3897.getClass(), "threshold", 15);
        setFloatField(term3897, term3897.getClass(), "loadFactor", 0.75F);
        setField(term3896, term3896.getClass(), "posMap", term3897);
        setField(term3896, term3896.getClass(), "graph", null);
        setIntElement(term3902, 0, 803925431);
        setIntElement(term3902, 1, 76929641);
        setIntElement(term3902, 2, -2003192918);
        setIntElement(term3902, 3, -1362856620);
        setField(term3896, term3896.getClass(), "vertices", term3902);
        setIntField(term3896, term3896.getClass(), "numVertices", -1835839814);
        setIntField(term3896, term3896.getClass(), "first", -1404350380);
        setField(term3909, term3909.getClass(), "words", term3910);
        setIntField(term3909, term3909.getClass(), "wordsInUse", -2013924238);
        setBooleanField(term3909, term3909.getClass(), "sizeIsSticky", false);
        setField(term3896, term3896.getClass(), "bitset", term3909);
        setField(term3819, term3819.getClass(), "periphery", term3896);
        setField(term3819, term3819.getClass(), "graph", null);
        setBooleanField(term3819, term3819.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.TreeMetrics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "girth", argTypes, term3819, args);
    }

};


