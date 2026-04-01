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
     Object term65630;
     Object term65693;

    public NetworkBuilder_sink_25743722819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65638 = new ArrayList();
        HashMap term65642 = new HashMap();
        HashMap term65647 = new HashMap();
        Integer term65652 = new Integer(-1896376975);
        Long term65654 = new Long(-2813493605142626659L);
        Integer term65656 = new Integer(729658803);
        Double term65658 = new Double(0.9946322297398043);
        ArrayList term65677 = new ArrayList();
        ArrayList term65681 = new ArrayList();
        ArrayList term65685 = new ArrayList();
        ArrayList term65689 = new ArrayList();
        term65630 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term65633 = (int[]) newIntArray(4);
        setIntField(term65630, term65630.getClass(), "source", -1);
        setIntField(term65630, term65630.getClass(), "sink", -1);
        setIntElement(term65633, 0, 1204481493);
        setIntElement(term65633, 1, 117135344);
        setIntElement(term65633, 2, 1755958093);
        setIntElement(term65633, 3, 539487007);
        setField(term65630, term65630.getClass(), "vertices", term65633);
        setField(term65630, term65630.getClass(), "dynamicVertices", term65638);
        setField(term65630, term65630.getClass(), "vertexLabelMap", term65642);
        setField(term65630, term65630.getClass(), "vertexWeightMap", term65647);
        setField(term65630, term65630.getClass(), "maxVertices", term65652);
        setField(term65630, term65630.getClass(), "numEdges", term65654);
        setField(term65630, term65630.getClass(), "avgDegree", term65656);
        setField(term65630, term65630.getClass(), "density", term65658);
        setBooleanField(term65630, term65630.getClass(), "directed", false);
        setBooleanField(term65630, term65630.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65630, term65630.getClass(), "allowingMultiEdges", false);
        setIntField(term65630, term65630.getClass(), "vertexDataSize", 1);
        setIntField(term65630, term65630.getClass(), "edgeDataSize", 3);
        setField(term65630, term65630.getClass(), "name", "ywmcuThdfL");
        setField(term65630, term65630.getClass(), "edges", term65677);
        setField(term65630, term65630.getClass(), "paths", term65681);
        setField(term65630, term65630.getClass(), "cycles", term65685);
        setField(term65630, term65630.getClass(), "cliques", term65689);
        term65693 = new Integer(1325638563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65693;
        callMethod(klass, "sink", argTypes, term65630, args);
    }

};


