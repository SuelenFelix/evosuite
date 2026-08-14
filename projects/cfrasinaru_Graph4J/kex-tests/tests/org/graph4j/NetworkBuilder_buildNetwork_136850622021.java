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
     Object term65799;

    public NetworkBuilder_buildNetwork_136850622021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65812 = new ArrayList();
        HashMap term65816 = new HashMap();
        HashMap term65821 = new HashMap();
        Integer term65826 = new Integer(584893196);
        Long term65828 = new Long(-4325723315152823407L);
        Integer term65830 = new Integer(497269071);
        Double term65832 = new Double(0.2652123546462597);
        ArrayList term65851 = new ArrayList();
        ArrayList term65855 = new ArrayList();
        ArrayList term65859 = new ArrayList();
        ArrayList term65863 = new ArrayList();
        term65799 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term65802 = (int[]) newIntArray(9);
        setIntField(term65799, term65799.getClass(), "source", -1);
        setIntField(term65799, term65799.getClass(), "sink", -1);
        setIntElement(term65802, 0, -1301911357);
        setIntElement(term65802, 1, 504881648);
        setIntElement(term65802, 2, 1350912746);
        setIntElement(term65802, 3, -1039288445);
        setIntElement(term65802, 4, 2076060135);
        setIntElement(term65802, 5, -529144633);
        setIntElement(term65802, 6, -884210737);
        setIntElement(term65802, 7, -438744694);
        setIntElement(term65802, 8, 510826397);
        setField(term65799, term65799.getClass(), "vertices", term65802);
        setField(term65799, term65799.getClass(), "dynamicVertices", term65812);
        setField(term65799, term65799.getClass(), "vertexLabelMap", term65816);
        setField(term65799, term65799.getClass(), "vertexWeightMap", term65821);
        setField(term65799, term65799.getClass(), "maxVertices", term65826);
        setField(term65799, term65799.getClass(), "numEdges", term65828);
        setField(term65799, term65799.getClass(), "avgDegree", term65830);
        setField(term65799, term65799.getClass(), "density", term65832);
        setBooleanField(term65799, term65799.getClass(), "directed", true);
        setBooleanField(term65799, term65799.getClass(), "allowingSelfLoops", false);
        setBooleanField(term65799, term65799.getClass(), "allowingMultiEdges", false);
        setIntField(term65799, term65799.getClass(), "vertexDataSize", 1);
        setIntField(term65799, term65799.getClass(), "edgeDataSize", 3);
        setField(term65799, term65799.getClass(), "name", "NHbOFFjyVK");
        setField(term65799, term65799.getClass(), "edges", term65851);
        setField(term65799, term65799.getClass(), "paths", term65855);
        setField(term65799, term65799.getClass(), "cycles", term65859);
        setField(term65799, term65799.getClass(), "cliques", term65863);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildNetwork", argTypes, term65799, args);
    }

};


