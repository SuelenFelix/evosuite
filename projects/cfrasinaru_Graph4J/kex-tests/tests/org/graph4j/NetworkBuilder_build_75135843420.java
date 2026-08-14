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

public class NetworkBuilder_build_75135843420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65712;

    public NetworkBuilder_build_75135843420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65725 = new ArrayList();
        HashMap term65729 = new HashMap();
        HashMap term65734 = new HashMap();
        Integer term65739 = new Integer(114754804);
        Long term65741 = new Long(-8885298608300233488L);
        Integer term65743 = new Integer(1687361082);
        Double term65745 = new Double(0.04324873162392873);
        ArrayList term65764 = new ArrayList();
        ArrayList term65768 = new ArrayList();
        ArrayList term65772 = new ArrayList();
        ArrayList term65776 = new ArrayList();
        term65712 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term65715 = (int[]) newIntArray(9);
        setIntField(term65712, term65712.getClass(), "source", -1);
        setIntField(term65712, term65712.getClass(), "sink", -1);
        setIntElement(term65715, 0, 1580065656);
        setIntElement(term65715, 1, 535660);
        setIntElement(term65715, 2, -809782205);
        setIntElement(term65715, 3, -253697422);
        setIntElement(term65715, 4, -1751906935);
        setIntElement(term65715, 5, -739935304);
        setIntElement(term65715, 6, 343930030);
        setIntElement(term65715, 7, -42006399);
        setIntElement(term65715, 8, 1336799594);
        setField(term65712, term65712.getClass(), "vertices", term65715);
        setField(term65712, term65712.getClass(), "dynamicVertices", term65725);
        setField(term65712, term65712.getClass(), "vertexLabelMap", term65729);
        setField(term65712, term65712.getClass(), "vertexWeightMap", term65734);
        setField(term65712, term65712.getClass(), "maxVertices", term65739);
        setField(term65712, term65712.getClass(), "numEdges", term65741);
        setField(term65712, term65712.getClass(), "avgDegree", term65743);
        setField(term65712, term65712.getClass(), "density", term65745);
        setBooleanField(term65712, term65712.getClass(), "directed", false);
        setBooleanField(term65712, term65712.getClass(), "allowingSelfLoops", true);
        setBooleanField(term65712, term65712.getClass(), "allowingMultiEdges", false);
        setIntField(term65712, term65712.getClass(), "vertexDataSize", 1);
        setIntField(term65712, term65712.getClass(), "edgeDataSize", 3);
        setField(term65712, term65712.getClass(), "name", "GBOEuByOfr");
        setField(term65712, term65712.getClass(), "edges", term65764);
        setField(term65712, term65712.getClass(), "paths", term65768);
        setField(term65712, term65712.getClass(), "cycles", term65772);
        setField(term65712, term65712.getClass(), "cliques", term65776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term65712, args);
    }

};


