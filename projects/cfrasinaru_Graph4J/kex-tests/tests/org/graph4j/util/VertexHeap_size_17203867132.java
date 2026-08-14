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

public class VertexHeap_size_17203867132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term435;

    public VertexHeap_size_17203867132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term435 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term436 = (int[]) newIntArray(5);
        int[] term442 = (int[]) newIntArray(4);
        setField(term435, term435.getClass(), "graph", null);
        setField(term435, term435.getClass(), "comparator", null);
        setIntElement(term436, 0, 1596213415);
        setIntElement(term436, 1, -268815336);
        setIntElement(term436, 2, -1210583429);
        setIntElement(term436, 3, -663691365);
        setIntElement(term436, 4, 339854490);
        setField(term435, term435.getClass(), "keys", term436);
        setIntElement(term442, 0, -615654495);
        setIntElement(term442, 1, -1476117762);
        setIntElement(term442, 2, -341962980);
        setIntElement(term442, 3, 1532716628);
        setField(term435, term435.getClass(), "positions", term442);
        setIntField(term435, term435.getClass(), "size", -1801760683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "size", argTypes, term435, args);
    }

};


