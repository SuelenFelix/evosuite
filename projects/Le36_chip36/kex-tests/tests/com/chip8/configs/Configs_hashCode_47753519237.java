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

public class Configs_hashCode_47753519237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10837;

    public Configs_hashCode_47753519237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10837 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term10837, term10837.getClass(), "printToConsole", false);
        setBooleanField(term10837, term10837.getClass(), "disableUiUpdates", false);
        setField(term10837, term10837.getClass(), "printSymbol", "#");
        setBooleanField(term10837, term10837.getClass(), "spriteExtracting", false);
        setBooleanField(term10837, term10837.getClass(), "roundPixels", true);
        setBooleanField(term10837, term10837.getClass(), "blur", true);
        setBooleanField(term10837, term10837.getClass(), "glow", true);
        setDoubleField(term10837, term10837.getClass(), "blurValue", 0.5310967137636303);
        setDoubleField(term10837, term10837.getClass(), "glowValue", 0.6054109236809134);
        setField(term10837, term10837.getClass(), "bgColor", "HHmNoYxIGj");
        setField(term10837, term10837.getClass(), "spriteColor", "PtirvZmsGt");
        setField(term10837, term10837.getClass(), "planeColor", "HWkpTmtlrc");
        setField(term10837, term10837.getClass(), "bothColor", "hMmaoREuCK");
        setBooleanField(term10837, term10837.getClass(), "quirkShift", true);
        setBooleanField(term10837, term10837.getClass(), "quirkJump", false);
        setBooleanField(term10837, term10837.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term10837, term10837.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term10837, args);
    }

};


