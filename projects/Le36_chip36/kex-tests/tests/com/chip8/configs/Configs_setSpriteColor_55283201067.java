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

public class Configs_setSpriteColor_55283201067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11414;

    public Configs_setSpriteColor_55283201067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11414 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term11414, term11414.getClass(), "printToConsole", false);
        setBooleanField(term11414, term11414.getClass(), "disableUiUpdates", false);
        setField(term11414, term11414.getClass(), "printSymbol", null);
        setBooleanField(term11414, term11414.getClass(), "spriteExtracting", false);
        setBooleanField(term11414, term11414.getClass(), "roundPixels", false);
        setBooleanField(term11414, term11414.getClass(), "blur", false);
        setBooleanField(term11414, term11414.getClass(), "glow", false);
        setDoubleField(term11414, term11414.getClass(), "blurValue", 0.0);
        setDoubleField(term11414, term11414.getClass(), "glowValue", 0.0);
        setField(term11414, term11414.getClass(), "bgColor", null);
        setField(term11414, term11414.getClass(), "spriteColor", null);
        setField(term11414, term11414.getClass(), "planeColor", null);
        setField(term11414, term11414.getClass(), "bothColor", null);
        setBooleanField(term11414, term11414.getClass(), "quirkShift", false);
        setBooleanField(term11414, term11414.getClass(), "quirkJump", false);
        setBooleanField(term11414, term11414.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term11414, term11414.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSpriteColor", argTypes, term11414, args);
    }

};


