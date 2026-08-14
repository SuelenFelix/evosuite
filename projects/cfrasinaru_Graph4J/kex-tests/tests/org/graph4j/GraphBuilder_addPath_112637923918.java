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
     Object term179708;
     Object term179769;

    public GraphBuilder_addPath_112637923918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179714 = new ArrayList();
        HashMap term179718 = new HashMap();
        HashMap term179723 = new HashMap();
        Integer term179728 = new Integer(-1381970335);
        Long term179730 = new Long(8059786003080744426L);
        Integer term179732 = new Integer(1213549815);
        Double term179734 = new Double(0.12050867706763113);
        ArrayList term179753 = new ArrayList();
        ArrayList term179757 = new ArrayList();
        ArrayList term179761 = new ArrayList();
        ArrayList term179765 = new ArrayList();
        term179708 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179709 = (int[]) newIntArray(4);
        setIntElement(term179709, 0, 522240740);
        setIntElement(term179709, 1, 1399305625);
        setIntElement(term179709, 2, 121978237);
        setIntElement(term179709, 3, -1149211828);
        setField(term179708, term179708.getClass(), "vertices", term179709);
        setField(term179708, term179708.getClass(), "dynamicVertices", term179714);
        setField(term179708, term179708.getClass(), "vertexLabelMap", term179718);
        setField(term179708, term179708.getClass(), "vertexWeightMap", term179723);
        setField(term179708, term179708.getClass(), "maxVertices", term179728);
        setField(term179708, term179708.getClass(), "numEdges", term179730);
        setField(term179708, term179708.getClass(), "avgDegree", term179732);
        setField(term179708, term179708.getClass(), "density", term179734);
        setBooleanField(term179708, term179708.getClass(), "directed", false);
        setBooleanField(term179708, term179708.getClass(), "allowingSelfLoops", true);
        setBooleanField(term179708, term179708.getClass(), "allowingMultiEdges", true);
        setIntField(term179708, term179708.getClass(), "vertexDataSize", 1);
        setIntField(term179708, term179708.getClass(), "edgeDataSize", 1);
        setField(term179708, term179708.getClass(), "name", "EULDrUNQvw");
        setField(term179708, term179708.getClass(), "edges", term179753);
        setField(term179708, term179708.getClass(), "paths", term179757);
        setField(term179708, term179708.getClass(), "cycles", term179761);
        setField(term179708, term179708.getClass(), "cliques", term179765);
        term179769 = (int[]) newIntArray(9);
        setIntElement(term179769, 0, -1303940395);
        setIntElement(term179769, 1, -1519851097);
        setIntElement(term179769, 2, 1644226589);
        setIntElement(term179769, 3, -1148749129);
        setIntElement(term179769, 4, 2130214319);
        setIntElement(term179769, 5, 771991019);
        setIntElement(term179769, 6, 165987490);
        setIntElement(term179769, 7, 277116081);
        setIntElement(term179769, 8, 917803959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term179769;
        callMethod(klass, "addPath", argTypes, term179708, args);
    }

};


