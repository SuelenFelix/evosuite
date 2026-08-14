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
import java.lang.Integer;
import java.lang.Object;

public class TreeExtremaCalculator_getDiameter_3943138803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11512;

    public TreeExtremaCalculator_getDiameter_3943138803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11514 = new Integer(-1786399638);
        term11512 = newInstance(Class.forName("org.graph4j.metrics.TreeExtremaCalculator"));
        Object term11516 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term11517 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term11518 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term11522 = (int[]) newIntArray(9);
        Object term11534 = newInstance(Class.forName("java.util.BitSet"));
        long[] term11535 = (long[]) newLongArray(1);
        Object term11539 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term11540 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term11541 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term11545 = (int[]) newIntArray(6);
        Object term11554 = newInstance(Class.forName("java.util.BitSet"));
        long[] term11555 = (long[]) newLongArray(1);
        setIntField(term11512, term11512.getClass(), "startVertex", 376341151);
        setField(term11512, term11512.getClass(), "diameter", term11514);
        setField(term11517, term11517.getClass(), "table", term11518);
        setIntField(term11517, term11517.getClass(), "count", -1607267243);
        setIntField(term11517, term11517.getClass(), "threshold", 15);
        setFloatField(term11517, term11517.getClass(), "loadFactor", 0.75F);
        setField(term11516, term11516.getClass(), "posMap", term11517);
        setField(term11516, term11516.getClass(), "graph", null);
        setIntElement(term11522, 0, 1641377218);
        setIntElement(term11522, 1, 1235375204);
        setIntElement(term11522, 2, 258334639);
        setIntElement(term11522, 3, 1432187207);
        setIntElement(term11522, 4, -91068927);
        setIntElement(term11522, 5, 680714112);
        setIntElement(term11522, 6, 385297023);
        setIntElement(term11522, 7, -134092543);
        setIntElement(term11522, 8, -1703642288);
        setField(term11516, term11516.getClass(), "vertices", term11522);
        setIntField(term11516, term11516.getClass(), "numVertices", 2075139747);
        setIntField(term11516, term11516.getClass(), "first", 2092881418);
        setField(term11534, term11534.getClass(), "words", term11535);
        setIntField(term11534, term11534.getClass(), "wordsInUse", 1732410866);
        setBooleanField(term11534, term11534.getClass(), "sizeIsSticky", false);
        setField(term11516, term11516.getClass(), "bitset", term11534);
        setField(term11512, term11512.getClass(), "center", term11516);
        setField(term11540, term11540.getClass(), "table", term11541);
        setIntField(term11540, term11540.getClass(), "count", 1084102599);
        setIntField(term11540, term11540.getClass(), "threshold", 15);
        setFloatField(term11540, term11540.getClass(), "loadFactor", 0.75F);
        setField(term11539, term11539.getClass(), "posMap", term11540);
        setField(term11539, term11539.getClass(), "graph", null);
        setIntElement(term11545, 0, -1743503755);
        setIntElement(term11545, 1, 1641342112);
        setIntElement(term11545, 2, -1551790945);
        setIntElement(term11545, 3, 2039538484);
        setIntElement(term11545, 4, 1235736068);
        setIntElement(term11545, 5, 329424176);
        setField(term11539, term11539.getClass(), "vertices", term11545);
        setIntField(term11539, term11539.getClass(), "numVertices", -1897199214);
        setIntField(term11539, term11539.getClass(), "first", -1016478729);
        setField(term11554, term11554.getClass(), "words", term11555);
        setIntField(term11554, term11554.getClass(), "wordsInUse", -206889003);
        setBooleanField(term11554, term11554.getClass(), "sizeIsSticky", true);
        setField(term11539, term11539.getClass(), "bitset", term11554);
        setField(term11512, term11512.getClass(), "periphery", term11539);
        setField(term11512, term11512.getClass(), "graph", null);
        setBooleanField(term11512, term11512.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.TreeExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDiameter", argTypes, term11512, args);
    }

};


