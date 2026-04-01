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
     Object term180638;

    public GraphBuilder_buildDirectedPseudograph_111525149630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term180641 = new ArrayList();
        HashMap term180645 = new HashMap();
        HashMap term180650 = new HashMap();
        Integer term180655 = new Integer(-573608449);
        Long term180657 = new Long(-484994522244390100L);
        Integer term180659 = new Integer(-1660057757);
        Double term180661 = new Double(0.07126689560763755);
        ArrayList term180680 = new ArrayList();
        ArrayList term180684 = new ArrayList();
        ArrayList term180688 = new ArrayList();
        ArrayList term180692 = new ArrayList();
        term180638 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term180639 = (int[]) newIntArray(1);
        setIntElement(term180639, 0, -1502971083);
        setField(term180638, term180638.getClass(), "vertices", term180639);
        setField(term180638, term180638.getClass(), "dynamicVertices", term180641);
        setField(term180638, term180638.getClass(), "vertexLabelMap", term180645);
        setField(term180638, term180638.getClass(), "vertexWeightMap", term180650);
        setField(term180638, term180638.getClass(), "maxVertices", term180655);
        setField(term180638, term180638.getClass(), "numEdges", term180657);
        setField(term180638, term180638.getClass(), "avgDegree", term180659);
        setField(term180638, term180638.getClass(), "density", term180661);
        setBooleanField(term180638, term180638.getClass(), "directed", true);
        setBooleanField(term180638, term180638.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180638, term180638.getClass(), "allowingMultiEdges", true);
        setIntField(term180638, term180638.getClass(), "vertexDataSize", 1);
        setIntField(term180638, term180638.getClass(), "edgeDataSize", 1);
        setField(term180638, term180638.getClass(), "name", "lQFkjJUPAR");
        setField(term180638, term180638.getClass(), "edges", term180680);
        setField(term180638, term180638.getClass(), "paths", term180684);
        setField(term180638, term180638.getClass(), "cycles", term180688);
        setField(term180638, term180638.getClass(), "cliques", term180692);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildDirectedPseudograph", argTypes, term180638, args);
    }

};


