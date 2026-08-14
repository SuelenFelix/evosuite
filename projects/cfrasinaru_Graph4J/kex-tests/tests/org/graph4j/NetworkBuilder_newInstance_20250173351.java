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

public class NetworkBuilder_newInstance_20250173351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64731;

    public NetworkBuilder_newInstance_20250173351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term64744 = new ArrayList();
        HashMap term64748 = new HashMap();
        HashMap term64753 = new HashMap();
        Integer term64758 = new Integer(-1002370457);
        Long term64760 = new Long(2442117782898005296L);
        Integer term64762 = new Integer(-2014576105);
        Double term64764 = new Double(0.08286713692323);
        ArrayList term64783 = new ArrayList();
        ArrayList term64787 = new ArrayList();
        ArrayList term64791 = new ArrayList();
        ArrayList term64795 = new ArrayList();
        term64731 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term64734 = (int[]) newIntArray(9);
        setIntField(term64731, term64731.getClass(), "source", -1);
        setIntField(term64731, term64731.getClass(), "sink", -1);
        setIntElement(term64734, 0, 260410067);
        setIntElement(term64734, 1, -413083092);
        setIntElement(term64734, 2, -1760860172);
        setIntElement(term64734, 3, -1218209025);
        setIntElement(term64734, 4, -1603360365);
        setIntElement(term64734, 5, 661051072);
        setIntElement(term64734, 6, -968061271);
        setIntElement(term64734, 7, -1544354289);
        setIntElement(term64734, 8, -268598222);
        setField(term64731, term64731.getClass(), "vertices", term64734);
        setField(term64731, term64731.getClass(), "dynamicVertices", term64744);
        setField(term64731, term64731.getClass(), "vertexLabelMap", term64748);
        setField(term64731, term64731.getClass(), "vertexWeightMap", term64753);
        setField(term64731, term64731.getClass(), "maxVertices", term64758);
        setField(term64731, term64731.getClass(), "numEdges", term64760);
        setField(term64731, term64731.getClass(), "avgDegree", term64762);
        setField(term64731, term64731.getClass(), "density", term64764);
        setBooleanField(term64731, term64731.getClass(), "directed", false);
        setBooleanField(term64731, term64731.getClass(), "allowingSelfLoops", false);
        setBooleanField(term64731, term64731.getClass(), "allowingMultiEdges", false);
        setIntField(term64731, term64731.getClass(), "vertexDataSize", 1);
        setIntField(term64731, term64731.getClass(), "edgeDataSize", 3);
        setField(term64731, term64731.getClass(), "name", "sNQFlATEeQ");
        setField(term64731, term64731.getClass(), "edges", term64783);
        setField(term64731, term64731.getClass(), "paths", term64787);
        setField(term64731, term64731.getClass(), "cycles", term64791);
        setField(term64731, term64731.getClass(), "cliques", term64795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newInstance", argTypes, term64731, args);
    }

};


