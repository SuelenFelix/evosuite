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
     Object term179802;
     Object term179859;

    public GraphBuilder_addCycle_6959296619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179804 = new ArrayList();
        HashMap term179808 = new HashMap();
        HashMap term179813 = new HashMap();
        Integer term179818 = new Integer(-1518419301);
        Long term179820 = new Long(-4365849114644724155L);
        Integer term179822 = new Integer(674879025);
        Double term179824 = new Double(0.2795767463906592);
        ArrayList term179843 = new ArrayList();
        ArrayList term179847 = new ArrayList();
        ArrayList term179851 = new ArrayList();
        ArrayList term179855 = new ArrayList();
        term179802 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179803 = (int[]) newIntArray(0);
        setField(term179802, term179802.getClass(), "vertices", term179803);
        setField(term179802, term179802.getClass(), "dynamicVertices", term179804);
        setField(term179802, term179802.getClass(), "vertexLabelMap", term179808);
        setField(term179802, term179802.getClass(), "vertexWeightMap", term179813);
        setField(term179802, term179802.getClass(), "maxVertices", term179818);
        setField(term179802, term179802.getClass(), "numEdges", term179820);
        setField(term179802, term179802.getClass(), "avgDegree", term179822);
        setField(term179802, term179802.getClass(), "density", term179824);
        setBooleanField(term179802, term179802.getClass(), "directed", true);
        setBooleanField(term179802, term179802.getClass(), "allowingSelfLoops", false);
        setBooleanField(term179802, term179802.getClass(), "allowingMultiEdges", true);
        setIntField(term179802, term179802.getClass(), "vertexDataSize", 1);
        setIntField(term179802, term179802.getClass(), "edgeDataSize", 1);
        setField(term179802, term179802.getClass(), "name", "BtvAvsJSei");
        setField(term179802, term179802.getClass(), "edges", term179843);
        setField(term179802, term179802.getClass(), "paths", term179847);
        setField(term179802, term179802.getClass(), "cycles", term179851);
        setField(term179802, term179802.getClass(), "cliques", term179855);
        term179859 = (int[]) newIntArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term179859;
        callMethod(klass, "addCycle", argTypes, term179802, args);
    }

};


