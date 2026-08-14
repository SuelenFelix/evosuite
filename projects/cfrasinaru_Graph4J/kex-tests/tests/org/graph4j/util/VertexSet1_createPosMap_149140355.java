package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class VertexSet1_createPosMap_149140355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2754;

    public VertexSet1_createPosMap_149140355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2754 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term2755 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2756 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2760 = (int[]) newIntArray(9);
        Object term2772 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2773 = (long[]) newLongArray(1);
        setField(term2755, term2755.getClass(), "table", term2756);
        setIntField(term2755, term2755.getClass(), "count", 1343432022);
        setIntField(term2755, term2755.getClass(), "threshold", 15);
        setFloatField(term2755, term2755.getClass(), "loadFactor", 0.75F);
        setField(term2754, term2754.getClass(), "posMap", term2755);
        setField(term2754, term2754.getClass(), "graph", null);
        setIntElement(term2760, 0, -1767079160);
        setIntElement(term2760, 1, -201010601);
        setIntElement(term2760, 2, 2060027076);
        setIntElement(term2760, 3, 2084868811);
        setIntElement(term2760, 4, 314478878);
        setIntElement(term2760, 5, 1425342686);
        setIntElement(term2760, 6, -1042470635);
        setIntElement(term2760, 7, -524352937);
        setIntElement(term2760, 8, 1472218987);
        setField(term2754, term2754.getClass(), "vertices", term2760);
        setIntField(term2754, term2754.getClass(), "numVertices", 805176809);
        setIntField(term2754, term2754.getClass(), "first", -82632953);
        setField(term2772, term2772.getClass(), "words", term2773);
        setIntField(term2772, term2772.getClass(), "wordsInUse", -1473876284);
        setBooleanField(term2772, term2772.getClass(), "sizeIsSticky", true);
        setField(term2754, term2754.getClass(), "bitset", term2772);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createPosMap", argTypes, term2754, args);
    }

};


