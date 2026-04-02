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

public class Configs_setQuirkShift_168495527131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10197;
     Object term10261;

    public Configs_setQuirkShift_168495527131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10197 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term10197, term10197.getClass(), "printToConsole", false);
        setBooleanField(term10197, term10197.getClass(), "disableUiUpdates", true);
        setField(term10197, term10197.getClass(), "printSymbol", "#");
        setBooleanField(term10197, term10197.getClass(), "spriteExtracting", true);
        setBooleanField(term10197, term10197.getClass(), "roundPixels", true);
        setBooleanField(term10197, term10197.getClass(), "blur", false);
        setBooleanField(term10197, term10197.getClass(), "glow", true);
        setDoubleField(term10197, term10197.getClass(), "blurValue", 0.6428742553484879);
        setDoubleField(term10197, term10197.getClass(), "glowValue", 0.6584165706677267);
        setField(term10197, term10197.getClass(), "bgColor", "xJgPlLxpgC");
        setField(term10197, term10197.getClass(), "spriteColor", "EYtfuJaxiM");
        setField(term10197, term10197.getClass(), "planeColor", "gCWtLVKVVe");
        setField(term10197, term10197.getClass(), "bothColor", "fWKJoSoCwE");
        setBooleanField(term10197, term10197.getClass(), "quirkShift", true);
        setBooleanField(term10197, term10197.getClass(), "quirkJump", true);
        setBooleanField(term10197, term10197.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term10197, term10197.getClass(), "quirkOrder", true);
        term10261 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term10261;
        callMethod(klass, "setQuirkShift", argTypes, term10197, args);
    }

};


