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

public class Configs_setQuirkIncrementIndex_54369022272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11483;
     Object term11496;

    public Configs_setQuirkIncrementIndex_54369022272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11483 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term11483, term11483.getClass(), "printToConsole", false);
        setBooleanField(term11483, term11483.getClass(), "disableUiUpdates", false);
        setField(term11483, term11483.getClass(), "printSymbol", null);
        setBooleanField(term11483, term11483.getClass(), "spriteExtracting", false);
        setBooleanField(term11483, term11483.getClass(), "roundPixels", false);
        setBooleanField(term11483, term11483.getClass(), "blur", false);
        setBooleanField(term11483, term11483.getClass(), "glow", false);
        setDoubleField(term11483, term11483.getClass(), "blurValue", 0.0);
        setDoubleField(term11483, term11483.getClass(), "glowValue", 0.0);
        setField(term11483, term11483.getClass(), "bgColor", null);
        setField(term11483, term11483.getClass(), "spriteColor", null);
        setField(term11483, term11483.getClass(), "planeColor", null);
        setField(term11483, term11483.getClass(), "bothColor", null);
        setBooleanField(term11483, term11483.getClass(), "quirkShift", false);
        setBooleanField(term11483, term11483.getClass(), "quirkJump", false);
        setBooleanField(term11483, term11483.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term11483, term11483.getClass(), "quirkOrder", false);
        term11496 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term11496;
        callMethod(klass, "setQuirkIncrementIndex", argTypes, term11483, args);
    }

};


