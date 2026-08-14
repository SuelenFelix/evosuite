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

public class GraphBuilder_edgeDataSize_70427895316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179555;
     Object term179615;

    public GraphBuilder_edgeDataSize_70427895316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179560 = new ArrayList();
        HashMap term179564 = new HashMap();
        HashMap term179569 = new HashMap();
        Integer term179574 = new Integer(-1244386281);
        Long term179576 = new Long(8428634514691209827L);
        Integer term179578 = new Integer(-885788574);
        Double term179580 = new Double(0.36399186881692824);
        ArrayList term179599 = new ArrayList();
        ArrayList term179603 = new ArrayList();
        ArrayList term179607 = new ArrayList();
        ArrayList term179611 = new ArrayList();
        term179555 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179556 = (int[]) newIntArray(3);
        setIntElement(term179556, 0, -698320070);
        setIntElement(term179556, 1, 396234650);
        setIntElement(term179556, 2, 785681966);
        setField(term179555, term179555.getClass(), "vertices", term179556);
        setField(term179555, term179555.getClass(), "dynamicVertices", term179560);
        setField(term179555, term179555.getClass(), "vertexLabelMap", term179564);
        setField(term179555, term179555.getClass(), "vertexWeightMap", term179569);
        setField(term179555, term179555.getClass(), "maxVertices", term179574);
        setField(term179555, term179555.getClass(), "numEdges", term179576);
        setField(term179555, term179555.getClass(), "avgDegree", term179578);
        setField(term179555, term179555.getClass(), "density", term179580);
        setBooleanField(term179555, term179555.getClass(), "directed", true);
        setBooleanField(term179555, term179555.getClass(), "allowingSelfLoops", true);
        setBooleanField(term179555, term179555.getClass(), "allowingMultiEdges", false);
        setIntField(term179555, term179555.getClass(), "vertexDataSize", 1);
        setIntField(term179555, term179555.getClass(), "edgeDataSize", 1);
        setField(term179555, term179555.getClass(), "name", "LrqwfrKKtS");
        setField(term179555, term179555.getClass(), "edges", term179599);
        setField(term179555, term179555.getClass(), "paths", term179603);
        setField(term179555, term179555.getClass(), "cycles", term179607);
        setField(term179555, term179555.getClass(), "cliques", term179611);
        term179615 = new Integer(-1605764059);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term179615;
        callMethod(klass, "edgeDataSize", argTypes, term179555, args);
    }

};


