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
import java.lang.Object;

public class GraphBuilder_labeledVertices_15331212867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179022;

    public GraphBuilder_labeledVertices_15331212867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179022 = (Object[]) newArray("java.lang.Object", 10);
        Object term179023 = newInstance(Class.forName("java.lang.Object"));
        Object term179024 = newInstance(Class.forName("java.lang.Object"));
        Object term179025 = newInstance(Class.forName("java.lang.Object"));
        Object term179026 = newInstance(Class.forName("java.lang.Object"));
        Object term179027 = newInstance(Class.forName("java.lang.Object"));
        Object term179028 = newInstance(Class.forName("java.lang.Object"));
        Object term179029 = newInstance(Class.forName("java.lang.Object"));
        Object term179030 = newInstance(Class.forName("java.lang.Object"));
        Object term179031 = newInstance(Class.forName("java.lang.Object"));
        Object term179032 = newInstance(Class.forName("java.lang.Object"));
        setElement(term179022, 0, term179023);
        setElement(term179022, 1, term179024);
        setElement(term179022, 2, term179025);
        setElement(term179022, 3, term179026);
        setElement(term179022, 4, term179027);
        setElement(term179022, 5, term179028);
        setElement(term179022, 6, term179029);
        setElement(term179022, 7, term179030);
        setElement(term179022, 8, term179031);
        setElement(term179022, 9, term179032);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term179022;
        callMethod(klass, "labeledVertices", argTypes, null, args);
    }

};


