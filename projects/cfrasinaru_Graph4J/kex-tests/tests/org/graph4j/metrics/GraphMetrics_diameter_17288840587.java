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

public class GraphMetrics_diameter_17288840587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5307;

    public GraphMetrics_diameter_17288840587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5339 = new Integer(-1007160944);
        Double term5341 = new Double(0.13481025392611334);
        Double term5343 = new Double(0.3800088629986428);
        Double term5345 = new Double(0.5840714198152577);
        term5307 = newInstance(Class.forName("org.graph4j.metrics.GraphMetrics"));
        Object[] term5308 = (Object[]) newArray("[D", 5);
        double[] term5309 = (double[]) newDoubleArray(3);
        double[] term5313 = (double[]) newDoubleArray(2);
        double[] term5316 = (double[]) newDoubleArray(2);
        double[] term5319 = (double[]) newDoubleArray(5);
        double[] term5325 = (double[]) newDoubleArray(4);
        double[] term5330 = (double[]) newDoubleArray(8);
        Object term5347 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5348 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5349 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5353 = (int[]) newIntArray(0);
        Object term5356 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5357 = (long[]) newLongArray(1);
        Object term5361 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5362 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5363 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5367 = (int[]) newIntArray(5);
        Object term5375 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5376 = (long[]) newLongArray(1);
        setField(term5307, term5307.getClass(), "extremaCalculator", null);
        setDoubleElement(term5309, 0, 0.9457448635091538);
        setDoubleElement(term5309, 1, 0.3238255203811462);
        setDoubleElement(term5309, 2, 0.2843894095932772);
        setElement(term5308, 0, term5309);
        setDoubleElement(term5313, 0, 0.2382345237223229);
        setDoubleElement(term5313, 1, 0.6037093070161561);
        setElement(term5308, 1, term5313);
        setDoubleElement(term5316, 0, 0.48050706663913145);
        setDoubleElement(term5316, 1, 0.4990217874180345);
        setElement(term5308, 2, term5316);
        setDoubleElement(term5319, 0, 0.22767631814145395);
        setDoubleElement(term5319, 1, 0.4630082575704827);
        setDoubleElement(term5319, 2, 0.8732511635701926);
        setDoubleElement(term5319, 3, 0.8977760608415547);
        setDoubleElement(term5319, 4, 0.3107086749915061);
        setElement(term5308, 3, term5319);
        setDoubleElement(term5325, 0, 0.18330246984174836);
        setDoubleElement(term5325, 1, 0.1941255640189572);
        setDoubleElement(term5325, 2, 0.2889811903417371);
        setDoubleElement(term5325, 3, 0.7856101337088763);
        setElement(term5308, 4, term5325);
        setField(term5307, term5307.getClass(), "dist", term5308);
        setDoubleElement(term5330, 0, 0.1782857269567425);
        setDoubleElement(term5330, 1, 0.17829386444171214);
        setDoubleElement(term5330, 2, 0.547995853732519);
        setDoubleElement(term5330, 3, 0.3483938514131425);
        setDoubleElement(term5330, 4, 0.0100718646868041);
        setDoubleElement(term5330, 5, 0.58265008665336);
        setDoubleElement(term5330, 6, 0.1163034938203874);
        setDoubleElement(term5330, 7, 0.1187814206908886);
        setField(term5307, term5307.getClass(), "ecc", term5330);
        setField(term5307, term5307.getClass(), "girth", term5339);
        setField(term5307, term5307.getClass(), "diameter", term5341);
        setField(term5307, term5307.getClass(), "pseudoDiameter", term5343);
        setField(term5307, term5307.getClass(), "radius", term5345);
        setField(term5348, term5348.getClass(), "table", term5349);
        setIntField(term5348, term5348.getClass(), "count", 1501165033);
        setIntField(term5348, term5348.getClass(), "threshold", 15);
        setFloatField(term5348, term5348.getClass(), "loadFactor", 0.75F);
        setField(term5347, term5347.getClass(), "posMap", term5348);
        setField(term5347, term5347.getClass(), "graph", null);
        setField(term5347, term5347.getClass(), "vertices", term5353);
        setIntField(term5347, term5347.getClass(), "numVertices", 510162332);
        setIntField(term5347, term5347.getClass(), "first", 888506903);
        setField(term5356, term5356.getClass(), "words", term5357);
        setIntField(term5356, term5356.getClass(), "wordsInUse", 200252898);
        setBooleanField(term5356, term5356.getClass(), "sizeIsSticky", false);
        setField(term5347, term5347.getClass(), "bitset", term5356);
        setField(term5307, term5307.getClass(), "center", term5347);
        setField(term5362, term5362.getClass(), "table", term5363);
        setIntField(term5362, term5362.getClass(), "count", -1831826725);
        setIntField(term5362, term5362.getClass(), "threshold", 15);
        setFloatField(term5362, term5362.getClass(), "loadFactor", 0.75F);
        setField(term5361, term5361.getClass(), "posMap", term5362);
        setField(term5361, term5361.getClass(), "graph", null);
        setIntElement(term5367, 0, 752152965);
        setIntElement(term5367, 1, -1577069773);
        setIntElement(term5367, 2, -266625190);
        setIntElement(term5367, 3, 489201218);
        setIntElement(term5367, 4, 464181937);
        setField(term5361, term5361.getClass(), "vertices", term5367);
        setIntField(term5361, term5361.getClass(), "numVertices", -1455526612);
        setIntField(term5361, term5361.getClass(), "first", -941356098);
        setField(term5375, term5375.getClass(), "words", term5376);
        setIntField(term5375, term5375.getClass(), "wordsInUse", -201517446);
        setBooleanField(term5375, term5375.getClass(), "sizeIsSticky", false);
        setField(term5361, term5361.getClass(), "bitset", term5375);
        setField(term5307, term5307.getClass(), "periphery", term5361);
        setField(term5307, term5307.getClass(), "graph", null);
        setBooleanField(term5307, term5307.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphMetrics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "diameter", argTypes, term5307, args);
    }

};


