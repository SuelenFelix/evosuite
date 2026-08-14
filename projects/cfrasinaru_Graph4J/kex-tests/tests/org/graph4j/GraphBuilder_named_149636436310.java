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
     Object term179055;

    public GraphBuilder_named_149636436310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179064 = new ArrayList();
        HashMap term179068 = new HashMap();
        HashMap term179073 = new HashMap();
        Integer term179078 = new Integer(1091954101);
        Long term179080 = new Long(-5476826692763582090L);
        Integer term179082 = new Integer(1895143076);
        Double term179084 = new Double(0.045548450979401744);
        ArrayList term179103 = new ArrayList();
        ArrayList term179107 = new ArrayList();
        ArrayList term179111 = new ArrayList();
        ArrayList term179115 = new ArrayList();
        term179055 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179056 = (int[]) newIntArray(7);
        setIntElement(term179056, 0, -1607861710);
        setIntElement(term179056, 1, -2099460141);
        setIntElement(term179056, 2, 866892495);
        setIntElement(term179056, 3, -1509659815);
        setIntElement(term179056, 4, 505823042);
        setIntElement(term179056, 5, 478064433);
        setIntElement(term179056, 6, 1019049961);
        setField(term179055, term179055.getClass(), "vertices", term179056);
        setField(term179055, term179055.getClass(), "dynamicVertices", term179064);
        setField(term179055, term179055.getClass(), "vertexLabelMap", term179068);
        setField(term179055, term179055.getClass(), "vertexWeightMap", term179073);
        setField(term179055, term179055.getClass(), "maxVertices", term179078);
        setField(term179055, term179055.getClass(), "numEdges", term179080);
        setField(term179055, term179055.getClass(), "avgDegree", term179082);
        setField(term179055, term179055.getClass(), "density", term179084);
        setBooleanField(term179055, term179055.getClass(), "directed", false);
        setBooleanField(term179055, term179055.getClass(), "allowingSelfLoops", false);
        setBooleanField(term179055, term179055.getClass(), "allowingMultiEdges", true);
        setIntField(term179055, term179055.getClass(), "vertexDataSize", 1);
        setIntField(term179055, term179055.getClass(), "edgeDataSize", 1);
        setField(term179055, term179055.getClass(), "name", "VoghngXfsK");
        setField(term179055, term179055.getClass(), "edges", term179103);
        setField(term179055, term179055.getClass(), "paths", term179107);
        setField(term179055, term179055.getClass(), "cycles", term179111);
        setField(term179055, term179055.getClass(), "cliques", term179115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GbahCBMvct";
        callMethod(klass, "named", argTypes, term179055, args);
    }

};


