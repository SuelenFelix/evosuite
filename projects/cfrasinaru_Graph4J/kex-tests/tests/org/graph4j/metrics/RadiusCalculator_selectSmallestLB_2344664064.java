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

public class RadiusCalculator_selectSmallestLB_2344664064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6234;

    public RadiusCalculator_selectSmallestLB_2344664064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6234 = newInstance(Class.forName("org.graph4j.metrics.RadiusCalculator"));
        Object term6237 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6238 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term6239 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term6243 = (int[]) newIntArray(5);
        Object term6251 = newInstance(Class.forName("java.util.BitSet"));
        long[] term6252 = (long[]) newLongArray(1);
        int[] term6256 = (int[]) newIntArray(5);
        int[] term6262 = (int[]) newIntArray(2);
        int[] term6265 = (int[]) newIntArray(0);
        setIntField(term6234, term6234.getClass(), "radiusLB", -1244386281);
        setIntField(term6234, term6234.getClass(), "radiusUB", -885788574);
        setField(term6238, term6238.getClass(), "table", term6239);
        setIntField(term6238, term6238.getClass(), "count", -865722613);
        setIntField(term6238, term6238.getClass(), "threshold", 15);
        setFloatField(term6238, term6238.getClass(), "loadFactor", 0.75F);
        setField(term6237, term6237.getClass(), "posMap", term6238);
        setField(term6237, term6237.getClass(), "graph", null);
        setIntElement(term6243, 0, -1551355284);
        setIntElement(term6243, 1, -1381970335);
        setIntElement(term6243, 2, 1213549815);
        setIntElement(term6243, 3, -1518419301);
        setIntElement(term6243, 4, 674879025);
        setField(term6237, term6237.getClass(), "vertices", term6243);
        setIntField(term6237, term6237.getClass(), "numVertices", -1538936030);
        setIntField(term6237, term6237.getClass(), "first", -752870423);
        setField(term6251, term6251.getClass(), "words", term6252);
        setIntField(term6251, term6251.getClass(), "wordsInUse", -1698809299);
        setBooleanField(term6251, term6251.getClass(), "sizeIsSticky", true);
        setField(term6237, term6237.getClass(), "bitset", term6251);
        setField(term6234, term6234.getClass(), "vertexSet", term6237);
        setIntElement(term6256, 0, 401512128);
        setIntElement(term6256, 1, -2069930777);
        setIntElement(term6256, 2, 1543696412);
        setIntElement(term6256, 3, -1385748168);
        setIntElement(term6256, 4, -270592367);
        setField(term6234, term6234.getClass(), "eccLB", term6256);
        setIntElement(term6262, 0, 178847646);
        setIntElement(term6262, 1, 273590437);
        setField(term6234, term6234.getClass(), "eccUB", term6262);
        setField(term6234, term6234.getClass(), "dist", term6265);
        setBooleanField(term6234, term6234.getClass(), "selector", true);
        setField(term6234, term6234.getClass(), "graph", null);
        setBooleanField(term6234, term6234.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.RadiusCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "selectSmallestLB", argTypes, term6234, args);
    }

};


