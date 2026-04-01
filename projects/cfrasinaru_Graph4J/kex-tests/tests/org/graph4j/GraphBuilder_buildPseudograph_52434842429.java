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
     Object term180571;

    public GraphBuilder_buildPseudograph_52434842429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term180573 = new ArrayList();
        HashMap term180577 = new HashMap();
        HashMap term180582 = new HashMap();
        Integer term180587 = new Integer(1414025609);
        Long term180589 = new Long(-6823727938421990489L);
        Integer term180591 = new Integer(255145822);
        Double term180593 = new Double(0.8334562199551725);
        ArrayList term180612 = new ArrayList();
        ArrayList term180616 = new ArrayList();
        ArrayList term180620 = new ArrayList();
        ArrayList term180624 = new ArrayList();
        term180571 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term180572 = (int[]) newIntArray(0);
        setField(term180571, term180571.getClass(), "vertices", term180572);
        setField(term180571, term180571.getClass(), "dynamicVertices", term180573);
        setField(term180571, term180571.getClass(), "vertexLabelMap", term180577);
        setField(term180571, term180571.getClass(), "vertexWeightMap", term180582);
        setField(term180571, term180571.getClass(), "maxVertices", term180587);
        setField(term180571, term180571.getClass(), "numEdges", term180589);
        setField(term180571, term180571.getClass(), "avgDegree", term180591);
        setField(term180571, term180571.getClass(), "density", term180593);
        setBooleanField(term180571, term180571.getClass(), "directed", false);
        setBooleanField(term180571, term180571.getClass(), "allowingSelfLoops", true);
        setBooleanField(term180571, term180571.getClass(), "allowingMultiEdges", false);
        setIntField(term180571, term180571.getClass(), "vertexDataSize", 1);
        setIntField(term180571, term180571.getClass(), "edgeDataSize", 1);
        setField(term180571, term180571.getClass(), "name", "DGRqjjdhzy");
        setField(term180571, term180571.getClass(), "edges", term180612);
        setField(term180571, term180571.getClass(), "paths", term180616);
        setField(term180571, term180571.getClass(), "cycles", term180620);
        setField(term180571, term180571.getClass(), "cliques", term180624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildPseudograph", argTypes, term180571, args);
    }

};


