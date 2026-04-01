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

public class GraphImpl_neighbors_199774821451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18892;
     Object term19020;

    public GraphImpl_neighbors_199774821451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term19003 = new Integer(1632125673);
        HashMap term19005 = new HashMap();
        HashMap term19010 = new HashMap();
        term18892 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        int[] term18908 = (int[]) newIntArray(1);
        int[] term18910 = (int[]) newIntArray(4);
        Object[] term18915 = (Object[]) newArray("[I", 3);
        int[] term18916 = (int[]) newIntArray(9);
        int[] term18926 = (int[]) newIntArray(6);
        int[] term18933 = (int[]) newIntArray(2);
        Object[] term18936 = (Object[]) newArray("[I", 1);
        int[] term18937 = (int[]) newIntArray(0);
        double[] term18938 = (double[]) newDoubleArray(3);
        Object[] term18943 = (Object[]) newArray("[[D", 1);
        Object[] term18944 = (Object[]) newArray("[D", 8);
        double[] term18945 = (double[]) newDoubleArray(0);
        double[] term18946 = (double[]) newDoubleArray(0);
        double[] term18947 = (double[]) newDoubleArray(6);
        double[] term18954 = (double[]) newDoubleArray(2);
        double[] term18957 = (double[]) newDoubleArray(5);
        double[] term18963 = (double[]) newDoubleArray(7);
        double[] term18971 = (double[]) newDoubleArray(5);
        double[] term18977 = (double[]) newDoubleArray(8);
        Object[] term18987 = (Object[]) newArray("java.lang.Object", 4);
        Object term18988 = newInstance(Class.forName("java.lang.Object"));
        Object term18989 = newInstance(Class.forName("java.lang.Object"));
        Object term18990 = newInstance(Class.forName("java.lang.Object"));
        Object term18991 = newInstance(Class.forName("java.lang.Object"));
        Object[] term18992 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Object"), 0).getClass(), 2);
        Object[] term18993 = (Object[]) newArray("java.lang.Object", 8);
        Object term18994 = newInstance(Class.forName("java.lang.Object"));
        Object term18995 = newInstance(Class.forName("java.lang.Object"));
        Object term18996 = newInstance(Class.forName("java.lang.Object"));
        Object term18997 = newInstance(Class.forName("java.lang.Object"));
        Object term18998 = newInstance(Class.forName("java.lang.Object"));
        Object term18999 = newInstance(Class.forName("java.lang.Object"));
        Object[] term19000 = (Object[]) newArray("java.lang.Object", 3);
        Object[] term19001 = (Object[]) newArray("org.graph4j.AdjacencySet", 8);
        Object[] term19002 = (Object[]) newArray("org.graph4j.AdjacencyMap", 1);
        setField(term18892, term18892.getClass(), "name", "nGKItKLYNC");
        setIntField(term18892, term18892.getClass(), "maxVertices", -978039004);
        setIntField(term18892, term18892.getClass(), "numVertices", 1162356859);
        setLongField(term18892, term18892.getClass(), "numEdges", -5788180182343976541L);
        setIntElement(term18908, 0, 175338916);
        setField(term18892, term18892.getClass(), "vertices", term18908);
        setIntElement(term18910, 0, -1484528924);
        setIntElement(term18910, 1, -557662858);
        setIntElement(term18910, 2, -477520795);
        setIntElement(term18910, 3, -480468995);
        setField(term18892, term18892.getClass(), "degree", term18910);
        setIntElement(term18916, 0, -2037695985);
        setIntElement(term18916, 1, -2044768479);
        setIntElement(term18916, 2, -2020209498);
        setIntElement(term18916, 3, 754066823);
        setIntElement(term18916, 4, 306903225);
        setIntElement(term18916, 5, -1245754321);
        setIntElement(term18916, 6, 398727237);
        setIntElement(term18916, 7, -1741920202);
        setIntElement(term18916, 8, 1639977614);
        setElement(term18915, 0, term18916);
        setIntElement(term18926, 0, -27270642);
        setIntElement(term18926, 1, -1419515823);
        setIntElement(term18926, 2, 1749999469);
        setIntElement(term18926, 3, -1508018812);
        setIntElement(term18926, 4, -679973960);
        setIntElement(term18926, 5, -85442762);
        setElement(term18915, 1, term18926);
        setIntElement(term18933, 0, 295245507);
        setIntElement(term18933, 1, -1782801582);
        setElement(term18915, 2, term18933);
        setField(term18892, term18892.getClass(), "adjList", term18915);
        setElement(term18936, 0, term18937);
        setField(term18892, term18892.getClass(), "adjPos", term18936);
        setDoubleElement(term18938, 0, 0.9371885781388922);
        setDoubleElement(term18938, 1, 0.9243879320297982);
        setDoubleElement(term18938, 2, 0.31202219369747786);
        setField(term18892, term18892.getClass(), "vertexWeight", term18938);
        setIntField(term18892, term18892.getClass(), "vertexDataSize", 1);
        setElement(term18944, 0, term18945);
        setElement(term18944, 1, term18946);
        setDoubleElement(term18947, 0, 0.12498552911845973);
        setDoubleElement(term18947, 1, 0.7025148793923787);
        setDoubleElement(term18947, 2, 0.647434709006577);
        setDoubleElement(term18947, 3, 0.1831434555915995);
        setDoubleElement(term18947, 4, 0.02012861600270255);
        setDoubleElement(term18947, 5, 0.10027834896076782);
        setElement(term18944, 2, term18947);
        setDoubleElement(term18954, 0, 0.7272300010906679);
        setDoubleElement(term18954, 1, 0.33556539871004765);
        setElement(term18944, 3, term18954);
        setDoubleElement(term18957, 0, 0.9003427907844309);
        setDoubleElement(term18957, 1, 0.436414239849351);
        setDoubleElement(term18957, 2, 0.8184237302705538);
        setDoubleElement(term18957, 3, 0.42582027221938645);
        setDoubleElement(term18957, 4, 0.29964742480125395);
        setElement(term18944, 4, term18957);
        setDoubleElement(term18963, 0, 0.8861748731025759);
        setDoubleElement(term18963, 1, 0.24153332506084868);
        setDoubleElement(term18963, 2, 0.8800004793890692);
        setDoubleElement(term18963, 3, 0.03395467917212536);
        setDoubleElement(term18963, 4, 0.3201867665726761);
        setDoubleElement(term18963, 5, 0.8619967003679674);
        setDoubleElement(term18963, 6, 0.506938544345197);
        setElement(term18944, 5, term18963);
        setDoubleElement(term18971, 0, 0.7634589396750886);
        setDoubleElement(term18971, 1, 0.010028654342789434);
        setDoubleElement(term18971, 2, 0.8936757567778758);
        setDoubleElement(term18971, 3, 0.7729672792830213);
        setDoubleElement(term18971, 4, 0.6659550003724044);
        setElement(term18944, 6, term18971);
        setDoubleElement(term18977, 0, 0.9583568111567629);
        setDoubleElement(term18977, 1, 0.12012757501024551);
        setDoubleElement(term18977, 2, 0.42713335295058596);
        setDoubleElement(term18977, 3, 0.06840506971155969);
        setDoubleElement(term18977, 4, 0.96286077926094);
        setDoubleElement(term18977, 5, 0.7740302712095073);
        setDoubleElement(term18977, 6, 0.10812029189124417);
        setDoubleElement(term18977, 7, 0.33427102202364634);
        setElement(term18944, 7, term18977);
        setElement(term18943, 0, term18944);
        setField(term18892, term18892.getClass(), "edgeData", term18943);
        setIntField(term18892, term18892.getClass(), "edgeDataSize", 1);
        setElement(term18987, 0, term18988);
        setElement(term18987, 1, term18989);
        setElement(term18987, 2, term18990);
        setElement(term18987, 3, term18991);
        setField(term18892, term18892.getClass(), "vertexLabel", term18987);
        setElement(term18993, 0, term18994);
        setElement(term18993, 1, term18995);
        setElement(term18993, 2, term18996);
        setElement(term18993, 3, term18997);
        setElement(term18993, 4, term18998);
        setElement(term18993, 5, term18999);
        setElement(term18993, 6, term18997);
        setElement(term18993, 7, term18998);
        setElement(term18992, 0, term18993);
        setElement(term19000, 0, term18988);
        setElement(term19000, 1, term18995);
        setElement(term19000, 2, term18991);
        setElement(term18992, 1, term19000);
        setField(term18892, term18892.getClass(), "edgeLabel", term18992);
        setField(term18892, term18892.getClass(), "vertexIndex", null);
        setField(term18892, term18892.getClass(), "adjSet", term19001);
        setField(term18892, term18892.getClass(), "adjMap", term19002);
        setField(term18892, term18892.getClass(), "maxVertexNumber", term19003);
        setField(term18892, term18892.getClass(), "labelVertexMap", term19005);
        setField(term18892, term18892.getClass(), "labelEdgeMap", term19010);
        setBooleanField(term18892, term18892.getClass(), "directed", false);
        setBooleanField(term18892, term18892.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term18892, term18892.getClass(), "allowingSelfLoops", true);
        setIntField(term18892, term18892.getClass(), "avgDegree", -112814060);
        setBooleanField(term18892, term18892.getClass(), "safeMode", true);
        term19020 = new Integer(-1111447214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term19020;
        callMethod(klass, "neighbors", argTypes, term18892, args);
    }

};


