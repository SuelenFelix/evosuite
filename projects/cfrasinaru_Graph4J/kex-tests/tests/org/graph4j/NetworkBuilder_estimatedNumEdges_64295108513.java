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

public class NetworkBuilder_estimatedNumEdges_64295108513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65143;
     Object term65207;

    public NetworkBuilder_estimatedNumEdges_64295108513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65152 = new ArrayList();
        HashMap term65156 = new HashMap();
        HashMap term65161 = new HashMap();
        Integer term65166 = new Integer(-1885090354);
        Long term65168 = new Long(5270370404989704783L);
        Integer term65170 = new Integer(-2066804303);
        Double term65172 = new Double(0.3459237114146855);
        ArrayList term65191 = new ArrayList();
        ArrayList term65195 = new ArrayList();
        ArrayList term65199 = new ArrayList();
        ArrayList term65203 = new ArrayList();
        term65143 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term65146 = (int[]) newIntArray(5);
        setIntField(term65143, term65143.getClass(), "source", -1);
        setIntField(term65143, term65143.getClass(), "sink", -1);
        setIntElement(term65146, 0, 340420516);
        setIntElement(term65146, 1, -500639296);
        setIntElement(term65146, 2, -64111831);
        setIntElement(term65146, 3, -145193222);
        setIntElement(term65146, 4, 1575078592);
        setField(term65143, term65143.getClass(), "vertices", term65146);
        setField(term65143, term65143.getClass(), "dynamicVertices", term65152);
        setField(term65143, term65143.getClass(), "vertexLabelMap", term65156);
        setField(term65143, term65143.getClass(), "vertexWeightMap", term65161);
        setField(term65143, term65143.getClass(), "maxVertices", term65166);
        setField(term65143, term65143.getClass(), "numEdges", term65168);
        setField(term65143, term65143.getClass(), "avgDegree", term65170);
        setField(term65143, term65143.getClass(), "density", term65172);
        setBooleanField(term65143, term65143.getClass(), "directed", false);
        setBooleanField(term65143, term65143.getClass(), "allowingSelfLoops", true);
        setBooleanField(term65143, term65143.getClass(), "allowingMultiEdges", false);
        setIntField(term65143, term65143.getClass(), "vertexDataSize", 1);
        setIntField(term65143, term65143.getClass(), "edgeDataSize", 3);
        setField(term65143, term65143.getClass(), "name", "onQLVONGuf");
        setField(term65143, term65143.getClass(), "edges", term65191);
        setField(term65143, term65143.getClass(), "paths", term65195);
        setField(term65143, term65143.getClass(), "cycles", term65199);
        setField(term65143, term65143.getClass(), "cliques", term65203);
        term65207 = new Long(8403492202041709902L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term65207;
        callMethod(klass, "estimatedNumEdges", argTypes, term65143, args);
    }

};


