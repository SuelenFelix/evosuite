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

public class CycleGenerator_createGraph_10943932513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2625;

    public CycleGenerator_createGraph_10943932513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2625 = newInstance(Class.forName("org.graph4j.generators.CycleGenerator"));
        int[] term2626 = (int[]) newIntArray(5);
        setIntElement(term2626, 0, 63677360);
        setIntElement(term2626, 1, 1478914037);
        setIntElement(term2626, 2, 1630231519);
        setIntElement(term2626, 3, 1460702778);
        setIntElement(term2626, 4, -1398142433);
        setField(term2625, term2625.getClass(), "vertices", term2626);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.CycleGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createGraph", argTypes, term2625, args);
    }

};


