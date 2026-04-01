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

public class GraphBuilder_addPath_112637923918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179697;
     Object term179758;

    public GraphBuilder_addPath_112637923918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179703 = new ArrayList();
        HashMap term179707 = new HashMap();
        HashMap term179712 = new HashMap();
        Integer term179717 = new Integer(-1381970335);
        Long term179719 = new Long(8059786003080744426L);
        Integer term179721 = new Integer(1213549815);
        Double term179723 = new Double(0.12050867706763113);
        ArrayList term179742 = new ArrayList();
        ArrayList term179746 = new ArrayList();
        ArrayList term179750 = new ArrayList();
        ArrayList term179754 = new ArrayList();
        term179697 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179698 = (int[]) newIntArray(4);
        setIntElement(term179698, 0, 522240740);
        setIntElement(term179698, 1, 1399305625);
        setIntElement(term179698, 2, 121978237);
        setIntElement(term179698, 3, -1149211828);
        setField(term179697, term179697.getClass(), "vertices", term179698);
        setField(term179697, term179697.getClass(), "dynamicVertices", term179703);
        setField(term179697, term179697.getClass(), "vertexLabelMap", term179707);
        setField(term179697, term179697.getClass(), "vertexWeightMap", term179712);
        setField(term179697, term179697.getClass(), "maxVertices", term179717);
        setField(term179697, term179697.getClass(), "numEdges", term179719);
        setField(term179697, term179697.getClass(), "avgDegree", term179721);
        setField(term179697, term179697.getClass(), "density", term179723);
        setBooleanField(term179697, term179697.getClass(), "directed", false);
        setBooleanField(term179697, term179697.getClass(), "allowingSelfLoops", true);
        setBooleanField(term179697, term179697.getClass(), "allowingMultiEdges", true);
        setIntField(term179697, term179697.getClass(), "vertexDataSize", 1);
        setIntField(term179697, term179697.getClass(), "edgeDataSize", 1);
        setField(term179697, term179697.getClass(), "name", "EULDrUNQvw");
        setField(term179697, term179697.getClass(), "edges", term179742);
        setField(term179697, term179697.getClass(), "paths", term179746);
        setField(term179697, term179697.getClass(), "cycles", term179750);
        setField(term179697, term179697.getClass(), "cliques", term179754);
        term179758 = (int[]) newIntArray(9);
        setIntElement(term179758, 0, -1303940395);
        setIntElement(term179758, 1, -1519851097);
        setIntElement(term179758, 2, 1644226589);
        setIntElement(term179758, 3, -1148749129);
        setIntElement(term179758, 4, 2130214319);
        setIntElement(term179758, 5, 771991019);
        setIntElement(term179758, 6, 165987490);
        setIntElement(term179758, 7, 277116081);
        setIntElement(term179758, 8, 917803959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term179758;
        callMethod(klass, "addPath", argTypes, term179697, args);
    }

};


