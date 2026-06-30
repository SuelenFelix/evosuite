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
import java.util.LinkedHashMap;

public class Anything_setHeaders_7658026767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606;
     Object term653;

    public Anything_setHeaders_7658026767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term643 = new HashMap();
        term606 = newInstance(Class.forName("io.reactive.learning.controller.Anything"));
        setField(term606, term606.getClass(), "url", "nyiiPDVjAc");
        setField(term606, term606.getClass(), "method", "aKnKipADSo");
        setField(term606, term606.getClass(), "origin", "wSQxaModmm");
        setField(term606, term606.getClass(), "headers", term643);
        term653 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.reactive.learning.controller.Anything");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term653;
        callMethod(klass, "setHeaders", argTypes, term606, args);
    }

};


