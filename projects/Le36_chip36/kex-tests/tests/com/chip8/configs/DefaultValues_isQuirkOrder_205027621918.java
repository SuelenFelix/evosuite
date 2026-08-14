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

public class DefaultValues_isQuirkOrder_205027621918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2653;

    public DefaultValues_isQuirkOrder_205027621918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2653 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term2653, term2653.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term2653, term2653.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term2653, term2653.getClass(), "bgColor", "0x000000");
        setField(term2653, term2653.getClass(), "spriteColor", "0xFFFFFF");
        setField(term2653, term2653.getClass(), "planeColor", "0x00FF00");
        setField(term2653, term2653.getClass(), "bothColor", "0x4D4D4D");
        setField(term2653, term2653.getClass(), "printSymbol", "#");
        setBooleanField(term2653, term2653.getClass(), "printToConsole", true);
        setBooleanField(term2653, term2653.getClass(), "disableUiUpdates", false);
        setBooleanField(term2653, term2653.getClass(), "roundPixels", false);
        setBooleanField(term2653, term2653.getClass(), "blur", false);
        setBooleanField(term2653, term2653.getClass(), "glow", true);
        setDoubleField(term2653, term2653.getClass(), "blurValue", 0.9737083944266686);
        setDoubleField(term2653, term2653.getClass(), "glowValue", 0.0668892744806211);
        setBooleanField(term2653, term2653.getClass(), "quirkShift", false);
        setBooleanField(term2653, term2653.getClass(), "quirkJump", false);
        setBooleanField(term2653, term2653.getClass(), "quirkIndex", false);
        setBooleanField(term2653, term2653.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isQuirkOrder", argTypes, term2653, args);
    }

};


