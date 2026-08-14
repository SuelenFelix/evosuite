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
     Object term180049;

    public GraphBuilder_addEdges_109463211322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term180057 = new ArrayList();
        HashMap term180061 = new HashMap();
        HashMap term180066 = new HashMap();
        Integer term180071 = new Integer(-2069930777);
        Long term180073 = new Long(-7672528020740371001L);
        Integer term180075 = new Integer(1543696412);
        Double term180077 = new Double(0.8767322511080867);
        ArrayList term180096 = new ArrayList();
        ArrayList term180100 = new ArrayList();
        ArrayList term180104 = new ArrayList();
        ArrayList term180108 = new ArrayList();
        term180049 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term180050 = (int[]) newIntArray(6);
        setIntElement(term180050, 0, 844907985);
        setIntElement(term180050, 1, -1898237394);
        setIntElement(term180050, 2, -547073145);
        setIntElement(term180050, 3, 2047807143);
        setIntElement(term180050, 4, 957943721);
        setIntElement(term180050, 5, 108052033);
        setField(term180049, term180049.getClass(), "vertices", term180050);
        setField(term180049, term180049.getClass(), "dynamicVertices", term180057);
        setField(term180049, term180049.getClass(), "vertexLabelMap", term180061);
        setField(term180049, term180049.getClass(), "vertexWeightMap", term180066);
        setField(term180049, term180049.getClass(), "maxVertices", term180071);
        setField(term180049, term180049.getClass(), "numEdges", term180073);
        setField(term180049, term180049.getClass(), "avgDegree", term180075);
        setField(term180049, term180049.getClass(), "density", term180077);
        setBooleanField(term180049, term180049.getClass(), "directed", true);
        setBooleanField(term180049, term180049.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180049, term180049.getClass(), "allowingMultiEdges", true);
        setIntField(term180049, term180049.getClass(), "vertexDataSize", 1);
        setIntField(term180049, term180049.getClass(), "edgeDataSize", 1);
        setField(term180049, term180049.getClass(), "name", "jQWttOAiwL");
        setField(term180049, term180049.getClass(), "edges", term180096);
        setField(term180049, term180049.getClass(), "paths", term180100);
        setField(term180049, term180049.getClass(), "cycles", term180104);
        setField(term180049, term180049.getClass(), "cliques", term180108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DzKFxEuEEC";
        callMethod(klass, "addEdges", argTypes, term180049, args);
    }

};


