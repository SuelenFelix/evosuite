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
     Object term180442;

    public GraphBuilder_buildMultigraph_2524141827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term180445 = new ArrayList();
        HashMap term180449 = new HashMap();
        HashMap term180454 = new HashMap();
        Integer term180459 = new Integer(718742281);
        Long term180461 = new Long(-5892135042702373494L);
        Integer term180463 = new Integer(1532723756);
        Double term180465 = new Double(0.683094928461474);
        ArrayList term180484 = new ArrayList();
        ArrayList term180488 = new ArrayList();
        ArrayList term180492 = new ArrayList();
        ArrayList term180496 = new ArrayList();
        term180442 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term180443 = (int[]) newIntArray(1);
        setIntElement(term180443, 0, 77485740);
        setField(term180442, term180442.getClass(), "vertices", term180443);
        setField(term180442, term180442.getClass(), "dynamicVertices", term180445);
        setField(term180442, term180442.getClass(), "vertexLabelMap", term180449);
        setField(term180442, term180442.getClass(), "vertexWeightMap", term180454);
        setField(term180442, term180442.getClass(), "maxVertices", term180459);
        setField(term180442, term180442.getClass(), "numEdges", term180461);
        setField(term180442, term180442.getClass(), "avgDegree", term180463);
        setField(term180442, term180442.getClass(), "density", term180465);
        setBooleanField(term180442, term180442.getClass(), "directed", true);
        setBooleanField(term180442, term180442.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180442, term180442.getClass(), "allowingMultiEdges", false);
        setIntField(term180442, term180442.getClass(), "vertexDataSize", 1);
        setIntField(term180442, term180442.getClass(), "edgeDataSize", 1);
        setField(term180442, term180442.getClass(), "name", "uzmqjnOUXu");
        setField(term180442, term180442.getClass(), "edges", term180484);
        setField(term180442, term180442.getClass(), "paths", term180488);
        setField(term180442, term180442.getClass(), "cycles", term180492);
        setField(term180442, term180442.getClass(), "cliques", term180496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildMultigraph", argTypes, term180442, args);
    }

};


