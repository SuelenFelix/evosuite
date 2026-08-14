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

public class Lens_of_2612075698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183;

    public Lens_of_2612075698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183 = newInstance(Class.forName("com.vivek.pattern.Lens"));
        setField(term183, term183.getClass(), "getter", null);
        setField(term183, term183.getClass(), "setter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.vivek.pattern.Lens");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.function.Function");
        argTypes[1] = Class.forName("java.util.function.BiFunction");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "of", argTypes, term183, args);
    }

};


