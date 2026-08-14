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
     Object term65146;
     Object term65210;

    public NetworkBuilder_estimatedNumEdges_64295108513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65155 = new ArrayList();
        HashMap term65159 = new HashMap();
        HashMap term65164 = new HashMap();
        Integer term65169 = new Integer(-1885090354);
        Long term65171 = new Long(5270370404989704783L);
        Integer term65173 = new Integer(-2066804303);
        Double term65175 = new Double(0.3459237114146855);
        ArrayList term65194 = new ArrayList();
        ArrayList term65198 = new ArrayList();
        ArrayList term65202 = new ArrayList();
        ArrayList term65206 = new ArrayList();
        term65146 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term65149 = (int[]) newIntArray(5);
        setIntField(term65146, term65146.getClass(), "source", -1);
        setIntField(term65146, term65146.getClass(), "sink", -1);
        setIntElement(term65149, 0, 340420516);
        setIntElement(term65149, 1, -500639296);
        setIntElement(term65149, 2, -64111831);
        setIntElement(term65149, 3, -145193222);
        setIntElement(term65149, 4, 1575078592);
        setField(term65146, term65146.getClass(), "vertices", term65149);
        setField(term65146, term65146.getClass(), "dynamicVertices", term65155);
        setField(term65146, term65146.getClass(), "vertexLabelMap", term65159);
        setField(term65146, term65146.getClass(), "vertexWeightMap", term65164);
        setField(term65146, term65146.getClass(), "maxVertices", term65169);
        setField(term65146, term65146.getClass(), "numEdges", term65171);
        setField(term65146, term65146.getClass(), "avgDegree", term65173);
        setField(term65146, term65146.getClass(), "density", term65175);
        setBooleanField(term65146, term65146.getClass(), "directed", false);
        setBooleanField(term65146, term65146.getClass(), "allowingSelfLoops", true);
        setBooleanField(term65146, term65146.getClass(), "allowingMultiEdges", false);
        setIntField(term65146, term65146.getClass(), "vertexDataSize", 1);
        setIntField(term65146, term65146.getClass(), "edgeDataSize", 3);
        setField(term65146, term65146.getClass(), "name", "onQLVONGuf");
        setField(term65146, term65146.getClass(), "edges", term65194);
        setField(term65146, term65146.getClass(), "paths", term65198);
        setField(term65146, term65146.getClass(), "cycles", term65202);
        setField(term65146, term65146.getClass(), "cliques", term65206);
        term65210 = new Long(8403492202041709902L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term65210;
        callMethod(klass, "estimatedNumEdges", argTypes, term65146, args);
    }

};


