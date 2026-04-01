package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class VertexIndexArray_copy_2465603721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100244;

    public VertexIndexArray_copy_2465603721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100244 = newInstance(Class.forName("org.graph4j.VertexIndexArray"));
        int[] term100245 = (int[]) newIntArray(6);
        setIntElement(term100245, 0, 179432580);
        setIntElement(term100245, 1, -1258204903);
        setIntElement(term100245, 2, -1130609679);
        setIntElement(term100245, 3, -1261330598);
        setIntElement(term100245, 4, -1047805014);
        setIntElement(term100245, 5, 1879952127);
        setField(term100244, term100244.getClass(), "index", term100245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.VertexIndexArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term100244, args);
    }

};


