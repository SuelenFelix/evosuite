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

public class Configs_canEqual_173038449636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10731;
     Object term10795;

    public Configs_canEqual_173038449636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10731 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term10731, term10731.getClass(), "printToConsole", false);
        setBooleanField(term10731, term10731.getClass(), "disableUiUpdates", true);
        setField(term10731, term10731.getClass(), "printSymbol", "#");
        setBooleanField(term10731, term10731.getClass(), "spriteExtracting", true);
        setBooleanField(term10731, term10731.getClass(), "roundPixels", true);
        setBooleanField(term10731, term10731.getClass(), "blur", true);
        setBooleanField(term10731, term10731.getClass(), "glow", true);
        setDoubleField(term10731, term10731.getClass(), "blurValue", 0.5335953039331021);
        setDoubleField(term10731, term10731.getClass(), "glowValue", 0.5725602309856443);
        setField(term10731, term10731.getClass(), "bgColor", "MwwjNtdOFT");
        setField(term10731, term10731.getClass(), "spriteColor", "VYkqXKVlAJ");
        setField(term10731, term10731.getClass(), "planeColor", "XkIoWJRNwN");
        setField(term10731, term10731.getClass(), "bothColor", "aNWLJdrZMq");
        setBooleanField(term10731, term10731.getClass(), "quirkShift", false);
        setBooleanField(term10731, term10731.getClass(), "quirkJump", true);
        setBooleanField(term10731, term10731.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term10731, term10731.getClass(), "quirkOrder", false);
        term10795 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10795;
        callMethod(klass, "canEqual", argTypes, term10731, args);
    }

};


