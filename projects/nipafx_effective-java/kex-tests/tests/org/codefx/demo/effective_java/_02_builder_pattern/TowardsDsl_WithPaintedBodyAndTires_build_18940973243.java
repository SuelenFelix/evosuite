package org.codefx.demo.effective_java._02_builder_pattern;

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
import static org.codefx.demo.effective_java._02_builder_pattern.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TowardsDsl_WithPaintedBodyAndTires_build_18940973243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227;

    public TowardsDsl_WithPaintedBodyAndTires_build_18940973243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$WithPaintedBodyAndTires"));
        setField(term227, term227.getClass(), "body", null);
        setField(term227, term227.getClass(), "spoiler", null);
        setField(term227, term227.getClass(), "paint", null);
        setField(term227, term227.getClass(), "decal", null);
        setField(term227, term227.getClass(), "tires", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$WithPaintedBodyAndTires");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term227, args);
    }

};


