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

public class EdgeArray_weight_185895529318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62554;

    public EdgeArray_weight_185895529318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62554 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term62555 = (Object[]) newArray("[I", 4);
        int[] term62556 = (int[]) newIntArray(8);
        int[] term62565 = (int[]) newIntArray(0);
        int[] term62566 = (int[]) newIntArray(5);
        int[] term62572 = (int[]) newIntArray(3);
        setField(term62554, term62554.getClass(), "graph", null);
        setIntElement(term62556, 0, -475684612);
        setIntElement(term62556, 1, 299503838);
        setIntElement(term62556, 2, 1662024143);
        setIntElement(term62556, 3, -1236889825);
        setIntElement(term62556, 4, 308776262);
        setIntElement(term62556, 5, 2147290962);
        setIntElement(term62556, 6, 131121140);
        setIntElement(term62556, 7, -1875674450);
        setElement(term62555, 0, term62556);
        setElement(term62555, 1, term62565);
        setIntElement(term62566, 0, -1933838767);
        setIntElement(term62566, 1, -249737071);
        setIntElement(term62566, 2, -1495822478);
        setIntElement(term62566, 3, 1837477160);
        setIntElement(term62566, 4, -715274403);
        setElement(term62555, 2, term62566);
        setIntElement(term62572, 0, -1194682970);
        setIntElement(term62572, 1, -800758682);
        setIntElement(term62572, 2, -1806348982);
        setElement(term62555, 3, term62572);
        setField(term62554, term62554.getClass(), "edges", term62555);
        setIntField(term62554, term62554.getClass(), "numEdges", 1710916931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "weight", argTypes, term62554, args);
    }

};


