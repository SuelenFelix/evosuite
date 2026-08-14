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

public class FanGenerator_getPathGraph_777556013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2201;

    public FanGenerator_getPathGraph_777556013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2201 = newInstance(Class.forName("org.graph4j.generators.FanGenerator"));
        int[] term2204 = (int[]) newIntArray(2);
        setIntField(term2201, term2201.getClass(), "emptyGraphNumVertices", -1790275458);
        setIntField(term2201, term2201.getClass(), "pathGraphNumVertices", -497534255);
        setField(term2201, term2201.getClass(), "emptyGraph", null);
        setField(term2201, term2201.getClass(), "pathGraph", null);
        setIntElement(term2204, 0, 1588942911);
        setIntElement(term2204, 1, -2129828854);
        setField(term2201, term2201.getClass(), "vertices", term2204);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.FanGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathGraph", argTypes, term2201, args);
    }

};


