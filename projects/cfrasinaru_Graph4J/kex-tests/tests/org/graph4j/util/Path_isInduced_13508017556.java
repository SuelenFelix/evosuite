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

public class Path_isInduced_13508017556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6502;

    public Path_isInduced_13508017556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6502 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term6504 = (int[]) newIntArray(3);
        Object term6510 = newInstance(Class.forName("java.util.BitSet"));
        long[] term6511 = (long[]) newLongArray(1);
        setIntField(term6502, term6502.getClass(), "numEdges", 1909773180);
        setField(term6502, term6502.getClass(), "graph", null);
        setIntElement(term6504, 0, -970417907);
        setIntElement(term6504, 1, 1097894139);
        setIntElement(term6504, 2, 390256347);
        setField(term6502, term6502.getClass(), "vertices", term6504);
        setIntField(term6502, term6502.getClass(), "numVertices", 1471619998);
        setIntField(term6502, term6502.getClass(), "first", -1623489521);
        setField(term6510, term6510.getClass(), "words", term6511);
        setIntField(term6510, term6510.getClass(), "wordsInUse", 1179937517);
        setBooleanField(term6510, term6510.getClass(), "sizeIsSticky", true);
        setField(term6502, term6502.getClass(), "bitset", term6510);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Path");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInduced", argTypes, term6502, args);
    }

};


