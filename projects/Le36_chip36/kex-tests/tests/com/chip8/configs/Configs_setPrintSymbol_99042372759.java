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

public class Configs_setPrintSymbol_99042372759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11298;

    public Configs_setPrintSymbol_99042372759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11298 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term11298, term11298.getClass(), "printToConsole", false);
        setBooleanField(term11298, term11298.getClass(), "disableUiUpdates", false);
        setField(term11298, term11298.getClass(), "printSymbol", null);
        setBooleanField(term11298, term11298.getClass(), "spriteExtracting", false);
        setBooleanField(term11298, term11298.getClass(), "roundPixels", false);
        setBooleanField(term11298, term11298.getClass(), "blur", false);
        setBooleanField(term11298, term11298.getClass(), "glow", false);
        setDoubleField(term11298, term11298.getClass(), "blurValue", 0.0);
        setDoubleField(term11298, term11298.getClass(), "glowValue", 0.0);
        setField(term11298, term11298.getClass(), "bgColor", null);
        setField(term11298, term11298.getClass(), "spriteColor", null);
        setField(term11298, term11298.getClass(), "planeColor", null);
        setField(term11298, term11298.getClass(), "bothColor", null);
        setBooleanField(term11298, term11298.getClass(), "quirkShift", false);
        setBooleanField(term11298, term11298.getClass(), "quirkJump", false);
        setBooleanField(term11298, term11298.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term11298, term11298.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPrintSymbol", argTypes, term11298, args);
    }

};


