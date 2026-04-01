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
     Object term178913;

    public GraphBuilder_newInstance_2247934171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term178919 = new ArrayList();
        HashMap term178923 = new HashMap();
        HashMap term178928 = new HashMap();
        Integer term178933 = new Integer(-457396133);
        Long term178935 = new Long(2535595959091595249L);
        Integer term178937 = new Integer(-1793950607);
        Double term178939 = new Double(0.9648698813644304);
        ArrayList term178958 = new ArrayList();
        ArrayList term178962 = new ArrayList();
        ArrayList term178966 = new ArrayList();
        ArrayList term178970 = new ArrayList();
        term178913 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term178914 = (int[]) newIntArray(4);
        setIntElement(term178914, 0, 1377275539);
        setIntElement(term178914, 1, -794146016);
        setIntElement(term178914, 2, 1088527541);
        setIntElement(term178914, 3, 2117924663);
        setField(term178913, term178913.getClass(), "vertices", term178914);
        setField(term178913, term178913.getClass(), "dynamicVertices", term178919);
        setField(term178913, term178913.getClass(), "vertexLabelMap", term178923);
        setField(term178913, term178913.getClass(), "vertexWeightMap", term178928);
        setField(term178913, term178913.getClass(), "maxVertices", term178933);
        setField(term178913, term178913.getClass(), "numEdges", term178935);
        setField(term178913, term178913.getClass(), "avgDegree", term178937);
        setField(term178913, term178913.getClass(), "density", term178939);
        setBooleanField(term178913, term178913.getClass(), "directed", false);
        setBooleanField(term178913, term178913.getClass(), "allowingSelfLoops", false);
        setBooleanField(term178913, term178913.getClass(), "allowingMultiEdges", true);
        setIntField(term178913, term178913.getClass(), "vertexDataSize", 1);
        setIntField(term178913, term178913.getClass(), "edgeDataSize", 1);
        setField(term178913, term178913.getClass(), "name", "CNqMxLvtcJ");
        setField(term178913, term178913.getClass(), "edges", term178958);
        setField(term178913, term178913.getClass(), "paths", term178962);
        setField(term178913, term178913.getClass(), "cycles", term178966);
        setField(term178913, term178913.getClass(), "cliques", term178970);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newInstance", argTypes, term178913, args);
    }

};


