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

public class TowardsDsl_WithPaintedBody_init_21215167520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8863;
     Object term8864;
     Object term8865;

    public TowardsDsl_WithPaintedBody_init_21215167520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8863 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Body"));
        term8864 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Spoiler"));
        term8865 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Paint"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$WithPaintedBody");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Body");
        argTypes[1] = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Spoiler");
        argTypes[2] = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Paint");
        Object[] args = new Object[3];
        args[0] = term8863;
        args[1] = term8864;
        args[2] = term8865;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


