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
     Object term179964;
     Object term180025;

    public GraphBuilder_adjList_204928733421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179970 = new ArrayList();
        HashMap term179974 = new HashMap();
        HashMap term179979 = new HashMap();
        Integer term179984 = new Integer(-1698809299);
        Long term179986 = new Long(7009926388951271268L);
        Integer term179988 = new Integer(401512128);
        Double term179990 = new Double(0.28611501631381);
        ArrayList term180009 = new ArrayList();
        ArrayList term180013 = new ArrayList();
        ArrayList term180017 = new ArrayList();
        ArrayList term180021 = new ArrayList();
        term179964 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179965 = (int[]) newIntArray(4);
        setIntElement(term179965, 0, -571364029);
        setIntElement(term179965, 1, -345838592);
        setIntElement(term179965, 2, -1068114542);
        setIntElement(term179965, 3, -348932233);
        setField(term179964, term179964.getClass(), "vertices", term179965);
        setField(term179964, term179964.getClass(), "dynamicVertices", term179970);
        setField(term179964, term179964.getClass(), "vertexLabelMap", term179974);
        setField(term179964, term179964.getClass(), "vertexWeightMap", term179979);
        setField(term179964, term179964.getClass(), "maxVertices", term179984);
        setField(term179964, term179964.getClass(), "numEdges", term179986);
        setField(term179964, term179964.getClass(), "avgDegree", term179988);
        setField(term179964, term179964.getClass(), "density", term179990);
        setBooleanField(term179964, term179964.getClass(), "directed", false);
        setBooleanField(term179964, term179964.getClass(), "allowingSelfLoops", true);
        setBooleanField(term179964, term179964.getClass(), "allowingMultiEdges", false);
        setIntField(term179964, term179964.getClass(), "vertexDataSize", 1);
        setIntField(term179964, term179964.getClass(), "edgeDataSize", 1);
        setField(term179964, term179964.getClass(), "name", "bycpZjxXFn");
        setField(term179964, term179964.getClass(), "edges", term180009);
        setField(term179964, term179964.getClass(), "paths", term180013);
        setField(term179964, term179964.getClass(), "cycles", term180017);
        setField(term179964, term179964.getClass(), "cliques", term180021);
        term180025 = (Object[]) newArray("[I", 1);
        int[] term180026 = (int[]) newIntArray(4);
        setIntElement(term180026, 0, 58442197);
        setIntElement(term180026, 1, 742769664);
        setIntElement(term180026, 2, -1630544641);
        setIntElement(term180026, 3, -1350806198);
        setElement(term180025, 0, term180026);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term180025;
        callMethod(klass, "adjList", argTypes, term179964, args);
    }

};


