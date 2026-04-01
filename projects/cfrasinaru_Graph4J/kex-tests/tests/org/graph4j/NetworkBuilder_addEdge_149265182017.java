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
     Object term65467;
     Object term65526;

    public NetworkBuilder_addEdge_149265182017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65471 = new ArrayList();
        HashMap term65475 = new HashMap();
        HashMap term65480 = new HashMap();
        Integer term65485 = new Integer(991356662);
        Long term65487 = new Long(-7237588299778557629L);
        Integer term65489 = new Integer(-506958186);
        Double term65491 = new Double(0.49834805734323884);
        ArrayList term65510 = new ArrayList();
        ArrayList term65514 = new ArrayList();
        ArrayList term65518 = new ArrayList();
        ArrayList term65522 = new ArrayList();
        term65467 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term65470 = (int[]) newIntArray(0);
        setIntField(term65467, term65467.getClass(), "source", -1);
        setIntField(term65467, term65467.getClass(), "sink", -1);
        setField(term65467, term65467.getClass(), "vertices", term65470);
        setField(term65467, term65467.getClass(), "dynamicVertices", term65471);
        setField(term65467, term65467.getClass(), "vertexLabelMap", term65475);
        setField(term65467, term65467.getClass(), "vertexWeightMap", term65480);
        setField(term65467, term65467.getClass(), "maxVertices", term65485);
        setField(term65467, term65467.getClass(), "numEdges", term65487);
        setField(term65467, term65467.getClass(), "avgDegree", term65489);
        setField(term65467, term65467.getClass(), "density", term65491);
        setBooleanField(term65467, term65467.getClass(), "directed", false);
        setBooleanField(term65467, term65467.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65467, term65467.getClass(), "allowingMultiEdges", true);
        setIntField(term65467, term65467.getClass(), "vertexDataSize", 1);
        setIntField(term65467, term65467.getClass(), "edgeDataSize", 3);
        setField(term65467, term65467.getClass(), "name", "jDmhBrIoDa");
        setField(term65467, term65467.getClass(), "edges", term65510);
        setField(term65467, term65467.getClass(), "paths", term65514);
        setField(term65467, term65467.getClass(), "cycles", term65518);
        setField(term65467, term65467.getClass(), "cliques", term65522);
        Double term65531 = new Double(0.5823024616231472);
        Double term65533 = new Double(0.036779689625219825);
        Double term65535 = new Double(0.13829257568797448);
        Double term65537 = new Double(0.63912351480947);
        Double term65539 = new Double(0.11746904890800369);
        Double term65541 = new Double(0.1065132285415139);
        term65526 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term65530 = (Object[]) newArray("java.lang.Double", 6);
        setBooleanField(term65526, term65526.getClass(), "directed", false);
        setIntField(term65526, term65526.getClass(), "source", -1242244093);
        setIntField(term65526, term65526.getClass(), "target", -1648541304);
        setElement(term65530, 0, term65531);
        setElement(term65530, 1, term65533);
        setElement(term65530, 2, term65535);
        setElement(term65530, 3, term65537);
        setElement(term65530, 4, term65539);
        setElement(term65530, 5, term65541);
        setField(term65526, term65526.getClass(), "data", term65530);
        setField(term65526, term65526.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term65526;
        callMethod(klass, "addEdge", argTypes, term65467, args);
    }

};


