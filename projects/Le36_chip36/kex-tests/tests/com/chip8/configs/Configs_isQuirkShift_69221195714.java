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

public class Configs_isQuirkShift_69221195714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8286;

    public Configs_isQuirkShift_69221195714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8286 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term8286, term8286.getClass(), "printToConsole", false);
        setBooleanField(term8286, term8286.getClass(), "disableUiUpdates", true);
        setField(term8286, term8286.getClass(), "printSymbol", "#");
        setBooleanField(term8286, term8286.getClass(), "spriteExtracting", false);
        setBooleanField(term8286, term8286.getClass(), "roundPixels", true);
        setBooleanField(term8286, term8286.getClass(), "blur", false);
        setBooleanField(term8286, term8286.getClass(), "glow", false);
        setDoubleField(term8286, term8286.getClass(), "blurValue", 0.7865909711092062);
        setDoubleField(term8286, term8286.getClass(), "glowValue", 0.06587158449170749);
        setField(term8286, term8286.getClass(), "bgColor", "nHXjMycHlU");
        setField(term8286, term8286.getClass(), "spriteColor", "ieCtQFdkii");
        setField(term8286, term8286.getClass(), "planeColor", "dEnhdmILtU");
        setField(term8286, term8286.getClass(), "bothColor", "hoicvmsovO");
        setBooleanField(term8286, term8286.getClass(), "quirkShift", true);
        setBooleanField(term8286, term8286.getClass(), "quirkJump", true);
        setBooleanField(term8286, term8286.getClass(), "quirkIncrementIndex", true);
        setBooleanField(term8286, term8286.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isQuirkShift", argTypes, term8286, args);
    }

};


