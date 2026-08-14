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

public class DefaultValues_getRebindLayout_10758128001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public DefaultValues_getRebindLayout_10758128001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term1, term1.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term1, term1.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term1, term1.getClass(), "bgColor", "0x000000");
        setField(term1, term1.getClass(), "spriteColor", "0xFFFFFF");
        setField(term1, term1.getClass(), "planeColor", "0x00FF00");
        setField(term1, term1.getClass(), "bothColor", "0x4D4D4D");
        setField(term1, term1.getClass(), "printSymbol", "#");
        setBooleanField(term1, term1.getClass(), "printToConsole", false);
        setBooleanField(term1, term1.getClass(), "disableUiUpdates", false);
        setBooleanField(term1, term1.getClass(), "roundPixels", false);
        setBooleanField(term1, term1.getClass(), "blur", false);
        setBooleanField(term1, term1.getClass(), "glow", true);
        setDoubleField(term1, term1.getClass(), "blurValue", 0.13238746331190498);
        setDoubleField(term1, term1.getClass(), "glowValue", 0.3455959125047594);
        setBooleanField(term1, term1.getClass(), "quirkShift", true);
        setBooleanField(term1, term1.getClass(), "quirkJump", true);
        setBooleanField(term1, term1.getClass(), "quirkIndex", true);
        setBooleanField(term1, term1.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRebindLayout", argTypes, term1, args);
    }

};


