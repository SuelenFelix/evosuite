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

public class EdgeConnectivityAlgorithm_getMaximumDisjointPaths_2849040524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term796;
     Object term817;
     Object term819;

    public EdgeConnectivityAlgorithm_getMaximumDisjointPaths_2849040524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term811 = new Double(0.1374549299694151);
        Integer term814 = new Integer(-6029667);
        term796 = newInstance(Class.forName("org.graph4j.connectivity.EdgeConnectivityAlgorithm"));
        Object term797 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term798 = (int[]) newIntArray(2);
        int[] term801 = (int[]) newIntArray(9);
        Object term813 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setField(term796, term796.getClass(), "network", null);
        setField(term797, term797.getClass(), "graph", null);
        setIntElement(term798, 0, -159494544);
        setIntElement(term798, 1, -75206835);
        setField(term797, term797.getClass(), "leftSide", term798);
        setIntElement(term801, 0, -1618206977);
        setIntElement(term801, 1, -1747406163);
        setIntElement(term801, 2, 388157121);
        setIntElement(term801, 3, 1684998508);
        setIntElement(term801, 4, -1476644457);
        setIntElement(term801, 5, 1270666529);
        setIntElement(term801, 6, -1146679443);
        setIntElement(term801, 7, -860131894);
        setIntElement(term801, 8, -1022990421);
        setField(term797, term797.getClass(), "rightSide", term801);
        setField(term797, term797.getClass(), "weight", term811);
        setField(term813, term813.getClass(), "graph", null);
        setField(term813, term813.getClass(), "map", null);
        setField(term797, term797.getClass(), "edges", term813);
        setField(term796, term796.getClass(), "globalMinCut", term797);
        setField(term796, term796.getClass(), "connectivityNumber", term814);
        setField(term796, term796.getClass(), "graph", null);
        setBooleanField(term796, term796.getClass(), "directed", true);
        term817 = new Integer(1045547089);
        term819 = new Integer(-1122880881);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.EdgeConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term817;
        args[1] = term819;
        callMethod(klass, "getMaximumDisjointPaths", argTypes, term796, args);
    }

};


