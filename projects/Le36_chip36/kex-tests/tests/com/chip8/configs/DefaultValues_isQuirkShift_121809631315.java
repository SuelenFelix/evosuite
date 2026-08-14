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

public class DefaultValues_isQuirkShift_121809631315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2185;

    public DefaultValues_isQuirkShift_121809631315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2185 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term2185, term2185.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term2185, term2185.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term2185, term2185.getClass(), "bgColor", "0x000000");
        setField(term2185, term2185.getClass(), "spriteColor", "0xFFFFFF");
        setField(term2185, term2185.getClass(), "planeColor", "0x00FF00");
        setField(term2185, term2185.getClass(), "bothColor", "0x4D4D4D");
        setField(term2185, term2185.getClass(), "printSymbol", "#");
        setBooleanField(term2185, term2185.getClass(), "printToConsole", true);
        setBooleanField(term2185, term2185.getClass(), "disableUiUpdates", false);
        setBooleanField(term2185, term2185.getClass(), "roundPixels", false);
        setBooleanField(term2185, term2185.getClass(), "blur", true);
        setBooleanField(term2185, term2185.getClass(), "glow", true);
        setDoubleField(term2185, term2185.getClass(), "blurValue", 0.10667076642995188);
        setDoubleField(term2185, term2185.getClass(), "glowValue", 0.11493000848982304);
        setBooleanField(term2185, term2185.getClass(), "quirkShift", false);
        setBooleanField(term2185, term2185.getClass(), "quirkJump", false);
        setBooleanField(term2185, term2185.getClass(), "quirkIndex", true);
        setBooleanField(term2185, term2185.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isQuirkShift", argTypes, term2185, args);
    }

};


