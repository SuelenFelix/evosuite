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

public class BFSAllPairsShortestPath_createPathBetween_15804250145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254;
     Object term285;
     Object term287;

    public BFSAllPairsShortestPath_createPathBetween_15804250145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254 = newInstance(Class.forName("org.graph4j.shortestpath.BFSAllPairsShortestPath"));
        Object[] term255 = (Object[]) newArray("[D", 6);
        double[] term256 = (double[]) newDoubleArray(2);
        double[] term259 = (double[]) newDoubleArray(5);
        double[] term265 = (double[]) newDoubleArray(3);
        double[] term269 = (double[]) newDoubleArray(5);
        double[] term275 = (double[]) newDoubleArray(5);
        double[] term281 = (double[]) newDoubleArray(1);
        Object[] term283 = (Object[]) newArray("[I", 0);
        setDoubleElement(term256, 0, 0.8566567697571895);
        setDoubleElement(term256, 1, 0.9203805380592256);
        setElement(term255, 0, term256);
        setDoubleElement(term259, 0, 0.5804948995371725);
        setDoubleElement(term259, 1, 0.20737514139742264);
        setDoubleElement(term259, 2, 0.7919370314903882);
        setDoubleElement(term259, 3, 0.2109867221632754);
        setDoubleElement(term259, 4, 0.3227335400819148);
        setElement(term255, 1, term259);
        setDoubleElement(term265, 0, 0.43337207054070237);
        setDoubleElement(term265, 1, 0.13246999699526574);
        setDoubleElement(term265, 2, 0.9126850255993704);
        setElement(term255, 2, term265);
        setDoubleElement(term269, 0, 0.11179067076100713);
        setDoubleElement(term269, 1, 0.5306473989087822);
        setDoubleElement(term269, 2, 0.022483645678509023);
        setDoubleElement(term269, 3, 0.025133051616627267);
        setDoubleElement(term269, 4, 0.016575281023182953);
        setElement(term255, 3, term269);
        setDoubleElement(term275, 0, 0.5308350402051779);
        setDoubleElement(term275, 1, 0.7154795600170818);
        setDoubleElement(term275, 2, 0.6355029654528058);
        setDoubleElement(term275, 3, 0.0022646783892913414);
        setDoubleElement(term275, 4, 0.36226058076369927);
        setElement(term255, 4, term275);
        setDoubleElement(term281, 0, 0.03699061125289671);
        setElement(term255, 5, term281);
        setField(term254, term254.getClass(), "dist", term255);
        setField(term254, term254.getClass(), "before", term283);
        setField(term254, term254.getClass(), "graph", null);
        setBooleanField(term254, term254.getClass(), "directed", true);
        term285 = new Integer(2055867847);
        term287 = new Integer(-1048298087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSAllPairsShortestPath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term285;
        args[1] = term287;
        callMethod(klass, "createPathBetween", argTypes, term254, args);
    }

};


