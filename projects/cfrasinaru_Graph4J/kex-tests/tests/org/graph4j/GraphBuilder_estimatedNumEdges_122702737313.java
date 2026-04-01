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
     Object term179297;
     Object term179363;

    public GraphBuilder_estimatedNumEdges_122702737313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179308 = new ArrayList();
        HashMap term179312 = new HashMap();
        HashMap term179317 = new HashMap();
        Integer term179322 = new Integer(1470349147);
        Long term179324 = new Long(5127676408959197577L);
        Integer term179326 = new Integer(-255317272);
        Double term179328 = new Double(0.3561604321932451);
        ArrayList term179347 = new ArrayList();
        ArrayList term179351 = new ArrayList();
        ArrayList term179355 = new ArrayList();
        ArrayList term179359 = new ArrayList();
        term179297 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179298 = (int[]) newIntArray(9);
        setIntElement(term179298, 0, -110042645);
        setIntElement(term179298, 1, 562449770);
        setIntElement(term179298, 2, 1548288604);
        setIntElement(term179298, 3, 311434781);
        setIntElement(term179298, 4, -784532125);
        setIntElement(term179298, 5, 2073329004);
        setIntElement(term179298, 6, -2068181791);
        setIntElement(term179298, 7, 1327322315);
        setIntElement(term179298, 8, -1187469090);
        setField(term179297, term179297.getClass(), "vertices", term179298);
        setField(term179297, term179297.getClass(), "dynamicVertices", term179308);
        setField(term179297, term179297.getClass(), "vertexLabelMap", term179312);
        setField(term179297, term179297.getClass(), "vertexWeightMap", term179317);
        setField(term179297, term179297.getClass(), "maxVertices", term179322);
        setField(term179297, term179297.getClass(), "numEdges", term179324);
        setField(term179297, term179297.getClass(), "avgDegree", term179326);
        setField(term179297, term179297.getClass(), "density", term179328);
        setBooleanField(term179297, term179297.getClass(), "directed", false);
        setBooleanField(term179297, term179297.getClass(), "allowingSelfLoops", true);
        setBooleanField(term179297, term179297.getClass(), "allowingMultiEdges", false);
        setIntField(term179297, term179297.getClass(), "vertexDataSize", 1);
        setIntField(term179297, term179297.getClass(), "edgeDataSize", 1);
        setField(term179297, term179297.getClass(), "name", "XtiurrVYKw");
        setField(term179297, term179297.getClass(), "edges", term179347);
        setField(term179297, term179297.getClass(), "paths", term179351);
        setField(term179297, term179297.getClass(), "cycles", term179355);
        setField(term179297, term179297.getClass(), "cliques", term179359);
        term179363 = new Long(-4146453776626172590L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term179363;
        callMethod(klass, "estimatedNumEdges", argTypes, term179297, args);
    }

};


