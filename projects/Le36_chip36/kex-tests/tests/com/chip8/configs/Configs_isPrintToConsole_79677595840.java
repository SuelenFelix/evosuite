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

public class Configs_isPrintToConsole_79677595840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11047;

    public Configs_isPrintToConsole_79677595840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11047 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term11047, term11047.getClass(), "printToConsole", false);
        setBooleanField(term11047, term11047.getClass(), "disableUiUpdates", false);
        setField(term11047, term11047.getClass(), "printSymbol", null);
        setBooleanField(term11047, term11047.getClass(), "spriteExtracting", false);
        setBooleanField(term11047, term11047.getClass(), "roundPixels", false);
        setBooleanField(term11047, term11047.getClass(), "blur", false);
        setBooleanField(term11047, term11047.getClass(), "glow", false);
        setDoubleField(term11047, term11047.getClass(), "blurValue", 0.0);
        setDoubleField(term11047, term11047.getClass(), "glowValue", 0.0);
        setField(term11047, term11047.getClass(), "bgColor", null);
        setField(term11047, term11047.getClass(), "spriteColor", null);
        setField(term11047, term11047.getClass(), "planeColor", null);
        setField(term11047, term11047.getClass(), "bothColor", null);
        setBooleanField(term11047, term11047.getClass(), "quirkShift", false);
        setBooleanField(term11047, term11047.getClass(), "quirkJump", false);
        setBooleanField(term11047, term11047.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term11047, term11047.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintToConsole", argTypes, term11047, args);
    }

};


