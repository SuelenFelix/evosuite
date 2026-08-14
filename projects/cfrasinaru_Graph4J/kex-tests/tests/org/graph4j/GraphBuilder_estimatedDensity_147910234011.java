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
     Object term179158;
     Object term179216;

    public GraphBuilder_estimatedDensity_147910234011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179161 = new ArrayList();
        HashMap term179165 = new HashMap();
        HashMap term179170 = new HashMap();
        Integer term179175 = new Integer(1981860404);
        Long term179177 = new Long(-872011222785455006L);
        Integer term179179 = new Integer(732174235);
        Double term179181 = new Double(0.25181247747187885);
        ArrayList term179200 = new ArrayList();
        ArrayList term179204 = new ArrayList();
        ArrayList term179208 = new ArrayList();
        ArrayList term179212 = new ArrayList();
        term179158 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179159 = (int[]) newIntArray(1);
        setIntElement(term179159, 0, 442268482);
        setField(term179158, term179158.getClass(), "vertices", term179159);
        setField(term179158, term179158.getClass(), "dynamicVertices", term179161);
        setField(term179158, term179158.getClass(), "vertexLabelMap", term179165);
        setField(term179158, term179158.getClass(), "vertexWeightMap", term179170);
        setField(term179158, term179158.getClass(), "maxVertices", term179175);
        setField(term179158, term179158.getClass(), "numEdges", term179177);
        setField(term179158, term179158.getClass(), "avgDegree", term179179);
        setField(term179158, term179158.getClass(), "density", term179181);
        setBooleanField(term179158, term179158.getClass(), "directed", true);
        setBooleanField(term179158, term179158.getClass(), "allowingSelfLoops", false);
        setBooleanField(term179158, term179158.getClass(), "allowingMultiEdges", true);
        setIntField(term179158, term179158.getClass(), "vertexDataSize", 1);
        setIntField(term179158, term179158.getClass(), "edgeDataSize", 1);
        setField(term179158, term179158.getClass(), "name", "iiHBhsNFgk");
        setField(term179158, term179158.getClass(), "edges", term179200);
        setField(term179158, term179158.getClass(), "paths", term179204);
        setField(term179158, term179158.getClass(), "cycles", term179208);
        setField(term179158, term179158.getClass(), "cliques", term179212);
        term179216 = new Double(0.36093706406093096);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term179216;
        callMethod(klass, "estimatedDensity", argTypes, term179158, args);
    }

};


