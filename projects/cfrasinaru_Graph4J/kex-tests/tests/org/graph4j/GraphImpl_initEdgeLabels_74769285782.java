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
import java.lang.Object;
import java.lang.Integer;
import java.util.HashMap;

public class GraphImpl_initEdgeLabels_74769285782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29866;

    public GraphImpl_initEdgeLabels_74769285782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29932 = new Integer(1655935355);
        HashMap term29934 = new HashMap();
        HashMap term29939 = new HashMap();
        term29866 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        int[] term29882 = (int[]) newIntArray(7);
        int[] term29890 = (int[]) newIntArray(7);
        Object[] term29898 = (Object[]) newArray("[I", 0);
        Object[] term29899 = (Object[]) newArray("[I", 3);
        int[] term29900 = (int[]) newIntArray(0);
        int[] term29901 = (int[]) newIntArray(1);
        int[] term29903 = (int[]) newIntArray(7);
        double[] term29911 = (double[]) newDoubleArray(1);
        Object[] term29914 = (Object[]) newArray("[[D", 0);
        Object[] term29916 = (Object[]) newArray("java.lang.Object", 8);
        Object term29917 = newInstance(Class.forName("java.lang.Object"));
        Object term29918 = newInstance(Class.forName("java.lang.Object"));
        Object term29919 = newInstance(Class.forName("java.lang.Object"));
        Object term29920 = newInstance(Class.forName("java.lang.Object"));
        Object term29921 = newInstance(Class.forName("java.lang.Object"));
        Object term29922 = newInstance(Class.forName("java.lang.Object"));
        Object term29923 = newInstance(Class.forName("java.lang.Object"));
        Object term29924 = newInstance(Class.forName("java.lang.Object"));
        Object[] term29925 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Object"), 0).getClass(), 2);
        Object[] term29926 = (Object[]) newArray("java.lang.Object", 1);
        Object term29927 = newInstance(Class.forName("java.lang.Object"));
        Object[] term29928 = (Object[]) newArray("java.lang.Object", 9);
        Object term29929 = newInstance(Class.forName("java.lang.Object"));
        Object[] term29930 = (Object[]) newArray("org.graph4j.AdjacencySet", 7);
        Object[] term29931 = (Object[]) newArray("org.graph4j.AdjacencyMap", 8);
        setField(term29866, term29866.getClass(), "name", "VgZnGoIFwQ");
        setIntField(term29866, term29866.getClass(), "maxVertices", -1363744441);
        setIntField(term29866, term29866.getClass(), "numVertices", -1303828030);
        setLongField(term29866, term29866.getClass(), "numEdges", 6005241913654469005L);
        setIntElement(term29882, 0, 1611629079);
        setIntElement(term29882, 1, 770171276);
        setIntElement(term29882, 2, -1497914215);
        setIntElement(term29882, 3, 254385018);
        setIntElement(term29882, 4, 672070228);
        setIntElement(term29882, 5, 1014463904);
        setIntElement(term29882, 6, 928673401);
        setField(term29866, term29866.getClass(), "vertices", term29882);
        setIntElement(term29890, 0, -631739609);
        setIntElement(term29890, 1, -2045566233);
        setIntElement(term29890, 2, 102632361);
        setIntElement(term29890, 3, -871963633);
        setIntElement(term29890, 4, -572352492);
        setIntElement(term29890, 5, -583361854);
        setIntElement(term29890, 6, 717140857);
        setField(term29866, term29866.getClass(), "degree", term29890);
        setField(term29866, term29866.getClass(), "adjList", term29898);
        setElement(term29899, 0, term29900);
        setIntElement(term29901, 0, 891889211);
        setElement(term29899, 1, term29901);
        setIntElement(term29903, 0, 265502816);
        setIntElement(term29903, 1, -1730476579);
        setIntElement(term29903, 2, -1501333599);
        setIntElement(term29903, 3, 1525193088);
        setIntElement(term29903, 4, 1734906845);
        setIntElement(term29903, 5, 678776902);
        setIntElement(term29903, 6, -1148076813);
        setElement(term29899, 2, term29903);
        setField(term29866, term29866.getClass(), "adjPos", term29899);
        setDoubleElement(term29911, 0, 0.6038305879259166);
        setField(term29866, term29866.getClass(), "vertexWeight", term29911);
        setIntField(term29866, term29866.getClass(), "vertexDataSize", 1);
        setField(term29866, term29866.getClass(), "edgeData", term29914);
        setIntField(term29866, term29866.getClass(), "edgeDataSize", 1);
        setElement(term29916, 0, term29917);
        setElement(term29916, 1, term29918);
        setElement(term29916, 2, term29919);
        setElement(term29916, 3, term29920);
        setElement(term29916, 4, term29921);
        setElement(term29916, 5, term29922);
        setElement(term29916, 6, term29923);
        setElement(term29916, 7, term29924);
        setField(term29866, term29866.getClass(), "vertexLabel", term29916);
        setElement(term29926, 0, term29927);
        setElement(term29925, 0, term29926);
        setElement(term29928, 0, term29929);
        setElement(term29928, 1, term29924);
        setElement(term29928, 2, term29927);
        setElement(term29928, 3, term29917);
        setElement(term29928, 4, term29922);
        setElement(term29928, 5, term29920);
        setElement(term29928, 6, term29918);
        setElement(term29928, 7, term29918);
        setElement(term29928, 8, term29929);
        setElement(term29925, 1, term29928);
        setField(term29866, term29866.getClass(), "edgeLabel", term29925);
        setField(term29866, term29866.getClass(), "vertexIndex", null);
        setField(term29866, term29866.getClass(), "adjSet", term29930);
        setField(term29866, term29866.getClass(), "adjMap", term29931);
        setField(term29866, term29866.getClass(), "maxVertexNumber", term29932);
        setField(term29866, term29866.getClass(), "labelVertexMap", term29934);
        setField(term29866, term29866.getClass(), "labelEdgeMap", term29939);
        setBooleanField(term29866, term29866.getClass(), "directed", false);
        setBooleanField(term29866, term29866.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term29866, term29866.getClass(), "allowingSelfLoops", false);
        setIntField(term29866, term29866.getClass(), "avgDegree", 1450586432);
        setBooleanField(term29866, term29866.getClass(), "safeMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initEdgeLabels", argTypes, term29866, args);
    }

};


