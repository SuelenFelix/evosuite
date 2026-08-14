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

public class TowardsDsl_WithConvertibleBody_spoiler_9707872074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7911;

    public TowardsDsl_WithConvertibleBody_spoiler_9707872074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7911 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$WithConvertibleBody"));
        setField(term7911, term7911.getClass(), "body", null);
        setField(term7911, term7911.getClass(), "spoiler", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$WithConvertibleBody");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.TowardsDsl$RearSpoiler");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "spoiler", argTypes, term7911, args);
    }

};


