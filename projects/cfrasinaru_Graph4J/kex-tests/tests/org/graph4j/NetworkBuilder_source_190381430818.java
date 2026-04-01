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
     Object term65553;
     Object term65615;

    public NetworkBuilder_source_190381430818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65560 = new ArrayList();
        HashMap term65564 = new HashMap();
        HashMap term65569 = new HashMap();
        Integer term65574 = new Integer(-507387516);
        Long term65576 = new Long(6967924379644551255L);
        Integer term65578 = new Integer(-1970452551);
        Double term65580 = new Double(0.9482156027893403);
        ArrayList term65599 = new ArrayList();
        ArrayList term65603 = new ArrayList();
        ArrayList term65607 = new ArrayList();
        ArrayList term65611 = new ArrayList();
        term65553 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term65556 = (int[]) newIntArray(3);
        setIntField(term65553, term65553.getClass(), "source", -1);
        setIntField(term65553, term65553.getClass(), "sink", -1);
        setIntElement(term65556, 0, 1396745898);
        setIntElement(term65556, 1, -171687185);
        setIntElement(term65556, 2, -1808375426);
        setField(term65553, term65553.getClass(), "vertices", term65556);
        setField(term65553, term65553.getClass(), "dynamicVertices", term65560);
        setField(term65553, term65553.getClass(), "vertexLabelMap", term65564);
        setField(term65553, term65553.getClass(), "vertexWeightMap", term65569);
        setField(term65553, term65553.getClass(), "maxVertices", term65574);
        setField(term65553, term65553.getClass(), "numEdges", term65576);
        setField(term65553, term65553.getClass(), "avgDegree", term65578);
        setField(term65553, term65553.getClass(), "density", term65580);
        setBooleanField(term65553, term65553.getClass(), "directed", false);
        setBooleanField(term65553, term65553.getClass(), "allowingSelfLoops", true);
        setBooleanField(term65553, term65553.getClass(), "allowingMultiEdges", true);
        setIntField(term65553, term65553.getClass(), "vertexDataSize", 1);
        setIntField(term65553, term65553.getClass(), "edgeDataSize", 3);
        setField(term65553, term65553.getClass(), "name", "SPtPatHeOm");
        setField(term65553, term65553.getClass(), "edges", term65599);
        setField(term65553, term65553.getClass(), "paths", term65603);
        setField(term65553, term65553.getClass(), "cycles", term65607);
        setField(term65553, term65553.getClass(), "cliques", term65611);
        term65615 = new Integer(-1840652193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65615;
        callMethod(klass, "source", argTypes, term65553, args);
    }

};


