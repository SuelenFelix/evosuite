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

public class StoerWagnerMinimumCut_getMinimumCutWeight_8219461513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;

    public StoerWagnerMinimumCut_getMinimumCutWeight_8219461513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term109 = new HashMap();
        Double term122 = new Double(0.5523635872663106);
        Integer term124 = new Integer(391863371);
        Double term134 = new Double(0.544608645520025);
        term82 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut"));
        Object term84 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term85 = (int[]) newIntArray(7);
        int[] term93 = (int[]) newIntArray(1);
        boolean[] term96 = (boolean[]) newBooleanArray(6);
        double[] term103 = (double[]) newDoubleArray(5);
        Object term126 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term127 = (int[]) newIntArray(2);
        int[] term130 = (int[]) newIntArray(3);
        Object term136 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term82, term82.getClass(), "ignoreWeights", true);
        setField(term82, term82.getClass(), "workGraph", null);
        setField(term84, term84.getClass(), "graph", null);
        setField(term84, term84.getClass(), "comparator", null);
        setIntElement(term85, 0, -2068769794);
        setIntElement(term85, 1, -117576464);
        setIntElement(term85, 2, -1007160944);
        setIntElement(term85, 3, 1135664017);
        setIntElement(term85, 4, 590364439);
        setIntElement(term85, 5, 865208305);
        setIntElement(term85, 6, -1275173084);
        setField(term84, term84.getClass(), "keys", term85);
        setIntElement(term93, 0, -244121226);
        setField(term84, term84.getClass(), "positions", term93);
        setIntField(term84, term84.getClass(), "size", -203030934);
        setField(term82, term82.getClass(), "maxHeap", term84);
        setBooleanElement(term96, 0, true);
        setBooleanElement(term96, 2, true);
        setBooleanElement(term96, 4, true);
        setField(term82, term82.getClass(), "processed", term96);
        setDoubleElement(term103, 0, 0.28570734989730284);
        setDoubleElement(term103, 1, 0.40176586625454525);
        setDoubleElement(term103, 2, 0.2641345529914265);
        setDoubleElement(term103, 3, 0.36923381893433327);
        setDoubleElement(term103, 4, 0.6076495596892013);
        setField(term82, term82.getClass(), "weight", term103);
        setField(term82, term82.getClass(), "vertexMap", term109);
        setField(term82, term82.getClass(), "minWeight", term122);
        setField(term82, term82.getClass(), "minCutVertex", term124);
        setField(term126, term126.getClass(), "graph", null);
        setIntElement(term127, 0, 679763016);
        setIntElement(term127, 1, 1962444399);
        setField(term126, term126.getClass(), "leftSide", term127);
        setIntElement(term130, 0, 767834723);
        setIntElement(term130, 1, -602026508);
        setIntElement(term130, 2, -157887805);
        setField(term126, term126.getClass(), "rightSide", term130);
        setField(term126, term126.getClass(), "weight", term134);
        setField(term136, term136.getClass(), "graph", null);
        setField(term136, term136.getClass(), "map", null);
        setField(term126, term126.getClass(), "edges", term136);
        setField(term82, term82.getClass(), "minCut", term126);
        setField(term82, term82.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinimumCutWeight", argTypes, term82, args);
    }

};


