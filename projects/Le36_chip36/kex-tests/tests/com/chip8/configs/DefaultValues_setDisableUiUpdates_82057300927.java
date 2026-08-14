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

public class DefaultValues_setDisableUiUpdates_82057300927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4213;
     Object term4304;

    public DefaultValues_setDisableUiUpdates_82057300927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4213 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term4213, term4213.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term4213, term4213.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term4213, term4213.getClass(), "bgColor", "0x000000");
        setField(term4213, term4213.getClass(), "spriteColor", "0xFFFFFF");
        setField(term4213, term4213.getClass(), "planeColor", "0x00FF00");
        setField(term4213, term4213.getClass(), "bothColor", "0x4D4D4D");
        setField(term4213, term4213.getClass(), "printSymbol", "#");
        setBooleanField(term4213, term4213.getClass(), "printToConsole", true);
        setBooleanField(term4213, term4213.getClass(), "disableUiUpdates", true);
        setBooleanField(term4213, term4213.getClass(), "roundPixels", true);
        setBooleanField(term4213, term4213.getClass(), "blur", true);
        setBooleanField(term4213, term4213.getClass(), "glow", false);
        setDoubleField(term4213, term4213.getClass(), "blurValue", 0.9374115574082594);
        setDoubleField(term4213, term4213.getClass(), "glowValue", 0.8454723071922143);
        setBooleanField(term4213, term4213.getClass(), "quirkShift", false);
        setBooleanField(term4213, term4213.getClass(), "quirkJump", true);
        setBooleanField(term4213, term4213.getClass(), "quirkIndex", false);
        setBooleanField(term4213, term4213.getClass(), "quirkOrder", false);
        term4304 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4304;
        callMethod(klass, "setDisableUiUpdates", argTypes, term4213, args);
    }

};


