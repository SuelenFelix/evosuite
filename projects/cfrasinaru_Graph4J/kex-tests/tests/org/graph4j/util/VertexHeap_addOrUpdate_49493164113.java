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

public class VertexHeap_addOrUpdate_49493164113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term645;
     Object term650;

    public VertexHeap_addOrUpdate_49493164113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term645 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term646 = (int[]) newIntArray(0);
        int[] term647 = (int[]) newIntArray(1);
        setField(term645, term645.getClass(), "graph", null);
        setField(term645, term645.getClass(), "comparator", null);
        setField(term645, term645.getClass(), "keys", term646);
        setIntElement(term647, 0, -1945706126);
        setField(term645, term645.getClass(), "positions", term647);
        setIntField(term645, term645.getClass(), "size", 1152356969);
        term650 = new Integer(-1667990367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term650;
        callMethod(klass, "addOrUpdate", argTypes, term645, args);
    }

};


