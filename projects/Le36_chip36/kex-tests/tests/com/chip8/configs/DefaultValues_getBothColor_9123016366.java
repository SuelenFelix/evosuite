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

public class DefaultValues_getBothColor_9123016366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term781;

    public DefaultValues_getBothColor_9123016366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term781 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term781, term781.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term781, term781.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term781, term781.getClass(), "bgColor", "0x000000");
        setField(term781, term781.getClass(), "spriteColor", "0xFFFFFF");
        setField(term781, term781.getClass(), "planeColor", "0x00FF00");
        setField(term781, term781.getClass(), "bothColor", "0x4D4D4D");
        setField(term781, term781.getClass(), "printSymbol", "#");
        setBooleanField(term781, term781.getClass(), "printToConsole", true);
        setBooleanField(term781, term781.getClass(), "disableUiUpdates", true);
        setBooleanField(term781, term781.getClass(), "roundPixels", true);
        setBooleanField(term781, term781.getClass(), "blur", false);
        setBooleanField(term781, term781.getClass(), "glow", true);
        setDoubleField(term781, term781.getClass(), "blurValue", 0.8474802076607362);
        setDoubleField(term781, term781.getClass(), "glowValue", 0.5183269973490326);
        setBooleanField(term781, term781.getClass(), "quirkShift", false);
        setBooleanField(term781, term781.getClass(), "quirkJump", false);
        setBooleanField(term781, term781.getClass(), "quirkIndex", true);
        setBooleanField(term781, term781.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBothColor", argTypes, term781, args);
    }

};


