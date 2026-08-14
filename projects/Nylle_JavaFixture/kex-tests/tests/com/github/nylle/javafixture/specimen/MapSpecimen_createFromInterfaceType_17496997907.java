package com.github.nylle.javafixture.specimen;

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
import static com.github.nylle.javafixture.specimen.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MapSpecimen_createFromInterfaceType_17496997907 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1476;

    public MapSpecimen_createFromInterfaceType_17496997907() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1476 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.MapSpecimen"));
        setField(term1476, term1476.getClass(), "type", null);
        setField(term1476, term1476.getClass(), "context", null);
        setField(term1476, term1476.getClass(), "keySpecimen", null);
        setField(term1476, term1476.getClass(), "valueSpecimen", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.MapSpecimen");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Class");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createFromInterfaceType", argTypes, term1476, args);
    }

};


