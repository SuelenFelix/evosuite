package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Validator_checkVertexOrdering_66178251218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3308;

    public Validator_checkVertexOrdering_66178251218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3308 = (int[]) newIntArray(9);
        setIntElement(term3308, 0, 697841387);
        setIntElement(term3308, 1, -1749591213);
        setIntElement(term3308, 2, 1703093401);
        setIntElement(term3308, 3, 47607734);
        setIntElement(term3308, 4, 1717232691);
        setIntElement(term3308, 5, -938127737);
        setIntElement(term3308, 6, -1408678076);
        setIntElement(term3308, 7, 1201413899);
        setIntElement(term3308, 8, -376722373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Validator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3308;
        callMethod(klass, "checkVertexOrdering", argTypes, null, args);
    }

};


