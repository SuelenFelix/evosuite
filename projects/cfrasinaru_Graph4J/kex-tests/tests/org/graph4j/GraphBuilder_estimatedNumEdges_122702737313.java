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

public class GraphBuilder_estimatedNumEdges_122702737313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179308;
     Object term179374;

    public GraphBuilder_estimatedNumEdges_122702737313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179319 = new ArrayList();
        HashMap term179323 = new HashMap();
        HashMap term179328 = new HashMap();
        Integer term179333 = new Integer(1470349147);
        Long term179335 = new Long(5127676408959197577L);
        Integer term179337 = new Integer(-255317272);
        Double term179339 = new Double(0.3561604321932451);
        ArrayList term179358 = new ArrayList();
        ArrayList term179362 = new ArrayList();
        ArrayList term179366 = new ArrayList();
        ArrayList term179370 = new ArrayList();
        term179308 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179309 = (int[]) newIntArray(9);
        setIntElement(term179309, 0, -110042645);
        setIntElement(term179309, 1, 562449770);
        setIntElement(term179309, 2, 1548288604);
        setIntElement(term179309, 3, 311434781);
        setIntElement(term179309, 4, -784532125);
        setIntElement(term179309, 5, 2073329004);
        setIntElement(term179309, 6, -2068181791);
        setIntElement(term179309, 7, 1327322315);
        setIntElement(term179309, 8, -1187469090);
        setField(term179308, term179308.getClass(), "vertices", term179309);
        setField(term179308, term179308.getClass(), "dynamicVertices", term179319);
        setField(term179308, term179308.getClass(), "vertexLabelMap", term179323);
        setField(term179308, term179308.getClass(), "vertexWeightMap", term179328);
        setField(term179308, term179308.getClass(), "maxVertices", term179333);
        setField(term179308, term179308.getClass(), "numEdges", term179335);
        setField(term179308, term179308.getClass(), "avgDegree", term179337);
        setField(term179308, term179308.getClass(), "density", term179339);
        setBooleanField(term179308, term179308.getClass(), "directed", false);
        setBooleanField(term179308, term179308.getClass(), "allowingSelfLoops", true);
        setBooleanField(term179308, term179308.getClass(), "allowingMultiEdges", false);
        setIntField(term179308, term179308.getClass(), "vertexDataSize", 1);
        setIntField(term179308, term179308.getClass(), "edgeDataSize", 1);
        setField(term179308, term179308.getClass(), "name", "XtiurrVYKw");
        setField(term179308, term179308.getClass(), "edges", term179358);
        setField(term179308, term179308.getClass(), "paths", term179362);
        setField(term179308, term179308.getClass(), "cycles", term179366);
        setField(term179308, term179308.getClass(), "cliques", term179370);
        term179374 = new Long(-4146453776626172590L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term179374;
        callMethod(klass, "estimatedNumEdges", argTypes, term179308, args);
    }

};


