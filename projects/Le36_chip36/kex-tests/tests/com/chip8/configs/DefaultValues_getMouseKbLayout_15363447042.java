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

public class DefaultValues_getMouseKbLayout_15363447042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157;

    public DefaultValues_getMouseKbLayout_15363447042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term157, term157.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term157, term157.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term157, term157.getClass(), "bgColor", "0x000000");
        setField(term157, term157.getClass(), "spriteColor", "0xFFFFFF");
        setField(term157, term157.getClass(), "planeColor", "0x00FF00");
        setField(term157, term157.getClass(), "bothColor", "0x4D4D4D");
        setField(term157, term157.getClass(), "printSymbol", "#");
        setBooleanField(term157, term157.getClass(), "printToConsole", true);
        setBooleanField(term157, term157.getClass(), "disableUiUpdates", false);
        setBooleanField(term157, term157.getClass(), "roundPixels", true);
        setBooleanField(term157, term157.getClass(), "blur", false);
        setBooleanField(term157, term157.getClass(), "glow", true);
        setDoubleField(term157, term157.getClass(), "blurValue", 0.5523635872663106);
        setDoubleField(term157, term157.getClass(), "glowValue", 0.544608645520025);
        setBooleanField(term157, term157.getClass(), "quirkShift", false);
        setBooleanField(term157, term157.getClass(), "quirkJump", false);
        setBooleanField(term157, term157.getClass(), "quirkIndex", true);
        setBooleanField(term157, term157.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMouseKbLayout", argTypes, term157, args);
    }

};


