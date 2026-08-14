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

public class VertexHeap_verify_62792881719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term759;

    public VertexHeap_verify_62792881719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term759 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term760 = (int[]) newIntArray(7);
        int[] term768 = (int[]) newIntArray(1);
        setField(term759, term759.getClass(), "graph", null);
        setField(term759, term759.getClass(), "comparator", null);
        setIntElement(term760, 0, 1460722225);
        setIntElement(term760, 1, 1743224434);
        setIntElement(term760, 2, 842904495);
        setIntElement(term760, 3, 1008080511);
        setIntElement(term760, 4, 1935707624);
        setIntElement(term760, 5, 1507074215);
        setIntElement(term760, 6, -282881827);
        setField(term759, term759.getClass(), "keys", term760);
        setIntElement(term768, 0, -1183353915);
        setField(term759, term759.getClass(), "positions", term768);
        setIntField(term759, term759.getClass(), "size", -420030135);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "verify", argTypes, term759, args);
    }

};


