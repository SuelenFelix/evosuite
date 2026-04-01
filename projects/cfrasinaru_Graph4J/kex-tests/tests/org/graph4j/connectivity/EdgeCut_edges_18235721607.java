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
import java.lang.Double;
import java.lang.Object;

public class EdgeCut_edges_18235721607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6585;

    public EdgeCut_edges_18235721607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term6593 = new Double(0.43337207054070237);
        term6585 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term6586 = (int[]) newIntArray(0);
        int[] term6587 = (int[]) newIntArray(5);
        Object term6595 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setField(term6585, term6585.getClass(), "graph", null);
        setField(term6585, term6585.getClass(), "leftSide", term6586);
        setIntElement(term6587, 0, -1138616222);
        setIntElement(term6587, 1, 285368240);
        setIntElement(term6587, 2, 1526503433);
        setIntElement(term6587, 3, 1765728316);
        setIntElement(term6587, 4, -1459041031);
        setField(term6585, term6585.getClass(), "rightSide", term6587);
        setField(term6585, term6585.getClass(), "weight", term6593);
        setField(term6595, term6595.getClass(), "graph", null);
        setField(term6595, term6595.getClass(), "map", null);
        setField(term6585, term6585.getClass(), "edges", term6595);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.EdgeCut");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "edges", argTypes, term6585, args);
    }

};


