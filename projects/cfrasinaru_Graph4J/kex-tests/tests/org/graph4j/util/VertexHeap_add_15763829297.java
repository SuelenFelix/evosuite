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

public class VertexHeap_add_15763829297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60038;
     Object term60054;

    public VertexHeap_add_15763829297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60038 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term60039 = (int[]) newIntArray(7);
        int[] term60047 = (int[]) newIntArray(5);
        setField(term60038, term60038.getClass(), "graph", null);
        setField(term60038, term60038.getClass(), "comparator", null);
        setIntElement(term60039, 0, 1938826379);
        setIntElement(term60039, 1, -1574173199);
        setIntElement(term60039, 2, -1165441979);
        setIntElement(term60039, 3, -1921642793);
        setIntElement(term60039, 4, -753596691);
        setIntElement(term60039, 5, 1203822968);
        setIntElement(term60039, 6, -149149061);
        setField(term60038, term60038.getClass(), "keys", term60039);
        setIntElement(term60047, 0, 1599802857);
        setIntElement(term60047, 1, -284767862);
        setIntElement(term60047, 2, 1346515345);
        setIntElement(term60047, 3, 2132293781);
        setIntElement(term60047, 4, 1025837124);
        setField(term60038, term60038.getClass(), "positions", term60047);
        setIntField(term60038, term60038.getClass(), "size", -1875484532);
        term60054 = new Integer(2142478049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term60054;
        callMethod(klass, "add", argTypes, term60038, args);
    }

};


