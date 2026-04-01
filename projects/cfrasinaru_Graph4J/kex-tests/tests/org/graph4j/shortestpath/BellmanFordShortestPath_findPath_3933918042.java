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

public class BellmanFordShortestPath_findPath_3933918042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2009;
     Object term2032;

    public BellmanFordShortestPath_findPath_3933918042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2009 = newInstance(Class.forName("org.graph4j.shortestpath.BellmanFordShortestPath"));
        double[] term2011 = (double[]) newDoubleArray(9);
        int[] term2021 = (int[]) newIntArray(8);
        int[] term2030 = (int[]) newIntArray(0);
        setIntField(term2009, term2009.getClass(), "source", -1865023308);
        setDoubleElement(term2011, 0, 0.8248232334502307);
        setDoubleElement(term2011, 1, 0.4342455781017177);
        setDoubleElement(term2011, 2, 0.3169119418035211);
        setDoubleElement(term2011, 3, 0.9171660240493722);
        setDoubleElement(term2011, 4, 0.9172575643210912);
        setDoubleElement(term2011, 5, 0.9776553509238997);
        setDoubleElement(term2011, 6, 0.9214187038380094);
        setDoubleElement(term2011, 7, 0.1240028694334625);
        setDoubleElement(term2011, 8, 0.9336699309532178);
        setField(term2009, term2009.getClass(), "cost", term2011);
        setIntElement(term2021, 0, 1698510819);
        setIntElement(term2021, 1, -1553893255);
        setIntElement(term2021, 2, 1303442927);
        setIntElement(term2021, 3, 794568325);
        setIntElement(term2021, 4, -434468428);
        setIntElement(term2021, 5, 1559605714);
        setIntElement(term2021, 6, 1146601902);
        setIntElement(term2021, 7, -1938881385);
        setField(term2009, term2009.getClass(), "before", term2021);
        setField(term2009, term2009.getClass(), "size", term2030);
        setField(term2009, term2009.getClass(), "graph", null);
        setBooleanField(term2009, term2009.getClass(), "directed", false);
        term2032 = new Integer(-1629418973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BellmanFordShortestPath");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2032;
        callMethod(klass, "findPath", argTypes, term2009, args);
    }

};


