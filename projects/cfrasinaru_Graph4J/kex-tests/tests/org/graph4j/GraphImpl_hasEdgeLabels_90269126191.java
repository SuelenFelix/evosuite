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

public class GraphImpl_hasEdgeLabels_90269126191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32988;

    public GraphImpl_hasEdgeLabels_90269126191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term33060 = new Integer(-1772434990);
        HashMap term33062 = new HashMap();
        HashMap term33067 = new HashMap();
        term32988 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        int[] term33004 = (int[]) newIntArray(4);
        int[] term33009 = (int[]) newIntArray(7);
        Object[] term33017 = (Object[]) newArray("[I", 1);
        int[] term33018 = (int[]) newIntArray(8);
        Object[] term33027 = (Object[]) newArray("[I", 1);
        int[] term33028 = (int[]) newIntArray(5);
        double[] term33034 = (double[]) newDoubleArray(0);
        Object[] term33036 = (Object[]) newArray("[[D", 0);
        Object[] term33038 = (Object[]) newArray("java.lang.Object", 8);
        Object term33039 = newInstance(Class.forName("java.lang.Object"));
        Object term33040 = newInstance(Class.forName("java.lang.Object"));
        Object term33041 = newInstance(Class.forName("java.lang.Object"));
        Object term33042 = newInstance(Class.forName("java.lang.Object"));
        Object term33043 = newInstance(Class.forName("java.lang.Object"));
        Object term33044 = newInstance(Class.forName("java.lang.Object"));
        Object term33045 = newInstance(Class.forName("java.lang.Object"));
        Object term33046 = newInstance(Class.forName("java.lang.Object"));
        Object[] term33047 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Object"), 0).getClass(), 8);
        Object[] term33048 = (Object[]) newArray("java.lang.Object", 0);
        Object[] term33049 = (Object[]) newArray("java.lang.Object", 2);
        Object term33050 = newInstance(Class.forName("java.lang.Object"));
        Object term33051 = newInstance(Class.forName("java.lang.Object"));
        Object[] term33052 = (Object[]) newArray("java.lang.Object", 4);
        Object[] term33053 = (Object[]) newArray("java.lang.Object", 5);
        Object[] term33054 = (Object[]) newArray("java.lang.Object", 5);
        Object[] term33055 = (Object[]) newArray("java.lang.Object", 9);
        Object[] term33056 = (Object[]) newArray("java.lang.Object", 1);
        Object[] term33057 = (Object[]) newArray("java.lang.Object", 7);
        Object[] term33058 = (Object[]) newArray("org.graph4j.AdjacencySet", 2);
        Object[] term33059 = (Object[]) newArray("org.graph4j.AdjacencyMap", 7);
        setField(term32988, term32988.getClass(), "name", "swZVeJAxjt");
        setIntField(term32988, term32988.getClass(), "maxVertices", -1726739412);
        setIntField(term32988, term32988.getClass(), "numVertices", -910985376);
        setLongField(term32988, term32988.getClass(), "numEdges", 6689117472719450333L);
        setIntElement(term33004, 0, 1260410174);
        setIntElement(term33004, 1, -1557704101);
        setIntElement(term33004, 2, -764615686);
        setIntElement(term33004, 3, -762034217);
        setField(term32988, term32988.getClass(), "vertices", term33004);
        setIntElement(term33009, 0, 481600552);
        setIntElement(term33009, 1, 1415008678);
        setIntElement(term33009, 2, -768389527);
        setIntElement(term33009, 3, 88636719);
        setIntElement(term33009, 4, -18572829);
        setIntElement(term33009, 5, 1220825104);
        setIntElement(term33009, 6, -401847632);
        setField(term32988, term32988.getClass(), "degree", term33009);
        setIntElement(term33018, 0, 1538271896);
        setIntElement(term33018, 1, 840990489);
        setIntElement(term33018, 2, -793012848);
        setIntElement(term33018, 3, -2041331473);
        setIntElement(term33018, 4, -416355601);
        setIntElement(term33018, 5, 439309680);
        setIntElement(term33018, 6, -1717455505);
        setIntElement(term33018, 7, 1898536358);
        setElement(term33017, 0, term33018);
        setField(term32988, term32988.getClass(), "adjList", term33017);
        setIntElement(term33028, 0, 1296009499);
        setIntElement(term33028, 1, -427335137);
        setIntElement(term33028, 2, 9865038);
        setIntElement(term33028, 3, 1202401386);
        setIntElement(term33028, 4, 1173310137);
        setElement(term33027, 0, term33028);
        setField(term32988, term32988.getClass(), "adjPos", term33027);
        setField(term32988, term32988.getClass(), "vertexWeight", term33034);
        setIntField(term32988, term32988.getClass(), "vertexDataSize", 1);
        setField(term32988, term32988.getClass(), "edgeData", term33036);
        setIntField(term32988, term32988.getClass(), "edgeDataSize", 1);
        setElement(term33038, 0, term33039);
        setElement(term33038, 1, term33040);
        setElement(term33038, 2, term33041);
        setElement(term33038, 3, term33042);
        setElement(term33038, 4, term33043);
        setElement(term33038, 5, term33044);
        setElement(term33038, 6, term33045);
        setElement(term33038, 7, term33046);
        setField(term32988, term32988.getClass(), "vertexLabel", term33038);
        setElement(term33047, 0, term33048);
        setElement(term33049, 0, term33050);
        setElement(term33049, 1, term33051);
        setElement(term33047, 1, term33049);
        setElement(term33052, 0, term33046);
        setElement(term33052, 1, term33050);
        setElement(term33052, 2, term33039);
        setElement(term33052, 3, term33044);
        setElement(term33047, 2, term33052);
        setElement(term33053, 0, term33042);
        setElement(term33053, 1, term33040);
        setElement(term33053, 2, term33040);
        setElement(term33053, 3, term33051);
        setElement(term33053, 4, term33046);
        setElement(term33047, 3, term33053);
        setElement(term33054, 0, term33046);
        setElement(term33054, 1, term33043);
        setElement(term33054, 2, term33051);
        setElement(term33054, 3, term33046);
        setElement(term33054, 4, term33044);
        setElement(term33047, 4, term33054);
        setElement(term33055, 0, term33041);
        setElement(term33055, 1, term33043);
        setElement(term33055, 2, term33046);
        setElement(term33055, 3, term33051);
        setElement(term33055, 4, term33051);
        setElement(term33055, 5, term33042);
        setElement(term33055, 6, term33043);
        setElement(term33055, 7, term33043);
        setElement(term33055, 8, term33040);
        setElement(term33047, 5, term33055);
        setElement(term33056, 0, term33045);
        setElement(term33047, 6, term33056);
        setElement(term33057, 0, term33045);
        setElement(term33057, 1, term33050);
        setElement(term33057, 2, term33051);
        setElement(term33057, 3, term33041);
        setElement(term33057, 4, term33045);
        setElement(term33057, 5, term33044);
        setElement(term33057, 6, term33040);
        setElement(term33047, 7, term33057);
        setField(term32988, term32988.getClass(), "edgeLabel", term33047);
        setField(term32988, term32988.getClass(), "vertexIndex", null);
        setField(term32988, term32988.getClass(), "adjSet", term33058);
        setField(term32988, term32988.getClass(), "adjMap", term33059);
        setField(term32988, term32988.getClass(), "maxVertexNumber", term33060);
        setField(term32988, term32988.getClass(), "labelVertexMap", term33062);
        setField(term32988, term32988.getClass(), "labelEdgeMap", term33067);
        setBooleanField(term32988, term32988.getClass(), "directed", true);
        setBooleanField(term32988, term32988.getClass(), "allowingMultipleEdges", true);
        setBooleanField(term32988, term32988.getClass(), "allowingSelfLoops", false);
        setIntField(term32988, term32988.getClass(), "avgDegree", 957107652);
        setBooleanField(term32988, term32988.getClass(), "safeMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasEdgeLabels", argTypes, term32988, args);
    }

};


