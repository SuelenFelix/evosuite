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

public class DefaultValues_getSpriteColor_19348778324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469;

    public DefaultValues_getSpriteColor_19348778324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term469 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term469, term469.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term469, term469.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term469, term469.getClass(), "bgColor", "0x000000");
        setField(term469, term469.getClass(), "spriteColor", "0xFFFFFF");
        setField(term469, term469.getClass(), "planeColor", "0x00FF00");
        setField(term469, term469.getClass(), "bothColor", "0x4D4D4D");
        setField(term469, term469.getClass(), "printSymbol", "#");
        setBooleanField(term469, term469.getClass(), "printToConsole", false);
        setBooleanField(term469, term469.getClass(), "disableUiUpdates", true);
        setBooleanField(term469, term469.getClass(), "roundPixels", true);
        setBooleanField(term469, term469.getClass(), "blur", true);
        setBooleanField(term469, term469.getClass(), "glow", true);
        setDoubleField(term469, term469.getClass(), "blurValue", 0.2641345529914265);
        setDoubleField(term469, term469.getClass(), "glowValue", 0.36923381893433327);
        setBooleanField(term469, term469.getClass(), "quirkShift", true);
        setBooleanField(term469, term469.getClass(), "quirkJump", true);
        setBooleanField(term469, term469.getClass(), "quirkIndex", false);
        setBooleanField(term469, term469.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpriteColor", argTypes, term469, args);
    }

};


