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

public class GraphBuilder_buildDirectedPseudograph_111525149630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180649;

    public GraphBuilder_buildDirectedPseudograph_111525149630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term180652 = new ArrayList();
        HashMap term180656 = new HashMap();
        HashMap term180661 = new HashMap();
        Integer term180666 = new Integer(-573608449);
        Long term180668 = new Long(-484994522244390100L);
        Integer term180670 = new Integer(-1660057757);
        Double term180672 = new Double(0.07126689560763755);
        ArrayList term180691 = new ArrayList();
        ArrayList term180695 = new ArrayList();
        ArrayList term180699 = new ArrayList();
        ArrayList term180703 = new ArrayList();
        term180649 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term180650 = (int[]) newIntArray(1);
        setIntElement(term180650, 0, -1502971083);
        setField(term180649, term180649.getClass(), "vertices", term180650);
        setField(term180649, term180649.getClass(), "dynamicVertices", term180652);
        setField(term180649, term180649.getClass(), "vertexLabelMap", term180656);
        setField(term180649, term180649.getClass(), "vertexWeightMap", term180661);
        setField(term180649, term180649.getClass(), "maxVertices", term180666);
        setField(term180649, term180649.getClass(), "numEdges", term180668);
        setField(term180649, term180649.getClass(), "avgDegree", term180670);
        setField(term180649, term180649.getClass(), "density", term180672);
        setBooleanField(term180649, term180649.getClass(), "directed", true);
        setBooleanField(term180649, term180649.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180649, term180649.getClass(), "allowingMultiEdges", true);
        setIntField(term180649, term180649.getClass(), "vertexDataSize", 1);
        setIntField(term180649, term180649.getClass(), "edgeDataSize", 1);
        setField(term180649, term180649.getClass(), "name", "lQFkjJUPAR");
        setField(term180649, term180649.getClass(), "edges", term180691);
        setField(term180649, term180649.getClass(), "paths", term180695);
        setField(term180649, term180649.getClass(), "cycles", term180699);
        setField(term180649, term180649.getClass(), "cliques", term180703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildDirectedPseudograph", argTypes, term180649, args);
    }

};


