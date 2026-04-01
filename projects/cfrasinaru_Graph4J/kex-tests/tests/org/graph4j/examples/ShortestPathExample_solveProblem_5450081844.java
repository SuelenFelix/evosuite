package org.graph4j.examples;

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
import static org.graph4j.examples.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class ShortestPathExample_solveProblem_5450081844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term797;

    public ShortestPathExample_solveProblem_5450081844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term803 = new HashMap();
        Object term801 = newInstance(Class.forName("org.graph4j.examples.Location"));
        setField(term801, term801.getClass(), "name", "");
        setField(term801, term801.getClass(), "neighbors", term803);
        HashMap term810 = new HashMap();
        Object term808 = newInstance(Class.forName("org.graph4j.examples.Location"));
        setField(term808, term808.getClass(), "name", "");
        setField(term808, term808.getClass(), "neighbors", term810);
        HashMap term817 = new HashMap();
        Object term815 = newInstance(Class.forName("org.graph4j.examples.Location"));
        setField(term815, term815.getClass(), "name", "");
        setField(term815, term815.getClass(), "neighbors", term817);
        HashMap term824 = new HashMap();
        Object term822 = newInstance(Class.forName("org.graph4j.examples.Location"));
        setField(term822, term822.getClass(), "name", "");
        setField(term822, term822.getClass(), "neighbors", term824);
        HashMap term831 = new HashMap();
        Object term829 = newInstance(Class.forName("org.graph4j.examples.Location"));
        setField(term829, term829.getClass(), "name", "");
        setField(term829, term829.getClass(), "neighbors", term831);
        HashMap term838 = new HashMap();
        Object term836 = newInstance(Class.forName("org.graph4j.examples.Location"));
        setField(term836, term836.getClass(), "name", "");
        setField(term836, term836.getClass(), "neighbors", term838);
        Object term843 = newInstance(Class.forName("org.graph4j.examples.Location"));
        setField(term843, term843.getClass(), "name", null);
        setField(term843, term843.getClass(), "neighbors", null);
        ArrayList term799 = new ArrayList();
        ((ArrayList) term799).add(term801);
        ((ArrayList) term799).add(term808);
        ((ArrayList) term799).add(term815);
        ((ArrayList) term799).add(term801);
        ((ArrayList) term799).add(term822);
        ((ArrayList) term799).add(term829);
        ((ArrayList) term799).add(term836);
        ((ArrayList) term799).add(term836);
        ((ArrayList) term799).add(term843);
        term797 = newInstance(Class.forName("org.graph4j.examples.ShortestPathExample"));
        setIntField(term797, term797.getClass(), "numLocations", 100);
        setField(term797, term797.getClass(), "locations", term799);
        setField(term797, term797.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.examples.ShortestPathExample");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "solveProblem", argTypes, term797, args);
    }

};


