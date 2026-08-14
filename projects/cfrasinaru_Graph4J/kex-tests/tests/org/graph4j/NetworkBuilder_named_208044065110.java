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

public class NetworkBuilder_named_208044065110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64867;

    public NetworkBuilder_named_208044065110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term64880 = new ArrayList();
        HashMap term64884 = new HashMap();
        HashMap term64889 = new HashMap();
        Integer term64894 = new Integer(1296895584);
        Long term64896 = new Long(6375119433582206027L);
        Integer term64898 = new Integer(628918458);
        Double term64900 = new Double(0.1713603524061028);
        ArrayList term64919 = new ArrayList();
        ArrayList term64923 = new ArrayList();
        ArrayList term64927 = new ArrayList();
        ArrayList term64931 = new ArrayList();
        term64867 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term64870 = (int[]) newIntArray(9);
        setIntField(term64867, term64867.getClass(), "source", -1);
        setIntField(term64867, term64867.getClass(), "sink", -1);
        setIntElement(term64870, 0, -1014439536);
        setIntElement(term64870, 1, 476298983);
        setIntElement(term64870, 2, 271979703);
        setIntElement(term64870, 3, -191087684);
        setIntElement(term64870, 4, -776090822);
        setIntElement(term64870, 5, -179776820);
        setIntElement(term64870, 6, -477105508);
        setIntElement(term64870, 7, -1964032020);
        setIntElement(term64870, 8, -1625554081);
        setField(term64867, term64867.getClass(), "vertices", term64870);
        setField(term64867, term64867.getClass(), "dynamicVertices", term64880);
        setField(term64867, term64867.getClass(), "vertexLabelMap", term64884);
        setField(term64867, term64867.getClass(), "vertexWeightMap", term64889);
        setField(term64867, term64867.getClass(), "maxVertices", term64894);
        setField(term64867, term64867.getClass(), "numEdges", term64896);
        setField(term64867, term64867.getClass(), "avgDegree", term64898);
        setField(term64867, term64867.getClass(), "density", term64900);
        setBooleanField(term64867, term64867.getClass(), "directed", false);
        setBooleanField(term64867, term64867.getClass(), "allowingSelfLoops", true);
        setBooleanField(term64867, term64867.getClass(), "allowingMultiEdges", false);
        setIntField(term64867, term64867.getClass(), "vertexDataSize", 1);
        setIntField(term64867, term64867.getClass(), "edgeDataSize", 3);
        setField(term64867, term64867.getClass(), "name", "WVbxuoDBcn");
        setField(term64867, term64867.getClass(), "edges", term64919);
        setField(term64867, term64867.getClass(), "paths", term64923);
        setField(term64867, term64867.getClass(), "cycles", term64927);
        setField(term64867, term64867.getClass(), "cliques", term64931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pvDEABOxLt";
        callMethod(klass, "named", argTypes, term64867, args);
    }

};


