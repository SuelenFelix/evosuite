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

public class EdgeSet1_init_7828084862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10447;

    public EdgeSet1_init_7828084862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10447 = (Object[]) newArray("[I", 3);
        int[] term10448 = (int[]) newIntArray(5);
        int[] term10454 = (int[]) newIntArray(4);
        int[] term10459 = (int[]) newIntArray(6);
        setIntElement(term10448, 0, 1082643319);
        setIntElement(term10448, 1, -1138616222);
        setIntElement(term10448, 2, 285368240);
        setIntElement(term10448, 3, 1526503433);
        setIntElement(term10448, 4, 1765728316);
        setElement(term10447, 0, term10448);
        setIntElement(term10454, 0, -1459041031);
        setIntElement(term10454, 1, 846881911);
        setIntElement(term10454, 2, 780077059);
        setIntElement(term10454, 3, -924663332);
        setElement(term10447, 1, term10454);
        setIntElement(term10459, 0, 579787883);
        setIntElement(term10459, 1, -1104816537);
        setIntElement(term10459, 2, 1997406081);
        setIntElement(term10459, 3, -160995016);
        setIntElement(term10459, 4, -849730731);
        setIntElement(term10459, 5, -1965240023);
        setElement(term10447, 2, term10459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeSet1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term10447;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


