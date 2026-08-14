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
     Object term179630;
     Object term179689;

    public GraphBuilder_addEdge_207672810817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179634 = new ArrayList();
        HashMap term179638 = new HashMap();
        HashMap term179643 = new HashMap();
        Integer term179648 = new Integer(-865722613);
        Long term179650 = new Long(-2585684163342970173L);
        Integer term179652 = new Integer(-1551355284);
        Double term179654 = new Double(0.31719976855652887);
        ArrayList term179673 = new ArrayList();
        ArrayList term179677 = new ArrayList();
        ArrayList term179681 = new ArrayList();
        ArrayList term179685 = new ArrayList();
        term179630 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179631 = (int[]) newIntArray(2);
        setIntElement(term179631, 0, -1554014085);
        setIntElement(term179631, 1, 1182831682);
        setField(term179630, term179630.getClass(), "vertices", term179631);
        setField(term179630, term179630.getClass(), "dynamicVertices", term179634);
        setField(term179630, term179630.getClass(), "vertexLabelMap", term179638);
        setField(term179630, term179630.getClass(), "vertexWeightMap", term179643);
        setField(term179630, term179630.getClass(), "maxVertices", term179648);
        setField(term179630, term179630.getClass(), "numEdges", term179650);
        setField(term179630, term179630.getClass(), "avgDegree", term179652);
        setField(term179630, term179630.getClass(), "density", term179654);
        setBooleanField(term179630, term179630.getClass(), "directed", true);
        setBooleanField(term179630, term179630.getClass(), "allowingSelfLoops", false);
        setBooleanField(term179630, term179630.getClass(), "allowingMultiEdges", true);
        setIntField(term179630, term179630.getClass(), "vertexDataSize", 1);
        setIntField(term179630, term179630.getClass(), "edgeDataSize", 1);
        setField(term179630, term179630.getClass(), "name", "ZUdnQXfzCI");
        setField(term179630, term179630.getClass(), "edges", term179673);
        setField(term179630, term179630.getClass(), "paths", term179677);
        setField(term179630, term179630.getClass(), "cycles", term179681);
        setField(term179630, term179630.getClass(), "cliques", term179685);
        Double term179694 = new Double(0.28228225836791543);
        term179689 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term179693 = (Object[]) newArray("java.lang.Double", 1);
        setBooleanField(term179689, term179689.getClass(), "directed", false);
        setIntField(term179689, term179689.getClass(), "source", 285622712);
        setIntField(term179689, term179689.getClass(), "target", 5352330);
        setElement(term179693, 0, term179694);
        setField(term179689, term179689.getClass(), "data", term179693);
        setField(term179689, term179689.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term179689;
        callMethod(klass, "addEdge", argTypes, term179630, args);
    }

};


