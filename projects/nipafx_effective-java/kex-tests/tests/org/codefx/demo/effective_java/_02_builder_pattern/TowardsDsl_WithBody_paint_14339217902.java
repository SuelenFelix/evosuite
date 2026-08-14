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

public class TowardsDsl_WithBody_paint_14339217902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233;
     Object term236;

    public TowardsDsl_WithBody_paint_14339217902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$WithBody"));
        Object term234 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Body"));
        Object term235 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Spoiler"));
        setField(term233, term233.getClass(), "body", term234);
        setField(term233, term233.getClass(), "spoiler", term235);
        term236 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Paint"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$WithBody");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Paint");
        Object[] args = new Object[1];
        args[0] = term236;
        callMethod(klass, "paint", argTypes, term233, args);
    }

};


