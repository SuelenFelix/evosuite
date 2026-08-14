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

public class DefaultValues_isQuirkJump_107725274916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2341;

    public DefaultValues_isQuirkJump_107725274916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2341 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term2341, term2341.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term2341, term2341.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term2341, term2341.getClass(), "bgColor", "0x000000");
        setField(term2341, term2341.getClass(), "spriteColor", "0xFFFFFF");
        setField(term2341, term2341.getClass(), "planeColor", "0x00FF00");
        setField(term2341, term2341.getClass(), "bothColor", "0x4D4D4D");
        setField(term2341, term2341.getClass(), "printSymbol", "#");
        setBooleanField(term2341, term2341.getClass(), "printToConsole", true);
        setBooleanField(term2341, term2341.getClass(), "disableUiUpdates", false);
        setBooleanField(term2341, term2341.getClass(), "roundPixels", false);
        setBooleanField(term2341, term2341.getClass(), "blur", true);
        setBooleanField(term2341, term2341.getClass(), "glow", true);
        setDoubleField(term2341, term2341.getClass(), "blurValue", 0.37161417339133307);
        setDoubleField(term2341, term2341.getClass(), "glowValue", 0.6805867182029153);
        setBooleanField(term2341, term2341.getClass(), "quirkShift", true);
        setBooleanField(term2341, term2341.getClass(), "quirkJump", false);
        setBooleanField(term2341, term2341.getClass(), "quirkIndex", true);
        setBooleanField(term2341, term2341.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isQuirkJump", argTypes, term2341, args);
    }

};


