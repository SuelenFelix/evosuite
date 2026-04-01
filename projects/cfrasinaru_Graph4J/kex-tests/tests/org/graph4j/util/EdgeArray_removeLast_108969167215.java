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

public class EdgeArray_removeLast_108969167215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62373;

    public EdgeArray_removeLast_108969167215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62373 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term62374 = (Object[]) newArray("[I", 1);
        int[] term62375 = (int[]) newIntArray(0);
        setField(term62373, term62373.getClass(), "graph", null);
        setElement(term62374, 0, term62375);
        setField(term62373, term62373.getClass(), "edges", term62374);
        setIntField(term62373, term62373.getClass(), "numEdges", 1691243165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeLast", argTypes, term62373, args);
    }

};


