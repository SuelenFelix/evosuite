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

public class VertexHeap_update_35007212511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60132;
     Object term60143;

    public VertexHeap_update_35007212511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60132 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term60133 = (int[]) newIntArray(6);
        int[] term60140 = (int[]) newIntArray(1);
        setField(term60132, term60132.getClass(), "graph", null);
        setField(term60132, term60132.getClass(), "comparator", null);
        setIntElement(term60133, 0, -1324686514);
        setIntElement(term60133, 1, 1209639956);
        setIntElement(term60133, 2, -1463395842);
        setIntElement(term60133, 3, -1313344065);
        setIntElement(term60133, 4, 1228398077);
        setIntElement(term60133, 5, 110342291);
        setField(term60132, term60132.getClass(), "keys", term60133);
        setIntElement(term60140, 0, 905029929);
        setField(term60132, term60132.getClass(), "positions", term60140);
        setIntField(term60132, term60132.getClass(), "size", 2106266461);
        term60143 = new Integer(994139397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term60143;
        callMethod(klass, "update", argTypes, term60132, args);
    }

};


