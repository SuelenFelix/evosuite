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

public class DefaultValues_isPrintToConsole_15878830688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1093;

    public DefaultValues_isPrintToConsole_15878830688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1093 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term1093, term1093.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term1093, term1093.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term1093, term1093.getClass(), "bgColor", "0x000000");
        setField(term1093, term1093.getClass(), "spriteColor", "0xFFFFFF");
        setField(term1093, term1093.getClass(), "planeColor", "0x00FF00");
        setField(term1093, term1093.getClass(), "bothColor", "0x4D4D4D");
        setField(term1093, term1093.getClass(), "printSymbol", "#");
        setBooleanField(term1093, term1093.getClass(), "printToConsole", true);
        setBooleanField(term1093, term1093.getClass(), "disableUiUpdates", false);
        setBooleanField(term1093, term1093.getClass(), "roundPixels", false);
        setBooleanField(term1093, term1093.getClass(), "blur", true);
        setBooleanField(term1093, term1093.getClass(), "glow", true);
        setDoubleField(term1093, term1093.getClass(), "blurValue", 0.7031006357544823);
        setDoubleField(term1093, term1093.getClass(), "glowValue", 0.9527281779865117);
        setBooleanField(term1093, term1093.getClass(), "quirkShift", true);
        setBooleanField(term1093, term1093.getClass(), "quirkJump", false);
        setBooleanField(term1093, term1093.getClass(), "quirkIndex", false);
        setBooleanField(term1093, term1093.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintToConsole", argTypes, term1093, args);
    }

};


