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

public class NetworkBuilder_estimatedDensity_206317862811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64973;
     Object term65038;

    public NetworkBuilder_estimatedDensity_206317862811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term64983 = new ArrayList();
        HashMap term64987 = new HashMap();
        HashMap term64992 = new HashMap();
        Integer term64997 = new Integer(-1274456137);
        Long term64999 = new Long(-8257434502486459194L);
        Integer term65001 = new Integer(1041916673);
        Double term65003 = new Double(0.46840044557462845);
        ArrayList term65022 = new ArrayList();
        ArrayList term65026 = new ArrayList();
        ArrayList term65030 = new ArrayList();
        ArrayList term65034 = new ArrayList();
        term64973 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term64976 = (int[]) newIntArray(6);
        setIntField(term64973, term64973.getClass(), "source", -1);
        setIntField(term64973, term64973.getClass(), "sink", -1);
        setIntElement(term64976, 0, 1134100864);
        setIntElement(term64976, 1, -932647893);
        setIntElement(term64976, 2, 1309643294);
        setIntElement(term64976, 3, -1829760689);
        setIntElement(term64976, 4, -2114174447);
        setIntElement(term64976, 5, 1848057539);
        setField(term64973, term64973.getClass(), "vertices", term64976);
        setField(term64973, term64973.getClass(), "dynamicVertices", term64983);
        setField(term64973, term64973.getClass(), "vertexLabelMap", term64987);
        setField(term64973, term64973.getClass(), "vertexWeightMap", term64992);
        setField(term64973, term64973.getClass(), "maxVertices", term64997);
        setField(term64973, term64973.getClass(), "numEdges", term64999);
        setField(term64973, term64973.getClass(), "avgDegree", term65001);
        setField(term64973, term64973.getClass(), "density", term65003);
        setBooleanField(term64973, term64973.getClass(), "directed", false);
        setBooleanField(term64973, term64973.getClass(), "allowingSelfLoops", true);
        setBooleanField(term64973, term64973.getClass(), "allowingMultiEdges", false);
        setIntField(term64973, term64973.getClass(), "vertexDataSize", 1);
        setIntField(term64973, term64973.getClass(), "edgeDataSize", 3);
        setField(term64973, term64973.getClass(), "name", "beAMpkroCQ");
        setField(term64973, term64973.getClass(), "edges", term65022);
        setField(term64973, term64973.getClass(), "paths", term65026);
        setField(term64973, term64973.getClass(), "cycles", term65030);
        setField(term64973, term64973.getClass(), "cliques", term65034);
        term65038 = new Double(0.44395757139224357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term65038;
        callMethod(klass, "estimatedDensity", argTypes, term64973, args);
    }

};


