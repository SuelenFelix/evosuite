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
import java.lang.Object;

public class GraphBuilder_addEdge_207672810817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179619;
     Object term179678;

    public GraphBuilder_addEdge_207672810817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179623 = new ArrayList();
        HashMap term179627 = new HashMap();
        HashMap term179632 = new HashMap();
        Integer term179637 = new Integer(-865722613);
        Long term179639 = new Long(-2585684163342970173L);
        Integer term179641 = new Integer(-1551355284);
        Double term179643 = new Double(0.31719976855652887);
        ArrayList term179662 = new ArrayList();
        ArrayList term179666 = new ArrayList();
        ArrayList term179670 = new ArrayList();
        ArrayList term179674 = new ArrayList();
        term179619 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179620 = (int[]) newIntArray(2);
        setIntElement(term179620, 0, -1554014085);
        setIntElement(term179620, 1, 1182831682);
        setField(term179619, term179619.getClass(), "vertices", term179620);
        setField(term179619, term179619.getClass(), "dynamicVertices", term179623);
        setField(term179619, term179619.getClass(), "vertexLabelMap", term179627);
        setField(term179619, term179619.getClass(), "vertexWeightMap", term179632);
        setField(term179619, term179619.getClass(), "maxVertices", term179637);
        setField(term179619, term179619.getClass(), "numEdges", term179639);
        setField(term179619, term179619.getClass(), "avgDegree", term179641);
        setField(term179619, term179619.getClass(), "density", term179643);
        setBooleanField(term179619, term179619.getClass(), "directed", true);
        setBooleanField(term179619, term179619.getClass(), "allowingSelfLoops", false);
        setBooleanField(term179619, term179619.getClass(), "allowingMultiEdges", true);
        setIntField(term179619, term179619.getClass(), "vertexDataSize", 1);
        setIntField(term179619, term179619.getClass(), "edgeDataSize", 1);
        setField(term179619, term179619.getClass(), "name", "ZUdnQXfzCI");
        setField(term179619, term179619.getClass(), "edges", term179662);
        setField(term179619, term179619.getClass(), "paths", term179666);
        setField(term179619, term179619.getClass(), "cycles", term179670);
        setField(term179619, term179619.getClass(), "cliques", term179674);
        Double term179683 = new Double(0.28228225836791543);
        term179678 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term179682 = (Object[]) newArray("java.lang.Double", 1);
        setBooleanField(term179678, term179678.getClass(), "directed", false);
        setIntField(term179678, term179678.getClass(), "source", 285622712);
        setIntField(term179678, term179678.getClass(), "target", 5352330);
        setElement(term179682, 0, term179683);
        setField(term179678, term179678.getClass(), "data", term179682);
        setField(term179678, term179678.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term179678;
        callMethod(klass, "addEdge", argTypes, term179619, args);
    }

};


