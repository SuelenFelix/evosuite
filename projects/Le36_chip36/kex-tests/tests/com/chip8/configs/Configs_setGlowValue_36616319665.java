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

public class Configs_setGlowValue_36616319665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11386;
     Object term11399;

    public Configs_setGlowValue_36616319665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11386 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term11386, term11386.getClass(), "printToConsole", false);
        setBooleanField(term11386, term11386.getClass(), "disableUiUpdates", false);
        setField(term11386, term11386.getClass(), "printSymbol", null);
        setBooleanField(term11386, term11386.getClass(), "spriteExtracting", false);
        setBooleanField(term11386, term11386.getClass(), "roundPixels", false);
        setBooleanField(term11386, term11386.getClass(), "blur", false);
        setBooleanField(term11386, term11386.getClass(), "glow", false);
        setDoubleField(term11386, term11386.getClass(), "blurValue", 0.0);
        setDoubleField(term11386, term11386.getClass(), "glowValue", 0.0);
        setField(term11386, term11386.getClass(), "bgColor", null);
        setField(term11386, term11386.getClass(), "spriteColor", null);
        setField(term11386, term11386.getClass(), "planeColor", null);
        setField(term11386, term11386.getClass(), "bothColor", null);
        setBooleanField(term11386, term11386.getClass(), "quirkShift", false);
        setBooleanField(term11386, term11386.getClass(), "quirkJump", false);
        setBooleanField(term11386, term11386.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term11386, term11386.getClass(), "quirkOrder", false);
        term11399 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term11399;
        callMethod(klass, "setGlowValue", argTypes, term11386, args);
    }

};


