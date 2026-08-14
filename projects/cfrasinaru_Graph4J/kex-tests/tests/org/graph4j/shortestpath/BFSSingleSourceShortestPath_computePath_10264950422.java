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

public class BFSSingleSourceShortestPath_computePath_10264950422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448;
     Object term467;

    public BFSSingleSourceShortestPath_computePath_10264950422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term448 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSingleSourceShortestPath"));
        double[] term450 = (double[]) newDoubleArray(6);
        int[] term457 = (int[]) newIntArray(8);
        setIntField(term448, term448.getClass(), "source", -556405712);
        setDoubleElement(term450, 0, 0.1544348383112728);
        setDoubleElement(term450, 1, 0.5187846213101265);
        setDoubleElement(term450, 2, 0.045893173090043815);
        setDoubleElement(term450, 3, 0.3626177854778667);
        setDoubleElement(term450, 4, 0.3163771663728089);
        setDoubleElement(term450, 5, 0.8819646072665548);
        setField(term448, term448.getClass(), "dist", term450);
        setIntElement(term457, 0, -1772434990);
        setIntElement(term457, 1, -1845499264);
        setIntElement(term457, 2, -505439934);
        setIntElement(term457, 3, -344842608);
        setIntElement(term457, 4, 941650513);
        setIntElement(term457, 5, 444029505);
        setIntElement(term457, 6, -1034506028);
        setIntElement(term457, 7, -1263114719);
        setField(term448, term448.getClass(), "before", term457);
        setField(term448, term448.getClass(), "graph", null);
        setBooleanField(term448, term448.getClass(), "directed", true);
        term467 = new Integer(-894662986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSingleSourceShortestPath");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term467;
        callMethod(klass, "computePath", argTypes, term448, args);
    }

};


