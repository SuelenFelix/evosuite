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
import java.lang.Double;

public class DefaultValues_setBlurValue_43994199231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4845;
     Object term4936;

    public DefaultValues_setBlurValue_43994199231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4845 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term4845, term4845.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term4845, term4845.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term4845, term4845.getClass(), "bgColor", "0x000000");
        setField(term4845, term4845.getClass(), "spriteColor", "0xFFFFFF");
        setField(term4845, term4845.getClass(), "planeColor", "0x00FF00");
        setField(term4845, term4845.getClass(), "bothColor", "0x4D4D4D");
        setField(term4845, term4845.getClass(), "printSymbol", "#");
        setBooleanField(term4845, term4845.getClass(), "printToConsole", false);
        setBooleanField(term4845, term4845.getClass(), "disableUiUpdates", false);
        setBooleanField(term4845, term4845.getClass(), "roundPixels", false);
        setBooleanField(term4845, term4845.getClass(), "blur", false);
        setBooleanField(term4845, term4845.getClass(), "glow", false);
        setDoubleField(term4845, term4845.getClass(), "blurValue", 0.3227335400819148);
        setDoubleField(term4845, term4845.getClass(), "glowValue", 0.43337207054070237);
        setBooleanField(term4845, term4845.getClass(), "quirkShift", true);
        setBooleanField(term4845, term4845.getClass(), "quirkJump", true);
        setBooleanField(term4845, term4845.getClass(), "quirkIndex", false);
        setBooleanField(term4845, term4845.getClass(), "quirkOrder", true);
        term4936 = new Double(0.13246999699526574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term4936;
        callMethod(klass, "setBlurValue", argTypes, term4845, args);
    }

};


