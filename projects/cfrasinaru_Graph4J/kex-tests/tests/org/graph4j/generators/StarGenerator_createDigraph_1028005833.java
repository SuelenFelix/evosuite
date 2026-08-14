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
import java.lang.Boolean;

public class StarGenerator_createDigraph_1028005833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term790;
     Object term796;

    public StarGenerator_createDigraph_1028005833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term790 = newInstance(Class.forName("org.graph4j.generators.StarGenerator"));
        int[] term792 = (int[]) newIntArray(3);
        setIntField(term790, term790.getClass(), "center", 1320570890);
        setIntElement(term792, 0, -130649791);
        setIntElement(term792, 1, 534834644);
        setIntElement(term792, 2, 1959097203);
        setField(term790, term790.getClass(), "vertices", term792);
        term796 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.StarGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term796;
        callMethod(klass, "createDigraph", argTypes, term790, args);
    }

};


