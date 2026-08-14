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

public class Edge_source_12857522816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108167;

    public Edge_source_12857522816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108172 = new Double(0.48346317030308505);
        Double term108174 = new Double(0.9922599761018691);
        term108167 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108171 = (Object[]) newArray("java.lang.Double", 2);
        setBooleanField(term108167, term108167.getClass(), "directed", true);
        setIntField(term108167, term108167.getClass(), "source", -716928978);
        setIntField(term108167, term108167.getClass(), "target", -1092562849);
        setElement(term108171, 0, term108172);
        setElement(term108171, 1, term108174);
        setField(term108167, term108167.getClass(), "data", term108171);
        setField(term108167, term108167.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "source", argTypes, term108167, args);
    }

};


