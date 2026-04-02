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

public class Configs_setBlurValue_194471703464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11371;
     Object term11384;

    public Configs_setBlurValue_194471703464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11371 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term11371, term11371.getClass(), "printToConsole", false);
        setBooleanField(term11371, term11371.getClass(), "disableUiUpdates", false);
        setField(term11371, term11371.getClass(), "printSymbol", null);
        setBooleanField(term11371, term11371.getClass(), "spriteExtracting", false);
        setBooleanField(term11371, term11371.getClass(), "roundPixels", false);
        setBooleanField(term11371, term11371.getClass(), "blur", false);
        setBooleanField(term11371, term11371.getClass(), "glow", false);
        setDoubleField(term11371, term11371.getClass(), "blurValue", 0.0);
        setDoubleField(term11371, term11371.getClass(), "glowValue", 0.0);
        setField(term11371, term11371.getClass(), "bgColor", null);
        setField(term11371, term11371.getClass(), "spriteColor", null);
        setField(term11371, term11371.getClass(), "planeColor", null);
        setField(term11371, term11371.getClass(), "bothColor", null);
        setBooleanField(term11371, term11371.getClass(), "quirkShift", false);
        setBooleanField(term11371, term11371.getClass(), "quirkJump", false);
        setBooleanField(term11371, term11371.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term11371, term11371.getClass(), "quirkOrder", false);
        term11384 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term11384;
        callMethod(klass, "setBlurValue", argTypes, term11371, args);
    }

};


