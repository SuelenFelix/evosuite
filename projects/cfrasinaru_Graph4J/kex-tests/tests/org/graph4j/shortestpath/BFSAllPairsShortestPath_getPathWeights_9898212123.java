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

public class BFSAllPairsShortestPath_getPathWeights_9898212123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126;

    public BFSAllPairsShortestPath_getPathWeights_9898212123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126 = newInstance(Class.forName("org.graph4j.shortestpath.BFSAllPairsShortestPath"));
        Object[] term127 = (Object[]) newArray("[D", 2);
        double[] term128 = (double[]) newDoubleArray(8);
        double[] term137 = (double[]) newDoubleArray(6);
        Object[] term144 = (Object[]) newArray("[I", 2);
        int[] term145 = (int[]) newIntArray(1);
        int[] term147 = (int[]) newIntArray(9);
        setDoubleElement(term128, 0, 0.13481025392611334);
        setDoubleElement(term128, 1, 0.3800088629986428);
        setDoubleElement(term128, 2, 0.5840714198152577);
        setDoubleElement(term128, 3, 0.7559240768573477);
        setDoubleElement(term128, 4, 0.10667076642995188);
        setDoubleElement(term128, 5, 0.11493000848982304);
        setDoubleElement(term128, 6, 0.37161417339133307);
        setDoubleElement(term128, 7, 0.6805867182029153);
        setElement(term127, 0, term128);
        setDoubleElement(term137, 0, 0.2852810965221698);
        setDoubleElement(term137, 1, 0.6300849762307866);
        setDoubleElement(term137, 2, 0.9737083944266686);
        setDoubleElement(term137, 3, 0.0668892744806211);
        setDoubleElement(term137, 4, 0.3587267442738795);
        setDoubleElement(term137, 5, 0.07802449704920456);
        setElement(term127, 1, term137);
        setField(term126, term126.getClass(), "dist", term127);
        setIntElement(term145, 0, -1275173084);
        setElement(term144, 0, term145);
        setIntElement(term147, 0, -244121226);
        setIntElement(term147, 1, -203030934);
        setIntElement(term147, 2, -1179120542);
        setIntElement(term147, 3, -73683645);
        setIntElement(term147, 4, -226514366);
        setIntElement(term147, 5, 1193880199);
        setIntElement(term147, 6, -1087774327);
        setIntElement(term147, 7, -1530420153);
        setIntElement(term147, 8, -469968304);
        setElement(term144, 1, term147);
        setField(term126, term126.getClass(), "before", term144);
        setField(term126, term126.getClass(), "graph", null);
        setBooleanField(term126, term126.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSAllPairsShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathWeights", argTypes, term126, args);
    }

};


