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

public class VertexSet_clear_85579699911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150230;

    public VertexSet_clear_85579699911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150230 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term150231 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term150232 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term150236 = (int[]) newIntArray(5);
        Object term150244 = newInstance(Class.forName("java.util.BitSet"));
        long[] term150245 = (long[]) newLongArray(1);
        setField(term150231, term150231.getClass(), "table", term150232);
        setIntField(term150231, term150231.getClass(), "count", -1341626543);
        setIntField(term150231, term150231.getClass(), "threshold", 15);
        setFloatField(term150231, term150231.getClass(), "loadFactor", 0.75F);
        setField(term150230, term150230.getClass(), "posMap", term150231);
        setField(term150230, term150230.getClass(), "graph", null);
        setIntElement(term150236, 0, -1137648539);
        setIntElement(term150236, 1, 340452471);
        setIntElement(term150236, 2, -1419776016);
        setIntElement(term150236, 3, -92794673);
        setIntElement(term150236, 4, -734260206);
        setField(term150230, term150230.getClass(), "vertices", term150236);
        setIntField(term150230, term150230.getClass(), "numVertices", 2051924505);
        setIntField(term150230, term150230.getClass(), "first", -1701077210);
        setField(term150244, term150244.getClass(), "words", term150245);
        setIntField(term150244, term150244.getClass(), "wordsInUse", -765508777);
        setBooleanField(term150244, term150244.getClass(), "sizeIsSticky", true);
        setField(term150230, term150230.getClass(), "bitset", term150244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term150230, args);
    }

};


