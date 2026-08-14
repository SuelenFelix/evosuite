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

public class MycielskiGenerator_create_12147881611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2222;
     Object term2229;

    public MycielskiGenerator_create_12147881611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2222 = newInstance(Class.forName("org.graph4j.generators.MycielskiGenerator"));
        int[] term2223 = (int[]) newIntArray(5);
        setIntElement(term2223, 0, -47438786);
        setIntElement(term2223, 1, -1955400589);
        setIntElement(term2223, 2, 626179200);
        setIntElement(term2223, 3, -511077684);
        setIntElement(term2223, 4, -711507760);
        setField(term2222, term2222.getClass(), "vertices", term2223);
        term2229 = new Integer(1053773809);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.MycielskiGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2229;
        callMethod(klass, "create", argTypes, term2222, args);
    }

};


