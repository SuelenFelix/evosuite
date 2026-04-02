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
import java.lang.Boolean;

public class Configs_setGlow_51697993863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11356;
     Object term11369;

    public Configs_setGlow_51697993863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11356 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term11356, term11356.getClass(), "printToConsole", false);
        setBooleanField(term11356, term11356.getClass(), "disableUiUpdates", false);
        setField(term11356, term11356.getClass(), "printSymbol", null);
        setBooleanField(term11356, term11356.getClass(), "spriteExtracting", false);
        setBooleanField(term11356, term11356.getClass(), "roundPixels", false);
        setBooleanField(term11356, term11356.getClass(), "blur", false);
        setBooleanField(term11356, term11356.getClass(), "glow", false);
        setDoubleField(term11356, term11356.getClass(), "blurValue", 0.0);
        setDoubleField(term11356, term11356.getClass(), "glowValue", 0.0);
        setField(term11356, term11356.getClass(), "bgColor", null);
        setField(term11356, term11356.getClass(), "spriteColor", null);
        setField(term11356, term11356.getClass(), "planeColor", null);
        setField(term11356, term11356.getClass(), "bothColor", null);
        setBooleanField(term11356, term11356.getClass(), "quirkShift", false);
        setBooleanField(term11356, term11356.getClass(), "quirkJump", false);
        setBooleanField(term11356, term11356.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term11356, term11356.getClass(), "quirkOrder", false);
        term11369 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term11369;
        callMethod(klass, "setGlow", argTypes, term11356, args);
    }

};


