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

public class TowardsDsl_WithPaintedBodyAndTires_init_18914288022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public TowardsDsl_WithPaintedBodyAndTires_init_18914288022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$WithPaintedBodyAndTires");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Body");
        argTypes[1] = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Spoiler");
        argTypes[2] = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Paint");
        argTypes[3] = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Decal");
        argTypes[4] = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$Tires");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


