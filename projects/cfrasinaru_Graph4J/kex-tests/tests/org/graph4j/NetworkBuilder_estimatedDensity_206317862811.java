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
     Object term64976;
     Object term65041;

    public NetworkBuilder_estimatedDensity_206317862811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term64986 = new ArrayList();
        HashMap term64990 = new HashMap();
        HashMap term64995 = new HashMap();
        Integer term65000 = new Integer(-1274456137);
        Long term65002 = new Long(-8257434502486459194L);
        Integer term65004 = new Integer(1041916673);
        Double term65006 = new Double(0.46840044557462845);
        ArrayList term65025 = new ArrayList();
        ArrayList term65029 = new ArrayList();
        ArrayList term65033 = new ArrayList();
        ArrayList term65037 = new ArrayList();
        term64976 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term64979 = (int[]) newIntArray(6);
        setIntField(term64976, term64976.getClass(), "source", -1);
        setIntField(term64976, term64976.getClass(), "sink", -1);
        setIntElement(term64979, 0, 1134100864);
        setIntElement(term64979, 1, -932647893);
        setIntElement(term64979, 2, 1309643294);
        setIntElement(term64979, 3, -1829760689);
        setIntElement(term64979, 4, -2114174447);
        setIntElement(term64979, 5, 1848057539);
        setField(term64976, term64976.getClass(), "vertices", term64979);
        setField(term64976, term64976.getClass(), "dynamicVertices", term64986);
        setField(term64976, term64976.getClass(), "vertexLabelMap", term64990);
        setField(term64976, term64976.getClass(), "vertexWeightMap", term64995);
        setField(term64976, term64976.getClass(), "maxVertices", term65000);
        setField(term64976, term64976.getClass(), "numEdges", term65002);
        setField(term64976, term64976.getClass(), "avgDegree", term65004);
        setField(term64976, term64976.getClass(), "density", term65006);
        setBooleanField(term64976, term64976.getClass(), "directed", false);
        setBooleanField(term64976, term64976.getClass(), "allowingSelfLoops", true);
        setBooleanField(term64976, term64976.getClass(), "allowingMultiEdges", false);
        setIntField(term64976, term64976.getClass(), "vertexDataSize", 1);
        setIntField(term64976, term64976.getClass(), "edgeDataSize", 3);
        setField(term64976, term64976.getClass(), "name", "beAMpkroCQ");
        setField(term64976, term64976.getClass(), "edges", term65025);
        setField(term64976, term64976.getClass(), "paths", term65029);
        setField(term64976, term64976.getClass(), "cycles", term65033);
        setField(term64976, term64976.getClass(), "cliques", term65037);
        term65041 = new Double(0.44395757139224357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term65041;
        callMethod(klass, "estimatedDensity", argTypes, term64976, args);
    }

};


