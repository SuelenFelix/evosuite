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

public class DefaultValues_isQuirkIndex_110012544917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2497;

    public DefaultValues_isQuirkIndex_110012544917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2497 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term2497, term2497.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term2497, term2497.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term2497, term2497.getClass(), "bgColor", "0x000000");
        setField(term2497, term2497.getClass(), "spriteColor", "0xFFFFFF");
        setField(term2497, term2497.getClass(), "planeColor", "0x00FF00");
        setField(term2497, term2497.getClass(), "bothColor", "0x4D4D4D");
        setField(term2497, term2497.getClass(), "printSymbol", "#");
        setBooleanField(term2497, term2497.getClass(), "printToConsole", false);
        setBooleanField(term2497, term2497.getClass(), "disableUiUpdates", true);
        setBooleanField(term2497, term2497.getClass(), "roundPixels", false);
        setBooleanField(term2497, term2497.getClass(), "blur", false);
        setBooleanField(term2497, term2497.getClass(), "glow", false);
        setDoubleField(term2497, term2497.getClass(), "blurValue", 0.2852810965221698);
        setDoubleField(term2497, term2497.getClass(), "glowValue", 0.6300849762307866);
        setBooleanField(term2497, term2497.getClass(), "quirkShift", true);
        setBooleanField(term2497, term2497.getClass(), "quirkJump", true);
        setBooleanField(term2497, term2497.getClass(), "quirkIndex", false);
        setBooleanField(term2497, term2497.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isQuirkIndex", argTypes, term2497, args);
    }

};


