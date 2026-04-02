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

public class DefaultValues_equals_145843715937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5793;
     Object term5884;

    public DefaultValues_equals_145843715937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5793 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term5793, term5793.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term5793, term5793.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term5793, term5793.getClass(), "bgColor", "0x000000");
        setField(term5793, term5793.getClass(), "spriteColor", "0xFFFFFF");
        setField(term5793, term5793.getClass(), "planeColor", "0x00FF00");
        setField(term5793, term5793.getClass(), "bothColor", "0x4D4D4D");
        setField(term5793, term5793.getClass(), "printSymbol", "#");
        setBooleanField(term5793, term5793.getClass(), "printToConsole", false);
        setBooleanField(term5793, term5793.getClass(), "disableUiUpdates", true);
        setBooleanField(term5793, term5793.getClass(), "roundPixels", false);
        setBooleanField(term5793, term5793.getClass(), "blur", true);
        setBooleanField(term5793, term5793.getClass(), "glow", true);
        setDoubleField(term5793, term5793.getClass(), "blurValue", 0.03699061125289671);
        setDoubleField(term5793, term5793.getClass(), "glowValue", 0.6047137830113202);
        setBooleanField(term5793, term5793.getClass(), "quirkShift", false);
        setBooleanField(term5793, term5793.getClass(), "quirkJump", true);
        setBooleanField(term5793, term5793.getClass(), "quirkIndex", false);
        setBooleanField(term5793, term5793.getClass(), "quirkOrder", false);
        term5884 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5884;
        callMethod(klass, "equals", argTypes, term5793, args);
    }

};


