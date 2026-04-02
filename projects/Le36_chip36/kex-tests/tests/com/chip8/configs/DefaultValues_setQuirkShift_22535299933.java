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

public class DefaultValues_setQuirkShift_22535299933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5161;
     Object term5252;

    public DefaultValues_setQuirkShift_22535299933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5161 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term5161, term5161.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term5161, term5161.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term5161, term5161.getClass(), "bgColor", "0x000000");
        setField(term5161, term5161.getClass(), "spriteColor", "0xFFFFFF");
        setField(term5161, term5161.getClass(), "planeColor", "0x00FF00");
        setField(term5161, term5161.getClass(), "bothColor", "0x4D4D4D");
        setField(term5161, term5161.getClass(), "printSymbol", "#");
        setBooleanField(term5161, term5161.getClass(), "printToConsole", false);
        setBooleanField(term5161, term5161.getClass(), "disableUiUpdates", true);
        setBooleanField(term5161, term5161.getClass(), "roundPixels", true);
        setBooleanField(term5161, term5161.getClass(), "blur", false);
        setBooleanField(term5161, term5161.getClass(), "glow", false);
        setDoubleField(term5161, term5161.getClass(), "blurValue", 0.022483645678509023);
        setDoubleField(term5161, term5161.getClass(), "glowValue", 0.025133051616627267);
        setBooleanField(term5161, term5161.getClass(), "quirkShift", false);
        setBooleanField(term5161, term5161.getClass(), "quirkJump", false);
        setBooleanField(term5161, term5161.getClass(), "quirkIndex", true);
        setBooleanField(term5161, term5161.getClass(), "quirkOrder", true);
        term5252 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5252;
        callMethod(klass, "setQuirkShift", argTypes, term5161, args);
    }

};


