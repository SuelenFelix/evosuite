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

public class Configs_setBlur_37400812423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9261;
     Object term9325;

    public Configs_setBlur_37400812423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9261 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term9261, term9261.getClass(), "printToConsole", false);
        setBooleanField(term9261, term9261.getClass(), "disableUiUpdates", true);
        setField(term9261, term9261.getClass(), "printSymbol", "#");
        setBooleanField(term9261, term9261.getClass(), "spriteExtracting", false);
        setBooleanField(term9261, term9261.getClass(), "roundPixels", true);
        setBooleanField(term9261, term9261.getClass(), "blur", false);
        setBooleanField(term9261, term9261.getClass(), "glow", true);
        setDoubleField(term9261, term9261.getClass(), "blurValue", 0.45069204793711093);
        setDoubleField(term9261, term9261.getClass(), "glowValue", 0.9341364461850963);
        setField(term9261, term9261.getClass(), "bgColor", "XqgfKFvPSD");
        setField(term9261, term9261.getClass(), "spriteColor", "JiVRgTZvKc");
        setField(term9261, term9261.getClass(), "planeColor", "XPKmummaqg");
        setField(term9261, term9261.getClass(), "bothColor", "BKLfkLiZTH");
        setBooleanField(term9261, term9261.getClass(), "quirkShift", true);
        setBooleanField(term9261, term9261.getClass(), "quirkJump", false);
        setBooleanField(term9261, term9261.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term9261, term9261.getClass(), "quirkOrder", false);
        term9325 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term9325;
        callMethod(klass, "setBlur", argTypes, term9261, args);
    }

};


