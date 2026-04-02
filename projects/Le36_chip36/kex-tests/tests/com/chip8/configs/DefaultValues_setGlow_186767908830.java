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

public class DefaultValues_setGlow_186767908830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4687;
     Object term4778;

    public DefaultValues_setGlow_186767908830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4687 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term4687, term4687.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term4687, term4687.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term4687, term4687.getClass(), "bgColor", "0x000000");
        setField(term4687, term4687.getClass(), "spriteColor", "0xFFFFFF");
        setField(term4687, term4687.getClass(), "planeColor", "0x00FF00");
        setField(term4687, term4687.getClass(), "bothColor", "0x4D4D4D");
        setField(term4687, term4687.getClass(), "printSymbol", "#");
        setBooleanField(term4687, term4687.getClass(), "printToConsole", true);
        setBooleanField(term4687, term4687.getClass(), "disableUiUpdates", false);
        setBooleanField(term4687, term4687.getClass(), "roundPixels", false);
        setBooleanField(term4687, term4687.getClass(), "blur", true);
        setBooleanField(term4687, term4687.getClass(), "glow", true);
        setDoubleField(term4687, term4687.getClass(), "blurValue", 0.7919370314903882);
        setDoubleField(term4687, term4687.getClass(), "glowValue", 0.2109867221632754);
        setBooleanField(term4687, term4687.getClass(), "quirkShift", false);
        setBooleanField(term4687, term4687.getClass(), "quirkJump", true);
        setBooleanField(term4687, term4687.getClass(), "quirkIndex", true);
        setBooleanField(term4687, term4687.getClass(), "quirkOrder", false);
        term4778 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4778;
        callMethod(klass, "setGlow", argTypes, term4687, args);
    }

};


