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
import java.lang.Integer;

public class VertexSet1_indexOf_182480144012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71549;
     Object term71568;

    public VertexSet1_indexOf_182480144012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71549 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71550 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71551 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71555 = (int[]) newIntArray(5);
        Object term71563 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71564 = (long[]) newLongArray(1);
        setField(term71550, term71550.getClass(), "table", term71551);
        setIntField(term71550, term71550.getClass(), "count", -240209237);
        setIntField(term71550, term71550.getClass(), "threshold", 15);
        setFloatField(term71550, term71550.getClass(), "loadFactor", 0.75F);
        setField(term71549, term71549.getClass(), "posMap", term71550);
        setField(term71549, term71549.getClass(), "graph", null);
        setIntElement(term71555, 0, 448751443);
        setIntElement(term71555, 1, -2026783706);
        setIntElement(term71555, 2, 36962226);
        setIntElement(term71555, 3, -787981404);
        setIntElement(term71555, 4, 503641255);
        setField(term71549, term71549.getClass(), "vertices", term71555);
        setIntField(term71549, term71549.getClass(), "numVertices", 556061823);
        setIntField(term71549, term71549.getClass(), "first", 1060184160);
        setField(term71563, term71563.getClass(), "words", term71564);
        setIntField(term71563, term71563.getClass(), "wordsInUse", 74678316);
        setBooleanField(term71563, term71563.getClass(), "sizeIsSticky", true);
        setField(term71549, term71549.getClass(), "bitset", term71563);
        term71568 = new Integer(1440958306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71568;
        callMethod(klass, "indexOf", argTypes, term71549, args);
    }

};


