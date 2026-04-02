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

public class DefaultValues_setQuirkJump_7890676334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5319;
     Object term5410;

    public DefaultValues_setQuirkJump_7890676334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5319 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term5319, term5319.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term5319, term5319.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term5319, term5319.getClass(), "bgColor", "0x000000");
        setField(term5319, term5319.getClass(), "spriteColor", "0xFFFFFF");
        setField(term5319, term5319.getClass(), "planeColor", "0x00FF00");
        setField(term5319, term5319.getClass(), "bothColor", "0x4D4D4D");
        setField(term5319, term5319.getClass(), "printSymbol", "#");
        setBooleanField(term5319, term5319.getClass(), "printToConsole", true);
        setBooleanField(term5319, term5319.getClass(), "disableUiUpdates", false);
        setBooleanField(term5319, term5319.getClass(), "roundPixels", true);
        setBooleanField(term5319, term5319.getClass(), "blur", false);
        setBooleanField(term5319, term5319.getClass(), "glow", false);
        setDoubleField(term5319, term5319.getClass(), "blurValue", 0.016575281023182953);
        setDoubleField(term5319, term5319.getClass(), "glowValue", 0.5308350402051779);
        setBooleanField(term5319, term5319.getClass(), "quirkShift", true);
        setBooleanField(term5319, term5319.getClass(), "quirkJump", true);
        setBooleanField(term5319, term5319.getClass(), "quirkIndex", true);
        setBooleanField(term5319, term5319.getClass(), "quirkOrder", true);
        term5410 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5410;
        callMethod(klass, "setQuirkJump", argTypes, term5319, args);
    }

};


