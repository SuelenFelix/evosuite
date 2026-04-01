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
     Object term65386;
     Object term65450;

    public NetworkBuilder_edgeDataSize_12020266516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65395 = new ArrayList();
        HashMap term65399 = new HashMap();
        HashMap term65404 = new HashMap();
        Integer term65409 = new Integer(-1504890659);
        Long term65411 = new Long(6811161968424632369L);
        Integer term65413 = new Integer(1358829571);
        Double term65415 = new Double(0.27635065300519635);
        ArrayList term65434 = new ArrayList();
        ArrayList term65438 = new ArrayList();
        ArrayList term65442 = new ArrayList();
        ArrayList term65446 = new ArrayList();
        term65386 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term65389 = (int[]) newIntArray(5);
        setIntField(term65386, term65386.getClass(), "source", -1);
        setIntField(term65386, term65386.getClass(), "sink", -1);
        setIntElement(term65389, 0, 1521523520);
        setIntElement(term65389, 1, 464541997);
        setIntElement(term65389, 2, -241689552);
        setIntElement(term65389, 3, -1974916988);
        setIntElement(term65389, 4, -1422332940);
        setField(term65386, term65386.getClass(), "vertices", term65389);
        setField(term65386, term65386.getClass(), "dynamicVertices", term65395);
        setField(term65386, term65386.getClass(), "vertexLabelMap", term65399);
        setField(term65386, term65386.getClass(), "vertexWeightMap", term65404);
        setField(term65386, term65386.getClass(), "maxVertices", term65409);
        setField(term65386, term65386.getClass(), "numEdges", term65411);
        setField(term65386, term65386.getClass(), "avgDegree", term65413);
        setField(term65386, term65386.getClass(), "density", term65415);
        setBooleanField(term65386, term65386.getClass(), "directed", true);
        setBooleanField(term65386, term65386.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65386, term65386.getClass(), "allowingMultiEdges", false);
        setIntField(term65386, term65386.getClass(), "vertexDataSize", 1);
        setIntField(term65386, term65386.getClass(), "edgeDataSize", 3);
        setField(term65386, term65386.getClass(), "name", "BwtdjiefJn");
        setField(term65386, term65386.getClass(), "edges", term65434);
        setField(term65386, term65386.getClass(), "paths", term65438);
        setField(term65386, term65386.getClass(), "cycles", term65442);
        setField(term65386, term65386.getClass(), "cliques", term65446);
        term65450 = new Integer(-990649327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65450;
        callMethod(klass, "edgeDataSize", argTypes, term65386, args);
    }

};


