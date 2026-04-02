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

public class DefaultValues_setBothColor_74954419624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3699;

    public DefaultValues_setBothColor_74954419624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3699 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term3699, term3699.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term3699, term3699.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term3699, term3699.getClass(), "bgColor", "0x000000");
        setField(term3699, term3699.getClass(), "spriteColor", "0xFFFFFF");
        setField(term3699, term3699.getClass(), "planeColor", "0x00FF00");
        setField(term3699, term3699.getClass(), "bothColor", "0x4D4D4D");
        setField(term3699, term3699.getClass(), "printSymbol", "#");
        setBooleanField(term3699, term3699.getClass(), "printToConsole", true);
        setBooleanField(term3699, term3699.getClass(), "disableUiUpdates", false);
        setBooleanField(term3699, term3699.getClass(), "roundPixels", true);
        setBooleanField(term3699, term3699.getClass(), "blur", true);
        setBooleanField(term3699, term3699.getClass(), "glow", false);
        setDoubleField(term3699, term3699.getClass(), "blurValue", 0.8823181080774973);
        setDoubleField(term3699, term3699.getClass(), "glowValue", 0.2192450926212024);
        setBooleanField(term3699, term3699.getClass(), "quirkShift", false);
        setBooleanField(term3699, term3699.getClass(), "quirkJump", true);
        setBooleanField(term3699, term3699.getClass(), "quirkIndex", false);
        setBooleanField(term3699, term3699.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EGtDIRbSSb";
        callMethod(klass, "setBothColor", argTypes, term3699, args);
    }

};


