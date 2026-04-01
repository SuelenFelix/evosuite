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
import java.lang.Integer;

public class Edge_data_170184399711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108239;
     Object term108244;

    public Edge_data_170184399711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108239 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108243 = (Object[]) newArray("java.lang.Double", 0);
        setBooleanField(term108239, term108239.getClass(), "directed", false);
        setIntField(term108239, term108239.getClass(), "source", 1768435290);
        setIntField(term108239, term108239.getClass(), "target", 813571003);
        setField(term108239, term108239.getClass(), "data", term108243);
        setField(term108239, term108239.getClass(), "label", null);
        term108244 = new Integer(613913808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term108244;
        callMethod(klass, "data", argTypes, term108239, args);
    }

};


