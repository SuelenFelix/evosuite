package com.vivek.pattern;

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
import static com.vivek.pattern.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Lens_andThen_11583734366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181;
     Object term182;

    public Lens_andThen_11583734366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181 = newInstance(Class.forName("com.vivek.pattern.Lens"));
        setField(term181, term181.getClass(), "getter", null);
        setField(term181, term181.getClass(), "setter", null);
        term182 = newInstance(Class.forName("com.vivek.pattern.Lens"));
        setField(term182, term182.getClass(), "getter", null);
        setField(term182, term182.getClass(), "setter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.vivek.pattern.Lens");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.vivek.pattern.Lens");
        Object[] args = new Object[1];
        args[0] = term182;
        callMethod(klass, "andThen", argTypes, term181, args);
    }

};


