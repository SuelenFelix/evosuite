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

public class DefaultValues_getGlowValue_14132775414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2029;

    public DefaultValues_getGlowValue_14132775414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2029 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term2029, term2029.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term2029, term2029.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term2029, term2029.getClass(), "bgColor", "0x000000");
        setField(term2029, term2029.getClass(), "spriteColor", "0xFFFFFF");
        setField(term2029, term2029.getClass(), "planeColor", "0x00FF00");
        setField(term2029, term2029.getClass(), "bothColor", "0x4D4D4D");
        setField(term2029, term2029.getClass(), "printSymbol", "#");
        setBooleanField(term2029, term2029.getClass(), "printToConsole", true);
        setBooleanField(term2029, term2029.getClass(), "disableUiUpdates", false);
        setBooleanField(term2029, term2029.getClass(), "roundPixels", false);
        setBooleanField(term2029, term2029.getClass(), "blur", false);
        setBooleanField(term2029, term2029.getClass(), "glow", false);
        setDoubleField(term2029, term2029.getClass(), "blurValue", 0.5840714198152577);
        setDoubleField(term2029, term2029.getClass(), "glowValue", 0.7559240768573477);
        setBooleanField(term2029, term2029.getClass(), "quirkShift", false);
        setBooleanField(term2029, term2029.getClass(), "quirkJump", false);
        setBooleanField(term2029, term2029.getClass(), "quirkIndex", false);
        setBooleanField(term2029, term2029.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGlowValue", argTypes, term2029, args);
    }

};


