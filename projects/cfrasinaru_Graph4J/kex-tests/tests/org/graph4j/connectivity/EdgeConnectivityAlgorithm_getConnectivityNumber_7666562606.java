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

public class EdgeConnectivityAlgorithm_getConnectivityNumber_7666562606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term868;

    public EdgeConnectivityAlgorithm_getConnectivityNumber_7666562606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term885 = new Double(0.9527281779865117);
        Integer term888 = new Integer(-117576464);
        term868 = newInstance(Class.forName("org.graph4j.connectivity.EdgeConnectivityAlgorithm"));
        Object term869 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term870 = (int[]) newIntArray(7);
        int[] term878 = (int[]) newIntArray(6);
        Object term887 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setField(term868, term868.getClass(), "network", null);
        setField(term869, term869.getClass(), "graph", null);
        setIntElement(term870, 0, 1460722225);
        setIntElement(term870, 1, 1743224434);
        setIntElement(term870, 2, 842904495);
        setIntElement(term870, 3, 1008080511);
        setIntElement(term870, 4, 1935707624);
        setIntElement(term870, 5, 1507074215);
        setIntElement(term870, 6, -282881827);
        setField(term869, term869.getClass(), "leftSide", term870);
        setIntElement(term878, 0, -1183353915);
        setIntElement(term878, 1, -420030135);
        setIntElement(term878, 2, 267763294);
        setIntElement(term878, 3, -1497710478);
        setIntElement(term878, 4, 49950830);
        setIntElement(term878, 5, -525257914);
        setField(term869, term869.getClass(), "rightSide", term878);
        setField(term869, term869.getClass(), "weight", term885);
        setField(term887, term887.getClass(), "graph", null);
        setField(term887, term887.getClass(), "map", null);
        setField(term869, term869.getClass(), "edges", term887);
        setField(term868, term868.getClass(), "globalMinCut", term869);
        setField(term868, term868.getClass(), "connectivityNumber", term888);
        setField(term868, term868.getClass(), "graph", null);
        setBooleanField(term868, term868.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.EdgeConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConnectivityNumber", argTypes, term868, args);
    }

};


