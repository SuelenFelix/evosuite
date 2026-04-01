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
import java.lang.Boolean;

public class GraphMetrics_eccentricity_15732411833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4872;
     Object term4939;
     Object term4941;

    public GraphMetrics_eccentricity_15732411833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4894 = new Integer(-655067527);
        Double term4896 = new Double(0.7655020693602768);
        Double term4898 = new Double(0.1374549299694151);
        Double term4900 = new Double(0.7031006357544823);
        term4872 = newInstance(Class.forName("org.graph4j.metrics.GraphMetrics"));
        Object[] term4873 = (Object[]) newArray("[D", 4);
        double[] term4874 = (double[]) newDoubleArray(1);
        double[] term4876 = (double[]) newDoubleArray(1);
        double[] term4878 = (double[]) newDoubleArray(6);
        double[] term4885 = (double[]) newDoubleArray(7);
        double[] term4893 = (double[]) newDoubleArray(0);
        Object term4902 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term4903 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term4904 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term4908 = (int[]) newIntArray(7);
        Object term4918 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4919 = (long[]) newLongArray(1);
        Object term4923 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term4924 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term4925 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term4929 = (int[]) newIntArray(1);
        Object term4933 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4934 = (long[]) newLongArray(1);
        setField(term4872, term4872.getClass(), "extremaCalculator", null);
        setDoubleElement(term4874, 0, 0.509895859167191);
        setElement(term4873, 0, term4874);
        setDoubleElement(term4876, 0, 0.07417792024383196);
        setElement(term4873, 1, term4876);
        setDoubleElement(term4878, 0, 0.686293604788188);
        setDoubleElement(term4878, 1, 0.12764449157430724);
        setDoubleElement(term4878, 2, 0.39446728256884744);
        setDoubleElement(term4878, 3, 0.7865909711092062);
        setDoubleElement(term4878, 4, 0.06587158449170749);
        setDoubleElement(term4878, 5, 0.0865998004187658);
        setElement(term4873, 2, term4878);
        setDoubleElement(term4885, 0, 0.9628647861255637);
        setDoubleElement(term4885, 1, 0.623231822150205);
        setDoubleElement(term4885, 2, 0.09037487793444521);
        setDoubleElement(term4885, 3, 0.6561919196821765);
        setDoubleElement(term4885, 4, 0.7330178886612495);
        setDoubleElement(term4885, 5, 0.7618164754425794);
        setDoubleElement(term4885, 6, 0.7385589312559342);
        setElement(term4873, 3, term4885);
        setField(term4872, term4872.getClass(), "dist", term4873);
        setField(term4872, term4872.getClass(), "ecc", term4893);
        setField(term4872, term4872.getClass(), "girth", term4894);
        setField(term4872, term4872.getClass(), "diameter", term4896);
        setField(term4872, term4872.getClass(), "pseudoDiameter", term4898);
        setField(term4872, term4872.getClass(), "radius", term4900);
        setField(term4903, term4903.getClass(), "table", term4904);
        setIntField(term4903, term4903.getClass(), "count", -1813280137);
        setIntField(term4903, term4903.getClass(), "threshold", 15);
        setFloatField(term4903, term4903.getClass(), "loadFactor", 0.75F);
        setField(term4902, term4902.getClass(), "posMap", term4903);
        setField(term4902, term4902.getClass(), "graph", null);
        setIntElement(term4908, 0, 719656595);
        setIntElement(term4908, 1, -1516995753);
        setIntElement(term4908, 2, -390501023);
        setIntElement(term4908, 3, -1667482829);
        setIntElement(term4908, 4, 1116576792);
        setIntElement(term4908, 5, -942194446);
        setIntElement(term4908, 6, -938508470);
        setField(term4902, term4902.getClass(), "vertices", term4908);
        setIntField(term4902, term4902.getClass(), "numVertices", 1242676024);
        setIntField(term4902, term4902.getClass(), "first", -1865023308);
        setField(term4918, term4918.getClass(), "words", term4919);
        setIntField(term4918, term4918.getClass(), "wordsInUse", 1698510819);
        setBooleanField(term4918, term4918.getClass(), "sizeIsSticky", false);
        setField(term4902, term4902.getClass(), "bitset", term4918);
        setField(term4872, term4872.getClass(), "center", term4902);
        setField(term4924, term4924.getClass(), "table", term4925);
        setIntField(term4924, term4924.getClass(), "count", -1553893255);
        setIntField(term4924, term4924.getClass(), "threshold", 15);
        setFloatField(term4924, term4924.getClass(), "loadFactor", 0.75F);
        setField(term4923, term4923.getClass(), "posMap", term4924);
        setField(term4923, term4923.getClass(), "graph", null);
        setIntElement(term4929, 0, 1303442927);
        setField(term4923, term4923.getClass(), "vertices", term4929);
        setIntField(term4923, term4923.getClass(), "numVertices", 794568325);
        setIntField(term4923, term4923.getClass(), "first", -434468428);
        setField(term4933, term4933.getClass(), "words", term4934);
        setIntField(term4933, term4933.getClass(), "wordsInUse", 1559605714);
        setBooleanField(term4933, term4933.getClass(), "sizeIsSticky", true);
        setField(term4923, term4923.getClass(), "bitset", term4933);
        setField(term4872, term4872.getClass(), "periphery", term4923);
        setField(term4872, term4872.getClass(), "graph", null);
        setBooleanField(term4872, term4872.getClass(), "directed", true);
        term4939 = new Integer(1146601902);
        term4941 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphMetrics");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term4939;
        args[1] = term4941;
        callMethod(klass, "eccentricity", argTypes, term4872, args);
    }

};


