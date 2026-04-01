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

public class FloydWarshallShortestPath_getPathWeights_12903959173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1103;

    public FloydWarshallShortestPath_getPathWeights_12903959173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1103 = newInstance(Class.forName("org.graph4j.shortestpath.FloydWarshallShortestPath"));
        Object[] term1104 = (Object[]) newArray("[D", 4);
        double[] term1105 = (double[]) newDoubleArray(8);
        double[] term1114 = (double[]) newDoubleArray(0);
        double[] term1115 = (double[]) newDoubleArray(5);
        double[] term1121 = (double[]) newDoubleArray(4);
        Object[] term1126 = (Object[]) newArray("[I", 1);
        int[] term1127 = (int[]) newIntArray(0);
        setDoubleElement(term1105, 0, 0.332320568233212);
        setDoubleElement(term1105, 1, 0.18561351983828822);
        setDoubleElement(term1105, 2, 0.9678135126533798);
        setDoubleElement(term1105, 3, 0.3275035827937727);
        setDoubleElement(term1105, 4, 0.13747524521333288);
        setDoubleElement(term1105, 5, 0.7149120009558162);
        setDoubleElement(term1105, 6, 0.0013046823258857643);
        setDoubleElement(term1105, 7, 0.5404409545293147);
        setElement(term1104, 0, term1105);
        setElement(term1104, 1, term1114);
        setDoubleElement(term1115, 0, 0.9172358414700745);
        setDoubleElement(term1115, 1, 0.3804251745476508);
        setDoubleElement(term1115, 2, 0.6704848280926606);
        setDoubleElement(term1115, 3, 0.6213122016266206);
        setDoubleElement(term1115, 4, 0.540850203722707);
        setElement(term1104, 2, term1115);
        setDoubleElement(term1121, 0, 6.134294677928587E-4);
        setDoubleElement(term1121, 1, 0.41934015614685227);
        setDoubleElement(term1121, 2, 0.07298304401683597);
        setDoubleElement(term1121, 3, 0.6101411757610665);
        setElement(term1104, 3, term1121);
        setField(term1103, term1103.getClass(), "cost", term1104);
        setElement(term1126, 0, term1127);
        setField(term1103, term1103.getClass(), "before", term1126);
        setField(term1103, term1103.getClass(), "graph", null);
        setBooleanField(term1103, term1103.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.FloydWarshallShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathWeights", argTypes, term1103, args);
    }

};


