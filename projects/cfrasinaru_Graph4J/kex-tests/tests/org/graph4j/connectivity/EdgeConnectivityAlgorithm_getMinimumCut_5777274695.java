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
import java.lang.Double;
import java.lang.Integer;

public class EdgeConnectivityAlgorithm_getMinimumCut_5777274695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term832;

    public EdgeConnectivityAlgorithm_getMinimumCut_5777274695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term849 = new Double(0.7031006357544823);
        Integer term852 = new Integer(-2068769794);
        term832 = newInstance(Class.forName("org.graph4j.connectivity.EdgeConnectivityAlgorithm"));
        Object term833 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term834 = (int[]) newIntArray(6);
        int[] term841 = (int[]) newIntArray(7);
        Object term851 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setField(term832, term832.getClass(), "network", null);
        setField(term833, term833.getClass(), "graph", null);
        setIntElement(term834, 0, -542712742);
        setIntElement(term834, 1, -1254072822);
        setIntElement(term834, 2, -1111249833);
        setIntElement(term834, 3, -1692331299);
        setIntElement(term834, 4, 479531250);
        setIntElement(term834, 5, 1320570890);
        setField(term833, term833.getClass(), "leftSide", term834);
        setIntElement(term841, 0, -130649791);
        setIntElement(term841, 1, 534834644);
        setIntElement(term841, 2, 1959097203);
        setIntElement(term841, 3, -209654048);
        setIntElement(term841, 4, 477625804);
        setIntElement(term841, 5, 252575029);
        setIntElement(term841, 6, 57189932);
        setField(term833, term833.getClass(), "rightSide", term841);
        setField(term833, term833.getClass(), "weight", term849);
        setField(term851, term851.getClass(), "graph", null);
        setField(term851, term851.getClass(), "map", null);
        setField(term833, term833.getClass(), "edges", term851);
        setField(term832, term832.getClass(), "globalMinCut", term833);
        setField(term832, term832.getClass(), "connectivityNumber", term852);
        setField(term832, term832.getClass(), "graph", null);
        setBooleanField(term832, term832.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.EdgeConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinimumCut", argTypes, term832, args);
    }

};


