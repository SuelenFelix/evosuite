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

public class JohnsonShortestPath_getPathWeight_17576081053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term768;
     Object term784;
     Object term786;

    public JohnsonShortestPath_getPathWeight_17576081053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term768 = newInstance(Class.forName("org.graph4j.shortestpath.JohnsonShortestPath"));
        double[] term769 = (double[]) newDoubleArray(6);
        Object[] term776 = (Object[]) newArray("org.graph4j.shortestpath.SingleSourceShortestPath", 5);
        Object[] term777 = (Object[]) newArray("[D", 1);
        double[] term778 = (double[]) newDoubleArray(4);
        setField(term768, term768.getClass(), "auxGraph", null);
        setDoubleElement(term769, 0, 0.5597136413549945);
        setDoubleElement(term769, 1, 0.28292420012823627);
        setDoubleElement(term769, 2, 0.5407563152320285);
        setDoubleElement(term769, 3, 0.9485929668765458);
        setDoubleElement(term769, 4, 0.5179319342588155);
        setDoubleElement(term769, 5, 0.25025774487844066);
        setField(term768, term768.getClass(), "h", term769);
        setField(term768, term768.getClass(), "algs", term776);
        setDoubleElement(term778, 0, 0.1858089882752998);
        setDoubleElement(term778, 1, 0.2440697646709713);
        setDoubleElement(term778, 2, 0.7977455176064363);
        setDoubleElement(term778, 3, 0.5329919447422633);
        setElement(term777, 0, term778);
        setField(term768, term768.getClass(), "weights", term777);
        setField(term768, term768.getClass(), "graph", null);
        setBooleanField(term768, term768.getClass(), "directed", true);
        term784 = new Integer(107945604);
        term786 = new Integer(-1963464809);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.JohnsonShortestPath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term784;
        args[1] = term786;
        callMethod(klass, "getPathWeight", argTypes, term768, args);
    }

};


