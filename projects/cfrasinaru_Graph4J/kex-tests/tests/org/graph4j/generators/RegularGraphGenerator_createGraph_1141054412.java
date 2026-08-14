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

public class RegularGraphGenerator_createGraph_1141054412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1454;

    public RegularGraphGenerator_createGraph_1141054412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1454 = newInstance(Class.forName("org.graph4j.generators.RegularGraphGenerator"));
        int[] term1456 = (int[]) newIntArray(5);
        setIntField(term1454, term1454.getClass(), "degree", -19246901);
        setIntElement(term1456, 0, -370828664);
        setIntElement(term1456, 1, 1168633950);
        setIntElement(term1456, 2, 1607082164);
        setIntElement(term1456, 3, 1890399366);
        setIntElement(term1456, 4, -1867239125);
        setField(term1454, term1454.getClass(), "vertices", term1456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RegularGraphGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createGraph", argTypes, term1454, args);
    }

};


