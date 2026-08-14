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

public class DefaultValues_setMouseKbLayout_9590470420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2987;

    public DefaultValues_setMouseKbLayout_9590470420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2987 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term2987, term2987.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term2987, term2987.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term2987, term2987.getClass(), "bgColor", "0x000000");
        setField(term2987, term2987.getClass(), "spriteColor", "0xFFFFFF");
        setField(term2987, term2987.getClass(), "planeColor", "0x00FF00");
        setField(term2987, term2987.getClass(), "bothColor", "0x4D4D4D");
        setField(term2987, term2987.getClass(), "printSymbol", "#");
        setBooleanField(term2987, term2987.getClass(), "printToConsole", true);
        setBooleanField(term2987, term2987.getClass(), "disableUiUpdates", false);
        setBooleanField(term2987, term2987.getClass(), "roundPixels", true);
        setBooleanField(term2987, term2987.getClass(), "blur", false);
        setBooleanField(term2987, term2987.getClass(), "glow", true);
        setDoubleField(term2987, term2987.getClass(), "blurValue", 0.5279279537140873);
        setDoubleField(term2987, term2987.getClass(), "glowValue", 0.3202192021706908);
        setBooleanField(term2987, term2987.getClass(), "quirkShift", true);
        setBooleanField(term2987, term2987.getClass(), "quirkJump", true);
        setBooleanField(term2987, term2987.getClass(), "quirkIndex", false);
        setBooleanField(term2987, term2987.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sjlJAEtRrb";
        callMethod(klass, "setMouseKbLayout", argTypes, term2987, args);
    }

};


