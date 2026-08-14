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

public class Path_firstVertex_19913828393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6437;

    public Path_firstVertex_19913828393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6437 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term6439 = (int[]) newIntArray(8);
        Object term6450 = newInstance(Class.forName("java.util.BitSet"));
        long[] term6451 = (long[]) newLongArray(1);
        setIntField(term6437, term6437.getClass(), "numEdges", -267289967);
        setField(term6437, term6437.getClass(), "graph", null);
        setIntElement(term6439, 0, 773432822);
        setIntElement(term6439, 1, -488294922);
        setIntElement(term6439, 2, -397161164);
        setIntElement(term6439, 3, -703717191);
        setIntElement(term6439, 4, -1255535445);
        setIntElement(term6439, 5, -2033952124);
        setIntElement(term6439, 6, 560401653);
        setIntElement(term6439, 7, 1633691536);
        setField(term6437, term6437.getClass(), "vertices", term6439);
        setIntField(term6437, term6437.getClass(), "numVertices", 898165245);
        setIntField(term6437, term6437.getClass(), "first", 1810754549);
        setField(term6450, term6450.getClass(), "words", term6451);
        setIntField(term6450, term6450.getClass(), "wordsInUse", 338342107);
        setBooleanField(term6450, term6450.getClass(), "sizeIsSticky", true);
        setField(term6437, term6437.getClass(), "bitset", term6450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Path");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "firstVertex", argTypes, term6437, args);
    }

};


