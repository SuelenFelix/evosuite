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

public class GraphBuilder_estimatedAvgDegree_2409398112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179218;
     Object term179280;

    public GraphBuilder_estimatedAvgDegree_2409398112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179225 = new ArrayList();
        HashMap term179229 = new HashMap();
        HashMap term179234 = new HashMap();
        Integer term179239 = new Integer(470895808);
        Long term179241 = new Long(-316468845751588286L);
        Integer term179243 = new Integer(1787325291);
        Double term179245 = new Double(0.5853524705783772);
        ArrayList term179264 = new ArrayList();
        ArrayList term179268 = new ArrayList();
        ArrayList term179272 = new ArrayList();
        ArrayList term179276 = new ArrayList();
        term179218 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179219 = (int[]) newIntArray(5);
        setIntElement(term179219, 0, -478076582);
        setIntElement(term179219, 1, 1505859689);
        setIntElement(term179219, 2, -730903204);
        setIntElement(term179219, 3, -947304280);
        setIntElement(term179219, 4, 282363289);
        setField(term179218, term179218.getClass(), "vertices", term179219);
        setField(term179218, term179218.getClass(), "dynamicVertices", term179225);
        setField(term179218, term179218.getClass(), "vertexLabelMap", term179229);
        setField(term179218, term179218.getClass(), "vertexWeightMap", term179234);
        setField(term179218, term179218.getClass(), "maxVertices", term179239);
        setField(term179218, term179218.getClass(), "numEdges", term179241);
        setField(term179218, term179218.getClass(), "avgDegree", term179243);
        setField(term179218, term179218.getClass(), "density", term179245);
        setBooleanField(term179218, term179218.getClass(), "directed", true);
        setBooleanField(term179218, term179218.getClass(), "allowingSelfLoops", false);
        setBooleanField(term179218, term179218.getClass(), "allowingMultiEdges", true);
        setIntField(term179218, term179218.getClass(), "vertexDataSize", 1);
        setIntField(term179218, term179218.getClass(), "edgeDataSize", 1);
        setField(term179218, term179218.getClass(), "name", "HknsTajwxJ");
        setField(term179218, term179218.getClass(), "edges", term179264);
        setField(term179218, term179218.getClass(), "paths", term179268);
        setField(term179218, term179218.getClass(), "cycles", term179272);
        setField(term179218, term179218.getClass(), "cliques", term179276);
        term179280 = new Integer(1862686120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term179280;
        callMethod(klass, "estimatedAvgDegree", argTypes, term179218, args);
    }

};


