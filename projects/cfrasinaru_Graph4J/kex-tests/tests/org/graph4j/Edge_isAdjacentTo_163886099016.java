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
     Object term108315;
     Object term108324;

    public Edge_isAdjacentTo_163886099016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108320 = new Double(0.16099540167443394);
        Double term108322 = new Double(0.0032031687815008425);
        term108315 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108319 = (Object[]) newArray("java.lang.Double", 2);
        setBooleanField(term108315, term108315.getClass(), "directed", true);
        setIntField(term108315, term108315.getClass(), "source", -1076936509);
        setIntField(term108315, term108315.getClass(), "target", 1772973336);
        setElement(term108319, 0, term108320);
        setElement(term108319, 1, term108322);
        setField(term108315, term108315.getClass(), "data", term108319);
        setField(term108315, term108315.getClass(), "label", null);
        Double term108329 = new Double(0.3379289469153276);
        Double term108331 = new Double(0.09898387578677581);
        Double term108333 = new Double(0.8522605188766443);
        Double term108335 = new Double(0.7480484510848255);
        Double term108337 = new Double(0.5868962060721916);
        Double term108339 = new Double(0.005544728815947253);
        Double term108341 = new Double(0.902676261684306);
        term108324 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108328 = (Object[]) newArray("java.lang.Double", 7);
        setBooleanField(term108324, term108324.getClass(), "directed", true);
        setIntField(term108324, term108324.getClass(), "source", -1826915997);
        setIntField(term108324, term108324.getClass(), "target", 412630021);
        setElement(term108328, 0, term108329);
        setElement(term108328, 1, term108331);
        setElement(term108328, 2, term108333);
        setElement(term108328, 3, term108335);
        setElement(term108328, 4, term108337);
        setElement(term108328, 5, term108339);
        setElement(term108328, 6, term108341);
        setField(term108324, term108324.getClass(), "data", term108328);
        setField(term108324, term108324.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term108324;
        callMethod(klass, "isAdjacentTo", argTypes, term108315, args);
    }

};


