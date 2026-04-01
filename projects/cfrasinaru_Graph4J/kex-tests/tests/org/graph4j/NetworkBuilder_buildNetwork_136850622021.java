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

public class NetworkBuilder_buildNetwork_136850622021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65796;

    public NetworkBuilder_buildNetwork_136850622021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65809 = new ArrayList();
        HashMap term65813 = new HashMap();
        HashMap term65818 = new HashMap();
        Integer term65823 = new Integer(584893196);
        Long term65825 = new Long(-4325723315152823407L);
        Integer term65827 = new Integer(497269071);
        Double term65829 = new Double(0.2652123546462597);
        ArrayList term65848 = new ArrayList();
        ArrayList term65852 = new ArrayList();
        ArrayList term65856 = new ArrayList();
        ArrayList term65860 = new ArrayList();
        term65796 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term65799 = (int[]) newIntArray(9);
        setIntField(term65796, term65796.getClass(), "source", -1);
        setIntField(term65796, term65796.getClass(), "sink", -1);
        setIntElement(term65799, 0, -1301911357);
        setIntElement(term65799, 1, 504881648);
        setIntElement(term65799, 2, 1350912746);
        setIntElement(term65799, 3, -1039288445);
        setIntElement(term65799, 4, 2076060135);
        setIntElement(term65799, 5, -529144633);
        setIntElement(term65799, 6, -884210737);
        setIntElement(term65799, 7, -438744694);
        setIntElement(term65799, 8, 510826397);
        setField(term65796, term65796.getClass(), "vertices", term65799);
        setField(term65796, term65796.getClass(), "dynamicVertices", term65809);
        setField(term65796, term65796.getClass(), "vertexLabelMap", term65813);
        setField(term65796, term65796.getClass(), "vertexWeightMap", term65818);
        setField(term65796, term65796.getClass(), "maxVertices", term65823);
        setField(term65796, term65796.getClass(), "numEdges", term65825);
        setField(term65796, term65796.getClass(), "avgDegree", term65827);
        setField(term65796, term65796.getClass(), "density", term65829);
        setBooleanField(term65796, term65796.getClass(), "directed", true);
        setBooleanField(term65796, term65796.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65796, term65796.getClass(), "allowingMultiEdges", false);
        setIntField(term65796, term65796.getClass(), "vertexDataSize", 1);
        setIntField(term65796, term65796.getClass(), "edgeDataSize", 3);
        setField(term65796, term65796.getClass(), "name", "NHbOFFjyVK");
        setField(term65796, term65796.getClass(), "edges", term65848);
        setField(term65796, term65796.getClass(), "paths", term65852);
        setField(term65796, term65796.getClass(), "cycles", term65856);
        setField(term65796, term65796.getClass(), "cliques", term65860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildNetwork", argTypes, term65796, args);
    }

};


