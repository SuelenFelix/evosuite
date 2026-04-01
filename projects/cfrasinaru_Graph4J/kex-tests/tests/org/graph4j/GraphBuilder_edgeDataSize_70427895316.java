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
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Double;

public class GraphBuilder_edgeDataSize_70427895316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179544;
     Object term179604;

    public GraphBuilder_edgeDataSize_70427895316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179549 = new ArrayList();
        HashMap term179553 = new HashMap();
        HashMap term179558 = new HashMap();
        Integer term179563 = new Integer(-1244386281);
        Long term179565 = new Long(8428634514691209827L);
        Integer term179567 = new Integer(-885788574);
        Double term179569 = new Double(0.36399186881692824);
        ArrayList term179588 = new ArrayList();
        ArrayList term179592 = new ArrayList();
        ArrayList term179596 = new ArrayList();
        ArrayList term179600 = new ArrayList();
        term179544 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179545 = (int[]) newIntArray(3);
        setIntElement(term179545, 0, -698320070);
        setIntElement(term179545, 1, 396234650);
        setIntElement(term179545, 2, 785681966);
        setField(term179544, term179544.getClass(), "vertices", term179545);
        setField(term179544, term179544.getClass(), "dynamicVertices", term179549);
        setField(term179544, term179544.getClass(), "vertexLabelMap", term179553);
        setField(term179544, term179544.getClass(), "vertexWeightMap", term179558);
        setField(term179544, term179544.getClass(), "maxVertices", term179563);
        setField(term179544, term179544.getClass(), "numEdges", term179565);
        setField(term179544, term179544.getClass(), "avgDegree", term179567);
        setField(term179544, term179544.getClass(), "density", term179569);
        setBooleanField(term179544, term179544.getClass(), "directed", true);
        setBooleanField(term179544, term179544.getClass(), "allowingSelfLoops", true);
        setBooleanField(term179544, term179544.getClass(), "allowingMultiEdges", false);
        setIntField(term179544, term179544.getClass(), "vertexDataSize", 1);
        setIntField(term179544, term179544.getClass(), "edgeDataSize", 1);
        setField(term179544, term179544.getClass(), "name", "LrqwfrKKtS");
        setField(term179544, term179544.getClass(), "edges", term179588);
        setField(term179544, term179544.getClass(), "paths", term179592);
        setField(term179544, term179544.getClass(), "cycles", term179596);
        setField(term179544, term179544.getClass(), "cliques", term179600);
        term179604 = new Integer(-1605764059);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term179604;
        callMethod(klass, "edgeDataSize", argTypes, term179544, args);
    }

};


