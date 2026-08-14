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
import java.lang.Integer;
import java.lang.Boolean;

public class NetworkImpl_init_17824970691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87363;
     Object term87373;
     Object term87375;
     Object term87377;
     Object term87379;
     Object term87381;
     Object term87383;
     Object term87385;

    public NetworkImpl_init_17824970691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87363 = (int[]) newIntArray(9);
        setIntElement(term87363, 0, -1397399586);
        setIntElement(term87363, 1, -1933029024);
        setIntElement(term87363, 2, 954573287);
        setIntElement(term87363, 3, 1974486967);
        setIntElement(term87363, 4, -1788451389);
        setIntElement(term87363, 5, -1198136820);
        setIntElement(term87363, 6, 981813742);
        setIntElement(term87363, 7, 949470328);
        setIntElement(term87363, 8, -1848906931);
        term87373 = new Integer(108340245);
        term87375 = new Integer(1179037950);
        term87377 = new Boolean(false);
        term87379 = new Boolean(true);
        term87381 = new Boolean(false);
        term87383 = new Integer(550780613);
        term87385 = new Integer(1561385285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkImpl");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        Object[] args = new Object[8];
        args[0] = term87363;
        args[1] = term87373;
        args[2] = term87375;
        args[3] = term87377;
        args[4] = term87379;
        args[5] = term87381;
        args[6] = term87383;
        args[7] = term87385;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


