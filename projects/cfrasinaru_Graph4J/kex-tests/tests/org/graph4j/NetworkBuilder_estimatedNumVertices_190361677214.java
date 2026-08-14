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
     Object term65227;
     Object term65294;

    public NetworkBuilder_estimatedNumVertices_190361677214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65239 = new ArrayList();
        HashMap term65243 = new HashMap();
        HashMap term65248 = new HashMap();
        Integer term65253 = new Integer(-1731761810);
        Long term65255 = new Long(7411271909051562686L);
        Integer term65257 = new Integer(197109649);
        Double term65259 = new Double(0.41504405374405495);
        ArrayList term65278 = new ArrayList();
        ArrayList term65282 = new ArrayList();
        ArrayList term65286 = new ArrayList();
        ArrayList term65290 = new ArrayList();
        term65227 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term65230 = (int[]) newIntArray(8);
        setIntField(term65227, term65227.getClass(), "source", -1);
        setIntField(term65227, term65227.getClass(), "sink", -1);
        setIntElement(term65230, 0, 788083238);
        setIntElement(term65230, 1, 1054274026);
        setIntElement(term65230, 2, -1201178573);
        setIntElement(term65230, 3, -195059182);
        setIntElement(term65230, 4, 1388069057);
        setIntElement(term65230, 5, 1154352435);
        setIntElement(term65230, 6, -98467954);
        setIntElement(term65230, 7, 785520439);
        setField(term65227, term65227.getClass(), "vertices", term65230);
        setField(term65227, term65227.getClass(), "dynamicVertices", term65239);
        setField(term65227, term65227.getClass(), "vertexLabelMap", term65243);
        setField(term65227, term65227.getClass(), "vertexWeightMap", term65248);
        setField(term65227, term65227.getClass(), "maxVertices", term65253);
        setField(term65227, term65227.getClass(), "numEdges", term65255);
        setField(term65227, term65227.getClass(), "avgDegree", term65257);
        setField(term65227, term65227.getClass(), "density", term65259);
        setBooleanField(term65227, term65227.getClass(), "directed", true);
        setBooleanField(term65227, term65227.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65227, term65227.getClass(), "allowingMultiEdges", false);
        setIntField(term65227, term65227.getClass(), "vertexDataSize", 1);
        setIntField(term65227, term65227.getClass(), "edgeDataSize", 3);
        setField(term65227, term65227.getClass(), "name", "SOrEHbcbmn");
        setField(term65227, term65227.getClass(), "edges", term65278);
        setField(term65227, term65227.getClass(), "paths", term65282);
        setField(term65227, term65227.getClass(), "cycles", term65286);
        setField(term65227, term65227.getClass(), "cliques", term65290);
        term65294 = new Integer(701479074);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65294;
        callMethod(klass, "estimatedNumVertices", argTypes, term65227, args);
    }

};


