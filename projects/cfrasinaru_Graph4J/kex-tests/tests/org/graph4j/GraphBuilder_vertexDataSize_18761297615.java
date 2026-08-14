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
     Object term179476;
     Object term179538;

    public GraphBuilder_vertexDataSize_18761297615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179483 = new ArrayList();
        HashMap term179487 = new HashMap();
        HashMap term179492 = new HashMap();
        Integer term179497 = new Integer(-728760750);
        Long term179499 = new Long(-4920224193275732920L);
        Integer term179501 = new Integer(-1617383807);
        Double term179503 = new Double(0.7242321641218272);
        ArrayList term179522 = new ArrayList();
        ArrayList term179526 = new ArrayList();
        ArrayList term179530 = new ArrayList();
        ArrayList term179534 = new ArrayList();
        term179476 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179477 = (int[]) newIntArray(5);
        setIntElement(term179477, 0, -311729640);
        setIntElement(term179477, 1, 547989693);
        setIntElement(term179477, 2, -2023673822);
        setIntElement(term179477, 3, -2125729734);
        setIntElement(term179477, 4, 307512938);
        setField(term179476, term179476.getClass(), "vertices", term179477);
        setField(term179476, term179476.getClass(), "dynamicVertices", term179483);
        setField(term179476, term179476.getClass(), "vertexLabelMap", term179487);
        setField(term179476, term179476.getClass(), "vertexWeightMap", term179492);
        setField(term179476, term179476.getClass(), "maxVertices", term179497);
        setField(term179476, term179476.getClass(), "numEdges", term179499);
        setField(term179476, term179476.getClass(), "avgDegree", term179501);
        setField(term179476, term179476.getClass(), "density", term179503);
        setBooleanField(term179476, term179476.getClass(), "directed", false);
        setBooleanField(term179476, term179476.getClass(), "allowingSelfLoops", true);
        setBooleanField(term179476, term179476.getClass(), "allowingMultiEdges", false);
        setIntField(term179476, term179476.getClass(), "vertexDataSize", 1);
        setIntField(term179476, term179476.getClass(), "edgeDataSize", 1);
        setField(term179476, term179476.getClass(), "name", "ceCWHUTQUM");
        setField(term179476, term179476.getClass(), "edges", term179522);
        setField(term179476, term179476.getClass(), "paths", term179526);
        setField(term179476, term179476.getClass(), "cycles", term179530);
        setField(term179476, term179476.getClass(), "cliques", term179534);
        term179538 = new Integer(-1497032076);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term179538;
        callMethod(klass, "vertexDataSize", argTypes, term179476, args);
    }

};


