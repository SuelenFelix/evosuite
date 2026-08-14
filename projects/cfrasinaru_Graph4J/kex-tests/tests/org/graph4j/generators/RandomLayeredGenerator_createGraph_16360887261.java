package org.graph4j.generators;

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
import static org.graph4j.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RandomLayeredGenerator_createGraph_16360887261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2554;

    public RandomLayeredGenerator_createGraph_16360887261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2554 = newInstance(Class.forName("org.graph4j.generators.RandomLayeredGenerator"));
        int[] term2560 = (int[]) newIntArray(6);
        setIntField(term2554, term2554.getClass(), "numLayers", -886200503);
        setIntField(term2554, term2554.getClass(), "minVerticesLayer", 1136393691);
        setIntField(term2554, term2554.getClass(), "maxVerticesLayer", -1288536479);
        setDoubleField(term2554, term2554.getClass(), "intraLayerEdgeProbability", 0.6355029654528058);
        setDoubleField(term2554, term2554.getClass(), "interLayerEdgeProbability", 0.0022646783892913414);
        setField(term2554, term2554.getClass(), "interLayerDecrease", null);
        setIntElement(term2560, 0, 1092038167);
        setIntElement(term2560, 1, 1879729823);
        setIntElement(term2560, 2, 1443855558);
        setIntElement(term2560, 3, -1933419449);
        setIntElement(term2560, 4, -1804322375);
        setIntElement(term2560, 5, 1595814906);
        setField(term2554, term2554.getClass(), "vertices", term2560);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomLayeredGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createGraph", argTypes, term2554, args);
    }

};


