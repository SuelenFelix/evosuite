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

public class NetworkBuilder_sink_25743722819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65633;
     Object term65696;

    public NetworkBuilder_sink_25743722819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65641 = new ArrayList();
        HashMap term65645 = new HashMap();
        HashMap term65650 = new HashMap();
        Integer term65655 = new Integer(-1896376975);
        Long term65657 = new Long(-2813493605142626659L);
        Integer term65659 = new Integer(729658803);
        Double term65661 = new Double(0.9946322297398043);
        ArrayList term65680 = new ArrayList();
        ArrayList term65684 = new ArrayList();
        ArrayList term65688 = new ArrayList();
        ArrayList term65692 = new ArrayList();
        term65633 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term65636 = (int[]) newIntArray(4);
        setIntField(term65633, term65633.getClass(), "source", -1);
        setIntField(term65633, term65633.getClass(), "sink", -1);
        setIntElement(term65636, 0, 1204481493);
        setIntElement(term65636, 1, 117135344);
        setIntElement(term65636, 2, 1755958093);
        setIntElement(term65636, 3, 539487007);
        setField(term65633, term65633.getClass(), "vertices", term65636);
        setField(term65633, term65633.getClass(), "dynamicVertices", term65641);
        setField(term65633, term65633.getClass(), "vertexLabelMap", term65645);
        setField(term65633, term65633.getClass(), "vertexWeightMap", term65650);
        setField(term65633, term65633.getClass(), "maxVertices", term65655);
        setField(term65633, term65633.getClass(), "numEdges", term65657);
        setField(term65633, term65633.getClass(), "avgDegree", term65659);
        setField(term65633, term65633.getClass(), "density", term65661);
        setBooleanField(term65633, term65633.getClass(), "directed", false);
        setBooleanField(term65633, term65633.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65633, term65633.getClass(), "allowingMultiEdges", false);
        setIntField(term65633, term65633.getClass(), "vertexDataSize", 1);
        setIntField(term65633, term65633.getClass(), "edgeDataSize", 3);
        setField(term65633, term65633.getClass(), "name", "ywmcuThdfL");
        setField(term65633, term65633.getClass(), "edges", term65680);
        setField(term65633, term65633.getClass(), "paths", term65684);
        setField(term65633, term65633.getClass(), "cycles", term65688);
        setField(term65633, term65633.getClass(), "cliques", term65692);
        term65696 = new Integer(1325638563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65696;
        callMethod(klass, "sink", argTypes, term65633, args);
    }

};


