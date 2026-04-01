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
     Object term87360;
     Object term87370;
     Object term87372;
     Object term87374;
     Object term87376;
     Object term87378;
     Object term87380;
     Object term87382;

    public NetworkImpl_init_17824970691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87360 = (int[]) newIntArray(9);
        setIntElement(term87360, 0, -1397399586);
        setIntElement(term87360, 1, -1933029024);
        setIntElement(term87360, 2, 954573287);
        setIntElement(term87360, 3, 1974486967);
        setIntElement(term87360, 4, -1788451389);
        setIntElement(term87360, 5, -1198136820);
        setIntElement(term87360, 6, 981813742);
        setIntElement(term87360, 7, 949470328);
        setIntElement(term87360, 8, -1848906931);
        term87370 = new Integer(108340245);
        term87372 = new Integer(1179037950);
        term87374 = new Boolean(false);
        term87376 = new Boolean(true);
        term87378 = new Boolean(false);
        term87380 = new Integer(550780613);
        term87382 = new Integer(1561385285);
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
        args[0] = term87360;
        args[1] = term87370;
        args[2] = term87372;
        args[3] = term87374;
        args[4] = term87376;
        args[5] = term87378;
        args[6] = term87380;
        args[7] = term87382;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


