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
     Object term65311;
     Object term65372;

    public NetworkBuilder_vertexDataSize_77168926415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65317 = new ArrayList();
        HashMap term65321 = new HashMap();
        HashMap term65326 = new HashMap();
        Integer term65331 = new Integer(-1239406390);
        Long term65333 = new Long(4872422362414183754L);
        Integer term65335 = new Integer(1557431527);
        Double term65337 = new Double(0.9526973682054863);
        ArrayList term65356 = new ArrayList();
        ArrayList term65360 = new ArrayList();
        ArrayList term65364 = new ArrayList();
        ArrayList term65368 = new ArrayList();
        term65311 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term65314 = (int[]) newIntArray(2);
        setIntField(term65311, term65311.getClass(), "source", -1);
        setIntField(term65311, term65311.getClass(), "sink", -1);
        setIntElement(term65314, 0, -11818194);
        setIntElement(term65314, 1, 1019156814);
        setField(term65311, term65311.getClass(), "vertices", term65314);
        setField(term65311, term65311.getClass(), "dynamicVertices", term65317);
        setField(term65311, term65311.getClass(), "vertexLabelMap", term65321);
        setField(term65311, term65311.getClass(), "vertexWeightMap", term65326);
        setField(term65311, term65311.getClass(), "maxVertices", term65331);
        setField(term65311, term65311.getClass(), "numEdges", term65333);
        setField(term65311, term65311.getClass(), "avgDegree", term65335);
        setField(term65311, term65311.getClass(), "density", term65337);
        setBooleanField(term65311, term65311.getClass(), "directed", false);
        setBooleanField(term65311, term65311.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65311, term65311.getClass(), "allowingMultiEdges", false);
        setIntField(term65311, term65311.getClass(), "vertexDataSize", 1);
        setIntField(term65311, term65311.getClass(), "edgeDataSize", 3);
        setField(term65311, term65311.getClass(), "name", "bnsyeQXFdu");
        setField(term65311, term65311.getClass(), "edges", term65356);
        setField(term65311, term65311.getClass(), "paths", term65360);
        setField(term65311, term65311.getClass(), "cycles", term65364);
        setField(term65311, term65311.getClass(), "cliques", term65368);
        term65372 = new Integer(-1002505764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65372;
        callMethod(klass, "vertexDataSize", argTypes, term65311, args);
    }

};


