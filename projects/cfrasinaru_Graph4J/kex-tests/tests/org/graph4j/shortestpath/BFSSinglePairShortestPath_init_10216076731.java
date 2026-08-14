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

public class BFSSinglePairShortestPath_init_10216076731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2470;
     Object term2472;
     Object term2474;

    public BFSSinglePairShortestPath_init_10216076731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2470 = new Integer(-876426634);
        term2472 = new Integer(213831054);
        term2474 = (int[]) newIntArray(9);
        setIntElement(term2474, 0, 330043745);
        setIntElement(term2474, 1, -509349195);
        setIntElement(term2474, 2, -1639041228);
        setIntElement(term2474, 3, 2027686272);
        setIntElement(term2474, 4, -1494356104);
        setIntElement(term2474, 5, -695279311);
        setIntElement(term2474, 6, 114279242);
        setIntElement(term2474, 7, 990883365);
        setIntElement(term2474, 8, 633598642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term2470;
        args[2] = term2472;
        args[3] = term2474;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


