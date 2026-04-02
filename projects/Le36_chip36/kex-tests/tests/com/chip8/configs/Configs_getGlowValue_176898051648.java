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

public class Configs_getGlowValue_176898051648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11151;

    public Configs_getGlowValue_176898051648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11151 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term11151, term11151.getClass(), "printToConsole", false);
        setBooleanField(term11151, term11151.getClass(), "disableUiUpdates", false);
        setField(term11151, term11151.getClass(), "printSymbol", null);
        setBooleanField(term11151, term11151.getClass(), "spriteExtracting", false);
        setBooleanField(term11151, term11151.getClass(), "roundPixels", false);
        setBooleanField(term11151, term11151.getClass(), "blur", false);
        setBooleanField(term11151, term11151.getClass(), "glow", false);
        setDoubleField(term11151, term11151.getClass(), "blurValue", 0.0);
        setDoubleField(term11151, term11151.getClass(), "glowValue", 0.0);
        setField(term11151, term11151.getClass(), "bgColor", null);
        setField(term11151, term11151.getClass(), "spriteColor", null);
        setField(term11151, term11151.getClass(), "planeColor", null);
        setField(term11151, term11151.getClass(), "bothColor", null);
        setBooleanField(term11151, term11151.getClass(), "quirkShift", false);
        setBooleanField(term11151, term11151.getClass(), "quirkJump", false);
        setBooleanField(term11151, term11151.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term11151, term11151.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGlowValue", argTypes, term11151, args);
    }

};


