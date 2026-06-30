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

public class Anything_getHeaders_10844815103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232;

    public Anything_getHeaders_10844815103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term269 = new HashMap();
        term232 = newInstance(Class.forName("io.reactive.learning.controller.Anything"));
        setField(term232, term232.getClass(), "url", "aJlieCFVtF");
        setField(term232, term232.getClass(), "method", "ZiaGIbnzTs");
        setField(term232, term232.getClass(), "origin", "tbcdzjIfER");
        setField(term232, term232.getClass(), "headers", term269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.reactive.learning.controller.Anything");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeaders", argTypes, term232, args);
    }

};


