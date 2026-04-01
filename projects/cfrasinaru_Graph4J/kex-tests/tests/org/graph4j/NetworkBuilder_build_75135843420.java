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
     Object term65709;

    public NetworkBuilder_build_75135843420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65722 = new ArrayList();
        HashMap term65726 = new HashMap();
        HashMap term65731 = new HashMap();
        Integer term65736 = new Integer(114754804);
        Long term65738 = new Long(-8885298608300233488L);
        Integer term65740 = new Integer(1687361082);
        Double term65742 = new Double(0.04324873162392873);
        ArrayList term65761 = new ArrayList();
        ArrayList term65765 = new ArrayList();
        ArrayList term65769 = new ArrayList();
        ArrayList term65773 = new ArrayList();
        term65709 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term65712 = (int[]) newIntArray(9);
        setIntField(term65709, term65709.getClass(), "source", -1);
        setIntField(term65709, term65709.getClass(), "sink", -1);
        setIntElement(term65712, 0, 1580065656);
        setIntElement(term65712, 1, 535660);
        setIntElement(term65712, 2, -809782205);
        setIntElement(term65712, 3, -253697422);
        setIntElement(term65712, 4, -1751906935);
        setIntElement(term65712, 5, -739935304);
        setIntElement(term65712, 6, 343930030);
        setIntElement(term65712, 7, -42006399);
        setIntElement(term65712, 8, 1336799594);
        setField(term65709, term65709.getClass(), "vertices", term65712);
        setField(term65709, term65709.getClass(), "dynamicVertices", term65722);
        setField(term65709, term65709.getClass(), "vertexLabelMap", term65726);
        setField(term65709, term65709.getClass(), "vertexWeightMap", term65731);
        setField(term65709, term65709.getClass(), "maxVertices", term65736);
        setField(term65709, term65709.getClass(), "numEdges", term65738);
        setField(term65709, term65709.getClass(), "avgDegree", term65740);
        setField(term65709, term65709.getClass(), "density", term65742);
        setBooleanField(term65709, term65709.getClass(), "directed", false);
        setBooleanField(term65709, term65709.getClass(), "allowingSelfLoops", true);
        setBooleanField(term65709, term65709.getClass(), "allowingMultiEdges", false);
        setIntField(term65709, term65709.getClass(), "vertexDataSize", 1);
        setIntField(term65709, term65709.getClass(), "edgeDataSize", 3);
        setField(term65709, term65709.getClass(), "name", "GBOEuByOfr");
        setField(term65709, term65709.getClass(), "edges", term65761);
        setField(term65709, term65709.getClass(), "paths", term65765);
        setField(term65709, term65709.getClass(), "cycles", term65769);
        setField(term65709, term65709.getClass(), "cliques", term65773);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term65709, args);
    }

};


