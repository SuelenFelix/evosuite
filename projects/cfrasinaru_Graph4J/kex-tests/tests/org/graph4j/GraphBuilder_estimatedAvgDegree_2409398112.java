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

public class GraphBuilder_estimatedAvgDegree_2409398112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179229;
     Object term179291;

    public GraphBuilder_estimatedAvgDegree_2409398112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179236 = new ArrayList();
        HashMap term179240 = new HashMap();
        HashMap term179245 = new HashMap();
        Integer term179250 = new Integer(470895808);
        Long term179252 = new Long(-316468845751588286L);
        Integer term179254 = new Integer(1787325291);
        Double term179256 = new Double(0.5853524705783772);
        ArrayList term179275 = new ArrayList();
        ArrayList term179279 = new ArrayList();
        ArrayList term179283 = new ArrayList();
        ArrayList term179287 = new ArrayList();
        term179229 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179230 = (int[]) newIntArray(5);
        setIntElement(term179230, 0, -478076582);
        setIntElement(term179230, 1, 1505859689);
        setIntElement(term179230, 2, -730903204);
        setIntElement(term179230, 3, -947304280);
        setIntElement(term179230, 4, 282363289);
        setField(term179229, term179229.getClass(), "vertices", term179230);
        setField(term179229, term179229.getClass(), "dynamicVertices", term179236);
        setField(term179229, term179229.getClass(), "vertexLabelMap", term179240);
        setField(term179229, term179229.getClass(), "vertexWeightMap", term179245);
        setField(term179229, term179229.getClass(), "maxVertices", term179250);
        setField(term179229, term179229.getClass(), "numEdges", term179252);
        setField(term179229, term179229.getClass(), "avgDegree", term179254);
        setField(term179229, term179229.getClass(), "density", term179256);
        setBooleanField(term179229, term179229.getClass(), "directed", true);
        setBooleanField(term179229, term179229.getClass(), "allowingSelfLoops", false);
        setBooleanField(term179229, term179229.getClass(), "allowingMultiEdges", true);
        setIntField(term179229, term179229.getClass(), "vertexDataSize", 1);
        setIntField(term179229, term179229.getClass(), "edgeDataSize", 1);
        setField(term179229, term179229.getClass(), "name", "HknsTajwxJ");
        setField(term179229, term179229.getClass(), "edges", term179275);
        setField(term179229, term179229.getClass(), "paths", term179279);
        setField(term179229, term179229.getClass(), "cycles", term179283);
        setField(term179229, term179229.getClass(), "cliques", term179287);
        term179291 = new Integer(1862686120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term179291;
        callMethod(klass, "estimatedAvgDegree", argTypes, term179229, args);
    }

};


