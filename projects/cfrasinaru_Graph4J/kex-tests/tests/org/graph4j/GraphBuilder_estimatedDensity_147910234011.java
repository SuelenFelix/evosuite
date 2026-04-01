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

public class GraphBuilder_estimatedDensity_147910234011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179147;
     Object term179205;

    public GraphBuilder_estimatedDensity_147910234011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179150 = new ArrayList();
        HashMap term179154 = new HashMap();
        HashMap term179159 = new HashMap();
        Integer term179164 = new Integer(1981860404);
        Long term179166 = new Long(-872011222785455006L);
        Integer term179168 = new Integer(732174235);
        Double term179170 = new Double(0.25181247747187885);
        ArrayList term179189 = new ArrayList();
        ArrayList term179193 = new ArrayList();
        ArrayList term179197 = new ArrayList();
        ArrayList term179201 = new ArrayList();
        term179147 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179148 = (int[]) newIntArray(1);
        setIntElement(term179148, 0, 442268482);
        setField(term179147, term179147.getClass(), "vertices", term179148);
        setField(term179147, term179147.getClass(), "dynamicVertices", term179150);
        setField(term179147, term179147.getClass(), "vertexLabelMap", term179154);
        setField(term179147, term179147.getClass(), "vertexWeightMap", term179159);
        setField(term179147, term179147.getClass(), "maxVertices", term179164);
        setField(term179147, term179147.getClass(), "numEdges", term179166);
        setField(term179147, term179147.getClass(), "avgDegree", term179168);
        setField(term179147, term179147.getClass(), "density", term179170);
        setBooleanField(term179147, term179147.getClass(), "directed", true);
        setBooleanField(term179147, term179147.getClass(), "allowingSelfLoops", false);
        setBooleanField(term179147, term179147.getClass(), "allowingMultiEdges", true);
        setIntField(term179147, term179147.getClass(), "vertexDataSize", 1);
        setIntField(term179147, term179147.getClass(), "edgeDataSize", 1);
        setField(term179147, term179147.getClass(), "name", "iiHBhsNFgk");
        setField(term179147, term179147.getClass(), "edges", term179189);
        setField(term179147, term179147.getClass(), "paths", term179193);
        setField(term179147, term179147.getClass(), "cycles", term179197);
        setField(term179147, term179147.getClass(), "cliques", term179201);
        term179205 = new Double(0.36093706406093096);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term179205;
        callMethod(klass, "estimatedDensity", argTypes, term179147, args);
    }

};


