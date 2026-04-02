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

public class DefaultValues_setMouseKbLayout_9590470461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6647;

    public DefaultValues_setMouseKbLayout_9590470461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6647 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6647, term6647.getClass(), "rebindLayout", null);
        setField(term6647, term6647.getClass(), "mouseKbLayout", null);
        setField(term6647, term6647.getClass(), "bgColor", null);
        setField(term6647, term6647.getClass(), "spriteColor", null);
        setField(term6647, term6647.getClass(), "planeColor", null);
        setField(term6647, term6647.getClass(), "bothColor", null);
        setField(term6647, term6647.getClass(), "printSymbol", null);
        setBooleanField(term6647, term6647.getClass(), "printToConsole", false);
        setBooleanField(term6647, term6647.getClass(), "disableUiUpdates", false);
        setBooleanField(term6647, term6647.getClass(), "roundPixels", false);
        setBooleanField(term6647, term6647.getClass(), "blur", false);
        setBooleanField(term6647, term6647.getClass(), "glow", false);
        setDoubleField(term6647, term6647.getClass(), "blurValue", 0.0);
        setDoubleField(term6647, term6647.getClass(), "glowValue", 0.0);
        setBooleanField(term6647, term6647.getClass(), "quirkShift", false);
        setBooleanField(term6647, term6647.getClass(), "quirkJump", false);
        setBooleanField(term6647, term6647.getClass(), "quirkIndex", false);
        setBooleanField(term6647, term6647.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMouseKbLayout", argTypes, term6647, args);
    }

};


