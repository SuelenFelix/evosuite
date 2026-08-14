package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class Edge_isAdjacentTo_163886099016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108318;
     Object term108327;

    public Edge_isAdjacentTo_163886099016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108323 = new Double(0.16099540167443394);
        Double term108325 = new Double(0.0032031687815008425);
        term108318 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108322 = (Object[]) newArray("java.lang.Double", 2);
        setBooleanField(term108318, term108318.getClass(), "directed", true);
        setIntField(term108318, term108318.getClass(), "source", -1076936509);
        setIntField(term108318, term108318.getClass(), "target", 1772973336);
        setElement(term108322, 0, term108323);
        setElement(term108322, 1, term108325);
        setField(term108318, term108318.getClass(), "data", term108322);
        setField(term108318, term108318.getClass(), "label", null);
        Double term108332 = new Double(0.3379289469153276);
        Double term108334 = new Double(0.09898387578677581);
        Double term108336 = new Double(0.8522605188766443);
        Double term108338 = new Double(0.7480484510848255);
        Double term108340 = new Double(0.5868962060721916);
        Double term108342 = new Double(0.005544728815947253);
        Double term108344 = new Double(0.902676261684306);
        term108327 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108331 = (Object[]) newArray("java.lang.Double", 7);
        setBooleanField(term108327, term108327.getClass(), "directed", true);
        setIntField(term108327, term108327.getClass(), "source", -1826915997);
        setIntField(term108327, term108327.getClass(), "target", 412630021);
        setElement(term108331, 0, term108332);
        setElement(term108331, 1, term108334);
        setElement(term108331, 2, term108336);
        setElement(term108331, 3, term108338);
        setElement(term108331, 4, term108340);
        setElement(term108331, 5, term108342);
        setElement(term108331, 6, term108344);
        setField(term108327, term108327.getClass(), "data", term108331);
        setField(term108327, term108327.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term108327;
        callMethod(klass, "isAdjacentTo", argTypes, term108318, args);
    }

};


