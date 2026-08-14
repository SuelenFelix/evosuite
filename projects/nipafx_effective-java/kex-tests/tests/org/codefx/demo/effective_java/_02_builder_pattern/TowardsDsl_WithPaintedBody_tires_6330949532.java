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

public class TowardsDsl_WithPaintedBody_tires_6330949532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8872;
     Object term8877;

    public TowardsDsl_WithPaintedBody_tires_6330949532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8872 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$WithPaintedBody"));
        Object term8873 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Body"));
        Object term8874 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Spoiler"));
        Object term8875 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Paint"));
        Object term8876 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Decal"));
        setField(term8872, term8872.getClass(), "body", term8873);
        setField(term8872, term8872.getClass(), "spoiler", term8874);
        setField(term8872, term8872.getClass(), "paint", term8875);
        setField(term8872, term8872.getClass(), "decal", term8876);
        term8877 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Tires"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$WithPaintedBody");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Tires");
        Object[] args = new Object[1];
        args[0] = term8877;
        callMethod(klass, "tires", argTypes, term8872, args);
    }

};


