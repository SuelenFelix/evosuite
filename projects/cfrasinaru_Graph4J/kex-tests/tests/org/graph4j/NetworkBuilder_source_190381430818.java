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

public class NetworkBuilder_source_190381430818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65556;
     Object term65618;

    public NetworkBuilder_source_190381430818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65563 = new ArrayList();
        HashMap term65567 = new HashMap();
        HashMap term65572 = new HashMap();
        Integer term65577 = new Integer(-507387516);
        Long term65579 = new Long(6967924379644551255L);
        Integer term65581 = new Integer(-1970452551);
        Double term65583 = new Double(0.9482156027893403);
        ArrayList term65602 = new ArrayList();
        ArrayList term65606 = new ArrayList();
        ArrayList term65610 = new ArrayList();
        ArrayList term65614 = new ArrayList();
        term65556 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term65559 = (int[]) newIntArray(3);
        setIntField(term65556, term65556.getClass(), "source", -1);
        setIntField(term65556, term65556.getClass(), "sink", -1);
        setIntElement(term65559, 0, 1396745898);
        setIntElement(term65559, 1, -171687185);
        setIntElement(term65559, 2, -1808375426);
        setField(term65556, term65556.getClass(), "vertices", term65559);
        setField(term65556, term65556.getClass(), "dynamicVertices", term65563);
        setField(term65556, term65556.getClass(), "vertexLabelMap", term65567);
        setField(term65556, term65556.getClass(), "vertexWeightMap", term65572);
        setField(term65556, term65556.getClass(), "maxVertices", term65577);
        setField(term65556, term65556.getClass(), "numEdges", term65579);
        setField(term65556, term65556.getClass(), "avgDegree", term65581);
        setField(term65556, term65556.getClass(), "density", term65583);
        setBooleanField(term65556, term65556.getClass(), "directed", false);
        setBooleanField(term65556, term65556.getClass(), "allowingSelfLoops", true);
        setBooleanField(term65556, term65556.getClass(), "allowingMultiEdges", true);
        setIntField(term65556, term65556.getClass(), "vertexDataSize", 1);
        setIntField(term65556, term65556.getClass(), "edgeDataSize", 3);
        setField(term65556, term65556.getClass(), "name", "SPtPatHeOm");
        setField(term65556, term65556.getClass(), "edges", term65602);
        setField(term65556, term65556.getClass(), "paths", term65606);
        setField(term65556, term65556.getClass(), "cycles", term65610);
        setField(term65556, term65556.getClass(), "cliques", term65614);
        term65618 = new Integer(-1840652193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65618;
        callMethod(klass, "source", argTypes, term65556, args);
    }

};


