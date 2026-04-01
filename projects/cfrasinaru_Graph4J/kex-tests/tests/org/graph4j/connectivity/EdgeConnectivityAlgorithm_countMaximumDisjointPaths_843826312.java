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

public class EdgeConnectivityAlgorithm_countMaximumDisjointPaths_843826312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term752;
     Object term768;
     Object term770;

    public EdgeConnectivityAlgorithm_countMaximumDisjointPaths_843826312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term762 = new Double(0.5183269973490326);
        Integer term765 = new Integer(1048535127);
        term752 = newInstance(Class.forName("org.graph4j.connectivity.EdgeConnectivityAlgorithm"));
        Object term753 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term754 = (int[]) newIntArray(4);
        int[] term759 = (int[]) newIntArray(2);
        Object term764 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setField(term752, term752.getClass(), "network", null);
        setField(term753, term753.getClass(), "graph", null);
        setIntElement(term754, 0, -1347358701);
        setIntElement(term754, 1, 806595993);
        setIntElement(term754, 2, 548228925);
        setIntElement(term754, 3, -749861210);
        setField(term753, term753.getClass(), "leftSide", term754);
        setIntElement(term759, 0, 1694224101);
        setIntElement(term759, 1, 937859191);
        setField(term753, term753.getClass(), "rightSide", term759);
        setField(term753, term753.getClass(), "weight", term762);
        setField(term764, term764.getClass(), "graph", null);
        setField(term764, term764.getClass(), "map", null);
        setField(term753, term753.getClass(), "edges", term764);
        setField(term752, term752.getClass(), "globalMinCut", term753);
        setField(term752, term752.getClass(), "connectivityNumber", term765);
        setField(term752, term752.getClass(), "graph", null);
        setBooleanField(term752, term752.getClass(), "directed", false);
        term768 = new Integer(-916584829);
        term770 = new Integer(-2131181468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.EdgeConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term768;
        args[1] = term770;
        callMethod(klass, "countMaximumDisjointPaths", argTypes, term752, args);
    }

};


