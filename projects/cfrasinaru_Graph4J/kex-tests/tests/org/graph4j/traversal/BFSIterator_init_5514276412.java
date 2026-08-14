package org.graph4j.traversal;

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
import static org.graph4j.traversal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class BFSIterator_init_5514276412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1404;
     Object term1406;
     Object term1416;

    public BFSIterator_init_5514276412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1404 = new Integer(-608830309);
        term1406 = (int[]) newIntArray(9);
        setIntElement(term1406, 0, -537786484);
        setIntElement(term1406, 1, 263859424);
        setIntElement(term1406, 2, 1436978289);
        setIntElement(term1406, 3, 696225243);
        setIntElement(term1406, 4, -1421649118);
        setIntElement(term1406, 5, -511248284);
        setIntElement(term1406, 6, 788630042);
        setIntElement(term1406, 7, 1430066560);
        setIntElement(term1406, 8, 836734074);
        term1416 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSIterator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term1404;
        args[2] = term1406;
        args[3] = term1416;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


