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

public class StoerWagnerMinimumCut3_getMinimumCut_13277780122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3752;

    public StoerWagnerMinimumCut3_getMinimumCut_13277780122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3782 = new HashMap();
        Double term3795 = new Double(0.9828442029246764);
        Integer term3797 = new Integer(767834723);
        Double term3809 = new Double(0.2779719046761513);
        term3752 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut3"));
        Object term3754 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term3755 = (int[]) newIntArray(5);
        int[] term3761 = (int[]) newIntArray(5);
        boolean[] term3768 = (boolean[]) newBooleanArray(2);
        double[] term3771 = (double[]) newDoubleArray(9);
        Object term3799 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term3800 = (int[]) newIntArray(0);
        int[] term3801 = (int[]) newIntArray(7);
        Object term3811 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term3752, term3752.getClass(), "ignoreWeights", false);
        setField(term3752, term3752.getClass(), "workGraph", null);
        setField(term3754, term3754.getClass(), "graph", null);
        setField(term3754, term3754.getClass(), "comparator", null);
        setIntElement(term3755, 0, 185647247);
        setIntElement(term3755, 1, 720814309);
        setIntElement(term3755, 2, 964137425);
        setIntElement(term3755, 3, -1378885614);
        setIntElement(term3755, 4, -1408615666);
        setField(term3754, term3754.getClass(), "keys", term3755);
        setIntElement(term3761, 0, -502299598);
        setIntElement(term3761, 1, -516287593);
        setIntElement(term3761, 2, -187311406);
        setIntElement(term3761, 3, 1496632406);
        setIntElement(term3761, 4, 1858277277);
        setField(term3754, term3754.getClass(), "positions", term3761);
        setIntField(term3754, term3754.getClass(), "size", 2145928130);
        setField(term3752, term3752.getClass(), "maxHeap", term3754);
        setBooleanElement(term3768, 1, true);
        setField(term3752, term3752.getClass(), "processed", term3768);
        setDoubleElement(term3771, 0, 0.7633268466829064);
        setDoubleElement(term3771, 1, 0.13481025392611334);
        setDoubleElement(term3771, 2, 0.3800088629986428);
        setDoubleElement(term3771, 3, 0.5840714198152577);
        setDoubleElement(term3771, 4, 0.7559240768573477);
        setDoubleElement(term3771, 5, 0.10667076642995188);
        setDoubleElement(term3771, 6, 0.11493000848982304);
        setDoubleElement(term3771, 7, 0.37161417339133307);
        setDoubleElement(term3771, 8, 0.6805867182029153);
        setField(term3752, term3752.getClass(), "weight", term3771);
        setIntField(term3752, term3752.getClass(), "startId", -1095947031);
        setField(term3752, term3752.getClass(), "map", term3782);
        setField(term3752, term3752.getClass(), "minWeight", term3795);
        setField(term3752, term3752.getClass(), "minCutVertex", term3797);
        setField(term3799, term3799.getClass(), "graph", null);
        setField(term3799, term3799.getClass(), "leftSide", term3800);
        setIntElement(term3801, 0, 1078807592);
        setIntElement(term3801, 1, 1673044047);
        setIntElement(term3801, 2, -1835617743);
        setIntElement(term3801, 3, -337695922);
        setIntElement(term3801, 4, 817836900);
        setIntElement(term3801, 5, 1691654567);
        setIntElement(term3801, 6, -1604942135);
        setField(term3799, term3799.getClass(), "rightSide", term3801);
        setField(term3799, term3799.getClass(), "weight", term3809);
        setField(term3811, term3811.getClass(), "graph", null);
        setField(term3811, term3811.getClass(), "map", null);
        setField(term3799, term3799.getClass(), "edges", term3811);
        setField(term3752, term3752.getClass(), "minCut", term3799);
        setField(term3752, term3752.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinimumCut", argTypes, term3752, args);
    }

};


