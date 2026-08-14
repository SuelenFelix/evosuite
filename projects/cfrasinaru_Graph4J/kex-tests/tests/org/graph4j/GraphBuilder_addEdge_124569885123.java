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
     Object term180150;
     Object term180216;
     Object term180217;

    public GraphBuilder_addEdge_124569885123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term180161 = new ArrayList();
        HashMap term180165 = new HashMap();
        HashMap term180170 = new HashMap();
        Integer term180175 = new Integer(-1385748168);
        Long term180177 = new Long(-4502405999831680926L);
        Integer term180179 = new Integer(-270592367);
        Double term180181 = new Double(0.4689624183090624);
        ArrayList term180200 = new ArrayList();
        ArrayList term180204 = new ArrayList();
        ArrayList term180208 = new ArrayList();
        ArrayList term180212 = new ArrayList();
        term180150 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term180151 = (int[]) newIntArray(9);
        setIntElement(term180151, 0, -762699858);
        setIntElement(term180151, 1, -132566908);
        setIntElement(term180151, 2, -1989018278);
        setIntElement(term180151, 3, -40097754);
        setIntElement(term180151, 4, 1902686972);
        setIntElement(term180151, 5, -2091827453);
        setIntElement(term180151, 6, 849967346);
        setIntElement(term180151, 7, -1344639945);
        setIntElement(term180151, 8, 1547932708);
        setField(term180150, term180150.getClass(), "vertices", term180151);
        setField(term180150, term180150.getClass(), "dynamicVertices", term180161);
        setField(term180150, term180150.getClass(), "vertexLabelMap", term180165);
        setField(term180150, term180150.getClass(), "vertexWeightMap", term180170);
        setField(term180150, term180150.getClass(), "maxVertices", term180175);
        setField(term180150, term180150.getClass(), "numEdges", term180177);
        setField(term180150, term180150.getClass(), "avgDegree", term180179);
        setField(term180150, term180150.getClass(), "density", term180181);
        setBooleanField(term180150, term180150.getClass(), "directed", true);
        setBooleanField(term180150, term180150.getClass(), "allowingSelfLoops", true);
        setBooleanField(term180150, term180150.getClass(), "allowingMultiEdges", false);
        setIntField(term180150, term180150.getClass(), "vertexDataSize", 1);
        setIntField(term180150, term180150.getClass(), "edgeDataSize", 1);
        setField(term180150, term180150.getClass(), "name", "CAMnvfDLJL");
        setField(term180150, term180150.getClass(), "edges", term180200);
        setField(term180150, term180150.getClass(), "paths", term180204);
        setField(term180150, term180150.getClass(), "cycles", term180208);
        setField(term180150, term180150.getClass(), "cliques", term180212);
        term180216 = newInstance(Class.forName("java.lang.Object"));
        term180217 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term180216;
        args[1] = term180217;
        callMethod(klass, "addEdge", argTypes, term180150, args);
    }

};


