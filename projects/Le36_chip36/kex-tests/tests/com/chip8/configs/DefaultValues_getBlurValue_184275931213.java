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

public class DefaultValues_getBlurValue_184275931213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1873;

    public DefaultValues_getBlurValue_184275931213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1873 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term1873, term1873.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term1873, term1873.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term1873, term1873.getClass(), "bgColor", "0x000000");
        setField(term1873, term1873.getClass(), "spriteColor", "0xFFFFFF");
        setField(term1873, term1873.getClass(), "planeColor", "0x00FF00");
        setField(term1873, term1873.getClass(), "bothColor", "0x4D4D4D");
        setField(term1873, term1873.getClass(), "printSymbol", "#");
        setBooleanField(term1873, term1873.getClass(), "printToConsole", true);
        setBooleanField(term1873, term1873.getClass(), "disableUiUpdates", true);
        setBooleanField(term1873, term1873.getClass(), "roundPixels", true);
        setBooleanField(term1873, term1873.getClass(), "blur", false);
        setBooleanField(term1873, term1873.getClass(), "glow", true);
        setDoubleField(term1873, term1873.getClass(), "blurValue", 0.13481025392611334);
        setDoubleField(term1873, term1873.getClass(), "glowValue", 0.3800088629986428);
        setBooleanField(term1873, term1873.getClass(), "quirkShift", false);
        setBooleanField(term1873, term1873.getClass(), "quirkJump", false);
        setBooleanField(term1873, term1873.getClass(), "quirkIndex", false);
        setBooleanField(term1873, term1873.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBlurValue", argTypes, term1873, args);
    }

};


