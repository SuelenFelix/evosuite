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

public class GraphImpl_resetCache_167653508614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5962;

    public GraphImpl_resetCache_167653508614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6079 = new Integer(-883034806);
        HashMap term6081 = new HashMap();
        HashMap term6086 = new HashMap();
        term5962 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        int[] term5978 = (int[]) newIntArray(5);
        int[] term5984 = (int[]) newIntArray(8);
        Object[] term5993 = (Object[]) newArray("[I", 2);
        int[] term5994 = (int[]) newIntArray(2);
        int[] term5997 = (int[]) newIntArray(8);
        Object[] term6006 = (Object[]) newArray("[I", 8);
        int[] term6007 = (int[]) newIntArray(2);
        int[] term6010 = (int[]) newIntArray(6);
        int[] term6017 = (int[]) newIntArray(0);
        int[] term6018 = (int[]) newIntArray(6);
        int[] term6025 = (int[]) newIntArray(6);
        int[] term6032 = (int[]) newIntArray(0);
        int[] term6033 = (int[]) newIntArray(4);
        int[] term6038 = (int[]) newIntArray(9);
        double[] term6048 = (double[]) newDoubleArray(3);
        Object[] term6053 = (Object[]) newArray("[[D", 2);
        Object[] term6054 = (Object[]) newArray("[D", 0);
        Object[] term6055 = (Object[]) newArray("[D", 2);
        double[] term6056 = (double[]) newDoubleArray(3);
        double[] term6060 = (double[]) newDoubleArray(3);
        Object[] term6065 = (Object[]) newArray("java.lang.Object", 8);
        Object term6066 = newInstance(Class.forName("java.lang.Object"));
        Object term6067 = newInstance(Class.forName("java.lang.Object"));
        Object term6068 = newInstance(Class.forName("java.lang.Object"));
        Object term6069 = newInstance(Class.forName("java.lang.Object"));
        Object term6070 = newInstance(Class.forName("java.lang.Object"));
        Object term6071 = newInstance(Class.forName("java.lang.Object"));
        Object term6072 = newInstance(Class.forName("java.lang.Object"));
        Object term6073 = newInstance(Class.forName("java.lang.Object"));
        Object[] term6074 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Object"), 0).getClass(), 2);
        Object[] term6075 = (Object[]) newArray("java.lang.Object", 0);
        Object[] term6076 = (Object[]) newArray("java.lang.Object", 0);
        Object[] term6077 = (Object[]) newArray("org.graph4j.AdjacencySet", 0);
        Object[] term6078 = (Object[]) newArray("org.graph4j.AdjacencyMap", 9);
        setField(term5962, term5962.getClass(), "name", "LQFpaHEwXR");
        setIntField(term5962, term5962.getClass(), "maxVertices", -146564963);
        setIntField(term5962, term5962.getClass(), "numVertices", -83178716);
        setLongField(term5962, term5962.getClass(), "numEdges", 2535595959091595249L);
        setIntElement(term5978, 0, -1292704466);
        setIntElement(term5978, 1, 1991858584);
        setIntElement(term5978, 2, -1300947782);
        setIntElement(term5978, 3, 188512644);
        setIntElement(term5978, 4, 1851127634);
        setField(term5962, term5962.getClass(), "vertices", term5978);
        setIntElement(term5984, 0, 783730213);
        setIntElement(term5984, 1, 1815951606);
        setIntElement(term5984, 2, 1105016932);
        setIntElement(term5984, 3, -365784998);
        setIntElement(term5984, 4, -1893236300);
        setIntElement(term5984, 5, -1858909368);
        setIntElement(term5984, 6, -280113263);
        setIntElement(term5984, 7, 529625347);
        setField(term5962, term5962.getClass(), "degree", term5984);
        setIntElement(term5994, 0, 1409095253);
        setIntElement(term5994, 1, 315179039);
        setElement(term5993, 0, term5994);
        setIntElement(term5997, 0, -1835923897);
        setIntElement(term5997, 1, -341287775);
        setIntElement(term5997, 2, -1651110911);
        setIntElement(term5997, 3, -1934033808);
        setIntElement(term5997, 4, 950322609);
        setIntElement(term5997, 5, -2023791789);
        setIntElement(term5997, 6, 353974456);
        setIntElement(term5997, 7, -485108462);
        setElement(term5993, 1, term5997);
        setField(term5962, term5962.getClass(), "adjList", term5993);
        setIntElement(term6007, 0, 1418551216);
        setIntElement(term6007, 1, -626779272);
        setElement(term6006, 0, term6007);
        setIntElement(term6010, 0, -1150062870);
        setIntElement(term6010, 1, -886200503);
        setIntElement(term6010, 2, 1136393691);
        setIntElement(term6010, 3, -1288536479);
        setIntElement(term6010, 4, 1092038167);
        setIntElement(term6010, 5, 1879729823);
        setElement(term6006, 1, term6010);
        setElement(term6006, 2, term6017);
        setIntElement(term6018, 0, 1443855558);
        setIntElement(term6018, 1, -1933419449);
        setIntElement(term6018, 2, -1804322375);
        setIntElement(term6018, 3, 1595814906);
        setIntElement(term6018, 4, -834193529);
        setIntElement(term6018, 5, 335780735);
        setElement(term6006, 3, term6018);
        setIntElement(term6025, 0, -1541981599);
        setIntElement(term6025, 1, 1605456363);
        setIntElement(term6025, 2, 2059896693);
        setIntElement(term6025, 3, 2109912812);
        setIntElement(term6025, 4, 1841286431);
        setIntElement(term6025, 5, -1723168189);
        setElement(term6006, 4, term6025);
        setElement(term6006, 5, term6032);
        setIntElement(term6033, 0, -675283917);
        setIntElement(term6033, 1, -2093862988);
        setIntElement(term6033, 2, 1337828646);
        setIntElement(term6033, 3, 532666604);
        setElement(term6006, 6, term6033);
        setIntElement(term6038, 0, -13725716);
        setIntElement(term6038, 1, -1695750603);
        setIntElement(term6038, 2, 63677360);
        setIntElement(term6038, 3, 1478914037);
        setIntElement(term6038, 4, 1630231519);
        setIntElement(term6038, 5, 1460702778);
        setIntElement(term6038, 6, -1398142433);
        setIntElement(term6038, 7, -1112119058);
        setIntElement(term6038, 8, 2073858334);
        setElement(term6006, 7, term6038);
        setField(term5962, term5962.getClass(), "adjPos", term6006);
        setDoubleElement(term6048, 0, 0.4467038308214477);
        setDoubleElement(term6048, 1, 0.6987261712647458);
        setDoubleElement(term6048, 2, 0.027581863399333106);
        setField(term5962, term5962.getClass(), "vertexWeight", term6048);
        setIntField(term5962, term5962.getClass(), "vertexDataSize", 1);
        setElement(term6053, 0, term6054);
        setDoubleElement(term6056, 0, 0.20990155104119645);
        setDoubleElement(term6056, 1, 0.9249913556195489);
        setDoubleElement(term6056, 2, 0.1877052577832934);
        setElement(term6055, 0, term6056);
        setDoubleElement(term6060, 0, 0.23668713227491267);
        setDoubleElement(term6060, 1, 0.9239377572164318);
        setDoubleElement(term6060, 2, 0.6813010351714496);
        setElement(term6055, 1, term6060);
        setElement(term6053, 1, term6055);
        setField(term5962, term5962.getClass(), "edgeData", term6053);
        setIntField(term5962, term5962.getClass(), "edgeDataSize", 1);
        setElement(term6065, 0, term6066);
        setElement(term6065, 1, term6067);
        setElement(term6065, 2, term6068);
        setElement(term6065, 3, term6069);
        setElement(term6065, 4, term6070);
        setElement(term6065, 5, term6071);
        setElement(term6065, 6, term6072);
        setElement(term6065, 7, term6073);
        setField(term5962, term5962.getClass(), "vertexLabel", term6065);
        setElement(term6074, 0, term6075);
        setElement(term6074, 1, term6076);
        setField(term5962, term5962.getClass(), "edgeLabel", term6074);
        setField(term5962, term5962.getClass(), "vertexIndex", null);
        setField(term5962, term5962.getClass(), "adjSet", term6077);
        setField(term5962, term5962.getClass(), "adjMap", term6078);
        setField(term5962, term5962.getClass(), "maxVertexNumber", term6079);
        setField(term5962, term5962.getClass(), "labelVertexMap", term6081);
        setField(term5962, term5962.getClass(), "labelEdgeMap", term6086);
        setBooleanField(term5962, term5962.getClass(), "directed", false);
        setBooleanField(term5962, term5962.getClass(), "allowingMultipleEdges", true);
        setBooleanField(term5962, term5962.getClass(), "allowingSelfLoops", false);
        setIntField(term5962, term5962.getClass(), "avgDegree", -1693535639);
        setBooleanField(term5962, term5962.getClass(), "safeMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetCache", argTypes, term5962, args);
    }

};


