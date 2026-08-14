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
import java.lang.Boolean;

public class DefaultValues_setQuirkJump_7890676375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6831;
     Object term6843;

    public DefaultValues_setQuirkJump_7890676375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6831 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6831, term6831.getClass(), "rebindLayout", null);
        setField(term6831, term6831.getClass(), "mouseKbLayout", null);
        setField(term6831, term6831.getClass(), "bgColor", null);
        setField(term6831, term6831.getClass(), "spriteColor", null);
        setField(term6831, term6831.getClass(), "planeColor", null);
        setField(term6831, term6831.getClass(), "bothColor", null);
        setField(term6831, term6831.getClass(), "printSymbol", null);
        setBooleanField(term6831, term6831.getClass(), "printToConsole", false);
        setBooleanField(term6831, term6831.getClass(), "disableUiUpdates", false);
        setBooleanField(term6831, term6831.getClass(), "roundPixels", false);
        setBooleanField(term6831, term6831.getClass(), "blur", false);
        setBooleanField(term6831, term6831.getClass(), "glow", false);
        setDoubleField(term6831, term6831.getClass(), "blurValue", 0.0);
        setDoubleField(term6831, term6831.getClass(), "glowValue", 0.0);
        setBooleanField(term6831, term6831.getClass(), "quirkShift", false);
        setBooleanField(term6831, term6831.getClass(), "quirkJump", false);
        setBooleanField(term6831, term6831.getClass(), "quirkIndex", false);
        setBooleanField(term6831, term6831.getClass(), "quirkOrder", false);
        term6843 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6843;
        callMethod(klass, "setQuirkJump", argTypes, term6831, args);
    }

};


