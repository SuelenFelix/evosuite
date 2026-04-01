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

public class FloydWarshallShortestPath_computeAll_2863637125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1262;

    public FloydWarshallShortestPath_computeAll_2863637125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1262 = newInstance(Class.forName("org.graph4j.shortestpath.FloydWarshallShortestPath"));
        Object[] term1263 = (Object[]) newArray("[D", 1);
        double[] term1264 = (double[]) newDoubleArray(9);
        Object[] term1274 = (Object[]) newArray("[I", 2);
        int[] term1275 = (int[]) newIntArray(3);
        int[] term1279 = (int[]) newIntArray(2);
        setDoubleElement(term1264, 0, 0.9926072201505048);
        setDoubleElement(term1264, 1, 0.5862272565267508);
        setDoubleElement(term1264, 2, 0.20309716492940588);
        setDoubleElement(term1264, 3, 0.2353269756778571);
        setDoubleElement(term1264, 4, 0.6816920131943206);
        setDoubleElement(term1264, 5, 0.2570702043750863);
        setDoubleElement(term1264, 6, 0.1475601354637306);
        setDoubleElement(term1264, 7, 0.3597510664032918);
        setDoubleElement(term1264, 8, 0.007955296043747784);
        setElement(term1263, 0, term1264);
        setField(term1262, term1262.getClass(), "cost", term1263);
        setIntElement(term1275, 0, -1002370457);
        setIntElement(term1275, 1, -2014576105);
        setIntElement(term1275, 2, 1296895584);
        setElement(term1274, 0, term1275);
        setIntElement(term1279, 0, 628918458);
        setIntElement(term1279, 1, -1274456137);
        setElement(term1274, 1, term1279);
        setField(term1262, term1262.getClass(), "before", term1274);
        setField(term1262, term1262.getClass(), "graph", null);
        setBooleanField(term1262, term1262.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.FloydWarshallShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeAll", argTypes, term1262, args);
    }

};


