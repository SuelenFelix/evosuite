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

public class GraphImpl_checkVertex_213760964323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8995;
     Object term9116;

    public GraphImpl_checkVertex_213760964323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9099 = new Integer(-2068769794);
        HashMap term9101 = new HashMap();
        HashMap term9106 = new HashMap();
        term8995 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        int[] term9011 = (int[]) newIntArray(5);
        int[] term9017 = (int[]) newIntArray(7);
        Object[] term9025 = (Object[]) newArray("[I", 2);
        int[] term9026 = (int[]) newIntArray(0);
        int[] term9027 = (int[]) newIntArray(2);
        Object[] term9030 = (Object[]) newArray("[I", 6);
        int[] term9031 = (int[]) newIntArray(4);
        int[] term9036 = (int[]) newIntArray(8);
        int[] term9045 = (int[]) newIntArray(8);
        int[] term9054 = (int[]) newIntArray(4);
        int[] term9059 = (int[]) newIntArray(8);
        int[] term9068 = (int[]) newIntArray(3);
        double[] term9072 = (double[]) newDoubleArray(2);
        Object[] term9076 = (Object[]) newArray("[[D", 0);
        Object[] term9078 = (Object[]) newArray("java.lang.Object", 0);
        Object[] term9079 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Object"), 0).getClass(), 7);
        Object[] term9080 = (Object[]) newArray("java.lang.Object", 0);
        Object[] term9081 = (Object[]) newArray("java.lang.Object", 3);
        Object term9082 = newInstance(Class.forName("java.lang.Object"));
        Object term9083 = newInstance(Class.forName("java.lang.Object"));
        Object term9084 = newInstance(Class.forName("java.lang.Object"));
        Object[] term9085 = (Object[]) newArray("java.lang.Object", 4);
        Object term9086 = newInstance(Class.forName("java.lang.Object"));
        Object term9087 = newInstance(Class.forName("java.lang.Object"));
        Object term9088 = newInstance(Class.forName("java.lang.Object"));
        Object term9089 = newInstance(Class.forName("java.lang.Object"));
        Object[] term9090 = (Object[]) newArray("java.lang.Object", 9);
        Object term9091 = newInstance(Class.forName("java.lang.Object"));
        Object term9092 = newInstance(Class.forName("java.lang.Object"));
        Object term9093 = newInstance(Class.forName("java.lang.Object"));
        Object[] term9094 = (Object[]) newArray("java.lang.Object", 4);
        Object[] term9095 = (Object[]) newArray("java.lang.Object", 2);
        Object[] term9096 = (Object[]) newArray("java.lang.Object", 4);
        Object[] term9097 = (Object[]) newArray("org.graph4j.AdjacencySet", 6);
        Object[] term9098 = (Object[]) newArray("org.graph4j.AdjacencyMap", 9);
        setField(term8995, term8995.getClass(), "name", "xOEqzGAmDU");
        setIntField(term8995, term8995.getClass(), "maxVertices", -191639503);
        setIntField(term8995, term8995.getClass(), "numVertices", -1563700756);
        setLongField(term8995, term8995.getClass(), "numEdges", 8059786003080744426L);
        setIntElement(term9011, 0, -208314837);
        setIntElement(term9011, 1, 697841387);
        setIntElement(term9011, 2, -1749591213);
        setIntElement(term9011, 3, 1703093401);
        setIntElement(term9011, 4, 47607734);
        setField(term8995, term8995.getClass(), "vertices", term9011);
        setIntElement(term9017, 0, 1717232691);
        setIntElement(term9017, 1, -938127737);
        setIntElement(term9017, 2, -1408678076);
        setIntElement(term9017, 3, 1201413899);
        setIntElement(term9017, 4, -376722373);
        setIntElement(term9017, 5, 1180687854);
        setIntElement(term9017, 6, 328631288);
        setField(term8995, term8995.getClass(), "degree", term9017);
        setElement(term9025, 0, term9026);
        setIntElement(term9027, 0, -1631415805);
        setIntElement(term9027, 1, 1073400519);
        setElement(term9025, 1, term9027);
        setField(term8995, term8995.getClass(), "adjList", term9025);
        setIntElement(term9031, 0, -2025555268);
        setIntElement(term9031, 1, -746950289);
        setIntElement(term9031, 2, -137577510);
        setIntElement(term9031, 3, 719185716);
        setElement(term9030, 0, term9031);
        setIntElement(term9036, 0, 1624820010);
        setIntElement(term9036, 1, -831921156);
        setIntElement(term9036, 2, -2085566906);
        setIntElement(term9036, 3, 1773193728);
        setIntElement(term9036, 4, -1341357647);
        setIntElement(term9036, 5, 138447019);
        setIntElement(term9036, 6, 114915275);
        setIntElement(term9036, 7, 338519695);
        setElement(term9030, 1, term9036);
        setIntElement(term9045, 0, 2025566580);
        setIntElement(term9045, 1, -1231122778);
        setIntElement(term9045, 2, 1923558221);
        setIntElement(term9045, 3, 1762934060);
        setIntElement(term9045, 4, -859828739);
        setIntElement(term9045, 5, 1986855642);
        setIntElement(term9045, 6, 1280322790);
        setIntElement(term9045, 7, -1702209203);
        setElement(term9030, 2, term9045);
        setIntElement(term9054, 0, -1592307668);
        setIntElement(term9054, 1, -203832871);
        setIntElement(term9054, 2, 1151963130);
        setIntElement(term9054, 3, -1855819749);
        setElement(term9030, 3, term9054);
        setIntElement(term9059, 0, 1059048043);
        setIntElement(term9059, 1, 537273345);
        setIntElement(term9059, 2, -346107257);
        setIntElement(term9059, 3, -1577393360);
        setIntElement(term9059, 4, 1112256038);
        setIntElement(term9059, 5, -441333794);
        setIntElement(term9059, 6, 1504698817);
        setIntElement(term9059, 7, -2018333791);
        setElement(term9030, 4, term9059);
        setIntElement(term9068, 0, -742476678);
        setIntElement(term9068, 1, -824369460);
        setIntElement(term9068, 2, -1573760035);
        setElement(term9030, 5, term9068);
        setField(term8995, term8995.getClass(), "adjPos", term9030);
        setDoubleElement(term9072, 0, 0.2438116092887026);
        setDoubleElement(term9072, 1, 0.8359034876515007);
        setField(term8995, term8995.getClass(), "vertexWeight", term9072);
        setIntField(term8995, term8995.getClass(), "vertexDataSize", 1);
        setField(term8995, term8995.getClass(), "edgeData", term9076);
        setIntField(term8995, term8995.getClass(), "edgeDataSize", 1);
        setField(term8995, term8995.getClass(), "vertexLabel", term9078);
        setElement(term9079, 0, term9080);
        setElement(term9081, 0, term9082);
        setElement(term9081, 1, term9083);
        setElement(term9081, 2, term9084);
        setElement(term9079, 1, term9081);
        setElement(term9085, 0, term9086);
        setElement(term9085, 1, term9087);
        setElement(term9085, 2, term9088);
        setElement(term9085, 3, term9089);
        setElement(term9079, 2, term9085);
        setElement(term9090, 0, term9091);
        setElement(term9090, 1, term9092);
        setElement(term9090, 2, term9093);
        setElement(term9090, 3, term9091);
        setElement(term9090, 4, term9092);
        setElement(term9090, 5, term9082);
        setElement(term9090, 6, term9088);
        setElement(term9090, 7, term9086);
        setElement(term9090, 8, term9083);
        setElement(term9079, 3, term9090);
        setElement(term9094, 0, term9083);
        setElement(term9094, 1, term9093);
        setElement(term9094, 2, term9091);
        setElement(term9094, 3, term9091);
        setElement(term9079, 4, term9094);
        setElement(term9095, 0, term9087);
        setElement(term9095, 1, term9093);
        setElement(term9079, 5, term9095);
        setElement(term9096, 0, term9091);
        setElement(term9096, 1, term9088);
        setElement(term9096, 2, term9084);
        setElement(term9096, 3, term9087);
        setElement(term9079, 6, term9096);
        setField(term8995, term8995.getClass(), "edgeLabel", term9079);
        setField(term8995, term8995.getClass(), "vertexIndex", null);
        setField(term8995, term8995.getClass(), "adjSet", term9097);
        setField(term8995, term8995.getClass(), "adjMap", term9098);
        setField(term8995, term8995.getClass(), "maxVertexNumber", term9099);
        setField(term8995, term8995.getClass(), "labelVertexMap", term9101);
        setField(term8995, term8995.getClass(), "labelEdgeMap", term9106);
        setBooleanField(term8995, term8995.getClass(), "directed", false);
        setBooleanField(term8995, term8995.getClass(), "allowingMultipleEdges", true);
        setBooleanField(term8995, term8995.getClass(), "allowingSelfLoops", false);
        setIntField(term8995, term8995.getClass(), "avgDegree", -1147965121);
        setBooleanField(term8995, term8995.getClass(), "safeMode", true);
        term9116 = new Integer(-867099093);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9116;
        callMethod(klass, "checkVertex", argTypes, term8995, args);
    }

};


