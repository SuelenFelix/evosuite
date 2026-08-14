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

public class GraphImpl_findAllVertices_165018000248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17934;
     Object term18007;

    public GraphImpl_findAllVertices_165018000248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term17990 = new Integer(-1968847291);
        HashMap term17992 = new HashMap();
        HashMap term17997 = new HashMap();
        term17934 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        int[] term17950 = (int[]) newIntArray(2);
        int[] term17953 = (int[]) newIntArray(0);
        Object[] term17954 = (Object[]) newArray("[I", 0);
        Object[] term17955 = (Object[]) newArray("[I", 3);
        int[] term17956 = (int[]) newIntArray(0);
        int[] term17957 = (int[]) newIntArray(5);
        int[] term17963 = (int[]) newIntArray(3);
        double[] term17967 = (double[]) newDoubleArray(2);
        Object[] term17971 = (Object[]) newArray("[[D", 0);
        Object[] term17973 = (Object[]) newArray("java.lang.Object", 4);
        Object term17974 = newInstance(Class.forName("java.lang.Object"));
        Object term17975 = newInstance(Class.forName("java.lang.Object"));
        Object term17976 = newInstance(Class.forName("java.lang.Object"));
        Object term17977 = newInstance(Class.forName("java.lang.Object"));
        Object[] term17978 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Object"), 0).getClass(), 3);
        Object[] term17979 = (Object[]) newArray("java.lang.Object", 0);
        Object[] term17980 = (Object[]) newArray("java.lang.Object", 6);
        Object term17981 = newInstance(Class.forName("java.lang.Object"));
        Object term17982 = newInstance(Class.forName("java.lang.Object"));
        Object term17983 = newInstance(Class.forName("java.lang.Object"));
        Object term17984 = newInstance(Class.forName("java.lang.Object"));
        Object term17985 = newInstance(Class.forName("java.lang.Object"));
        Object term17986 = newInstance(Class.forName("java.lang.Object"));
        Object[] term17987 = (Object[]) newArray("java.lang.Object", 2);
        Object[] term17988 = (Object[]) newArray("org.graph4j.AdjacencySet", 2);
        Object[] term17989 = (Object[]) newArray("org.graph4j.AdjacencyMap", 7);
        setField(term17934, term17934.getClass(), "name", "LvtrsXUliU");
        setIntField(term17934, term17934.getClass(), "maxVertices", 530909877);
        setIntField(term17934, term17934.getClass(), "numVertices", -123945804);
        setLongField(term17934, term17934.getClass(), "numEdges", 4044358158040652353L);
        setIntElement(term17950, 0, 2133669766);
        setIntElement(term17950, 1, -1423215684);
        setField(term17934, term17934.getClass(), "vertices", term17950);
        setField(term17934, term17934.getClass(), "degree", term17953);
        setField(term17934, term17934.getClass(), "adjList", term17954);
        setElement(term17955, 0, term17956);
        setIntElement(term17957, 0, -1096652631);
        setIntElement(term17957, 1, 1116810901);
        setIntElement(term17957, 2, 1944430959);
        setIntElement(term17957, 3, 98801346);
        setIntElement(term17957, 4, 2133290622);
        setElement(term17955, 1, term17957);
        setIntElement(term17963, 0, -164869996);
        setIntElement(term17963, 1, 1415001538);
        setIntElement(term17963, 2, 1738077695);
        setElement(term17955, 2, term17963);
        setField(term17934, term17934.getClass(), "adjPos", term17955);
        setDoubleElement(term17967, 0, 0.6249601048371941);
        setDoubleElement(term17967, 1, 0.0802513162155698);
        setField(term17934, term17934.getClass(), "vertexWeight", term17967);
        setIntField(term17934, term17934.getClass(), "vertexDataSize", 1);
        setField(term17934, term17934.getClass(), "edgeData", term17971);
        setIntField(term17934, term17934.getClass(), "edgeDataSize", 1);
        setElement(term17973, 0, term17974);
        setElement(term17973, 1, term17975);
        setElement(term17973, 2, term17976);
        setElement(term17973, 3, term17977);
        setField(term17934, term17934.getClass(), "vertexLabel", term17973);
        setElement(term17978, 0, term17979);
        setElement(term17980, 0, term17981);
        setElement(term17980, 1, term17982);
        setElement(term17980, 2, term17983);
        setElement(term17980, 3, term17984);
        setElement(term17980, 4, term17985);
        setElement(term17980, 5, term17986);
        setElement(term17978, 1, term17980);
        setElement(term17987, 0, term17984);
        setElement(term17987, 1, term17985);
        setElement(term17978, 2, term17987);
        setField(term17934, term17934.getClass(), "edgeLabel", term17978);
        setField(term17934, term17934.getClass(), "vertexIndex", null);
        setField(term17934, term17934.getClass(), "adjSet", term17988);
        setField(term17934, term17934.getClass(), "adjMap", term17989);
        setField(term17934, term17934.getClass(), "maxVertexNumber", term17990);
        setField(term17934, term17934.getClass(), "labelVertexMap", term17992);
        setField(term17934, term17934.getClass(), "labelEdgeMap", term17997);
        setBooleanField(term17934, term17934.getClass(), "directed", false);
        setBooleanField(term17934, term17934.getClass(), "allowingMultipleEdges", true);
        setBooleanField(term17934, term17934.getClass(), "allowingSelfLoops", false);
        setIntField(term17934, term17934.getClass(), "avgDegree", -1351117314);
        setBooleanField(term17934, term17934.getClass(), "safeMode", true);
        term18007 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term18007;
        callMethod(klass, "findAllVertices", argTypes, term17934, args);
    }

};


