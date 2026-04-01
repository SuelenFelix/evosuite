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

public class EdgeConnectivityAlgorithm_createNetwork_20325736521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term710;

    public EdgeConnectivityAlgorithm_createNetwork_20325736521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term730 = new Double(0.8474802076607362);
        Integer term733 = new Integer(1622346318);
        term710 = newInstance(Class.forName("org.graph4j.connectivity.EdgeConnectivityAlgorithm"));
        Object term711 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term712 = (int[]) newIntArray(9);
        int[] term722 = (int[]) newIntArray(7);
        Object term732 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setField(term710, term710.getClass(), "network", null);
        setField(term711, term711.getClass(), "graph", null);
        setIntElement(term712, 0, -1882480155);
        setIntElement(term712, 1, -1410220680);
        setIntElement(term712, 2, 389427431);
        setIntElement(term712, 3, -1945706126);
        setIntElement(term712, 4, 1152356969);
        setIntElement(term712, 5, -1667990367);
        setIntElement(term712, 6, -1214628358);
        setIntElement(term712, 7, 1102721075);
        setIntElement(term712, 8, -426764678);
        setField(term711, term711.getClass(), "leftSide", term712);
        setIntElement(term722, 0, -1222614956);
        setIntElement(term722, 1, -1870495012);
        setIntElement(term722, 2, -1310015129);
        setIntElement(term722, 3, -2104981311);
        setIntElement(term722, 4, -571169753);
        setIntElement(term722, 5, 318591690);
        setIntElement(term722, 6, -165587447);
        setField(term711, term711.getClass(), "rightSide", term722);
        setField(term711, term711.getClass(), "weight", term730);
        setField(term732, term732.getClass(), "graph", null);
        setField(term732, term732.getClass(), "map", null);
        setField(term711, term711.getClass(), "edges", term732);
        setField(term710, term710.getClass(), "globalMinCut", term711);
        setField(term710, term710.getClass(), "connectivityNumber", term733);
        setField(term710, term710.getClass(), "graph", null);
        setBooleanField(term710, term710.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.EdgeConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createNetwork", argTypes, term710, args);
    }

};


