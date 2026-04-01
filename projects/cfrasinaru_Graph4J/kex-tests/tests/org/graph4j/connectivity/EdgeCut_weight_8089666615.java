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

public class EdgeCut_weight_8089666615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6515;

    public EdgeCut_weight_8089666615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term6532 = new Double(0.2109867221632754);
        term6515 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term6516 = (int[]) newIntArray(7);
        int[] term6524 = (int[]) newIntArray(7);
        Object term6534 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setField(term6515, term6515.getClass(), "graph", null);
        setIntElement(term6516, 0, 1806294616);
        setIntElement(term6516, 1, 1766086753);
        setIntElement(term6516, 2, -1211119545);
        setIntElement(term6516, 3, 1584121590);
        setIntElement(term6516, 4, 1133839602);
        setIntElement(term6516, 5, -986002923);
        setIntElement(term6516, 6, 724930183);
        setField(term6515, term6515.getClass(), "leftSide", term6516);
        setIntElement(term6524, 0, 1053680722);
        setIntElement(term6524, 1, -1920949340);
        setIntElement(term6524, 2, 1211730228);
        setIntElement(term6524, 3, 892506528);
        setIntElement(term6524, 4, -1203169418);
        setIntElement(term6524, 5, -938772433);
        setIntElement(term6524, 6, 46527533);
        setField(term6515, term6515.getClass(), "rightSide", term6524);
        setField(term6515, term6515.getClass(), "weight", term6532);
        setField(term6534, term6534.getClass(), "graph", null);
        setField(term6534, term6534.getClass(), "map", null);
        setField(term6515, term6515.getClass(), "edges", term6534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.EdgeCut");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "weight", argTypes, term6515, args);
    }

};


