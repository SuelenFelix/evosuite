package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Coloring_setColor_15007309340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2432;
     Object term2434;
     Object term2436;

    public Coloring_setColor_15007309340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2432 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        setField(term2432, term2432.getClass(), "graph", null);
        setField(term2432, term2432.getClass(), "vertexColor", null);
        setIntField(term2432, term2432.getClass(), "numColoredVertices", 0);
        setField(term2432, term2432.getClass(), "usedColors", null);
        setField(term2432, term2432.getClass(), "colorMap", null);
        term2434 = new Integer(0);
        term2436 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2434;
        args[1] = term2436;
        callMethod(klass, "setColor", argTypes, term2432, args);
    }

};


