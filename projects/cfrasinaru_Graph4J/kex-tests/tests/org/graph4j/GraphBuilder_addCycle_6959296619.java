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

public class GraphBuilder_addCycle_6959296619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179791;
     Object term179848;

    public GraphBuilder_addCycle_6959296619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179793 = new ArrayList();
        HashMap term179797 = new HashMap();
        HashMap term179802 = new HashMap();
        Integer term179807 = new Integer(-1518419301);
        Long term179809 = new Long(-4365849114644724155L);
        Integer term179811 = new Integer(674879025);
        Double term179813 = new Double(0.2795767463906592);
        ArrayList term179832 = new ArrayList();
        ArrayList term179836 = new ArrayList();
        ArrayList term179840 = new ArrayList();
        ArrayList term179844 = new ArrayList();
        term179791 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179792 = (int[]) newIntArray(0);
        setField(term179791, term179791.getClass(), "vertices", term179792);
        setField(term179791, term179791.getClass(), "dynamicVertices", term179793);
        setField(term179791, term179791.getClass(), "vertexLabelMap", term179797);
        setField(term179791, term179791.getClass(), "vertexWeightMap", term179802);
        setField(term179791, term179791.getClass(), "maxVertices", term179807);
        setField(term179791, term179791.getClass(), "numEdges", term179809);
        setField(term179791, term179791.getClass(), "avgDegree", term179811);
        setField(term179791, term179791.getClass(), "density", term179813);
        setBooleanField(term179791, term179791.getClass(), "directed", true);
        setBooleanField(term179791, term179791.getClass(), "allowingSelfLoops", false);
        setBooleanField(term179791, term179791.getClass(), "allowingMultiEdges", true);
        setIntField(term179791, term179791.getClass(), "vertexDataSize", 1);
        setIntField(term179791, term179791.getClass(), "edgeDataSize", 1);
        setField(term179791, term179791.getClass(), "name", "BtvAvsJSei");
        setField(term179791, term179791.getClass(), "edges", term179832);
        setField(term179791, term179791.getClass(), "paths", term179836);
        setField(term179791, term179791.getClass(), "cycles", term179840);
        setField(term179791, term179791.getClass(), "cliques", term179844);
        term179848 = (int[]) newIntArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term179848;
        callMethod(klass, "addCycle", argTypes, term179791, args);
    }

};


