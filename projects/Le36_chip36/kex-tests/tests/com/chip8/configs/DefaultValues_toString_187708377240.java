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

public class DefaultValues_toString_187708377240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6263;

    public DefaultValues_toString_187708377240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6263 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6263, term6263.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term6263, term6263.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term6263, term6263.getClass(), "bgColor", "0x000000");
        setField(term6263, term6263.getClass(), "spriteColor", "0xFFFFFF");
        setField(term6263, term6263.getClass(), "planeColor", "0x00FF00");
        setField(term6263, term6263.getClass(), "bothColor", "0x4D4D4D");
        setField(term6263, term6263.getClass(), "printSymbol", "#");
        setBooleanField(term6263, term6263.getClass(), "printToConsole", false);
        setBooleanField(term6263, term6263.getClass(), "disableUiUpdates", true);
        setBooleanField(term6263, term6263.getClass(), "roundPixels", true);
        setBooleanField(term6263, term6263.getClass(), "blur", true);
        setBooleanField(term6263, term6263.getClass(), "glow", false);
        setDoubleField(term6263, term6263.getClass(), "blurValue", 0.29874017652881824);
        setDoubleField(term6263, term6263.getClass(), "glowValue", 0.32554480512985284);
        setBooleanField(term6263, term6263.getClass(), "quirkShift", true);
        setBooleanField(term6263, term6263.getClass(), "quirkJump", true);
        setBooleanField(term6263, term6263.getClass(), "quirkIndex", false);
        setBooleanField(term6263, term6263.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6263, args);
    }

};


