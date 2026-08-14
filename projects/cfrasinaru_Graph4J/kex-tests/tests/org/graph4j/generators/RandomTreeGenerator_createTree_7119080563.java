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

public class RandomTreeGenerator_createTree_7119080563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2114;

    public RandomTreeGenerator_createTree_7119080563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2114 = newInstance(Class.forName("org.graph4j.generators.RandomTreeGenerator"));
        int[] term2115 = (int[]) newIntArray(4);
        setIntElement(term2115, 0, 1349815364);
        setIntElement(term2115, 1, 2128383340);
        setIntElement(term2115, 2, 1238598518);
        setIntElement(term2115, 3, -558146961);
        setField(term2114, term2114.getClass(), "vertices", term2115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomTreeGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createTree", argTypes, term2114, args);
    }

};


