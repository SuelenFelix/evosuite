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
import java.lang.Object;

public class NetworkBuilder_addEdge_149265182017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65470;
     Object term65529;

    public NetworkBuilder_addEdge_149265182017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65474 = new ArrayList();
        HashMap term65478 = new HashMap();
        HashMap term65483 = new HashMap();
        Integer term65488 = new Integer(991356662);
        Long term65490 = new Long(-7237588299778557629L);
        Integer term65492 = new Integer(-506958186);
        Double term65494 = new Double(0.49834805734323884);
        ArrayList term65513 = new ArrayList();
        ArrayList term65517 = new ArrayList();
        ArrayList term65521 = new ArrayList();
        ArrayList term65525 = new ArrayList();
        term65470 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term65473 = (int[]) newIntArray(0);
        setIntField(term65470, term65470.getClass(), "source", -1);
        setIntField(term65470, term65470.getClass(), "sink", -1);
        setField(term65470, term65470.getClass(), "vertices", term65473);
        setField(term65470, term65470.getClass(), "dynamicVertices", term65474);
        setField(term65470, term65470.getClass(), "vertexLabelMap", term65478);
        setField(term65470, term65470.getClass(), "vertexWeightMap", term65483);
        setField(term65470, term65470.getClass(), "maxVertices", term65488);
        setField(term65470, term65470.getClass(), "numEdges", term65490);
        setField(term65470, term65470.getClass(), "avgDegree", term65492);
        setField(term65470, term65470.getClass(), "density", term65494);
        setBooleanField(term65470, term65470.getClass(), "directed", false);
        setBooleanField(term65470, term65470.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65470, term65470.getClass(), "allowingMultiEdges", true);
        setIntField(term65470, term65470.getClass(), "vertexDataSize", 1);
        setIntField(term65470, term65470.getClass(), "edgeDataSize", 3);
        setField(term65470, term65470.getClass(), "name", "jDmhBrIoDa");
        setField(term65470, term65470.getClass(), "edges", term65513);
        setField(term65470, term65470.getClass(), "paths", term65517);
        setField(term65470, term65470.getClass(), "cycles", term65521);
        setField(term65470, term65470.getClass(), "cliques", term65525);
        Double term65534 = new Double(0.5823024616231472);
        Double term65536 = new Double(0.036779689625219825);
        Double term65538 = new Double(0.13829257568797448);
        Double term65540 = new Double(0.63912351480947);
        Double term65542 = new Double(0.11746904890800369);
        Double term65544 = new Double(0.1065132285415139);
        term65529 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term65533 = (Object[]) newArray("java.lang.Double", 6);
        setBooleanField(term65529, term65529.getClass(), "directed", false);
        setIntField(term65529, term65529.getClass(), "source", -1242244093);
        setIntField(term65529, term65529.getClass(), "target", -1648541304);
        setElement(term65533, 0, term65534);
        setElement(term65533, 1, term65536);
        setElement(term65533, 2, term65538);
        setElement(term65533, 3, term65540);
        setElement(term65533, 4, term65542);
        setElement(term65533, 5, term65544);
        setField(term65529, term65529.getClass(), "data", term65533);
        setField(term65529, term65529.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term65529;
        callMethod(klass, "addEdge", argTypes, term65470, args);
    }

};


