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

public class DefaultValues_hashCode_190712383439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6107;

    public DefaultValues_hashCode_190712383439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6107 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6107, term6107.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term6107, term6107.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term6107, term6107.getClass(), "bgColor", "0x000000");
        setField(term6107, term6107.getClass(), "spriteColor", "0xFFFFFF");
        setField(term6107, term6107.getClass(), "planeColor", "0x00FF00");
        setField(term6107, term6107.getClass(), "bothColor", "0x4D4D4D");
        setField(term6107, term6107.getClass(), "printSymbol", "#");
        setBooleanField(term6107, term6107.getClass(), "printToConsole", false);
        setBooleanField(term6107, term6107.getClass(), "disableUiUpdates", true);
        setBooleanField(term6107, term6107.getClass(), "roundPixels", true);
        setBooleanField(term6107, term6107.getClass(), "blur", false);
        setBooleanField(term6107, term6107.getClass(), "glow", false);
        setDoubleField(term6107, term6107.getClass(), "blurValue", 0.426231085465289);
        setDoubleField(term6107, term6107.getClass(), "glowValue", 0.0027299293098262956);
        setBooleanField(term6107, term6107.getClass(), "quirkShift", false);
        setBooleanField(term6107, term6107.getClass(), "quirkJump", false);
        setBooleanField(term6107, term6107.getClass(), "quirkIndex", true);
        setBooleanField(term6107, term6107.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term6107, args);
    }

};


