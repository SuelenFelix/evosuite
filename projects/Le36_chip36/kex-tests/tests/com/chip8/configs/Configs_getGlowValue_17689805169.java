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

public class Configs_getGlowValue_17689805169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7761;

    public Configs_getGlowValue_17689805169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7761 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term7761, term7761.getClass(), "printToConsole", false);
        setBooleanField(term7761, term7761.getClass(), "disableUiUpdates", false);
        setField(term7761, term7761.getClass(), "printSymbol", "#");
        setBooleanField(term7761, term7761.getClass(), "spriteExtracting", false);
        setBooleanField(term7761, term7761.getClass(), "roundPixels", true);
        setBooleanField(term7761, term7761.getClass(), "blur", false);
        setBooleanField(term7761, term7761.getClass(), "glow", false);
        setDoubleField(term7761, term7761.getClass(), "blurValue", 0.09067063848644474);
        setDoubleField(term7761, term7761.getClass(), "glowValue", 0.268304014379393);
        setField(term7761, term7761.getClass(), "bgColor", "aKnKipADSo");
        setField(term7761, term7761.getClass(), "spriteColor", "wSQxaModmm");
        setField(term7761, term7761.getClass(), "planeColor", "UlajhuVLaP");
        setField(term7761, term7761.getClass(), "bothColor", "gGSMzuGICf");
        setBooleanField(term7761, term7761.getClass(), "quirkShift", true);
        setBooleanField(term7761, term7761.getClass(), "quirkJump", true);
        setBooleanField(term7761, term7761.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term7761, term7761.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGlowValue", argTypes, term7761, args);
    }

};


