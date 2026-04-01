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

public class GraphBuilder_addEdge_124569885123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180139;
     Object term180205;
     Object term180206;

    public GraphBuilder_addEdge_124569885123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term180150 = new ArrayList();
        HashMap term180154 = new HashMap();
        HashMap term180159 = new HashMap();
        Integer term180164 = new Integer(-1385748168);
        Long term180166 = new Long(-4502405999831680926L);
        Integer term180168 = new Integer(-270592367);
        Double term180170 = new Double(0.4689624183090624);
        ArrayList term180189 = new ArrayList();
        ArrayList term180193 = new ArrayList();
        ArrayList term180197 = new ArrayList();
        ArrayList term180201 = new ArrayList();
        term180139 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term180140 = (int[]) newIntArray(9);
        setIntElement(term180140, 0, -762699858);
        setIntElement(term180140, 1, -132566908);
        setIntElement(term180140, 2, -1989018278);
        setIntElement(term180140, 3, -40097754);
        setIntElement(term180140, 4, 1902686972);
        setIntElement(term180140, 5, -2091827453);
        setIntElement(term180140, 6, 849967346);
        setIntElement(term180140, 7, -1344639945);
        setIntElement(term180140, 8, 1547932708);
        setField(term180139, term180139.getClass(), "vertices", term180140);
        setField(term180139, term180139.getClass(), "dynamicVertices", term180150);
        setField(term180139, term180139.getClass(), "vertexLabelMap", term180154);
        setField(term180139, term180139.getClass(), "vertexWeightMap", term180159);
        setField(term180139, term180139.getClass(), "maxVertices", term180164);
        setField(term180139, term180139.getClass(), "numEdges", term180166);
        setField(term180139, term180139.getClass(), "avgDegree", term180168);
        setField(term180139, term180139.getClass(), "density", term180170);
        setBooleanField(term180139, term180139.getClass(), "directed", true);
        setBooleanField(term180139, term180139.getClass(), "allowingSelfLoops", true);
        setBooleanField(term180139, term180139.getClass(), "allowingMultiEdges", false);
        setIntField(term180139, term180139.getClass(), "vertexDataSize", 1);
        setIntField(term180139, term180139.getClass(), "edgeDataSize", 1);
        setField(term180139, term180139.getClass(), "name", "CAMnvfDLJL");
        setField(term180139, term180139.getClass(), "edges", term180189);
        setField(term180139, term180139.getClass(), "paths", term180193);
        setField(term180139, term180139.getClass(), "cycles", term180197);
        setField(term180139, term180139.getClass(), "cliques", term180201);
        term180205 = newInstance(Class.forName("java.lang.Object"));
        term180206 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term180205;
        args[1] = term180206;
        callMethod(klass, "addEdge", argTypes, term180139, args);
    }

};


