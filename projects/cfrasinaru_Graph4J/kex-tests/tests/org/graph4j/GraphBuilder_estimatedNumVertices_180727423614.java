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

public class GraphBuilder_estimatedNumVertices_180727423614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179384;
     Object term179447;

    public GraphBuilder_estimatedNumVertices_180727423614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179392 = new ArrayList();
        HashMap term179396 = new HashMap();
        HashMap term179401 = new HashMap();
        Integer term179406 = new Integer(-706253892);
        Long term179408 = new Long(-6573104506744284592L);
        Integer term179410 = new Integer(-1341439819);
        Double term179412 = new Double(0.4163626523414238);
        ArrayList term179431 = new ArrayList();
        ArrayList term179435 = new ArrayList();
        ArrayList term179439 = new ArrayList();
        ArrayList term179443 = new ArrayList();
        term179384 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179385 = (int[]) newIntArray(6);
        setIntElement(term179385, 0, 2628487);
        setIntElement(term179385, 1, 2017254700);
        setIntElement(term179385, 2, -364549983);
        setIntElement(term179385, 3, 510496582);
        setIntElement(term179385, 4, 1873439169);
        setIntElement(term179385, 5, 416754733);
        setField(term179384, term179384.getClass(), "vertices", term179385);
        setField(term179384, term179384.getClass(), "dynamicVertices", term179392);
        setField(term179384, term179384.getClass(), "vertexLabelMap", term179396);
        setField(term179384, term179384.getClass(), "vertexWeightMap", term179401);
        setField(term179384, term179384.getClass(), "maxVertices", term179406);
        setField(term179384, term179384.getClass(), "numEdges", term179408);
        setField(term179384, term179384.getClass(), "avgDegree", term179410);
        setField(term179384, term179384.getClass(), "density", term179412);
        setBooleanField(term179384, term179384.getClass(), "directed", false);
        setBooleanField(term179384, term179384.getClass(), "allowingSelfLoops", false);
        setBooleanField(term179384, term179384.getClass(), "allowingMultiEdges", false);
        setIntField(term179384, term179384.getClass(), "vertexDataSize", 1);
        setIntField(term179384, term179384.getClass(), "edgeDataSize", 1);
        setField(term179384, term179384.getClass(), "name", "rsumfoDNHa");
        setField(term179384, term179384.getClass(), "edges", term179431);
        setField(term179384, term179384.getClass(), "paths", term179435);
        setField(term179384, term179384.getClass(), "cycles", term179439);
        setField(term179384, term179384.getClass(), "cliques", term179443);
        term179447 = new Integer(-699653689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term179447;
        callMethod(klass, "estimatedNumVertices", argTypes, term179384, args);
    }

};


