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

public class DefaultValues_isGlow_161629801812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1717;

    public DefaultValues_isGlow_161629801812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1717 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term1717, term1717.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term1717, term1717.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term1717, term1717.getClass(), "bgColor", "0x000000");
        setField(term1717, term1717.getClass(), "spriteColor", "0xFFFFFF");
        setField(term1717, term1717.getClass(), "planeColor", "0x00FF00");
        setField(term1717, term1717.getClass(), "bothColor", "0x4D4D4D");
        setField(term1717, term1717.getClass(), "printSymbol", "#");
        setBooleanField(term1717, term1717.getClass(), "printToConsole", false);
        setBooleanField(term1717, term1717.getClass(), "disableUiUpdates", true);
        setBooleanField(term1717, term1717.getClass(), "roundPixels", true);
        setBooleanField(term1717, term1717.getClass(), "blur", false);
        setBooleanField(term1717, term1717.getClass(), "glow", false);
        setDoubleField(term1717, term1717.getClass(), "blurValue", 0.43692187681405226);
        setDoubleField(term1717, term1717.getClass(), "glowValue", 0.7633268466829064);
        setBooleanField(term1717, term1717.getClass(), "quirkShift", true);
        setBooleanField(term1717, term1717.getClass(), "quirkJump", true);
        setBooleanField(term1717, term1717.getClass(), "quirkIndex", true);
        setBooleanField(term1717, term1717.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isGlow", argTypes, term1717, args);
    }

};


