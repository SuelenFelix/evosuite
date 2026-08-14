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

public class GraphMetrics_distances_16821573216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5207;

    public GraphMetrics_distances_16821573216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5241 = new Integer(-117576464);
        Double term5243 = new Double(0.8598297828918529);
        Double term5245 = new Double(0.43692187681405226);
        Double term5247 = new Double(0.7633268466829064);
        term5207 = newInstance(Class.forName("org.graph4j.metrics.GraphMetrics"));
        Object[] term5208 = (Object[]) newArray("[D", 6);
        double[] term5209 = (double[]) newDoubleArray(5);
        double[] term5215 = (double[]) newDoubleArray(3);
        double[] term5219 = (double[]) newDoubleArray(4);
        double[] term5224 = (double[]) newDoubleArray(8);
        double[] term5233 = (double[]) newDoubleArray(0);
        double[] term5234 = (double[]) newDoubleArray(4);
        double[] term5239 = (double[]) newDoubleArray(1);
        Object term5249 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5250 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5251 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5255 = (int[]) newIntArray(0);
        Object term5258 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5259 = (long[]) newLongArray(1);
        Object term5263 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5264 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5265 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5269 = (int[]) newIntArray(1);
        Object term5273 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5274 = (long[]) newLongArray(1);
        setField(term5207, term5207.getClass(), "extremaCalculator", null);
        setDoubleElement(term5209, 0, 0.5407563152320285);
        setDoubleElement(term5209, 1, 0.9485929668765458);
        setDoubleElement(term5209, 2, 0.5179319342588155);
        setDoubleElement(term5209, 3, 0.25025774487844066);
        setDoubleElement(term5209, 4, 0.1858089882752998);
        setElement(term5208, 0, term5209);
        setDoubleElement(term5215, 0, 0.2440697646709713);
        setDoubleElement(term5215, 1, 0.7977455176064363);
        setDoubleElement(term5215, 2, 0.5329919447422633);
        setElement(term5208, 1, term5215);
        setDoubleElement(term5219, 0, 0.7046974927834232);
        setDoubleElement(term5219, 1, 0.6896952303224777);
        setDoubleElement(term5219, 2, 0.6693176553622628);
        setDoubleElement(term5219, 3, 0.2962868255626906);
        setElement(term5208, 2, term5219);
        setDoubleElement(term5224, 0, 0.25474180574060834);
        setDoubleElement(term5224, 1, 0.9957585718901875);
        setDoubleElement(term5224, 2, 0.16755811343784477);
        setDoubleElement(term5224, 3, 0.9090793968999221);
        setDoubleElement(term5224, 4, 0.25997329921466494);
        setDoubleElement(term5224, 5, 0.7814864708383836);
        setDoubleElement(term5224, 6, 0.5657654165545906);
        setDoubleElement(term5224, 7, 0.6382060245198228);
        setElement(term5208, 3, term5224);
        setElement(term5208, 4, term5233);
        setDoubleElement(term5234, 0, 0.1849998667663698);
        setDoubleElement(term5234, 1, 0.36312400202399575);
        setDoubleElement(term5234, 2, 0.5485690030548175);
        setDoubleElement(term5234, 3, 0.9765248027281291);
        setElement(term5208, 5, term5234);
        setField(term5207, term5207.getClass(), "dist", term5208);
        setDoubleElement(term5239, 0, 0.9184034277897645);
        setField(term5207, term5207.getClass(), "ecc", term5239);
        setField(term5207, term5207.getClass(), "girth", term5241);
        setField(term5207, term5207.getClass(), "diameter", term5243);
        setField(term5207, term5207.getClass(), "pseudoDiameter", term5245);
        setField(term5207, term5207.getClass(), "radius", term5247);
        setField(term5250, term5250.getClass(), "table", term5251);
        setIntField(term5250, term5250.getClass(), "count", -1941343035);
        setIntField(term5250, term5250.getClass(), "threshold", 15);
        setFloatField(term5250, term5250.getClass(), "loadFactor", 0.75F);
        setField(term5249, term5249.getClass(), "posMap", term5250);
        setField(term5249, term5249.getClass(), "graph", null);
        setField(term5249, term5249.getClass(), "vertices", term5255);
        setIntField(term5249, term5249.getClass(), "numVertices", 947897214);
        setIntField(term5249, term5249.getClass(), "first", 1496340209);
        setField(term5258, term5258.getClass(), "words", term5259);
        setIntField(term5258, term5258.getClass(), "wordsInUse", -1748391876);
        setBooleanField(term5258, term5258.getClass(), "sizeIsSticky", false);
        setField(term5249, term5249.getClass(), "bitset", term5258);
        setField(term5207, term5207.getClass(), "center", term5249);
        setField(term5264, term5264.getClass(), "table", term5265);
        setIntField(term5264, term5264.getClass(), "count", 43258317);
        setIntField(term5264, term5264.getClass(), "threshold", 15);
        setFloatField(term5264, term5264.getClass(), "loadFactor", 0.75F);
        setField(term5263, term5263.getClass(), "posMap", term5264);
        setField(term5263, term5263.getClass(), "graph", null);
        setIntElement(term5269, 0, 1707220033);
        setField(term5263, term5263.getClass(), "vertices", term5269);
        setIntField(term5263, term5263.getClass(), "numVertices", -1792504217);
        setIntField(term5263, term5263.getClass(), "first", 1824538861);
        setField(term5273, term5273.getClass(), "words", term5274);
        setIntField(term5273, term5273.getClass(), "wordsInUse", 499519708);
        setBooleanField(term5273, term5273.getClass(), "sizeIsSticky", false);
        setField(term5263, term5263.getClass(), "bitset", term5273);
        setField(term5207, term5207.getClass(), "periphery", term5263);
        setField(term5207, term5207.getClass(), "graph", null);
        setBooleanField(term5207, term5207.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphMetrics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "distances", argTypes, term5207, args);
    }

};


