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
     Object term679;
     Object term687;

    public VertexHeap_siftUp_138076635515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term679 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term680 = (int[]) newIntArray(4);
        int[] term685 = (int[]) newIntArray(0);
        setField(term679, term679.getClass(), "graph", null);
        setField(term679, term679.getClass(), "comparator", null);
        setIntElement(term680, 0, 548228925);
        setIntElement(term680, 1, -749861210);
        setIntElement(term680, 2, 1694224101);
        setIntElement(term680, 3, 937859191);
        setField(term679, term679.getClass(), "keys", term680);
        setField(term679, term679.getClass(), "positions", term685);
        setIntField(term679, term679.getClass(), "size", -916584829);
        term687 = new Integer(-2131181468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term687;
        callMethod(klass, "siftUp", argTypes, term679, args);
    }

};


