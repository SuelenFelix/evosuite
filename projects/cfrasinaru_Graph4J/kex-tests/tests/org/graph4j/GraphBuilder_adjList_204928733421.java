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
import java.lang.Object;

public class GraphBuilder_adjList_204928733421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179953;
     Object term180014;

    public GraphBuilder_adjList_204928733421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179959 = new ArrayList();
        HashMap term179963 = new HashMap();
        HashMap term179968 = new HashMap();
        Integer term179973 = new Integer(-1698809299);
        Long term179975 = new Long(7009926388951271268L);
        Integer term179977 = new Integer(401512128);
        Double term179979 = new Double(0.28611501631381);
        ArrayList term179998 = new ArrayList();
        ArrayList term180002 = new ArrayList();
        ArrayList term180006 = new ArrayList();
        ArrayList term180010 = new ArrayList();
        term179953 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179954 = (int[]) newIntArray(4);
        setIntElement(term179954, 0, -571364029);
        setIntElement(term179954, 1, -345838592);
        setIntElement(term179954, 2, -1068114542);
        setIntElement(term179954, 3, -348932233);
        setField(term179953, term179953.getClass(), "vertices", term179954);
        setField(term179953, term179953.getClass(), "dynamicVertices", term179959);
        setField(term179953, term179953.getClass(), "vertexLabelMap", term179963);
        setField(term179953, term179953.getClass(), "vertexWeightMap", term179968);
        setField(term179953, term179953.getClass(), "maxVertices", term179973);
        setField(term179953, term179953.getClass(), "numEdges", term179975);
        setField(term179953, term179953.getClass(), "avgDegree", term179977);
        setField(term179953, term179953.getClass(), "density", term179979);
        setBooleanField(term179953, term179953.getClass(), "directed", false);
        setBooleanField(term179953, term179953.getClass(), "allowingSelfLoops", true);
        setBooleanField(term179953, term179953.getClass(), "allowingMultiEdges", false);
        setIntField(term179953, term179953.getClass(), "vertexDataSize", 1);
        setIntField(term179953, term179953.getClass(), "edgeDataSize", 1);
        setField(term179953, term179953.getClass(), "name", "bycpZjxXFn");
        setField(term179953, term179953.getClass(), "edges", term179998);
        setField(term179953, term179953.getClass(), "paths", term180002);
        setField(term179953, term179953.getClass(), "cycles", term180006);
        setField(term179953, term179953.getClass(), "cliques", term180010);
        term180014 = (Object[]) newArray("[I", 1);
        int[] term180015 = (int[]) newIntArray(4);
        setIntElement(term180015, 0, 58442197);
        setIntElement(term180015, 1, 742769664);
        setIntElement(term180015, 2, -1630544641);
        setIntElement(term180015, 3, -1350806198);
        setElement(term180014, 0, term180015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term180014;
        callMethod(klass, "adjList", argTypes, term179953, args);
    }

};


