package org.graph4j.spanning;

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
import static org.graph4j.spanning.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class BoruvkaMinimumSpanningTreeDefault_updateCheapestEdges_2417272351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1024;

    public BoruvkaMinimumSpanningTreeDefault_updateCheapestEdges_2417272351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1042 = new Double(0.16828712051665362);
        Double term1044 = new Double(0.5975949169840026);
        Double term1046 = new Double(0.5125207579363754);
        Double term1048 = new Double(0.1682247220070444);
        Double term1050 = new Double(0.040825355718595024);
        Double term1057 = new Double(0.19754021671358302);
        Double term1059 = new Double(0.905102212387978);
        Double term1066 = new Double(0.8248232334502307);
        Double term1068 = new Double(0.4342455781017177);
        Double term1070 = new Double(0.3169119418035211);
        Double term1072 = new Double(0.9171660240493722);
        Double term1074 = new Double(0.9172575643210912);
        Double term1076 = new Double(0.9776553509238997);
        Double term1083 = new Double(0.9214187038380094);
        Double term1090 = new Double(0.1240028694334625);
        Double term1092 = new Double(0.9336699309532178);
        Double term1094 = new Double(0.18721227989825073);
        Double term1096 = new Double(0.2131256081762306);
        Double term1098 = new Double(0.03588195391803095);
        Double term1100 = new Double(0.7965158013308613);
        Double term1107 = new Double(0.2875565287844002);
        Double term1109 = new Double(0.18556961666156768);
        Double term1111 = new Double(0.41801713209224123);
        Double term1113 = new Double(0.010058361776520197);
        Double term1115 = new Double(0.22206025307636057);
        Double term1117 = new Double(0.3762445362551795);
        Double term1119 = new Double(0.6004517527698794);
        Double term1121 = new Double(0.9412219458975137);
        Double term1128 = new Double(0.06469331916225318);
        Double term1130 = new Double(0.9259830415214885);
        Double term1132 = new Double(0.6688842921741369);
        Double term1134 = new Double(0.8067108928296716);
        Double term1136 = new Double(0.6293118636954493);
        Double term1139 = new Double(0.7705839211434976);
        term1024 = newInstance(Class.forName("org.graph4j.spanning.BoruvkaMinimumSpanningTreeDefault"));
        Object term1025 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term1028 = (int[]) newIntArray(6);
        Object[] term1036 = (Object[]) newArray("org.graph4j.Edge", 7);
        Object term1037 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1041 = (Object[]) newArray("java.lang.Double", 5);
        Object term1052 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1056 = (Object[]) newArray("java.lang.Double", 2);
        Object term1061 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1065 = (Object[]) newArray("java.lang.Double", 6);
        Object term1078 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1082 = (Object[]) newArray("java.lang.Double", 1);
        Object term1085 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1089 = (Object[]) newArray("java.lang.Double", 6);
        Object term1102 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1106 = (Object[]) newArray("java.lang.Double", 8);
        Object term1123 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1127 = (Object[]) newArray("java.lang.Double", 5);
        Object term1138 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setIntField(term1025, term1025.getClass(), "numVertices", -525257914);
        setBooleanField(term1025, term1025.getClass(), "pathCompression", true);
        setIntElement(term1028, 0, 147209682);
        setIntElement(term1028, 1, 34470066);
        setIntElement(term1028, 2, 2058711405);
        setIntElement(term1028, 3, 1743683601);
        setIntElement(term1028, 4, -945116798);
        setIntElement(term1028, 5, 1593461795);
        setField(term1025, term1025.getClass(), "parent", term1028);
        setIntField(term1025, term1025.getClass(), "numSets", 515182546);
        setField(term1024, term1024.getClass(), "uf", term1025);
        setBooleanField(term1037, term1037.getClass(), "directed", true);
        setIntField(term1037, term1037.getClass(), "source", -936895502);
        setIntField(term1037, term1037.getClass(), "target", -129547140);
        setElement(term1041, 0, term1042);
        setElement(term1041, 1, term1044);
        setElement(term1041, 2, term1046);
        setElement(term1041, 3, term1048);
        setElement(term1041, 4, term1050);
        setField(term1037, term1037.getClass(), "data", term1041);
        setField(term1037, term1037.getClass(), "label", null);
        setElement(term1036, 0, term1037);
        setBooleanField(term1052, term1052.getClass(), "directed", true);
        setIntField(term1052, term1052.getClass(), "source", 199287428);
        setIntField(term1052, term1052.getClass(), "target", -1195339592);
        setElement(term1056, 0, term1057);
        setElement(term1056, 1, term1059);
        setField(term1052, term1052.getClass(), "data", term1056);
        setField(term1052, term1052.getClass(), "label", null);
        setElement(term1036, 1, term1052);
        setBooleanField(term1061, term1061.getClass(), "directed", false);
        setIntField(term1061, term1061.getClass(), "source", -376422566);
        setIntField(term1061, term1061.getClass(), "target", 306847454);
        setElement(term1065, 0, term1066);
        setElement(term1065, 1, term1068);
        setElement(term1065, 2, term1070);
        setElement(term1065, 3, term1072);
        setElement(term1065, 4, term1074);
        setElement(term1065, 5, term1076);
        setField(term1061, term1061.getClass(), "data", term1065);
        setField(term1061, term1061.getClass(), "label", null);
        setElement(term1036, 2, term1061);
        setBooleanField(term1078, term1078.getClass(), "directed", true);
        setIntField(term1078, term1078.getClass(), "source", 1745276158);
        setIntField(term1078, term1078.getClass(), "target", 2009020256);
        setElement(term1082, 0, term1083);
        setField(term1078, term1078.getClass(), "data", term1082);
        setField(term1078, term1078.getClass(), "label", null);
        setElement(term1036, 3, term1078);
        setBooleanField(term1085, term1085.getClass(), "directed", false);
        setIntField(term1085, term1085.getClass(), "source", 2049577015);
        setIntField(term1085, term1085.getClass(), "target", 1236004505);
        setElement(term1089, 0, term1090);
        setElement(term1089, 1, term1092);
        setElement(term1089, 2, term1094);
        setElement(term1089, 3, term1096);
        setElement(term1089, 4, term1098);
        setElement(term1089, 5, term1100);
        setField(term1085, term1085.getClass(), "data", term1089);
        setField(term1085, term1085.getClass(), "label", null);
        setElement(term1036, 4, term1085);
        setBooleanField(term1102, term1102.getClass(), "directed", false);
        setIntField(term1102, term1102.getClass(), "source", 1050765721);
        setIntField(term1102, term1102.getClass(), "target", 474518942);
        setElement(term1106, 0, term1107);
        setElement(term1106, 1, term1109);
        setElement(term1106, 2, term1111);
        setElement(term1106, 3, term1113);
        setElement(term1106, 4, term1115);
        setElement(term1106, 5, term1117);
        setElement(term1106, 6, term1119);
        setElement(term1106, 7, term1121);
        setField(term1102, term1102.getClass(), "data", term1106);
        setField(term1102, term1102.getClass(), "label", null);
        setElement(term1036, 5, term1102);
        setBooleanField(term1123, term1123.getClass(), "directed", false);
        setIntField(term1123, term1123.getClass(), "source", -1656687479);
        setIntField(term1123, term1123.getClass(), "target", -249614216);
        setElement(term1127, 0, term1128);
        setElement(term1127, 1, term1130);
        setElement(term1127, 2, term1132);
        setElement(term1127, 3, term1134);
        setElement(term1127, 4, term1136);
        setField(term1123, term1123.getClass(), "data", term1127);
        setField(term1123, term1123.getClass(), "label", null);
        setElement(term1036, 6, term1123);
        setField(term1024, term1024.getClass(), "cheapest", term1036);
        setField(term1024, term1024.getClass(), "tree", null);
        setField(term1138, term1138.getClass(), "graph", null);
        setField(term1138, term1138.getClass(), "map", null);
        setField(term1024, term1024.getClass(), "treeEdges", term1138);
        setField(term1024, term1024.getClass(), "minWeight", term1139);
        setField(term1024, term1024.getClass(), "graph", null);
        setBooleanField(term1024, term1024.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.BoruvkaMinimumSpanningTreeDefault");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateCheapestEdges", argTypes, term1024, args);
    }

};


