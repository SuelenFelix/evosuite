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

public class IntArrays_intersection_108381223411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9050;
     Object term9059;

    public IntArrays_intersection_108381223411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9050 = (int[]) newIntArray(8);
        setIntElement(term9050, 0, -164869996);
        setIntElement(term9050, 1, 1415001538);
        setIntElement(term9050, 2, 1738077695);
        setIntElement(term9050, 3, -1351117314);
        setIntElement(term9050, 4, 1693588815);
        setIntElement(term9050, 5, 1272985537);
        setIntElement(term9050, 6, -785719854);
        setIntElement(term9050, 7, -1542292796);
        term9059 = (int[]) newIntArray(6);
        setIntElement(term9059, 0, 1892295932);
        setIntElement(term9059, 1, 1028855301);
        setIntElement(term9059, 2, -2075314038);
        setIntElement(term9059, 3, 1085906450);
        setIntElement(term9059, 4, 1892947629);
        setIntElement(term9059, 5, -1350968212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term9050;
        args[1] = term9059;
        callMethod(klass, "intersection", argTypes, null, args);
    }

};


