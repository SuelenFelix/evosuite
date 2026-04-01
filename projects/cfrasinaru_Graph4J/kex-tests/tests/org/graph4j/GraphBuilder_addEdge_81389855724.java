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
     Object term180226;
     Object term180283;
     Object term180285;

    public GraphBuilder_addEdge_81389855724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term180228 = new ArrayList();
        HashMap term180232 = new HashMap();
        HashMap term180237 = new HashMap();
        Integer term180242 = new Integer(178847646);
        Long term180244 = new Long(1967728129628047933L);
        Integer term180246 = new Integer(273590437);
        Double term180248 = new Double(0.08409484827874791);
        ArrayList term180267 = new ArrayList();
        ArrayList term180271 = new ArrayList();
        ArrayList term180275 = new ArrayList();
        ArrayList term180279 = new ArrayList();
        term180226 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term180227 = (int[]) newIntArray(0);
        setField(term180226, term180226.getClass(), "vertices", term180227);
        setField(term180226, term180226.getClass(), "dynamicVertices", term180228);
        setField(term180226, term180226.getClass(), "vertexLabelMap", term180232);
        setField(term180226, term180226.getClass(), "vertexWeightMap", term180237);
        setField(term180226, term180226.getClass(), "maxVertices", term180242);
        setField(term180226, term180226.getClass(), "numEdges", term180244);
        setField(term180226, term180226.getClass(), "avgDegree", term180246);
        setField(term180226, term180226.getClass(), "density", term180248);
        setBooleanField(term180226, term180226.getClass(), "directed", true);
        setBooleanField(term180226, term180226.getClass(), "allowingSelfLoops", true);
        setBooleanField(term180226, term180226.getClass(), "allowingMultiEdges", true);
        setIntField(term180226, term180226.getClass(), "vertexDataSize", 1);
        setIntField(term180226, term180226.getClass(), "edgeDataSize", 1);
        setField(term180226, term180226.getClass(), "name", "mfHtgSbdjD");
        setField(term180226, term180226.getClass(), "edges", term180267);
        setField(term180226, term180226.getClass(), "paths", term180271);
        setField(term180226, term180226.getClass(), "cycles", term180275);
        setField(term180226, term180226.getClass(), "cliques", term180279);
        term180283 = new Integer(1037678275);
        term180285 = new Integer(-1942863534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term180283;
        args[1] = term180285;
        callMethod(klass, "addEdge", argTypes, term180226, args);
    }

};


