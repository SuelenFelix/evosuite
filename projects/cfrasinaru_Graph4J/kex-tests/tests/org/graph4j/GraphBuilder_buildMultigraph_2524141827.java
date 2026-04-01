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

public class GraphBuilder_buildMultigraph_2524141827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180431;

    public GraphBuilder_buildMultigraph_2524141827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term180434 = new ArrayList();
        HashMap term180438 = new HashMap();
        HashMap term180443 = new HashMap();
        Integer term180448 = new Integer(718742281);
        Long term180450 = new Long(-5892135042702373494L);
        Integer term180452 = new Integer(1532723756);
        Double term180454 = new Double(0.683094928461474);
        ArrayList term180473 = new ArrayList();
        ArrayList term180477 = new ArrayList();
        ArrayList term180481 = new ArrayList();
        ArrayList term180485 = new ArrayList();
        term180431 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term180432 = (int[]) newIntArray(1);
        setIntElement(term180432, 0, 77485740);
        setField(term180431, term180431.getClass(), "vertices", term180432);
        setField(term180431, term180431.getClass(), "dynamicVertices", term180434);
        setField(term180431, term180431.getClass(), "vertexLabelMap", term180438);
        setField(term180431, term180431.getClass(), "vertexWeightMap", term180443);
        setField(term180431, term180431.getClass(), "maxVertices", term180448);
        setField(term180431, term180431.getClass(), "numEdges", term180450);
        setField(term180431, term180431.getClass(), "avgDegree", term180452);
        setField(term180431, term180431.getClass(), "density", term180454);
        setBooleanField(term180431, term180431.getClass(), "directed", true);
        setBooleanField(term180431, term180431.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180431, term180431.getClass(), "allowingMultiEdges", false);
        setIntField(term180431, term180431.getClass(), "vertexDataSize", 1);
        setIntField(term180431, term180431.getClass(), "edgeDataSize", 1);
        setField(term180431, term180431.getClass(), "name", "uzmqjnOUXu");
        setField(term180431, term180431.getClass(), "edges", term180473);
        setField(term180431, term180431.getClass(), "paths", term180477);
        setField(term180431, term180431.getClass(), "cycles", term180481);
        setField(term180431, term180431.getClass(), "cliques", term180485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildMultigraph", argTypes, term180431, args);
    }

};


