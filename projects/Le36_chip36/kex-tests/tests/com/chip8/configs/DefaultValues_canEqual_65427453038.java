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

public class DefaultValues_canEqual_65427453038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5950;
     Object term6041;

    public DefaultValues_canEqual_65427453038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5950 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term5950, term5950.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term5950, term5950.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term5950, term5950.getClass(), "bgColor", "0x000000");
        setField(term5950, term5950.getClass(), "spriteColor", "0xFFFFFF");
        setField(term5950, term5950.getClass(), "planeColor", "0x00FF00");
        setField(term5950, term5950.getClass(), "bothColor", "0x4D4D4D");
        setField(term5950, term5950.getClass(), "printSymbol", "#");
        setBooleanField(term5950, term5950.getClass(), "printToConsole", false);
        setBooleanField(term5950, term5950.getClass(), "disableUiUpdates", true);
        setBooleanField(term5950, term5950.getClass(), "roundPixels", true);
        setBooleanField(term5950, term5950.getClass(), "blur", false);
        setBooleanField(term5950, term5950.getClass(), "glow", true);
        setDoubleField(term5950, term5950.getClass(), "blurValue", 0.6767213143579776);
        setDoubleField(term5950, term5950.getClass(), "glowValue", 0.48862955528902696);
        setBooleanField(term5950, term5950.getClass(), "quirkShift", true);
        setBooleanField(term5950, term5950.getClass(), "quirkJump", true);
        setBooleanField(term5950, term5950.getClass(), "quirkIndex", false);
        setBooleanField(term5950, term5950.getClass(), "quirkOrder", true);
        term6041 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6041;
        callMethod(klass, "canEqual", argTypes, term5950, args);
    }

};


