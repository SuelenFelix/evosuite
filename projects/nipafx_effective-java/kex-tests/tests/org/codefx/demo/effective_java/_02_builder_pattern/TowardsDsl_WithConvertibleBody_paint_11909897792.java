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

public class TowardsDsl_WithConvertibleBody_paint_11909897792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7907;
     Object term7910;

    public TowardsDsl_WithConvertibleBody_paint_11909897792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7907 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$WithConvertibleBody"));
        Object term7908 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$ConvertibleBody"));
        Object term7909 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$RearSpoiler"));
        setField(term7907, term7907.getClass(), "body", term7908);
        setField(term7907, term7907.getClass(), "spoiler", term7909);
        term7910 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Paint"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$WithConvertibleBody");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Paint");
        Object[] args = new Object[1];
        args[0] = term7910;
        callMethod(klass, "paint", argTypes, term7907, args);
    }

};


