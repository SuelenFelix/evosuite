package com.github.hannotify.elevencrazyjavathings.number7;

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
import static com.github.hannotify.elevencrazyjavathings.number7.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Float;

public class Number7DivisionByZero_divide_6834920346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18;
     Object term19;
     Object term21;

    public Number7DivisionByZero_divide_6834920346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18 = newInstance(Class.forName("com.github.hannotify.elevencrazyjavathings.number7.Number7DivisionByZero"));
        term19 = new Float(0.0F);
        term21 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.hannotify.elevencrazyjavathings.number7.Number7DivisionByZero");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = float.class;
        argTypes[1] = float.class;
        Object[] args = new Object[2];
        args[0] = term19;
        args[1] = term21;
        callMethod(klass, "divide", argTypes, term18, args);
    }

};


