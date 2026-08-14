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

public class BFSSingleSourceShortestPath_getPathWeight_16119281424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term522;
     Object term534;

    public BFSSingleSourceShortestPath_getPathWeight_16119281424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term522 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSingleSourceShortestPath"));
        double[] term524 = (double[]) newDoubleArray(3);
        int[] term528 = (int[]) newIntArray(4);
        setIntField(term522, term522.getClass(), "source", -615654495);
        setDoubleElement(term524, 0, 0.5644914462415626);
        setDoubleElement(term524, 1, 0.509895859167191);
        setDoubleElement(term524, 2, 0.07417792024383196);
        setField(term522, term522.getClass(), "dist", term524);
        setIntElement(term528, 0, -1476117762);
        setIntElement(term528, 1, -341962980);
        setIntElement(term528, 2, 1532716628);
        setIntElement(term528, 3, -1801760683);
        setField(term522, term522.getClass(), "before", term528);
        setField(term522, term522.getClass(), "graph", null);
        setBooleanField(term522, term522.getClass(), "directed", true);
        term534 = new Integer(1141317871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSingleSourceShortestPath");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term534;
        callMethod(klass, "getPathWeight", argTypes, term522, args);
    }

};


