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

public class NetworkBuilder_edgeDataSize_12020266516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65389;
     Object term65453;

    public NetworkBuilder_edgeDataSize_12020266516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65398 = new ArrayList();
        HashMap term65402 = new HashMap();
        HashMap term65407 = new HashMap();
        Integer term65412 = new Integer(-1504890659);
        Long term65414 = new Long(6811161968424632369L);
        Integer term65416 = new Integer(1358829571);
        Double term65418 = new Double(0.27635065300519635);
        ArrayList term65437 = new ArrayList();
        ArrayList term65441 = new ArrayList();
        ArrayList term65445 = new ArrayList();
        ArrayList term65449 = new ArrayList();
        term65389 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term65392 = (int[]) newIntArray(5);
        setIntField(term65389, term65389.getClass(), "source", -1);
        setIntField(term65389, term65389.getClass(), "sink", -1);
        setIntElement(term65392, 0, 1521523520);
        setIntElement(term65392, 1, 464541997);
        setIntElement(term65392, 2, -241689552);
        setIntElement(term65392, 3, -1974916988);
        setIntElement(term65392, 4, -1422332940);
        setField(term65389, term65389.getClass(), "vertices", term65392);
        setField(term65389, term65389.getClass(), "dynamicVertices", term65398);
        setField(term65389, term65389.getClass(), "vertexLabelMap", term65402);
        setField(term65389, term65389.getClass(), "vertexWeightMap", term65407);
        setField(term65389, term65389.getClass(), "maxVertices", term65412);
        setField(term65389, term65389.getClass(), "numEdges", term65414);
        setField(term65389, term65389.getClass(), "avgDegree", term65416);
        setField(term65389, term65389.getClass(), "density", term65418);
        setBooleanField(term65389, term65389.getClass(), "directed", true);
        setBooleanField(term65389, term65389.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65389, term65389.getClass(), "allowingMultiEdges", false);
        setIntField(term65389, term65389.getClass(), "vertexDataSize", 1);
        setIntField(term65389, term65389.getClass(), "edgeDataSize", 3);
        setField(term65389, term65389.getClass(), "name", "BwtdjiefJn");
        setField(term65389, term65389.getClass(), "edges", term65437);
        setField(term65389, term65389.getClass(), "paths", term65441);
        setField(term65389, term65389.getClass(), "cycles", term65445);
        setField(term65389, term65389.getClass(), "cliques", term65449);
        term65453 = new Integer(-990649327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65453;
        callMethod(klass, "edgeDataSize", argTypes, term65389, args);
    }

};


