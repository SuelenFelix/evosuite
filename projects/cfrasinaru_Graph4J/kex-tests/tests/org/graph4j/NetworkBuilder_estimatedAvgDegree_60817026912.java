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

public class NetworkBuilder_estimatedAvgDegree_60817026912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65059;
     Object term65126;

    public NetworkBuilder_estimatedAvgDegree_60817026912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65071 = new ArrayList();
        HashMap term65075 = new HashMap();
        HashMap term65080 = new HashMap();
        Integer term65085 = new Integer(-601863069);
        Long term65087 = new Long(-8400487765614892086L);
        Integer term65089 = new Integer(663292551);
        Double term65091 = new Double(0.7757378334599976);
        ArrayList term65110 = new ArrayList();
        ArrayList term65114 = new ArrayList();
        ArrayList term65118 = new ArrayList();
        ArrayList term65122 = new ArrayList();
        term65059 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term65062 = (int[]) newIntArray(8);
        setIntField(term65059, term65059.getClass(), "source", -1);
        setIntField(term65059, term65059.getClass(), "sink", -1);
        setIntElement(term65062, 0, 1803786185);
        setIntElement(term65062, 1, 827800338);
        setIntElement(term65062, 2, -726644350);
        setIntElement(term65062, 3, -1889922089);
        setIntElement(term65062, 4, -1126162521);
        setIntElement(term65062, 5, -1937977171);
        setIntElement(term65062, 6, -1393512773);
        setIntElement(term65062, 7, -766556211);
        setField(term65059, term65059.getClass(), "vertices", term65062);
        setField(term65059, term65059.getClass(), "dynamicVertices", term65071);
        setField(term65059, term65059.getClass(), "vertexLabelMap", term65075);
        setField(term65059, term65059.getClass(), "vertexWeightMap", term65080);
        setField(term65059, term65059.getClass(), "maxVertices", term65085);
        setField(term65059, term65059.getClass(), "numEdges", term65087);
        setField(term65059, term65059.getClass(), "avgDegree", term65089);
        setField(term65059, term65059.getClass(), "density", term65091);
        setBooleanField(term65059, term65059.getClass(), "directed", true);
        setBooleanField(term65059, term65059.getClass(), "allowingSelfLoops", true);
        setBooleanField(term65059, term65059.getClass(), "allowingMultiEdges", false);
        setIntField(term65059, term65059.getClass(), "vertexDataSize", 1);
        setIntField(term65059, term65059.getClass(), "edgeDataSize", 3);
        setField(term65059, term65059.getClass(), "name", "uSUvKAyuvd");
        setField(term65059, term65059.getClass(), "edges", term65110);
        setField(term65059, term65059.getClass(), "paths", term65114);
        setField(term65059, term65059.getClass(), "cycles", term65118);
        setField(term65059, term65059.getClass(), "cliques", term65122);
        term65126 = new Integer(-362370868);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65126;
        callMethod(klass, "estimatedAvgDegree", argTypes, term65059, args);
    }

};


