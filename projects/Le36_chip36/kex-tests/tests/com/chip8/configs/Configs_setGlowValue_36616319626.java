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

public class Configs_setGlowValue_36616319626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9582;
     Object term9646;

    public Configs_setGlowValue_36616319626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9582 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term9582, term9582.getClass(), "printToConsole", false);
        setBooleanField(term9582, term9582.getClass(), "disableUiUpdates", true);
        setField(term9582, term9582.getClass(), "printSymbol", "#");
        setBooleanField(term9582, term9582.getClass(), "spriteExtracting", true);
        setBooleanField(term9582, term9582.getClass(), "roundPixels", false);
        setBooleanField(term9582, term9582.getClass(), "blur", false);
        setBooleanField(term9582, term9582.getClass(), "glow", true);
        setDoubleField(term9582, term9582.getClass(), "blurValue", 0.3710067290060264);
        setDoubleField(term9582, term9582.getClass(), "glowValue", 0.7818620200430967);
        setField(term9582, term9582.getClass(), "bgColor", "ZVecLZMLHF");
        setField(term9582, term9582.getClass(), "spriteColor", "fztQhjqwdP");
        setField(term9582, term9582.getClass(), "planeColor", "eVpkWxjuki");
        setField(term9582, term9582.getClass(), "bothColor", "SJiQaLvSKv");
        setBooleanField(term9582, term9582.getClass(), "quirkShift", false);
        setBooleanField(term9582, term9582.getClass(), "quirkJump", true);
        setBooleanField(term9582, term9582.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term9582, term9582.getClass(), "quirkOrder", false);
        term9646 = new Double(0.04640022995603543);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term9646;
        callMethod(klass, "setGlowValue", argTypes, term9582, args);
    }

};


