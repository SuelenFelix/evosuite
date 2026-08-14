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

public class Network_subgraph_19559019990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143756;

    public Network_subgraph_19559019990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143756 = (int[]) newIntArray(8);
        setIntElement(term143756, 0, -17444695);
        setIntElement(term143756, 1, -908984310);
        setIntElement(term143756, 2, -1953057607);
        setIntElement(term143756, 3, 1832918083);
        setIntElement(term143756, 4, 37838840);
        setIntElement(term143756, 5, 202270165);
        setIntElement(term143756, 6, -176320054);
        setIntElement(term143756, 7, -1207771552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Network");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term143756;
        callMethod(klass, "subgraph", argTypes, null, args);
    }

};


