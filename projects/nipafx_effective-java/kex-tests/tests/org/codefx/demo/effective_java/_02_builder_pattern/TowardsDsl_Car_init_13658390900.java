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
import java.lang.Object;

public class TowardsDsl_Car_init_13658390900 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210;

    public TowardsDsl_Car_init_13658390900() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$WithPaintedBodyAndTires"));
        Object term211 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Body"));
        Object term212 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Spoiler"));
        Object term213 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Paint"));
        Object term214 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Decal"));
        Object term215 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Tires"));
        setField(term210, term210.getClass(), "body", term211);
        setField(term210, term210.getClass(), "spoiler", term212);
        setField(term210, term210.getClass(), "paint", term213);
        setField(term210, term210.getClass(), "decal", term214);
        setField(term210, term210.getClass(), "tires", term215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Car");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$WithPaintedBodyAndTires");
        Object[] args = new Object[1];
        args[0] = term210;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


