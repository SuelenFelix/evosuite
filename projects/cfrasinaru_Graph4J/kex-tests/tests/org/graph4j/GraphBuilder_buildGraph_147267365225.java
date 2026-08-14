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

public class GraphBuilder_buildGraph_147267365225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180308;

    public GraphBuilder_buildGraph_147267365225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term180310 = new ArrayList();
        HashMap term180314 = new HashMap();
        HashMap term180319 = new HashMap();
        Integer term180324 = new Integer(-348612876);
        Long term180326 = new Long(2120084523938730454L);
        Integer term180328 = new Integer(1302807565);
        Double term180330 = new Double(0.5590560519342122);
        ArrayList term180349 = new ArrayList();
        ArrayList term180353 = new ArrayList();
        ArrayList term180357 = new ArrayList();
        ArrayList term180361 = new ArrayList();
        term180308 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term180309 = (int[]) newIntArray(0);
        setField(term180308, term180308.getClass(), "vertices", term180309);
        setField(term180308, term180308.getClass(), "dynamicVertices", term180310);
        setField(term180308, term180308.getClass(), "vertexLabelMap", term180314);
        setField(term180308, term180308.getClass(), "vertexWeightMap", term180319);
        setField(term180308, term180308.getClass(), "maxVertices", term180324);
        setField(term180308, term180308.getClass(), "numEdges", term180326);
        setField(term180308, term180308.getClass(), "avgDegree", term180328);
        setField(term180308, term180308.getClass(), "density", term180330);
        setBooleanField(term180308, term180308.getClass(), "directed", true);
        setBooleanField(term180308, term180308.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180308, term180308.getClass(), "allowingMultiEdges", true);
        setIntField(term180308, term180308.getClass(), "vertexDataSize", 1);
        setIntField(term180308, term180308.getClass(), "edgeDataSize", 1);
        setField(term180308, term180308.getClass(), "name", "cmuaUiHMVL");
        setField(term180308, term180308.getClass(), "edges", term180349);
        setField(term180308, term180308.getClass(), "paths", term180353);
        setField(term180308, term180308.getClass(), "cycles", term180357);
        setField(term180308, term180308.getClass(), "cliques", term180361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildGraph", argTypes, term180308, args);
    }

};


