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

public class GraphBuilder_addEdges_109463211322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180038;

    public GraphBuilder_addEdges_109463211322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term180046 = new ArrayList();
        HashMap term180050 = new HashMap();
        HashMap term180055 = new HashMap();
        Integer term180060 = new Integer(-2069930777);
        Long term180062 = new Long(-7672528020740371001L);
        Integer term180064 = new Integer(1543696412);
        Double term180066 = new Double(0.8767322511080867);
        ArrayList term180085 = new ArrayList();
        ArrayList term180089 = new ArrayList();
        ArrayList term180093 = new ArrayList();
        ArrayList term180097 = new ArrayList();
        term180038 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term180039 = (int[]) newIntArray(6);
        setIntElement(term180039, 0, 844907985);
        setIntElement(term180039, 1, -1898237394);
        setIntElement(term180039, 2, -547073145);
        setIntElement(term180039, 3, 2047807143);
        setIntElement(term180039, 4, 957943721);
        setIntElement(term180039, 5, 108052033);
        setField(term180038, term180038.getClass(), "vertices", term180039);
        setField(term180038, term180038.getClass(), "dynamicVertices", term180046);
        setField(term180038, term180038.getClass(), "vertexLabelMap", term180050);
        setField(term180038, term180038.getClass(), "vertexWeightMap", term180055);
        setField(term180038, term180038.getClass(), "maxVertices", term180060);
        setField(term180038, term180038.getClass(), "numEdges", term180062);
        setField(term180038, term180038.getClass(), "avgDegree", term180064);
        setField(term180038, term180038.getClass(), "density", term180066);
        setBooleanField(term180038, term180038.getClass(), "directed", true);
        setBooleanField(term180038, term180038.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180038, term180038.getClass(), "allowingMultiEdges", true);
        setIntField(term180038, term180038.getClass(), "vertexDataSize", 1);
        setIntField(term180038, term180038.getClass(), "edgeDataSize", 1);
        setField(term180038, term180038.getClass(), "name", "jQWttOAiwL");
        setField(term180038, term180038.getClass(), "edges", term180085);
        setField(term180038, term180038.getClass(), "paths", term180089);
        setField(term180038, term180038.getClass(), "cycles", term180093);
        setField(term180038, term180038.getClass(), "cliques", term180097);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DzKFxEuEEC";
        callMethod(klass, "addEdges", argTypes, term180038, args);
    }

};


