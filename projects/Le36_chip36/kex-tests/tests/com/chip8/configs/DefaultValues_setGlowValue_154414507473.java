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
import java.lang.Double;

public class DefaultValues_setGlowValue_154414507473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6803;
     Object term6815;

    public DefaultValues_setGlowValue_154414507473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6803 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6803, term6803.getClass(), "rebindLayout", null);
        setField(term6803, term6803.getClass(), "mouseKbLayout", null);
        setField(term6803, term6803.getClass(), "bgColor", null);
        setField(term6803, term6803.getClass(), "spriteColor", null);
        setField(term6803, term6803.getClass(), "planeColor", null);
        setField(term6803, term6803.getClass(), "bothColor", null);
        setField(term6803, term6803.getClass(), "printSymbol", null);
        setBooleanField(term6803, term6803.getClass(), "printToConsole", false);
        setBooleanField(term6803, term6803.getClass(), "disableUiUpdates", false);
        setBooleanField(term6803, term6803.getClass(), "roundPixels", false);
        setBooleanField(term6803, term6803.getClass(), "blur", false);
        setBooleanField(term6803, term6803.getClass(), "glow", false);
        setDoubleField(term6803, term6803.getClass(), "blurValue", 0.0);
        setDoubleField(term6803, term6803.getClass(), "glowValue", 0.0);
        setBooleanField(term6803, term6803.getClass(), "quirkShift", false);
        setBooleanField(term6803, term6803.getClass(), "quirkJump", false);
        setBooleanField(term6803, term6803.getClass(), "quirkIndex", false);
        setBooleanField(term6803, term6803.getClass(), "quirkOrder", false);
        term6815 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term6815;
        callMethod(klass, "setGlowValue", argTypes, term6803, args);
    }

};


