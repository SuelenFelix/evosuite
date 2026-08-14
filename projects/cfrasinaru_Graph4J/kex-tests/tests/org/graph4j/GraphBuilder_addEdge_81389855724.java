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

public class GraphBuilder_addEdge_81389855724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180237;
     Object term180294;
     Object term180296;

    public GraphBuilder_addEdge_81389855724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term180239 = new ArrayList();
        HashMap term180243 = new HashMap();
        HashMap term180248 = new HashMap();
        Integer term180253 = new Integer(178847646);
        Long term180255 = new Long(1967728129628047933L);
        Integer term180257 = new Integer(273590437);
        Double term180259 = new Double(0.08409484827874791);
        ArrayList term180278 = new ArrayList();
        ArrayList term180282 = new ArrayList();
        ArrayList term180286 = new ArrayList();
        ArrayList term180290 = new ArrayList();
        term180237 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term180238 = (int[]) newIntArray(0);
        setField(term180237, term180237.getClass(), "vertices", term180238);
        setField(term180237, term180237.getClass(), "dynamicVertices", term180239);
        setField(term180237, term180237.getClass(), "vertexLabelMap", term180243);
        setField(term180237, term180237.getClass(), "vertexWeightMap", term180248);
        setField(term180237, term180237.getClass(), "maxVertices", term180253);
        setField(term180237, term180237.getClass(), "numEdges", term180255);
        setField(term180237, term180237.getClass(), "avgDegree", term180257);
        setField(term180237, term180237.getClass(), "density", term180259);
        setBooleanField(term180237, term180237.getClass(), "directed", true);
        setBooleanField(term180237, term180237.getClass(), "allowingSelfLoops", true);
        setBooleanField(term180237, term180237.getClass(), "allowingMultiEdges", true);
        setIntField(term180237, term180237.getClass(), "vertexDataSize", 1);
        setIntField(term180237, term180237.getClass(), "edgeDataSize", 1);
        setField(term180237, term180237.getClass(), "name", "mfHtgSbdjD");
        setField(term180237, term180237.getClass(), "edges", term180278);
        setField(term180237, term180237.getClass(), "paths", term180282);
        setField(term180237, term180237.getClass(), "cycles", term180286);
        setField(term180237, term180237.getClass(), "cliques", term180290);
        term180294 = new Integer(1037678275);
        term180296 = new Integer(-1942863534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term180294;
        args[1] = term180296;
        callMethod(klass, "addEdge", argTypes, term180237, args);
    }

};


