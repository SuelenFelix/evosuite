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

public class GraphBuilder_newInstance_2247934171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178916;

    public GraphBuilder_newInstance_2247934171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term178922 = new ArrayList();
        HashMap term178926 = new HashMap();
        HashMap term178931 = new HashMap();
        Integer term178936 = new Integer(-457396133);
        Long term178938 = new Long(2535595959091595249L);
        Integer term178940 = new Integer(-1793950607);
        Double term178942 = new Double(0.9648698813644304);
        ArrayList term178961 = new ArrayList();
        ArrayList term178965 = new ArrayList();
        ArrayList term178969 = new ArrayList();
        ArrayList term178973 = new ArrayList();
        term178916 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term178917 = (int[]) newIntArray(4);
        setIntElement(term178917, 0, 1377275539);
        setIntElement(term178917, 1, -794146016);
        setIntElement(term178917, 2, 1088527541);
        setIntElement(term178917, 3, 2117924663);
        setField(term178916, term178916.getClass(), "vertices", term178917);
        setField(term178916, term178916.getClass(), "dynamicVertices", term178922);
        setField(term178916, term178916.getClass(), "vertexLabelMap", term178926);
        setField(term178916, term178916.getClass(), "vertexWeightMap", term178931);
        setField(term178916, term178916.getClass(), "maxVertices", term178936);
        setField(term178916, term178916.getClass(), "numEdges", term178938);
        setField(term178916, term178916.getClass(), "avgDegree", term178940);
        setField(term178916, term178916.getClass(), "density", term178942);
        setBooleanField(term178916, term178916.getClass(), "directed", false);
        setBooleanField(term178916, term178916.getClass(), "allowingSelfLoops", false);
        setBooleanField(term178916, term178916.getClass(), "allowingMultiEdges", true);
        setIntField(term178916, term178916.getClass(), "vertexDataSize", 1);
        setIntField(term178916, term178916.getClass(), "edgeDataSize", 1);
        setField(term178916, term178916.getClass(), "name", "CNqMxLvtcJ");
        setField(term178916, term178916.getClass(), "edges", term178961);
        setField(term178916, term178916.getClass(), "paths", term178965);
        setField(term178916, term178916.getClass(), "cycles", term178969);
        setField(term178916, term178916.getClass(), "cliques", term178973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newInstance", argTypes, term178916, args);
    }

};


