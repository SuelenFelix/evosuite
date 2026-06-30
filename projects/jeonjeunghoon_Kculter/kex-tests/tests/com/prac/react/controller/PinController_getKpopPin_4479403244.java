package com.prac.react.controller;

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
import static com.prac.react.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PinController_getKpopPin_4479403244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term749;

    public PinController_getKpopPin_4479403244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term749 = newInstance(Class.forName("com.prac.react.controller.PinController"));
        setField(term749, term749.getClass(), "logger", null);
        setField(term749, term749.getClass(), "ps", null);
        setField(term749, term749.getClass(), "encryption", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.controller.PinController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getKpopPin", argTypes, term749, args);
    }

};


