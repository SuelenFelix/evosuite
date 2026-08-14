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

public class NetworkBuilder_vertexDataSize_77168926415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65314;
     Object term65375;

    public NetworkBuilder_vertexDataSize_77168926415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65320 = new ArrayList();
        HashMap term65324 = new HashMap();
        HashMap term65329 = new HashMap();
        Integer term65334 = new Integer(-1239406390);
        Long term65336 = new Long(4872422362414183754L);
        Integer term65338 = new Integer(1557431527);
        Double term65340 = new Double(0.9526973682054863);
        ArrayList term65359 = new ArrayList();
        ArrayList term65363 = new ArrayList();
        ArrayList term65367 = new ArrayList();
        ArrayList term65371 = new ArrayList();
        term65314 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term65317 = (int[]) newIntArray(2);
        setIntField(term65314, term65314.getClass(), "source", -1);
        setIntField(term65314, term65314.getClass(), "sink", -1);
        setIntElement(term65317, 0, -11818194);
        setIntElement(term65317, 1, 1019156814);
        setField(term65314, term65314.getClass(), "vertices", term65317);
        setField(term65314, term65314.getClass(), "dynamicVertices", term65320);
        setField(term65314, term65314.getClass(), "vertexLabelMap", term65324);
        setField(term65314, term65314.getClass(), "vertexWeightMap", term65329);
        setField(term65314, term65314.getClass(), "maxVertices", term65334);
        setField(term65314, term65314.getClass(), "numEdges", term65336);
        setField(term65314, term65314.getClass(), "avgDegree", term65338);
        setField(term65314, term65314.getClass(), "density", term65340);
        setBooleanField(term65314, term65314.getClass(), "directed", false);
        setBooleanField(term65314, term65314.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65314, term65314.getClass(), "allowingMultiEdges", false);
        setIntField(term65314, term65314.getClass(), "vertexDataSize", 1);
        setIntField(term65314, term65314.getClass(), "edgeDataSize", 3);
        setField(term65314, term65314.getClass(), "name", "bnsyeQXFdu");
        setField(term65314, term65314.getClass(), "edges", term65359);
        setField(term65314, term65314.getClass(), "paths", term65363);
        setField(term65314, term65314.getClass(), "cycles", term65367);
        setField(term65314, term65314.getClass(), "cliques", term65371);
        term65375 = new Integer(-1002505764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65375;
        callMethod(klass, "vertexDataSize", argTypes, term65314, args);
    }

};


