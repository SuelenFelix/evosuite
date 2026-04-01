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

public class GraphBuilder_named_149636436310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179044;

    public GraphBuilder_named_149636436310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179053 = new ArrayList();
        HashMap term179057 = new HashMap();
        HashMap term179062 = new HashMap();
        Integer term179067 = new Integer(1091954101);
        Long term179069 = new Long(-5476826692763582090L);
        Integer term179071 = new Integer(1895143076);
        Double term179073 = new Double(0.045548450979401744);
        ArrayList term179092 = new ArrayList();
        ArrayList term179096 = new ArrayList();
        ArrayList term179100 = new ArrayList();
        ArrayList term179104 = new ArrayList();
        term179044 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179045 = (int[]) newIntArray(7);
        setIntElement(term179045, 0, -1607861710);
        setIntElement(term179045, 1, -2099460141);
        setIntElement(term179045, 2, 866892495);
        setIntElement(term179045, 3, -1509659815);
        setIntElement(term179045, 4, 505823042);
        setIntElement(term179045, 5, 478064433);
        setIntElement(term179045, 6, 1019049961);
        setField(term179044, term179044.getClass(), "vertices", term179045);
        setField(term179044, term179044.getClass(), "dynamicVertices", term179053);
        setField(term179044, term179044.getClass(), "vertexLabelMap", term179057);
        setField(term179044, term179044.getClass(), "vertexWeightMap", term179062);
        setField(term179044, term179044.getClass(), "maxVertices", term179067);
        setField(term179044, term179044.getClass(), "numEdges", term179069);
        setField(term179044, term179044.getClass(), "avgDegree", term179071);
        setField(term179044, term179044.getClass(), "density", term179073);
        setBooleanField(term179044, term179044.getClass(), "directed", false);
        setBooleanField(term179044, term179044.getClass(), "allowingSelfLoops", false);
        setBooleanField(term179044, term179044.getClass(), "allowingMultiEdges", true);
        setIntField(term179044, term179044.getClass(), "vertexDataSize", 1);
        setIntField(term179044, term179044.getClass(), "edgeDataSize", 1);
        setField(term179044, term179044.getClass(), "name", "VoghngXfsK");
        setField(term179044, term179044.getClass(), "edges", term179092);
        setField(term179044, term179044.getClass(), "paths", term179096);
        setField(term179044, term179044.getClass(), "cycles", term179100);
        setField(term179044, term179044.getClass(), "cliques", term179104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GbahCBMvct";
        callMethod(klass, "named", argTypes, term179044, args);
    }

};


