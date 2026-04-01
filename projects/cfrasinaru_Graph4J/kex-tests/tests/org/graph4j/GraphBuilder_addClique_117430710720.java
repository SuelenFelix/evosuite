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
     Object term179859;
     Object term179921;

    public GraphBuilder_addClique_117430710720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179866 = new ArrayList();
        HashMap term179870 = new HashMap();
        HashMap term179875 = new HashMap();
        Integer term179880 = new Integer(-1538936030);
        Long term179882 = new Long(2486810210675247493L);
        Integer term179884 = new Integer(-752870423);
        Double term179886 = new Double(0.9785774881434849);
        ArrayList term179905 = new ArrayList();
        ArrayList term179909 = new ArrayList();
        ArrayList term179913 = new ArrayList();
        ArrayList term179917 = new ArrayList();
        term179859 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179860 = (int[]) newIntArray(5);
        setIntElement(term179860, 0, -1904944790);
        setIntElement(term179860, 1, 1182885130);
        setIntElement(term179860, 2, 1518545384);
        setIntElement(term179860, 3, -258152385);
        setIntElement(term179860, 4, -738233333);
        setField(term179859, term179859.getClass(), "vertices", term179860);
        setField(term179859, term179859.getClass(), "dynamicVertices", term179866);
        setField(term179859, term179859.getClass(), "vertexLabelMap", term179870);
        setField(term179859, term179859.getClass(), "vertexWeightMap", term179875);
        setField(term179859, term179859.getClass(), "maxVertices", term179880);
        setField(term179859, term179859.getClass(), "numEdges", term179882);
        setField(term179859, term179859.getClass(), "avgDegree", term179884);
        setField(term179859, term179859.getClass(), "density", term179886);
        setBooleanField(term179859, term179859.getClass(), "directed", false);
        setBooleanField(term179859, term179859.getClass(), "allowingSelfLoops", false);
        setBooleanField(term179859, term179859.getClass(), "allowingMultiEdges", false);
        setIntField(term179859, term179859.getClass(), "vertexDataSize", 1);
        setIntField(term179859, term179859.getClass(), "edgeDataSize", 1);
        setField(term179859, term179859.getClass(), "name", "vqnBkkxoIa");
        setField(term179859, term179859.getClass(), "edges", term179905);
        setField(term179859, term179859.getClass(), "paths", term179909);
        setField(term179859, term179859.getClass(), "cycles", term179913);
        setField(term179859, term179859.getClass(), "cliques", term179917);
        term179921 = (int[]) newIntArray(8);
        setIntElement(term179921, 0, -1405910782);
        setIntElement(term179921, 1, -1475974582);
        setIntElement(term179921, 2, 496971783);
        setIntElement(term179921, 3, 828739362);
        setIntElement(term179921, 4, -1348520716);
        setIntElement(term179921, 5, -1949339206);
        setIntElement(term179921, 6, 1207476704);
        setIntElement(term179921, 7, 192088906);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term179921;
        callMethod(klass, "addClique", argTypes, term179859, args);
    }

};


