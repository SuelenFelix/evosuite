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

public class GraphBuilder_buildPseudograph_52434842429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180582;

    public GraphBuilder_buildPseudograph_52434842429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term180584 = new ArrayList();
        HashMap term180588 = new HashMap();
        HashMap term180593 = new HashMap();
        Integer term180598 = new Integer(1414025609);
        Long term180600 = new Long(-6823727938421990489L);
        Integer term180602 = new Integer(255145822);
        Double term180604 = new Double(0.8334562199551725);
        ArrayList term180623 = new ArrayList();
        ArrayList term180627 = new ArrayList();
        ArrayList term180631 = new ArrayList();
        ArrayList term180635 = new ArrayList();
        term180582 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term180583 = (int[]) newIntArray(0);
        setField(term180582, term180582.getClass(), "vertices", term180583);
        setField(term180582, term180582.getClass(), "dynamicVertices", term180584);
        setField(term180582, term180582.getClass(), "vertexLabelMap", term180588);
        setField(term180582, term180582.getClass(), "vertexWeightMap", term180593);
        setField(term180582, term180582.getClass(), "maxVertices", term180598);
        setField(term180582, term180582.getClass(), "numEdges", term180600);
        setField(term180582, term180582.getClass(), "avgDegree", term180602);
        setField(term180582, term180582.getClass(), "density", term180604);
        setBooleanField(term180582, term180582.getClass(), "directed", false);
        setBooleanField(term180582, term180582.getClass(), "allowingSelfLoops", true);
        setBooleanField(term180582, term180582.getClass(), "allowingMultiEdges", false);
        setIntField(term180582, term180582.getClass(), "vertexDataSize", 1);
        setIntField(term180582, term180582.getClass(), "edgeDataSize", 1);
        setField(term180582, term180582.getClass(), "name", "DGRqjjdhzy");
        setField(term180582, term180582.getClass(), "edges", term180623);
        setField(term180582, term180582.getClass(), "paths", term180627);
        setField(term180582, term180582.getClass(), "cycles", term180631);
        setField(term180582, term180582.getClass(), "cliques", term180635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildPseudograph", argTypes, term180582, args);
    }

};


