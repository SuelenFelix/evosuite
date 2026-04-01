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

public class Cycle_length_9766237226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57014;

    public Cycle_length_9766237226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57014 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term57016 = (int[]) newIntArray(7);
        Object term57026 = newInstance(Class.forName("java.util.BitSet"));
        long[] term57027 = (long[]) newLongArray(1);
        setIntField(term57014, term57014.getClass(), "numEdges", -1757025350);
        setField(term57014, term57014.getClass(), "graph", null);
        setIntElement(term57016, 0, 241494222);
        setIntElement(term57016, 1, -1394120293);
        setIntElement(term57016, 2, 1365082165);
        setIntElement(term57016, 3, 237330727);
        setIntElement(term57016, 4, 1865561086);
        setIntElement(term57016, 5, -1717770104);
        setIntElement(term57016, 6, 1002436799);
        setField(term57014, term57014.getClass(), "vertices", term57016);
        setIntField(term57014, term57014.getClass(), "numVertices", 491797710);
        setIntField(term57014, term57014.getClass(), "first", -528313320);
        setField(term57026, term57026.getClass(), "words", term57027);
        setIntField(term57026, term57026.getClass(), "wordsInUse", 1438707097);
        setBooleanField(term57026, term57026.getClass(), "sizeIsSticky", true);
        setField(term57014, term57014.getClass(), "bitset", term57026);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Cycle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "length", argTypes, term57014, args);
    }

};


