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

public class VertexQueue_add_521555643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4231;
     Object term4248;

    public VertexQueue_add_521555643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4231 = newInstance(Class.forName("org.graph4j.util.VertexQueue"));
        int[] term4232 = (int[]) newIntArray(8);
        Object term4243 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4244 = (long[]) newLongArray(1);
        setField(term4231, term4231.getClass(), "graph", null);
        setIntElement(term4232, 0, -1151122332);
        setIntElement(term4232, 1, 953387911);
        setIntElement(term4232, 2, -1550025613);
        setIntElement(term4232, 3, 814617314);
        setIntElement(term4232, 4, -159489307);
        setIntElement(term4232, 5, 1317020952);
        setIntElement(term4232, 6, -742710703);
        setIntElement(term4232, 7, -355505521);
        setField(term4231, term4231.getClass(), "vertices", term4232);
        setIntField(term4231, term4231.getClass(), "numVertices", 1227316523);
        setIntField(term4231, term4231.getClass(), "first", -58633039);
        setField(term4243, term4243.getClass(), "words", term4244);
        setIntField(term4243, term4243.getClass(), "wordsInUse", 448061908);
        setBooleanField(term4243, term4243.getClass(), "sizeIsSticky", false);
        setField(term4231, term4231.getClass(), "bitset", term4243);
        term4248 = new Integer(-1268483887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexQueue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4248;
        callMethod(klass, "add", argTypes, term4231, args);
    }

};


