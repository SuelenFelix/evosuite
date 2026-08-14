package org.graph4j.flow;

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
import static org.graph4j.flow.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Double;

public class FlowData_put_208787511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1808;
     Object term1825;
     Object term1836;

    public FlowData_put_208787511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1811 = new HashMap();
        term1808 = newInstance(Class.forName("org.graph4j.flow.FlowData"));
        setIntField(term1808, term1808.getClass(), "source", 319853052);
        setIntField(term1808, term1808.getClass(), "sink", -1097563716);
        setField(term1808, term1808.getClass(), "graph", null);
        setField(term1808, term1808.getClass(), "map", term1811);
        Double term1830 = new Double(0.13246999699526574);
        Double term1832 = new Double(0.9126850255993704);
        Double term1834 = new Double(0.11179067076100713);
        term1825 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1829 = (Object[]) newArray("java.lang.Double", 3);
        setBooleanField(term1825, term1825.getClass(), "directed", false);
        setIntField(term1825, term1825.getClass(), "source", -516303035);
        setIntField(term1825, term1825.getClass(), "target", -2143043890);
        setElement(term1829, 0, term1830);
        setElement(term1829, 1, term1832);
        setElement(term1829, 2, term1834);
        setField(term1825, term1825.getClass(), "data", term1829);
        setField(term1825, term1825.getClass(), "label", null);
        term1836 = new Double(0.6355029654528058);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.flow.FlowData");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term1825;
        args[1] = term1836;
        callMethod(klass, "put", argTypes, term1808, args);
    }

};


