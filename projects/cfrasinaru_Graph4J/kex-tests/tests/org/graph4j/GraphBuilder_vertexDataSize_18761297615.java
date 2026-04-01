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

public class GraphBuilder_vertexDataSize_18761297615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179465;
     Object term179527;

    public GraphBuilder_vertexDataSize_18761297615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179472 = new ArrayList();
        HashMap term179476 = new HashMap();
        HashMap term179481 = new HashMap();
        Integer term179486 = new Integer(-728760750);
        Long term179488 = new Long(-4920224193275732920L);
        Integer term179490 = new Integer(-1617383807);
        Double term179492 = new Double(0.7242321641218272);
        ArrayList term179511 = new ArrayList();
        ArrayList term179515 = new ArrayList();
        ArrayList term179519 = new ArrayList();
        ArrayList term179523 = new ArrayList();
        term179465 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179466 = (int[]) newIntArray(5);
        setIntElement(term179466, 0, -311729640);
        setIntElement(term179466, 1, 547989693);
        setIntElement(term179466, 2, -2023673822);
        setIntElement(term179466, 3, -2125729734);
        setIntElement(term179466, 4, 307512938);
        setField(term179465, term179465.getClass(), "vertices", term179466);
        setField(term179465, term179465.getClass(), "dynamicVertices", term179472);
        setField(term179465, term179465.getClass(), "vertexLabelMap", term179476);
        setField(term179465, term179465.getClass(), "vertexWeightMap", term179481);
        setField(term179465, term179465.getClass(), "maxVertices", term179486);
        setField(term179465, term179465.getClass(), "numEdges", term179488);
        setField(term179465, term179465.getClass(), "avgDegree", term179490);
        setField(term179465, term179465.getClass(), "density", term179492);
        setBooleanField(term179465, term179465.getClass(), "directed", false);
        setBooleanField(term179465, term179465.getClass(), "allowingSelfLoops", true);
        setBooleanField(term179465, term179465.getClass(), "allowingMultiEdges", false);
        setIntField(term179465, term179465.getClass(), "vertexDataSize", 1);
        setIntField(term179465, term179465.getClass(), "edgeDataSize", 1);
        setField(term179465, term179465.getClass(), "name", "ceCWHUTQUM");
        setField(term179465, term179465.getClass(), "edges", term179511);
        setField(term179465, term179465.getClass(), "paths", term179515);
        setField(term179465, term179465.getClass(), "cycles", term179519);
        setField(term179465, term179465.getClass(), "cliques", term179523);
        term179527 = new Integer(-1497032076);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term179527;
        callMethod(klass, "vertexDataSize", argTypes, term179465, args);
    }

};


