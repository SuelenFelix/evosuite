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
import java.lang.Integer;

public class VertexHeap_siftUp_138076635515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60264;
     Object term60281;

    public VertexHeap_siftUp_138076635515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60264 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term60265 = (int[]) newIntArray(6);
        int[] term60272 = (int[]) newIntArray(7);
        setField(term60264, term60264.getClass(), "graph", null);
        setField(term60264, term60264.getClass(), "comparator", null);
        setIntElement(term60265, 0, -1550958883);
        setIntElement(term60265, 1, 503390830);
        setIntElement(term60265, 2, 481544604);
        setIntElement(term60265, 3, 175410744);
        setIntElement(term60265, 4, 751883814);
        setIntElement(term60265, 5, 2060779599);
        setField(term60264, term60264.getClass(), "keys", term60265);
        setIntElement(term60272, 0, 1859655153);
        setIntElement(term60272, 1, -653654938);
        setIntElement(term60272, 2, -1913348296);
        setIntElement(term60272, 3, -901199958);
        setIntElement(term60272, 4, 426906221);
        setIntElement(term60272, 5, 394662686);
        setIntElement(term60272, 6, -910791861);
        setField(term60264, term60264.getClass(), "positions", term60272);
        setIntField(term60264, term60264.getClass(), "size", -178690612);
        term60281 = new Integer(-1794156731);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term60281;
        callMethod(klass, "siftUp", argTypes, term60264, args);
    }

};


