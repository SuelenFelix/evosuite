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

public class FanGenerator_getEmptyGraph_2081757012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2193;

    public FanGenerator_getEmptyGraph_2081757012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2193 = newInstance(Class.forName("org.graph4j.generators.FanGenerator"));
        int[] term2196 = (int[]) newIntArray(2);
        setIntField(term2193, term2193.getClass(), "emptyGraphNumVertices", -514195141);
        setIntField(term2193, term2193.getClass(), "pathGraphNumVertices", -297946422);
        setField(term2193, term2193.getClass(), "emptyGraph", null);
        setField(term2193, term2193.getClass(), "pathGraph", null);
        setIntElement(term2196, 0, 385463636);
        setIntElement(term2196, 1, -1677599962);
        setField(term2193, term2193.getClass(), "vertices", term2196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.FanGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmptyGraph", argTypes, term2193, args);
    }

};


