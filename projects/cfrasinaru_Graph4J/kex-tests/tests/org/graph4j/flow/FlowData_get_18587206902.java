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

public class FlowData_get_18587206902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1838;
     Object term1855;

    public FlowData_get_18587206902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1841 = new HashMap();
        term1838 = newInstance(Class.forName("org.graph4j.flow.FlowData"));
        setIntField(term1838, term1838.getClass(), "source", -2138825831);
        setIntField(term1838, term1838.getClass(), "sink", 1454781562);
        setField(term1838, term1838.getClass(), "graph", null);
        setField(term1838, term1838.getClass(), "map", term1841);
        Double term1860 = new Double(0.7154795600170818);
        Double term1862 = new Double(0.6355029654528058);
        Double term1864 = new Double(0.0022646783892913414);
        Double term1866 = new Double(0.36226058076369927);
        Double term1868 = new Double(0.03699061125289671);
        term1855 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1859 = (Object[]) newArray("java.lang.Double", 5);
        setBooleanField(term1855, term1855.getClass(), "directed", true);
        setIntField(term1855, term1855.getClass(), "source", 1126618861);
        setIntField(term1855, term1855.getClass(), "target", 947449400);
        setElement(term1859, 0, term1860);
        setElement(term1859, 1, term1862);
        setElement(term1859, 2, term1864);
        setElement(term1859, 3, term1866);
        setElement(term1859, 4, term1868);
        setField(term1855, term1855.getClass(), "data", term1859);
        setField(term1855, term1855.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.flow.FlowData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term1855;
        callMethod(klass, "get", argTypes, term1838, args);
    }

};


