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

public class DefaultValues_getPrintSymbol_8168337277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term937;

    public DefaultValues_getPrintSymbol_8168337277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term937 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term937, term937.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term937, term937.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term937, term937.getClass(), "bgColor", "0x000000");
        setField(term937, term937.getClass(), "spriteColor", "0xFFFFFF");
        setField(term937, term937.getClass(), "planeColor", "0x00FF00");
        setField(term937, term937.getClass(), "bothColor", "0x4D4D4D");
        setField(term937, term937.getClass(), "printSymbol", "#");
        setBooleanField(term937, term937.getClass(), "printToConsole", true);
        setBooleanField(term937, term937.getClass(), "disableUiUpdates", false);
        setBooleanField(term937, term937.getClass(), "roundPixels", false);
        setBooleanField(term937, term937.getClass(), "blur", true);
        setBooleanField(term937, term937.getClass(), "glow", false);
        setDoubleField(term937, term937.getClass(), "blurValue", 0.7655020693602768);
        setDoubleField(term937, term937.getClass(), "glowValue", 0.1374549299694151);
        setBooleanField(term937, term937.getClass(), "quirkShift", false);
        setBooleanField(term937, term937.getClass(), "quirkJump", false);
        setBooleanField(term937, term937.getClass(), "quirkIndex", false);
        setBooleanField(term937, term937.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrintSymbol", argTypes, term937, args);
    }

};


