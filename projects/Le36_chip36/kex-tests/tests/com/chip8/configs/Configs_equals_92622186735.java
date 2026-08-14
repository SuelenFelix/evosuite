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

public class Configs_equals_92622186735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10625;
     Object term10689;

    public Configs_equals_92622186735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10625 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term10625, term10625.getClass(), "printToConsole", true);
        setBooleanField(term10625, term10625.getClass(), "disableUiUpdates", false);
        setField(term10625, term10625.getClass(), "printSymbol", "#");
        setBooleanField(term10625, term10625.getClass(), "spriteExtracting", false);
        setBooleanField(term10625, term10625.getClass(), "roundPixels", false);
        setBooleanField(term10625, term10625.getClass(), "blur", false);
        setBooleanField(term10625, term10625.getClass(), "glow", false);
        setDoubleField(term10625, term10625.getClass(), "blurValue", 0.07901636960861558);
        setDoubleField(term10625, term10625.getClass(), "glowValue", 0.18717846301066243);
        setField(term10625, term10625.getClass(), "bgColor", "WHcwFgsGFC");
        setField(term10625, term10625.getClass(), "spriteColor", "HzqpegHiRq");
        setField(term10625, term10625.getClass(), "planeColor", "jwsfVjMoJT");
        setField(term10625, term10625.getClass(), "bothColor", "ZfdXfCCFDf");
        setBooleanField(term10625, term10625.getClass(), "quirkShift", true);
        setBooleanField(term10625, term10625.getClass(), "quirkJump", false);
        setBooleanField(term10625, term10625.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term10625, term10625.getClass(), "quirkOrder", true);
        term10689 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10689;
        callMethod(klass, "equals", argTypes, term10625, args);
    }

};


