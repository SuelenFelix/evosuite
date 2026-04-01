package org.graph4j.coloring.bw;

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
import static org.graph4j.coloring.bw.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Double;

public class GreedyBandwithColoring_markUsedColor_15892445775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1004;
     Object term1008;
     Object term1010;

    public GreedyBandwithColoring_markUsedColor_15892445775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1004 = newInstance(Class.forName("org.graph4j.coloring.bw.GreedyBandwithColoring"));
        setIntField(term1004, term1004.getClass(), "pos", 0);
        setField(term1004, term1004.getClass(), "vertexOrdering", null);
        setField(term1004, term1004.getClass(), "colors", null);
        setField(term1004, term1004.getClass(), "used", null);
        setIntField(term1004, term1004.getClass(), "numColors", 0);
        setIntField(term1004, term1004.getClass(), "maxColor", 0);
        setField(term1004, term1004.getClass(), "recolor", null);
        setField(term1004, term1004.getClass(), "graph", null);
        term1008 = new Integer(0);
        term1010 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.bw.GreedyBandwithColoring");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term1008;
        args[1] = term1010;
        callMethod(klass, "markUsedColor", argTypes, term1004, args);
    }

};


