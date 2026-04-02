package com.chip8.configs;

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
import static com.chip8.configs.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DefaultValues_equals_145843715978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6873;

    public DefaultValues_equals_145843715978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6873 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6873, term6873.getClass(), "rebindLayout", null);
        setField(term6873, term6873.getClass(), "mouseKbLayout", null);
        setField(term6873, term6873.getClass(), "bgColor", null);
        setField(term6873, term6873.getClass(), "spriteColor", null);
        setField(term6873, term6873.getClass(), "planeColor", null);
        setField(term6873, term6873.getClass(), "bothColor", null);
        setField(term6873, term6873.getClass(), "printSymbol", null);
        setBooleanField(term6873, term6873.getClass(), "printToConsole", false);
        setBooleanField(term6873, term6873.getClass(), "disableUiUpdates", false);
        setBooleanField(term6873, term6873.getClass(), "roundPixels", false);
        setBooleanField(term6873, term6873.getClass(), "blur", false);
        setBooleanField(term6873, term6873.getClass(), "glow", false);
        setDoubleField(term6873, term6873.getClass(), "blurValue", 0.0);
        setDoubleField(term6873, term6873.getClass(), "glowValue", 0.0);
        setBooleanField(term6873, term6873.getClass(), "quirkShift", false);
        setBooleanField(term6873, term6873.getClass(), "quirkJump", false);
        setBooleanField(term6873, term6873.getClass(), "quirkIndex", false);
        setBooleanField(term6873, term6873.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term6873, args);
    }

};


