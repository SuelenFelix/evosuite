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

public class NetworkBuilder_estimatedAvgDegree_60817026912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65056;
     Object term65123;

    public NetworkBuilder_estimatedAvgDegree_60817026912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65068 = new ArrayList();
        HashMap term65072 = new HashMap();
        HashMap term65077 = new HashMap();
        Integer term65082 = new Integer(-601863069);
        Long term65084 = new Long(-8400487765614892086L);
        Integer term65086 = new Integer(663292551);
        Double term65088 = new Double(0.7757378334599976);
        ArrayList term65107 = new ArrayList();
        ArrayList term65111 = new ArrayList();
        ArrayList term65115 = new ArrayList();
        ArrayList term65119 = new ArrayList();
        term65056 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term65059 = (int[]) newIntArray(8);
        setIntField(term65056, term65056.getClass(), "source", -1);
        setIntField(term65056, term65056.getClass(), "sink", -1);
        setIntElement(term65059, 0, 1803786185);
        setIntElement(term65059, 1, 827800338);
        setIntElement(term65059, 2, -726644350);
        setIntElement(term65059, 3, -1889922089);
        setIntElement(term65059, 4, -1126162521);
        setIntElement(term65059, 5, -1937977171);
        setIntElement(term65059, 6, -1393512773);
        setIntElement(term65059, 7, -766556211);
        setField(term65056, term65056.getClass(), "vertices", term65059);
        setField(term65056, term65056.getClass(), "dynamicVertices", term65068);
        setField(term65056, term65056.getClass(), "vertexLabelMap", term65072);
        setField(term65056, term65056.getClass(), "vertexWeightMap", term65077);
        setField(term65056, term65056.getClass(), "maxVertices", term65082);
        setField(term65056, term65056.getClass(), "numEdges", term65084);
        setField(term65056, term65056.getClass(), "avgDegree", term65086);
        setField(term65056, term65056.getClass(), "density", term65088);
        setBooleanField(term65056, term65056.getClass(), "directed", true);
        setBooleanField(term65056, term65056.getClass(), "allowingSelfLoops", true);
        setBooleanField(term65056, term65056.getClass(), "allowingMultiEdges", false);
        setIntField(term65056, term65056.getClass(), "vertexDataSize", 1);
        setIntField(term65056, term65056.getClass(), "edgeDataSize", 3);
        setField(term65056, term65056.getClass(), "name", "uSUvKAyuvd");
        setField(term65056, term65056.getClass(), "edges", term65107);
        setField(term65056, term65056.getClass(), "paths", term65111);
        setField(term65056, term65056.getClass(), "cycles", term65115);
        setField(term65056, term65056.getClass(), "cliques", term65119);
        term65123 = new Integer(-362370868);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65123;
        callMethod(klass, "estimatedAvgDegree", argTypes, term65056, args);
    }

};


