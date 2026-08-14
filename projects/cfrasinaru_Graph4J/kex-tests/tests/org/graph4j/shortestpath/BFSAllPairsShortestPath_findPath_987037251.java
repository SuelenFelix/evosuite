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

public class BFSAllPairsShortestPath_findPath_987037251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term43;
     Object term45;

    public BFSAllPairsShortestPath_findPath_987037251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.graph4j.shortestpath.BFSAllPairsShortestPath"));
        Object[] term2 = (Object[]) newArray("[D", 5);
        double[] term3 = (double[]) newDoubleArray(4);
        double[] term8 = (double[]) newDoubleArray(3);
        double[] term12 = (double[]) newDoubleArray(4);
        double[] term17 = (double[]) newDoubleArray(1);
        double[] term19 = (double[]) newDoubleArray(6);
        Object[] term26 = (Object[]) newArray("[I", 2);
        int[] term27 = (int[]) newIntArray(6);
        int[] term34 = (int[]) newIntArray(7);
        setDoubleElement(term3, 0, 0.13238746331190498);
        setDoubleElement(term3, 1, 0.3455959125047594);
        setDoubleElement(term3, 2, 0.5523635872663106);
        setDoubleElement(term3, 3, 0.544608645520025);
        setElement(term2, 0, term3);
        setDoubleElement(term8, 0, 0.28570734989730284);
        setDoubleElement(term8, 1, 0.40176586625454525);
        setDoubleElement(term8, 2, 0.2641345529914265);
        setElement(term2, 1, term8);
        setDoubleElement(term12, 0, 0.36923381893433327);
        setDoubleElement(term12, 1, 0.6076495596892013);
        setDoubleElement(term12, 2, 0.37773193782763337);
        setDoubleElement(term12, 3, 0.8474802076607362);
        setElement(term2, 2, term12);
        setDoubleElement(term17, 0, 0.5183269973490326);
        setElement(term2, 3, term17);
        setDoubleElement(term19, 0, 0.7655020693602768);
        setDoubleElement(term19, 1, 0.1374549299694151);
        setDoubleElement(term19, 2, 0.7031006357544823);
        setDoubleElement(term19, 3, 0.9527281779865117);
        setDoubleElement(term19, 4, 0.9828442029246764);
        setDoubleElement(term19, 5, 0.2779719046761513);
        setElement(term2, 4, term19);
        setField(term1, term1.getClass(), "dist", term2);
        setIntElement(term27, 0, 568599855);
        setIntElement(term27, 1, 1162663216);
        setIntElement(term27, 2, 1484323161);
        setIntElement(term27, 3, 391863371);
        setIntElement(term27, 4, -1922583790);
        setIntElement(term27, 5, -616727354);
        setElement(term26, 0, term27);
        setIntElement(term34, 0, -1955890973);
        setIntElement(term34, 1, -2038273078);
        setIntElement(term34, 2, 1227103734);
        setIntElement(term34, 3, -1339778481);
        setIntElement(term34, 4, 1725571209);
        setIntElement(term34, 5, -522618178);
        setIntElement(term34, 6, 1134449235);
        setElement(term26, 1, term34);
        setField(term1, term1.getClass(), "before", term26);
        setField(term1, term1.getClass(), "graph", null);
        setBooleanField(term1, term1.getClass(), "directed", false);
        term43 = new Integer(-883034806);
        term45 = new Integer(1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSAllPairsShortestPath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term43;
        args[1] = term45;
        callMethod(klass, "findPath", argTypes, term1, args);
    }

};


