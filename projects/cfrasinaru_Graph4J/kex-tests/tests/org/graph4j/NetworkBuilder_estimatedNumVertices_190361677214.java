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

public class NetworkBuilder_estimatedNumVertices_190361677214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65224;
     Object term65291;

    public NetworkBuilder_estimatedNumVertices_190361677214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65236 = new ArrayList();
        HashMap term65240 = new HashMap();
        HashMap term65245 = new HashMap();
        Integer term65250 = new Integer(-1731761810);
        Long term65252 = new Long(7411271909051562686L);
        Integer term65254 = new Integer(197109649);
        Double term65256 = new Double(0.41504405374405495);
        ArrayList term65275 = new ArrayList();
        ArrayList term65279 = new ArrayList();
        ArrayList term65283 = new ArrayList();
        ArrayList term65287 = new ArrayList();
        term65224 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term65227 = (int[]) newIntArray(8);
        setIntField(term65224, term65224.getClass(), "source", -1);
        setIntField(term65224, term65224.getClass(), "sink", -1);
        setIntElement(term65227, 0, 788083238);
        setIntElement(term65227, 1, 1054274026);
        setIntElement(term65227, 2, -1201178573);
        setIntElement(term65227, 3, -195059182);
        setIntElement(term65227, 4, 1388069057);
        setIntElement(term65227, 5, 1154352435);
        setIntElement(term65227, 6, -98467954);
        setIntElement(term65227, 7, 785520439);
        setField(term65224, term65224.getClass(), "vertices", term65227);
        setField(term65224, term65224.getClass(), "dynamicVertices", term65236);
        setField(term65224, term65224.getClass(), "vertexLabelMap", term65240);
        setField(term65224, term65224.getClass(), "vertexWeightMap", term65245);
        setField(term65224, term65224.getClass(), "maxVertices", term65250);
        setField(term65224, term65224.getClass(), "numEdges", term65252);
        setField(term65224, term65224.getClass(), "avgDegree", term65254);
        setField(term65224, term65224.getClass(), "density", term65256);
        setBooleanField(term65224, term65224.getClass(), "directed", true);
        setBooleanField(term65224, term65224.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65224, term65224.getClass(), "allowingMultiEdges", false);
        setIntField(term65224, term65224.getClass(), "vertexDataSize", 1);
        setIntField(term65224, term65224.getClass(), "edgeDataSize", 3);
        setField(term65224, term65224.getClass(), "name", "SOrEHbcbmn");
        setField(term65224, term65224.getClass(), "edges", term65275);
        setField(term65224, term65224.getClass(), "paths", term65279);
        setField(term65224, term65224.getClass(), "cycles", term65283);
        setField(term65224, term65224.getClass(), "cliques", term65287);
        term65291 = new Integer(701479074);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65291;
        callMethod(klass, "estimatedNumVertices", argTypes, term65224, args);
    }

};


