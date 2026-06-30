package io.reactive.learning.controller;

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
import static io.reactive.learning.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class Anything_canEqual_5103672639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term828;
     Object term875;

    public Anything_canEqual_5103672639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term865 = new HashMap();
        term828 = newInstance(Class.forName("io.reactive.learning.controller.Anything"));
        setField(term828, term828.getClass(), "url", "ytSBIKXogI");
        setField(term828, term828.getClass(), "method", "nHXjMycHlU");
        setField(term828, term828.getClass(), "origin", "ieCtQFdkii");
        setField(term828, term828.getClass(), "headers", term865);
        term875 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.reactive.learning.controller.Anything");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term875;
        callMethod(klass, "canEqual", argTypes, term828, args);
    }

};


