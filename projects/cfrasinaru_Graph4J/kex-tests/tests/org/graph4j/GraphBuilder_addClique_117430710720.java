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

public class GraphBuilder_addClique_117430710720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179870;
     Object term179932;

    public GraphBuilder_addClique_117430710720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179877 = new ArrayList();
        HashMap term179881 = new HashMap();
        HashMap term179886 = new HashMap();
        Integer term179891 = new Integer(-1538936030);
        Long term179893 = new Long(2486810210675247493L);
        Integer term179895 = new Integer(-752870423);
        Double term179897 = new Double(0.9785774881434849);
        ArrayList term179916 = new ArrayList();
        ArrayList term179920 = new ArrayList();
        ArrayList term179924 = new ArrayList();
        ArrayList term179928 = new ArrayList();
        term179870 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179871 = (int[]) newIntArray(5);
        setIntElement(term179871, 0, -1904944790);
        setIntElement(term179871, 1, 1182885130);
        setIntElement(term179871, 2, 1518545384);
        setIntElement(term179871, 3, -258152385);
        setIntElement(term179871, 4, -738233333);
        setField(term179870, term179870.getClass(), "vertices", term179871);
        setField(term179870, term179870.getClass(), "dynamicVertices", term179877);
        setField(term179870, term179870.getClass(), "vertexLabelMap", term179881);
        setField(term179870, term179870.getClass(), "vertexWeightMap", term179886);
        setField(term179870, term179870.getClass(), "maxVertices", term179891);
        setField(term179870, term179870.getClass(), "numEdges", term179893);
        setField(term179870, term179870.getClass(), "avgDegree", term179895);
        setField(term179870, term179870.getClass(), "density", term179897);
        setBooleanField(term179870, term179870.getClass(), "directed", false);
        setBooleanField(term179870, term179870.getClass(), "allowingSelfLoops", false);
        setBooleanField(term179870, term179870.getClass(), "allowingMultiEdges", false);
        setIntField(term179870, term179870.getClass(), "vertexDataSize", 1);
        setIntField(term179870, term179870.getClass(), "edgeDataSize", 1);
        setField(term179870, term179870.getClass(), "name", "vqnBkkxoIa");
        setField(term179870, term179870.getClass(), "edges", term179916);
        setField(term179870, term179870.getClass(), "paths", term179920);
        setField(term179870, term179870.getClass(), "cycles", term179924);
        setField(term179870, term179870.getClass(), "cliques", term179928);
        term179932 = (int[]) newIntArray(8);
        setIntElement(term179932, 0, -1405910782);
        setIntElement(term179932, 1, -1475974582);
        setIntElement(term179932, 2, 496971783);
        setIntElement(term179932, 3, 828739362);
        setIntElement(term179932, 4, -1348520716);
        setIntElement(term179932, 5, -1949339206);
        setIntElement(term179932, 6, 1207476704);
        setIntElement(term179932, 7, 192088906);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term179932;
        callMethod(klass, "addClique", argTypes, term179870, args);
    }

};


