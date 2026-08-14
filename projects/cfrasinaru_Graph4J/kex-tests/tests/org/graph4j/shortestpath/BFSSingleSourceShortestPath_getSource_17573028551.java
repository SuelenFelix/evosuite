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

public class BFSSingleSourceShortestPath_getSource_17573028551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term421;

    public BFSSingleSourceShortestPath_getSource_17573028551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term421 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSingleSourceShortestPath"));
        double[] term423 = (double[]) newDoubleArray(8);
        int[] term432 = (int[]) newIntArray(3);
        setIntField(term421, term421.getClass(), "source", 1090617576);
        setDoubleElement(term423, 0, 0.0027299293098262956);
        setDoubleElement(term423, 1, 0.29874017652881824);
        setDoubleElement(term423, 2, 0.32554480512985284);
        setDoubleElement(term423, 3, 0.8924855581421237);
        setDoubleElement(term423, 4, 0.32237559209193944);
        setDoubleElement(term423, 5, 0.53094494792755);
        setDoubleElement(term423, 6, 0.146431486357265);
        setDoubleElement(term423, 7, 0.24259014218848696);
        setField(term421, term421.getClass(), "dist", term423);
        setIntElement(term432, 0, -1547384488);
        setIntElement(term432, 1, 1442160736);
        setIntElement(term432, 2, 1114000454);
        setField(term421, term421.getClass(), "before", term432);
        setField(term421, term421.getClass(), "graph", null);
        setBooleanField(term421, term421.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSingleSourceShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSource", argTypes, term421, args);
    }

};


