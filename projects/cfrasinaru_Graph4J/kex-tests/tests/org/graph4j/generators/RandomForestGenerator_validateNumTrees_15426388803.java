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
import java.lang.Integer;

public class RandomForestGenerator_validateNumTrees_15426388803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1555;
     Object term1559;

    public RandomForestGenerator_validateNumTrees_15426388803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1555 = newInstance(Class.forName("org.graph4j.generators.RandomForestGenerator"));
        int[] term1557 = (int[]) newIntArray(1);
        setIntField(term1555, term1555.getClass(), "numTrees", 1289741214);
        setIntElement(term1557, 0, 243280944);
        setField(term1555, term1555.getClass(), "vertices", term1557);
        term1559 = new Integer(-726681073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomForestGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1559;
        callMethod(klass, "validateNumTrees", argTypes, term1555, args);
    }

};


