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

public class EdgeArray_isEmpty_20693824294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61610;

    public EdgeArray_isEmpty_20693824294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61610 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term61611 = (Object[]) newArray("[I", 2);
        int[] term61612 = (int[]) newIntArray(1);
        int[] term61614 = (int[]) newIntArray(7);
        setField(term61610, term61610.getClass(), "graph", null);
        setIntElement(term61612, 0, 153319034);
        setElement(term61611, 0, term61612);
        setIntElement(term61614, 0, 60632310);
        setIntElement(term61614, 1, -630247452);
        setIntElement(term61614, 2, 1613548595);
        setIntElement(term61614, 3, -277642697);
        setIntElement(term61614, 4, 1749853603);
        setIntElement(term61614, 5, 318642073);
        setIntElement(term61614, 6, 402336735);
        setElement(term61611, 1, term61614);
        setField(term61610, term61610.getClass(), "edges", term61611);
        setIntField(term61610, term61610.getClass(), "numEdges", 1534581521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEmpty", argTypes, term61610, args);
    }

};


