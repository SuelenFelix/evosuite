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
import java.lang.Object;
import java.lang.Integer;

public class FloydWarshallShortestPath_getPathWeight_8252245822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1063;
     Object term1085;
     Object term1087;

    public FloydWarshallShortestPath_getPathWeight_8252245822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1063 = newInstance(Class.forName("org.graph4j.shortestpath.FloydWarshallShortestPath"));
        Object[] term1064 = (Object[]) newArray("[D", 1);
        double[] term1065 = (double[]) newDoubleArray(5);
        Object[] term1071 = (Object[]) newArray("[I", 3);
        int[] term1072 = (int[]) newIntArray(2);
        int[] term1075 = (int[]) newIntArray(2);
        int[] term1078 = (int[]) newIntArray(5);
        setDoubleElement(term1065, 0, 0.7039847711405768);
        setDoubleElement(term1065, 1, 0.7157998497507287);
        setDoubleElement(term1065, 2, 0.8399796378537906);
        setDoubleElement(term1065, 3, 0.009446329384675933);
        setDoubleElement(term1065, 4, 0.20131600000037786);
        setElement(term1064, 0, term1065);
        setField(term1063, term1063.getClass(), "cost", term1064);
        setIntElement(term1072, 0, -2063457669);
        setIntElement(term1072, 1, -1222006000);
        setElement(term1071, 0, term1072);
        setIntElement(term1075, 0, 2095798786);
        setIntElement(term1075, 1, -1565502840);
        setElement(term1071, 1, term1075);
        setIntElement(term1078, 0, 344323424);
        setIntElement(term1078, 1, 9726679);
        setIntElement(term1078, 2, -25637976);
        setIntElement(term1078, 3, 1555897383);
        setIntElement(term1078, 4, 202001407);
        setElement(term1071, 2, term1078);
        setField(term1063, term1063.getClass(), "before", term1071);
        setField(term1063, term1063.getClass(), "graph", null);
        setBooleanField(term1063, term1063.getClass(), "directed", true);
        term1085 = new Integer(158873461);
        term1087 = new Integer(-430151637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.FloydWarshallShortestPath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1085;
        args[1] = term1087;
        callMethod(klass, "getPathWeight", argTypes, term1063, args);
    }

};


