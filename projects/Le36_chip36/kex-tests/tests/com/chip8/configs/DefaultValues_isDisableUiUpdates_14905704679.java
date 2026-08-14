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

public class DefaultValues_isDisableUiUpdates_14905704679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1249;

    public DefaultValues_isDisableUiUpdates_14905704679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1249 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term1249, term1249.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term1249, term1249.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term1249, term1249.getClass(), "bgColor", "0x000000");
        setField(term1249, term1249.getClass(), "spriteColor", "0xFFFFFF");
        setField(term1249, term1249.getClass(), "planeColor", "0x00FF00");
        setField(term1249, term1249.getClass(), "bothColor", "0x4D4D4D");
        setField(term1249, term1249.getClass(), "printSymbol", "#");
        setBooleanField(term1249, term1249.getClass(), "printToConsole", false);
        setBooleanField(term1249, term1249.getClass(), "disableUiUpdates", false);
        setBooleanField(term1249, term1249.getClass(), "roundPixels", false);
        setBooleanField(term1249, term1249.getClass(), "blur", false);
        setBooleanField(term1249, term1249.getClass(), "glow", true);
        setDoubleField(term1249, term1249.getClass(), "blurValue", 0.9828442029246764);
        setDoubleField(term1249, term1249.getClass(), "glowValue", 0.2779719046761513);
        setBooleanField(term1249, term1249.getClass(), "quirkShift", false);
        setBooleanField(term1249, term1249.getClass(), "quirkJump", false);
        setBooleanField(term1249, term1249.getClass(), "quirkIndex", true);
        setBooleanField(term1249, term1249.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDisableUiUpdates", argTypes, term1249, args);
    }

};


