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

public class DefaultValues_isQuirkJump_107725274957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6599;

    public DefaultValues_isQuirkJump_107725274957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6599 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6599, term6599.getClass(), "rebindLayout", null);
        setField(term6599, term6599.getClass(), "mouseKbLayout", null);
        setField(term6599, term6599.getClass(), "bgColor", null);
        setField(term6599, term6599.getClass(), "spriteColor", null);
        setField(term6599, term6599.getClass(), "planeColor", null);
        setField(term6599, term6599.getClass(), "bothColor", null);
        setField(term6599, term6599.getClass(), "printSymbol", null);
        setBooleanField(term6599, term6599.getClass(), "printToConsole", false);
        setBooleanField(term6599, term6599.getClass(), "disableUiUpdates", false);
        setBooleanField(term6599, term6599.getClass(), "roundPixels", false);
        setBooleanField(term6599, term6599.getClass(), "blur", false);
        setBooleanField(term6599, term6599.getClass(), "glow", false);
        setDoubleField(term6599, term6599.getClass(), "blurValue", 0.0);
        setDoubleField(term6599, term6599.getClass(), "glowValue", 0.0);
        setBooleanField(term6599, term6599.getClass(), "quirkShift", false);
        setBooleanField(term6599, term6599.getClass(), "quirkJump", false);
        setBooleanField(term6599, term6599.getClass(), "quirkIndex", false);
        setBooleanField(term6599, term6599.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isQuirkJump", argTypes, term6599, args);
    }

};


