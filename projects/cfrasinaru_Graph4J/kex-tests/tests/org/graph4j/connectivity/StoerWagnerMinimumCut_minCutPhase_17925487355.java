package org.graph4j.connectivity;

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
import static org.graph4j.connectivity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Double;
import java.lang.Integer;

public class StoerWagnerMinimumCut_minCutPhase_17925487355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244;

    public StoerWagnerMinimumCut_minCutPhase_17925487355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term271 = new HashMap();
        Double term284 = new Double(0.2641345529914265);
        Integer term286 = new Integer(-2038273078);
        Double term299 = new Double(0.36923381893433327);
        term244 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut"));
        Object term246 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term247 = (int[]) newIntArray(5);
        int[] term253 = (int[]) newIntArray(6);
        boolean[] term261 = (boolean[]) newBooleanArray(5);
        double[] term267 = (double[]) newDoubleArray(3);
        Object term288 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term289 = (int[]) newIntArray(2);
        int[] term292 = (int[]) newIntArray(6);
        Object term301 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term244, term244.getClass(), "ignoreWeights", true);
        setField(term244, term244.getClass(), "workGraph", null);
        setField(term246, term246.getClass(), "graph", null);
        setField(term246, term246.getClass(), "comparator", null);
        setIntElement(term247, 0, -1371869594);
        setIntElement(term247, 1, -2095575670);
        setIntElement(term247, 2, 1225272962);
        setIntElement(term247, 3, 1324040357);
        setIntElement(term247, 4, -1588772968);
        setField(term246, term246.getClass(), "keys", term247);
        setIntElement(term253, 0, -93135961);
        setIntElement(term253, 1, -112921587);
        setIntElement(term253, 2, 933028652);
        setIntElement(term253, 3, 287287233);
        setIntElement(term253, 4, 962840079);
        setIntElement(term253, 5, 1540719661);
        setField(term246, term246.getClass(), "positions", term253);
        setIntField(term246, term246.getClass(), "size", 1265463001);
        setField(term244, term244.getClass(), "maxHeap", term246);
        setBooleanElement(term261, 3, true);
        setBooleanElement(term261, 4, true);
        setField(term244, term244.getClass(), "processed", term261);
        setDoubleElement(term267, 0, 0.9527281779865117);
        setDoubleElement(term267, 1, 0.9828442029246764);
        setDoubleElement(term267, 2, 0.2779719046761513);
        setField(term244, term244.getClass(), "weight", term267);
        setField(term244, term244.getClass(), "vertexMap", term271);
        setField(term244, term244.getClass(), "minWeight", term284);
        setField(term244, term244.getClass(), "minCutVertex", term286);
        setField(term288, term288.getClass(), "graph", null);
        setIntElement(term289, 0, -1465035361);
        setIntElement(term289, 1, 1090617576);
        setField(term288, term288.getClass(), "leftSide", term289);
        setIntElement(term292, 0, -1547384488);
        setIntElement(term292, 1, 1442160736);
        setIntElement(term292, 2, 1114000454);
        setIntElement(term292, 3, -556405712);
        setIntElement(term292, 4, -1772434990);
        setIntElement(term292, 5, -1845499264);
        setField(term288, term288.getClass(), "rightSide", term292);
        setField(term288, term288.getClass(), "weight", term299);
        setField(term301, term301.getClass(), "graph", null);
        setField(term301, term301.getClass(), "map", null);
        setField(term288, term288.getClass(), "edges", term301);
        setField(term244, term244.getClass(), "minCut", term288);
        setField(term244, term244.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "minCutPhase", argTypes, term244, args);
    }

};


