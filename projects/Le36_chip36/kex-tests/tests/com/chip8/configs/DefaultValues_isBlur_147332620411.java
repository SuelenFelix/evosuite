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

public class DefaultValues_isBlur_147332620411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1561;

    public DefaultValues_isBlur_147332620411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1561 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term1561, term1561.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term1561, term1561.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term1561, term1561.getClass(), "bgColor", "0x000000");
        setField(term1561, term1561.getClass(), "spriteColor", "0xFFFFFF");
        setField(term1561, term1561.getClass(), "planeColor", "0x00FF00");
        setField(term1561, term1561.getClass(), "bothColor", "0x4D4D4D");
        setField(term1561, term1561.getClass(), "printSymbol", "#");
        setBooleanField(term1561, term1561.getClass(), "printToConsole", true);
        setBooleanField(term1561, term1561.getClass(), "disableUiUpdates", true);
        setBooleanField(term1561, term1561.getClass(), "roundPixels", true);
        setBooleanField(term1561, term1561.getClass(), "blur", true);
        setBooleanField(term1561, term1561.getClass(), "glow", false);
        setDoubleField(term1561, term1561.getClass(), "blurValue", 0.4569171842750229);
        setDoubleField(term1561, term1561.getClass(), "glowValue", 0.8598297828918529);
        setBooleanField(term1561, term1561.getClass(), "quirkShift", false);
        setBooleanField(term1561, term1561.getClass(), "quirkJump", true);
        setBooleanField(term1561, term1561.getClass(), "quirkIndex", true);
        setBooleanField(term1561, term1561.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBlur", argTypes, term1561, args);
    }

};


