package org.graph4j.shortestpath;

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
import static org.graph4j.shortestpath.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class BFSSingleSourceShortestPath_createPathEndingIn_17569843017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term573;
     Object term587;

    public BFSSingleSourceShortestPath_createPathEndingIn_17569843017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term573 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSingleSourceShortestPath"));
        double[] term575 = (double[]) newDoubleArray(7);
        int[] term583 = (int[]) newIntArray(2);
        setIntField(term573, term573.getClass(), "source", 568954359);
        setDoubleElement(term575, 0, 0.39446728256884744);
        setDoubleElement(term575, 1, 0.7865909711092062);
        setDoubleElement(term575, 2, 0.06587158449170749);
        setDoubleElement(term575, 3, 0.0865998004187658);
        setDoubleElement(term575, 4, 0.9628647861255637);
        setDoubleElement(term575, 5, 0.623231822150205);
        setDoubleElement(term575, 6, 0.09037487793444521);
        setField(term573, term573.getClass(), "dist", term575);
        setIntElement(term583, 0, 53410913);
        setIntElement(term583, 1, -375014958);
        setField(term573, term573.getClass(), "before", term583);
        setField(term573, term573.getClass(), "graph", null);
        setBooleanField(term573, term573.getClass(), "directed", false);
        term587 = new Integer(1107176718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSingleSourceShortestPath");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term587;
        callMethod(klass, "createPathEndingIn", argTypes, term573, args);
    }

};


